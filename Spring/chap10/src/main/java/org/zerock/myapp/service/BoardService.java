package org.zerock.myapp.service;

import java.util.List;

import org.zerock.myapp.domain.BoardVO;

public interface BoardService {
	
	// 비즈니스 로직 관점에서 메소드이름을 지은 경우
	
	public abstract List<BoardVO> getList(); // 게시판 목록조회
	public abstract boolean register(BoardVO board); // 새로운 게시글 등록
	public abstract boolean modify(BoardVO board); // 기존 게시글 수정
	
	// 특정 게시글의 번호만 알면 삭제,조회할 수 있다
	public abstract boolean remove(Integer bno); // 기존 게시글의 삭제
	public abstract BoardVO get(Integer bno); // 기존 게시글의 상세조회 

} // end interface
