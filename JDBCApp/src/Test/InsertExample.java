package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String username = "root";
			String password = "pass@word1";
			String url = "jdbc:mysql://localhost:3306/kpmg";
			
			Connection con;
			
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Successful");
			String query = "INSERT INTO customer (id, name, age, address) " +
                  "VALUES (111, 'Aishwarya', 21, 'Beluru')";
			Statement s1 = con.createStatement();
			int count = s1.executeUpdate(query);
			System.out.println(count+"row/rows inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
