package com.soku.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	public static void main(String[] args) {
		try {
			getCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() throws Exception {

		final String URL = "jdbc:mysql://localhost/JavaBoard1";
		final String USER = "root";
		final String PW = "150206";

//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PW);
		System.out.println("DB Connected...");
		return conn;

	}
	public static void close(Connection conn, PreparedStatement ps) {
		if (ps != null) {
			try {ps.close();} catch (SQLException e) {}
		}
		if (conn != null) {
			try {conn.close();} catch (Exception e) {}
		}
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {rs.close();} catch (Exception e) {}
		}
		close(conn, ps);
	}
}

