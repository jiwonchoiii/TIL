package org.zerock.myapp.domain;

import lombok.Data;

// DTO pattern: 웹3계층에서 앞쪽계층(Presentation, 화면)에서 요청문서안에 포함시킨
// 				전송파라미터(request parameter)를 수신하고, 웹3계층의 뒷계층으로 전달하는 목적의 객체가 DTO 객체이다.

@Data
public class SampleDTO {

	
	private String name;
	private Integer age;

	
} // end class
