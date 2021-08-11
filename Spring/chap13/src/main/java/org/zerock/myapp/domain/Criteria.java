package org.zerock.myapp.domain;

import lombok.Data;

// 페이징 처리를 위해, 기준값을 저장하는 용도의 클래스
// 그리고 이 기준 클래스를 앞으로 만들 DTO 클래스에서 사용하자

@Data
public class Criteria {

	private int currPage = 1;
	private int amount = 10;
} // end class
