package org.rose.webservice.client.http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

import org.rose.webservice.util.IOUtils;

/**
 * @author yangyang
 * @since 2009-5-13
 */
public final class StreamableReader implements Streamable {
    private Reader reader;
    private String charset;

    public StreamableReader(Reader reader, String charset) {
        this.reader = reader;
        this.charset = charset;
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        IOUtils.flush(reader, new OutputStreamWriter(outputStream, charset), false);
    }
}
