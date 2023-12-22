package x2;

import androidx.activity.f;
import java.util.Arrays;
import w2.n;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<n> f12926a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12927b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f12926a = iterable;
        this.f12927b = bArr;
    }

    public final Iterable<n> a() {
        return this.f12926a;
    }

    public final byte[] b() {
        return this.f12927b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f12926a.equals(fVar.a())) {
            if (Arrays.equals(this.f12927b, fVar instanceof a ? ((a) fVar).f12927b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12926a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12927b);
    }

    public final String toString() {
        StringBuilder g10 = f.g("BackendRequest{events=");
        g10.append(this.f12926a);
        g10.append(", extras=");
        g10.append(Arrays.toString(this.f12927b));
        g10.append("}");
        return g10.toString();
    }
}
