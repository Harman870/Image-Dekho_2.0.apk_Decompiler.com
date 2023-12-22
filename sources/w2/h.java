package w2;

import androidx.activity.f;
import java.util.Map;
import w2.n;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f12687a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f12688b;

    /* renamed from: c  reason: collision with root package name */
    public final m f12689c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12690d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12691e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f12692f;

    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12693a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12694b;

        /* renamed from: c  reason: collision with root package name */
        public m f12695c;

        /* renamed from: d  reason: collision with root package name */
        public Long f12696d;

        /* renamed from: e  reason: collision with root package name */
        public Long f12697e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f12698f;

        public final h b() {
            String str;
            if (this.f12693a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.f12695c == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " encodedPayload");
            }
            if (this.f12696d == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " eventMillis");
            }
            if (this.f12697e == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " uptimeMillis");
            }
            if (this.f12698f == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f12693a, this.f12694b, this.f12695c, this.f12696d.longValue(), this.f12697e.longValue(), this.f12698f);
            }
            throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.f12695c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f12693a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f12687a = str;
        this.f12688b = num;
        this.f12689c = mVar;
        this.f12690d = j10;
        this.f12691e = j11;
        this.f12692f = map;
    }

    public final Map<String, String> b() {
        return this.f12692f;
    }

    public final Integer c() {
        return this.f12688b;
    }

    public final m d() {
        return this.f12689c;
    }

    public final long e() {
        return this.f12690d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f12688b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof w2.n
            r2 = 0
            if (r1 == 0) goto L_0x005b
            w2.n r8 = (w2.n) r8
            java.lang.String r1 = r7.f12687a
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f12688b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.c()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            w2.m r1 = r7.f12689c
            w2.m r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f12690d
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f12691e
            long r5 = r8.h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f12692f
            java.util.Map r8 = r8.b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.h.equals(java.lang.Object):boolean");
    }

    public final String g() {
        return this.f12687a;
    }

    public final long h() {
        return this.f12691e;
    }

    public final int hashCode() {
        int hashCode = (this.f12687a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12688b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f12690d;
        long j11 = this.f12691e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f12689c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f12692f.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("EventInternal{transportName=");
        g10.append(this.f12687a);
        g10.append(", code=");
        g10.append(this.f12688b);
        g10.append(", encodedPayload=");
        g10.append(this.f12689c);
        g10.append(", eventMillis=");
        g10.append(this.f12690d);
        g10.append(", uptimeMillis=");
        g10.append(this.f12691e);
        g10.append(", autoMetadata=");
        g10.append(this.f12692f);
        g10.append("}");
        return g10.toString();
    }
}
