package org.zerock.httpclient;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;



@Log4j2
@NoArgsConstructor
public class Sample14 {
	
	
	@Test
	public void test() 
			throws 
				KeyManagementException,
				UnrecoverableKeyException,
				NoSuchAlgorithmException,
				KeyStoreException {
		
		log.debug("test() invoked.");

		
		//-------------------------------------------------------------------------//
		
		BasicClientCookie cookie = new BasicClientCookie("JSESSIONID", "1234");
		cookie.setDomain(".github.com");
		cookie.setPath("/");
		cookie.setComment("Custom Cookie");
		cookie.setSecure(false);
		
		log.info("1. cookie: {}", cookie);
		
		//-------------------------------------------------------------------------//
		
		CookieStore cookieStore = new BasicCookieStore();
		cookieStore.addCookie(cookie);
		
		log.info("2. cookieStore: {}", cookieStore);
		
		//-------------------------------------------------------------------------//
		
//		DefaultHttpClient httpClient = new DefaultHttpClient();					// @deprecated (4.3)
		
//		CloseableHttpClient httpClient = HttpClients.custom().build();
		CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();

		log.info("3. httpClient: {}", httpClient);
		
		//-------------------------------------------------------------------------//
		
//		String uri = "http://localhost:8070";
		String uri = "http://www.github.com";
		
		HttpGet httpRequest = new HttpGet(uri);
//		HttpUriRequest httpRequest = RequestBuilder.get(uri).build();

		log.info("4. httpRequest: {}", httpRequest);
		
		//-------------------------------------------------------------------------//
		
		try (httpClient) {
			
			CloseableHttpResponse httpResponse = httpClient.execute(httpRequest);
			
			log.info("5. httpResponse: {}", httpResponse);
			
			
			try (httpResponse) {
				assert httpResponse != null;
				log.info("\t+ HTTP status code: {}", httpResponse.getStatusLine().getStatusCode());
				
				httpResponse.getEntity().writeTo(System.out);
			} // try-with-resources
			
		} catch(IOException e) {
			e.printStackTrace();
		} // try-catch
	} // test

} // end class
