package DButils;

import java.sql.*;

public class DbUtils {
	public static Connection getConn() throws Exception {

		final String url = "jdbc:mysql://localhost/share_eat?serverTimezone=UTC";
		final String user = "root";
		final String pw = "150206";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pw);

		System.out.println("DB Connected...");

		return conn;
	}

	public static void closeConn(Connection conn, PreparedStatement ps) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeConn(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeConn(conn, ps);
		}
	}
}
