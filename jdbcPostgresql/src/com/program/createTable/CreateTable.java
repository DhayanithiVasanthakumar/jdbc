package com.program.createTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//3
public class CreateTable {
	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	Connection con;
	
	String query="CREATE TABLE emp(rollno INT,emp_name CHAR(50))";
	
	void createDataBase() {
		try {
			//step 1-> register driver
			Class.forName("org.postgresql.Driver");
			
			//step 2-> create connection
			con=DriverManager.getConnection(url,user,pass);
			//step 3-> create statement
			Statement st=con.createStatement();
			//step 4-> execute statement
			st.executeUpdate(query);
			System.out.println("Table created sucessfully..");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
