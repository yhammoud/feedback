package com.yfeedback.DBHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {

	// JDBC Driver name and URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	static final String DB_URL = "jdbc:mysql://localhost:3306/yFeedback";
	
	private static DBHandler instance = new DBHandler();
	
	static final String USER = "root";
	static final String PASSWORD = "password";
	
	Connection con = null;
	 
	public DBHandler() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	 
	public Connection createConn() {
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch(SQLException e) {
			System.out.println("ERROR: Unable to Connect to the Database.");
		}
		return con;
	}
	
	public static Connection getConnection() {
        return instance.createConn();
    }
	
}