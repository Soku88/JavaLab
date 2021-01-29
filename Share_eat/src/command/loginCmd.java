package command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO;
import model.DTO;

public class loginCmd implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		DTO dto = new DTO();
		dto.setEmail(request.getParameter("email"));
		dto.setPw(request.getParameter("pw"));
		
		DTO data = DAO.selUserList(dto);
		
		if(data != null) {
			HttpSession session = request.getSession();
			session.setAttribute("current_user", data);
			try {
				response.sendRedirect("/main.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
