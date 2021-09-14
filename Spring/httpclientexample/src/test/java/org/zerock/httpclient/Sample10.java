package org.zerock.httpclient;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@NoArgsConstructor
public class Sample10 {
	
	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");

		//-------------------------------------------------------------------------//
		
		HttpClient httpClient = HttpClients.custom().build();

		//-------------------------------------------------------------------------//
		
//		RequestBuilder builder =
//			RequestBuilder.
//				get().
//				setUri("http://www.naver.com").
//				setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_FORM_URLENCODED.toString()).
//				addParameter("name", "이순신").
//				addParameter("age", "23");

		//-------------------------------------------------------------------------//
		
		RequestBuilder builder =
				RequestBuilder.
					post("http://www.bitcamp.co.kr").
					addParameter("name", "이순신").
					addParameter("age", "23");

		//-------------------------------------------------------------------------//
		
		HttpUriRequest httpRequest = builder.build();
		HttpResponse httpResponse = httpClient.execute(httpRequest);

		//-------------------------------------------------------------------------//
		
		assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
		
//		httpResponse.setLocale(Locale.KOREA);
		httpResponse.getEntity().writeTo(System.out);
	} // test

} // end class
