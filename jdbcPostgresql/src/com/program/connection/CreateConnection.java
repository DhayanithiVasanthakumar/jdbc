package com.program.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	public void getConnectionDataBase() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			if(con !=null) {
				System.out.println("Connected Sucessfully..");
			}
			else {
				System.out.println("Failed to connect!");
			}
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
}
