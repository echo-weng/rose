package org.rose.webservice.client.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.rose.webservice.util.IOUtils;

/**
 * @author yangyang
 * @since 2009-5-13
 */
public final class StreamableInputStream implements Streamable {
    private InputStream inputStream;

    public StreamableInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        IOUtils.flush(inputStream, outputStream, false);
    }
}
