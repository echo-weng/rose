package com.rose.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.rose.webservice.serializer.StreamSerializer;

import com.rose.exception.RequestHandlerException;
import com.rose.service.RequestHandlerService;
import com.rose.spring.ApplicationContextUtil;
import com.rose.utils.Charsets;
import com.rose.web.request.RoseRequest;
import com.rose.web.response.RoseResponse;

/**
 * 统一的服务接收器
 *
 * @author echo
 */
public abstract class RoseServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected final Log LOG = LogFactory.getLog(this.getClass());
	protected static final String CHAR_SET = "UTF-8";
	
	/**
	 * 序列化器
	 */
	protected StreamSerializer streamSerializer;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			RoseRequest roseRequest = unmarshalRequest(req);
			
			RequestHandlerService requestHandlerService = ApplicationContextUtil.getBean(roseRequest.getHandlerServiceBeanName());
			RoseResponse roseResponse = expectionHandler(roseRequest, requestHandlerService);
			
			//设置返回内容及编码
			resp.setCharacterEncoding(roseResponse.getCharacterEncoding());
			resp.setContentType(roseResponse.getContentType());
			
			//返回结果
			marshalResponse(roseResponse, resp);
		} catch (Exception e) {
			LOG.error(e);
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}
	
	protected RoseResponse expectionHandler(RoseRequest request, RequestHandlerService requesthandlerService) {
		RoseResponse response = null;
		try {
			response = requesthandlerService.handlerRequest(request);
		} catch (RequestHandlerException e) {
			response = doWithException(e, request);
		} catch (Exception e) {
			response = doWithException(e, request);
		}
		return response;
	}
	
	protected abstract RoseResponse doWithException(Exception e, RoseRequest request);
	
	protected RoseRequest unmarshalRequest(HttpServletRequest httpServletRequest) throws IOException {
		String requestXml = IOUtils.toString(httpServletRequest.getInputStream());
		LOG.info("Request receive:" + requestXml);
		return (RoseRequest) streamSerializer.unmarshal(new ByteArrayInputStream(requestXml.getBytes()), Charsets.UTF_8);
	}
	
	protected void marshalResponse(RoseResponse response, HttpServletResponse httpServletResponse) throws Exception {
		String responseXml = marshalToString(response);
		if (LOG.isInfoEnabled()) {
			LOG.info("Response back:" + responseXml);
		}
		httpServletResponse.getOutputStream().write(responseXml.getBytes());
		httpServletResponse.getOutputStream().flush();
	}
	
	protected String marshalToString(RoseResponse roseResponse) throws UnsupportedEncodingException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		streamSerializer.marshal(roseResponse, outputStream, Charsets.UTF_8);
        return outputStream.toString("utf-8");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		streamSerializer = createStreamSerializer();
	}
	
	protected abstract StreamSerializer createStreamSerializer();
	
}
