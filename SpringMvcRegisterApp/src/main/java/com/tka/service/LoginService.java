package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.LoginDAO;
import com.tka.entities.User;

@Service
public class LoginService {
	
	@Autowired
	LoginDAO dao;
	
	public Boolean validate(User user) {
		
		
		String dbpassword = dao.getPassword(user.username);
		
		if(dbpassword==null)
			return null;
		
		else if(dbpassword.equals(user.password))
			return true;
		
		return false;
	}
	

}
