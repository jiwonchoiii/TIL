package org.zerock.myapp.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class URLEncoderTests {

	@Before
	public void setUp() {
		log.debug("setUp() invoked.");

	} // setUp

	@Test
	public void testURLEncoder() throws UnsupportedEncodingException {
		log.debug("testURLEncoder() invoked.");

		String queryString = "list[0].name=NAME_1&list[0].age=1&list[1].name=NAME_2&list[1].age=2";

		URLEncoder.encode(queryString); // Deprecated

		String urlEncodedString = URLEncoder.encode(queryString, "UTF-8");

		log.info("\t+ urlEncodedString: " + urlEncodedString);

	} // testURLEncoder

	@Test
	public void testURLDecoder() {
		log.debug("testURLDecoder() invoked.");

		String queryString = "list%5B0%5D.name%3DNAME_1%26list%5B0%5D.age%3D1%26list%5B1%5D.name%3DNAME_2%26list%5B1%5D.age%3D2\r\n"
				+ "";
		
		URLDecoder.decode(queryString);
		
		String urlDecodeString = URLDecoder.decode(queryString);
		
		log.info("\t+ urlDecodeString: " + urlDecodeString);

	} // testURLDecoder

	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");

	} // tearDown

} // end class
