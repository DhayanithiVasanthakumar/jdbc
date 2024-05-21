package com.jdbc.connection;

import java.sql.*;

public class CreateTable {
	
	static final String url = "jdbc:mysql://localhost:3306/employees";
    static final String user = "root";
    static final String pass = "Dhaya004@";
    
    public static void main(String[]args) {
    	try {
    		
    		Connection con=DriverManager.getConnection(url,user,pass);
    		Statement st=con.createStatement();
    		
    		String sql="CREATE TABLE student(rollno INT,stu_name CHAR(50))";
    		st.executeUpdate(sql);
    		System.out.println("Table Created ");
    		
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

}
