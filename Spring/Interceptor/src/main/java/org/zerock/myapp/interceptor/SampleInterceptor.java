package org.zerock.myapp.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class SampleInterceptor 
	implements HandlerInterceptor {

	//뒤의 컨트롤러의 메소드가 호출되기 전에 수행
	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		log.debug("===================================================");
		log.debug("1. preHandle(request, response, {}) invoked.", handler);
		log.debug("===================================================");
		
		// 1. Action Log남길때 preHandle의 handler 매개변수를 활용한다.
		// 2. 로그인 여부 체크 - 각 메소드에서 모두 로그인 여부를 체크하는 것이 아니라, 
		// 					preHandle에서 체크한다. (안됐으면 리퀘스트 포워딩 등등)
		
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Object beanObj = handlerMethod.getBean(); // 컨트롤러 객체
		Method method = handlerMethod.getMethod(); // 컨트롤러의 메소드 객체
		
		log.info("\t+ handlerMethod: " + handlerMethod);
		log.info("\t+ beanObj: " + beanObj);
		log.info("\t+ method: " + method);
		log.info("");
		
		// request scope에 userinfo란 속성값이 없으면, 로그인화면으로 이동(redirection)
		
		if(request.getAttribute("userinfo") == null) {
			response.sendRedirect("/login.jsp");
			
			return false;
		} else {
			return true;
		} // if-else
		

		// 1. true를 리턴하면, 뒤의 interceptor chain을 수행시키고,
		// interceptor chain이 없다면, 뒤의 컨트롤러 메소드를 수행시킴.
		
		// 2. false를 리턴하면, interceptor chain을 수행시키지 않고,
		// interceptor chain이 없다면 뒤의 컨트롤러 메소드를 수행시키지 않음.
		// 뿐만 아니라, postHandle(), afterCompletion()조차 수행시키지 않음. 

	} // preHandle

	// 뒤의 컨트롤러 메소드 호출이 완료된 후, 그리고 View가 호출되기 전에 수행.
	// 단, 컨트롤러 메소드 수행에서 예외가 발생하지 않아야 수행됨. 
	// 컨트롤러 메소드 수행에서 예외가 발생되면, 이 메소드는 수행되지 않음. 
	@Override
	public void postHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler,
			ModelAndView modelAndView) 
			throws Exception {
		log.debug("===================================================");
		log.debug("2. postHandle(request, response, {}) invoked.", 
				handler.getClass().getName() , 
				modelAndView);
		log.debug("===================================================");

		 //매개변수 handler는 컨트롤러객체가 아니다.  컨트롤러 객체안에 있는 메소드 객체이다.
	} // postHandle

	// 뒤의 컨트롤러 메소드 수행시, 예외의 발생여부와 상관없이, View까지 호출된 후에 수행 
	@Override
	public void afterCompletion(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler, 
			Exception e)
			throws Exception {
		log.debug("===================================================");
		log.debug("3. afterCompletion(request, response, {}) invoked.", handler, e);
		log.debug("===================================================");

		// 컨트롤러에 대한 예외처리
		// (1) DB에 발생 예외의 로그를 남김
		// (2) 에러페이지로 이동
		
		
	} // afterCompletion

} // end class
