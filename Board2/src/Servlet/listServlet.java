package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Model;

@WebServlet("/list")
public class listServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Model> data = DAO.selBoardList();
		request.setAttribute("list", data);
		
		String jsp = "/WEB-INF/JSP/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);	
	}

}
