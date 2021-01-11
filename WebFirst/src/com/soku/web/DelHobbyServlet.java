package com.soku.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DelHobby")
public class DelHobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int hobby = Integer.parseInt(request.getParameter("id"));

		System.out.println(hobby);

		// TODO : 삭제처리
		HobbyEntity param = new HobbyEntity();
		param.setId(hobby);
		DAO.DelHobby(param);

		response.sendRedirect("/Hobby");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
