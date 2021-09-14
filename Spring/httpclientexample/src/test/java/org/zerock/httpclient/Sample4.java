package org.zerock.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;

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
public class Sample4 {
	
	private int hardTimeout = 3;
	
	
	@Test
	public void test() throws URISyntaxException {
		log.debug("test() invoked.");

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		
		//-------------------------------------------------------------//
		
//		String uri = "http://localhost:8080/spring-security-rest-template/api/bars/1";
		URI uri = new URI("http://www.example.com:8080/spring-security-rest-template/api/bars/1");

		HttpGet httpGet = new HttpGet(uri);
		
		//-------------------------------------------------------------//
		
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				log.debug("run() invoked.");
				
				if(httpGet != null) {
					httpGet.abort();
				} // if
			} // run
			
		};	// TimerTask
		
		Timer timer = new Timer("HTTP timer", true);
		timer.schedule(task, 1000 * hardTimeout);
		
		//-------------------------------------------------------------//
		
		try {
			CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
			
			try (httpResponse) { 
				assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
				
				httpResponse.getEntity().writeTo(System.out);
			} // try-with-resources
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
	} // test

} // end class
