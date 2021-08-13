package org.zerock.myapp.domain;

import lombok.Data;

@Data
public class LoginDTO {   //자바빈즈
   
   private String userid;
   private String userpw;
   //로그인 유지상태 확인
   private boolean rememberMe;

}//end class