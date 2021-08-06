package org.zerock.myapp.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@Log4j2
public class SampleDTOList {
	
	private List<SampleDTO> list;
	
	public SampleDTOList() {
		log.debug("SampleDTOList() invoked.");
		
		list = new ArrayList<>();
	} // default constructor

} // end class
