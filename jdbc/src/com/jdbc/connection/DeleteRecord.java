package com.jdbc.connection;

import java.sql.*;

public class DeleteRecord {
	static final String url = "jdbc:mysql://localhost:3306/employees";
	static final String user = "root";
	static final String pass = "Dhaya004@";
    static final String QUERY = "SELECT rollno, stu_name FROM student";

   public static void main(String[] args) {
		try {
    		
    		Connection con=DriverManager.getConnection(url,user,pass);
    		Statement st=con.createStatement();
    		
    		String sql="DELETE FROM student WHERE stu_name='aswini'";
    		st.executeUpdate(sql);
    		
    		ResultSet rs = st.executeQuery(QUERY);
    		System.out.println("record deleted sucesssfully ");
    	      
	         while(rs.next()){
	            
	            System.out.println("stu_rollno:" + rs.getInt("rollno"));
	            System.out.println("stu_name:" + rs.getString("stu_name"));
	         }
		}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}

