package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	public static Connection Conn() {
		Connection con = null; 

		final String url = "jdbc:mysql://localhost:3306/test1";
		final String id = "root";
		final String pw = "150206";

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected...");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void DbClose(Connection con) {
		if (con != null) {
			try {
				con.close();
				System.out.println("DB Closed...");
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
