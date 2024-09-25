package com.program.statement.DDL;

import java.sql.*;

public class Create {
	
	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	Connection con;
	
	
	/*
	 * Create connection
	 */
	public void createConnectionDataBase() {
		try {
			//step 1 -> create connection
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url,user,pass);
			if(con !=null) {
				System.out.println("Connected Sucessfully..");
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	/*
	 * create database
	 */
	void createDatabase() {
		//query
		String databaseQuery="CREATE DATABASE student";
		try {
			//step 1 -> register the driver
			Class.forName("org.postgresql.Driver");
			
			//step 2 -> create connection
			con=DriverManager.getConnection(url,user,pass);
			
			//step 3 -> create statement
			Statement st=con.createStatement();
			
			//step 4->execute query
			st.executeUpdate(databaseQuery);
			System.out.println("Database created sucessfully...");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
