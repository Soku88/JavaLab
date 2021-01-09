package com.stocker.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {

	public static Connection getConn() throws Exception {
		String URL = "jdbc:mysql://localhost:3306/stocker?serverTimezone=UTC";
		String USER = "root";
		String PW = "150206";

		Connection conn = DriverManager.getConnection(URL, USER, PW);
		System.out.println("Connection Success...");

		return conn;
	}

	public static void close(Connection conn, PreparedStatement ps) {
		if(ps != null) {
			try { ps.close(); } catch (Exception e) {}
		}
		
		if(conn != null) {
			try { conn.close(); } catch (Exception e) {}
		}		
	}
	public static void closeConn(Connection conn, PreparedStatement ps, ResultSet rs) throws Exception {
		if(rs != null) {
			try {rs.close();} catch (Exception e) {}
		}
		close(conn, ps);
	}
}
