package com.stocker.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.stocker.Model.User;
import com.stocker.Utils.DBUtil;

public class UserDao {
	public static int insert(User param) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO t_user(email, nm, pw) " + "VALUES " + "(?, ?, ?);";

		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, param.getEmail());
			ps.setString(2, param.getNm());
			ps.setString(3, param.getPw());

			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps);
		}

		return 0;

	}

	public static User selUserList(User param) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT id, email, nm FROM t_user WHERE email = ? AND pw = ?";

		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, param.getEmail());
			ps.setString(2, param.getPw());
			rs = ps.executeQuery();

			if (rs.next()) {
				User data = new User();
				data.setId(rs.getInt("id"));
				data.setEmail(rs.getString("email"));
				data.setNm(rs.getString("nm"));

				return data;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn, ps, rs);
		}
		return null;

	}

	public static int delete(User dto) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "DELETE FROM t_user WHERE id = ?";

		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getId());


			System.out.println(ps.executeUpdate()+"dfdfd");
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps);
		}

		return 0;

	}

	public static int update(User dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "UPDATE t_user SET nm = ? WHERE id = ?" ;
		
		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getNm());
			ps.setInt(2, dto.getId());
			
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps);
		}

		return 0;

	}

}
