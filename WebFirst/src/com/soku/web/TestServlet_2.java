package com.soku.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/soku_2")
public class TestServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("this is get");
		String msg = request.getParameter("msg");
		System.out.println("msg : "  + msg);
		String jsp = "/WEB-INF/JSP/soku_2.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("this is post");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.println("title : " + title);
		System.out.println("ctnt : " + ctnt);
		
		response.sendRedirect("/soku_2");
	}

}
