package com.program.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//  1
public class CreateConnection {

	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";
	
	Connection con;
	public void getConnectionDataBase() {
		try {
			//step 1 -> create connection
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url,user,pass);
			if(con !=null) {
				System.out.println("Connected Sucessfully..");
			}
		}  catch (SQLException e) {
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
	
}
