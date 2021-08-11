package org.zerock.myapp.util;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor


@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class BCryptPasswordEncoderTests {

	@Setter(onMethod_=@Autowired)
	private BCryptPasswordEncoder pwEncoder;
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
		assertNotNull(this.pwEncoder);
		log.info("\t pwEncoder: {}", this.pwEncoder);
	}// before
	
	@Test
	public void testBCryptPasswordEncoder() {
		log.debug("testBCryptPasswordEncoder() invoked.");
		
		String password = "jiwon01010101";
		
		String encryptedPassword = this.pwEncoder.encode(password);
		log.info("\t+ encryptedPassword: {}", encryptedPassword);
		log.info("\t+ encryptedPassword.length: {}", encryptedPassword.length());
		

	}// testBCryptPasswordEncoder
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");

	} // tearDown
}
