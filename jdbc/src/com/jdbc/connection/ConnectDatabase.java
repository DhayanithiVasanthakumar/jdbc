package com.jdbc.connection;
import java.sql.*;

public class ConnectDatabase {

	static final String url="jdbc:mysql://localhost:3306/employees";
	static final String user="root";
	static final String pass="Dhaya004@";
	
	public static void main(String[]args) {
		try {
			
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Database connected");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
