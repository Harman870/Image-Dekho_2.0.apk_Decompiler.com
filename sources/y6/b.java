package y6;

import androidx.fragment.app.w0;
import o.g;
import y6.f;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f13054a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13055b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13056c;

    public static final class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f13057a;

        /* renamed from: b  reason: collision with root package name */
        public int f13058b;

        public final b a() {
            String str;
            if (this.f13057a == null) {
                str = " tokenExpirationTimestamp";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new b((String) null, this.f13057a.longValue(), this.f13058b);
            }
            throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
        }
    }

    public b(String str, long j10, int i10) {
        this.f13054a = str;
        this.f13055b = j10;
        this.f13056c = i10;
    }

    public final int a() {
        return this.f13056c;
    }

    public final String b() {
        return this.f13054a;
    }

    public final long c() {
        return this.f13055b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f13054a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f13055b == fVar.c()) {
                int i10 = this.f13056c;
                int a10 = fVar.a();
                if (i10 == 0) {
                    if (a10 == 0) {
                        return true;
                    }
                } else if (g.a(i10, a10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13054a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f13055b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f13056c;
        if (i12 != 0) {
            i10 = g.b(i12);
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("TokenResult{token=");
        g10.append(this.f13054a);
        g10.append(", tokenExpirationTimestamp=");
        g10.append(this.f13055b);
        g10.append(", responseCode=");
        g10.append(w0.n(this.f13056c));
        g10.append("}");
        return g10.toString();
    }
}
