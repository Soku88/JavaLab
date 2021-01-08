package com.stocker.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getConn() throws Exception {
		String URL = "jdbc:mysql://localhost:3306/stocker?serverTimezone=UTC";
		String USER = "root";
		String PW = "150206";

		Connection conn = DriverManager.getConnection(URL, USER, PW);
		System.out.println("Connection Success...");

		return conn;
	}

	public static void closeConn(Connection conn) throws Exception {
		if(conn != null) {
			conn.close();
			System.out.println("DB Closed...");
		}
		
	}
}
