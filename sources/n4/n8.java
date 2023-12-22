package n4;

import j4.n2;

public final class n8 extends m8 {

    /* renamed from: g  reason: collision with root package name */
    public final n2 f10025g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f10026h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n8(b bVar, String str, int i10, n2 n2Var) {
        super(str, i10);
        this.f10026h = bVar;
        this.f10025g = n2Var;
    }

    public final int a() {
        return this.f10025g.t();
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Long r15, java.lang.Long r16, j4.c4 r17, boolean r18) {
        /*
            r14 = this;
            r0 = r14
            j4.va.a()
            n4.b r1 = r0.f10026h
            n4.n4 r1 = r1.f9600a
            n4.f r1 = r1.f9992g
            java.lang.String r2 = r0.f9967a
            n4.v2 r3 = n4.w2.V
            boolean r1 = r1.o(r2, r3)
            j4.n2 r2 = r0.f10025g
            boolean r2 = r2.z()
            j4.n2 r3 = r0.f10025g
            boolean r3 = r3.A()
            j4.n2 r4 = r0.f10025g
            boolean r4 = r4.B()
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x002f
            if (r3 != 0) goto L_0x002f
            if (r4 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = r5
            goto L_0x0030
        L_0x002f:
            r2 = r6
        L_0x0030:
            r3 = 0
            if (r18 == 0) goto L_0x005d
            if (r2 != 0) goto L_0x005d
            n4.b r1 = r0.f10026h
            n4.n4 r1 = r1.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            int r2 = r0.f9968b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            j4.n2 r4 = r0.f10025g
            boolean r4 = r4.C()
            if (r4 == 0) goto L_0x0057
            j4.n2 r3 = r0.f10025g
            int r3 = r3.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0057:
            java.lang.String r4 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r3)
            return r6
        L_0x005d:
            j4.n2 r7 = r0.f10025g
            j4.i2 r7 = r7.u()
            boolean r8 = r7.z()
            boolean r9 = r17.J()
            r10 = 0
            if (r9 == 0) goto L_0x00a4
            boolean r9 = r7.B()
            if (r9 != 0) goto L_0x0091
            n4.b r7 = r0.f10026h
            n4.n4 r7 = r7.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9831i
            n4.b r8 = r0.f10026h
            n4.n4 r8 = r8.f9600a
            n4.d3 r8 = r8.f9997m
            java.lang.String r9 = r17.y()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "No number filter for long property. property"
            goto L_0x0189
        L_0x0091:
            long r12 = r17.u()
            j4.l2 r7 = r7.v()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x016a }
            r9.<init>(r12)     // Catch:{ NumberFormatException -> 0x016a }
            java.lang.Boolean r3 = n4.m8.d(r9, r7, r10)     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x00a4:
            boolean r9 = r17.I()
            if (r9 == 0) goto L_0x00e3
            boolean r9 = r7.B()
            if (r9 != 0) goto L_0x00cc
            n4.b r7 = r0.f10026h
            n4.n4 r7 = r7.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9831i
            n4.b r8 = r0.f10026h
            n4.n4 r8 = r8.f9600a
            n4.d3 r8 = r8.f9997m
            java.lang.String r9 = r17.y()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "No number filter for double property. property"
            goto L_0x0189
        L_0x00cc:
            double r9 = r17.t()
            j4.l2 r7 = r7.v()
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x016a }
            r11.<init>(r9)     // Catch:{ NumberFormatException -> 0x016a }
            double r9 = java.lang.Math.ulp(r9)     // Catch:{ NumberFormatException -> 0x016a }
            java.lang.Boolean r3 = n4.m8.d(r11, r7, r9)     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x00e3:
            boolean r9 = r17.L()
            if (r9 == 0) goto L_0x016f
            boolean r9 = r7.D()
            if (r9 != 0) goto L_0x0156
            boolean r9 = r7.B()
            if (r9 != 0) goto L_0x0111
            n4.b r7 = r0.f10026h
            n4.n4 r7 = r7.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9831i
            n4.b r8 = r0.f10026h
            n4.n4 r8 = r8.f9600a
            n4.d3 r8 = r8.f9997m
            java.lang.String r9 = r17.y()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "No string or number filter defined. property"
            goto L_0x0189
        L_0x0111:
            java.lang.String r9 = r17.z()
            boolean r9 = n4.y7.I(r9)
            if (r9 == 0) goto L_0x0134
            java.lang.String r9 = r17.z()
            j4.l2 r7 = r7.v()
            boolean r12 = n4.y7.I(r9)
            if (r12 != 0) goto L_0x012a
            goto L_0x016a
        L_0x012a:
            java.math.BigDecimal r12 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x016a }
            r12.<init>(r9)     // Catch:{ NumberFormatException -> 0x016a }
            java.lang.Boolean r3 = n4.m8.d(r12, r7, r10)     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x0134:
            n4.b r7 = r0.f10026h
            n4.n4 r7 = r7.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9831i
            n4.b r8 = r0.f10026h
            n4.n4 r8 = r8.f9600a
            n4.d3 r8 = r8.f9997m
            java.lang.String r9 = r17.y()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = r17.z()
            java.lang.String r10 = "Invalid user property value for Numeric number filter. property, value"
            r7.c(r10, r8, r9)
            goto L_0x018c
        L_0x0156:
            java.lang.String r3 = r17.z()
            j4.q2 r7 = r7.w()
            n4.b r9 = r0.f10026h
            n4.n4 r9 = r9.f9600a
            n4.i3 r9 = r9.a()
            java.lang.Boolean r3 = n4.m8.e(r3, r7, r9)
        L_0x016a:
            java.lang.Boolean r3 = n4.m8.f(r3, r8)
            goto L_0x018c
        L_0x016f:
            n4.b r7 = r0.f10026h
            n4.n4 r7 = r7.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9831i
            n4.b r8 = r0.f10026h
            n4.n4 r8 = r8.f9600a
            n4.d3 r8 = r8.f9997m
            java.lang.String r9 = r17.y()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "User property has no value, property"
        L_0x0189:
            r7.b(r9, r8)
        L_0x018c:
            n4.b r7 = r0.f10026h
            n4.n4 r7 = r7.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9835n
            if (r3 != 0) goto L_0x019b
            java.lang.String r8 = "null"
            goto L_0x019c
        L_0x019b:
            r8 = r3
        L_0x019c:
            java.lang.String r9 = "Property filter result"
            r7.b(r9, r8)
            if (r3 != 0) goto L_0x01a4
            return r5
        L_0x01a4:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0.f9969c = r5
            if (r4 == 0) goto L_0x01b2
            boolean r4 = r3.booleanValue()
            if (r4 == 0) goto L_0x01b1
            goto L_0x01b2
        L_0x01b1:
            return r6
        L_0x01b2:
            if (r18 == 0) goto L_0x01bc
            j4.n2 r4 = r0.f10025g
            boolean r4 = r4.z()
            if (r4 == 0) goto L_0x01be
        L_0x01bc:
            r0.f9970d = r3
        L_0x01be:
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0203
            if (r2 == 0) goto L_0x0203
            boolean r2 = r17.K()
            if (r2 == 0) goto L_0x0203
            long r2 = r17.v()
            if (r15 == 0) goto L_0x01d6
            long r2 = r15.longValue()
        L_0x01d6:
            if (r1 == 0) goto L_0x01ee
            j4.n2 r1 = r0.f10025g
            boolean r1 = r1.z()
            if (r1 == 0) goto L_0x01ee
            j4.n2 r1 = r0.f10025g
            boolean r1 = r1.A()
            if (r1 != 0) goto L_0x01ee
            if (r16 == 0) goto L_0x01ee
            long r2 = r16.longValue()
        L_0x01ee:
            j4.n2 r1 = r0.f10025g
            boolean r1 = r1.A()
            if (r1 == 0) goto L_0x01fd
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.f9972f = r1
            goto L_0x0203
        L_0x01fd:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.f9971e = r1
        L_0x0203:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.n8.g(java.lang.Long, java.lang.Long, j4.c4, boolean):boolean");
    }
}
