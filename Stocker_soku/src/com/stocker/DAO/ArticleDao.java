package com.stocker.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.stocker.DTO.ArticleDTO;
import com.stocker.Utils.DBUtil;

public class ArticleDao {

	public static List<ArticleDTO> getAllArticle() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT "
				+ "A.id, "
				+ "title, "
				+ "nm AS author_nm, "
				+ "file_nm "
				+ "FROM t_article AS A "
				+ "JOIN t_user AS U "
				+ "on A.author_id = U.id "
				+ "ORDER BY regdate DESC";

		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("title"));
				System.out.println(rs.getString("author_nm"));
				System.out.println(rs.getString("file_nm"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn, ps, rs);
		}

		return null;

	}

}
