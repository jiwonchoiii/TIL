package org.zerock.myapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@Controller

@RequestMapping("/return/")
public class ReturnTypesController {
	
	//-------------------------------------//
	// 1. void return type : Request URI가 view의 이름이 된다 
	//-------------------------------------//
	
	@GetMapping("void")
	public void returnVoid() {
		log.debug("returnVoid() invoked.");
		
		//=> /WEB-INF/views/ + return/void + .jsp
		//return값이 없으면 base uri + 상세 uri로 지정된다
		
	} // returnVoid
	
	//-------------------------------------//
	// 2. String return type : Redirect
	//-------------------------------------//
	
	@PostMapping("redirect")
	public RedirectView returnRedirect() {
		log.debug("returnRedirect() invoked.");
		
	
		return new RedirectView("return/void");
	} // returnRedirect
	
	//-------------------------------------//
	// 3. String return type : "forward:" keyword
	//-------------------------------------//
	
	@GetMapping("forward")
	public String returnForward(HttpServletRequest request) {
		log.debug("returnForward() invoked.");
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/return/void.jsp");
		return "forward:/WEB-INF/views/return/void.jsp";
		
	} // returnForward
	
	

} // end class
