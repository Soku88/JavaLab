package dao;

import java.sql.*;

public class DB {
	public static Connection getCon() throws Exception {
		final String url = "jdbc:mysql://localhost/JavaBoard3?serverTimezone=UTC";
		final String user = "root";
		final String pw = "150206";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pw);

		return con;

	}
	
	public static void closeCOn(Connection con, PreparedStatement ps) {
		
		if(con != null) {
			try {con.close();} catch (SQLException e) {e.printStackTrace();}
		}
		if(ps != null) {
			try {ps.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public static void closeCOn(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {e.printStackTrace();}
			closeCOn(con, ps);
		}
	}

}
