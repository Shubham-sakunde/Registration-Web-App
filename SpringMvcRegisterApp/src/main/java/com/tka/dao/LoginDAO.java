package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.User;

@Repository
public class LoginDAO {
	
	@Autowired
	SessionFactory factory;
	
	public String getPassword(String username) {
		
		Session session = factory.openSession();
		
		User userfromdb = session.get(User.class, username);
		
		if(userfromdb==null)
			return null;
		
		return userfromdb.getPassword();
		
	}

}
