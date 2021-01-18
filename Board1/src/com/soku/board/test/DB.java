package com.soku.board.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {

	public static Connection getCon() throws Exception {
		final String url = "jdbc:mysql://localhost/test?serverTimezone=UTC";
		final String user = "root";
		final String pw = "150206";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pw);

		System.out.println("DB connected...");

		return con;

	}
	
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {rs.close();} catch (Exception e) {}
			close(con, ps);
		}
	}
	
	public static void close(Connection con, PreparedStatement ps) {
		if(con != null) {
			try {con.close();} catch (Exception e) {}
		}
		if(ps != null) {
			try {ps.close();} catch (Exception e) {}
		}
	}
}
