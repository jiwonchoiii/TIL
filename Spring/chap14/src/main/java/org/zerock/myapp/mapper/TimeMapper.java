package org.zerock.myapp.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Select;


public interface TimeMapper {
	

	@Select("SELECT sysdate FROM dual")
	public abstract Date getNow();
	public abstract String getTime();

} // end interface
