package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Model;

public class DAO {

	public static void insBoard(Model param) {
		Connection con = null;
		PreparedStatement ps = null;

		String sql = "INSERT INTO t_board(title, ctnt) VALUES(?, ?) ";

		try {
			con = DB.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.closeCOn(con, ps);
		}
	}

	public static List<Model> selBoardList() {
		List<Model> list = new ArrayList();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT i_board, title, ctnt, r_dt FROM t_board ";

		try {
			con = DB.getCon();
			ps = con.prepareStatement(sql);
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
			DB.closeCOn(con, ps, rs);
		}

		return list;
	}

}
