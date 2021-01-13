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

	public static List<BoardEntity> selBoardList() {
		List<BoardEntity> list = new ArrayList();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT i_board, title, ctnt, r_dt FROM t_board";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
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
}
