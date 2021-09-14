package org.zerock.httpclient;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample9 {
	
	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");

		//-------------------------------------------------------------------------//
		
//		HttpClient httpClient = new DefaultHttpClient();		// @deprecated (4.3)
		
		HttpClient httpClient = HttpClientBuilder.create().build();

		//-------------------------------------------------------------------------//
		
//		HttpGet httpRequest = new HttpGet("http://localhost:8070");
		HttpPost httpRequest = new HttpPost("http://www.example.com");
		
		httpRequest.setHeader(HttpHeaders.ACCEPT_CHARSET, "utf8");
		httpRequest.setHeader(HttpHeaders.USER_AGENT, "Apache HttpClient");
		httpRequest.setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
		
//		httpRequest.setParams(null);							// @deprecated (4.3)
		
		// if HttpPost -----------------------------------------------------------
		
		String queryString = URLEncoder.encode("name=Yoseph&age=23", "utf8");
		
//		byte[] content = queryString.getBytes("utf8");
		byte[] content = queryString.getBytes();
		
		HttpEntity entity = new ByteArrayEntity(content, ContentType.APPLICATION_FORM_URLENCODED);
		httpRequest.setEntity(entity);
		
		// if HttpPost -----------------------------------------------------------
		
		log.info("httpRequest: {}", httpRequest);

		//-------------------------------------------------------------------------//
		
		HttpResponse httpResponse = httpClient.execute(httpRequest);

		//-------------------------------------------------------------------------//
		
		assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
		httpResponse.getEntity().writeTo(System.out);
	} // test

} // end class
