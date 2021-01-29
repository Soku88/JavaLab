package com.stocker;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stocker.DAO.UserDao;
import com.stocker.Model.User;

@WebServlet("/Login")
public class P_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("page", "Login");
		request.getRequestDispatcher("/WEB-INF/JSP/template/template.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User dto = new User();
		dto.setEmail(request.getParameter("email"));
		dto.setPw(request.getParameter("pw"));

		User data = UserDao.selUserList(dto);

		if (data != null) {
			HttpSession session = request.getSession();
			session.setAttribute("c_user", data);
			response.sendRedirect("/");
		} else {
			request.setAttribute("err_msg", "email 혹은 password를 확인해 주세요.");
			doGet(request, response);
		}

	}

}
