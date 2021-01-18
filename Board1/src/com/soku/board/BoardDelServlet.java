package com.soku.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soku.board.dao.BoardDAO;
import com.soku.board.model.BoardEntity;

@WebServlet("/del")
public class BoardDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str_id = request.getParameter("i_board");
		int i_board = Integer.parseInt(str_id);
		
		BoardEntity param = new BoardEntity();
		param.setI_board(i_board);

		// TODO 삭제처리
		BoardDAO.delBoard(param);
		
		response.sendRedirect("/list");
	}

}
