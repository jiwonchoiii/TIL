package org.zerock.myapp.domain;

import lombok.Value;


@Value
public class DepartmentsVO {
	
	private Integer departmentId;
	private String departmentName;
	private Integer managerId;
	private Integer locationId;
	
	
	

} // end class
