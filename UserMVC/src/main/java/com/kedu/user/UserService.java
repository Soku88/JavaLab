package com.kedu.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	public int join(UserVO p, HttpSession hs) {
		if (p.getUid() == null || p.getUid().length() < 2) {
			return 0;
		}
		return mapper.insUser(p);
	}
	
	public int login(UserVO p, HttpSession hs) {
		UserVO data = mapper.selUser(p);
		if (data == null) {
			return 2;
		}
		String pw = p.getUpw();
		if (!pw.equals(data.getUpw())) {
			return 3;
		}
		hs.setAttribute("result", data);
		return 1;
	}
}
