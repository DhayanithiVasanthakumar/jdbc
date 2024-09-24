package com.program.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//  1
public class CreateConnection {

	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	
	
	//step 1 -> create connection
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,pass);
	}
	
	public void createConnection() {
		try {
			
			Class.forName("org.postgresql.Driver");
			
			Connection con=getConnection();
			if(con !=null) {
				System.out.println("Connected Sucessfully..");
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
}
