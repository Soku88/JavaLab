package com.stocker;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stocker.DAO.UserDao;
import com.stocker.Model.User;
import com.sun.corba.se.impl.encoding.BufferQueue;

@WebServlet("/Mypage")
public class mypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setAttribute("page", "Mypage");
		String jsp = "/WEB-INF/JSP/template/template.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		User data = (User) request.getSession().getAttribute("c_user");
		
		User dto = new User();
		dto.setId(data.getId());
		dto.setNm(request.getParameter("nm"));
		
		if(UserDao.update(dto) == 1) {
			data.setNm(request.getParameter("nm"));
		}
		
		response.sendRedirect("/Mypage");
	}

}
