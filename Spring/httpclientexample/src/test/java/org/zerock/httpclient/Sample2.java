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
public class Sample2 {
	
	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(new HttpGet("http://www.google.com"));
		int httpStatusCode = response.getStatusLine().getStatusCode();
		log.info("\t+ httpStatusCode: {}", httpStatusCode);
		
		assert httpStatusCode == HttpStatus.SC_OK;
	} // test

} // end class
