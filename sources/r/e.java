package r;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.adapters.ironsource.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.d;
import q.g;
import q.i;
import r.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public q.e f11415a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11416b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11417c = true;

    /* renamed from: d  reason: collision with root package name */
    public q.e f11418d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f11419e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0134b f11420f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f11421g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<m> f11422h;

    public e(q.e eVar) {
        new ArrayList();
        this.f11420f = null;
        this.f11421g = new b.a();
        this.f11422h = new ArrayList<>();
        this.f11415a = eVar;
        this.f11418d = eVar;
    }

    public final void a(f fVar, int i10, int i11, ArrayList arrayList, m mVar) {
        p pVar = fVar.f11426d;
        if (pVar.f11447c == null) {
            q.e eVar = this.f11415a;
            if (pVar != eVar.f10898d && pVar != eVar.f10900e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f11447c = mVar;
                mVar.f11437b.add(pVar);
                Iterator it = pVar.f11452h.k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i10, 0, arrayList, mVar);
                    }
                }
                Iterator it2 = pVar.f11453i.k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i10, 1, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).k.k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i10, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = pVar.f11452h.f11433l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i10, 0, arrayList, mVar);
                }
                Iterator it5 = pVar.f11453i.f11433l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i10, 1, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).k.f11433l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i10, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2.f10927t == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0107, code lost:
        if (r10[1].f10879f != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0164, code lost:
        if (r3[3].f10879f != null) goto L_0x016d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(q.e r18) {
        /*
            r17 = this;
            r0 = r18
            java.util.ArrayList<q.d> r1 = r0.f10970s0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0211
            java.lang.Object r2 = r1.next()
            q.d r2 = (q.d) r2
            int[] r3 = r2.V
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r3 = r3[r9]
            int r6 = r2.f10911j0
            r7 = 8
            if (r6 != r7) goto L_0x0024
            goto L_0x019e
        L_0x0024:
            float r6 = r2.f10929x
            r10 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r8 = 3
            r11 = 2
            if (r7 >= 0) goto L_0x0032
            if (r5 != r8) goto L_0x0032
            r2.f10926s = r11
        L_0x0032:
            float r7 = r2.A
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x003c
            if (r3 != r8) goto L_0x003c
            r2.f10927t = r11
        L_0x003c:
            float r12 = r2.Z
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0063
            if (r5 != r8) goto L_0x004c
            if (r3 == r11) goto L_0x0049
            if (r3 != r9) goto L_0x004c
        L_0x0049:
            r2.f10926s = r8
            goto L_0x0063
        L_0x004c:
            if (r3 != r8) goto L_0x0053
            if (r5 == r11) goto L_0x0061
            if (r5 != r9) goto L_0x0053
            goto L_0x0061
        L_0x0053:
            if (r5 != r8) goto L_0x0063
            if (r3 != r8) goto L_0x0063
            int r12 = r2.f10926s
            if (r12 != 0) goto L_0x005d
            r2.f10926s = r8
        L_0x005d:
            int r12 = r2.f10927t
            if (r12 != 0) goto L_0x0063
        L_0x0061:
            r2.f10927t = r8
        L_0x0063:
            if (r5 != r8) goto L_0x0076
            int r12 = r2.f10926s
            if (r12 != r9) goto L_0x0076
            q.c r12 = r2.K
            q.c r12 = r12.f10879f
            if (r12 == 0) goto L_0x0075
            q.c r12 = r2.M
            q.c r12 = r12.f10879f
            if (r12 != 0) goto L_0x0076
        L_0x0075:
            r5 = r11
        L_0x0076:
            if (r3 != r8) goto L_0x008a
            int r12 = r2.f10927t
            if (r12 != r9) goto L_0x008a
            q.c r12 = r2.L
            q.c r12 = r12.f10879f
            if (r12 == 0) goto L_0x0088
            q.c r12 = r2.N
            q.c r12 = r12.f10879f
            if (r12 != 0) goto L_0x008a
        L_0x0088:
            r12 = r11
            goto L_0x008b
        L_0x008a:
            r12 = r3
        L_0x008b:
            r.l r3 = r2.f10898d
            r3.f11448d = r5
            int r13 = r2.f10926s
            r3.f11445a = r13
            r.n r3 = r2.f10900e
            r3.f11448d = r12
            int r14 = r2.f10927t
            r3.f11445a = r14
            r3 = 4
            if (r5 == r3) goto L_0x00a2
            if (r5 == r9) goto L_0x00a2
            if (r5 != r11) goto L_0x00aa
        L_0x00a2:
            if (r12 == r3) goto L_0x01c2
            if (r12 == r9) goto L_0x01c2
            if (r12 != r11) goto L_0x00aa
            goto L_0x01c2
        L_0x00aa:
            r15 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r8) goto L_0x010a
            if (r12 == r11) goto L_0x00b2
            if (r12 != r9) goto L_0x010a
        L_0x00b2:
            if (r13 != r8) goto L_0x00cc
            if (r12 != r11) goto L_0x00c0
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r17
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
        L_0x00c0:
            int r3 = r2.l()
            float r4 = (float) r3
            float r5 = r2.Z
            float r4 = r4 * r5
            float r4 = r4 + r15
            int r4 = (int) r4
            goto L_0x0194
        L_0x00cc:
            if (r13 != r9) goto L_0x00e2
            r6 = 0
            r8 = 0
            r5 = 2
            r3 = r17
            r4 = r2
            r7 = r12
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.f10898d
            r.g r3 = r3.f11449e
            int r2 = r2.r()
            goto L_0x01be
        L_0x00e2:
            if (r13 != r11) goto L_0x00fb
            int[] r10 = r0.V
            r10 = r10[r4]
            if (r10 == r9) goto L_0x00ec
            if (r10 != r3) goto L_0x010a
        L_0x00ec:
            int r3 = r18.r()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r4 = (int) r6
            int r3 = r2.l()
            r11 = r9
            goto L_0x0167
        L_0x00fb:
            q.c[] r10 = r2.S
            r3 = r10[r4]
            q.c r3 = r3.f10879f
            if (r3 == 0) goto L_0x0166
            r3 = r10[r9]
            q.c r3 = r3.f10879f
            if (r3 != 0) goto L_0x010a
            goto L_0x0166
        L_0x010a:
            if (r12 != r8) goto L_0x016d
            if (r5 == r11) goto L_0x0110
            if (r5 != r9) goto L_0x016d
        L_0x0110:
            if (r14 != r8) goto L_0x0133
            if (r5 != r11) goto L_0x011e
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r17
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
        L_0x011e:
            int r4 = r2.r()
            float r3 = r2.Z
            int r5 = r2.f10893a0
            r6 = -1
            if (r5 != r6) goto L_0x012d
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r5 / r3
        L_0x012d:
            float r5 = (float) r4
            float r5 = r5 * r3
            float r5 = r5 + r15
            int r3 = (int) r5
            goto L_0x0194
        L_0x0133:
            if (r14 != r9) goto L_0x0140
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r17
            r4 = r2
            r3.f(r4, r5, r6, r7, r8)
            goto L_0x01b6
        L_0x0140:
            if (r14 != r11) goto L_0x0158
            int[] r3 = r0.V
            r3 = r3[r9]
            if (r3 == r9) goto L_0x014b
            r10 = 4
            if (r3 != r10) goto L_0x016d
        L_0x014b:
            int r3 = r2.r()
            int r4 = r18.l()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r15
            int r4 = (int) r7
            goto L_0x019a
        L_0x0158:
            q.c[] r3 = r2.S
            r10 = r3[r11]
            q.c r10 = r10.f10879f
            if (r10 == 0) goto L_0x0166
            r3 = r3[r8]
            q.c r3 = r3.f10879f
            if (r3 != 0) goto L_0x016d
        L_0x0166:
            r3 = r4
        L_0x0167:
            r8 = r3
            r6 = r4
            r5 = r11
            r7 = r12
            goto L_0x01f4
        L_0x016d:
            if (r5 != r8) goto L_0x0008
            if (r12 != r8) goto L_0x0008
            if (r13 == r9) goto L_0x01a2
            if (r14 != r9) goto L_0x0176
            goto L_0x01a2
        L_0x0176:
            if (r14 != r11) goto L_0x0008
            if (r13 != r11) goto L_0x0008
            int[] r3 = r0.V
            r4 = r3[r4]
            if (r4 != r9) goto L_0x0008
            r3 = r3[r9]
            if (r3 != r9) goto L_0x0008
            int r3 = r18.r()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r4 = (int) r6
            int r3 = r18.l()
            float r3 = (float) r3
            float r7 = r7 * r3
            float r7 = r7 + r15
            int r3 = (int) r7
        L_0x0194:
            r5 = r9
            r16 = r4
            r4 = r3
            r3 = r16
        L_0x019a:
            r6 = r3
            r8 = r4
            r7 = r9
            goto L_0x01f4
        L_0x019e:
            r2.f10892a = r9
            goto L_0x0008
        L_0x01a2:
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r17
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.f10898d
            r.g r3 = r3.f11449e
            int r4 = r2.r()
            r3.f11434m = r4
        L_0x01b6:
            r.n r3 = r2.f10900e
            r.g r3 = r3.f11449e
            int r2 = r2.l()
        L_0x01be:
            r3.f11434m = r2
            goto L_0x0008
        L_0x01c2:
            int r3 = r2.r()
            r4 = 4
            if (r5 != r4) goto L_0x01da
            int r3 = r18.r()
            q.c r5 = r2.K
            int r5 = r5.f10880g
            int r3 = r3 - r5
            q.c r5 = r2.M
            int r5 = r5.f10880g
            int r3 = r3 - r5
            r6 = r3
            r5 = r9
            goto L_0x01db
        L_0x01da:
            r6 = r3
        L_0x01db:
            int r3 = r2.l()
            if (r12 != r4) goto L_0x01f2
            int r3 = r18.l()
            q.c r4 = r2.L
            int r4 = r4.f10880g
            int r3 = r3 - r4
            q.c r4 = r2.N
            int r4 = r4.f10880g
            int r3 = r3 - r4
            r8 = r3
            r7 = r9
            goto L_0x01f4
        L_0x01f2:
            r8 = r3
            r7 = r12
        L_0x01f4:
            r3 = r17
            r4 = r2
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.f10898d
            r.g r3 = r3.f11449e
            int r4 = r2.r()
            r3.d(r4)
            r.n r3 = r2.f10900e
            r.g r3 = r3.f11449e
            int r4 = r2.l()
            r3.d(r4)
            goto L_0x019e
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.e.b(q.e):void");
    }

    public final void c() {
        Object obj;
        ArrayList<p> arrayList = this.f11419e;
        arrayList.clear();
        this.f11418d.f10898d.f();
        this.f11418d.f10900e.f();
        arrayList.add(this.f11418d.f10898d);
        arrayList.add(this.f11418d.f10900e);
        Iterator<d> it = this.f11418d.f10970s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof g) {
                obj = new j(next);
            } else {
                if (next.y()) {
                    if (next.f10894b == null) {
                        next.f10894b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10894b);
                } else {
                    arrayList.add(next.f10898d);
                }
                if (next.z()) {
                    if (next.f10896c == null) {
                        next.f10896c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f10896c);
                } else {
                    arrayList.add(next.f10900e);
                }
                if (next instanceof i) {
                    obj = new k(next);
                }
            }
            arrayList.add(obj);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f11446b != this.f11418d) {
                next2.d();
            }
        }
        this.f11422h.clear();
        e(this.f11415a.f10898d, 0, this.f11422h);
        e(this.f11415a.f10900e, 1, this.f11422h);
        this.f11416b = false;
    }

    public final int d(q.e eVar, int i10) {
        p pVar;
        p pVar2;
        long j10;
        long j11;
        float f10;
        long j12;
        e eVar2 = this;
        q.e eVar3 = eVar;
        int i11 = i10;
        int size = eVar2.f11422h.size();
        long j13 = 0;
        int i12 = 0;
        long j14 = 0;
        while (i12 < size) {
            m mVar = eVar2.f11422h.get(i12);
            p pVar3 = mVar.f11436a;
            if (pVar3 instanceof c) {
                if (((c) pVar3).f11450f != i11) {
                    j13 = Math.max(j13, j14);
                    i12++;
                    j14 = 0;
                    eVar2 = this;
                    eVar3 = eVar;
                }
            } else if (i11 == 0) {
                if (!(pVar3 instanceof l)) {
                    j13 = Math.max(j13, j14);
                    i12++;
                    j14 = 0;
                    eVar2 = this;
                    eVar3 = eVar;
                }
            } else if (!(pVar3 instanceof n)) {
                j13 = Math.max(j13, j14);
                i12++;
                j14 = 0;
                eVar2 = this;
                eVar3 = eVar;
            }
            if (i11 == 0) {
                pVar = eVar3.f10898d;
            } else {
                pVar = eVar3.f10900e;
            }
            f fVar = pVar.f11452h;
            if (i11 == 0) {
                pVar2 = eVar3.f10898d;
            } else {
                pVar2 = eVar3.f10900e;
            }
            f fVar2 = pVar2.f11453i;
            boolean contains = pVar3.f11452h.f11433l.contains(fVar);
            boolean contains2 = mVar.f11436a.f11453i.f11433l.contains(fVar2);
            long j15 = mVar.f11436a.j();
            if (!contains || !contains2) {
                p pVar4 = mVar.f11436a;
                if (contains) {
                    f fVar3 = pVar4.f11452h;
                    j11 = m.b(fVar3, (long) fVar3.f11428f);
                    j10 = ((long) mVar.f11436a.f11452h.f11428f) + j15;
                } else if (contains2) {
                    f fVar4 = pVar4.f11453i;
                    long a10 = m.a(fVar4, (long) fVar4.f11428f);
                    j10 = ((long) (-mVar.f11436a.f11453i.f11428f)) + j15;
                    j11 = -a10;
                } else {
                    j14 = (pVar4.j() + ((long) pVar4.f11452h.f11428f)) - ((long) mVar.f11436a.f11453i.f11428f);
                    j13 = Math.max(j13, j14);
                    i12++;
                    j14 = 0;
                    eVar2 = this;
                    eVar3 = eVar;
                }
                j14 = Math.max(j11, j10);
                j13 = Math.max(j13, j14);
                i12++;
                j14 = 0;
                eVar2 = this;
                eVar3 = eVar;
            } else {
                long b10 = m.b(mVar.f11436a.f11452h, j14);
                long a11 = m.a(mVar.f11436a.f11453i, j14);
                long j16 = b10 - j15;
                p pVar5 = mVar.f11436a;
                int i13 = pVar5.f11453i.f11428f;
                if (j16 >= ((long) (-i13))) {
                    j16 += (long) i13;
                }
                long j17 = (long) pVar5.f11452h.f11428f;
                long j18 = ((-a11) - j15) - j17;
                if (j18 >= j17) {
                    j18 -= j17;
                }
                d dVar = pVar5.f11446b;
                if (i11 == 0) {
                    f10 = dVar.f10905g0;
                } else if (i11 == 1) {
                    f10 = dVar.f10907h0;
                } else {
                    dVar.getClass();
                    f10 = -1.0f;
                }
                if (f10 > 0.0f) {
                    j12 = (long) ((((float) j16) / (1.0f - f10)) + (((float) j18) / f10));
                } else {
                    j12 = 0;
                }
                float f11 = (float) j12;
                long e10 = ((long) ((f11 * f10) + 0.5f)) + j15 + ((long) a.e(1.0f, f10, f11, 0.5f));
                p pVar6 = mVar.f11436a;
                j14 = (((long) pVar6.f11452h.f11428f) + e10) - ((long) pVar6.f11453i.f11428f);
                j13 = Math.max(j13, j14);
                i12++;
                j14 = 0;
                eVar2 = this;
                eVar3 = eVar;
            }
        }
        return (int) j13;
    }

    public final void e(p pVar, int i10, ArrayList<m> arrayList) {
        Iterator it = pVar.f11452h.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f11452h, i10, 0, arrayList, (m) null);
            }
        }
        Iterator it2 = pVar.f11453i.k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f11453i, i10, 1, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((n) pVar).k.k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(d dVar, int i10, int i11, int i12, int i13) {
        boolean z9;
        b.a aVar = this.f11421g;
        aVar.f11404a = i10;
        aVar.f11405b = i12;
        aVar.f11406c = i11;
        aVar.f11407d = i13;
        ((ConstraintLayout.b) this.f11420f).b(dVar, aVar);
        dVar.O(this.f11421g.f11408e);
        dVar.L(this.f11421g.f11409f);
        b.a aVar2 = this.f11421g;
        dVar.F = aVar2.f11411h;
        int i14 = aVar2.f11410g;
        dVar.f10899d0 = i14;
        if (i14 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.F = z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r10 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r8 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r2.d(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r12 = this;
            q.e r0 = r12.f11415a
            java.util.ArrayList<q.d> r0 = r0.f10970s0
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r0.next()
            q.d r1 = (q.d) r1
            boolean r2 = r1.f10892a
            if (r2 == 0) goto L_0x0019
            goto L_0x0008
        L_0x0019:
            int[] r2 = r1.V
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f10926s
            int r4 = r1.f10927t
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L_0x0030
            if (r8 != r11) goto L_0x002e
            if (r2 != r9) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = r3
            goto L_0x0031
        L_0x0030:
            r2 = r9
        L_0x0031:
            if (r10 == r5) goto L_0x0037
            if (r10 != r11) goto L_0x0038
            if (r4 != r9) goto L_0x0038
        L_0x0037:
            r3 = r9
        L_0x0038:
            r.l r4 = r1.f10898d
            r.g r4 = r4.f11449e
            boolean r5 = r4.f11432j
            r.n r6 = r1.f10900e
            r.g r6 = r6.f11449e
            boolean r7 = r6.f11432j
            if (r5 == 0) goto L_0x0054
            if (r7 == 0) goto L_0x0054
            int r5 = r4.f11429g
            int r7 = r6.f11429g
            r6 = 1
            r2 = r12
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L_0x008d
        L_0x0054:
            if (r5 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            int r5 = r4.f11429g
            int r7 = r6.f11429g
            r4 = 1
            r6 = 2
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            r.n r2 = r1.f10900e
            r.g r2 = r2.f11449e
            int r3 = r1.l()
            if (r10 != r11) goto L_0x008a
            goto L_0x0087
        L_0x006e:
            if (r7 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            int r5 = r4.f11429g
            int r7 = r6.f11429g
            r4 = 2
            r6 = 1
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            r.l r2 = r1.f10898d
            r.g r2 = r2.f11449e
            int r3 = r1.r()
            if (r8 != r11) goto L_0x008a
        L_0x0087:
            r2.f11434m = r3
            goto L_0x008f
        L_0x008a:
            r2.d(r3)
        L_0x008d:
            r1.f10892a = r9
        L_0x008f:
            boolean r2 = r1.f10892a
            if (r2 == 0) goto L_0x0008
            r.n r2 = r1.f10900e
            r.a r2 = r2.f11438l
            if (r2 == 0) goto L_0x0008
            int r1 = r1.f10899d0
            r2.d(r1)
            goto L_0x0008
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.e.g():void");
    }
}
