package v2;

import java.util.Arrays;
import v2.l;

public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f12473a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f12474b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12475c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f12476d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12477e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12478f;

    /* renamed from: g  reason: collision with root package name */
    public final o f12479g;

    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f12480a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12481b;

        /* renamed from: c  reason: collision with root package name */
        public Long f12482c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f12483d;

        /* renamed from: e  reason: collision with root package name */
        public String f12484e;

        /* renamed from: f  reason: collision with root package name */
        public Long f12485f;

        /* renamed from: g  reason: collision with root package name */
        public o f12486g;
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f12473a = j10;
        this.f12474b = num;
        this.f12475c = j11;
        this.f12476d = bArr;
        this.f12477e = str;
        this.f12478f = j12;
        this.f12479g = oVar;
    }

    public final Integer a() {
        return this.f12474b;
    }

    public final long b() {
        return this.f12473a;
    }

    public final long c() {
        return this.f12475c;
    }

    public final o d() {
        return this.f12479g;
    }

    public final byte[] e() {
        return this.f12476d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f12473a == lVar.b() && ((num = this.f12474b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f12475c == lVar.c()) {
            if (Arrays.equals(this.f12476d, lVar instanceof f ? ((f) lVar).f12476d : lVar.e()) && ((str = this.f12477e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f12478f == lVar.g()) {
                o oVar = this.f12479g;
                o d10 = lVar.d();
                if (oVar == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (oVar.equals(d10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f12477e;
    }

    public final long g() {
        return this.f12478f;
    }

    public final int hashCode() {
        long j10 = this.f12473a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f12474b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f12475c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f12476d)) * 1000003;
        String str = this.f12477e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f12478f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f12479g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("LogEvent{eventTimeMs=");
        g10.append(this.f12473a);
        g10.append(", eventCode=");
        g10.append(this.f12474b);
        g10.append(", eventUptimeMs=");
        g10.append(this.f12475c);
        g10.append(", sourceExtension=");
        g10.append(Arrays.toString(this.f12476d));
        g10.append(", sourceExtensionJsonProto3=");
        g10.append(this.f12477e);
        g10.append(", timezoneOffsetSeconds=");
        g10.append(this.f12478f);
        g10.append(", networkConnectionInfo=");
        g10.append(this.f12479g);
        g10.append("}");
        return g10.toString();
    }
}
