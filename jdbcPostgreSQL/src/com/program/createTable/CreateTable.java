package com.program.createTable;

import java.sql.*;

public class CreateTable {
	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	String query="CREATE TABLE stua(sno INT,sname VARCHAR(50))";
	
	public void createtable() {
		try {
			//step 1 ->register the driver
			Class.forName("org.postgresql.Driver");
			
			//step 2 -> Create a connection 
			Connection con=DriverManager.getConnection(url,user,pass);
			
			//step 3 -> create statement 
			Statement st=con.createStatement();
			
			//step 4 -> execute query
			int rs=st.executeUpdate(query);
			
			System.out.println("table created");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
