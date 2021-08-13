package org.zerock.myapp.domain;

import lombok.Value;

@Value
public class UserVO { // 로그인 성공하면 Session Scope에 유지할 사용자 정보객체

	
	private String userid;
	private String userpw; // Bcrypt: 해시값을 저장
	private String uname;
	private Integer upoint;
	
} // end class
