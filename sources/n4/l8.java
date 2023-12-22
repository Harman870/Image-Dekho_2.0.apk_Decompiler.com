package n4;

import j4.g2;

public final class l8 extends m8 {

    /* renamed from: g  reason: collision with root package name */
    public final g2 f9933g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f9934h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l8(b bVar, String str, int i10, g2 g2Var) {
        super(str, i10);
        this.f9934h = bVar;
        this.f9933g = g2Var;
    }

    public final int a() {
        return this.f9933g.u();
    }

    public final boolean b() {
        return this.f9933g.G();
    }

    public final boolean c() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x040c, code lost:
        r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0196, code lost:
        if (r2.booleanValue() == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02af, code lost:
        r2.b(r5, r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0443 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0444  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Long r19, java.lang.Long r20, j4.k3 r21, long r22, n4.n r24, boolean r25) {
        /*
            r18 = this;
            r0 = r18
            j4.va.a()
            n4.b r1 = r0.f9934h
            n4.n4 r1 = r1.f9600a
            n4.f r1 = r1.f9992g
            java.lang.String r2 = r0.f9967a
            n4.v2 r3 = n4.w2.X
            boolean r1 = r1.o(r2, r3)
            j4.g2 r2 = r0.f9933g
            boolean r2 = r2.F()
            if (r2 == 0) goto L_0x0020
            r2 = r24
            long r2 = r2.f9977e
            goto L_0x0022
        L_0x0020:
            r2 = r22
        L_0x0022:
            n4.b r4 = r0.f9934h
            n4.n4 r4 = r4.f9600a
            n4.i3 r4 = r4.a()
            java.lang.String r4 = r4.t()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            java.lang.String r6 = "null"
            r7 = 0
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0115
            n4.b r4 = r0.f9934h
            n4.n4 r4 = r4.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9835n
            int r10 = r0.f9968b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            j4.g2 r11 = r0.f9933g
            boolean r11 = r11.H()
            if (r11 == 0) goto L_0x005d
            j4.g2 r11 = r0.f9933g
            int r11 = r11.u()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x005e
        L_0x005d:
            r11 = r9
        L_0x005e:
            n4.b r12 = r0.f9934h
            n4.n4 r12 = r12.f9600a
            n4.d3 r12 = r12.f9997m
            j4.g2 r13 = r0.f9933g
            java.lang.String r13 = r13.z()
            java.lang.String r12 = r12.d(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, event"
            r4.d(r13, r10, r11, r12)
            n4.b r4 = r0.f9934h
            n4.n4 r4 = r4.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9835n
            n4.b r10 = r0.f9934h
            n4.w7 r10 = r10.f10066b
            n4.y7 r10 = r10.f10288g
            n4.w7.H(r10)
            j4.g2 r11 = r0.f9933g
            if (r11 != 0) goto L_0x008d
            r5 = r6
            goto L_0x0110
        L_0x008d:
            java.lang.String r12 = "\nevent_filter {\n"
            java.lang.StringBuilder r12 = androidx.activity.f.g(r12)
            boolean r13 = r11.H()
            if (r13 == 0) goto L_0x00a6
            int r13 = r11.u()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "filter_id"
            n4.y7.s(r12, r7, r14, r13)
        L_0x00a6:
            n4.n4 r13 = r10.f9600a
            n4.d3 r13 = r13.f9997m
            java.lang.String r14 = r11.z()
            java.lang.String r13 = r13.d(r14)
            java.lang.String r14 = "event_name"
            n4.y7.s(r12, r7, r14, r13)
            boolean r13 = r11.D()
            boolean r14 = r11.E()
            boolean r15 = r11.F()
            java.lang.String r13 = n4.y7.q(r13, r14, r15)
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x00d2
            java.lang.String r14 = "filter_type"
            n4.y7.s(r12, r7, r14, r13)
        L_0x00d2:
            boolean r13 = r11.G()
            if (r13 == 0) goto L_0x00e1
            j4.l2 r13 = r11.y()
            java.lang.String r14 = "event_count_filter"
            n4.y7.t(r12, r8, r14, r13)
        L_0x00e1:
            int r13 = r11.t()
            if (r13 <= 0) goto L_0x0104
            java.lang.String r13 = "  filters {\n"
            r12.append(r13)
            j4.r7 r11 = r11.A()
            java.util.Iterator r11 = r11.iterator()
        L_0x00f4:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0104
            java.lang.Object r13 = r11.next()
            j4.i2 r13 = (j4.i2) r13
            r10.o(r12, r5, r13)
            goto L_0x00f4
        L_0x0104:
            n4.y7.p(r8, r12)
            java.lang.String r5 = "}\n}\n"
            r12.append(r5)
            java.lang.String r5 = r12.toString()
        L_0x0110:
            java.lang.String r10 = "Filter definition"
            r4.b(r10, r5)
        L_0x0115:
            j4.g2 r4 = r0.f9933g
            boolean r4 = r4.H()
            if (r4 == 0) goto L_0x0489
            j4.g2 r4 = r0.f9933g
            int r4 = r4.u()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L_0x0129
            goto L_0x0489
        L_0x0129:
            j4.g2 r4 = r0.f9933g
            boolean r4 = r4.D()
            j4.g2 r5 = r0.f9933g
            boolean r5 = r5.E()
            j4.g2 r10 = r0.f9933g
            boolean r10 = r10.F()
            if (r4 != 0) goto L_0x0144
            if (r5 != 0) goto L_0x0144
            if (r10 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r4 = r7
            goto L_0x0145
        L_0x0144:
            r4 = r8
        L_0x0145:
            if (r25 == 0) goto L_0x0171
            if (r4 != 0) goto L_0x0171
            n4.b r1 = r0.f9934h
            n4.n4 r1 = r1.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            int r2 = r0.f9968b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            j4.g2 r3 = r0.f9933g
            boolean r3 = r3.H()
            if (r3 == 0) goto L_0x016b
            j4.g2 r3 = r0.f9933g
            int r3 = r3.u()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        L_0x016b:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r3, r2, r9)
            return r8
        L_0x0171:
            j4.g2 r5 = r0.f9933g
            java.lang.String r10 = r21.A()
            boolean r11 = r5.G()
            r12 = 0
            if (r11 == 0) goto L_0x019a
            j4.l2 r11 = r5.y()
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x018d }
            r14.<init>(r2)     // Catch:{ NumberFormatException -> 0x018d }
            java.lang.Boolean r2 = n4.m8.d(r14, r11, r12)     // Catch:{ NumberFormatException -> 0x018d }
            goto L_0x018e
        L_0x018d:
            r2 = r9
        L_0x018e:
            if (r2 != 0) goto L_0x0192
            goto L_0x042a
        L_0x0192:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x019a
            goto L_0x040c
        L_0x019a:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            j4.r7 r3 = r5.A()
            java.util.Iterator r3 = r3.iterator()
        L_0x01a7:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01dd
            java.lang.Object r11 = r3.next()
            j4.i2 r11 = (j4.i2) r11
            java.lang.String r14 = r11.x()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x01d5
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            java.lang.String r5 = "null or empty param name in filter. event"
            goto L_0x02af
        L_0x01d5:
            java.lang.String r11 = r11.x()
            r2.add(r11)
            goto L_0x01a7
        L_0x01dd:
            m.b r3 = new m.b
            r3.<init>()
            java.util.List r11 = r21.B()
            java.util.Iterator r11 = r11.iterator()
        L_0x01ea:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x026c
            java.lang.Object r14 = r11.next()
            j4.o3 r14 = (j4.o3) r14
            java.lang.String r15 = r14.z()
            boolean r15 = r2.contains(r15)
            if (r15 == 0) goto L_0x01ea
            boolean r15 = r14.O()
            if (r15 == 0) goto L_0x0219
            java.lang.String r15 = r14.z()
            boolean r16 = r14.O()
            if (r16 == 0) goto L_0x0232
            long r16 = r14.w()
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            goto L_0x0242
        L_0x0219:
            boolean r15 = r14.M()
            if (r15 == 0) goto L_0x0234
            java.lang.String r15 = r14.z()
            boolean r16 = r14.M()
            if (r16 == 0) goto L_0x0232
            double r16 = r14.t()
            java.lang.Double r14 = java.lang.Double.valueOf(r16)
            goto L_0x0242
        L_0x0232:
            r14 = r9
            goto L_0x0242
        L_0x0234:
            boolean r15 = r14.Q()
            if (r15 == 0) goto L_0x0246
            java.lang.String r15 = r14.z()
            java.lang.String r14 = r14.A()
        L_0x0242:
            r3.put(r15, r14)
            goto L_0x01ea
        L_0x0246:
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r9 = r14.z()
            java.lang.String r5 = r5.e(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            goto L_0x0427
        L_0x026c:
            j4.r7 r2 = r5.A()
            java.util.Iterator r2 = r2.iterator()
        L_0x0274:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x042c
            java.lang.Object r5 = r2.next()
            j4.i2 r5 = (j4.i2) r5
            boolean r11 = r5.A()
            if (r11 == 0) goto L_0x028e
            boolean r11 = r5.z()
            if (r11 == 0) goto L_0x028e
            r11 = r8
            goto L_0x028f
        L_0x028e:
            r11 = r7
        L_0x028f:
            java.lang.String r14 = r5.x()
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x02b4
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            java.lang.String r5 = "Event has empty param name. event"
        L_0x02af:
            r2.b(r5, r3)
            goto L_0x042a
        L_0x02b4:
            java.lang.Object r9 = r3.getOrDefault(r14, r9)
            boolean r15 = r9 instanceof java.lang.Long
            if (r15 == 0) goto L_0x0305
            boolean r15 = r5.B()
            if (r15 != 0) goto L_0x02e4
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r5 = r5.e(r14)
            java.lang.String r9 = "No number filter for long param. event, param"
            goto L_0x0427
        L_0x02e4:
            java.lang.Long r9 = (java.lang.Long) r9
            long r14 = r9.longValue()
            j4.l2 r5 = r5.v()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x02f8 }
            r9.<init>(r14)     // Catch:{ NumberFormatException -> 0x02f8 }
            java.lang.Boolean r5 = n4.m8.d(r9, r5, r12)     // Catch:{ NumberFormatException -> 0x02f8 }
            goto L_0x02f9
        L_0x02f8:
            r5 = 0
        L_0x02f9:
            if (r5 != 0) goto L_0x02fd
            goto L_0x042a
        L_0x02fd:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L_0x03a2
            goto L_0x040c
        L_0x0305:
            boolean r15 = r9 instanceof java.lang.Double
            if (r15 == 0) goto L_0x0356
            boolean r15 = r5.B()
            if (r15 != 0) goto L_0x0331
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r5 = r5.e(r14)
            java.lang.String r9 = "No number filter for double param. event, param"
            goto L_0x0427
        L_0x0331:
            java.lang.Double r9 = (java.lang.Double) r9
            double r14 = r9.doubleValue()
            j4.l2 r5 = r5.v()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0349 }
            r9.<init>(r14)     // Catch:{ NumberFormatException -> 0x0349 }
            double r14 = java.lang.Math.ulp(r14)     // Catch:{ NumberFormatException -> 0x0349 }
            java.lang.Boolean r5 = n4.m8.d(r9, r5, r14)     // Catch:{ NumberFormatException -> 0x0349 }
            goto L_0x034a
        L_0x0349:
            r5 = 0
        L_0x034a:
            if (r5 != 0) goto L_0x034e
            goto L_0x042a
        L_0x034e:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L_0x03a2
            goto L_0x040c
        L_0x0356:
            boolean r15 = r9 instanceof java.lang.String
            if (r15 == 0) goto L_0x03e7
            boolean r15 = r5.D()
            if (r15 == 0) goto L_0x0373
            java.lang.String r9 = (java.lang.String) r9
            j4.q2 r5 = r5.w()
            n4.b r14 = r0.f9934h
            n4.n4 r14 = r14.f9600a
            n4.i3 r14 = r14.a()
            java.lang.Boolean r5 = n4.m8.e(r9, r5, r14)
            goto L_0x0397
        L_0x0373:
            boolean r15 = r5.B()
            if (r15 == 0) goto L_0x03c6
            java.lang.String r9 = (java.lang.String) r9
            boolean r15 = n4.y7.I(r9)
            if (r15 == 0) goto L_0x03a5
            j4.l2 r5 = r5.v()
            boolean r14 = n4.y7.I(r9)
            if (r14 != 0) goto L_0x038c
            goto L_0x0396
        L_0x038c:
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0396 }
            r14.<init>(r9)     // Catch:{ NumberFormatException -> 0x0396 }
            java.lang.Boolean r5 = n4.m8.d(r14, r5, r12)     // Catch:{ NumberFormatException -> 0x0396 }
            goto L_0x0397
        L_0x0396:
            r5 = 0
        L_0x0397:
            if (r5 != 0) goto L_0x039b
            goto L_0x042a
        L_0x039b:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L_0x03a2
            goto L_0x040c
        L_0x03a2:
            r9 = 0
            goto L_0x0274
        L_0x03a5:
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r5 = r5.e(r14)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            goto L_0x0427
        L_0x03c6:
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r5 = r5.e(r14)
            java.lang.String r9 = "No filter for String param. event, param"
            goto L_0x0427
        L_0x03e7:
            n4.b r2 = r0.f9934h
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            if (r9 != 0) goto L_0x040f
            n4.g3 r2 = r2.f9835n
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r5 = r5.e(r14)
            java.lang.String r9 = "Missing param for filter. event, param"
            r2.c(r9, r3, r5)
        L_0x040c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x042e
        L_0x040f:
            n4.g3 r2 = r2.f9831i
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r10)
            n4.b r5 = r0.f9934h
            n4.n4 r5 = r5.f9600a
            n4.d3 r5 = r5.f9997m
            java.lang.String r5 = r5.e(r14)
            java.lang.String r9 = "Unknown param type. event, param"
        L_0x0427:
            r2.c(r9, r3, r5)
        L_0x042a:
            r2 = 0
            goto L_0x042e
        L_0x042c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L_0x042e:
            n4.b r3 = r0.f9934h
            n4.n4 r3 = r3.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.f9835n
            if (r2 != 0) goto L_0x043b
            goto L_0x043c
        L_0x043b:
            r6 = r2
        L_0x043c:
            java.lang.String r5 = "Event filter result"
            r3.b(r5, r6)
            if (r2 != 0) goto L_0x0444
            return r7
        L_0x0444:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f9969c = r3
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x044f
            return r8
        L_0x044f:
            r0.f9970d = r3
            if (r4 == 0) goto L_0x0488
            boolean r2 = r21.M()
            if (r2 == 0) goto L_0x0488
            long r2 = r21.w()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            j4.g2 r3 = r0.f9933g
            boolean r3 = r3.E()
            if (r3 == 0) goto L_0x0479
            if (r1 == 0) goto L_0x0476
            j4.g2 r1 = r0.f9933g
            boolean r1 = r1.G()
            if (r1 != 0) goto L_0x0474
            goto L_0x0476
        L_0x0474:
            r2 = r19
        L_0x0476:
            r0.f9972f = r2
            goto L_0x0488
        L_0x0479:
            if (r1 == 0) goto L_0x0486
            j4.g2 r1 = r0.f9933g
            boolean r1 = r1.G()
            if (r1 != 0) goto L_0x0484
            goto L_0x0486
        L_0x0484:
            r2 = r20
        L_0x0486:
            r0.f9971e = r2
        L_0x0488:
            return r8
        L_0x0489:
            n4.b r1 = r0.f9934h
            n4.n4 r1 = r1.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9831i
            java.lang.String r2 = r0.f9967a
            n4.h3 r2 = n4.i3.p(r2)
            j4.g2 r3 = r0.f9933g
            boolean r3 = r3.H()
            if (r3 == 0) goto L_0x04ac
            j4.g2 r3 = r0.f9933g
            int r3 = r3.u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x04ad
        L_0x04ac:
            r3 = 0
        L_0x04ad:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.c(r4, r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.l8.g(java.lang.Long, java.lang.Long, j4.k3, long, n4.n, boolean):boolean");
    }
}
