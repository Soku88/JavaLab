package com.stocker.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.util.ResultSetUtil;
import com.stocker.DTO.ArticleDTO;
import com.stocker.Utils.DBUtil;

public class ArticleDao {
	
	public static ArticleDTO select(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT "
				+ "title, caption, regdate, file_nm, nm AS author_nm "
				+ "FROM t_article AS a "
				+ "JOIN t_user AS u "
				+ "ON a.author_id = u.id "
				+ "WHERE a.id = ? ";
		
		try {
			conn = DBUtil.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				ArticleDTO dto = new ArticleDTO();
				
				dto.setId(id);
				dto.setTitle(rs.getString("title"));
				dto.setCaption(rs.getString("caption"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setFile_nm(rs.getString("file_nm"));
				dto.setAuthor_nm(rs.getString("author_nm"));

				return dto;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps);
		}
		
		return null;
		
	}

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
