package org.zerock.httpclient;

import java.io.IOException;

import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Sample3 {
	
	
	@Test
	public void test() {
		log.debug("test() invoked.");
		
		int timeout = 5;
		
		
		//-------------------------------------------------------------//
//		httpClient.getParams();		// @deprecated (4.3)
		
		RequestConfig.Builder reqConfigBuilder = RequestConfig.custom();
		
		reqConfigBuilder.setConnectTimeout(timeout * 1000);
		reqConfigBuilder.setSocketTimeout(timeout * 1000);
		reqConfigBuilder.setConnectionRequestTimeout(1000 * timeout);
		
		log.info("\t+ reqConfigBuilder: {}", reqConfigBuilder);
		
		RequestConfig reqConfig = reqConfigBuilder.build();
		log.info("\t+ reqConfig: {}", reqConfig);
		//-------------------------------------------------------------//
		

		//-------------------------------------------------------------//
//		DefaultHttpClient httpClient = new DefaultHttpClient();	// @deprecated (4.3)
		
		CloseableHttpClient httpClient = 
				HttpClientBuilder.create().setDefaultRequestConfig(reqConfig).build();
		//-------------------------------------------------------------//
		
		try (httpClient) {
			//-------------------------------------------------------------//
			HttpGet httpGet = new HttpGet("http://www.example.com");
			
			CloseableHttpResponse response = httpClient.execute(httpGet);
			//-------------------------------------------------------------//
			
			try (response) {
				
				//-------------------------------------------------------------//
				assert response.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
				
				response.getEntity().writeTo(System.out);
				//-------------------------------------------------------------//
				
			} // try-with-resources
		} catch(IOException e) {
			e.printStackTrace();
		} // try-with-resources
	} // test

} // end class
