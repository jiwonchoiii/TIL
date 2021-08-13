package org.zerock.myapp.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.myapp.domain.LoginDTO;
import org.zerock.myapp.domain.UserVO;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
		
})
public class UserDAOTests {

	@Setter(onMethod_= @Autowired)
	private UserDAO dao;
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
		assertNotNull(dao);
		log.info("\t+ dao: {}",dao );
	} // setup
	
	@Test
	public void testSelectUser() throws Exception {
		log.debug("testSelectUser() invoked.");

		LoginDTO dto = new LoginDTO();
		dto.setUserid("USER_3");
		dto.setUserpw("PASS_3");
		dto.setRememberMe(false);
		
		UserVO user = this.dao.selectUser(dto);
		assertNotNull(user);
		
		log.info("\t+ user: {}", user);
		
	} // testSelectUser
} // end class
