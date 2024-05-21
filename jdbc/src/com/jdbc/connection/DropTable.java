package com.jdbc.connection;

import java.sql.*;

public class DropTable {
	
	static final String url = "jdbc:mysql://localhost:3306/employees";
    static final String user = "root";
    static final String pass = "Dhaya004@";
    
    public static void main(String[]args) {
    	try {
    		
    		Connection con=DriverManager.getConnection(url,user,pass);
    		Statement st=con.createStatement();
    		
    		String sql="DROP TABLE student";
    		st.executeUpdate(sql);
    		System.out.println("Table Droped ");
    		
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

}
