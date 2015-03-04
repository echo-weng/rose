package org.rose.webservice.client;

import java.io.InputStream;
import java.io.Reader;

import org.rose.webservice.client.http.HttpConnectionContext;
import org.rose.webservice.client.http.URLWrapper;

/**
 * Simple client is used to get some response by get or post
 */
public interface SimpleClient extends Client {

    /**
     * get the response from a url
     *
     * @param urlWrapper url with alias
     * @return the response string
     */
    String get(URLWrapper urlWrapper);

    /**
     * post some data to a url to get the response
     *
     * @param urlWrapper url with alias
     * @param data       the data to post
     * @return the response string
     */
    String post(URLWrapper urlWrapper, String data);

    /**
     * post some datastream to a url to get the response
     *
     * @param urlWrapper url with alias
     * @param dataStream the data stream to post
     * @return the response string
     */
    InputStream post(URLWrapper urlWrapper, InputStream dataStream);

    /**
     * post some data in data reader to a url to get the response
     *
     * @param urlWrapper url with alias
     * @param dataReader the data in data reader to post
     * @return the response string
     */
    Reader post(URLWrapper urlWrapper, Reader dataReader);

    /**
     * get the response from a url with a http connection context
     *
     * @param urlWrapper            url with alias
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    String get(URLWrapper urlWrapper, HttpConnectionContext httpConnectionContext);

    /**
     * get the response from a url with a http connection context
     *
     * @param urlWrapper            url with alias
     * @param data                  the data to post
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    String post(URLWrapper urlWrapper, String data,
                HttpConnectionContext httpConnectionContext);

    /**
     * post some datastream to a url to get the response
     *
     * @param urlWrapper            url with alias
     * @param dataStream            the data stream to post
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    InputStream post(URLWrapper urlWrapper, InputStream dataStream,
                     HttpConnectionContext httpConnectionContext);

    /**
     * post some data in data reader to a url to get the response
     *
     * @param urlWrapper            url with alias
     * @param dataReader            the data in data reader to post
     * @param httpConnectionContext the http connection context
     * @return the response string
     */
    Reader post(URLWrapper urlWrapper, Reader dataReader,
                HttpConnectionContext httpConnectionContext);

}
