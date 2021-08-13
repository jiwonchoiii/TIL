package org.zerock.myapp.service;

import org.zerock.myapp.domain.LoginDTO;
import org.zerock.myapp.domain.UserVO;

public interface UserService {
	
	public abstract UserVO login(LoginDTO dto) throws Exception;

}
