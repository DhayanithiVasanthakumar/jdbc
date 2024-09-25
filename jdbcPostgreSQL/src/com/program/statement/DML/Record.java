package com.program.statement.DML;

import java.sql.*;

/*
 * I->insert
 * I->update
 * S->select
 * D->delete
 */
public class Record {

	
	private static final String url = "jdbc:postgresql://localhost:5432/student";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	Connection con;
	
	
	/*
	 * create table
	 */
	void createTable() {
		// query for table
		String tableQuery = "CREATE TABLE details("
				+ "sno INT ,"
				+ "sname VARCHAR(50),"
				+ "rollno INT ,"
				+ "dept VARCHAR(50)"
				+ ");";
		
		try {
			// step 1 -> register the driver
			Class.forName("org.postgresql.Driver");

			// step 2 -> create connection
			con = DriverManager.getConnection(url, user, pass);

			// step 3 -> create statement
			Statement st = con.createStatement();

			// step 4->execute query
			st.executeUpdate(tableQuery);
			System.out.println("Table created sucessfully...");

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
	
	
	
	
	
	/*
	 * insert values into table
	 */
	void insertRecords() {
		// query for table
		String insertQuery = "INSERT INTO details (sno,sname,rollno,dept)\r\n"
				+ "				 VALUES(1,'dhaya',08,'AIDS'),\r\n"
				+ "				 (2,'aswini',06,'agri'),\r\n"
				+ "				 (3,'hari',03,'ca'),\r\n"
				+ "				 (4,'nare',13,'EEE'),"
				+ "				(5,'partha',09,'cse');";

		try {
			// step 1 -> register the driver
			Class.forName("org.postgresql.Driver");

			// step 2 -> create connection
			con = DriverManager.getConnection(url, user, pass);

			// step 3 -> create statement
			Statement st = con.createStatement();

			// step 4->execute query
			st.executeUpdate(insertQuery);
			System.out.println("Value inserted sucessfully...");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	/*
	 * Update record in table
	 */
	void updaterecords() {
		
	}
	
	void selectRecords() {
		
	}
	
	void deleteRecords() {
		
	}
}
