package org.zerock.myapp.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zerock.myapp.domain.SampleDTO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//@Controller("sampleController") // 클래스의 첫문자만 소문자로 쓰는것이 관례 - 굳이 지정하지 않음  

@Log4j2
@NoArgsConstructor

@RequestMapping("/sample/") // base request uri
@Controller
public class SampleController {

//	// -------------------------------------------//
//	// 1. @RequestMapping or @RequestMapping("")
//	// -------------------------------------------//
//
//	@RequestMapping("uri1")  // base uri를 /로 끝내면 상세 url에 /를 넣지 않아도 되고, 설령 겹치더라도 결과는 같다.

//	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseStatus(HttpStatus.OK) // 응답문서의 상태코드
	@RequestMapping // 상세 uri가 없는 상태로 요청이 들어오면 이 메소드가 처리 (/sample/)
	public String basic() {
		log.debug("basic() invoked.");

		return "sample"; // 뷰의 이름이 된다.
	} // basic

	// -------------------------------------------//
	// 2. @RequestMapping(path, method)
	// -------------------------------------------//
	@ResponseStatus(HttpStatus.OK) // 응답문서의 상태코드
	@RequestMapping(
//			path = { "/basicGet" }, // ---> /WEB-INF/views/sample/basicGET.jsp
//											// base uri가 없으면 /WEB-INF/views/basicGET.jsp
//			method = { RequestMethod.GET } // HTTP method (GET,POST,PUT,DELETE ,...)가 열거상수로 정의되어있다.

//			path="/basicGet",	   // ---> /WEB-INF/views/sample/basicGET.jsp
//			method=RequestMethod.GET

//			path= {"/basicGet1", "/basicGet2"},
//			method = {RequestMethod.GET, RequestMethod.POST}

			path = "basicGet"
	// method를 지정하지 않으면 종류를 따지지 않음
	)
	public String basicGet() {
		log.debug("basicGet() invoked.");

		return "sample"; // 중요: 이 메소드가 반환하는 문자열이 곧 view의이름이 된다(*******) : servlet-context.xml 참고

	} // basicGet

	@RequestMapping(path = "basicGetPost", method = { GET, POST } // import static 활용
	)
	public String basicGetPost() {
		log.debug("basicGetPost() invoked.");

		return "sample";

	} // basicGetPost

	// -------------------------------------------//
	// 3. @RequestMapping의 단축형 - @GetMapping(path)
	// -------------------------------------------//

	@ResponseStatus(HttpStatus.OK) // 내가 응답코드를 정할 수 있다.
	@GetMapping("basicOnlyGet") // GET방식의 MAPPING이라면 이 단축형 어노테이션을 활용한다.
	public String basicOnlyGet() {
		log.debug("basicOnlyGet() invoked.");

		return "sample";

	} // basicOnlyGet

	// -------------------------------------------//
	// 4. @RequestMapping의 단축형 - @PostMapping(path)
	// -------------------------------------------//

	@ResponseStatus(HttpStatus.OK) // 내가 응답코드를 정할 수 있다.
	@PostMapping("basicOnlyPost") // POST방식의 MAPPING이라면 이 단축형 어노테이션을 활용한다.
	public String basicOnlyPost() {
		log.debug("basicOnlyPost() invoked.");

		return "sample";

	} // basicOnlyPost

	// -------------------------------------------//
	// 5. GetMapping(path) with DTO parameter
	// -------------------------------------------//
	@ResponseStatus(HttpStatus.OK)

	@GetMapping("ex01")
//	public String ex01(String name, Integer age, Integer age2) { // 전송파라미터는 Wrapper타입으로 받자. 
	// 기본파라미터를 쓴 경우 데이터가 들어오지않으면 오류 발생
	public String ex01(SampleDTO dto) { 
		
		// 전송파라미터를 필드로 갖는 DTO클래스를 만들고, setter메소드를 통해 전송파라미터를 가져온다. 
		// Spring에서는 전송파라미터를 수집하기 위한 DTO 객체를 Spring Command Object라고 한다. DTO패턴인 동시에 Command 패턴이다.
		// 이 Command Object는, Spring MVC가 최종적으로 view(JSP)를 호출할 때,
		// 동적인 문서를 생성할 수 있도록, Request Scope 공유영역에 자동으로 속성 바인딩(setAttribute)
		// command object로 파라미터를 수집하면, 첫글자만 소문자로 바꿔서 바인딩한다.
		log.debug("ex01(dto) invoked.");

//		log.info("\t + name: " + name);
//		log.info("\t+ age: " + age);
//		log.info("\t+ age2: " + age2);

		log.info("\t dto: " + dto);

		return "sample";
	} // ex01
	
	// -------------------------------------------//
	// 6. GetMapping(path) with some primitive types's parameters
	// -------------------------------------------//
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("ex02")
//	public String ex02(String name, Integer age) {
//		log.debug("ex02(name, age) invoked.");
//		
//		log.info("\t + name: " + name);
//		log.info("\t+ age: " + age);
//	
//		return "sample";
//	} // ex02
	
	public String ex02(
			@RequestParam("name") String recvName, // 매개변수와 전송파라미터의 이름이 다를 때, 이 어노테이션을 활용한다. 
			@RequestParam("age") Integer currentAge) {
		log.debug("ex02(name, age) invoked.");
		
		log.info("\t + recvName: " + recvName);
		log.info("\t+ currentAge: " + currentAge);
	
		return "sample";
	} // ex02

	// -------------------------------------------//
	// 7. GetMapping(path) with some List types's parameter
	// -------------------------------------------//
	
	// 하나의 전송파라미터의 이름으로 여러 값이 들어올 수 있다.	 
	@GetMapping("ex02List")
	public String ex02List(@RequestParam("ids") List<String> ids) { // OK
//	public String ex02List(List<String> ids) {  // 오류 발생 
//	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {  //  OK
//	public String ex02List(ArrayList<String> ids) { // 이렇게 하면 전송파라미터의 값을 받지 못한다.
		log.debug("ex02List(ids) invoked.");
		
		log.info("\t + ids: " + ids);
		log.info("\t+ type: " + ids.getClass().getName());
	
		return "sample";
	} // ex02
	
} // end class
