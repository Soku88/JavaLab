package com.koreait.first.db;

import java.sql.Connection;

public class DatabaseTest {

	public static void main(String[] args) {
		Connection con = DBUtils.getCon();
		DBUtils.close(con);
	}

}
