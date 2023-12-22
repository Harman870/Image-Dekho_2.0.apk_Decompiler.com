package z5;

import z5.b;

public final class r extends b.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f13225a;

    public /* synthetic */ r(long j10) {
        this.f13225a = j10;
    }

    public final long a() {
        return this.f13225a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b.a) && this.f13225a == ((b.a) obj).a();
    }

    public final int hashCode() {
        long j10 = this.f13225a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        long j10 = this.f13225a;
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + j10 + "}";
    }
}
