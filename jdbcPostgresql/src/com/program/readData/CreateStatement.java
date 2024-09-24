package com.program.readData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//  2
public class CreateStatement {

	private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String user = "postgres";
	private static final String pass = "root";

	Connection con;

	public void createStatement() throws SQLException {
		try {
			// step 1 -> create connection object.
			con = DriverManager.getConnection(url, user, pass);

			// step 2 -> create statement object.
			Statement st = con.createStatement();

			// step 3 -> execute query.
			ResultSet rs = st.executeQuery("SELECT * FROM student;");

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		}

		finally {
			con.close();
		}
	}
}
