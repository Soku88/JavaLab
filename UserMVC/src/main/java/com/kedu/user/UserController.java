package com.kedu.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/join")
	public void join() {
	}

	@ResponseBody
	@PostMapping("/join")
	public Map<String, Object> join(@RequestBody UserVO p, HttpSession hs) {
		System.out.println(p.getNm());

		Map<String, Object> returnVal = new HashMap<>();
		returnVal.put("result", service.join(p, hs));
		return returnVal;
	}

	@GetMapping("/login")
	public void login(Model model) {

	}

	@ResponseBody
	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody UserVO p, HttpSession hs) {
		System.out.println("id : " + p.getUid());
		System.out.println("pw : " + p.getUpw());

		Map<String, Object> returnVal = new HashMap<>();
		returnVal.put("result", service.login(p, hs));

		return returnVal;
	}
	
	@GetMapping("/home")
	public void home() {
	}

}
