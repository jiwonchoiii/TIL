package org.zerock.myapp.service;

import java.util.List;

import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.domain.Criteria;



public interface BoardService {
	
	
	public abstract boolean register(BoardVO board);
	public abstract boolean modify(BoardVO board);
	public abstract boolean remove(Integer bno);
	
	public abstract BoardVO get(Integer bno);
	
	public abstract List<BoardVO> getList();
	public abstract List<BoardVO> getListPerPage(Criteria cri);
	
	public abstract int getTotal(Criteria cri);

} // end interface
