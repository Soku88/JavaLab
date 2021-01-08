package com.soku.web;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	public static void main(String[] args) {
		try {
			getCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() throws Exception {

		final String URL = "jdbc:mysql://localhost/test";
		final String USER = "root";
		final String PW = "150206";

//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PW);
		System.out.println("DB Connected...");
		return conn;

	}

}
