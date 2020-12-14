package koreait.com.test;

import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		Connection con = DB.getCon();
		DB.ClsDB(con);

	}

}
