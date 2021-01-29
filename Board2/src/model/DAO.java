package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	public static void insBoard(Model param) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "INSERT INTO t_board(title, ctnt) VALUES (?, ?) ";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.DbClose(conn, ps);
		}
	}

	public static List<Model> selBoardList() {
		List<Model> list = new ArrayList();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT i_board, title, ctnt, r_dt FROM t_board ORDER BY i_board DESC ";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getString("title");
				String ctnt = rs.getString("ctnt");
				String r_dt = rs.getString("r_dt");

				Model data = new Model();
				data.setI_board(i_board);
				data.setTitle(title);
				data.setCtnt(ctnt);
				data.setR_dt(r_dt);

				list.add(data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.DbClose(conn, ps, rs);
		}

		return list;
	}

	public static Model selBoard(Model param) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT title, ctnt, r_dt FROM t_board WHERE i_board = ?";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getI_board());
			rs = ps.executeQuery();

			if (rs.next()) {
				Model data = new Model();
				data.setTitle(rs.getString("title"));
				data.setCtnt(rs.getString("ctnt"));
				data.setR_dt(rs.getString("r_dt"));

				return data;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.DbClose(conn, ps, rs);
		}

		return null;

	}

	public static void delBoard(Model param) {
		Connection conn = null;
		PreparedStatement ps = null;

		String sql = "DELETE FROM t_board WHERE i_board = ?";

		try {
			conn = DbUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, param.getI_board());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.DbClose(conn, ps);
		}
	}
	
	public static Model updBoard(Model param) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "UPDATE t_board SET title = ?, ctnt = ? WHERE i_board = ? ";
		
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
			DbUtils.DbClose(conn, ps);
		}
		return null;
	}
}
