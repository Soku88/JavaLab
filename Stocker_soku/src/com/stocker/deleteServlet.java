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

@WebServlet("/delete")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		User data = (User) request.getSession().getAttribute("c_user");

		User dto = new User();
		dto.setId(data.getId());
		UserDao.delete(dto);

		if (UserDao.delete(dto) != 1) {
			session.invalidate();
			response.sendRedirect("/Signup");
		} else {
			response.sendRedirect("/Mypage");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
