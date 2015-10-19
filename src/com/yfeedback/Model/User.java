package com.yfeedback.Model;

/** 
* @author yhammoud
* Java Bean class for Users 
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
	
	/**
	 * @param fname first name of the user
	 * Sets the first name of the user to fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	/**
	 * @return the first name of the user
	 * Gets the first name of the user
	 */
	public String getFname() {
		return fname;
	}
	
	/**
	 * @param lname last name of the user
	 * Sets the last name of the user to lname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	/**
	 * @return the last name of the user
	 * Gets the last name of the user
	 */
	public String getLname() {
		return lname;
	}
	
	/**
	 * @param role is the role of the user
	 * sets the role of the user (coach, athlete)
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the role of the user
	 * gets the role of the user
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param gender is the gender of the user
	 * sets the gender of the user to param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the gender of the user
	 * Gets the gender of the user
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * @param email is the email of the user
	 * sets the email of the user to email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the email of the user
	 */
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
