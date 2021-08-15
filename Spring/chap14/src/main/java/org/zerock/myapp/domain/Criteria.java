package org.zerock.myapp.domain;

import lombok.Data;

// 페이징 처리를 위해, 기준값을 저장하는 용도의 클래스
// 그리고 이 기준 클래스를 앞으로만들 DTO 클래스에서 사용하자!!!

@Data
public class Criteria {
	
	private int currPage = 1;		// 현재 보고자 하는 페이지 번호
	private int amount = 10;		// 한 페이지당 보여줄 레코드 건수
	private int pagesPerPage = 10;	// 각 페이지 아래에 보여줄 페이지번호의 갯수
	

} // end class
