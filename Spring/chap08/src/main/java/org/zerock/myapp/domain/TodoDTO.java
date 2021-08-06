package org.zerock.myapp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data

public class TodoDTO {
	
	private String title; // title  이름의 전송파라미터 값을 여기에 넣어달라
	
	
//	@DateTimeFormat(pattern="yyyy/MM/dd")
	@DateTimeFormat(iso=ISO.DATE)
	private Date dueDate; // dueDate 이름의 전송파라미터 값을 여기에 넣어달라

} // end class
