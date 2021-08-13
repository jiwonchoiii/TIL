package org.zerock.myapp.persistence;

import org.zerock.myapp.domain.LoginDTO;
import org.zerock.myapp.domain.UserVO;

public interface UserDAO {
	
	public abstract UserVO selectUser(LoginDTO dto) throws Exception;
	// DB작업하다가 오류날 수 있으니 예외던짐

} // end interface
