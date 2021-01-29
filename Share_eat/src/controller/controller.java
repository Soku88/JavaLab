package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import command.joinCmd;
import command.loginCmd;

@WebServlet("*.do")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("-----doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("-----doPost");
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("-----actionDo");

		String viewPage = null;
		Command cmd = null;

		String uri = request.getRequestURI();

		// Join
		if (uri.equals("/join.do")) {
			cmd = new joinCmd();
			cmd.execute(request, response);
			viewPage = "/WEB-INF/jsp/logic/join.jsp";
		} else if (uri.equals("/view_join.do")) {
			viewPage = "/WEB-INF/jsp/view/view_join.jsp";

		// login
		} else if (uri.equals("/login.do")) {
			cmd = new loginCmd();
			cmd.execute(request, response);
			viewPage = "/WEB-INF/jsp/logic/login.jsp";
		} else if (uri.equals("view_login.do")) {
			viewPage = "/WEB-INF/jsp/view/view_login";

		// main
		} else if (uri.equals("/main.do")) {
			viewPage = "/WEB-INF/jsp/logic/main.jsp";
		}
		
		if (viewPage == null) {
			response.sendRedirect("/");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
	}
}
