package org.zerock.httpclient;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample5 {
	
	private int timeout = 3;
	private URI uri;
	
	
	@Before
	public void setup() throws URISyntaxException {
		log.debug("setup() invoked.");
		
		this.uri = new URI("http://www.google.com");
		
		assertNotNull(this.uri);
		log.info("\t+ uri: {}", this.uri);
	} // setup
	
	
	@Test
	public void test() {
		log.debug("test() invoked.");
		
		RequestConfig reqConfig = 
			RequestConfig.
				custom().
				setConnectTimeout(1000 * timeout).
				setSocketTimeout(1000 * timeout).
				setConnectionRequestTimeout(1000 * timeout).
				build();
		
		CloseableHttpClient httpClient =
			HttpClientBuilder.create().setDefaultRequestConfig(reqConfig).build();
		
		try {
//			CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet(this.uri));
//			
//			try (httpResponse; httpClient) {
//				assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
//				
//				httpResponse.getEntity().writeTo(System.out);
//			} // try-with-resources
			
			int httpStatusCode = httpClient.execute(new HttpGet(this.uri), new ResponseHandler<Integer>() {

					@Override
					public Integer handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
						log.debug("handleResponse({}) invoked.", response);
						
						if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
							response.getEntity().writeTo(System.out);
						} // if
						
						return response.getStatusLine().getStatusCode();
					} // handleResponse
					
				}); // execute
			
			log.debug("\t+ httpStatusCode: {}", httpStatusCode);
		} catch(IOException e) {
			e.printStackTrace();
		} // try-catch
	} // test

} // end class
