package org.rose.webservice.client.http.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.rose.webservice.client.http.Constant;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.client.http.HttpUtils;
import org.rose.webservice.client.http.Streamable;
import org.rose.webservice.client.http.StreamableString;

/**
 * HttpConnection for statis http url. If there are any query parameter,
 * this connection is not proper.
 *
 * @author yangyang
 * @since 2009-02-01
 */
public final class FixedURLConnection extends BaseHttpConnection implements HttpConnection {
    private HttpURLConnection httpURLConnection;

    @Override
    public int execute() throws IOException {
        httpURLConnection.setRequestMethod(this.getHttpMethod());

        if (METHOD_POST.equals(this.getHttpMethod()) || METHOD_PUT.equals(this.getHttpMethod())) {
            httpURLConnection.setDoOutput(true);
        } else {
            httpURLConnection.setDoOutput(false);
        }

        httpURLConnection.setDoInput(true);

        for (Object headerName : this.getRequestHeaders().keySet()) {
            String headNameString = (String) headerName;
            httpURLConnection.setRequestProperty(headNameString, this.getRequestHeaders().getProperty(headNameString));
        }

        if (getRequestStream() == null && getRequestParameters() != null) {
            setRequestStream(new StreamableString(HttpUtils.getQueryString(
                    getRequestParameters(), this.getRequestCharset()), this.getRequestCharset()));
        }

        if (getRequestStream() != null) {
            Streamable inputStream = getRequestStream();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if(HEADER_VALUE_CONTENT_ENCODING_GZIP.equals(this.getRequestHeaders().get(HEADER_CONTENT_ENCODING))) {
                outputStream = new GZIPOutputStream(outputStream);
            }

            inputStream.write(outputStream);
            outputStream.flush();
            outputStream.close();
        }

        httpURLConnection.connect();

        setResponseHeaders(new Properties());
        for (String headerName : httpURLConnection.getHeaderFields().keySet()) {
            if (headerName == null) {
                continue;
            }
            List<String> values = httpURLConnection.getHeaderFields().get(headerName);
            if (values.size() == 1) {
                getResponseHeaders().setProperty(headerName, values.get(0));
            } else {
                getResponseHeaders().put(headerName, values);
            }
        }

        if(HEADER_VALUE_CONTENT_ENCODING_GZIP.equals(getResponseHeader(HEADER_CONTENT_ENCODING))) {
            setResponseStream(new GZIPInputStream(httpURLConnection.getInputStream()));
        } else {
            setResponseStream(httpURLConnection.getInputStream());
        }
        if(Constant.LOG.isDebugEnabled()) {
            Constant.LOG.debug("Response Stream " + getResponseStream().getClass().getName());
        }

        return httpURLConnection.getResponseCode();
    }

    @Override
    public void close() {
        super.close();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public HttpURLConnection getHttpURLConnection() {
        return httpURLConnection;
    }

    public void setHttpURLConnection(HttpURLConnection httpURLConnection) {
        this.httpURLConnection = httpURLConnection;
    }

	
}
