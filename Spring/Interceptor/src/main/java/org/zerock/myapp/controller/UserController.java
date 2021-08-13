package org.zerock.myapp.controller;

import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.myapp.domain.LoginDTO;
import org.zerock.myapp.domain.UserVO;
import org.zerock.myapp.service.UserService;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RequestMapping("/user/")
@Controller
public class UserController {
	
	@Setter(onMethod_= @Autowired)
	private UserService service;
	
	private static final String loginKey = "__LOGIN__";
	
	@PostMapping("loginPost")
	public void loginPost(LoginDTO dto, Model model) throws Exception {
		log.debug("loginPost({}, model) invoked.", dto);
		
		Objects.requireNonNull(this.service);
		
		UserVO user = this.service.login(dto);
		if(user != null) {
			model.addAttribute(UserController.loginKey, user); // jsp에 보냄
		 
//			session.setAttribute(UserController.loginKey, user); // 세션스코프에 담음 --> 인터셉터에서 하는 것으로 변경
 		} // if
	} // loginPost
} // end class 
