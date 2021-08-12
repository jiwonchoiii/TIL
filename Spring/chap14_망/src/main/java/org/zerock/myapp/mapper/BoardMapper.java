package org.zerock.myapp.mapper;

import java.util.List;

import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.domain.Criteria;


// tbl_board 테이블의 목록 + CRUD 메소드를 선언
public interface BoardMapper {
	

//	@Select("SELECT /*+ index(tbl_board) */ * FROM tbl_board WHERE bno > 0")
//	@Select("SELECT /*+ index(tbl_board pk_board) */ * FROM tbl_board WHERE bno > 0")
//	@Select("SELECT /*+ index_asc(tbl_board) */ * FROM tbl_board WHERE bno > 0")
//	@Select("SELECT /*+ index_desc(tbl_board) */ * FROM tbl_board WHERE bno > 0")
	public abstract List<BoardVO> getList(); // 게시판 목록 조회
	public abstract List<BoardVO> getListWithPaging(Criteria cri); // 페이징 처리된 게시판 목록 조회
	
	public abstract Integer insert(BoardVO board); // 새로운 게시글 등록
	public abstract Integer insertSelectKey(BoardVO board); // // 새로운 게시글 등록 + 생성한 PK값을 획득
	
	public abstract BoardVO read(Integer bno);  // 특정 게시글 조회
	
	public abstract Integer delete(Integer bno); // 특정 게시글 삭제
	
	public abstract Integer update(BoardVO board); // 특정 게시글 수정

	public abstract Integer getTotalCount(Criteria cri); // 게시판의 총 레코드 건수 얻기
} // end interface
