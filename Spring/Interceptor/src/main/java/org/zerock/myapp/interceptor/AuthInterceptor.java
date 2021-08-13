package org.zerock.myapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.myapp.domain.UserVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

//@Component
public class AuthInterceptor
   implements HandlerInterceptor {
   
   //Controller에 관여되면 안되니까 따로갖고있자.
   private static final String loginKey= "__login__";
   
   @Override
   public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) 
      throws Exception {
      log.debug("=======================================================");
      log.debug("1. preHandle(request,response,{}) invoked.",handler.getClass().getName());
      log.debug("=======================================================");

      
      return true;
      
   }//preHandle

   @Override
   public void postHandle(
         HttpServletRequest request, 
         HttpServletResponse response, 
         Object handler,
         ModelAndView modelAndView
      ) throws Exception {
      log.debug("=======================================================");
      log.debug("2. postHandle(request,response,{}, {}) invoked.",handler, modelAndView);
      log.debug("=======================================================");
      
      //예외발생 없이 성공했을 때! (예외발생하면 afterCompletion으로 바루 가니까)
      //할일
      //1. 들어온 model안에 (UserVO객체) 있는데 이걸 Session Scope에 바인딩
      HttpSession session = request.getSession();

      UserVO user =(UserVO) modelAndView.getModelMap().get(loginKey);
      if(user!=null) {
         session.setAttribute(AuthInterceptor.loginKey, user);
         log.info("\t+ >>>> UserVO 바인딩 완료 <<<<");
      } //if
   }//postHandle

   @Override
   public void afterCompletion(
         HttpServletRequest request, 
         HttpServletResponse response, 
         Object handler, 
         Exception e
      ) throws Exception {
      log.debug("=======================================================");
      log.debug("3. afterCompletion(request,response,{}, {}) invoked.",handler, e);
      log.debug("=======================================================");
      
      //afterConmpletion에서 할 수 있는 것
      //controller에 대한 예외처리
      
      
   }//afterCompletion
   
}//end class