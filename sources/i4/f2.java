package i4;

public final class f2 implements m2 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f7300a;

    /* renamed from: b  reason: collision with root package name */
    public final x2 f7301b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7302c;

    /* renamed from: d  reason: collision with root package name */
    public final q0 f7303d;

    public f2(x2 x2Var, q0 q0Var, b2 b2Var) {
        this.f7301b = x2Var;
        this.f7302c = q0Var.h(b2Var);
        this.f7303d = q0Var;
        this.f7300a = b2Var;
    }

    public final void a(Object obj) {
        this.f7301b.m(obj);
        this.f7303d.e(obj);
    }

    public final int b(Object obj) {
        x2 x2Var = this.f7301b;
        int b10 = x2Var.b(x2Var.d(obj));
        if (!this.f7302c) {
            return b10;
        }
        this.f7303d.a(obj);
        throw null;
    }

    public final void c(Object obj, Object obj2) {
        x2 x2Var = this.f7301b;
        Class cls = n2.f7515a;
        x2Var.o(obj, x2Var.e(x2Var.d(obj), x2Var.d(obj2)));
        if (this.f7302c) {
            this.f7303d.a(obj2);
            throw null;
        }
    }

    public final boolean d(Object obj, Object obj2) {
        if (!this.f7301b.d(obj).equals(this.f7301b.d(obj2))) {
            return false;
        }
        if (!this.f7302c) {
            return true;
        }
        this.f7303d.a(obj);
        this.f7303d.a(obj2);
        throw null;
    }

    public final boolean e(Object obj) {
        this.f7303d.a(obj);
        throw null;
    }

    public final int f(Object obj) {
        int hashCode = this.f7301b.d(obj).hashCode();
        if (!this.f7302c) {
            return hashCode;
        }
        this.f7303d.a(obj);
        throw null;
    }

    public final void g(Object obj, byte[] bArr, int i10, int i11, w wVar) {
        c1 c1Var = (c1) obj;
        if (c1Var.zzc == y2.f7804f) {
            c1Var.zzc = y2.b();
        }
        a1 a1Var = (a1) obj;
        throw null;
    }

    public final void h(Object obj, m0 m0Var) {
        this.f7303d.a(obj);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0095 A[EDGE_INSN: B:66:0x0095->B:43:0x0095 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Object r12, i4.h0 r13, i4.p0 r14) {
        /*
            r11 = this;
            i4.x2 r0 = r11.f7301b
            i4.q0 r1 = r11.f7303d
            i4.y2 r2 = r0.c(r12)
            r1.b(r12)
        L_0x000b:
            int r3 = r13.t()     // Catch:{ all -> 0x00b5 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x00b1
            int r3 = r13.f7341b     // Catch:{ all -> 0x00b5 }
            r5 = 11
            r6 = 0
            if (r3 == r5) goto L_0x004d
            r4 = r3 & 7
            r5 = 2
            if (r4 != r5) goto L_0x0033
            i4.b2 r4 = r11.f7300a     // Catch:{ all -> 0x00b5 }
            int r3 = r3 >>> 3
            i4.b1 r3 = r1.c(r14, r4, r3)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x002e
            r1.f()     // Catch:{ all -> 0x00b5 }
            goto L_0x000b
        L_0x002e:
            boolean r3 = r0.p(r2, r13)     // Catch:{ all -> 0x00b5 }
            goto L_0x0047
        L_0x0033:
            i4.g0 r3 = r13.f7340a     // Catch:{ all -> 0x00b5 }
            boolean r4 = r3.c()     // Catch:{ all -> 0x00b5 }
            if (r4 != 0) goto L_0x0046
            int r4 = r13.f7341b     // Catch:{ all -> 0x00b5 }
            int r5 = r13.f7342c     // Catch:{ all -> 0x00b5 }
            if (r4 != r5) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            boolean r6 = r3.e(r4)     // Catch:{ all -> 0x00b5 }
        L_0x0046:
            r3 = r6
        L_0x0047:
            if (r3 != 0) goto L_0x000b
            r0.n(r12, r2)
            return
        L_0x004d:
            r3 = 0
            r5 = r3
            r7 = r6
        L_0x0050:
            int r8 = r13.t()     // Catch:{ all -> 0x00b5 }
            if (r8 != r4) goto L_0x0057
            goto L_0x0095
        L_0x0057:
            int r8 = r13.f7341b     // Catch:{ all -> 0x00b5 }
            r9 = 16
            if (r8 != r9) goto L_0x006f
            r13.q(r6)     // Catch:{ all -> 0x00b5 }
            i4.g0 r3 = r13.f7340a     // Catch:{ all -> 0x00b5 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ all -> 0x00b5 }
            int r7 = r3.i()     // Catch:{ all -> 0x00b5 }
            i4.b2 r3 = r11.f7300a     // Catch:{ all -> 0x00b5 }
            i4.b1 r3 = r1.c(r14, r3, r7)     // Catch:{ all -> 0x00b5 }
            goto L_0x0050
        L_0x006f:
            r9 = 26
            if (r8 != r9) goto L_0x007e
            if (r3 == 0) goto L_0x0079
            r1.f()     // Catch:{ all -> 0x00b5 }
            goto L_0x0050
        L_0x0079:
            i4.d0 r5 = r13.u()     // Catch:{ all -> 0x00b5 }
            goto L_0x0050
        L_0x007e:
            i4.g0 r8 = r13.f7340a     // Catch:{ all -> 0x00b5 }
            boolean r9 = r8.c()     // Catch:{ all -> 0x00b5 }
            if (r9 != 0) goto L_0x0092
            int r9 = r13.f7341b     // Catch:{ all -> 0x00b5 }
            int r10 = r13.f7342c     // Catch:{ all -> 0x00b5 }
            if (r9 != r10) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            boolean r8 = r8.e(r9)     // Catch:{ all -> 0x00b5 }
            goto L_0x0093
        L_0x0092:
            r8 = r6
        L_0x0093:
            if (r8 != 0) goto L_0x0050
        L_0x0095:
            int r4 = r13.f7341b     // Catch:{ all -> 0x00b5 }
            r6 = 12
            if (r4 != r6) goto L_0x00a9
            if (r5 == 0) goto L_0x000b
            if (r3 == 0) goto L_0x00a4
            r1.g()     // Catch:{ all -> 0x00b5 }
            goto L_0x000b
        L_0x00a4:
            r0.k(r2, r7, r5)     // Catch:{ all -> 0x00b5 }
            goto L_0x000b
        L_0x00a9:
            i4.i1 r13 = new i4.i1     // Catch:{ all -> 0x00b5 }
            java.lang.String r14 = "Protocol message end-group tag did not match expected tag."
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x00b5 }
            throw r13     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.n(r12, r2)
            return
        L_0x00b5:
            r13 = move-exception
            r0.n(r12, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.f2.i(java.lang.Object, i4.h0, i4.p0):void");
    }

    public final c1 zze() {
        b2 b2Var = this.f7300a;
        return b2Var instanceof c1 ? ((c1) b2Var).s() : b2Var.c().f();
    }
}
