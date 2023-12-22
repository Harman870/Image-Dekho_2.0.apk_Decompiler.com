package r;

import q.c;
import q.d;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f11445a;

    /* renamed from: b  reason: collision with root package name */
    public d f11446b;

    /* renamed from: c  reason: collision with root package name */
    public m f11447c;

    /* renamed from: d  reason: collision with root package name */
    public int f11448d;

    /* renamed from: e  reason: collision with root package name */
    public g f11449e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f11450f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11451g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f11452h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f11453i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f11454j = 1;

    public p(d dVar) {
        this.f11446b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f11433l.add(fVar2);
        fVar.f11428f = i10;
        fVar2.k.add(fVar);
    }

    public static f h(c cVar) {
        p pVar;
        p pVar2;
        c cVar2 = cVar.f10879f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f10877d;
        int ordinal = cVar2.f10878e.ordinal();
        if (ordinal == 1) {
            pVar = dVar.f10898d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                pVar2 = dVar.f10898d;
            } else if (ordinal == 4) {
                pVar2 = dVar.f10900e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return dVar.f10900e.k;
            }
            return pVar2.f11453i;
        } else {
            pVar = dVar.f10900e;
        }
        return pVar.f11452h;
    }

    public static f i(c cVar, int i10) {
        c cVar2 = cVar.f10879f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f10877d;
        p pVar = i10 == 0 ? dVar.f10898d : dVar.f10900e;
        int ordinal = cVar2.f10878e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f11452h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return pVar.f11453i;
        }
        return null;
    }

    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f11433l.add(fVar2);
        fVar.f11433l.add(this.f11449e);
        fVar.f11430h = i10;
        fVar.f11431i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            d dVar = this.f11446b;
            int i13 = dVar.w;
            i12 = Math.max(dVar.f10928v, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            d dVar2 = this.f11446b;
            int i14 = dVar2.f10931z;
            int max = Math.max(dVar2.f10930y, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public long j() {
        g gVar = this.f11449e;
        if (gVar.f11432j) {
            return (long) gVar.f11429g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f11445a == 3) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(q.c r13, q.c r14, int r15) {
        /*
            r12 = this;
            r.f r0 = h(r13)
            r.f r1 = h(r14)
            boolean r2 = r0.f11432j
            if (r2 == 0) goto L_0x00ea
            boolean r2 = r1.f11432j
            if (r2 != 0) goto L_0x0012
            goto L_0x00ea
        L_0x0012:
            int r2 = r0.f11429g
            int r13 = r13.e()
            int r13 = r13 + r2
            int r2 = r1.f11429g
            int r14 = r14.e()
            int r2 = r2 - r14
            int r14 = r2 - r13
            r.g r3 = r12.f11449e
            boolean r4 = r3.f11432j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00a9
            int r4 = r12.f11448d
            r6 = 3
            if (r4 != r6) goto L_0x00a9
            int r4 = r12.f11445a
            if (r4 == 0) goto L_0x00a1
            r7 = 1
            if (r4 == r7) goto L_0x0091
            r8 = 2
            if (r4 == r8) goto L_0x0070
            if (r4 == r6) goto L_0x003d
            goto L_0x00a9
        L_0x003d:
            q.d r4 = r12.f11446b
            r.l r8 = r4.f10898d
            int r9 = r8.f11448d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f11445a
            if (r9 != r6) goto L_0x0054
            r.n r9 = r4.f10900e
            int r10 = r9.f11448d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f11445a
            if (r9 != r6) goto L_0x0054
            goto L_0x00a9
        L_0x0054:
            if (r15 != 0) goto L_0x0058
            r.n r8 = r4.f10900e
        L_0x0058:
            r.g r6 = r8.f11449e
            boolean r8 = r6.f11432j
            if (r8 == 0) goto L_0x00a9
            float r4 = r4.Z
            if (r15 != r7) goto L_0x0069
            int r6 = r6.f11429g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a6
        L_0x0069:
            int r6 = r6.f11429g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
            goto L_0x00a6
        L_0x0070:
            q.d r4 = r12.f11446b
            q.d r6 = r4.W
            if (r6 == 0) goto L_0x00a9
            if (r15 != 0) goto L_0x007b
            r.l r6 = r6.f10898d
            goto L_0x007d
        L_0x007b:
            r.n r6 = r6.f10900e
        L_0x007d:
            r.g r6 = r6.f11449e
            boolean r7 = r6.f11432j
            if (r7 == 0) goto L_0x00a9
            if (r15 != 0) goto L_0x0088
            float r4 = r4.f10929x
            goto L_0x008a
        L_0x0088:
            float r4 = r4.A
        L_0x008a:
            int r6 = r6.f11429g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a2
        L_0x0091:
            int r3 = r3.f11434m
            int r3 = r12.g(r3, r15)
            r.g r4 = r12.f11449e
            int r3 = java.lang.Math.min(r3, r14)
            r11 = r4
            r4 = r3
            r3 = r11
            goto L_0x00a6
        L_0x00a1:
            r4 = r14
        L_0x00a2:
            int r4 = r12.g(r4, r15)
        L_0x00a6:
            r3.d(r4)
        L_0x00a9:
            r.g r3 = r12.f11449e
            boolean r4 = r3.f11432j
            if (r4 != 0) goto L_0x00b0
            return
        L_0x00b0:
            int r3 = r3.f11429g
            if (r3 != r14) goto L_0x00bf
            r.f r14 = r12.f11452h
            r14.d(r13)
            r.f r13 = r12.f11453i
            r13.d(r2)
            return
        L_0x00bf:
            q.d r14 = r12.f11446b
            if (r15 != 0) goto L_0x00c6
            float r14 = r14.f10905g0
            goto L_0x00c8
        L_0x00c6:
            float r14 = r14.f10907h0
        L_0x00c8:
            if (r0 != r1) goto L_0x00cf
            int r13 = r0.f11429g
            int r2 = r1.f11429g
            r14 = r5
        L_0x00cf:
            int r2 = r2 - r13
            int r2 = r2 - r3
            r.f r15 = r12.f11452h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.d(r13)
            r.f r13 = r12.f11453i
            r.f r14 = r12.f11452h
            int r14 = r14.f11429g
            r.g r15 = r12.f11449e
            int r15 = r15.f11429g
            int r14 = r14 + r15
            r13.d(r14)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.p.l(q.c, q.c, int):void");
    }
}
