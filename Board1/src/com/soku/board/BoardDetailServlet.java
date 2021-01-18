package com.soku.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soku.board.dao.BoardDAO;
import com.soku.board.model.BoardEntity;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str_id = request.getParameter("i_board");
		int i_board = Integer.parseInt(str_id);

		System.out.println("i_board : " + i_board);
		
		BoardEntity bo = new BoardEntity();
		bo.setI_board(i_board);
		request.setAttribute("bo", BoardDAO.selBoard(bo));
		

		String jsp = "WEB-INF/JSP/detail.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

}
