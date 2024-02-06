package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.RegisterDAO;
import com.tka.entities.User;



@Service
public class RegistrationService {

	@Autowired
	RegisterDAO dao;
	
	public void saveToDB(User user) {
		dao.saveToDB(user);
	}
	
}
