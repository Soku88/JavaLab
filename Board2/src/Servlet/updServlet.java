package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Model;

@WebServlet("/upd")
public class updServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);

		Model data = new Model();
		data.getI_board();

		request.setAttribute("data", DAO.selBoard(data));

		String jsp = "/WEB-INF/JSP/update.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");

		Model data = new Model();
		data.setI_board(i_board);
		data.setTitle(title);
		data.setCtnt(ctnt);

		request.setAttribute("data", DAO.updBoard(data));
		
		response.sendRedirect("/detail?i_board=" + strI_board);

	}

}
