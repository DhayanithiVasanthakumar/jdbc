package com.jdbc.connection;
import java.sql.*;

public class Main {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/employees";
	   static final String USER = "root";
	   static final String PASS = "Dhaya004@";

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         String sql = "DROP DATABASE stud";
	         stmt.executeUpdate(sql);
	         System.out.println("Database dropped successfully...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}