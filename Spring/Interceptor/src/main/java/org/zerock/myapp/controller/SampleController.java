package org.zerock.myapp.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/sample/")
@Controller
public class SampleController {

////	@ResponseStatus(HttpStatus.OK)
//	@GetMapping("doA")
//	public void doA(
//			// Spring MVC에서는 Controller의 메소드(즉, handler)가
//			// Servlet/JSP의 request, response, session 객체를
//			// 직접 핸들링 하는 것을 권장하지 않음 
//			HttpServletRequest req, 
//			HttpServletResponse res, 
//			HttpSession session) {
//		log.debug("doA({},{},{}) invoked.", req, res, session);
//		
//	} // doA
	
//	@ResponseStatus(HttpStatus.OK)
	@GetMapping("doA")
	public String doA(Locale locale, Model model) {
		log.debug("doA() invoked.");
		
		log.debug("\t+ locale: {}, type: {}", locale, locale.getClass().getName());
		log.debug("\t+ model: {}, type: {}", model, model.getClass().getName());
		log.info("");

		model.addAttribute("serverTime","/sample/doA");
		
		return "home";
		
	} // doA
	
//	@ResponseStatus(HttpStatus.OK)
	@GetMapping("doB")
	public String doB(Locale locale, Model model) {
		log.debug("doB() invoked.");
		
		model.addAttribute("serverTime","/sample/doB");
		
		Integer.parseInt("삼"); // NumberFormatException 예외발생
		// 컨트롤러 메소드에서 예외가 발생하면 postHandle은 호출되지 않는다.
		// afterCompletion은 발생한다!
		
		return "home";
		
	} // doB
	
//	@ResponseStatus(HttpStatus.OK)
	@GetMapping("doC")
	public String doC(Model model) {
		log.debug("doC() invoked.");
		
		model.addAttribute("serverTime","/sample/doC");
		model.addAttribute("result","OK");
		
		return "home";
	} // doC
	
//	@ResponseStatus(HttpStatus.OK)
	@GetMapping("doD")
	public String doD(Model model) {
		log.debug("doD() invoked.");
		
		model.addAttribute("serverTime","/sample/doD");
		model.addAttribute("result","OK");
		
		return "home";
		
	} // doD
	
} // end class
