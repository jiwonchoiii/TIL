package org.zerock.myapp.mapper;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j2
@NoArgsConstructor

@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {
	"file:src/main/webapp/WEB-INF/spring/**/root-*.xml"	
})
public class MyBatisMapperInterfaceTests {
	
//	private SqlSessionFactory sqlSessionFactory;	// XX
	
	@Setter(onMethod_= @Autowired)
	private TTT ttt;
	
	
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
		assertNotNull(this.ttt);
		log.info("\t+ ttt: " + ttt);
		
		
	} // setup
	
	
	@Test
	public void testGetMyName() {
		log.debug("testGetMyName() invoked.");
		
		String myName = ttt.getMyName();
		log.info("\t+ myName: " + myName);
	} // testGetMyName
	
	
	@Test
	public void testGetSalary() {
		log.debug("testGetSalary() invoked.");
		
		double salary = 
			ttt.getSalary(100, "SKING");
		log.info("\t+ salary: " + salary);
	} // testGetSalary
	
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
		
	} // tearDown

} // end class
