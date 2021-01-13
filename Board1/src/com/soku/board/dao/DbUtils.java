package com.soku.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbUtils {
	public static Connection getConn() throws Exception {
		final String url = "jdbc:mysql://localhost/JavaBoard1?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8";
		final String user = "root";
		final String pw = "150206";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pw);
		System.out.println("DB Connected....");

		return conn;

	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {rs.close();} catch (Exception e) {}
			close(conn, ps);
		}
	}

	public static void close(Connection conn, PreparedStatement ps) {
		if (ps != null) {
			try {ps.close();} catch (Exception e) {}
		}

		if (conn != null) {
			try {conn.close();} catch (Exception e) {}
		}

	}
}
