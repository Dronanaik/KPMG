package com.example;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public boolean doconnection(String url,String username,String password) {
		
		try {
            
            
            // Establish the connection
            Connect con = (Connect) DriverManager.getConnection(url, username, password);
            
	}catch (SQLException e) {
        // Handle SQL exceptions
        e.printStackTrace();
    }
		return true;
	}
}
