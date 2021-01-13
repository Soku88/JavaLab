package com.soku.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soku.board.dao.BoardDAO;
import com.soku.board.model.BoardEntity;

@WebServlet("/list")
public class BoardListServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		List<BoardEntity> list = BoardDAO.selBoardList();
		request.setAttribute("list", BoardDAO.selBoardList());
		
		String jsp = "WEB-INF/JSP/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
