package org.zerock.myapp.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface TTT {


	@Select("SELECT first_name FROM employees WHERE employee_id = 100")
	public abstract String getMyName();
	
	
	public abstract Double getSalary(
		@Param("empid") Integer empid,
		@Param("email") String email
	);
} // end class
