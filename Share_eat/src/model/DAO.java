package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DButils.DbUtils;

public class DAO {

	public static DTO selUserList(DTO dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT i_user, email, nm FROM t_user WHERE email = ? AND pw = ?";
		
		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getEmail());
			ps.setString(2, dto.getPw());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				DTO data = new DTO();
				data.setI_user(rs.getInt("i_user"));
				data.setEmail(rs.getString("email"));
				data.setPw(rs.getString("pw"));
				
				return data;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeConn(conn, ps, rs);
		}

		return null;
	}

	public static int insert(DTO dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO t_user(email, pw, confirm_pw, user_nm, gender, d_birth, addr, p_number) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?); ";
		
		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getEmail());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getConfirm_pw());
			ps.setString(4, dto.getUser_nm());
			ps.setString(5, dto.getGender());
			ps.setString(6, dto.getD_birth());
			ps.setString(7, dto.getAddr());
			ps.setString(8, dto.getP_number());
			
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeConn(conn, ps);
		}
		
		return 0;
	}

}
