package org.zerock.myapp.mapper;

import java.util.List;

import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.domain.Criteria;


// tbl_board 테이블의 목록 + CRUD 메소드를 선언
public interface BoardMapper {
	
	public abstract List<BoardVO> getList();	// 게시판 목록조회
	public abstract List<BoardVO> getListWithPaging(Criteria cri);	// 페이징처리된 게시판 목록조회
	
	public abstract BoardVO read(Integer bno);	// 특정 게시글 조회
	public abstract int delete(Integer bno);	// 특정 게시글 삭제
	
	public abstract int insert(BoardVO board);  // 새로운 게시글 등록
	public abstract int insertSelectKey(BoardVO board);	// 새로운 게시글 등록 + 생성한 PK값을 획득
	
	public abstract int update(BoardVO board);	// 특정 게시글 수정
	
	public abstract int getTotalCount(Criteria cri);	// 게시판의 총 레코드 건수 얻기

} // end class
