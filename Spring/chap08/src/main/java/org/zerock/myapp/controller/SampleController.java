package org.zerock.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//@Controller("sampleController") // 클래스의 첫문자만 소문자로 쓰는것이 관례 - 굳이 지정하지 않음  

@Log4j2
@NoArgsConstructor

@RequestMapping("/sample/*")
@Controller
public class SampleController {
	
	//-------------------------------------------//
	// 1. @RequestMapping or @RequestMapping("")
	//-------------------------------------------//

//	@RequestMapping("uri1")  // baseuri를 /로 끝내면 상세 url에 /를 넣지 않아도 되고, 설령 겹치더라도 결과는 같다.
	@RequestMapping  // 상세uri가 없는 상태로 요청이 들어오면 이 메소드가 처리 (/sample/)
	public String basic1() {
		log.debug("basic1() invoked.");
		
		return "basic1";
	} // basic1
	
} // end class
