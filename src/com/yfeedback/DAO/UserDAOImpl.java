package com.yfeedback.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yfeedback.DBHandler.DBHandler;
import com.yfeedback.DBHandler.DBUtil;
import com.yfeedback.Model.User;

public class UserDAOImpl implements UserDAO {
	
	private static PreparedStatement prestmt;
	private static ResultSet resultSet = null;
	
	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		int update = 0;
		Connection connection = DBHandler.getConnection();
		String sql = "INSERT INTO User VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			prestmt = connection.prepareStatement(sql);
			prestmt.setInt(1, user.getID());
			prestmt.setString(2, user.getFname());
			prestmt.setString(3, user.getLname());
			prestmt.setString(4, user.getEmail());
			prestmt.setString(5, user.getPassword());
			prestmt.setString(6, user.getRole());
			prestmt.setString(7, user.getGender());
			update = prestmt.executeUpdate();
			if (update > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("ERROR: unble to add user to the database.");
			e.printStackTrace();
		} finally {
			DBUtil.close(connection);
			DBUtil.close(resultSet);
			DBUtil.close(prestmt);
		}
		return false;
	}

	@Override
	public boolean deleteUser(int userID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByID(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

}
