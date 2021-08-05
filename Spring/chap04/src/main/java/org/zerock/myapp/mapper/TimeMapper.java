package org.zerock.myapp.mapper;

import java.util.Date;


public interface TimeMapper {
	

//	@Select("SELECT sysdate FROM dual")
	public abstract Date getNow();
	public abstract String getTime();

} // end interface
