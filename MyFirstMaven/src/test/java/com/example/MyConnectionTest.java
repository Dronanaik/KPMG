package com.example;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionTest {
	
	@Test
	public  void doconnection1() {
		String username = "root";
        String password = "pass@word1";
        String url = "jdbc:mysql://localhost:3306/kpmg";
        Connect c = new Connect();
        assertEquals(true,c.doconnection(url, username, password));
	}

}
