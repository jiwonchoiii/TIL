package org.zerock.httpclient;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@NoArgsConstructor
public class Sample6 {
	
	
	@Test
	public void test() {
		log.debug("test() invoked.");
		
		String uri = "http://localhost:81/";
		
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		
		try {
			HttpGet httpGet = new HttpGet(uri);
			
			CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
			
			try (httpResponse; httpClient) {
				log.info("\t+ HTTP status code: {}", httpResponse.getStatusLine().getStatusCode());
				
				httpGet.abort();
			} // try-with-resources
		} catch(IOException e) {
			e.printStackTrace();
		} // try-catch
	} // test

} // end class
