package koreait.com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection getCon() {
		Connection con = null;

		final String url = "jdbc:mysql://localhost/test1";
		final String user = "root";
		final String pw = "150206";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("DB Connected...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;

	}
	
	public static void ClsDB(Connection con) {
		
		if(con != null) {
			try {
				con.close();
				System.out.println("DB Closed...");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
	}

}
