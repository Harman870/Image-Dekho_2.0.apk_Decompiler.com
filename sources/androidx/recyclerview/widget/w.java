package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public final class w implements a.C0014a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2147a;

    public w(RecyclerView recyclerView) {
        this.f2147a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f2004a;
        if (i10 == 1) {
            this.f2147a.f1830l.U(bVar.f2005b, bVar.f2007d);
        } else if (i10 == 2) {
            this.f2147a.f1830l.X(bVar.f2005b, bVar.f2007d);
        } else if (i10 == 4) {
            this.f2147a.f1830l.Y(bVar.f2005b, bVar.f2007d);
        } else if (i10 == 8) {
            this.f2147a.f1830l.W(bVar.f2005b, bVar.f2007d);
        }
    }

    public final RecyclerView.z b(int i10) {
        RecyclerView recyclerView = this.f2147a;
        int h10 = recyclerView.f1824e.h();
        int i11 = 0;
        RecyclerView.z zVar = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.z I = RecyclerView.I(recyclerView.f1824e.g(i11));
            if (I != null && !I.i() && I.f1944c == i10) {
                if (!recyclerView.f1824e.k(I.f1942a)) {
                    zVar = I;
                    break;
                }
                zVar = I;
            }
            i11++;
        }
        if (zVar != null && !this.f2147a.f1824e.k(zVar.f1942a)) {
            return zVar;
        }
        return null;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f2147a;
        int h10 = recyclerView.f1824e.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f1824e.g(i15);
            RecyclerView.z I = RecyclerView.I(g10);
            if (I != null && !I.o() && (i13 = I.f1944c) >= i10 && i13 < i14) {
                I.b(2);
                I.a(obj);
                ((RecyclerView.m) g10.getLayoutParams()).f1888c = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1821b;
        int size = rVar.f1898c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.z zVar = rVar.f1898c.get(size);
                if (zVar != null && (i12 = zVar.f1944c) >= i10 && i12 < i14) {
                    zVar.b(2);
                    rVar.f(size);
                }
            } else {
                this.f2147a.u0 = true;
                return;
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f2147a;
        int h10 = recyclerView.f1824e.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.z I = RecyclerView.I(recyclerView.f1824e.g(i12));
            if (I != null && !I.o() && I.f1944c >= i10) {
                I.l(i11, false);
                recyclerView.f1837q0.f1926f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1821b;
        int size = rVar.f1898c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.z zVar = rVar.f1898c.get(i13);
            if (zVar != null && zVar.f1944c >= i10) {
                zVar.l(i11, true);
            }
        }
        recyclerView.requestLayout();
        this.f2147a.f1843t0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f2147a;
        int h10 = recyclerView.f1824e.h();
        int i19 = -1;
        if (i10 < i11) {
            i14 = i10;
            i13 = i11;
            i12 = -1;
        } else {
            i13 = i10;
            i14 = i11;
            i12 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.z I = RecyclerView.I(recyclerView.f1824e.g(i20));
            if (I != null && (i18 = I.f1944c) >= i14 && i18 <= i13) {
                if (i18 == i10) {
                    I.l(i11 - i10, false);
                } else {
                    I.l(i12, false);
                }
                recyclerView.f1837q0.f1926f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1821b;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = rVar.f1898c.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.z zVar = rVar.f1898c.get(i21);
            if (zVar != null && (i17 = zVar.f1944c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    zVar.l(i11 - i10, false);
                } else {
                    zVar.l(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2147a.f1843t0 = true;
    }
}
