package com.soku.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO3 {
	
	public static List<HobbyEntity> setHobby() {
		List<HobbyEntity> list3 = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql); //sql문 받아오는애
			rs = ps.executeQuery(); // 쿼리문 작성해주는애
			
			while(rs.next()) {
				//column명으로 값을 받아줄 변수생성
				int n1 = rs.getInt("id");
				String s1 = rs.getString("name");
				
				//값을 담아줄 객체 생성
				HobbyEntity lo = new HobbyEntity();
				lo.setId(n1);
				lo.setName(s1);
				list3.add(lo); 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}

		return list3;		
	}

}
