package j4;

public final class l7 extends m {

    /* renamed from: b  reason: collision with root package name */
    public final c f8316b;

    public l7(c cVar) {
        this.f8316b = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.p l(java.lang.String r17, o.c r18, java.util.ArrayList r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = r6
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = r14
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = r15
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = r7
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = r5
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x013b
            if (r4 == r15) goto L_0x0111
            if (r4 == r14) goto L_0x00e2
            if (r4 == r7) goto L_0x00ce
            if (r4 == r6) goto L_0x0095
            r6 = 5
            if (r4 == r6) goto L_0x0064
            j4.p r1 = super.l(r17, r18, r19)
            return r1
        L_0x0064:
            j4.j4.h(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r2.b(r1)
            java.lang.String r1 = r1.zzi()
            java.lang.Object r3 = r3.get(r15)
            j4.p r3 = (j4.p) r3
            j4.p r2 = r2.b(r3)
            j4.c r3 = r0.f8316b
            j4.b r3 = r3.f8070b
            java.lang.Object r4 = j4.j4.f(r2)
            if (r4 != 0) goto L_0x008f
            java.util.HashMap r3 = r3.f8051c
            r3.remove(r1)
            goto L_0x0094
        L_0x008f:
            java.util.HashMap r3 = r3.f8051c
            r3.put(r1, r4)
        L_0x0094:
            return r2
        L_0x0095:
            j4.j4.h(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r2.b(r1)
            j4.u r2 = j4.p.f8373c0
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c6
            j4.n r2 = j4.p.f8374d0
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c6
            j4.c r2 = r0.f8316b
            j4.b r2 = r2.f8070b
            java.lang.String r3 = r1.zzi()
            r2.f8049a = r3
            j4.t r2 = new j4.t
            java.lang.String r1 = r1.zzi()
            r2.<init>(r1)
            return r2
        L_0x00c6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00ce:
            j4.j4.h(r12, r5, r3)
            j4.c r1 = r0.f8316b
            j4.b r1 = r1.f8070b
            j4.i r2 = new j4.i
            long r3 = r1.f8050b
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e2:
            j4.j4.h(r10, r5, r3)
            j4.c r1 = r0.f8316b
            j4.b r1 = r1.f8070b
            java.util.HashMap r1 = r1.f8051c
            j4.m r2 = new j4.m
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0110
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            j4.p r5 = j4.e5.b(r5)
            r2.i(r4, r5)
            goto L_0x00f8
        L_0x0110:
            return r2
        L_0x0111:
            j4.j4.h(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r2.b(r1)
            java.lang.String r1 = r1.zzi()
            j4.c r2 = r0.f8316b
            j4.b r2 = r2.f8070b
            java.util.HashMap r3 = r2.f8051c
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0135
            java.util.HashMap r2 = r2.f8051c
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0136
        L_0x0135:
            r1 = 0
        L_0x0136:
            j4.p r1 = j4.e5.b(r1)
            return r1
        L_0x013b:
            j4.j4.h(r13, r5, r3)
            j4.c r1 = r0.f8316b
            j4.b r1 = r1.f8070b
            j4.t r2 = new j4.t
            java.lang.String r1 = r1.f8049a
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.l7.l(java.lang.String, o.c, java.util.ArrayList):j4.p");
    }
}
