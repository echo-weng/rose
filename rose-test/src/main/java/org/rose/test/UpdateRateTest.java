package org.rose.test;

import java.io.InputStream;

import org.junit.Test;
import org.rose.webservice.client.SimpleClient;
import org.rose.webservice.client.SimpleClientImpl;
import org.rose.webservice.client.http.URLWrapper;

import com.rose.utils.IOUtil;

/**
 * @author echo
 */
public class UpdateRateTest {
	
	@Test
	public void testUpdateRate() throws Exception{
		InputStream in = UpdateRateTest.class.getResourceAsStream("UpdateRateRequest.xml");
		String request = IOUtil.toString(in);
		System.out.println("request>:" + request);
		SimpleClient client = new SimpleClientImpl();
		System.out.println("response>:" + client.post(new URLWrapper("http://localhost:8080/rose/rose/mps.svc", ""), request));
	}
	
}
