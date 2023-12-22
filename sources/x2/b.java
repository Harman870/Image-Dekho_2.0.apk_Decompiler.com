package x2;

import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import o.g;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final int f12928a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12929b;

    public b(int i10, long j10) {
        if (i10 != 0) {
            this.f12928a = i10;
            this.f12929b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final long a() {
        return this.f12929b;
    }

    public final int b() {
        return this.f12928a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g.a(this.f12928a, gVar.b()) && this.f12929b == gVar.a();
    }

    public final int hashCode() {
        long j10 = this.f12929b;
        return ((g.b(this.f12928a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder g10 = f.g("BackendResponse{status=");
        g10.append(a.m(this.f12928a));
        g10.append(", nextRequestWaitMillis=");
        g10.append(this.f12929b);
        g10.append("}");
        return g10.toString();
    }
}
