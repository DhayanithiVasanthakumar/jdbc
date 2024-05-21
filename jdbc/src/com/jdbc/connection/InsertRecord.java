package com.jdbc.connection;

import java.sql.*;

public class InsertRecord {


	static final String url = "jdbc:mysql://localhost:3306/employees";
    static final String user = "root";
    static final String pass = "Dhaya004@";
    
    public static void main(String[]args) {
    	try {
    		
    		Connection con=DriverManager.getConnection(url,user,pass);
    		Statement st=con.createStatement();
    		
    		String sql="INSERT INTO student VALUES(8,'dhaya'),(9,'aswini')";
    		st.executeUpdate(sql);
    		System.out.println("value added ");
    		
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

}
