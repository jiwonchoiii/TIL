package org.zerock.myapp.mapper;

import java.util.List;

import org.zerock.myapp.domain.BoardVO;


// tbl_board 테이블의 목록 + CRUD 메소드를 선언
public interface BoardMapper {
	
	
	// 비즈니스로직 관점이 아니라, DB 관점에서 메소드이름을 짓는다
	// 예를들면 modify라고 하지 않고 update라고 짓는다.

	
//	mapper proxy에게 어떤 sql문인지 알려주기 위해 select 어노테이션을 쓸 수 있다. 
//	하지만 유지보수가 어렵기 때문에 이 방법보다는, mapper xml을 이용하는 것이 좋다.
	
//	@Select("SELECT \r\n"
//			+ "    /*+ index_desc(tbl_board) */ * \r\n"
//			+ "FROM tbl_board")
	public abstract List<BoardVO> getList(); // 게시판 목록 조회
	
	public abstract BoardVO select(Integer bno);// 특정 게시글 조회
		
	// delete메소드의 리턴타입: 삭제여부를 알려줄 필요가 없다면 void, 알려줘야한다면 실제 삭제된 레코드의 수를 알려주기 위해 Integer
	public abstract Integer delete(Integer bno); // 특정 게시글 삭제
	
	public abstract Integer insert(BoardVO board); // 새로운 게시글 등록
	public abstract Integer insertSelectKey(BoardVO board); // 새로운 게시글 등록 + 생성된 pk값을 획득
	
	public abstract Integer update(BoardVO board); // 특정 게시글 수정


} // end class
