package q;

import androidx.activity.e;
import androidx.activity.f;
import o.b;
import o.d;
import o.h;
import q.c;

public final class a extends i {
    public int u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f10855v0 = true;

    /* renamed from: w0  reason: collision with root package name */
    public int f10856w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f10857x0 = false;

    public final boolean B() {
        return this.f10857x0;
    }

    public final boolean C() {
        return this.f10857x0;
    }

    public final boolean S() {
        int i10;
        c j10;
        c j11;
        c j12;
        int i11;
        int i12;
        c.a aVar = c.a.BOTTOM;
        c.a aVar2 = c.a.TOP;
        c.a aVar3 = c.a.RIGHT;
        c.a aVar4 = c.a.LEFT;
        int i13 = 0;
        boolean z9 = true;
        while (true) {
            i10 = this.f10964t0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f10963s0[i13];
            if ((this.f10855v0 || dVar.d()) && ((((i11 = this.u0) == 0 || i11 == 1) && !dVar.B()) || (((i12 = this.u0) == 2 || i12 == 3) && !dVar.C()))) {
                z9 = false;
            }
            i13++;
        }
        if (!z9 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < this.f10964t0; i15++) {
            d dVar2 = this.f10963s0[i15];
            if (this.f10855v0 || dVar2.d()) {
                if (!z10) {
                    int i16 = this.u0;
                    if (i16 == 0) {
                        j12 = dVar2.j(aVar4);
                    } else if (i16 == 1) {
                        j12 = dVar2.j(aVar3);
                    } else if (i16 == 2) {
                        j12 = dVar2.j(aVar2);
                    } else {
                        if (i16 == 3) {
                            j12 = dVar2.j(aVar);
                        }
                        z10 = true;
                    }
                    i14 = j12.d();
                    z10 = true;
                }
                int i17 = this.u0;
                if (i17 == 0) {
                    j11 = dVar2.j(aVar4);
                } else {
                    if (i17 == 1) {
                        j10 = dVar2.j(aVar3);
                    } else if (i17 == 2) {
                        j11 = dVar2.j(aVar2);
                    } else if (i17 == 3) {
                        j10 = dVar2.j(aVar);
                    }
                    i14 = Math.max(i14, j10.d());
                }
                i14 = Math.min(i14, j11.d());
            }
        }
        int i18 = i14 + this.f10856w0;
        int i19 = this.u0;
        if (i19 == 0 || i19 == 1) {
            J(i18, i18);
        } else {
            K(i18, i18);
        }
        this.f10857x0 = true;
        return true;
    }

    public final int T() {
        int i10 = this.u0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public final void c(d dVar, boolean z9) {
        c[] cVarArr;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h hVar;
        c cVar;
        int i10;
        int i11;
        int i12;
        h hVar2;
        int i13;
        c[] cVarArr2 = this.S;
        cVarArr2[0] = this.K;
        cVarArr2[2] = this.L;
        cVarArr2[1] = this.M;
        cVarArr2[3] = this.N;
        int i14 = 0;
        while (true) {
            cVarArr = this.S;
            if (i14 >= cVarArr.length) {
                break;
            }
            c cVar2 = cVarArr[i14];
            cVar2.f10882i = dVar.l(cVar2);
            i14++;
        }
        int i15 = this.u0;
        if (i15 >= 0 && i15 < 4) {
            c cVar3 = cVarArr[i15];
            if (!this.f10857x0) {
                S();
            }
            if (this.f10857x0) {
                this.f10857x0 = false;
                int i16 = this.u0;
                if (i16 == 0 || i16 == 1) {
                    dVar.d(this.K.f10882i, this.f10895b0);
                    hVar2 = this.M.f10882i;
                    i13 = this.f10895b0;
                } else if (i16 == 2 || i16 == 3) {
                    dVar.d(this.L.f10882i, this.f10897c0);
                    hVar2 = this.N.f10882i;
                    i13 = this.f10897c0;
                } else {
                    return;
                }
                dVar.d(hVar2, i13);
                return;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= this.f10964t0) {
                    z10 = false;
                    break;
                }
                d dVar2 = this.f10963s0[i17];
                if ((this.f10855v0 || dVar2.d()) && ((((i12 = this.u0) == 0 || i12 == 1) && dVar2.V[0] == 3 && dVar2.K.f10879f != null && dVar2.M.f10879f != null) || ((i12 == 2 || i12 == 3) && dVar2.V[1] == 3 && dVar2.L.f10879f != null && dVar2.N.f10879f != null))) {
                    z10 = true;
                } else {
                    i17++;
                }
            }
            if (this.K.g() || this.M.g()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.L.g() || this.N.g()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 || (((i11 = this.u0) != 0 || !z11) && ((i11 != 2 || !z12) && ((i11 != 1 || !z11) && (i11 != 3 || !z12))))) {
                z13 = false;
            } else {
                z13 = true;
            }
            int i18 = 5;
            if (!z13) {
                i18 = 4;
            }
            for (int i19 = 0; i19 < this.f10964t0; i19++) {
                d dVar3 = this.f10963s0[i19];
                if (this.f10855v0 || dVar3.d()) {
                    h l6 = dVar.l(dVar3.S[this.u0]);
                    c[] cVarArr3 = dVar3.S;
                    int i20 = this.u0;
                    c cVar4 = cVarArr3[i20];
                    cVar4.f10882i = l6;
                    c cVar5 = cVar4.f10879f;
                    if (cVar5 == null || cVar5.f10877d != this) {
                        i10 = 0;
                    } else {
                        i10 = cVar4.f10880g + 0;
                    }
                    if (i20 == 0 || i20 == 2) {
                        b m2 = dVar.m();
                        h n2 = dVar.n();
                        n2.f10453d = 0;
                        m2.d(cVar3.f10882i, l6, n2, this.f10856w0 - i10);
                        dVar.c(m2);
                    } else {
                        b m8 = dVar.m();
                        h n10 = dVar.n();
                        n10.f10453d = 0;
                        m8.c(cVar3.f10882i, l6, n10, this.f10856w0 + i10);
                        dVar.c(m8);
                    }
                    dVar.e(cVar3.f10882i, l6, this.f10856w0 + i10, i18);
                }
            }
            int i21 = this.u0;
            if (i21 == 0) {
                dVar.e(this.M.f10882i, this.K.f10882i, 0, 8);
                dVar.e(this.K.f10882i, this.W.M.f10882i, 0, 4);
                hVar = this.K.f10882i;
                cVar = this.W.K;
            } else if (i21 == 1) {
                dVar.e(this.K.f10882i, this.M.f10882i, 0, 8);
                dVar.e(this.K.f10882i, this.W.K.f10882i, 0, 4);
                hVar = this.K.f10882i;
                cVar = this.W.M;
            } else if (i21 == 2) {
                dVar.e(this.N.f10882i, this.L.f10882i, 0, 8);
                dVar.e(this.L.f10882i, this.W.N.f10882i, 0, 4);
                hVar = this.L.f10882i;
                cVar = this.W.L;
            } else if (i21 == 3) {
                dVar.e(this.L.f10882i, this.N.f10882i, 0, 8);
                dVar.e(this.L.f10882i, this.W.L.f10882i, 0, 4);
                hVar = this.L.f10882i;
                cVar = this.W.N;
            } else {
                return;
            }
            dVar.e(hVar, cVar.f10882i, 0, 0);
        }
    }

    public final boolean d() {
        return true;
    }

    public final String toString() {
        String c10 = e.c(f.g("[Barrier] "), this.f10912k0, " {");
        for (int i10 = 0; i10 < this.f10964t0; i10++) {
            d dVar = this.f10963s0[i10];
            if (i10 > 0) {
                c10 = com.ironsource.adapters.ironsource.a.g(c10, ", ");
            }
            StringBuilder g10 = f.g(c10);
            g10.append(dVar.f10912k0);
            c10 = g10.toString();
        }
        return com.ironsource.adapters.ironsource.a.g(c10, "}");
    }
}
