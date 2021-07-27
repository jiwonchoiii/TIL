package org.zerock.myapp.sample;

import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
//@ToString
//@NoArgsConstructor

@Component("chef") // beans 컨테이너에 등록하는 annotation. 
				   // 등록될 때 이름: 소문자로 시작하고 카멜기법을 따른다
				   // 이름을 짓지않으면 클래스의 첫문자를 소문자로 바꿔서 넣는다
//@Component
public class Chef { // POJO
	public Chef() {
		log.debug("default constructor invoked.");
	} // default constructor
} // end class 
