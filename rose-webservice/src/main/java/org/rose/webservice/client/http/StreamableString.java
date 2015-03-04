package org.rose.webservice.client.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.rose.webservice.util.IOUtils;

/**
 * @author yangyang
 * @since 2009-5-13
 */
public final class StreamableString implements Streamable {
    private String string;
    private String charset;

    public StreamableString(String string, String charset) {
        this.string = string;
        this.charset = charset;
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        IOUtils.flush(new ByteArrayInputStream(string.getBytes(charset)), outputStream, false);
    }
}
