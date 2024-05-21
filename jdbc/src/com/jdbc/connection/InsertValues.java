package com.jdbc.connection;

import java.sql.*;

public class InsertValues {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.
					getConnection("jdbc:mysql://localhost:3306/employees","root","Dhaya004@");
			Statement st=con.createStatement();
			
			System.out.println("insert records");
			
			String sql="INSERT INTO employee (empid,empname) VALUES (100,'arun v'),(101,'dhaya')";
					st.executeUpdate(sql);
						
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
