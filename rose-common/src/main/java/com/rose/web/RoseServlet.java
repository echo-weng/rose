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

import com.rose.exception.RequestHandlerException;
import com.rose.serializer.StreamSerializer;
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
	private static final Log LOG = LogFactory.getLog(RoseServlet.class);
	
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
			RoseResponse roseResponse = requestHandlerService.handlerRequest(roseRequest);
			
			//设置返回内容及编码
			resp.setCharacterEncoding(roseResponse.getCharacterEncoding());
			resp.setContentType(roseResponse.getContentType());
			
			//返回结果
			marshalResponse(roseResponse, resp);
		} catch (RequestHandlerException e) {
			
		}catch (Exception e) {
			LOG.error(e);
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}
	
	private RoseRequest unmarshalRequest(HttpServletRequest httpServletRequest) throws IOException {
		String requestXml = IOUtils.toString(httpServletRequest.getInputStream());
		LOG.info("Request receive:" + requestXml);
		return (RoseRequest) streamSerializer.unmarshal(new ByteArrayInputStream(requestXml.getBytes()), Charsets.UTF_8);
	}
	
	private void marshalResponse(RoseResponse response, HttpServletResponse httpServletResponse) throws Exception {
		String responseXml = marshalToString(response);
		if (LOG.isInfoEnabled()) {
			LOG.info("Response back:" + responseXml);
		}
		httpServletResponse.getOutputStream().write(responseXml.getBytes());
		httpServletResponse.getOutputStream().flush();
	}
	
	private String marshalToString(RoseResponse roseResponse) throws UnsupportedEncodingException {
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
