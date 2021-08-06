package org.zerock.myapp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.myapp.domain.SampleDTO;

import com.google.gson.Gson;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Controller

@RequestMapping("/return/")
public class ReturnTypesController {

	// -------------------------------------//
	// 1. void return type : Request URI가 view의 이름이 된다
	// -------------------------------------//

	@GetMapping("void")
	public void returnVoid() {
		log.debug("returnVoid() invoked.");

		// => /WEB-INF/views/ + return/void + .jsp
		// return값이 없으면 base uri + 상세 uri로 지정된다

	} // returnVoid

	// -------------------------------------//
	// 2-1. String return type : Redirect
	// -------------------------------------//

	@PostMapping("redirect")
	public String returnRedirect() {
		log.debug("returnRedirect() invoked.");

//		return "redirect:/return/void";
//		return "redirect:void";
		return "redirect:http://localhost:8007";
	} // returnRedirect

//	@PostMapping("redirect")
//	public RedirectView returnRedirect() {
//		log.debug("returnRedirect() invoked.");
//		
//	
//		return new RedirectView("return/void");
//	} // returnRedirect

	// -------------------------------------//
	// 2-2. String return type : "forward:" keyword
	// -------------------------------------//

	@GetMapping("forward")
	public String returnForward() {
		log.debug("returnForward() invoked.");

		// 외부에서는 어떤 jsp도 직접 요청하지 못하게 하고, mvc흐름대로 jsp를 요청할 수 있도록 jsp파일을 WEB-INF 폴더에 둔다
//		return "forward:/WEB-INF/views/return/void.jsp"; 
//		return "forward:/return/void";
		return "forward:http://localhost:8007";
		// redirection은 완전히 다른 사이트로 요청을 다시 보내도록 하는게 가능
		// forwarding은 완전히 다른 사이트로 나머지 처리를 위임시킬 수 없다. 같은 컨테이너의 다른 컴포넌트끼리만 가능하다.
		// 같은 컨테이너안에서 찾기때문에 uri를 지정해도 앞에 루트를 붙여버린다.

	} // returnForward

	// -------------------------------------//
	// 3. Object return type Using
	// -------------------------------------//
	//To return JSON format document
	
	@PostMapping("ResponseBody")
	public  @ResponseBody  SampleDTO returnResponseBody(
		// ResponseBody에 DTO객체를 json으로 변환시키고, json문자열을 담아서 보낼 때 쓰는 어노테이션
		@NonNull @RequestParam("name") String NAME, 
		@NonNull @RequestParam("age") Integer AGE) {
		
		log.debug("returnResponseBody(name,age) invoked.");
		
		SampleDTO dto = new SampleDTO();
		
	      dto.setName(NAME);
	      dto.setAge(AGE);
	      
	      log.info("\t+ dto : " + dto);


		return dto;
	} // returnResponseBody
	
	
	// -------------------------------------//
	// 4. Object return type Using @ResponseEntity
	// -------------------------------------//
	//To return JSON format document including User-defined HEADERS and BODY, HTTP status
	
	@PostMapping("/ResponseEntity")
	public ResponseEntity<String> returnResponseEntity(){
		log.debug("returnResponseEntity() invoked.");
		
		
		// JSON: JavaScript Object Notation
		// JSON객체를 문자열로 표기
//		String json = "{\"name\":\"jiwon\",\"age\":28}";
		
		// Escape Character(\)
		
		// -------------------------------------//
		// Using Gson library
		// -------------------------------------//
			SampleDTO dto = new SampleDTO();
			dto.setName("jiwon");
			dto.setAge(28);
				
			Gson gson = new Gson();
			String json = gson.toJson(dto);

		
		log.info("\t + json: " + json);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf8");
		
		return new ResponseEntity<>(json,headers,HttpStatus.OK);
		
	} // returnResponseEntity

} // end class
