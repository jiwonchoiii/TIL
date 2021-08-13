package org.zerock.myapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

//@Component // 빈에 등록 -> 인터셉트에 자동 등록 
public class SampleInterceptor3 
	implements HandlerInterceptor {

	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		log.debug("preHandle(request, response, {}) invoked.", handler);
		
		return true;
	} // preHandle

	@Override
	public void postHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler,
			ModelAndView modelAndView) 
			throws Exception {
		log.debug("postHandle(request, response, {}) invoked.", handler, modelAndView);
	
	} // postHandle

	@Override
	public void afterCompletion(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler, 
			Exception e)
			throws Exception {
		log.debug("afterCompletion(request, response, {}) invoked.", handler, e);

	} // afterCompletion

} // end class
