package command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.DTO;


public class joinCmd implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		DTO dto = new DTO();
		dto.setEmail(request.getParameter("email"));
		dto.setPw(request.getParameter("pw"));
		dto.setConfirm_pw(request.getParameter("confirm_pw"));
		dto.setUser_nm(request.getParameter("user_nm"));
		dto.setGender(request.getParameter("gender"));
		dto.setD_birth(request.getParameter("birth"));
		dto.setAddr(request.getParameter("addr"));
		dto.setP_number(request.getParameter("p_number"));
		
		request.setAttribute("result", DAO.insert(dto));


	}

}
