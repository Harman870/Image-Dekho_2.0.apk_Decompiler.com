package q;

import java.util.ArrayList;
import r.o;

public class i extends d implements h {

    /* renamed from: s0  reason: collision with root package name */
    public d[] f10963s0 = new d[4];

    /* renamed from: t0  reason: collision with root package name */
    public int f10964t0 = 0;

    public final void R(int i10, o oVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f10964t0; i11++) {
            oVar.a(this.f10963s0[i11]);
        }
        for (int i12 = 0; i12 < this.f10964t0; i12++) {
            r.i.a(this.f10963s0[i12], i10, arrayList, oVar);
        }
    }

    public void a() {
    }
}
