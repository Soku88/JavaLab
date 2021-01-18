package com.soku.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soku.board.dao.BoardDAO;
import com.soku.board.model.BoardDTO;
import com.soku.board.model.BoardEntity;

@WebServlet("/list")
public class BoardListServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strPage = request.getParameter("page");
		int page = strPage == null ? 1 : Integer.parseInt(strPage);
		
		int rowCnt = 5;
		BoardDTO param = new BoardDTO();
		
		param.setRowCountPerPage(5);
		param.setStartIdx(rowCnt * (page - 1)); 
		
		request.setAttribute("page", page);
		
		request.setAttribute("pageLength", BoardDAO.selMaxPageLength(param));
		request.setAttribute("list", BoardDAO.selBoardList(param));
		
		String jsp = "WEB-INF/JSP/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
