package c3;

import androidx.activity.f;
import c3.e;
import java.util.Set;

public final class c extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f2381a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2382b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<e.b> f2383c;

    public static final class a extends e.a.C0022a {

        /* renamed from: a  reason: collision with root package name */
        public Long f2384a;

        /* renamed from: b  reason: collision with root package name */
        public Long f2385b;

        /* renamed from: c  reason: collision with root package name */
        public Set<e.b> f2386c;

        public final c a() {
            String str;
            if (this.f2384a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f2385b == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " maxAllowedDelay");
            }
            if (this.f2386c == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f2384a.longValue(), this.f2385b.longValue(), this.f2386c);
            }
            throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
        }
    }

    public c(long j10, long j11, Set set) {
        this.f2381a = j10;
        this.f2382b = j11;
        this.f2383c = set;
    }

    public final long a() {
        return this.f2381a;
    }

    public final Set<e.b> b() {
        return this.f2383c;
    }

    public final long c() {
        return this.f2382b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f2381a == aVar.a() && this.f2382b == aVar.c() && this.f2383c.equals(aVar.b());
    }

    public final int hashCode() {
        long j10 = this.f2381a;
        long j11 = this.f2382b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f2383c.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("ConfigValue{delta=");
        g10.append(this.f2381a);
        g10.append(", maxAllowedDelay=");
        g10.append(this.f2382b);
        g10.append(", flags=");
        g10.append(this.f2383c);
        g10.append("}");
        return g10.toString();
    }
}
