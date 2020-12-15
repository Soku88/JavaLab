package koreait.com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	public static Connection Conn() {
		Connection con = null;
		final String url = "jdbc:mysql://localhost:3306/test1";
		final String usr = "root";
		final String pw = "150206";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usr, pw);
			System.out.println("Driver Connected...");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return con;

	}

	public static void Close(Connection con) {

		if (con != null) {
			try {
				con.close();
				System.out.println("DataBase Closed...");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
