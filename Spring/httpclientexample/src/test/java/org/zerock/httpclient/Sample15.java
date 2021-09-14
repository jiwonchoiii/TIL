package org.zerock.httpclient;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@NoArgsConstructor
public class Sample15 {

	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");
		

		//-------------------------------------------------------------------------//
		
		BasicClientCookie cookie = new BasicClientCookie("JSESSIONID", "1234567890");
		cookie.setDomain("github.com");
		cookie.setPath("/");
		cookie.setSecure(false);
		
		//-------------------------------------------------------------------------//
		
		CookieStore cookieStore = new BasicCookieStore();
		cookieStore.addCookie(cookie);

		//-------------------------------------------------------------------------//
		
		HttpGet httpRequest = new HttpGet("http://www.github.com");
//		HttpGet httpRequest = new HttpGet("http://localhost:8070");
		
		//-------------------------------------------------------------------------//
		
		HttpContext httpContext = new BasicHttpContext();
		httpContext.setAttribute(HttpClientContext.COOKIE_STORE, cookieStore);

		//-------------------------------------------------------------------------//

		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse httpResponse = httpClient.execute(httpRequest, httpContext);

		//-------------------------------------------------------------------------//
		
		assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
		httpResponse.getEntity().writeTo(System.out);
	} // test
	
} // end class
