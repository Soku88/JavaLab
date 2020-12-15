package conntest.com.test;

import java.sql.Connection;

public class conn {

	public static void main(String[] args) {
		Connection con = conntest.Con();
		conntest.setClose(con);

	}

}
