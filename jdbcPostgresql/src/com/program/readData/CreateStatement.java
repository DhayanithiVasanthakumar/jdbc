package com.program.readData;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//  2
public class CreateStatement {


	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	public void createStatement() {
		try {
			//step 1 -> create connection
		
			Connection con=DriverManager.getConnection(url,user,pass);
			
			//step 2 -> create statement
			Statement st= con.createStatement();
			
			
		}  catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
