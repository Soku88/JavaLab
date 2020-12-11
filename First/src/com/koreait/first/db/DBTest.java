package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static Connection Conn() {
		Connection con = null;

		final String host = "jdbc:mysql://localhost:3306/test1";
		final String user = "root";
		final String pwd = "150206";

		try {

			con = DriverManager.getConnection(host, user, pwd);
			System.out.println("DB Connected...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}

	public static void close(Connection con) {
		if (con != null) {
			try {
				con.close();
				System.out.println("DB close...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
