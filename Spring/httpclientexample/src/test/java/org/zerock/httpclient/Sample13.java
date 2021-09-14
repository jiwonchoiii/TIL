package org.zerock.httpclient;

import java.io.IOException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample13 {
	
	
	@Test
	public void test() throws ClientProtocolException, IOException {
		log.debug("test() invoked.");
		

		//-------------------------------------------------------------------------//
		
//		CloseableHttpClient httpClient = 
//				HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
		
		CloseableHttpClient httpClient =
				HttpClients.
					custom().
					setSSLHostnameVerifier(new HostnameVerifier() {

						@Override
						public boolean verify(String host, SSLSession sslSession) {
							log.debug("verify({}, {}) invoked.", host, sslSession);
							
							return true;
						} // verify
						
					}).
					build();

		//-------------------------------------------------------------------------//
		
		String uri = "https://www.google.co.kr/search?q=%EC%BD%94%EB%A1%9C%EB%82%98&source=hp&ei=bkkOYf2QBpeT-Aap-Aw&iflsig=AINFCbYAAAAAYQ5XfpSEgi_6wDxwFCjhqEEJVn3Py2i_&oq=%EC%BD%94%EB%A1%9C%EB%82%98&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIFCAAQgAQyBQgAEIAEUM8yWIk4YPI5aANwAHgAgAFoiAHHBJIBAzUuMZgBAKABAbABAA&sclient=gws-wiz&ved=0ahUKEwj9_9D_w57yAhWXCd4KHSk8AwAQ4dUDCAY&uact=5";
		
		HttpUriRequest httpRequest = RequestBuilder.get(uri).build();

		//-------------------------------------------------------------------------//
		
		try (httpClient) {
			CloseableHttpResponse httpResponse = httpClient.execute(httpRequest);
		
			try (httpResponse) {
				assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
				httpResponse.getEntity().writeTo(System.out);
			} // try-with-resources
		} catch(IOException e) {
			e.printStackTrace();
		} // try-catch
	} // test

} // end class
