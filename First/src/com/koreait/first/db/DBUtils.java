package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("접속종료");
		}
	}

	public static Connection getCon() {
		Connection con = null;

		final String URL = "jdbc:mysql://localhost:3306/test1?serverTimezone=UTC";
		final String USER = "root";
		final String PW = "150206";

		// static method
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);
			System.out.println("접속완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
