package com.yfeedback.Model;

/** 
* @author yhammoud
 *
 */

import java.util.Date;

public class User {
	
	/**
	 * Instance variables
	 */
	private String fname;
	private String lname;
	private String role;
	private String gender;
	private String email;
	private String password;
	private Date dob;
	private int id;
	
	public User() {
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	 
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDOB(Date dob) {
		this.dob = dob;
	}
	
	public Date getDOB() {
		return dob;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
}
