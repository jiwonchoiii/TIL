package org.zerock.myapp.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
//		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
//		"file:src/main/webapp/WEB-INF/spring/**/root-*.xml"
		// **/ means all folders within the current folder
})
public class JUnitTestTemplate {

	@Before
	public void setUp() {
		log.debug("setUp() invoked.");
	} // setUp
	
	@Test(timeout=1000) // ms
	public void testCase1() {
		log.debug("testCase1() invoked.");
	} // testCase1
	
	@Test
	public void testCase2() {
		log.debug("testCase2() invoked.");
	} // testCase2
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
	} // tearDown
}
