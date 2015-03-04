package com.rose.elong.request;

import org.junit.Test;
import org.rose.webservice.client.WebServiceClient;

import com.rose.elong.client.ElongWebClientImpl;
import com.rose.elong.serializer.ElongCastorSerializer;

public class ElongIntegration {
	
	@Test
	public void testLogin(){
		ElongWebClientImpl elongWebClient = new ElongWebClientImpl();
		elongWebClient.setLanguage("CN");
		elongWebClient.setPassword("elongtest");
		elongWebClient.setUsername("elongtest");
		elongWebClient.setUrl("http://directconnection/HotelAPI/V1.0/SouthBoundService.svc");
		elongWebClient.setVersion("1");
		WebServiceClient webServiceClient = new WebServiceClient();
		webServiceClient.setStreamSerializer(new ElongCastorSerializer());
		elongWebClient.setWebServiceClient(webServiceClient);
		elongWebClient.loginFetchToken();
		System.out.println(elongWebClient.getLoginToken());
	}
	
}
