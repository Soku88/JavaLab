package com.soku.board.dao;

import java.sql.*;
import java.util.*;
import com.soku.board.model.*;


public class BoardDAO {

	public static void insBoard(BoardEntity vo) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "INSERT INTO t_board" + " (title, ctnt)" + " VALUES" + " (?, ?)";

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

	public static List<BoardEntity> selBoardList(BoardDTO param) {
		List<BoardEntity> list = new ArrayList();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT i_board, title, ctnt, r_dt FROM t_board ORDER BY i_board DESC "
				+ "LIMIT ?,?";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getStartIdx());
			ps.setInt(2, param.getRowCountPerPage());
			rs = ps.executeQuery();

			while (rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getString("title");
				String r_dt = rs.getString("r_dt");
				String ctnt = rs.getString("ctnt");

				BoardEntity vo = new BoardEntity();

				vo.setI_board(i_board);
				vo.setTitle(title);
				vo.setR_dt(r_dt);
				vo.setCtnt(ctnt);
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps, rs);
		}

		return list;

	}

	public static BoardEntity selBoard(BoardEntity Be) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT title, ctnt, r_dt FROM t_board WHERE i_board = ?";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Be.getI_board());
			rs = ps.executeQuery();

			if (rs.next()) {

				String title = rs.getString("title");
				String ctnt = rs.getString("ctnt");
				String r_dt = rs.getString("r_dt");

				BoardEntity vo = new BoardEntity();

				vo.setTitle(title);
				vo.setCtnt(ctnt);
				vo.setR_dt(r_dt);
				vo.setI_board(Be.getI_board());

				return vo;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps, rs);
		}

		return null;

	}
	
	public static int selMaxPageLength(BoardDTO param) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select ceil(count(i_board)/?) from t_board";
		
		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getRowCountPerPage());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps, rs);
		}
		
		
		return 0;
		
	}

	public static int delBoard(BoardEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "DELETE FROM t_board where i_board = ?";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getI_board());

			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps);
		}
		return 0;

	}

	public static BoardEntity updBoard(BoardEntity param) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "UPDATE t_board SET title=?, ctnt=? WHERE i_board=? ";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.setInt(3, param.getI_board());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, ps);
		}

		return null;

	}
}
