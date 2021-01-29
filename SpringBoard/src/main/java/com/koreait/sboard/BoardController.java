package com.koreait.sboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.koreait.sboard.model.BoardEntity;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/")
	public String index(Model model) {
		return "redirect:/list";
	}

	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.selBoardList());
	}

	@GetMapping("/write")
	public void write(BoardEntity param) {
		System.out.println("title : " + param.getTitle());
	}
	
	@PostMapping("/write")
	public String writeProc(BoardEntity param) {
		service.insBoard(param);
		return "redirect:/list";
	}
	
	@GetMapping("/detail")
	public void detail(Model model, BoardEntity param) {
		model.addAttribute("data", service.selBoard(param));
	}
	
	@GetMapping("/del")
	public String delBoard(BoardEntity param) {
		service.delBoard(param);
		return "redirect:list";
	}
	
	@GetMapping("/mod")
	public void mod(Model model, BoardEntity param) {
		model.addAttribute("data", service.selBoard(param));
	}
	
	@PostMapping("/mod")
	public String modProc(BoardEntity param) {
		System.out.println("i_board : " + param.getI_board());
		service.updBoard(param);
		return "redirect:/detail?i_board=" + param.getI_board();
	}


}
