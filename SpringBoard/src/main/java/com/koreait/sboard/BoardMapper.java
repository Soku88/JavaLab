package com.koreait.sboard;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.koreait.sboard.model.BoardEntity;

@Mapper
public interface BoardMapper {
	List<BoardEntity> selBoardList();
	int insBoard(BoardEntity param);
	BoardEntity selBoard(BoardEntity param);
	int delBoard(BoardEntity param);
	int updBoard(BoardEntity param);

}
