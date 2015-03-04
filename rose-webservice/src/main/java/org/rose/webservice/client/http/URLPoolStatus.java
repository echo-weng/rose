package org.rose.webservice.client.http;

/**
 * @author yangyang
 * @since 2009-4-1
 */
public final class URLPoolStatus extends URLStatus {
    private int idleCount;

    public int getIdleCount() {
        return idleCount;
    }

    public void setIdleCount(int idleCount) {
        this.idleCount = idleCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        URLPoolStatus that = (URLPoolStatus) o;

        if (idleCount != that.idleCount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idleCount;
        return result;
    }
}
