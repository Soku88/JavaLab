package com.soku.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Hobby")
public class HobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<HobbyEntity> list = DAO.selHobbyList();
		request.setAttribute("list", list);
		
		request.setAttribute("endIdx", 10);
		
		HttpSession hs = request.getSession();
		hs.setAttribute("loginUser", "");

		String jsp = "WEB-INF/JSP/Hobby.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String hobby_id = request.getParameter("id");
		String hobby_nm = request.getParameter("hobby_nm");
		
		int id = Integer.parseInt(hobby_id);
		
		//TODO : 등록처리
		HobbyEntity param = new HobbyEntity();
		param.setId(id);
		param.setNm(hobby_nm);
		int result = DAO.insHobby(param);
		
		//주소로 화면 띄우기
//		response.sendRedirect("/soku");
		
		//같은파일 내라면 메소드 호출로 화면 띄우기도 가능함
		doGet(request, response);
	}

}
