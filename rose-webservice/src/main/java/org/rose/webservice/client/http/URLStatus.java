package org.rose.webservice.client.http;

/**
 * The status of the http connections for a specific url
 *
 * @author yangyang
 * @since 2009-4-3
 * @see HttpConnectionFactory
 * @see HttpConnection
 */
public class URLStatus {
    private int runningCount;

    public int getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(int runningCount) {
        this.runningCount = runningCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        URLStatus urlStatus = (URLStatus) o;

        if (runningCount != urlStatus.runningCount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return runningCount;
    }
}
