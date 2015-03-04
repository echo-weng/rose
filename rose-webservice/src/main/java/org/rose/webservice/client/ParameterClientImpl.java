package org.rose.webservice.client;

import java.util.Map;

import org.rose.webservice.CommonWebService;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;

/**
 *	provide multi-modal service method realization
 * 
 * @author ocean
 * 
 */
public class ParameterClientImpl extends BaseClient implements ParameterClient {
    private String httpMethod = HttpConnection.METHOD_GET;

    public ParameterClientImpl() {
    	this.setContentType(HttpConnection.DEFAULT_CONTENT_TYPE);
	}
    
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * assign http connection method 
     * 
     * @param httpMethod
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * service to post/get request to server without http connection context
     * 
     * @param wrapper	   				<code>URLWrapper</code> url with alias
     * @param parameters   				<code>Map</code> key and value of http request parameters
     */
    public String service(URLWrapper wrapper, Map<String, Object> parameters) {
		return service(wrapper, parameters, new HttpConnectionContext());
	}

    /**
     * service to post/get request to server with http connection context
     * 
     * @param wrapper	   				<code>URLWrapper</code> url with alias
     * @param parameters   				<code>Map</code> key and value of http request parameters
     * @param httpConnectionContext		<code>HttpConnectionContext</code>	http connection context contain session name and session id 
     */
	public String service(URLWrapper wrapper, Map<String, Object> parameters,
			HttpConnectionContext httpConnectionContext) {
		Object object = execute(wrapper, httpConnectionContext,
				new ParameterClientTemplate(parameters, httpMethod));
		return object.toString();
	}

	/**
	 * service to post/get request to server without http connection context
	 * 
	 * @param urlWrapper				<code>URLWrapper</code> url with alias
	 * @param parameters				<code>Map</code> key and value of http request parameters
	 * @param httpMethod				<code>String</code> http connection method
	 */
    @Override
    public String service(URLWrapper urlWrapper, Map<String, Object> parameters, String httpMethod) throws WebServiceInvocationException {
        return service(urlWrapper, parameters, httpMethod, new HttpConnectionContext());
    }

    /**
     * service to post/get request to server with http connection context
     * 
     * @param urlWrapper				<code>URLWrapper</code> url with alias
     * @param parameters				<code>Map</code> key and value of http request parameters
     * @param httpMethod				<code>String</code> http connection method
     * @param httpConnectionContext		<code>HttpConnectionContext</code>	http connection context contain session name and session id
     */
    @Override
    public String service(URLWrapper urlWrapper, Map<String, Object> parameters, String httpMethod, HttpConnectionContext httpConnectionContext) throws WebServiceInvocationException {
        ParameterClientTemplate parameterClientTemplate = new ParameterClientTemplate(parameters, httpMethod);
        parameterClientTemplate.setLog(CommonWebService.getStreamLog(urlWrapper.getAlias()));
        Object object = execute(urlWrapper, httpConnectionContext, parameterClientTemplate);
        return object.toString();
    }
}
