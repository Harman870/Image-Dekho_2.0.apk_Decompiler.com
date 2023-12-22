package x6;

import androidx.activity.e;
import androidx.activity.f;
import androidx.fragment.app.w0;
import o.g;
import x6.d;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f12970b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12971c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12972d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12973e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12974f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12975g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12976h;

    /* renamed from: x6.a$a  reason: collision with other inner class name */
    public static final class C0166a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12977a;

        /* renamed from: b  reason: collision with root package name */
        public int f12978b;

        /* renamed from: c  reason: collision with root package name */
        public String f12979c;

        /* renamed from: d  reason: collision with root package name */
        public String f12980d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12981e;

        /* renamed from: f  reason: collision with root package name */
        public Long f12982f;

        /* renamed from: g  reason: collision with root package name */
        public String f12983g;

        public C0166a() {
        }

        public C0166a(d dVar) {
            this.f12977a = dVar.c();
            this.f12978b = dVar.f();
            this.f12979c = dVar.a();
            this.f12980d = dVar.e();
            this.f12981e = Long.valueOf(dVar.b());
            this.f12982f = Long.valueOf(dVar.g());
            this.f12983g = dVar.d();
        }

        public final a a() {
            String str;
            if (this.f12978b == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (this.f12981e == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " expiresInSecs");
            }
            if (this.f12982f == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f12977a, this.f12978b, this.f12979c, this.f12980d, this.f12981e.longValue(), this.f12982f.longValue(), this.f12983g);
            }
            throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
        }

        public final C0166a b(int i10) {
            if (i10 != 0) {
                this.f12978b = i10;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }
    }

    public a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f12970b = str;
        this.f12971c = i10;
        this.f12972d = str2;
        this.f12973e = str3;
        this.f12974f = j10;
        this.f12975g = j11;
        this.f12976h = str4;
    }

    public final String a() {
        return this.f12972d;
    }

    public final long b() {
        return this.f12974f;
    }

    public final String c() {
        return this.f12970b;
    }

    public final String d() {
        return this.f12976h;
    }

    public final String e() {
        return this.f12973e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f12970b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (g.a(this.f12971c, dVar.f()) && ((str = this.f12972d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f12973e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f12974f == dVar.b() && this.f12975g == dVar.g()) {
                String str4 = this.f12976h;
                String d10 = dVar.d();
                if (str4 == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (str4.equals(d10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.f12971c;
    }

    public final long g() {
        return this.f12975g;
    }

    public final C0166a h() {
        return new C0166a(this);
    }

    public final int hashCode() {
        String str = this.f12970b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ g.b(this.f12971c)) * 1000003;
        String str2 = this.f12972d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12973e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f12974f;
        long j11 = this.f12975g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f12976h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder g10 = f.g("PersistedInstallationEntry{firebaseInstallationId=");
        g10.append(this.f12970b);
        g10.append(", registrationStatus=");
        g10.append(w0.m(this.f12971c));
        g10.append(", authToken=");
        g10.append(this.f12972d);
        g10.append(", refreshToken=");
        g10.append(this.f12973e);
        g10.append(", expiresInSecs=");
        g10.append(this.f12974f);
        g10.append(", tokenCreationEpochInSecs=");
        g10.append(this.f12975g);
        g10.append(", fisError=");
        return e.c(g10, this.f12976h, "}");
    }
}
