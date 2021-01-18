package com.soku.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soku.board.dao.BoardDAO;
import com.soku.board.model.BoardEntity;

@WebServlet("/update")
public class BoardUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);

		BoardEntity param = new BoardEntity();
		param.setI_board(i_board);
		request.setAttribute("update", BoardDAO.selBoard(param));

		String jsp = "WEB-INF/JSP/update.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");

		BoardEntity vo = new BoardEntity();
		vo.setI_board(i_board);
		vo.setTitle(title);
		vo.setCtnt(ctnt);

		request.setAttribute("update", BoardDAO.updBoard(vo));
		
		response.sendRedirect("/detail?i_board=" + strI_board);

	}

}
