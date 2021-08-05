package org.zerock.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.myapp.domain.BoardVO;

public interface BoardMapper {
	
	
	// 비즈니스로직 관점이 아니라, DB 관점에서 메소드이름을 짓는다

	@Select("SELECT \r\n"
			+ "    /*+ index_desc(tbl_board) */ * \r\n"
			+ "FROM tbl_board")
	public abstract List<BoardVO> getList(); // 게시판 목록 조회
	

} // end class
