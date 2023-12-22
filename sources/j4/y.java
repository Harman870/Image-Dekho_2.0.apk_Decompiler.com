package j4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.c;

public final class y extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8563b;

    public y(int i10) {
        this.f8563b = i10;
        if (i10 != 1) {
            this.f8532a.add(g0.APPLY);
            this.f8532a.add(g0.BLOCK);
            this.f8532a.add(g0.BREAK);
            this.f8532a.add(g0.CASE);
            this.f8532a.add(g0.DEFAULT);
            this.f8532a.add(g0.CONTINUE);
            this.f8532a.add(g0.DEFINE_FUNCTION);
            this.f8532a.add(g0.FN);
            this.f8532a.add(g0.IF);
            this.f8532a.add(g0.QUOTE);
            this.f8532a.add(g0.RETURN);
            this.f8532a.add(g0.SWITCH);
            this.f8532a.add(g0.TERNARY);
            return;
        }
        this.f8532a.add(g0.FOR_IN);
        this.f8532a.add(g0.FOR_IN_CONST);
        this.f8532a.add(g0.FOR_IN_LET);
        this.f8532a.add(g0.FOR_LET);
        this.f8532a.add(g0.FOR_OF);
        this.f8532a.add(g0.FOR_OF_CONST);
        this.f8532a.add(g0.FOR_OF_LET);
        this.f8532a.add(g0.WHILE);
    }

    public static o c(c cVar, ArrayList arrayList) {
        g0 g0Var = g0.ADD;
        j4.i("FN", 2, arrayList);
        p b10 = cVar.b((p) arrayList.get(0));
        p b11 = cVar.b((p) arrayList.get(1));
        if (b11 instanceof f) {
            ArrayList p5 = ((f) b11).p();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new o(b10.zzi(), p5, arrayList2, cVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b11.getClass().getCanonicalName()}));
    }

    public static p d(c0 c0Var, Iterator it, p pVar) {
        if (it != null) {
            while (it.hasNext()) {
                p c10 = c0Var.a((p) it.next()).c((f) pVar);
                if (c10 instanceof h) {
                    h hVar = (h) c10;
                    if ("break".equals(hVar.f8207b)) {
                        return p.f8373c0;
                    }
                    if ("return".equals(hVar.f8207b)) {
                        return hVar;
                    }
                }
            }
        }
        return p.f8373c0;
    }

    public static p e(c0 c0Var, p pVar, p pVar2) {
        return d(c0Var, pVar.d(), pVar2);
    }

    public static p f(c0 c0Var, p pVar, p pVar2) {
        if (pVar instanceof Iterable) {
            return d(c0Var, ((Iterable) pVar).iterator(), pVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a7, code lost:
        if ("return".equals(r1.f8207b) != false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        return f(r1, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return e(r1, r0, r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.p a(java.lang.String r11, o.c r12, java.util.ArrayList r13) {
        /*
            r10 = this;
            int r0 = r10.f8563b
            r1 = 0
            r2 = 1
            java.lang.String r3 = "break"
            java.lang.String r4 = "return"
            r5 = 0
            r6 = 2
            r7 = 3
            switch(r0) {
                case 0: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0243
        L_0x0010:
            j4.g0 r0 = j4.g0.ADD
            j4.g0 r0 = j4.j4.e(r11)
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x01e7
            r8 = 15
            java.lang.String r9 = "BREAK"
            if (r0 == r8) goto L_0x01e1
            r8 = 25
            if (r0 == r8) goto L_0x01dc
            r8 = 41
            if (r0 == r8) goto L_0x018f
            r8 = 54
            if (r0 == r8) goto L_0x0188
            r8 = 57
            if (r0 == r8) goto L_0x0167
            r8 = 19
            if (r0 == r8) goto L_0x0146
            r8 = 20
            if (r0 == r8) goto L_0x0132
            r8 = 60
            if (r0 == r8) goto L_0x0089
            r3 = 61
            if (r0 == r3) goto L_0x005f
            switch(r0) {
                case 11: goto L_0x0050;
                case 12: goto L_0x0049;
                case 13: goto L_0x0146;
                default: goto L_0x0045;
            }
        L_0x0045:
            r10.b(r11)
            throw r1
        L_0x0049:
            j4.j4.h(r9, r5, r13)
            j4.h r11 = j4.p.f8376f0
            goto L_0x0222
        L_0x0050:
            o.c r11 = r12.a()
            j4.f r12 = new j4.f
            r12.<init>(r13)
            j4.p r11 = r11.c(r12)
            goto L_0x0222
        L_0x005f:
            java.lang.String r11 = "TERNARY"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            java.lang.Boolean r11 = r11.k()
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x007d
            java.lang.Object r11 = r13.get(r2)
            goto L_0x0081
        L_0x007d:
            java.lang.Object r11 = r13.get(r6)
        L_0x0081:
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            goto L_0x0222
        L_0x0089:
            java.lang.String r11 = "SWITCH"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            boolean r1 = r0 instanceof j4.f
            if (r1 == 0) goto L_0x012a
            boolean r1 = r13 instanceof j4.f
            if (r1 == 0) goto L_0x0122
            j4.f r0 = (j4.f) r0
            j4.f r13 = (j4.f) r13
            r1 = r5
            r6 = r1
        L_0x00ba:
            int r7 = r0.j()
            if (r1 >= r7) goto L_0x00f3
            if (r6 != 0) goto L_0x00d3
            j4.p r6 = r0.m(r1)
            j4.p r6 = r12.b(r6)
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = r5
            goto L_0x00f0
        L_0x00d3:
            j4.p r6 = r13.m(r1)
            j4.p r6 = r12.b(r6)
            boolean r7 = r6 instanceof j4.h
            if (r7 == 0) goto L_0x00ef
            r11 = r6
            j4.h r11 = (j4.h) r11
            java.lang.String r11 = r11.f8207b
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00ec
            goto L_0x0163
        L_0x00ec:
            r11 = r6
            goto L_0x0222
        L_0x00ef:
            r6 = r2
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00ba
        L_0x00f3:
            int r11 = r0.j()
            int r11 = r11 + r2
            int r1 = r13.j()
            if (r11 != r1) goto L_0x0163
            int r11 = r0.j()
            j4.p r11 = r13.m(r11)
            j4.p r11 = r12.b(r11)
            boolean r12 = r11 instanceof j4.h
            if (r12 == 0) goto L_0x0163
            r12 = r11
            j4.h r12 = (j4.h) r12
            java.lang.String r12 = r12.f8207b
            boolean r13 = r12.equals(r4)
            if (r13 != 0) goto L_0x0222
            java.lang.String r13 = "continue"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0222
            goto L_0x0163
        L_0x0122:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Malformed SWITCH statement, case statements are not a list"
            r11.<init>(r12)
            throw r11
        L_0x012a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Malformed SWITCH statement, cases are not a list"
            r11.<init>(r12)
            throw r11
        L_0x0132:
            java.lang.String r11 = "DEFINE_FUNCTION"
            j4.j4.i(r11, r6, r13)
            j4.o r11 = c(r12, r13)
            java.lang.String r13 = r11.f8268a
            if (r13 != 0) goto L_0x0141
            java.lang.String r13 = ""
        L_0x0141:
            r12.f(r13, r11)
            goto L_0x0222
        L_0x0146:
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L_0x014d
            goto L_0x0163
        L_0x014d:
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            boolean r13 = r11 instanceof j4.f
            if (r13 == 0) goto L_0x0163
            j4.f r11 = (j4.f) r11
            j4.p r11 = r12.c(r11)
            goto L_0x0222
        L_0x0163:
            j4.u r11 = j4.p.f8373c0
            goto L_0x0222
        L_0x0167:
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L_0x0171
            j4.h r11 = j4.p.f8377g0
            goto L_0x0222
        L_0x0171:
            java.lang.String r11 = "RETURN"
            j4.j4.h(r11, r2, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            j4.h r12 = new j4.h
            r12.<init>(r4, r11)
            r11 = r12
            goto L_0x0222
        L_0x0188:
            j4.f r11 = new j4.f
            r11.<init>(r13)
            goto L_0x0222
        L_0x018f:
            java.lang.String r11 = "IF"
            j4.j4.i(r11, r6, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            int r2 = r13.size()
            if (r2 <= r6) goto L_0x01b8
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r1 = r12.b(r13)
        L_0x01b8:
            j4.u r13 = j4.p.f8373c0
            java.lang.Boolean r11 = r11.k()
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x01cb
            j4.f r0 = (j4.f) r0
            j4.p r11 = r12.c(r0)
            goto L_0x01d5
        L_0x01cb:
            if (r1 == 0) goto L_0x01d4
            j4.f r1 = (j4.f) r1
            j4.p r11 = r12.c(r1)
            goto L_0x01d5
        L_0x01d4:
            r11 = r13
        L_0x01d5:
            boolean r12 = r11 instanceof j4.h
            if (r12 == 0) goto L_0x01da
            goto L_0x0222
        L_0x01da:
            r11 = r13
            goto L_0x0222
        L_0x01dc:
            j4.o r11 = c(r12, r13)
            goto L_0x0222
        L_0x01e1:
            j4.j4.h(r9, r5, r13)
            j4.h r11 = j4.p.f8375e0
            goto L_0x0222
        L_0x01e7:
            java.lang.String r11 = "APPLY"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.String r0 = r0.zzi()
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            boolean r1 = r13 instanceof j4.f
            if (r1 == 0) goto L_0x022b
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0223
            j4.f r13 = (j4.f) r13
            java.util.ArrayList r13 = r13.p()
            j4.p r11 = r11.l(r0, r12, r13)
        L_0x0222:
            return r11
        L_0x0223:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Function name for apply is undefined"
            r11.<init>(r12)
            throw r11
        L_0x022b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            r12[r5] = r13
            java.lang.String r13 = "Function arguments for Apply are not a list found %s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L_0x0243:
            j4.g0 r0 = j4.g0.ADD
            j4.g0 r0 = j4.j4.e(r11)
            int r0 = r0.ordinal()
            r8 = 65
            r9 = 4
            if (r0 == r8) goto L_0x045b
            switch(r0) {
                case 26: goto L_0x041d;
                case 27: goto L_0x03e4;
                case 28: goto L_0x03ab;
                case 29: goto L_0x0309;
                case 30: goto L_0x02cb;
                case 31: goto L_0x0292;
                case 32: goto L_0x0259;
                default: goto L_0x0255;
            }
        L_0x0255:
            r10.b(r11)
            throw r1
        L_0x0259:
            java.lang.String r11 = "FOR_OF_LET"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            boolean r11 = r11 instanceof j4.t
            if (r11 == 0) goto L_0x028a
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            x2.l r1 = new x2.l
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r11)
            goto L_0x02fb
        L_0x028a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_LET must be a string"
            r11.<init>(r12)
            throw r11
        L_0x0292:
            java.lang.String r11 = "FOR_OF_CONST"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            boolean r11 = r11 instanceof j4.t
            if (r11 == 0) goto L_0x02c3
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            n3.w r1 = new n3.w
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r11)
            goto L_0x02fb
        L_0x02c3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L_0x02cb:
            java.lang.String r11 = "FOR_OF"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            boolean r11 = r11 instanceof j4.t
            if (r11 == 0) goto L_0x0301
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            androidx.appcompat.widget.l r1 = new androidx.appcompat.widget.l
            r1.<init>(r12, r11)
        L_0x02fb:
            j4.p r11 = f(r1, r0, r13)
            goto L_0x04de
        L_0x0301:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF must be a string"
            r11.<init>(r12)
            throw r11
        L_0x0309:
            java.lang.String r11 = "FOR_LET"
            j4.j4.h(r11, r9, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r12.b(r11)
            boolean r0 = r11 instanceof j4.f
            if (r0 == 0) goto L_0x03a3
            j4.f r11 = (j4.f) r11
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            java.lang.Object r1 = r13.get(r6)
            j4.p r1 = (j4.p) r1
            java.lang.Object r13 = r13.get(r7)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            o.c r2 = r12.a()
            r6 = r5
        L_0x0339:
            int r7 = r11.j()
            if (r6 >= r7) goto L_0x0351
            j4.p r7 = r11.m(r6)
            java.lang.String r7 = r7.zzi()
            j4.p r8 = r12.d(r7)
            r2.f(r7, r8)
            int r6 = r6 + 1
            goto L_0x0339
        L_0x0351:
            j4.p r6 = r12.b(r0)
            java.lang.Boolean r6 = r6.k()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04dc
            r6 = r13
            j4.f r6 = (j4.f) r6
            j4.p r6 = r12.c(r6)
            boolean r7 = r6 instanceof j4.h
            if (r7 == 0) goto L_0x0381
            j4.h r6 = (j4.h) r6
            java.lang.String r7 = r6.f8207b
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0376
            goto L_0x04dc
        L_0x0376:
            java.lang.String r7 = r6.f8207b
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0381
            r11 = r6
            goto L_0x04de
        L_0x0381:
            o.c r6 = r12.a()
            r7 = r5
        L_0x0386:
            int r8 = r11.j()
            if (r7 >= r8) goto L_0x039e
            j4.p r8 = r11.m(r7)
            java.lang.String r8 = r8.zzi()
            j4.p r9 = r2.d(r8)
            r6.f(r8, r9)
            int r7 = r7 + 1
            goto L_0x0386
        L_0x039e:
            r6.b(r1)
            r2 = r6
            goto L_0x0351
        L_0x03a3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Initializer variables in FOR_LET must be an ArrayList"
            r11.<init>(r12)
            throw r11
        L_0x03ab:
            java.lang.String r11 = "FOR_IN_LET"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            boolean r11 = r11 instanceof j4.t
            if (r11 == 0) goto L_0x03dc
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            x2.l r1 = new x2.l
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r11)
            goto L_0x044d
        L_0x03dc:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_LET must be a string"
            r11.<init>(r12)
            throw r11
        L_0x03e4:
            java.lang.String r11 = "FOR_IN_CONST"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            boolean r11 = r11 instanceof j4.t
            if (r11 == 0) goto L_0x0415
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            n3.w r1 = new n3.w
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r11)
            goto L_0x044d
        L_0x0415:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L_0x041d:
            java.lang.String r11 = "FOR_IN"
            j4.j4.h(r11, r7, r13)
            java.lang.Object r11 = r13.get(r5)
            boolean r11 = r11 instanceof j4.t
            if (r11 == 0) goto L_0x0453
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.String r11 = r11.zzi()
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r12.b(r0)
            java.lang.Object r13 = r13.get(r6)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            androidx.appcompat.widget.l r1 = new androidx.appcompat.widget.l
            r1.<init>(r12, r11)
        L_0x044d:
            j4.p r11 = e(r1, r0, r13)
            goto L_0x04de
        L_0x0453:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN must be a string"
            r11.<init>(r12)
            throw r11
        L_0x045b:
            java.lang.String r11 = "WHILE"
            j4.j4.h(r11, r9, r13)
            java.lang.Object r11 = r13.get(r5)
            j4.p r11 = (j4.p) r11
            java.lang.Object r0 = r13.get(r2)
            j4.p r0 = (j4.p) r0
            java.lang.Object r1 = r13.get(r6)
            j4.p r1 = (j4.p) r1
            java.lang.Object r13 = r13.get(r7)
            j4.p r13 = (j4.p) r13
            j4.p r13 = r12.b(r13)
            j4.p r1 = r12.b(r1)
            java.lang.Boolean r1 = r1.k()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x048b
            goto L_0x04ab
        L_0x048b:
            r1 = r13
            j4.f r1 = (j4.f) r1
            j4.p r1 = r12.c(r1)
            boolean r2 = r1 instanceof j4.h
            if (r2 == 0) goto L_0x04ab
            j4.h r1 = (j4.h) r1
            java.lang.String r2 = r1.f8207b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x04a1
            goto L_0x04dc
        L_0x04a1:
            java.lang.String r2 = r1.f8207b
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x04ab
        L_0x04a9:
            r11 = r1
            goto L_0x04de
        L_0x04ab:
            j4.p r1 = r12.b(r11)
            java.lang.Boolean r1 = r1.k()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x04dc
            r1 = r13
            j4.f r1 = (j4.f) r1
            j4.p r1 = r12.c(r1)
            boolean r2 = r1 instanceof j4.h
            if (r2 == 0) goto L_0x04d8
            j4.h r1 = (j4.h) r1
            java.lang.String r2 = r1.f8207b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x04cf
            goto L_0x04dc
        L_0x04cf:
            java.lang.String r2 = r1.f8207b
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x04d8
            goto L_0x04a9
        L_0x04d8:
            r12.b(r0)
            goto L_0x04ab
        L_0x04dc:
            j4.u r11 = j4.p.f8373c0
        L_0x04de:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.y.a(java.lang.String, o.c, java.util.ArrayList):j4.p");
    }
}
