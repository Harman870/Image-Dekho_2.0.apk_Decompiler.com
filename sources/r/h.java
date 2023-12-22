package r;

import java.util.HashSet;
import java.util.Iterator;
import q.c;
import q.d;
import q.e;
import q.g;
import r.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f11435a = new b.a();

    public static boolean a(d dVar) {
        e eVar;
        boolean z9;
        boolean z10;
        int[] iArr = dVar.V;
        int i10 = iArr[0];
        int i11 = iArr[1];
        d dVar2 = dVar.W;
        if (dVar2 != null) {
            eVar = (e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i12 = eVar.V[0];
        }
        if (eVar != null) {
            int i13 = eVar.V[1];
        }
        if (i10 == 1 || dVar.B() || i10 == 2 || ((i10 == 3 && dVar.f10926s == 0 && dVar.Z == 0.0f && dVar.u(0)) || (i10 == 3 && dVar.f10926s == 1 && dVar.v(0, dVar.r())))) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 == 1 || dVar.C() || i11 == 2 || ((i11 == 3 && dVar.f10927t == 0 && dVar.Z == 0.0f && dVar.u(1)) || (i11 == 3 && dVar.f10927t == 1 && dVar.v(1, dVar.l())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dVar.Z > 0.0f && (z9 || z10)) {
            return true;
        }
        if (!z9 || !z10) {
            return false;
        }
        return true;
    }

    public static void b(int i10, d dVar, b.C0134b bVar, boolean z9) {
        boolean z10;
        c cVar;
        c cVar2;
        boolean z11;
        c cVar3;
        c cVar4;
        d dVar2 = dVar;
        b.C0134b bVar2 = bVar;
        boolean z12 = z9;
        if (!dVar2.f10917n) {
            if (!(dVar2 instanceof e) && dVar.A() && a(dVar)) {
                e.V(dVar2, bVar2, new b.a());
            }
            c j10 = dVar2.j(c.a.LEFT);
            c j11 = dVar2.j(c.a.RIGHT);
            int d10 = j10.d();
            int d11 = j11.d();
            HashSet<c> hashSet = j10.f10874a;
            if (hashSet != null && j10.f10876c) {
                Iterator<c> it = hashSet.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    d dVar3 = next.f10877d;
                    int i11 = i10 + 1;
                    boolean a10 = a(dVar3);
                    if (dVar3.A() && a10) {
                        e.V(dVar3, bVar2, new b.a());
                    }
                    c cVar5 = dVar3.K;
                    if ((next != cVar5 || (cVar4 = dVar3.M.f10879f) == null || !cVar4.f10876c) && (next != dVar3.M || (cVar3 = cVar5.f10879f) == null || !cVar3.f10876c)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    int i12 = dVar3.V[0];
                    if (i12 != 3 || a10) {
                        if (!dVar3.A()) {
                            c cVar6 = dVar3.K;
                            if (next == cVar6 && dVar3.M.f10879f == null) {
                                int e10 = cVar6.e() + d10;
                                dVar3.J(e10, dVar3.r() + e10);
                            } else {
                                c cVar7 = dVar3.M;
                                if (next == cVar7 && cVar6.f10879f == null) {
                                    int e11 = d10 - cVar7.e();
                                    dVar3.J(e11 - dVar3.r(), e11);
                                } else if (z11 && !dVar3.y()) {
                                    c(i11, dVar3, bVar2, z12);
                                }
                            }
                            b(i11, dVar3, bVar2, z12);
                        }
                    } else if (i12 == 3 && dVar3.w >= 0 && dVar3.f10928v >= 0) {
                        if ((dVar3.f10911j0 == 8 || (dVar3.f10926s == 0 && dVar3.Z == 0.0f)) && !dVar3.y() && !dVar3.H && z11 && !dVar3.y()) {
                            d(i11, dVar2, bVar2, dVar3, z12);
                        }
                    }
                }
            }
            if (!(dVar2 instanceof g)) {
                HashSet<c> hashSet2 = j11.f10874a;
                if (hashSet2 != null && j11.f10876c) {
                    Iterator<c> it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        c next2 = it2.next();
                        d dVar4 = next2.f10877d;
                        int i13 = i10 + 1;
                        boolean a11 = a(dVar4);
                        if (dVar4.A() && a11) {
                            e.V(dVar4, bVar2, new b.a());
                        }
                        c cVar8 = dVar4.K;
                        if ((next2 != cVar8 || (cVar2 = dVar4.M.f10879f) == null || !cVar2.f10876c) && (next2 != dVar4.M || (cVar = cVar8.f10879f) == null || !cVar.f10876c)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i14 = dVar4.V[0];
                        if (i14 != 3 || a11) {
                            if (!dVar4.A()) {
                                c cVar9 = dVar4.K;
                                if (next2 == cVar9 && dVar4.M.f10879f == null) {
                                    int e12 = cVar9.e() + d11;
                                    dVar4.J(e12, dVar4.r() + e12);
                                } else {
                                    c cVar10 = dVar4.M;
                                    if (next2 == cVar10 && cVar9.f10879f == null) {
                                        int e13 = d11 - cVar10.e();
                                        dVar4.J(e13 - dVar4.r(), e13);
                                    } else if (z10 && !dVar4.y()) {
                                        c(i13, dVar4, bVar2, z12);
                                    }
                                }
                                b(i13, dVar4, bVar2, z12);
                            }
                        } else if (i14 == 3 && dVar4.w >= 0 && dVar4.f10928v >= 0) {
                            if (dVar4.f10911j0 != 8) {
                                if (dVar4.f10926s == 0) {
                                    if (dVar4.Z != 0.0f) {
                                    }
                                }
                            }
                            if (!dVar4.y() && !dVar4.H && z10 && !dVar4.y()) {
                                d(i13, dVar2, bVar2, dVar4, z12);
                            }
                        }
                    }
                }
                dVar2.f10917n = true;
            }
        }
    }

    public static void c(int i10, d dVar, b.C0134b bVar, boolean z9) {
        float f10;
        float f11 = dVar.f10905g0;
        int d10 = dVar.K.f10879f.d();
        int d11 = dVar.M.f10879f.d();
        int e10 = dVar.K.e() + d10;
        int e11 = d11 - dVar.M.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int r4 = dVar.r();
        int i11 = (d11 - d10) - r4;
        if (d10 > d11) {
            i11 = (d10 - d11) - r4;
        }
        if (i11 > 0) {
            f10 = (f11 * ((float) i11)) + 0.5f;
        } else {
            f10 = f11 * ((float) i11);
        }
        int i12 = ((int) f10) + d10;
        int i13 = i12 + r4;
        if (d10 > d11) {
            i13 = i12 - r4;
        }
        dVar.J(i12, i13);
        b(i10 + 1, dVar, bVar, z9);
    }

    public static void d(int i10, d dVar, b.C0134b bVar, d dVar2, boolean z9) {
        float f10 = dVar2.f10905g0;
        int e10 = dVar2.K.e() + dVar2.K.f10879f.d();
        int d10 = dVar2.M.f10879f.d() - dVar2.M.e();
        if (d10 >= e10) {
            int r4 = dVar2.r();
            if (dVar2.f10911j0 != 8) {
                int i11 = dVar2.f10926s;
                if (i11 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.W;
                    }
                    r4 = (int) (dVar2.f10905g0 * 0.5f * ((float) dVar.r()));
                } else if (i11 == 0) {
                    r4 = d10 - e10;
                }
                r4 = Math.max(dVar2.f10928v, r4);
                int i12 = dVar2.w;
                if (i12 > 0) {
                    r4 = Math.min(i12, r4);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((float) ((d10 - e10) - r4))) + 0.5f));
            dVar2.J(i13, r4 + i13);
            b(i10 + 1, dVar2, bVar, z9);
        }
    }

    public static void e(int i10, d dVar, b.C0134b bVar) {
        float f10;
        float f11 = dVar.f10907h0;
        int d10 = dVar.L.f10879f.d();
        int d11 = dVar.N.f10879f.d();
        int e10 = dVar.L.e() + d10;
        int e11 = d11 - dVar.N.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int l6 = dVar.l();
        int i11 = (d11 - d10) - l6;
        if (d10 > d11) {
            i11 = (d10 - d11) - l6;
        }
        if (i11 > 0) {
            f10 = (f11 * ((float) i11)) + 0.5f;
        } else {
            f10 = f11 * ((float) i11);
        }
        int i12 = (int) f10;
        int i13 = d10 + i12;
        int i14 = i13 + l6;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - l6;
        }
        dVar.K(i13, i14);
        g(i10 + 1, dVar, bVar);
    }

    public static void f(int i10, d dVar, b.C0134b bVar, d dVar2) {
        float f10 = dVar2.f10907h0;
        int e10 = dVar2.L.e() + dVar2.L.f10879f.d();
        int d10 = dVar2.N.f10879f.d() - dVar2.N.e();
        if (d10 >= e10) {
            int l6 = dVar2.l();
            if (dVar2.f10911j0 != 8) {
                int i11 = dVar2.f10927t;
                if (i11 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.W;
                    }
                    l6 = (int) (f10 * 0.5f * ((float) dVar.l()));
                } else if (i11 == 0) {
                    l6 = d10 - e10;
                }
                l6 = Math.max(dVar2.f10930y, l6);
                int i12 = dVar2.f10931z;
                if (i12 > 0) {
                    l6 = Math.min(i12, l6);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((float) ((d10 - e10) - l6))) + 0.5f));
            dVar2.K(i13, l6 + i13);
            g(i10 + 1, dVar2, bVar);
        }
    }

    public static void g(int i10, d dVar, b.C0134b bVar) {
        boolean z9;
        c cVar;
        c cVar2;
        boolean z10;
        c cVar3;
        c cVar4;
        d dVar2 = dVar;
        b.C0134b bVar2 = bVar;
        if (!dVar2.f10919o) {
            if (!(dVar2 instanceof e) && dVar.A() && a(dVar)) {
                e.V(dVar2, bVar2, new b.a());
            }
            c j10 = dVar2.j(c.a.TOP);
            c j11 = dVar2.j(c.a.BOTTOM);
            int d10 = j10.d();
            int d11 = j11.d();
            HashSet<c> hashSet = j10.f10874a;
            if (hashSet != null && j10.f10876c) {
                Iterator<c> it = hashSet.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    d dVar3 = next.f10877d;
                    int i11 = i10 + 1;
                    boolean a10 = a(dVar3);
                    if (dVar3.A() && a10) {
                        e.V(dVar3, bVar2, new b.a());
                    }
                    c cVar5 = dVar3.L;
                    if ((next != cVar5 || (cVar4 = dVar3.N.f10879f) == null || !cVar4.f10876c) && (next != dVar3.N || (cVar3 = cVar5.f10879f) == null || !cVar3.f10876c)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int i12 = dVar3.V[1];
                    if (i12 != 3 || a10) {
                        if (!dVar3.A()) {
                            c cVar6 = dVar3.L;
                            if (next == cVar6 && dVar3.N.f10879f == null) {
                                int e10 = cVar6.e() + d10;
                                dVar3.K(e10, dVar3.l() + e10);
                            } else {
                                c cVar7 = dVar3.N;
                                if (next == cVar7 && cVar6.f10879f == null) {
                                    int e11 = d10 - cVar7.e();
                                    dVar3.K(e11 - dVar3.l(), e11);
                                } else if (z10 && !dVar3.z()) {
                                    e(i11, dVar3, bVar2);
                                }
                            }
                            g(i11, dVar3, bVar2);
                        }
                    } else if (i12 == 3 && dVar3.f10931z >= 0 && dVar3.f10930y >= 0) {
                        if ((dVar3.f10911j0 == 8 || (dVar3.f10927t == 0 && dVar3.Z == 0.0f)) && !dVar3.z() && !dVar3.H && z10 && !dVar3.z()) {
                            f(i11, dVar2, bVar2, dVar3);
                        }
                    }
                }
            }
            if (!(dVar2 instanceof g)) {
                HashSet<c> hashSet2 = j11.f10874a;
                if (hashSet2 != null && j11.f10876c) {
                    Iterator<c> it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        c next2 = it2.next();
                        d dVar4 = next2.f10877d;
                        int i13 = i10 + 1;
                        boolean a11 = a(dVar4);
                        if (dVar4.A() && a11) {
                            e.V(dVar4, bVar2, new b.a());
                        }
                        c cVar8 = dVar4.L;
                        if ((next2 != cVar8 || (cVar2 = dVar4.N.f10879f) == null || !cVar2.f10876c) && (next2 != dVar4.N || (cVar = cVar8.f10879f) == null || !cVar.f10876c)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        int i14 = dVar4.V[1];
                        if (i14 != 3 || a11) {
                            if (!dVar4.A()) {
                                c cVar9 = dVar4.L;
                                if (next2 == cVar9 && dVar4.N.f10879f == null) {
                                    int e12 = cVar9.e() + d11;
                                    dVar4.K(e12, dVar4.l() + e12);
                                } else {
                                    c cVar10 = dVar4.N;
                                    if (next2 == cVar10 && cVar9.f10879f == null) {
                                        int e13 = d11 - cVar10.e();
                                        dVar4.K(e13 - dVar4.l(), e13);
                                    } else if (z9 && !dVar4.z()) {
                                        e(i13, dVar4, bVar2);
                                    }
                                }
                                g(i13, dVar4, bVar2);
                            }
                        } else if (i14 == 3 && dVar4.f10931z >= 0 && dVar4.f10930y >= 0) {
                            if ((dVar4.f10911j0 == 8 || (dVar4.f10927t == 0 && dVar4.Z == 0.0f)) && !dVar4.z() && !dVar4.H && z9 && !dVar4.z()) {
                                f(i13, dVar2, bVar2, dVar4);
                            }
                        }
                    }
                }
                c j12 = dVar2.j(c.a.BASELINE);
                if (j12.f10874a != null && j12.f10876c) {
                    int d12 = j12.d();
                    Iterator<c> it3 = j12.f10874a.iterator();
                    while (it3.hasNext()) {
                        c next3 = it3.next();
                        d dVar5 = next3.f10877d;
                        int i15 = i10 + 1;
                        boolean a12 = a(dVar5);
                        if (dVar5.A() && a12) {
                            e.V(dVar5, bVar2, new b.a());
                        }
                        if ((dVar5.V[1] != 3 || a12) && !dVar5.A() && next3 == dVar5.O) {
                            int e14 = next3.e() + d12;
                            if (dVar5.F) {
                                int i16 = e14 - dVar5.f10899d0;
                                int i17 = dVar5.Y + i16;
                                dVar5.f10897c0 = i16;
                                dVar5.L.l(i16);
                                dVar5.N.l(i17);
                                dVar5.O.l(e14);
                                dVar5.f10915m = true;
                            }
                            g(i15, dVar5, bVar2);
                        }
                    }
                }
                dVar2.f10919o = true;
            }
        }
    }
}
