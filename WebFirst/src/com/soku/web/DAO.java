package com.soku.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	public static int updHobby(HobbyEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "";

		try {
			conn = DBUtils.getCon();
			ps = conn.prepareStatement(sql);
			ps.setString(1, param.getName());
			ps.setInt(1, param.getId());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps);
		}

		return 0;
	}

	public static int DelHobby(HobbyEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "DELETE FROM hobby where id=?";

		try {
			conn = DBUtils.getCon();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getId());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps);
		}

		return 0;

	}

	public static int insHobby(HobbyEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO hobby " + "(id, name) "
					+ "SELECT IFNULL(MAX(id), 0) + 1, ? FROM hobby ";

		try {
			conn = DBUtils.getCon();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getId());
			ps.setString(2, param.getName());
			System.out.println(ps); // 쿼리문
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps);
		}

		return 0;

	}
	public static HobbyEntity selHobby(HobbyEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT name FROM hobby WHERE id = ?";
		
		try {
			conn = DBUtils.getCon();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getId());
			rs = ps.executeQuery();
			if(rs.next()) {
				HobbyEntity vo = new HobbyEntity();
				String name = rs.getString("name");
				vo.setName(name);
				return vo;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps, rs);
		}
		return null;
		
	}
	

	public static List<HobbyEntity> selHobbyList() {
		List<HobbyEntity> list = new ArrayList();

		Connection conn = null; // 빨대 꽂는애
		PreparedStatement ps = null; // 객체 만드는애, 쿼리문 실제로 실행한다
		ResultSet rs = null;

		String sql = "SELECT id, name FROM hobby";

		try {
			conn = DBUtils.getCon();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // ResultSet반환 : select시에 사용
//			ps.executeUpdate(); int반환 : update/ delete/ insert에 사용
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				HobbyEntity vo = new HobbyEntity();
				vo.setId(id);
				vo.setName(name);
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps, rs);
		}

		return list;
	}
}
