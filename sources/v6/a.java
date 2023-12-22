package v6;

import androidx.activity.f;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final String f12618a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12619b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12620c;

    public a(String str, long j10, long j11) {
        this.f12618a = str;
        this.f12619b = j10;
        this.f12620c = j11;
    }

    public final String a() {
        return this.f12618a;
    }

    public final long b() {
        return this.f12620c;
    }

    public final long c() {
        return this.f12619b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12618a.equals(jVar.a()) && this.f12619b == jVar.c() && this.f12620c == jVar.b();
    }

    public final int hashCode() {
        long j10 = this.f12619b;
        long j11 = this.f12620c;
        return ((((this.f12618a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder g10 = f.g("InstallationTokenResult{token=");
        g10.append(this.f12618a);
        g10.append(", tokenExpirationTimestamp=");
        g10.append(this.f12619b);
        g10.append(", tokenCreationTimestamp=");
        g10.append(this.f12620c);
        g10.append("}");
        return g10.toString();
    }
}
