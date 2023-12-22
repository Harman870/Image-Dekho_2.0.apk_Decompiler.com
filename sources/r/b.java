package r;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import q.d;
import q.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f11401a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f11402b = new a();

    /* renamed from: c  reason: collision with root package name */
    public e f11403c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11404a;

        /* renamed from: b  reason: collision with root package name */
        public int f11405b;

        /* renamed from: c  reason: collision with root package name */
        public int f11406c;

        /* renamed from: d  reason: collision with root package name */
        public int f11407d;

        /* renamed from: e  reason: collision with root package name */
        public int f11408e;

        /* renamed from: f  reason: collision with root package name */
        public int f11409f;

        /* renamed from: g  reason: collision with root package name */
        public int f11410g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11411h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11412i;

        /* renamed from: j  reason: collision with root package name */
        public int f11413j;
    }

    /* renamed from: r.b$b  reason: collision with other inner class name */
    public interface C0134b {
    }

    public b(e eVar) {
        this.f11403c = eVar;
    }

    public final boolean a(int i10, d dVar, C0134b bVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a aVar = this.f11402b;
        int[] iArr = dVar.V;
        aVar.f11404a = iArr[0];
        boolean z13 = true;
        aVar.f11405b = iArr[1];
        aVar.f11406c = dVar.r();
        this.f11402b.f11407d = dVar.l();
        a aVar2 = this.f11402b;
        aVar2.f11412i = false;
        aVar2.f11413j = i10;
        if (aVar2.f11404a == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (aVar2.f11405b == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9 || dVar.Z <= 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 || dVar.Z <= 0.0f) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z11 && dVar.u[0] == 4) {
            aVar2.f11404a = 1;
        }
        if (z12 && dVar.u[1] == 4) {
            aVar2.f11405b = 1;
        }
        ((ConstraintLayout.b) bVar).b(dVar, aVar2);
        dVar.O(this.f11402b.f11408e);
        dVar.L(this.f11402b.f11409f);
        a aVar3 = this.f11402b;
        dVar.F = aVar3.f11411h;
        int i11 = aVar3.f11410g;
        dVar.f10899d0 = i11;
        if (i11 <= 0) {
            z13 = false;
        }
        dVar.F = z13;
        aVar3.f11413j = 0;
        return aVar3.f11412i;
    }

    public final void b(e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f10901e0;
        int i14 = eVar.f10903f0;
        eVar.f10901e0 = 0;
        eVar.f10903f0 = 0;
        eVar.O(i11);
        eVar.L(i12);
        if (i13 < 0) {
            i13 = 0;
        }
        eVar.f10901e0 = i13;
        if (i14 < 0) {
            i14 = 0;
        }
        eVar.f10903f0 = i14;
        e eVar2 = this.f11403c;
        eVar2.f10933v0 = i10;
        eVar2.R();
    }

    public final void c(e eVar) {
        this.f11401a.clear();
        int size = eVar.f10970s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = eVar.f10970s0.get(i10);
            int[] iArr = dVar.V;
            if (iArr[0] == 3 || iArr[1] == 3) {
                this.f11401a.add(dVar);
            }
        }
        eVar.u0.f11416b = true;
    }
}
