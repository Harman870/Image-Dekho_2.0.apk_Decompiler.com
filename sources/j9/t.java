package j9;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import k9.e;
import t9.f;
import t9.h;

public final class t extends a0 {

    /* renamed from: e  reason: collision with root package name */
    public static final s f8964e = s.a("multipart/mixed");

    /* renamed from: f  reason: collision with root package name */
    public static final s f8965f = s.a("multipart/form-data");

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f8966g = {58, 32};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f8967h = {13, 10};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f8968i = {45, 45};

    /* renamed from: a  reason: collision with root package name */
    public final h f8969a;

    /* renamed from: b  reason: collision with root package name */
    public final s f8970b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f8971c;

    /* renamed from: d  reason: collision with root package name */
    public long f8972d = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h f8973a;

        /* renamed from: b  reason: collision with root package name */
        public s f8974b = t.f8964e;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f8975c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.f8973a = h.d(uuid);
        }
    }

    public static final class b {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final p f8976a;

        /* renamed from: b  reason: collision with root package name */
        public final a0 f8977b;

        public b(@Nullable p pVar, a0 a0Var) {
            this.f8976a = pVar;
            this.f8977b = a0Var;
        }
    }

    static {
        s.a("multipart/alternative");
        s.a("multipart/digest");
        s.a("multipart/parallel");
    }

    public t(h hVar, s sVar, ArrayList arrayList) {
        this.f8969a = hVar;
        this.f8970b = s.a(sVar + "; boundary=" + hVar.m());
        this.f8971c = e.l(arrayList);
    }

    public final long a() {
        long j10 = this.f8972d;
        if (j10 != -1) {
            return j10;
        }
        long d10 = d((f) null, true);
        this.f8972d = d10;
        return d10;
    }

    public final s b() {
        return this.f8970b;
    }

    public final void c(f fVar) {
        d(fVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: t9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: t9.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: t9.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: t9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: t9.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(@javax.annotation.Nullable t9.f r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            t9.e r13 = new t9.e
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<j9.t$b> r1 = r12.f8971c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00a3
            java.util.List<j9.t$b> r6 = r12.f8971c
            java.lang.Object r6 = r6.get(r5)
            j9.t$b r6 = (j9.t.b) r6
            j9.p r7 = r6.f8976a
            j9.a0 r6 = r6.f8977b
            byte[] r8 = f8968i
            r13.write(r8)
            t9.h r8 = r12.f8969a
            r13.y(r8)
            byte[] r8 = f8967h
            r13.write(r8)
            if (r7 == 0) goto L_0x0059
            java.lang.String[] r8 = r7.f8939a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = r2
        L_0x0039:
            if (r9 >= r8) goto L_0x0059
            java.lang.String r10 = r7.d(r9)
            t9.f r10 = r13.F(r10)
            byte[] r11 = f8966g
            t9.f r10 = r10.write(r11)
            java.lang.String r11 = r7.g(r9)
            t9.f r10 = r10.F(r11)
            byte[] r11 = f8967h
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0059:
            j9.s r7 = r6.b()
            if (r7 == 0) goto L_0x0070
            java.lang.String r8 = "Content-Type: "
            t9.f r8 = r13.F(r8)
            java.lang.String r7 = r7.f8961a
            t9.f r7 = r8.F(r7)
            byte[] r8 = f8967h
            r7.write(r8)
        L_0x0070:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008a
            java.lang.String r9 = "Content-Length: "
            t9.f r9 = r13.F(r9)
            t9.f r9 = r9.G(r7)
            byte[] r10 = f8967h
            r9.write(r10)
            goto L_0x0090
        L_0x008a:
            if (r14 == 0) goto L_0x0090
            r0.c()
            return r9
        L_0x0090:
            byte[] r9 = f8967h
            r13.write(r9)
            if (r14 == 0) goto L_0x0099
            long r3 = r3 + r7
            goto L_0x009c
        L_0x0099:
            r6.c(r13)
        L_0x009c:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a3:
            byte[] r1 = f8968i
            r13.write(r1)
            t9.h r2 = r12.f8969a
            r13.y(r2)
            r13.write(r1)
            byte[] r1 = f8967h
            r13.write(r1)
            if (r14 == 0) goto L_0x00bd
            long r13 = r0.f12045b
            long r3 = r3 + r13
            r0.c()
        L_0x00bd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.t.d(t9.f, boolean):long");
    }
}
