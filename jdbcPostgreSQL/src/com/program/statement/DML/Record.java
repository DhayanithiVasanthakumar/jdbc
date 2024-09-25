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
		}
	}
	
	
	
	
	
	/*
	 * insert values into table
	 */
	void insertRecords() {
		// query for table
		String insertQuery = "INSERT INTO details (sno,sname,rollno,dept)"
				+ "VALUES(1,'dhaya',08,'AIDS'),"
				+ "(2,'aswini',06,'agri'),"
				+ "(3,'hari',03,'ca'),"
				+ "(4,'nare',13,'EEE');";

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
