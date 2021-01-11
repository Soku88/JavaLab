package com.soku.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modHobby")
public class modHobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int hobby = Integer.parseInt(request.getParameter("id"));

		System.out.println("hobby : " + hobby);

		String jsp = "WEB-INF/JSP/modHobby.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		// 자료를 가져와서 화면에 내용을 뿌린다

		// 그 화면에서 수정한다.

		// 수정버튼을 누르면 doPost()가 실행된다
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int hobby_id = Integer.parseInt(request.getParameter("id"));
		String hobby_nm = request.getParameter("hobby_nm");

		System.out.println("hobby_nm : " + hobby_nm);

		HobbyEntity param = new HobbyEntity();
		param.setId(hobby_id);
		param.setName(hobby_nm);

		// 수정처리
		DAO.updHobby(param);
		response.sendRedirect("/Hobby");


	}

}
