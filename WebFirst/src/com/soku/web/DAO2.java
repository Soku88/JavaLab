package com.soku.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO2 {

	public static int insHobby(HobbyEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO hobby (id, name) " + "values" + "(?, ?)";

		try {
			conn = DBUtils.getCon();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getId());
			ps.setString(2, param.getName());
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps);
		}

		return 0;

	}

	public static List<HobbyEntity> selHobby() {
		List<HobbyEntity> list = new ArrayList();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "";

		try {
			DBUtils.getCon();
			ps = conn.prepareStatement(sql); // sql 문 받아주고
			rs = ps.executeQuery(); // 쿼리문 실행한 값 rs로 받아오기

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
