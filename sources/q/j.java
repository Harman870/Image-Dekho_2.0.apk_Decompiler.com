package q;

import androidx.constraintlayout.widget.ConstraintLayout;
import r.b;

public class j extends i {
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public b.a D0 = new b.a();
    public b.C0134b E0 = null;
    public int u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public int f10965v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public int f10966w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public int f10967x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f10968y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f10969z0 = 0;

    public void S(int i10, int i11, int i12, int i13) {
    }

    public final void T(d dVar, int i10, int i11, int i12, int i13) {
        b.C0134b bVar;
        boolean z9;
        d dVar2;
        while (true) {
            bVar = this.E0;
            if (bVar != null || (dVar2 = this.W) == null) {
                b.a aVar = this.D0;
                aVar.f11404a = i10;
                aVar.f11405b = i12;
                aVar.f11406c = i11;
                aVar.f11407d = i13;
                ((ConstraintLayout.b) bVar).b(dVar, aVar);
                dVar.O(this.D0.f11408e);
                dVar.L(this.D0.f11409f);
                b.a aVar2 = this.D0;
                dVar.F = aVar2.f11411h;
                int i14 = aVar2.f11410g;
                dVar.f10899d0 = i14;
            } else {
                this.E0 = ((e) dVar2).f10934w0;
            }
        }
        b.a aVar3 = this.D0;
        aVar3.f11404a = i10;
        aVar3.f11405b = i12;
        aVar3.f11406c = i11;
        aVar3.f11407d = i13;
        ((ConstraintLayout.b) bVar).b(dVar, aVar3);
        dVar.O(this.D0.f11408e);
        dVar.L(this.D0.f11409f);
        b.a aVar22 = this.D0;
        dVar.F = aVar22.f11411h;
        int i142 = aVar22.f11410g;
        dVar.f10899d0 = i142;
        if (i142 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.F = z9;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f10964t0; i10++) {
            d dVar = this.f10963s0[i10];
            if (dVar != null) {
                dVar.H = true;
            }
        }
    }
}
