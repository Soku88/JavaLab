package com.soku.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.soku.board.model.BoardEntity;

public class BoardDAO3 {
	
	public static List<BoardEntity> selBoardList() {
		List<BoardEntity> list = new ArrayList();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT i_board, title, r_dt FROM t_board";
		
		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			int i_board = rs.getInt("i_board");
			String title = rs.getString("title");
			String r_dt = rs.getString("r_dt");
			
			BoardEntity vo = new BoardEntity();
			vo.setI_board(i_board);
			vo.setTitle(title);
			vo.setR_dt(r_dt);
			
			list.add(vo);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps, rs);
		}
		
		
		
		
		
		return list;
		
	}

}
