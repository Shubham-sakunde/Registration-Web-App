package com.tka.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	public String username;
	public String password;
	public long mobno;
	public String emailid;
	
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getUsername() {
		return username;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobno=" + mobno + ", emailid=" + emailid
				+ "]";
	}
	
}
