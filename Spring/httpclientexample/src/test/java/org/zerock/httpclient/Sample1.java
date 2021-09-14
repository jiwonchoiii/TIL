package org.zerock.httpclient;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample1 {
	
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
	} // setup
	
	
	@Test
	public void test() {
		log.debug("test() invoked.");
		
		HttpClientBuilder cilentBuilder = HttpClientBuilder.create();
		log.info("1. clientBuilder: " + cilentBuilder);
		
		CloseableHttpClient client = cilentBuilder.build();
		log.info("2. client: " + client);
		
		try (client) {
			
			HttpGet httpGet = new HttpGet("http://www.google.co.kr");
			log.info("3. httpGet: " + httpGet);
			
			CloseableHttpResponse response = client.execute(httpGet);
			log.info("4. response: " +  response);
			
			try (response) {
				//-------------------------------------------------//
				// HTTP response's status line
				//-------------------------------------------------//
				StatusLine statusLine = response.getStatusLine();
				log.info("5. statusLine: " +  statusLine);
				
				log.info("\t+ "+ statusLine.getReasonPhrase());
				log.info("\t+ "+ statusLine.getProtocolVersion());
				log.info("\t+ "+ statusLine.getStatusCode());
				
				//-------------------------------------------------//
				// HTTP response's headers
				//-------------------------------------------------//
				
				Header[] headers = response.getAllHeaders();
				log.info("6. headers: " +  headers);
//				log.info(Arrays.toString(headers));
				
				for(Header header : headers) {
					log.info(String.format("\t+ header: (%s, %s)", header.getName(), header.getValue()));
				} // enhanced for
				
				//-------------------------------------------------//
				// HTTP response's body
				//-------------------------------------------------//
				HttpEntity entity = response.getEntity();
				log.info("7. entity: " + entity);
				
				log.info("\t+ getContentLength: " + entity.getContentLength());
				log.info("\t+ getContentType: " + entity.getContentType());
				log.info("\t+ getContentEncoding: " + entity.getContentEncoding());
				log.info("\t+ getContent: " + entity.getContent());
				
				InputStream is = entity.getContent();
				
				try (is) {
					int bytes = is.available();
					log.info("\t+ bytes: " + bytes);
					
					byte[] allbytes = is.readAllBytes();
					log.info("\t+ allbytes: " + allbytes);
					
				} // try-with-resources
				
			} // try-with-resources
			
		} catch(IOException e) {
			e.printStackTrace();
		} // try-with-resources
	} // test
	
	
	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
		
	} // tearDown

} // end class
