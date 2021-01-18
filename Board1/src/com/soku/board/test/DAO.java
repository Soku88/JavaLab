package com.soku.board.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.soku.board.dao.DbUtils;
import com.soku.board.model.BoardEntity;

public class DAO {
	
	public static void insText(BoardEntity vo) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_board (title, ctnt) values (?, ?)";
		
		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps);
		}
		
	}
}
