package q1;

import java.security.MessageDigest;

public final class f implements o1.f {

    /* renamed from: b  reason: collision with root package name */
    public final o1.f f10998b;

    /* renamed from: c  reason: collision with root package name */
    public final o1.f f10999c;

    public f(o1.f fVar, o1.f fVar2) {
        this.f10998b = fVar;
        this.f10999c = fVar2;
    }

    public final void b(MessageDigest messageDigest) {
        this.f10998b.b(messageDigest);
        this.f10999c.b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10998b.equals(fVar.f10998b) && this.f10999c.equals(fVar.f10999c);
    }

    public final int hashCode() {
        return this.f10999c.hashCode() + (this.f10998b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("DataCacheKey{sourceKey=");
        g10.append(this.f10998b);
        g10.append(", signature=");
        g10.append(this.f10999c);
        g10.append('}');
        return g10.toString();
    }
}
