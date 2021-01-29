package model;

import java.sql.*;

public class DbUtils {
	public static Connection getConn() throws Exception {
		final String user = "root";
		final String pw = "150206";
		final String url = "jdbc:mysql://localhost/JavaBoard2?serverTimezone=UTC";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pw);

		return conn;
	}

	public static void DbClose(Connection conn, PreparedStatement ps) {
		if (conn != null) {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		if (ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public static void DbClose(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			DbClose(conn, ps);
		}
	}

}
