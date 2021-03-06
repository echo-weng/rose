package org.rose.webservice.client.http.impl.io;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.rose.webservice.client.http.Constant;
import org.rose.webservice.client.http.HttpConnection;
import org.rose.webservice.util.IOUtils;

/**
 * HttpSocketRequestStream is a wrapper of a http standard output stream.
 * It is based on the http 1.1 protocol.
 * Using this output stream, should set the http path, version, method,
 * headers first, then it can be used to write as the body part.
 *
 * @author yangyang
 * @since 2009-3-15
 */
public final class HttpSocketRequestStream extends FilterOutputStream {
    private final Log log = LogFactory.getLog(HttpSocketRequestStream.class);

    public HttpSocketRequestStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte[] b) throws IOException {
        if(checkDelayedBuffer()) {
            bufferStream.write(b);
            return;
        }
        writeHttpMetaData();
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        if(checkDelayedBuffer()) {
            bufferStream.write(b, off, len);
            return;
        }
        writeHttpMetaData();
        super.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
        if(checkDelayedBuffer()) {
            bufferStream.write(b);
            return;
        }
        writeHttpMetaData();
        super.write(b);
    }

    @Override
    public void flush() throws IOException {
        if(checkDelayedBuffer()) {
            bufferStream.close();
            headers.put(HttpConnection.HEADER_CONTENT_LENGTH, "" + byteArrayOutputStream.toByteArray().length);
        }
        writeHttpMetaData();
        super.flush();
    }

    private String httpMethod;
    private String path;
    private String version;
    private Properties headers;
    private boolean isHttpMetaDataWrited = false;

    private boolean isDelayChecked = false;
    private boolean isDelayEnabled = false;
    private OutputStream bufferStream;
    private ByteArrayOutputStream byteArrayOutputStream;

    protected synchronized void writeHttpMetaData() throws IOException {
        if(isHttpMetaDataWrited) {
            return;
        }        

        if(log.isDebugEnabled()) {
            log.debug("HTTP Request Data");
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out, Constant.HTTP_META_DEFAULT_CHARSET));
        String pathLine = this.getHttpMethod() + " " + getPath() + " " + "HTTP/" + version ;
        if(log.isDebugEnabled()) {
            log.debug(">>>> " + pathLine);
        }
        bufferedWriter.write(pathLine + Constant.LINE_SEPARATOR);

        for (Object headerName : headers.keySet()) {
            String headNameString = (String) headerName;
            String line = headNameString + ": " + headers.getProperty(headNameString);
            if (log.isDebugEnabled()) {
                log.debug(">> " + line);
            }
            bufferedWriter.write(line + Constant.LINE_SEPARATOR);
        }

        bufferedWriter.write(Constant.LINE_SEPARATOR);
        bufferedWriter.flush();

        if (isChunk()) {
            if (isGZIP()) {
                out = new GZIPOutputStream(out);
            }
            out = new ChunkedOutputStream(out);
        } else {
            IOUtils.flush(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), out, false);
        }
        isHttpMetaDataWrited = true;
    }

    private boolean isChunk() {
        return HttpConnection.HEADER_VALUE_TRANSFER_ENCODING_CHUNK.equals(headers.get(HttpConnection.HEADER_TRANSFER_ENCODING));
    }

    private boolean checkDelayedBuffer() throws IOException {
        if(isDelayChecked) {
            return isDelayEnabled;
        }
        if (!isChunk()) {
            isDelayEnabled = true;
            byteArrayOutputStream = new ByteArrayOutputStream();
            if (isGZIP()) {
                bufferStream = new GZIPOutputStream(byteArrayOutputStream);
            } else {
                bufferStream = byteArrayOutputStream;
            }
        }
        isDelayChecked = true;
        return isDelayEnabled;
    }

    private boolean isGZIP() {
        return HttpConnection.HEADER_VALUE_CONTENT_ENCODING_GZIP.equals(headers.get(HttpConnection.HEADER_CONTENT_ENCODING));
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Properties getHeaders() {
        return headers;
    }

    public void setHeaders(Properties headers) {
        this.headers = headers;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
