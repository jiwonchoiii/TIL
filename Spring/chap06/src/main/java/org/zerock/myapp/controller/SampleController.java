package org.zerock.myapp.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.zerock.myapp.domain.SampleDTO;
import org.zerock.myapp.domain.SampleDTOList;
import org.zerock.myapp.domain.TodoDTO;

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
		// Spring에서는 전송파라미터를 수집하기 위한 DTO 객체를 Spring Command Object라고 한다. DTO패턴인 동시에
		// Command 패턴이다.
		// 이 Command Object는, Spring MVC가 최종적으로 view(JSP)를 호출할 때,
		// 동적인 문서를 생성할 수 있도록, Request Scope 공유영역에 자동으로 속성 바인딩(setAttribute)
		// command object로 파라미터를 수집하면, 첫글자만 소문자로 바꿔서 바인딩한다.
		// DTO 객체의 목적: 전송파라미터(request parameter)를 수신하고, 웹3계층의 뒷계층으로 전달
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

	public String ex02(@RequestParam("name") String recvName, // 매개변수와 전송파라미터의 이름이 다를 때, 이 어노테이션을 활용한다.
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
	public String ex02List(@RequestParam("ids") List<String> ids) { // OK , ArrayList로 구현됨
//	public String ex02List(List<String> ids) {  // 오류 발생 
//	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {  //  OK
//	public String ex02List(ArrayList<String> ids) { // 이렇게 하면 전송파라미터의 값을 받지 못한다.
		log.debug("ex02List(ids) invoked.");

		log.info("\t + ids: " + ids);
		log.info("\t+ type: " + ids.getClass().getName());

		return "sample";
	} // ex02

	// -------------------------------------------//
	// 8. GetMapping(path) with Array types's parameter
	// -------------------------------------------//

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
//	public String ex02Array(String[] ids) {		
		log.debug("ex02Array(ids) invoked.");

		log.info("\t: " + Arrays.toString(ids));
		return "sample";
	} // ex02Array

	// -------------------------------------------//
	// 9. GetMapping(path) with DTO List types's parameter
	// -------------------------------------------//

	// ex02Bean?list[0].name=NAME_1&list[0].age=1&list[1].name=NAME_2&list[1].age=2
	// 쿼리스트링으로 list객체를 만들어서 보낼 수 있다. 거의 쓰진 않지만....
	// 쿼리스트링에는 대괄호를 쓸 수 없다. 따라서 아래처럼 쓴다. (URL Encoding) [ ==> %5B, ] ==> %5D
	// ex02Bean??list%5B0%5D.name=NAME_1&list%5B0%5D.age=1&list%5B1%5D.name=NAME_2&list%5B1%5D.age=2
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.debug("ex02Bean() invoked.");

		return "sample";
	} // ex02Bean

	// -------------------------------------------//
	// 10. @InitBinder --> 쓸 필요없다.
	// -------------------------------------------//

//	@InitBinder    
//	public void initBinder(WebDataBinder binder) {
//		log.debug("initBinder(binder) invoked.");
//
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//		binder.registerCustomEditor(
//				java.util.Date.class, 
//				new CustomDateEditor(dateFormat, false)
//				); // registerCustomEditor
//	} // initBinder

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("ex03")
	public String ex03(TodoDTO dto) {
		log.debug("ex03(dto) invoked.");

		log.info("\t dto: " + dto);

		return "sample";

	} // ex03

	// -------------------------------------------//
	// 11. Predefined Model parameter
	// -------------------------------------------//

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("ex05")
	public String ex05(String name, Integer age, Integer page, Model model) {
		// name, age는 dto객체의 필드이므로 command object로 데이터를 수집할 수 있다. 굳이 model을 사용하지 않아도 된다.
		// model의 원래 용도는 DTO를 넣는 것이 아니라, 비즈니스 로직의 결과 데이터를 넣는 것이다.
		// 비즈니스 로직의 결과로 DTO객체(전송파라미터)를 넣긴 하지만 그것이 주 목적은 아니다. 모든 타입의 데이터를 넣을 수 있다.

		log.debug("ex05(name,age,page) invoked.");

		log.info(String.format("\t+ name: %s, name: %d, page: %d", name, age, page));

		log.info("\t+ model: " + model.getClass().getName());

		SampleDTO dto = new SampleDTO();
		dto.setName(name);
		dto.setAge(age);

		// 결과데이터를 Model 객체에 전달하면 공유영역인 requestScope에 넣어서 view를 호출할 때 같이 나간다.
		// - addAttribute 메소드 사용.
		// model은 Map객체이므로 key-value쌍으로 속성을 추가한다.
		// model을 매개변수에 넣으면 dispatcher servlet이 만들어서 넣어준다.
		model.addAttribute("sampleDTO", dto); // requestScope에 속성바인딩
		model.addAttribute("page", page); // requestScope에 속성바인딩

		return "sample";

	} // ex05

	// -------------------------------------------//
	// 12. @ModelAttribute(key) 괄호 안에 속성이름을 넣으면, model이라는 상자 안에 넣어준다.
	// 지정된 이름으로 requestScope에 속성바인딩
	// -------------------------------------------//

//	@ResponseStatus(HttpStatus.OK)
//	@PostMapping("ex06")
//	public String ex06(SampleDTO dto, @ModelAttribute("page") Integer page) {
//		log.debug("ex06(dto) invoked.");
//		
//		log.info("\t+ dto: " + dto);
//		log.info("\t+ page: " + page); // dto객체에 없는 전송파라미터 - 공유영역에 없다. 어노테이션을 붙이면 공유영역에 바인딩됨.
//		
//		
//		return "sample";
//	} // ex06

	@ResponseStatus(HttpStatus.OK)
	@PostMapping("ex06")
	@ModelAttribute // 메소드에도 붙이면 return된 view의 이름도 바인딩된다. return값이 없어서 상세 uri가 view의 이름이 된다.
	public String ex06(SampleDTO dto, Integer page) {
		log.debug("ex06(dto) invoked.");

		log.info("\t+ dto: " + dto);
		log.info("\t+ page: " + page); // dto객체에 없는 전송파라미터 - 공유영역에 없다. 어노테이션을 붙이면 공유영역에 바인딩됨.

		return "sample";
	} // ex06

	// -------------------------------------------//
	// 13. Predefined RedirectAttributes
	// to redirect request into the other url.
	// -------------------------------------------//

//	@ResponseStatus(HttpStatus.OK) redirection 하려면 301,302여야하는데 200으로 정해버리면 redirect 수행X
	@GetMapping("ex07")
	public RedirectView ex07(String name, Integer age, RedirectAttributes rttrs) {
		log.debug("ex07(rttrs) invoked.");

		// RedirectAttributes: Redirection을 위한 상자.
		// 1. added flash attributes into the header
		// "Referer: http://localhost:8090/sample/ex07?name=jiwon&age=28"
		
		log.info(String.format("\t+ name: %s, age: %d", name,age));
		log.info("\t rttrs: " + rttrs.getClass().getName());
		
//		rttrs.addFlashAttribute("name", name); // 일회성 - 한번쓰면 없어진다. 스프링5에선 없어짐
//		rttrs.addFlashAttribute("age", age);
		
		//---------------------------------------//
		
		// 2. added flash attributes into the request line and Referer header:
		// GET / ?name=jiwon&age=28 HTTP/1.1
		// Referer: http://localhost:8090/sample/ex07?name=jiwon&age=28
		
		 rttrs.addAttribute("name",name);
		 rttrs.addAttribute("age",age);

//		return "redirect:http://localhost:8070/"; // 예전방식
//		return "redirect:/sample/ex01"; 
		return new RedirectView("/sample/ex01"); // 새로운 방식
//		return new RedirectView("http://localhost:8070/"); // 새로운 방식

	} // ex07
	
} // end class
