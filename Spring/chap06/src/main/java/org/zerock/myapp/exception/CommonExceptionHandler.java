package org.zerock.myapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j2;


@Log4j2

//예외처리용 클래스가 되기 위해 필요한 어노테이션  
//@ControllerAdvice(
//		basePackages= {"org.zerock.myapp.controller"}
//		) 
// 특정 패키지에서 발생한 오류만 처리하겠다면 basePackages 지정.  
@ControllerAdvice // For all packages
// basePackages는 기본 속성이기 때문에 속성명 생략 가능

public class CommonExceptionHandler { 
	
	//이 어노테이션이 붙으면 예외처리용 메소드가 된다
	// Class<? extends Throwable>[] : 최상위 예외클래스와 그 자식클래스 타입의 clazz객체를 담는 배열
//	@ExceptionHandler(BindException.class) // 처리하고싶은 특정예외를 지정한다. 
//	@ExceptionHandler({BindException.class, NullPointerException.class})
//	public String handleXXXXException() { 		
//	
//	} // handleXXXXException
	

	// To determine HTTP status code of the response.
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(NoHandlerFoundException.class)
	public String handleNoHandlerFoundException(Exception e, Model model) {
		log.debug("handleNoHandlerFoundException(e,model) invoked.");
		
		log.error("1. Exception Type: "+ e.getClass().getName());
		log.error("2. Exception Message: "+ e.getMessage());
		
		model.addAttribute("exception",e);
		
		return "errorPage"; // return 문자열이 view의 이름
		
	} // handleNoHandlerFoundException
	
	@ExceptionHandler(BindException.class)
	public String handleBindException(Exception e, Model model) {
		log.debug("handleBindException(e,model) invoked.");
		
		log.error("1. Exception Type: "+ e.getClass().getName());
		log.error("2. Exception Message: "+ e.getMessage());
		
		model.addAttribute("exception",e);
		
		return "errorPage"; // return 문자열이 view의 이름

	} // handleBindException
	
	// Exception.class로 지정하면 모든 예외를 처리하지만, 예외마다 처리 로직이 다르므로 구체적으로 지정하는 것이 좋다. 
	@ExceptionHandler(IllegalStateException.class)
	public String handleIllegalStateException(Exception e, Model model) {
		log.debug("handleIllegalStateException(e,model) invoked.");
		
		log.error("1. Exception Type: "+ e.getClass().getName());
		log.error("2. Exception Message: "+ e.getMessage());
		
		model.addAttribute("exception",e);
		
		return "errorPage"; // return 문자열이 view의 이름

	} // handleIllegalStateException
	
	
	
} // end class
