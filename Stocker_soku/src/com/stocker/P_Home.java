package com.stocker;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stocker.DAO.ArticleDao;
import com.stocker.DTO.ArticleDTO;


@WebServlet("/Home")
public class P_Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<ArticleDTO> list = ArticleDao.selectAll();
		
		request.setAttribute("list", list);
		request.setAttribute("page", "Home");
		
		request.getRequestDispatcher("/WEB-INF/JSP/template/template.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
