package y6;

import androidx.activity.f;
import androidx.fragment.app.v0;
import o.g;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f13049a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13050b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13051c;

    /* renamed from: d  reason: collision with root package name */
    public final f f13052d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13053e;

    public a(String str, String str2, String str3, f fVar, int i10) {
        this.f13049a = str;
        this.f13050b = str2;
        this.f13051c = str3;
        this.f13052d = fVar;
        this.f13053e = i10;
    }

    public final f a() {
        return this.f13052d;
    }

    public final String b() {
        return this.f13050b;
    }

    public final String c() {
        return this.f13051c;
    }

    public final int d() {
        return this.f13053e;
    }

    public final String e() {
        return this.f13049a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f13049a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f13050b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f13051c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f13052d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i10 = this.f13053e;
                        int d10 = dVar.d();
                        if (i10 == 0) {
                            if (d10 == 0) {
                                return true;
                            }
                        } else if (g.a(i10, d10)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13049a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f13050b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13051c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f13052d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        int i11 = this.f13053e;
        if (i11 != 0) {
            i10 = g.b(i11);
        }
        return hashCode4 ^ i10;
    }

    public final String toString() {
        StringBuilder g10 = f.g("InstallationResponse{uri=");
        g10.append(this.f13049a);
        g10.append(", fid=");
        g10.append(this.f13050b);
        g10.append(", refreshToken=");
        g10.append(this.f13051c);
        g10.append(", authToken=");
        g10.append(this.f13052d);
        g10.append(", responseCode=");
        g10.append(v0.i(this.f13053e));
        g10.append("}");
        return g10.toString();
    }
}
