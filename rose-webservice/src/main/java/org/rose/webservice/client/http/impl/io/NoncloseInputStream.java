package org.rose.webservice.client.http.impl.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author yangyang
 * @since 2009-4-16
 */
public final class NoncloseInputStream extends FilterInputStream {
    public NoncloseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
    }

    public InputStream getInputStream() {
        return in;
    }
}
