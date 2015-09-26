package com.yfeedback.DBHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DBUtil {
 
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
            	System.out.println("ERROR: Unable to close connection.");
            }
        }
    }
 
    public static void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
            	System.out.println("ERROR: Unable to close statement.");
            }
        }
    }
 
    public static void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
            	System.out.println("ERROR: Unable to close result set.");
            }
        }
    }
}