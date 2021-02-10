package com.koreait.community.user;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.koreait.community.Const;
import com.koreait.community.SecurityUtils;
import com.koreait.community.model.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	@Autowired
	private SecurityUtils sUtils;

	// 1 : success , 0 : failed
	public int join(UserEntity p, HttpSession hs) {
		
		if (p.getUserId() == null || p.getUserId().length() < 2) {
			return 0;
		}
		
		// 비밀번호 암호화
		if(chkId(p) == 0) {
			
		String salt = sUtils.getSalt();
		String hashPw = sUtils.getHashPw(p.getUserPw(), salt);
		p.setSalt(salt);
		p.setUserPw(hashPw);

		return mapper.insUser(p);
		}
		return 0;
	}

	public int login(UserEntity p, HttpSession hs) {
		UserEntity data = mapper.selUser(p);
		if (data == null) {
			return 2;
		}
		String salt = data.getSalt();
		String pw = sUtils.getHashPw(p.getUserPw(), salt);
		if (!pw.equals(data.getUserPw())) {
			return 3;
		}
		// 필요없는 정보는 null로 바꿔준 뒤 session에 저장
		data.setUserPw(null);
		data.setSalt(null);
		data.setRegDt(null);
		data.setProfileImg(null);
		hs.setAttribute(Const.KEY_LOGINUSER, data);
		return 1;
	}

	public int chkId(UserEntity p) {
		UserEntity data = mapper.selUser(p);
		if (data == null) {
			return 0;
		}
		return 1;
	}
	
	public UserEntity selUser(UserEntity p) {
		return mapper.selUser(p);
	}
	
	public int uploadProfile(MultipartFile mf, HttpSession hs) {
		
		int userPk = sUtils.getLoginUserPk(hs);
		
		
		String basePath = hs.getServletContext().getRealPath("/res/img/user" + userPk);
		File folder = new  File(basePath);
		if(!folder.exists()) {
			folder.mkdirs();
		}
		
		System.out.println("basePath : " + basePath);
		
		String originalFileNm = mf.getOriginalFilename();
		String ext = FilenameUtils.getExtension(originalFileNm);
		
		System.out.println("ext : " + ext);
		
		String fileNm = UUID.randomUUID().toString();
		System.out.println("fileNm : " + fileNm);
		
		try {
			byte[] fileDate = mf.getBytes();
			File target = new File(basePath + "/" + fileNm);
			FileCopyUtils.copy(fileDate, target);
			
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
		
		return 1;
	}

}
