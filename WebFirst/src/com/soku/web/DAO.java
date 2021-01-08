package com.soku.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
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
