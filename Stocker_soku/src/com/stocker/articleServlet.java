package com.stocker;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stocker.DAO.ArticleDao;
import com.stocker.DTO.ArticleDTO;

@WebServlet("/article")
public class articleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		
		ArticleDTO dto = ArticleDao.select(Integer.parseInt(id));
		System.out.println(request.getParameter("id"));
//		String json = "{\"title\": \""+ dto.getTitle() + "\"}";
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(dto);
		
		response.setContentType("application/json");
		response.getWriter().print(json);
		
		
		
	}

}