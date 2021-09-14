package org.zerock.httpclient;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@NoArgsConstructor
public class Sample16 {

	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		HttpGet httpRequest = new HttpGet("http://www.github.com");
//		HttpGet httpRequest = new HttpGet("http://localhost:8070");
		
		httpRequest.setHeader("Cookie", "JSESSIONID=1234567890");
		
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		
		if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
			httpResponse.getEntity().writeTo(System.out);
		
	} // test
	
} // end class
