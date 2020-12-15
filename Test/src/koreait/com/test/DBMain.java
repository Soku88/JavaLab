package koreait.com.test;

import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		
		Connection con2 = DBConn.Conn();
		DBConn.Close(con2);
		
		Connection con3 = DB.con();
		DB.DBClose(con3);
		

	}

}
