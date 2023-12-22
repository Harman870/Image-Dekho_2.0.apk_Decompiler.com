package r;

import androidx.activity.f;
import o.g;
import q.d;

public final class n extends p {
    public f k;

    /* renamed from: l  reason: collision with root package name */
    public a f11438l = null;

    public n(d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.k = fVar;
        this.f11452h.f11427e = 6;
        this.f11453i.f11427e = 7;
        fVar.f11427e = 8;
        this.f11450f = 1;
    }

    public final void a(d dVar) {
        int i10;
        float f10;
        if (g.b(this.f11454j) != 3) {
            g gVar = this.f11449e;
            if (gVar.f11425c && !gVar.f11432j && this.f11448d == 3) {
                d dVar2 = this.f11446b;
                int i11 = dVar2.f10927t;
                if (i11 == 2) {
                    d dVar3 = dVar2.W;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.f10900e.f11449e;
                        if (gVar2.f11432j) {
                            f10 = ((float) gVar2.f11429g) * dVar2.A;
                        }
                    }
                } else if (i11 == 3) {
                    g gVar3 = dVar2.f10898d.f11449e;
                    if (gVar3.f11432j) {
                        int i12 = dVar2.f10893a0;
                        if (i12 != -1) {
                            if (i12 == 0) {
                                f10 = ((float) gVar3.f11429g) * dVar2.Z;
                            } else if (i12 != 1) {
                                i10 = 0;
                                gVar.d(i10);
                            }
                        }
                        f10 = ((float) gVar3.f11429g) / dVar2.Z;
                    }
                }
                i10 = (int) (f10 + 0.5f);
                gVar.d(i10);
            }
            f fVar = this.f11452h;
            if (fVar.f11425c) {
                f fVar2 = this.f11453i;
                if (fVar2.f11425c) {
                    if (!fVar.f11432j || !fVar2.f11432j || !this.f11449e.f11432j) {
                        if (!this.f11449e.f11432j && this.f11448d == 3) {
                            d dVar4 = this.f11446b;
                            if (dVar4.f10926s == 0 && !dVar4.z()) {
                                int i13 = ((f) this.f11452h.f11433l.get(0)).f11429g;
                                f fVar3 = this.f11452h;
                                int i14 = i13 + fVar3.f11428f;
                                int i15 = ((f) this.f11453i.f11433l.get(0)).f11429g + this.f11453i.f11428f;
                                fVar3.d(i14);
                                this.f11453i.d(i15);
                                this.f11449e.d(i15 - i14);
                                return;
                            }
                        }
                        if (!this.f11449e.f11432j && this.f11448d == 3 && this.f11445a == 1 && this.f11452h.f11433l.size() > 0 && this.f11453i.f11433l.size() > 0) {
                            int i16 = (((f) this.f11453i.f11433l.get(0)).f11429g + this.f11453i.f11428f) - (((f) this.f11452h.f11433l.get(0)).f11429g + this.f11452h.f11428f);
                            g gVar4 = this.f11449e;
                            int i17 = gVar4.f11434m;
                            if (i16 < i17) {
                                gVar4.d(i16);
                            } else {
                                gVar4.d(i17);
                            }
                        }
                        if (this.f11449e.f11432j && this.f11452h.f11433l.size() > 0 && this.f11453i.f11433l.size() > 0) {
                            f fVar4 = (f) this.f11452h.f11433l.get(0);
                            f fVar5 = (f) this.f11453i.f11433l.get(0);
                            int i18 = fVar4.f11429g;
                            f fVar6 = this.f11452h;
                            int i19 = fVar6.f11428f + i18;
                            int i20 = fVar5.f11429g;
                            int i21 = this.f11453i.f11428f + i20;
                            float f11 = this.f11446b.f10907h0;
                            if (fVar4 == fVar5) {
                                f11 = 0.5f;
                            } else {
                                i18 = i19;
                                i20 = i21;
                            }
                            fVar6.d((int) ((((float) ((i20 - i18) - this.f11449e.f11429g)) * f11) + ((float) i18) + 0.5f));
                            this.f11453i.d(this.f11452h.f11429g + this.f11449e.f11429g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar5 = this.f11446b;
        l(dVar5.L, dVar5.N, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b5, code lost:
        if (r10.f11446b.F != false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02f8, code lost:
        if (r0.f11448d == 3) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0326, code lost:
        if (r10.f11446b.F != false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0390, code lost:
        if (r0.f11448d == 3) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r0 = r10.f11446b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r10 = this;
            q.d r0 = r10.f11446b
            boolean r1 = r0.f10892a
            if (r1 == 0) goto L_0x000f
            r.g r1 = r10.f11449e
            int r0 = r0.l()
            r1.d(r0)
        L_0x000f:
            r.g r0 = r10.f11449e
            boolean r0 = r0.f11432j
            r1 = 3
            r2 = 1
            r3 = 4
            if (r0 != 0) goto L_0x008a
            q.d r0 = r10.f11446b
            int[] r4 = r0.V
            r4 = r4[r2]
            r10.f11448d = r4
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x002b
            r.a r0 = new r.a
            r0.<init>(r10)
            r10.f11438l = r0
        L_0x002b:
            int r0 = r10.f11448d
            if (r0 == r1) goto L_0x00bc
            if (r0 != r3) goto L_0x007c
            q.d r4 = r10.f11446b
            q.d r4 = r4.W
            if (r4 == 0) goto L_0x007c
            int[] r5 = r4.V
            r5 = r5[r2]
            if (r5 != r2) goto L_0x007c
            int r0 = r4.l()
            q.d r1 = r10.f11446b
            q.c r1 = r1.L
            int r1 = r1.e()
            int r0 = r0 - r1
            q.d r1 = r10.f11446b
            q.c r1 = r1.N
            int r1 = r1.e()
            int r0 = r0 - r1
            r.f r1 = r10.f11452h
            r.n r2 = r4.f10900e
            r.f r2 = r2.f11452h
            q.d r3 = r10.f11446b
            q.c r3 = r3.L
            int r3 = r3.e()
            r.p.b(r1, r2, r3)
            r.f r1 = r10.f11453i
            r.n r2 = r4.f10900e
            r.f r2 = r2.f11453i
            q.d r3 = r10.f11446b
            q.c r3 = r3.N
            int r3 = r3.e()
            int r3 = -r3
            r.p.b(r1, r2, r3)
            r.g r1 = r10.f11449e
            r1.d(r0)
            return
        L_0x007c:
            if (r0 != r2) goto L_0x00bc
            r.g r0 = r10.f11449e
            q.d r4 = r10.f11446b
            int r4 = r4.l()
            r0.d(r4)
            goto L_0x00bc
        L_0x008a:
            int r0 = r10.f11448d
            if (r0 != r3) goto L_0x00bc
            q.d r0 = r10.f11446b
            q.d r4 = r0.W
            if (r4 == 0) goto L_0x00bc
            int[] r5 = r4.V
            r5 = r5[r2]
            if (r5 != r2) goto L_0x00bc
            r.f r1 = r10.f11452h
            r.n r2 = r4.f10900e
            r.f r2 = r2.f11452h
            q.c r0 = r0.L
            int r0 = r0.e()
            r.p.b(r1, r2, r0)
            r.f r0 = r10.f11453i
            r.n r1 = r4.f10900e
            r.f r1 = r1.f11453i
            q.d r2 = r10.f11446b
            q.c r2 = r2.N
            int r2 = r2.e()
            int r2 = -r2
            r.p.b(r0, r1, r2)
            return
        L_0x00bc:
            r.g r0 = r10.f11449e
            boolean r4 = r0.f11432j
            r5 = 0
            r6 = 2
            if (r4 == 0) goto L_0x0206
            q.d r7 = r10.f11446b
            boolean r8 = r7.f10892a
            if (r8 == 0) goto L_0x0206
            q.c[] r0 = r7.S
            r4 = r0[r6]
            q.c r8 = r4.f10879f
            if (r8 == 0) goto L_0x0142
            r9 = r0[r1]
            q.c r9 = r9.f10879f
            if (r9 == 0) goto L_0x0142
            boolean r0 = r7.z()
            if (r0 == 0) goto L_0x00fc
            r.f r0 = r10.f11452h
            q.d r2 = r10.f11446b
            q.c[] r2 = r2.S
            r2 = r2[r6]
            int r2 = r2.e()
            r0.f11428f = r2
            r.f r0 = r10.f11453i
            q.d r2 = r10.f11446b
            q.c[] r2 = r2.S
            r1 = r2[r1]
            int r1 = r1.e()
            int r1 = -r1
            r0.f11428f = r1
            goto L_0x013b
        L_0x00fc:
            q.d r0 = r10.f11446b
            q.c[] r0 = r0.S
            r0 = r0[r6]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0117
            r.f r3 = r10.f11452h
            q.d r4 = r10.f11446b
            q.c[] r4 = r4.S
            r4 = r4[r6]
            int r4 = r4.e()
            r.p.b(r3, r0, r4)
        L_0x0117:
            q.d r0 = r10.f11446b
            q.c[] r0 = r0.S
            r0 = r0[r1]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0133
            r.f r3 = r10.f11453i
            q.d r4 = r10.f11446b
            q.c[] r4 = r4.S
            r1 = r4[r1]
            int r1 = r1.e()
            int r1 = -r1
            r.p.b(r3, r0, r1)
        L_0x0133:
            r.f r0 = r10.f11452h
            r0.f11424b = r2
            r.f r0 = r10.f11453i
            r0.f11424b = r2
        L_0x013b:
            q.d r0 = r10.f11446b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x03ba
            goto L_0x016a
        L_0x0142:
            if (r8 == 0) goto L_0x0170
            r.f r0 = r.p.h(r4)
            if (r0 == 0) goto L_0x03ba
            r.f r1 = r10.f11452h
            q.d r2 = r10.f11446b
            q.c[] r2 = r2.S
            r2 = r2[r6]
            int r2 = r2.e()
            r.p.b(r1, r0, r2)
            r.f r0 = r10.f11453i
            r.f r1 = r10.f11452h
            r.g r2 = r10.f11449e
            int r2 = r2.f11429g
            r.p.b(r0, r1, r2)
            q.d r0 = r10.f11446b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x03ba
        L_0x016a:
            r.f r1 = r10.k
            r.f r2 = r10.f11452h
            goto L_0x01ff
        L_0x0170:
            r2 = r0[r1]
            q.c r4 = r2.f10879f
            if (r4 == 0) goto L_0x019f
            r.f r0 = r.p.h(r2)
            if (r0 == 0) goto L_0x0198
            r.f r2 = r10.f11453i
            q.d r3 = r10.f11446b
            q.c[] r3 = r3.S
            r1 = r3[r1]
            int r1 = r1.e()
            int r1 = -r1
            r.p.b(r2, r0, r1)
            r.f r0 = r10.f11452h
            r.f r1 = r10.f11453i
            r.g r2 = r10.f11449e
            int r2 = r2.f11429g
            int r2 = -r2
            r.p.b(r0, r1, r2)
        L_0x0198:
            q.d r0 = r10.f11446b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x03ba
            goto L_0x016a
        L_0x019f:
            r0 = r0[r3]
            q.c r1 = r0.f10879f
            if (r1 == 0) goto L_0x01c9
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x03ba
            r.f r1 = r10.k
            r.p.b(r1, r0, r5)
            r.f r0 = r10.f11452h
            r.f r1 = r10.k
            q.d r2 = r10.f11446b
            int r2 = r2.f10899d0
            int r2 = -r2
            r.p.b(r0, r1, r2)
            r.f r0 = r10.f11453i
            r.f r1 = r10.f11452h
            r.g r2 = r10.f11449e
            int r2 = r2.f11429g
            r.p.b(r0, r1, r2)
            goto L_0x03ba
        L_0x01c9:
            boolean r0 = r7 instanceof q.h
            if (r0 != 0) goto L_0x03ba
            q.d r0 = r7.W
            if (r0 == 0) goto L_0x03ba
            q.c$a r0 = q.c.a.CENTER
            q.c r0 = r7.j(r0)
            q.c r0 = r0.f10879f
            if (r0 != 0) goto L_0x03ba
            q.d r0 = r10.f11446b
            q.d r1 = r0.W
            r.n r1 = r1.f10900e
            r.f r1 = r1.f11452h
            r.f r2 = r10.f11452h
            int r0 = r0.t()
            r.p.b(r2, r1, r0)
            r.f r0 = r10.f11453i
            r.f r1 = r10.f11452h
            r.g r2 = r10.f11449e
            int r2 = r2.f11429g
            r.p.b(r0, r1, r2)
            q.d r0 = r10.f11446b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x03ba
            goto L_0x016a
        L_0x01ff:
            int r0 = r0.f10899d0
            r.p.b(r1, r2, r0)
            goto L_0x03ba
        L_0x0206:
            if (r4 != 0) goto L_0x025a
            int r4 = r10.f11448d
            if (r4 != r1) goto L_0x025a
            q.d r4 = r10.f11446b
            int r7 = r4.f10927t
            if (r7 == r6) goto L_0x0230
            if (r7 == r1) goto L_0x0215
            goto L_0x025d
        L_0x0215:
            boolean r0 = r4.z()
            if (r0 != 0) goto L_0x025d
            q.d r0 = r10.f11446b
            int r4 = r0.f10926s
            if (r4 != r1) goto L_0x0222
            goto L_0x025d
        L_0x0222:
            r.l r0 = r0.f10898d
            r.g r0 = r0.f11449e
            r.g r4 = r10.f11449e
            java.util.ArrayList r4 = r4.f11433l
            r4.add(r0)
            java.util.ArrayList r0 = r0.k
            goto L_0x0240
        L_0x0230:
            q.d r4 = r4.W
            if (r4 != 0) goto L_0x0235
            goto L_0x025d
        L_0x0235:
            r.n r4 = r4.f10900e
            r.g r4 = r4.f11449e
            java.util.ArrayList r0 = r0.f11433l
            r0.add(r4)
            java.util.ArrayList r0 = r4.k
        L_0x0240:
            r.g r4 = r10.f11449e
            r0.add(r4)
            r.g r0 = r10.f11449e
            r0.f11424b = r2
            java.util.ArrayList r0 = r0.k
            r.f r4 = r10.f11452h
            r0.add(r4)
            r.g r0 = r10.f11449e
            java.util.ArrayList r0 = r0.k
            r.f r4 = r10.f11453i
            r0.add(r4)
            goto L_0x025d
        L_0x025a:
            r0.b(r10)
        L_0x025d:
            q.d r0 = r10.f11446b
            q.c[] r4 = r0.S
            r7 = r4[r6]
            q.c r8 = r7.f10879f
            if (r8 == 0) goto L_0x02b8
            r9 = r4[r1]
            q.c r9 = r9.f10879f
            if (r9 == 0) goto L_0x02b8
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0291
            r.f r0 = r10.f11452h
            q.d r3 = r10.f11446b
            q.c[] r3 = r3.S
            r3 = r3[r6]
            int r3 = r3.e()
            r0.f11428f = r3
            r.f r0 = r10.f11453i
            q.d r3 = r10.f11446b
            q.c[] r3 = r3.S
            r1 = r3[r1]
            int r1 = r1.e()
            int r1 = -r1
            r0.f11428f = r1
            goto L_0x02b1
        L_0x0291:
            q.d r0 = r10.f11446b
            q.c[] r0 = r0.S
            r0 = r0[r6]
            r.f r0 = r.p.h(r0)
            q.d r4 = r10.f11446b
            q.c[] r4 = r4.S
            r1 = r4[r1]
            r.f r1 = r.p.h(r1)
            if (r0 == 0) goto L_0x02aa
            r0.b(r10)
        L_0x02aa:
            if (r1 == 0) goto L_0x02af
            r1.b(r10)
        L_0x02af:
            r10.f11454j = r3
        L_0x02b1:
            q.d r0 = r10.f11446b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x03ac
            goto L_0x0328
        L_0x02b8:
            r9 = 0
            if (r8 == 0) goto L_0x02fc
            r.f r0 = r.p.h(r7)
            if (r0 == 0) goto L_0x03ac
            r.f r3 = r10.f11452h
            q.d r4 = r10.f11446b
            q.c[] r4 = r4.S
            r4 = r4[r6]
            int r4 = r4.e()
            r.p.b(r3, r0, r4)
            r.f r0 = r10.f11453i
            r.f r3 = r10.f11452h
            r.g r4 = r10.f11449e
            r10.c(r0, r3, r2, r4)
            q.d r0 = r10.f11446b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x02e8
            r.f r0 = r10.k
            r.f r3 = r10.f11452h
            r.a r4 = r10.f11438l
            r10.c(r0, r3, r2, r4)
        L_0x02e8:
            int r0 = r10.f11448d
            if (r0 != r1) goto L_0x03ac
            q.d r0 = r10.f11446b
            float r3 = r0.Z
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ac
            r.l r0 = r0.f10898d
            int r3 = r0.f11448d
            if (r3 != r1) goto L_0x03ac
            goto L_0x0392
        L_0x02fc:
            r6 = r4[r1]
            q.c r7 = r6.f10879f
            r8 = -1
            if (r7 == 0) goto L_0x032f
            r.f r0 = r.p.h(r6)
            if (r0 == 0) goto L_0x03ac
            r.f r3 = r10.f11453i
            q.d r4 = r10.f11446b
            q.c[] r4 = r4.S
            r1 = r4[r1]
            int r1 = r1.e()
            int r1 = -r1
            r.p.b(r3, r0, r1)
            r.f r0 = r10.f11452h
            r.f r1 = r10.f11453i
            r.g r3 = r10.f11449e
            r10.c(r0, r1, r8, r3)
            q.d r0 = r10.f11446b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x03ac
        L_0x0328:
            r.f r0 = r10.k
            r.f r1 = r10.f11452h
            r.a r3 = r10.f11438l
            goto L_0x034f
        L_0x032f:
            r3 = r4[r3]
            q.c r4 = r3.f10879f
            if (r4 == 0) goto L_0x0353
            r.f r0 = r.p.h(r3)
            if (r0 == 0) goto L_0x03ac
            r.f r1 = r10.k
            r.p.b(r1, r0, r5)
            r.f r0 = r10.f11452h
            r.f r1 = r10.k
            r.a r3 = r10.f11438l
            r10.c(r0, r1, r8, r3)
            r.f r0 = r10.f11453i
            r.f r1 = r10.f11452h
            r.g r3 = r10.f11449e
        L_0x034f:
            r10.c(r0, r1, r2, r3)
            goto L_0x03ac
        L_0x0353:
            boolean r3 = r0 instanceof q.h
            if (r3 != 0) goto L_0x03ac
            q.d r3 = r0.W
            if (r3 == 0) goto L_0x03ac
            r.n r3 = r3.f10900e
            r.f r3 = r3.f11452h
            r.f r4 = r10.f11452h
            int r0 = r0.t()
            r.p.b(r4, r3, r0)
            r.f r0 = r10.f11453i
            r.f r3 = r10.f11452h
            r.g r4 = r10.f11449e
            r10.c(r0, r3, r2, r4)
            q.d r0 = r10.f11446b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0380
            r.f r0 = r10.k
            r.f r3 = r10.f11452h
            r.a r4 = r10.f11438l
            r10.c(r0, r3, r2, r4)
        L_0x0380:
            int r0 = r10.f11448d
            if (r0 != r1) goto L_0x03ac
            q.d r0 = r10.f11446b
            float r3 = r0.Z
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ac
            r.l r0 = r0.f10898d
            int r3 = r0.f11448d
            if (r3 != r1) goto L_0x03ac
        L_0x0392:
            r.g r0 = r0.f11449e
            java.util.ArrayList r0 = r0.k
            r.g r1 = r10.f11449e
            r0.add(r1)
            r.g r0 = r10.f11449e
            java.util.ArrayList r0 = r0.f11433l
            q.d r1 = r10.f11446b
            r.l r1 = r1.f10898d
            r.g r1 = r1.f11449e
            r0.add(r1)
            r.g r0 = r10.f11449e
            r0.f11423a = r10
        L_0x03ac:
            r.g r0 = r10.f11449e
            java.util.ArrayList r0 = r0.f11433l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x03ba
            r.g r0 = r10.f11449e
            r0.f11425c = r2
        L_0x03ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.n.d():void");
    }

    public final void e() {
        f fVar = this.f11452h;
        if (fVar.f11432j) {
            this.f11446b.f10897c0 = fVar.f11429g;
        }
    }

    public final void f() {
        this.f11447c = null;
        this.f11452h.c();
        this.f11453i.c();
        this.k.c();
        this.f11449e.c();
        this.f11451g = false;
    }

    public final boolean k() {
        return this.f11448d != 3 || this.f11446b.f10927t == 0;
    }

    public final void m() {
        this.f11451g = false;
        this.f11452h.c();
        this.f11452h.f11432j = false;
        this.f11453i.c();
        this.f11453i.f11432j = false;
        this.k.c();
        this.k.f11432j = false;
        this.f11449e.f11432j = false;
    }

    public final String toString() {
        StringBuilder g10 = f.g("VerticalRun ");
        g10.append(this.f11446b.f10912k0);
        return g10.toString();
    }
}
