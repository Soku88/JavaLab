package conntest.com.test;

import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		Connection con = DBtest.getDB();
		DBtest.close(con);

	}

}
