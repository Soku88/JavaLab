package conntest.com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conntest {

	public static Connection Con() {
		Connection con = null;

		final String url = "jdbc:mysql://localhost:3306/test1";
		final String usr = "root";
		final String pw = "150206";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usr, pw);
			System.out.println("Driver connected...");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

	public static void setClose(Connection con) {
		if (con != null) {
			try {
				con.close();
				System.out.println("Driver Closed...");
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}

	}
}
