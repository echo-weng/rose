package org.rose.webservice.client.http;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author yangyang
 * @since 2009-5-13
 */
public interface Streamable {
    public void write(OutputStream outputStream) throws IOException;
}
