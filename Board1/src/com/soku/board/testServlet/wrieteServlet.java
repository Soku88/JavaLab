package com.soku.board.testServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soku.board.model.BoardEntity;
import com.soku.board.test.DAO;

@WebServlet("/C")
public class wrieteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jsp = "WEB-INF/JSP2/write.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.println(title);
		System.out.println(ctnt);
		
		BoardEntity vo = new BoardEntity();	
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		DAO.insText(vo);
	
	}

}
