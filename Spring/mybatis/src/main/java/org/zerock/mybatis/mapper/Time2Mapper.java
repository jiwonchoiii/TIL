package org.zerock.mybatis.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.mybatis.domain.EmployeesVO;

public interface Time2Mapper {
	
	@Select("SELECT sysdate FROM dual")
	public abstract Date getNow2();
	
	@Select("SELECT"
			+ " /*+ INDEX DESC(employees) */ "
			+ "* "
			+ " FROM "
			+ "  employees "
			+ " WHERE "
			+ "	 employee_id > #{empid} "
			+ "	 AND salary < #{sal} ")
	public abstract List<EmployeesVO> getEmployees(
			@Param("empid") Integer empno, @Param("sal") Double salary);

} // end interface
