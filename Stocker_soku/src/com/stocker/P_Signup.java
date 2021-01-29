package com.stocker;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stocker.DAO.UserDao;
import com.stocker.Model.User;


@WebServlet("/Signup")
public class P_Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("page", "Signup");
		request.getRequestDispatcher("/WEB-INF/JSP/template/template.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User dto = new User();
		
		dto.setEmail(request.getParameter("email"));
		dto.setNm(request.getParameter("nm"));
		dto.setPw(request.getParameter("pw"));
		
		int result = UserDao.insert(dto);
		
		if(result == 1) {
			response.sendRedirect("/Login");
		} else {
			request.setAttribute("err_msg", "이미 사용중인 email입니다.");
			doGet(request, response);
		}
		
	}

}
