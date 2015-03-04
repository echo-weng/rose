package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.net.Socket;

import org.rose.webservice.client.http.Constant;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpUtils;
import org.rose.webservice.client.http.StreamableString;
import org.rose.webservice.client.http.impl.io.HttpSocketRequestStream;
import org.rose.webservice.client.http.impl.io.HttpSocketResponseStream;
import org.rose.webservice.client.http.impl.io.NoncloseInputStream;
import org.rose.webservice.client.http.impl.io.NoncloseOutputStream;

public class HttpSocketConnection extends BaseHttpConnection implements HttpConnection {
    protected Socket socket;

    @Override
    public int execute() throws IOException {         
        initHeaders();

        if(this.getPath() == null || "".equals(this.getPath())) {
            this.setPath("/");
        }
        if (getRequestParameters() != null&&!getRequestParameters().isEmpty()) {            
            if (getRequestStream() == null && METHOD_POST.equals(this.getHttpMethod())) {
                String queryString = HttpUtils.getQueryString(getRequestParameters(),
                    this.getRequestCharset());
                Constant.LOG.debug("Query stream >> " + queryString);
                this.setRequestStream(new StreamableString(queryString, this.getRequestCharset()));
            } else {
            	String queryString;
            	if(null!=this.getUrlEncoding()){
            		queryString = HttpUtils.getQueryString(getRequestParameters(),
            				 this.getUrlEncoding());
            	}else{
            		queryString = HttpUtils.getQueryString(getRequestParameters(),
           				 Constant.HTTP_META_DEFAULT_CHARSET);
            	}
                Constant.LOG.debug("Query string >> " + queryString);
                this.setPath(this.getPath() + "?" + queryString);
            }
        }
        HttpSocketRequestStream httpSocketRequestStream = getHttpSocketRequestStream();
        if (getRequestStream() != null) {
            getRequestStream().write(httpSocketRequestStream);
        }
        
        httpSocketRequestStream.flush();

        return response(new HttpSocketResponseStream(new NoncloseInputStream(socket.getInputStream())));
    }

    protected int response(HttpSocketResponseStream httpSocketResponseStream) throws IOException {
        setResponseHeaders(httpSocketResponseStream.getHeaders());
        setResponseStream(httpSocketResponseStream);
        return httpSocketResponseStream.getStatusCode();
    }

    protected HttpSocketRequestStream getHttpSocketRequestStream() throws IOException {
        HttpSocketRequestStream httpSocketRequestStream = new HttpSocketRequestStream(new NoncloseOutputStream(socket.getOutputStream()));
        httpSocketRequestStream.setHttpMethod(this.getHttpMethod());
        httpSocketRequestStream.setVersion("1.1");
        httpSocketRequestStream.setHeaders(this.getRequestHeaders());
        httpSocketRequestStream.setPath(this.getPath());
        return httpSocketRequestStream;
    }

    protected void initHeaders() {
        this.setRequestHeader(HEADER_HOST, socket.getInetAddress().getHostName()+":"+socket.getPort());
        this.setRequestHeader(HEADER_USER_AGENT, HEADER_VALUE_USER_AGENT_D_CLIENT);
        this.setRequestHeader(HEADER_ACCEPT, HEADER_VALUE_ACCEPT_ALL);
        this.setRequestHeader(HttpConnection.HEADER_CONNECTION, HttpConnection.HEADER_VALUE_CONNECTION_CLOSE);
    }

    @Override
    public void close() {
        super.close();
        if(socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                Constant.LOG.debug("Ignore Socket close exception", e);
            }
        }
        socket = null;
        this.setRequestHeaders(null);
        this.setRequestStream(null);
    }

    public Socket getSocket() {
        return socket;
    }

	public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
