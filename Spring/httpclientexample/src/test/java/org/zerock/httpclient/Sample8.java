package org.zerock.httpclient;

import java.io.IOException;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@NoArgsConstructor
public class Sample8 {
	
	
	@Test
	public void test() {
		log.debug("test() invoked.");
		
		CloseableHttpClient httpClient =
			HttpClientBuilder.
				create().
				disableRedirectHandling().			// To disable following Redirect (301 code)
				disableAutomaticRetries().
				build();
		
		try (httpClient) {

			CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet("http://t.co/l5YYd9tddw"));
			log.info("1. httpResponse: {}", httpResponse);
			
			try (httpResponse) {
				assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_MOVED_PERMANENTLY;
				
				log.info("2. body size: {}", httpResponse.getEntity().getContentLength());
				
				if(httpResponse.getEntity().getContentLength() > 0)
					httpResponse.getEntity().writeTo(System.out);
			} // try-with-resources
			
		} catch(IOException e) {
			e.printStackTrace();
		} // try-catch
		
	} // test

} // end class
