package org.zerock.httpclient;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample11 {
	
	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");

		//-------------------------------------------------------------------------//
		
		Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, ContentType.TEXT_HTML.toString());
		Header customHeader = new BasicHeader("TTT", "ttt");
		
		List<Header> headers = Arrays.<Header>asList(contentType, customHeader);
		
		headers.forEach(log::info);

		//-------------------------------------------------------------------------//
		
		HttpClient httpClient = HttpClients.custom().setDefaultHeaders(headers).build();

		//-------------------------------------------------------------------------//
		
		HttpUriRequest httpRequest = RequestBuilder.get("http://bitcamp.co.kr/").build();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		
		httpResponse.getEntity().writeTo(System.out);
	} // test

} // end class