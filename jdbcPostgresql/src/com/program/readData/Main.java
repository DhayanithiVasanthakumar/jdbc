package com.program.readData;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		CreateStatement cs=new CreateStatement();
		try {
			cs.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
