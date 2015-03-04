package org.rose.webservice.client.http.impl.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author yangyang
 * @since 2009-5-13
 */
public final class NoncloseOutputStream extends FilterOutputStream {
    public NoncloseOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void close() throws IOException {
    }
}
