package com.koreait.first.db;

import java.sql.Connection;

public class DatabaseTest {

	public static void main(String[] args) {
//		Connection con = DBUtils.getCon();
//		DBUtils.close(con);
		
//		Connection con2 = DBConn.Conn();
//		DBConn.DbClose(con2);
		
		Connection con3 = DBTest.Conn();
		DBTest.close(con3);
	}

}
