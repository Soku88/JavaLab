package com.koreait.first.DBTest;

import java.sql.*;

public class DBConn {

	public static void main(String[] args) {
		// 연결관련 정보(멤버)
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test1?serverTimeZone=UTC"; //타임존에러 :-(
		String user = "root";
		String pwd = "150206";

		// 연결객체 참조변수
		String sql; // sql 임시저장
		Connection conn = null; // DB연결용
		PreparedStatement pstmt = null; // sql문 명령 전달용
		ResultSet rs = null; // sql결과문 저장용

		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("DB Connected...");
			sql = "select * from productTbl";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("prodname") + " ");
				System.out.println(rs.getString("company") + " ");
				System.out.println(rs.getString("amount") + " ");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
