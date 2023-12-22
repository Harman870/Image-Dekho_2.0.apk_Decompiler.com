package v2;

import androidx.activity.f;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f12494a;

    public h(long j10) {
        this.f12494a = j10;
    }

    public final long b() {
        return this.f12494a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f12494a == ((n) obj).b();
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f12494a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder g10 = f.g("LogResponse{nextRequestWaitMillis=");
        g10.append(this.f12494a);
        g10.append("}");
        return g10.toString();
    }
}
