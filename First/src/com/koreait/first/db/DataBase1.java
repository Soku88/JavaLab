package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase1 {

	public static Connection getCon() {
		Connection con = null;
		final String url = "jdbc:mysql://localhost:3306/test1";
		final String usr = "root";
		final String pw = "150206";

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usr, pw);
			System.out.println("Driver connected...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public static void DBCS(Connection con) {

		if (con != null) {
			try {
				con.close();
				System.out.println("DataBase Closed...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
