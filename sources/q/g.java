package q;

import o.b;
import o.d;
import o.h;
import q.c;

public final class g extends d {

    /* renamed from: s0  reason: collision with root package name */
    public float f10958s0 = -1.0f;

    /* renamed from: t0  reason: collision with root package name */
    public int f10959t0 = -1;
    public int u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public c f10960v0 = this.L;

    /* renamed from: w0  reason: collision with root package name */
    public int f10961w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f10962x0;

    public g() {
        this.f10961w0 = 0;
        this.T.clear();
        this.T.add(this.f10960v0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f10960v0;
        }
    }

    public final boolean B() {
        return this.f10962x0;
    }

    public final boolean C() {
        return this.f10962x0;
    }

    public final void Q(d dVar, boolean z9) {
        if (this.W != null) {
            c cVar = this.f10960v0;
            dVar.getClass();
            int o10 = d.o(cVar);
            if (this.f10961w0 == 1) {
                this.f10895b0 = o10;
                this.f10897c0 = 0;
                L(this.W.l());
                O(0);
                return;
            }
            this.f10895b0 = 0;
            this.f10897c0 = o10;
            O(this.W.r());
            L(0);
        }
    }

    public final void R(int i10) {
        if (this.f10961w0 != i10) {
            this.f10961w0 = i10;
            this.T.clear();
            this.f10960v0 = this.f10961w0 == 1 ? this.K : this.L;
            this.T.add(this.f10960v0);
            int length = this.S.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.S[i11] = this.f10960v0;
            }
        }
    }

    public final void c(d dVar, boolean z9) {
        boolean z10;
        h hVar;
        h hVar2;
        h hVar3;
        e eVar = (e) this.W;
        if (eVar != null) {
            c j10 = eVar.j(c.a.LEFT);
            c j11 = eVar.j(c.a.RIGHT);
            d dVar2 = this.W;
            boolean z11 = true;
            if (dVar2 == null || dVar2.V[0] != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f10961w0 == 0) {
                j10 = eVar.j(c.a.TOP);
                j11 = eVar.j(c.a.BOTTOM);
                d dVar3 = this.W;
                if (dVar3 == null || dVar3.V[1] != 2) {
                    z11 = false;
                }
                z10 = z11;
            }
            if (this.f10962x0) {
                c cVar = this.f10960v0;
                if (cVar.f10876c) {
                    h l6 = dVar.l(cVar);
                    dVar.d(l6, this.f10960v0.d());
                    if (this.f10959t0 != -1) {
                        if (z10) {
                            hVar3 = dVar.l(j11);
                        }
                        this.f10962x0 = false;
                        return;
                    }
                    if (this.u0 != -1 && z10) {
                        h l10 = dVar.l(j11);
                        dVar.f(l6, dVar.l(j10), 0, 5);
                        hVar3 = l10;
                    }
                    this.f10962x0 = false;
                    return;
                    dVar.f(hVar3, l6, 0, 5);
                    this.f10962x0 = false;
                    return;
                }
            }
            if (this.f10959t0 != -1) {
                hVar = dVar.l(this.f10960v0);
                dVar.e(hVar, dVar.l(j10), this.f10959t0, 8);
                if (z10) {
                    hVar2 = dVar.l(j11);
                } else {
                    return;
                }
            } else if (this.u0 != -1) {
                hVar = dVar.l(this.f10960v0);
                h l11 = dVar.l(j11);
                dVar.e(hVar, l11, -this.u0, 8);
                if (z10) {
                    dVar.f(hVar, dVar.l(j10), 0, 5);
                    hVar2 = l11;
                } else {
                    return;
                }
            } else if (this.f10958s0 != -1.0f) {
                h l12 = dVar.l(this.f10960v0);
                h l13 = dVar.l(j11);
                float f10 = this.f10958s0;
                b m2 = dVar.m();
                m2.f10419d.c(l12, -1.0f);
                m2.f10419d.c(l13, f10);
                dVar.c(m2);
                return;
            } else {
                return;
            }
            dVar.f(hVar2, hVar, 0, 5);
        }
    }

    public final boolean d() {
        return true;
    }

    public final c j(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f10961w0 == 0) {
                return this.f10960v0;
            }
            return null;
        }
        if (this.f10961w0 == 1) {
            return this.f10960v0;
        }
        return null;
    }
}
