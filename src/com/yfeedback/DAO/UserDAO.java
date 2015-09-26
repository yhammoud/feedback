package com.yfeedback.DAO;

import com.yfeedback.Model.User;

public interface UserDAO {
	
	/**
	 * Inserts one user each call into the database.
	 * @param user
	 * @return true if inserted into the database, else false.
	 */
	public boolean insertUser(User user);
	
	/**
	 * Deletes one user by user ID each call  from the database
	 * @param userID
	 * @return true if deleted from the database, else false.
	 */
	public boolean deleteUser(int userID);
	
	/**
	 * Updates user's information in the database.
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 
	 * @param userID of the user to find in the database
	 * @return the user that has the requested userID
	 */
	public User getUserByID(int userID);
	
	
}
