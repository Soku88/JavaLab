package com.soku.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO2 {
	public static List<HobbyEntity> setHobby() {
		List<HobbyEntity> list2 = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM hobby";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id"); //column명으로 값을 받아와서 id에 저장
				String name = rs.getString("name");
				
				HobbyEntity he = new HobbyEntity(); //값들을 담아줄 객체생성
				he.setId(id);
				he.setName(name);
				list2.add(he);				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
		
		return list2;
		
	}

}
