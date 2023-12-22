package c6;

import androidx.activity.f;

public final class a extends k {

    /* renamed from: a  reason: collision with root package name */
    public final long f2466a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2467b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2468c;

    public a(long j10, long j11, long j12) {
        this.f2466a = j10;
        this.f2467b = j11;
        this.f2468c = j12;
    }

    public final long a() {
        return this.f2467b;
    }

    public final long b() {
        return this.f2466a;
    }

    public final long c() {
        return this.f2468c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2466a == kVar.b() && this.f2467b == kVar.a() && this.f2468c == kVar.c();
    }

    public final int hashCode() {
        long j10 = this.f2466a;
        long j11 = this.f2467b;
        long j12 = this.f2468c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder g10 = f.g("StartupTime{epochMillis=");
        g10.append(this.f2466a);
        g10.append(", elapsedRealtime=");
        g10.append(this.f2467b);
        g10.append(", uptimeMillis=");
        g10.append(this.f2468c);
        g10.append("}");
        return g10.toString();
    }
}
