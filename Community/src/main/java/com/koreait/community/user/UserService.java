package com.koreait.community.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	// 1: success, 2: 아이디 없음, 3: 비밀번호 틀림
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

}
