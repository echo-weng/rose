package org.rose.webservice.util;

import java.io.*;

/**
 * 
 * @author Norther
 * 
 */
public abstract class IOUtils {
    public static final int DEFAULT_BUFFER_SIZE = 1024;

    public static ByteArrayOutputStream newByteArrayOutputStream() {
        return new ByteArrayOutputStream(IOUtils.DEFAULT_BUFFER_SIZE);
    }

    public static String readAsString(Reader reader) throws IOException {
		StringWriter stringWriter = new StringWriter();
        flush(reader, stringWriter);
        return stringWriter.toString();
	}

    /**
     * Read the input stream as a string
     * @param inputStream
     * @param charsetName
     * @return
     * @throws IOException
     */
	public static String readAsString(InputStream inputStream, String charsetName) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        flush(inputStream, outputStream);
        return new String(outputStream.toByteArray(), charsetName);
	}

	/**
	 * Flush the data in the reader to a specific writer
	 * 
	 * @param reader
	 * @param writer
	 * @throws IOException
	 */
    public static void flush(Reader reader, Writer writer) throws IOException {
		flush(reader, writer, true);
	}

	public static void flush(Reader reader, Writer writer, boolean close) throws IOException {
		try {
			char[] buffer = new char[DEFAULT_BUFFER_SIZE];
			for (int length = reader.read(buffer); length > 0; length = reader.read(buffer)) {
				writer.write(buffer, 0, length);
			}
		} finally {
            if(!close) {
                return;
            }
			if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                }
            }
		}
	}

	/**
	 * Flush the data from the inputstream to a specific outputstream
	 * 
	 * @param inputStream
	 * @param outputStream
	 * @throws IOException
	 */
	public static void flush(InputStream inputStream, OutputStream outputStream) throws IOException {
		flush(inputStream, outputStream, true);
	}

    public static void flush(InputStream inputStream, OutputStream outputStream, boolean close) throws IOException {
		try {
			byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
			for (int length = inputStream.read(buffer); length > 0; length = inputStream.read(buffer)) {
				outputStream.write(buffer, 0, length);
			}
		} finally {
            if(!close) {
                return;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                }
            }
		}
	}
}
