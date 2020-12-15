package conntest.com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBtest {

	public static Connection getDB() {
		Connection con = null;

		final String url = "jdbc:mysql://localhost:3306/test1";
		final String usr = "root";
		final String pw = "150206";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usr, pw);
			System.out.println("DB Connected....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
				System.out.println("DB Closed...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
