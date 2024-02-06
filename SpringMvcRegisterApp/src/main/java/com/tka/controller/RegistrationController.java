package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tka.entities.User;
import com.tka.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationService service;
	
	@RequestMapping("showRegister")
	public String showRegister() {
		
		return "register11";
		
	}
	@RequestMapping("saveToDB")
	public ModelAndView saveToDB(User user) {
		
		
		//Save User class Object in database
		service.saveToDB(user);
				
		//Controller logic written inside controller class
		//It decide which web page and what data is sent to the client
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("login11");
		modelAndView.addObject("message"," Registration Successfully  ");
		return modelAndView;
	}
	

}
