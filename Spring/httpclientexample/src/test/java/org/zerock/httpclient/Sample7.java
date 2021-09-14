package org.zerock.httpclient;

import java.io.IOException;
import java.util.Arrays;

import org.apache.http.Header;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample7 {

	
	@Test
	public void test() {
		log.debug("test() invoked.");
		
		//-------------------------------------------------------------------------//
		
//		HttpParams params = new BasicHttpParams();				// @deprecated (4.3)
		
		Builder builder = RequestConfig.custom();
		builder.setConnectTimeout(1000 * 5);
		builder.setSocketTimeout(1000 * 5);
		builder.setConnectionRequestTimeout(1000 * 5);
		builder.setRedirectsEnabled(false);						// ***
//		builder.setRedirectsEnabled(true);						// ***
		
		RequestConfig config = builder.build();
		log.info("1. config: {}", config);
		
		//-------------------------------------------------------------------------//
		
		HttpGet httpGet = new HttpGet("http://t.co/l5YYd9tddw");
//		httpGet.setParams(HttpParams);							// @deprecated (4.3)
		
		log.info("2. httpGet: {}", httpGet);
		
		//-------------------------------------------------------------------------//

//		DefaultHttpClient httpClient = new DefaultHttpClient();	// @deprecated (4.3)
		
		CloseableHttpClient httpClient =
			HttpClientBuilder.create().setDefaultRequestConfig(config).build();
		
		log.info("3. httpClient: {}", httpClient);
		
		//-------------------------------------------------------------------------//
		
		try (httpClient) {
			CloseableHttpResponse httpResponse  = httpClient.execute(httpGet);
			log.info("4. httpResponse: {}", httpResponse);
			
			log.info("5. Response status line: {}", httpResponse.getStatusLine());
			
			Header[] allHeaders = httpResponse.getAllHeaders();
			Arrays.asList(allHeaders).forEach(log::info);
			
			try (httpResponse) {
				assert httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_MOVED_PERMANENTLY;
				
				httpResponse.getEntity().writeTo(System.out);
			} // try-with-resources
		} catch(IOException e) {
			e.printStackTrace();
		} // try-catch
		
	} // test
	
} // end class
