package com.koreait.sboard;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.koreait.sboard.model.BoardEntity;

//Component와 동일하나 의미가 명확하다
//Service : logic 담당, 실제 수행되는 메서드	
@Service 
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<BoardEntity> selBoardList() {
		return mapper.selBoardList();
	}
	
	public BoardEntity selBoard(BoardEntity param) {
		return mapper.selBoard(param);
	}
	
	public int insBoard(BoardEntity param) {
		return mapper.insBoard(param);
	}

	public int delBoard(BoardEntity param) {
		return mapper.delBoard(param);
	}
	
	public int updBoard(BoardEntity param) {
		return mapper.updBoard(param);
		
	}


}
