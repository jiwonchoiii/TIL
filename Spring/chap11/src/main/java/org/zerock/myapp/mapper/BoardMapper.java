package org.zerock.myapp.mapper;

import java.util.List;

import org.zerock.myapp.domain.BoardVO;



public interface BoardMapper {
	

//	@Select("SELECT /*+ index(tbl_board) */ * FROM tbl_board WHERE bno > 0")
//	@Select("SELECT /*+ index(tbl_board pk_board) */ * FROM tbl_board WHERE bno > 0")
//	@Select("SELECT /*+ index_asc(tbl_board) */ * FROM tbl_board WHERE bno > 0")
//	@Select("SELECT /*+ index_desc(tbl_board) */ * FROM tbl_board WHERE bno > 0")
	public abstract List<BoardVO> getList();
	
	public abstract int insert(BoardVO board);
	public abstract int insertSelectKey(BoardVO board);
	
	public abstract BoardVO read(Integer bno);
	
	public abstract int delete(Integer bno);
	
	public abstract int update(BoardVO board);

} // end interface
