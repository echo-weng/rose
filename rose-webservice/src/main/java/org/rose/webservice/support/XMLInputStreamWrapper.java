package org.rose.webservice.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import org.rose.webservice.util.XMLStreamUtils;

public class XMLInputStreamWrapper extends InputStream {
    public static final Set<Character> IGNORED_CHARS = new HashSet<Character>();
    static {
        IGNORED_CHARS.add('&');
        IGNORED_CHARS.add('<');
        IGNORED_CHARS.add('\"');
    }

    private InputStream inputStream;
    private StringBuffer stringBuffer = new StringBuffer();
    private int bufferIndex = 0;

    public XMLInputStreamWrapper(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public synchronized int read() throws IOException {
        if(stringBuffer.length() > 0 && bufferIndex < stringBuffer.length()) {
            int value = stringBuffer.charAt(bufferIndex);
            bufferIndex++;
            return value;
        }
        int value = inputStream.read();
        if(value != (int)'&' || value == -1) {
            return value;
        }
        stringBuffer = new StringBuffer();
        bufferIndex = 0;
        while (value != (int) ';') {
            stringBuffer.append((char) value);
            value = inputStream.read();
            if (value == -1) {
                return stringBuffer.charAt(0);
            }
        }
        stringBuffer.append(';');
        String parsedValue = XMLStreamUtils.parse(stringBuffer.toString());
        if (parsedValue.length() != 1) {
            throw new IllegalStateException("Illegal parsed result from [" + stringBuffer.toString() + "]");
        }
        value = parsedValue.charAt(0);
        if(!IGNORED_CHARS.contains((char)value)) {
            bufferIndex = stringBuffer.length() + 1;
            return value;
        }
        value = stringBuffer.charAt(bufferIndex);
        bufferIndex++;
        return value;
    }

    public void close() throws IOException {
        inputStream.close();
    }
}
