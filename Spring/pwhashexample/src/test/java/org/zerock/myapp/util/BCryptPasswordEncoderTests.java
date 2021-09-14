package org.zerock.myapp.util;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class BCryptPasswordEncoderTests {
	
	
	
	@Test
	public void testBCryptPasswordEncoder() {
		log.debug("testBCryptPasswordEncoder() invoked.");
		
		String password = "Yoseph1234567890";
		
		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
		
		String encryptedPassword = bcryptEncoder.encode(password);
		
		log.info("\t+ encryptedPassword: {}", encryptedPassword);
		log.info("\t+ encryptedPassword.length: {}", encryptedPassword.length());
		
	} // testBCryptPasswordEncoder

} // end class
