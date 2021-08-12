package org.zerock.myapp.domain;

import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class CriteriaTests {
	
	@Test
	public void testGetPagingUri() {
		log.debug("testGetPagingUri() invoked.");
		
		Criteria cri = new Criteria();
		cri.setCurrPage(10);
		cri.setAmount(20);
		cri.setPagesPerPage(10);
		cri.setType("T");
		cri.setKeyword("XXX");
	}

}
