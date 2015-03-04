package org.rose.webservice.client;

import java.io.IOException;
import java.io.OutputStream;

import org.rose.webservice.client.http.Streamable;
import org.rose.webservice.serializer.StreamSerializer;

/**
 * 
 * 
 * @author yangyang
 * @since 2009-7-27
 */
public class StreamableObject implements Streamable {

    private StreamSerializer streamSerializer;
    private Object object;
    private String encoding;

    public StreamableObject(StreamSerializer streamSerializer, Object object, String encoding) {
        this.streamSerializer = streamSerializer;
        this.object = object;
        this.encoding = encoding;
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        streamSerializer.marshal(object, outputStream, encoding);
    }
}
