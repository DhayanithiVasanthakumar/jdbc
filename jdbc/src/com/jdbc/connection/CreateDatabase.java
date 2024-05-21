package com.jdbc.connection;

import java.sql.*;
public class CreateDatabase {
	   static final String URL = "jdbc:mysql://localhost:3306/employees";
	   static final String USER = "root";
	   static final String PASS = "Dhaya004@";

	   public static void main(String[] args) throws ClassNotFoundException {
	      
	      try {
	    		  Connection conn = DriverManager.getConnection(URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      	      
	         String sql = "CREATE DATABASE STUD";
	         stmt.executeUpdate(sql);
	         System.out.println("Database created successfully..."); 
	      }
	       catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}