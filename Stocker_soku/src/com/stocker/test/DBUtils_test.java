package com.stocker.test;

import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import com.stocker.Utils.DBUtil;

public class DBUtils_test {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = DBUtil.getConn();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConn(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
