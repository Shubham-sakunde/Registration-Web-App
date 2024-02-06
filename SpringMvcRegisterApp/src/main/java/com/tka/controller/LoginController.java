package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tka.entities.User;
import com.tka.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping("/")
	public String showLogin() {
		return "login11";
	}
	
	@RequestMapping("validate")
	public ModelAndView validate(User user) {
		
		String webpage ="";
		String data = "";
		
		ModelAndView modelAndView = new ModelAndView();
		
		Boolean answer = service.validate(user);
		
		if(answer == null) {
			webpage = "login11";
			data = "username is wrong";
		}
		else if(answer) {
			webpage = "welcome11";
			data = "Welcome" + " " + user.username;
		}
		else {
			webpage = "login11";
			data = "password is wrong";
		}
		
		modelAndView.setViewName(webpage);
		modelAndView.addObject("message",data);
		
		return modelAndView;
	}
}
