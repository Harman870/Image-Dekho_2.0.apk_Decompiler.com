package o;

import java.util.Arrays;
import o.b;
import q.c;

public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f10425p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f10426q = 1000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10427a;

    /* renamed from: b  reason: collision with root package name */
    public int f10428b;

    /* renamed from: c  reason: collision with root package name */
    public f f10429c;

    /* renamed from: d  reason: collision with root package name */
    public int f10430d;

    /* renamed from: e  reason: collision with root package name */
    public int f10431e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f10432f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10433g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f10434h;

    /* renamed from: i  reason: collision with root package name */
    public int f10435i;

    /* renamed from: j  reason: collision with root package name */
    public int f10436j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public final c f10437l;

    /* renamed from: m  reason: collision with root package name */
    public h[] f10438m;

    /* renamed from: n  reason: collision with root package name */
    public int f10439n;

    /* renamed from: o  reason: collision with root package name */
    public b f10440o;

    public interface a {
        h a(boolean[] zArr);
    }

    public d() {
        this.f10427a = false;
        this.f10428b = 0;
        this.f10430d = 32;
        this.f10431e = 32;
        this.f10432f = null;
        this.f10433g = false;
        this.f10434h = new boolean[32];
        this.f10435i = 1;
        this.f10436j = 0;
        this.k = 32;
        this.f10438m = new h[f10426q];
        this.f10439n = 0;
        this.f10432f = new b[32];
        t();
        c cVar = new c();
        this.f10437l = cVar;
        this.f10429c = new f(cVar);
        this.f10440o = new b(cVar);
    }

    public static int o(c cVar) {
        h hVar = cVar.f10882i;
        if (hVar != null) {
            return (int) (hVar.f10454e + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: o.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.h a(int r6) {
        /*
            r5 = this;
            o.c r0 = r5.f10437l
            java.lang.Object r0 = r0.f10423c
            o.e r0 = (o.e) r0
            int r1 = r0.f10442b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.f10441a
            r4 = r3[r1]
            r3[r1] = r2
            r0.f10442b = r1
            r2 = r4
        L_0x0016:
            o.h r2 = (o.h) r2
            if (r2 != 0) goto L_0x0020
            o.h r2 = new o.h
            r2.<init>(r6)
            goto L_0x0023
        L_0x0020:
            r2.c()
        L_0x0023:
            r2.f10458i = r6
            int r6 = r5.f10439n
            int r0 = f10426q
            if (r6 < r0) goto L_0x0039
            int r0 = r0 * 2
            f10426q = r0
            o.h[] r6 = r5.f10438m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            o.h[] r6 = (o.h[]) r6
            r5.f10438m = r6
        L_0x0039:
            o.h[] r6 = r5.f10438m
            int r0 = r5.f10439n
            int r1 = r0 + 1
            r5.f10439n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.a(int):o.h");
    }

    public final void b(h hVar, h hVar2, int i10, float f10, h hVar3, h hVar4, int i11, int i12) {
        float f11;
        int i13;
        b m2 = m();
        if (hVar2 == hVar3) {
            m2.f10419d.c(hVar, 1.0f);
            m2.f10419d.c(hVar4, 1.0f);
            m2.f10419d.c(hVar2, -2.0f);
        } else {
            if (f10 == 0.5f) {
                m2.f10419d.c(hVar, 1.0f);
                m2.f10419d.c(hVar2, -1.0f);
                m2.f10419d.c(hVar3, -1.0f);
                m2.f10419d.c(hVar4, 1.0f);
                if (i10 > 0 || i11 > 0) {
                    i13 = (-i10) + i11;
                }
            } else if (f10 <= 0.0f) {
                m2.f10419d.c(hVar, -1.0f);
                m2.f10419d.c(hVar2, 1.0f);
                f11 = (float) i10;
                m2.f10417b = f11;
            } else if (f10 >= 1.0f) {
                m2.f10419d.c(hVar4, -1.0f);
                m2.f10419d.c(hVar3, 1.0f);
                i13 = -i11;
            } else {
                float f12 = 1.0f - f10;
                m2.f10419d.c(hVar, f12 * 1.0f);
                m2.f10419d.c(hVar2, f12 * -1.0f);
                m2.f10419d.c(hVar3, -1.0f * f10);
                m2.f10419d.c(hVar4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    m2.f10417b = (((float) i11) * f10) + (((float) (-i10)) * f12);
                }
            }
            f11 = (float) i13;
            m2.f10417b = f11;
        }
        if (i12 != 8) {
            m2.b(this, i12);
        }
        c(m2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r4.f10460l <= 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r4.f10460l <= 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e6, code lost:
        if (r4.f10460l <= 1) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        if (r4.f10460l <= 1) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(o.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f10436j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f10435i
            int r2 = r2 + r3
            int r4 = r0.f10431e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.f10420e
            if (r2 != 0) goto L_0x01c5
            o.b[] r2 = r0.f10432f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            o.b$a r6 = r1.f10419d
            int r6 = r6.d()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            o.b$a r8 = r1.f10419d
            o.h r8 = r8.h(r7)
            int r9 = r8.f10452c
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f10455f
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<o.h> r9 = r1.f10418c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<o.h> r6 = r1.f10418c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<o.h> r8 = r1.f10418c
            java.lang.Object r8 = r8.get(r7)
            o.h r8 = (o.h) r8
            boolean r9 = r8.f10455f
            if (r9 == 0) goto L_0x005f
            r1.h(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            o.b[] r9 = r0.f10432f
            int r8 = r8.f10452c
            r8 = r9[r8]
            r1.i(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<o.h> r6 = r1.f10418c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = r3
            goto L_0x0022
        L_0x0073:
            o.h r2 = r1.f10416a
            if (r2 == 0) goto L_0x0083
            o.b$a r2 = r1.f10419d
            int r2 = r2.d()
            if (r2 != 0) goto L_0x0083
            r1.f10420e = r3
            r0.f10427a = r3
        L_0x0083:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f10417b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f10417b = r2
            o.b$a r2 = r1.f10419d
            r2.k()
        L_0x009b:
            o.b$a r2 = r1.f10419d
            int r2 = r2.d()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a9:
            if (r8 >= r2) goto L_0x0106
            o.b$a r15 = r1.f10419d
            float r15 = r15.a(r8)
            o.b$a r4 = r1.f10419d
            o.h r4 = r4.h(r8)
            int r5 = r4.f10458i
            if (r5 != r3) goto L_0x00dc
            if (r9 != 0) goto L_0x00c2
            int r5 = r4.f10460l
            if (r5 > r3) goto L_0x00cb
            goto L_0x00d8
        L_0x00c2:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cd
            int r5 = r4.f10460l
            if (r5 > r3) goto L_0x00cb
            goto L_0x00d8
        L_0x00cb:
            r12 = 0
            goto L_0x00d9
        L_0x00cd:
            if (r12 != 0) goto L_0x0102
            int r5 = r4.f10460l
            if (r5 > r3) goto L_0x00d5
            r5 = r3
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            if (r5 == 0) goto L_0x0102
        L_0x00d8:
            r12 = r3
        L_0x00d9:
            r9 = r4
            r11 = r15
            goto L_0x0102
        L_0x00dc:
            if (r9 != 0) goto L_0x0102
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0102
            if (r10 != 0) goto L_0x00e9
            int r5 = r4.f10460l
            if (r5 > r3) goto L_0x00f2
            goto L_0x00ff
        L_0x00e9:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f4
            int r5 = r4.f10460l
            if (r5 > r3) goto L_0x00f2
            goto L_0x00ff
        L_0x00f2:
            r14 = 0
            goto L_0x0100
        L_0x00f4:
            if (r14 != 0) goto L_0x0102
            int r5 = r4.f10460l
            if (r5 > r3) goto L_0x00fc
            r5 = r3
            goto L_0x00fd
        L_0x00fc:
            r5 = 0
        L_0x00fd:
            if (r5 == 0) goto L_0x0102
        L_0x00ff:
            r14 = r3
        L_0x0100:
            r10 = r4
            r13 = r15
        L_0x0102:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a9
        L_0x0106:
            if (r9 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r9 = r10
        L_0x010a:
            if (r9 != 0) goto L_0x010e
            r2 = r3
            goto L_0x0112
        L_0x010e:
            r1.g(r9)
            r2 = 0
        L_0x0112:
            o.b$a r4 = r1.f10419d
            int r4 = r4.d()
            if (r4 != 0) goto L_0x011c
            r1.f10420e = r3
        L_0x011c:
            if (r2 == 0) goto L_0x01af
            int r2 = r0.f10435i
            int r2 = r2 + r3
            int r4 = r0.f10431e
            if (r2 < r4) goto L_0x0128
            r16.p()
        L_0x0128:
            r2 = 3
            o.h r2 = r0.a(r2)
            int r4 = r0.f10428b
            int r4 = r4 + r3
            r0.f10428b = r4
            int r5 = r0.f10435i
            int r5 = r5 + r3
            r0.f10435i = r5
            r2.f10451b = r4
            o.c r5 = r0.f10437l
            java.lang.Object r5 = r5.f10424d
            o.h[] r5 = (o.h[]) r5
            r5[r4] = r2
            r1.f10416a = r2
            int r4 = r0.f10436j
            r16.i(r17)
            int r5 = r0.f10436j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01af
            o.b r4 = r0.f10440o
            r4.getClass()
            r4.f10416a = r7
            o.b$a r5 = r4.f10419d
            r5.clear()
            r5 = 0
        L_0x015a:
            o.b$a r8 = r1.f10419d
            int r8 = r8.d()
            if (r5 >= r8) goto L_0x0176
            o.b$a r8 = r1.f10419d
            o.h r8 = r8.h(r5)
            o.b$a r9 = r1.f10419d
            float r9 = r9.a(r5)
            o.b$a r10 = r4.f10419d
            r10.b(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x015a
        L_0x0176:
            o.b r4 = r0.f10440o
            r0.s(r4)
            int r4 = r2.f10452c
            r5 = -1
            if (r4 != r5) goto L_0x01ad
            o.h r4 = r1.f10416a
            if (r4 != r2) goto L_0x018d
            o.h r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x018d
            r1.g(r2)
        L_0x018d:
            boolean r2 = r1.f10420e
            if (r2 != 0) goto L_0x0196
            o.h r2 = r1.f10416a
            r2.e(r0, r1)
        L_0x0196:
            o.c r2 = r0.f10437l
            java.lang.Object r2 = r2.f10422b
            o.e r2 = (o.e) r2
            int r4 = r2.f10442b
            java.lang.Object[] r5 = r2.f10441a
            int r7 = r5.length
            if (r4 >= r7) goto L_0x01a8
            r5[r4] = r1
            int r4 = r4 + r3
            r2.f10442b = r4
        L_0x01a8:
            int r2 = r0.f10436j
            int r2 = r2 - r3
            r0.f10436j = r2
        L_0x01ad:
            r2 = r3
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            o.h r4 = r1.f10416a
            if (r4 == 0) goto L_0x01bf
            int r4 = r4.f10458i
            if (r4 == r3) goto L_0x01c0
            float r4 = r1.f10417b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01bf
            goto L_0x01c0
        L_0x01bf:
            r3 = 0
        L_0x01c0:
            if (r3 != 0) goto L_0x01c3
            return
        L_0x01c3:
            r4 = r2
            goto L_0x01c6
        L_0x01c5:
            r4 = 0
        L_0x01c6:
            if (r4 != 0) goto L_0x01cb
            r16.i(r17)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.c(o.b):void");
    }

    public final void d(h hVar, int i10) {
        b bVar;
        b.a aVar;
        float f10;
        int i11 = hVar.f10452c;
        if (i11 == -1) {
            hVar.d(this, (float) i10);
            for (int i12 = 0; i12 < this.f10428b + 1; i12++) {
                h hVar2 = ((h[]) this.f10437l.f10424d)[i12];
            }
            return;
        }
        if (i11 != -1) {
            b bVar2 = this.f10432f[i11];
            if (!bVar2.f10420e) {
                if (bVar2.f10419d.d() == 0) {
                    bVar2.f10420e = true;
                } else {
                    bVar = m();
                    if (i10 < 0) {
                        bVar.f10417b = (float) (i10 * -1);
                        aVar = bVar.f10419d;
                        f10 = 1.0f;
                    } else {
                        bVar.f10417b = (float) i10;
                        aVar = bVar.f10419d;
                        f10 = -1.0f;
                    }
                    aVar.c(hVar, f10);
                }
            }
            bVar2.f10417b = (float) i10;
            return;
        }
        bVar = m();
        bVar.f10416a = hVar;
        float f11 = (float) i10;
        hVar.f10454e = f11;
        bVar.f10417b = f11;
        bVar.f10420e = true;
        c(bVar);
    }

    public final void e(h hVar, h hVar2, int i10, int i11) {
        if (i11 == 8 && hVar2.f10455f && hVar.f10452c == -1) {
            hVar.d(this, hVar2.f10454e + ((float) i10));
            return;
        }
        b m2 = m();
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            m2.f10417b = (float) i10;
        }
        if (!z9) {
            m2.f10419d.c(hVar, -1.0f);
            m2.f10419d.c(hVar2, 1.0f);
        } else {
            m2.f10419d.c(hVar, 1.0f);
            m2.f10419d.c(hVar2, -1.0f);
        }
        if (i11 != 8) {
            m2.b(this, i11);
        }
        c(m2);
    }

    public final void f(h hVar, h hVar2, int i10, int i11) {
        b m2 = m();
        h n2 = n();
        n2.f10453d = 0;
        m2.c(hVar, hVar2, n2, i10);
        if (i11 != 8) {
            m2.f10419d.c(k(i11), (float) ((int) (m2.f10419d.g(n2) * -1.0f)));
        }
        c(m2);
    }

    public final void g(h hVar, h hVar2, int i10, int i11) {
        b m2 = m();
        h n2 = n();
        n2.f10453d = 0;
        m2.d(hVar, hVar2, n2, i10);
        if (i11 != 8) {
            m2.f10419d.c(k(i11), (float) ((int) (m2.f10419d.g(n2) * -1.0f)));
        }
        c(m2);
    }

    public final void h(h hVar, h hVar2, h hVar3, h hVar4, float f10) {
        b m2 = m();
        m2.f10419d.c(hVar, -1.0f);
        m2.f10419d.c(hVar2, 1.0f);
        m2.f10419d.c(hVar3, f10);
        m2.f10419d.c(hVar4, -f10);
        c(m2);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f10420e) {
            bVar.f10416a.d(this, bVar.f10417b);
        } else {
            b[] bVarArr = this.f10432f;
            int i11 = this.f10436j;
            bVarArr[i11] = bVar;
            h hVar = bVar.f10416a;
            hVar.f10452c = i11;
            this.f10436j = i11 + 1;
            hVar.e(this, bVar);
        }
        if (this.f10427a) {
            int i12 = 0;
            while (i12 < this.f10436j) {
                if (this.f10432f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f10432f[i12];
                if (bVar2 != null && bVar2.f10420e) {
                    bVar2.f10416a.d(this, bVar2.f10417b);
                    e eVar = (e) this.f10437l.f10422b;
                    int i13 = eVar.f10442b;
                    Object[] objArr = eVar.f10441a;
                    if (i13 < objArr.length) {
                        objArr[i13] = bVar2;
                        eVar.f10442b = i13 + 1;
                    }
                    this.f10432f[i12] = null;
                    int i14 = i12 + 1;
                    int i15 = i14;
                    while (true) {
                        i10 = this.f10436j;
                        if (i14 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f10432f;
                        int i16 = i14 - 1;
                        b bVar3 = bVarArr2[i14];
                        bVarArr2[i16] = bVar3;
                        h hVar2 = bVar3.f10416a;
                        if (hVar2.f10452c == i14) {
                            hVar2.f10452c = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i10) {
                        this.f10432f[i15] = null;
                    }
                    this.f10436j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f10427a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f10436j; i10++) {
            b bVar = this.f10432f[i10];
            bVar.f10416a.f10454e = bVar.f10417b;
        }
    }

    public final h k(int i10) {
        if (this.f10435i + 1 >= this.f10431e) {
            p();
        }
        h a10 = a(4);
        int i11 = this.f10428b + 1;
        this.f10428b = i11;
        this.f10435i++;
        a10.f10451b = i11;
        a10.f10453d = i10;
        ((h[]) this.f10437l.f10424d)[i11] = a10;
        f fVar = this.f10429c;
        fVar.f10446i.f10447a = a10;
        Arrays.fill(a10.f10457h, 0.0f);
        a10.f10457h[a10.f10453d] = 1.0f;
        fVar.j(a10);
        return a10;
    }

    public final h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f10435i + 1 >= this.f10431e) {
            p();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            hVar = cVar.f10882i;
            if (hVar == null) {
                cVar.k();
                hVar = cVar.f10882i;
            }
            int i10 = hVar.f10451b;
            if (i10 == -1 || i10 > this.f10428b || ((h[]) this.f10437l.f10424d)[i10] == null) {
                if (i10 != -1) {
                    hVar.c();
                }
                int i11 = this.f10428b + 1;
                this.f10428b = i11;
                this.f10435i++;
                hVar.f10451b = i11;
                hVar.f10458i = 1;
                ((h[]) this.f10437l.f10424d)[i11] = hVar;
            }
        }
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: o.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.b m() {
        /*
            r6 = this;
            o.c r0 = r6.f10437l
            java.lang.Object r1 = r0.f10422b
            o.e r1 = (o.e) r1
            int r2 = r1.f10442b
            r3 = 0
            if (r2 <= 0) goto L_0x0016
            int r2 = r2 + -1
            java.lang.Object[] r4 = r1.f10441a
            r5 = r4[r2]
            r4[r2] = r3
            r1.f10442b = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            o.b r5 = (o.b) r5
            if (r5 != 0) goto L_0x0021
            o.b r5 = new o.b
            r5.<init>(r0)
            goto L_0x002e
        L_0x0021:
            r5.f10416a = r3
            o.b$a r0 = r5.f10419d
            r0.clear()
            r0 = 0
            r5.f10417b = r0
            r0 = 0
            r5.f10420e = r0
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.m():o.b");
    }

    public final h n() {
        if (this.f10435i + 1 >= this.f10431e) {
            p();
        }
        h a10 = a(3);
        int i10 = this.f10428b + 1;
        this.f10428b = i10;
        this.f10435i++;
        a10.f10451b = i10;
        ((h[]) this.f10437l.f10424d)[i10] = a10;
        return a10;
    }

    public final void p() {
        int i10 = this.f10430d * 2;
        this.f10430d = i10;
        this.f10432f = (b[]) Arrays.copyOf(this.f10432f, i10);
        c cVar = this.f10437l;
        cVar.f10424d = (h[]) Arrays.copyOf((h[]) cVar.f10424d, this.f10430d);
        int i11 = this.f10430d;
        this.f10434h = new boolean[i11];
        this.f10431e = i11;
        this.k = i11;
    }

    public final void q() {
        if (this.f10429c.e()) {
            j();
            return;
        }
        if (this.f10433g) {
            boolean z9 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f10436j) {
                    z9 = true;
                    break;
                } else if (!this.f10432f[i10].f10420e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z9) {
                j();
                return;
            }
        }
        r(this.f10429c);
    }

    public final void r(f fVar) {
        float f10;
        int i10;
        boolean z9;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f10436j) {
                z9 = false;
                break;
            }
            b bVar = this.f10432f[i11];
            if (bVar.f10416a.f10458i != 1 && bVar.f10417b < 0.0f) {
                z9 = true;
                break;
            }
            i11++;
        }
        if (z9) {
            boolean z10 = false;
            int i12 = 0;
            while (!z10) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f10436j) {
                    b bVar2 = this.f10432f[i15];
                    if (bVar2.f10416a.f10458i != i10 && !bVar2.f10420e && bVar2.f10417b < f10) {
                        int d10 = bVar2.f10419d.d();
                        int i17 = 0;
                        while (i17 < d10) {
                            h h10 = bVar2.f10419d.h(i17);
                            float g10 = bVar2.f10419d.g(h10);
                            if (g10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = h10.f10456g[i18] / g10;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = h10.f10451b;
                                        i16 = i18;
                                        f11 = f12;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i13 != -1) {
                    b bVar3 = this.f10432f[i13];
                    bVar3.f10416a.f10452c = -1;
                    bVar3.g(((h[]) this.f10437l.f10424d)[i14]);
                    h hVar = bVar3.f10416a;
                    hVar.f10452c = i13;
                    hVar.e(this, bVar3);
                } else {
                    z10 = true;
                }
                if (i12 > this.f10435i / 2) {
                    z10 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(fVar);
        j();
    }

    public final void s(b bVar) {
        for (int i10 = 0; i10 < this.f10435i; i10++) {
            this.f10434h[i10] = false;
        }
        boolean z9 = false;
        int i11 = 0;
        while (!z9) {
            i11++;
            if (i11 < this.f10435i * 2) {
                h hVar = bVar.f10416a;
                if (hVar != null) {
                    this.f10434h[hVar.f10451b] = true;
                }
                h a10 = bVar.a(this.f10434h);
                if (a10 != null) {
                    boolean[] zArr = this.f10434h;
                    int i12 = a10.f10451b;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    } else {
                        return;
                    }
                }
                if (a10 != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f10436j; i14++) {
                        b bVar2 = this.f10432f[i14];
                        if (bVar2.f10416a.f10458i != 1 && !bVar2.f10420e && bVar2.f10419d.e(a10)) {
                            float g10 = bVar2.f10419d.g(a10);
                            if (g10 < 0.0f) {
                                float f11 = (-bVar2.f10417b) / g10;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        b bVar3 = this.f10432f[i13];
                        bVar3.f10416a.f10452c = -1;
                        bVar3.g(a10);
                        h hVar2 = bVar3.f10416a;
                        hVar2.f10452c = i13;
                        hVar2.e(this, bVar3);
                    }
                } else {
                    z9 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f10436j; i10++) {
            b[] bVarArr = this.f10432f;
            b bVar = bVarArr[i10];
            if (bVar != null) {
                e eVar = (e) this.f10437l.f10422b;
                int i11 = eVar.f10442b;
                Object[] objArr = eVar.f10441a;
                if (i11 < objArr.length) {
                    objArr[i11] = bVar;
                    eVar.f10442b = i11 + 1;
                }
            }
            bVarArr[i10] = null;
        }
    }

    public final void u() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f10437l;
            h[] hVarArr = (h[]) cVar.f10424d;
            if (i10 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i10];
            if (hVar != null) {
                hVar.c();
            }
            i10++;
        }
        e eVar = (e) cVar.f10423c;
        h[] hVarArr2 = this.f10438m;
        int i11 = this.f10439n;
        eVar.getClass();
        if (i11 > hVarArr2.length) {
            i11 = hVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h hVar2 = hVarArr2[i12];
            int i13 = eVar.f10442b;
            Object[] objArr = eVar.f10441a;
            if (i13 < objArr.length) {
                objArr[i13] = hVar2;
                eVar.f10442b = i13 + 1;
            }
        }
        this.f10439n = 0;
        Arrays.fill((h[]) this.f10437l.f10424d, (Object) null);
        this.f10428b = 0;
        f fVar = this.f10429c;
        fVar.f10445h = 0;
        fVar.f10417b = 0.0f;
        this.f10435i = 1;
        for (int i14 = 0; i14 < this.f10436j; i14++) {
            b bVar = this.f10432f[i14];
        }
        t();
        this.f10436j = 0;
        this.f10440o = new b(this.f10437l);
    }
}
