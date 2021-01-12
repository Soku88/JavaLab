package com.stocker.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.stocker.DTO.ArticleDTO;
import com.stocker.Utils.DBUtil;

public class ArticleDao {

	public static List<ArticleDTO> selectAll() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT " + "A.id, " + "title, " + "nm AS author_nm, " + "file_nm " + "FROM t_article AS A "
				+ "JOIN t_user AS U " + "on A.author_id = U.id " + "ORDER BY regdate DESC";

		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			List<ArticleDTO> list = new ArrayList();

			while (rs.next()) {
				// TODO add ArticleDTO to list

				ArticleDTO dto = new ArticleDTO();

				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor_nm(rs.getString("author_nm"));
				dto.setFile_nm(rs.getString("file_nm"));

				list.add(dto);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn, ps, rs);
		}

		return null;

	}

}
