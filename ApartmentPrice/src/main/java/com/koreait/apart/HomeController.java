package com.koreait.apart;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koreait.apart.model.ApartmentInfoEntity;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService service;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("data", service.selLocation());
		return "home";
	}

	@GetMapping("/result")
	public void result(ApartmentInfoEntity p) {
		service.getData(p);
	}
	
	
}
