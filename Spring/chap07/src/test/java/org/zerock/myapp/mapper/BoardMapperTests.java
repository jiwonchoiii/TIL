package org.zerock.myapp.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.myapp.domain.BoardVO;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class BoardMapperTests {
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Before
	public void setUp() {
		log.debug("setUp() invoked.");
		
		assertNotNull(this.mapper);
		
		log.info("\t+ mapper: " + mapper);
		log.info("\t+ type: " +this.mapper.getClass().getName());
	} // setUp
	
	@Test
	public void testGetList() {
		log.debug("testGetList() invoked.");
		
		
		List<BoardVO> list = this.mapper.getList();
		assert list != null;
		
		log.info("\t+ list: "+list);

	} // testGetList
	
	@After 
	public void tearDown() {
		log.debug("tearDown() invoked.");

	} // tearDown

} // end class
