package v2;

import androidx.activity.e;
import androidx.activity.f;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f12459a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12460b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12461c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12462d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12463e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12464f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12465g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12466h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12467i;

    /* renamed from: j  reason: collision with root package name */
    public final String f12468j;
    public final String k;

    /* renamed from: l  reason: collision with root package name */
    public final String f12469l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f12459a = num;
        this.f12460b = str;
        this.f12461c = str2;
        this.f12462d = str3;
        this.f12463e = str4;
        this.f12464f = str5;
        this.f12465g = str6;
        this.f12466h = str7;
        this.f12467i = str8;
        this.f12468j = str9;
        this.k = str10;
        this.f12469l = str11;
    }

    public final String a() {
        return this.f12469l;
    }

    public final String b() {
        return this.f12468j;
    }

    public final String c() {
        return this.f12462d;
    }

    public final String d() {
        return this.f12466h;
    }

    public final String e() {
        return this.f12461c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f12459a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f12460b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f12461c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f12462d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f12463e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f12464f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f12465g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f12466h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f12467i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f12468j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f12469l;
                                                    String a10 = aVar.a();
                                                    if (str11 == null) {
                                                        if (a10 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(a10)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f12467i;
    }

    public final String g() {
        return this.f12465g;
    }

    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        Integer num = this.f12459a;
        int i10 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f12460b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12461c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12462d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12463e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f12464f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f12465g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f12466h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f12467i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f12468j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f12469l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode11 ^ i10;
    }

    public final String i() {
        return this.f12460b;
    }

    public final String j() {
        return this.f12464f;
    }

    public final String k() {
        return this.f12463e;
    }

    public final Integer l() {
        return this.f12459a;
    }

    public final String toString() {
        StringBuilder g10 = f.g("AndroidClientInfo{sdkVersion=");
        g10.append(this.f12459a);
        g10.append(", model=");
        g10.append(this.f12460b);
        g10.append(", hardware=");
        g10.append(this.f12461c);
        g10.append(", device=");
        g10.append(this.f12462d);
        g10.append(", product=");
        g10.append(this.f12463e);
        g10.append(", osBuild=");
        g10.append(this.f12464f);
        g10.append(", manufacturer=");
        g10.append(this.f12465g);
        g10.append(", fingerprint=");
        g10.append(this.f12466h);
        g10.append(", locale=");
        g10.append(this.f12467i);
        g10.append(", country=");
        g10.append(this.f12468j);
        g10.append(", mccMnc=");
        g10.append(this.k);
        g10.append(", applicationBuild=");
        return e.c(g10, this.f12469l, "}");
    }
}
