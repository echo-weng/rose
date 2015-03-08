package com.rose.elong.client;

import java.util.UUID;

import org.rose.webservice.client.WebServiceClient;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rose.domain.soap.Body;
import com.rose.domain.soap.Envelope;
import com.rose.domain.soap.Message;
import com.rose.elong.domain.request.Login;
import com.rose.elong.domain.request.RequestHead;
import com.rose.elong.domain.request.UpdateRoomRateRequest;
import com.rose.elong.domain.request.UpdateRoomRateStatusRequest;
import com.rose.elong.domain.request.UpdateRoomTypeAmountRequest;
import com.rose.elong.domain.request.UpdateRoomTypeStatusRequest;
import com.rose.elong.domain.response.ElongResponse;
import com.rose.elong.domain.response.LoginResponse;

@Service("elongWebClient")
public class ElongWebClientImpl implements ElongWebClient {

	private String username;

	private String password;

	private String url;

	private String loginToken;

	//版本 默认:1
	private String version = "1";

	//语言 默认 CN
	private String language = "CN";
	
	@Autowired
	@Qualifier("elongWebServiceClient")
	private WebServiceClient webServiceClient;

	@Override
	public void loginFetchToken() {
		Login login = new Login();
		login.setPassword(password);
		login.setUserName(username);
		RequestHead requestHead = new RequestHead();
		requestHead.setLanguage(language);
		requestHead.setVersion(version);
		login.setRequestHead(requestHead);

		HttpConnectionContext httpConnectionContext = new HttpConnectionContext();
		httpConnectionContext.setSoapAction("http://tempuri.org/IAuthenticationService/Login");
		LoginResponse response = (LoginResponse) unwrap((Envelope)webServiceClient.service(new URLWrapper(url, "elong"), wrap(login), httpConnectionContext));
		loginToken = response.getLoginToken();
	}
	
	@Override
	public ElongResponse updateRate(UpdateRoomRateRequest request) {
		HttpConnectionContext httpConnectionContext = new HttpConnectionContext();
		httpConnectionContext.setSoapAction("http://tempuri.org/IInventoryService/UpdateRoomRate");
		return unwrap((Envelope) webServiceClient.service(new URLWrapper(url, "elong"), wrap(request), httpConnectionContext));
	}

	@Override
	public ElongResponse updateRateStatus(UpdateRoomRateStatusRequest request) {
		HttpConnectionContext httpConnectionContext = new HttpConnectionContext();
		httpConnectionContext.setSoapAction("http://tempuri.org/IInventoryService/UpdateRoomRateStatus");
		return unwrap((Envelope)webServiceClient.service(new URLWrapper(url, "elong"), wrap(request), httpConnectionContext));
	}
	
	@Override
	public ElongResponse updateInventory(UpdateRoomTypeAmountRequest request){
		HttpConnectionContext httpConnectionContext = new HttpConnectionContext();
		httpConnectionContext.setSoapAction("http://tempuri.org/IInventoryService/UpdateRoomRate");
		return unwrap((Envelope)webServiceClient.service(new URLWrapper(url, "elong"), wrap(request), httpConnectionContext));
	}
	
	@Override
	public ElongResponse updateInventoryStatus(UpdateRoomTypeStatusRequest request) {
		HttpConnectionContext httpConnectionContext = new HttpConnectionContext();
		httpConnectionContext.setSoapAction("http://tempuri.org/IInventoryService/UpdateRoomRate");
		return unwrap((Envelope)webServiceClient.service(new URLWrapper(url, "elong"), wrap(request), httpConnectionContext));	
	}
	
	private Envelope wrap(Message message){
		Envelope envelope = new Envelope();
		envelope.setBody(new Body(message));
		return envelope;
	}
	
	private ElongResponse unwrap(Envelope envelope){
		return (ElongResponse) envelope.getBody().getMessage();
	}
	
	@Override
	public boolean needSend(ElongResponse response){
		return response.getResponseHead().getResultStatus() == 2;
	}

	@Override
	public RequestHead createRequestHead(){
		RequestHead requestHead = new RequestHead();
		requestHead.setGuid(UUID.randomUUID().toString());
		requestHead.setLanguage(language);
		requestHead.setLoginToken(loginToken);
		requestHead.setVersion(version);
		return requestHead;
	}
	
	@Override
	public boolean loginTokenIsEmpty(){
		return loginToken == null;
	}
	
	public String getLoginToken() {
		return loginToken;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void setWebServiceClient(WebServiceClient webServiceClient) {
		this.webServiceClient = webServiceClient;
	}

}
