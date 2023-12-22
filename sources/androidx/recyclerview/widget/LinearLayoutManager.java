package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.e;
import androidx.activity.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public final a A;
    public final b B;
    public int C;
    public int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f1788p;

    /* renamed from: q  reason: collision with root package name */
    public c f1789q;

    /* renamed from: r  reason: collision with root package name */
    public s f1790r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1791s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1792t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1793v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public int f1794x;

    /* renamed from: y  reason: collision with root package name */
    public int f1795y;

    /* renamed from: z  reason: collision with root package name */
    public d f1796z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f1797a;

        /* renamed from: b  reason: collision with root package name */
        public int f1798b;

        /* renamed from: c  reason: collision with root package name */
        public int f1799c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1800d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1801e;

        public a() {
            c();
        }

        public final void a(View view, int i10) {
            int i11;
            if (this.f1800d) {
                int b10 = this.f1797a.b(view);
                s sVar = this.f1797a;
                if (Integer.MIN_VALUE == sVar.f2141b) {
                    i11 = 0;
                } else {
                    i11 = sVar.l() - sVar.f2141b;
                }
                this.f1799c = i11 + b10;
            } else {
                this.f1799c = this.f1797a.e(view);
            }
            this.f1798b = i10;
        }

        public final void b(View view, int i10) {
            int i11;
            int i12;
            s sVar = this.f1797a;
            if (Integer.MIN_VALUE == sVar.f2141b) {
                i11 = 0;
            } else {
                i11 = sVar.l() - sVar.f2141b;
            }
            if (i11 >= 0) {
                a(view, i10);
                return;
            }
            this.f1798b = i10;
            if (this.f1800d) {
                int g10 = (this.f1797a.g() - i11) - this.f1797a.b(view);
                this.f1799c = this.f1797a.g() - g10;
                if (g10 > 0) {
                    int c10 = this.f1799c - this.f1797a.c(view);
                    int k = this.f1797a.k();
                    int min = c10 - (Math.min(this.f1797a.e(view) - k, 0) + k);
                    if (min < 0) {
                        i12 = Math.min(g10, -min) + this.f1799c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e10 = this.f1797a.e(view);
                int k10 = e10 - this.f1797a.k();
                this.f1799c = e10;
                if (k10 > 0) {
                    int g11 = (this.f1797a.g() - Math.min(0, (this.f1797a.g() - i11) - this.f1797a.b(view))) - (this.f1797a.c(view) + e10);
                    if (g11 < 0) {
                        i12 = this.f1799c - Math.min(k10, -g11);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1799c = i12;
        }

        public final void c() {
            this.f1798b = -1;
            this.f1799c = Integer.MIN_VALUE;
            this.f1800d = false;
            this.f1801e = false;
        }

        public final String toString() {
            StringBuilder g10 = f.g("AnchorInfo{mPosition=");
            g10.append(this.f1798b);
            g10.append(", mCoordinate=");
            g10.append(this.f1799c);
            g10.append(", mLayoutFromEnd=");
            g10.append(this.f1800d);
            g10.append(", mValid=");
            g10.append(this.f1801e);
            g10.append('}');
            return g10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1802a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1803b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1804c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1805d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1806a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1807b;

        /* renamed from: c  reason: collision with root package name */
        public int f1808c;

        /* renamed from: d  reason: collision with root package name */
        public int f1809d;

        /* renamed from: e  reason: collision with root package name */
        public int f1810e;

        /* renamed from: f  reason: collision with root package name */
        public int f1811f;

        /* renamed from: g  reason: collision with root package name */
        public int f1812g;

        /* renamed from: h  reason: collision with root package name */
        public int f1813h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1814i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f1815j;
        public List<RecyclerView.z> k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1816l;

        public final void a(View view) {
            int i10;
            int a10;
            int size = this.k.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.k.get(i12).f1942a;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.c() && (a10 = (mVar.a() - this.f1809d) * this.f1810e) >= 0 && a10 < i11) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i11 = a10;
                }
            }
            if (view2 == null) {
                i10 = -1;
            } else {
                i10 = ((RecyclerView.m) view2.getLayoutParams()).a();
            }
            this.f1809d = i10;
        }

        public final View b(RecyclerView.r rVar) {
            List<RecyclerView.z> list = this.k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.k.get(i10).f1942a;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.c() && this.f1809d == mVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View d10 = rVar.d(this.f1809d);
            this.f1809d += this.f1810e;
            return d10;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1817a;

        /* renamed from: b  reason: collision with root package name */
        public int f1818b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1819c;

        public static class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f1817a = parcel.readInt();
            this.f1818b = parcel.readInt();
            this.f1819c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1817a = dVar.f1817a;
            this.f1818b = dVar.f1818b;
            this.f1819c = dVar.f1819c;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1817a);
            parcel.writeInt(this.f1818b);
            parcel.writeInt(this.f1819c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i10) {
        this.f1788p = 1;
        this.f1792t = false;
        this.u = false;
        this.f1793v = false;
        this.w = true;
        this.f1794x = -1;
        this.f1795y = Integer.MIN_VALUE;
        this.f1796z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        Y0(i10);
        c((String) null);
        if (this.f1792t) {
            this.f1792t = false;
            j0();
        }
    }

    public final int A0(RecyclerView.w wVar) {
        if (w() == 0) {
            return 0;
        }
        E0();
        return y.a(wVar, this.f1790r, H0(!this.w), G0(!this.w), this, this.w);
    }

    public final int B0(RecyclerView.w wVar) {
        if (w() == 0) {
            return 0;
        }
        E0();
        return y.b(wVar, this.f1790r, H0(!this.w), G0(!this.w), this, this.w, this.u);
    }

    public final int C0(RecyclerView.w wVar) {
        if (w() == 0) {
            return 0;
        }
        E0();
        return y.c(wVar, this.f1790r, H0(!this.w), G0(!this.w), this, this.w);
    }

    public final int D0(int i10) {
        if (i10 == 1) {
            return (this.f1788p != 1 && R0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f1788p != 1 && R0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f1788p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f1788p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f1788p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f1788p == 1 ? 1 : Integer.MIN_VALUE;
    }

    public final void E0() {
        if (this.f1789q == null) {
            this.f1789q = new c();
        }
    }

    public final int F0(RecyclerView.r rVar, c cVar, RecyclerView.w wVar, boolean z9) {
        boolean z10;
        int i10 = cVar.f1808c;
        int i11 = cVar.f1812g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f1812g = i11 + i10;
            }
            U0(rVar, cVar);
        }
        int i12 = cVar.f1808c + cVar.f1813h;
        b bVar = this.B;
        while (true) {
            if (!cVar.f1816l && i12 <= 0) {
                break;
            }
            int i13 = cVar.f1809d;
            if (i13 < 0 || i13 >= wVar.b()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                break;
            }
            bVar.f1802a = 0;
            bVar.f1803b = false;
            bVar.f1804c = false;
            bVar.f1805d = false;
            S0(rVar, wVar, cVar, bVar);
            if (!bVar.f1803b) {
                int i14 = cVar.f1807b;
                int i15 = bVar.f1802a;
                cVar.f1807b = (cVar.f1811f * i15) + i14;
                if (!bVar.f1804c || cVar.k != null || !wVar.f1927g) {
                    cVar.f1808c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f1812g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f1812g = i17;
                    int i18 = cVar.f1808c;
                    if (i18 < 0) {
                        cVar.f1812g = i17 + i18;
                    }
                    U0(rVar, cVar);
                }
                if (z9 && bVar.f1805d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f1808c;
    }

    public final View G0(boolean z9) {
        int i10;
        int i11 = -1;
        if (this.u) {
            i10 = 0;
            i11 = w();
        } else {
            i10 = w() - 1;
        }
        return L0(i10, i11, z9);
    }

    public final View H0(boolean z9) {
        int i10;
        int i11 = -1;
        if (this.u) {
            i10 = w() - 1;
        } else {
            i10 = 0;
            i11 = w();
        }
        return L0(i10, i11, z9);
    }

    public final int I0() {
        View L0 = L0(0, w(), false);
        if (L0 == null) {
            return -1;
        }
        return RecyclerView.l.G(L0);
    }

    public final int J0() {
        View L0 = L0(w() - 1, -1, false);
        if (L0 == null) {
            return -1;
        }
        return RecyclerView.l.G(L0);
    }

    public final boolean K() {
        return true;
    }

    public final View K0(int i10, int i11) {
        int i12;
        int i13;
        E0();
        if ((i11 > i10 ? 1 : i11 < i10 ? (char) 65535 : 0) == 0) {
            return v(i10);
        }
        if (this.f1790r.e(v(i10)) < this.f1790r.k()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        return (this.f1788p == 0 ? this.f1868c : this.f1869d).a(i10, i11, i13, i12);
    }

    public final View L0(int i10, int i11, boolean z9) {
        E0();
        return (this.f1788p == 0 ? this.f1868c : this.f1869d).a(i10, i11, z9 ? 24579 : 320, 320);
    }

    public View M0(RecyclerView.r rVar, RecyclerView.w wVar, int i10, int i11, int i12) {
        E0();
        int k = this.f1790r.k();
        int g10 = this.f1790r.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View v10 = v(i10);
            int G = RecyclerView.l.G(v10);
            if (G >= 0 && G < i12) {
                if (((RecyclerView.m) v10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v10;
                    }
                } else if (this.f1790r.e(v10) < g10 && this.f1790r.b(v10) >= k) {
                    return v10;
                } else {
                    if (view == null) {
                        view = v10;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    public final int N0(int i10, RecyclerView.r rVar, RecyclerView.w wVar, boolean z9) {
        int g10;
        int g11 = this.f1790r.g() - i10;
        if (g11 <= 0) {
            return 0;
        }
        int i11 = -X0(-g11, rVar, wVar);
        int i12 = i10 + i11;
        if (!z9 || (g10 = this.f1790r.g() - i12) <= 0) {
            return i11;
        }
        this.f1790r.o(g10);
        return g10 + i11;
    }

    public final int O0(int i10, RecyclerView.r rVar, RecyclerView.w wVar, boolean z9) {
        int k;
        int k10 = i10 - this.f1790r.k();
        if (k10 <= 0) {
            return 0;
        }
        int i11 = -X0(k10, rVar, wVar);
        int i12 = i10 + i11;
        if (!z9 || (k = i12 - this.f1790r.k()) <= 0) {
            return i11;
        }
        this.f1790r.o(-k);
        return i11 - k;
    }

    public final void P(RecyclerView recyclerView) {
    }

    public final View P0() {
        return v(this.u ? 0 : w() - 1);
    }

    public View Q(View view, int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        int D0;
        View view2;
        View view3;
        W0();
        if (w() == 0 || (D0 = D0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        E0();
        a1(D0, (int) (((float) this.f1790r.l()) * 0.33333334f), false, wVar);
        c cVar = this.f1789q;
        cVar.f1812g = Integer.MIN_VALUE;
        cVar.f1806a = false;
        F0(rVar, cVar, wVar, true);
        if (D0 == -1) {
            if (this.u) {
                view2 = K0(w() - 1, -1);
            } else {
                view2 = K0(0, w());
            }
        } else if (this.u) {
            view2 = K0(0, w());
        } else {
            view2 = K0(w() - 1, -1);
        }
        if (D0 == -1) {
            view3 = Q0();
        } else {
            view3 = P0();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public final View Q0() {
        return v(this.u ? w() - 1 : 0);
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(I0());
            accessibilityEvent.setToIndex(J0());
        }
    }

    public final boolean R0() {
        return B() == 1;
    }

    public void S0(RecyclerView.r rVar, RecyclerView.w wVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        View b10 = cVar.b(rVar);
        if (b10 == null) {
            bVar.f1803b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) b10.getLayoutParams();
        if (cVar.k == null) {
            boolean z11 = this.u;
            if (cVar.f1811f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z12 = this.u;
            if (cVar.f1811f == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z12 == z9) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) b10.getLayoutParams();
        Rect J = this.f1867b.J(b10);
        int x9 = RecyclerView.l.x(e(), this.f1878n, this.f1876l, E() + D() + mVar2.leftMargin + mVar2.rightMargin + J.left + J.right + 0, mVar2.width);
        int x10 = RecyclerView.l.x(f(), this.f1879o, this.f1877m, C() + F() + mVar2.topMargin + mVar2.bottomMargin + J.top + J.bottom + 0, mVar2.height);
        if (s0(b10, x9, x10, mVar2)) {
            b10.measure(x9, x10);
        }
        bVar.f1802a = this.f1790r.c(b10);
        if (this.f1788p == 1) {
            if (R0()) {
                i13 = this.f1878n - E();
                i14 = i13 - this.f1790r.d(b10);
            } else {
                i14 = D();
                i13 = this.f1790r.d(b10) + i14;
            }
            int i15 = cVar.f1811f;
            i10 = cVar.f1807b;
            if (i15 == -1) {
                int i16 = i14;
                i12 = i10;
                i10 -= bVar.f1802a;
                i11 = i16;
            } else {
                i11 = i14;
                i12 = bVar.f1802a + i10;
            }
        } else {
            int F = F();
            i12 = this.f1790r.d(b10) + F;
            int i17 = cVar.f1811f;
            int i18 = cVar.f1807b;
            if (i17 == -1) {
                i11 = i18 - bVar.f1802a;
                int i19 = F;
                i13 = i18;
                i10 = i19;
            } else {
                int i20 = bVar.f1802a + i18;
                i11 = i18;
                i10 = F;
                i13 = i20;
            }
        }
        RecyclerView.l.M(b10, i11, i10, i13, i12);
        if (mVar.c() || mVar.b()) {
            bVar.f1804c = true;
        }
        bVar.f1805d = b10.hasFocusable();
    }

    public void T0(RecyclerView.r rVar, RecyclerView.w wVar, a aVar, int i10) {
    }

    public final void U0(RecyclerView.r rVar, c cVar) {
        if (cVar.f1806a && !cVar.f1816l) {
            int i10 = cVar.f1812g;
            int i11 = cVar.f1814i;
            if (cVar.f1811f == -1) {
                int w10 = w();
                if (i10 >= 0) {
                    int f10 = (this.f1790r.f() - i10) + i11;
                    if (this.u) {
                        for (int i12 = 0; i12 < w10; i12++) {
                            View v10 = v(i12);
                            if (this.f1790r.e(v10) < f10 || this.f1790r.n(v10) < f10) {
                                V0(rVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = w10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View v11 = v(i14);
                        if (this.f1790r.e(v11) < f10 || this.f1790r.n(v11) < f10) {
                            V0(rVar, i13, i14);
                            return;
                        }
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int w11 = w();
                if (this.u) {
                    int i16 = w11 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View v12 = v(i17);
                        if (this.f1790r.b(v12) > i15 || this.f1790r.m(v12) > i15) {
                            V0(rVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < w11; i18++) {
                    View v13 = v(i18);
                    if (this.f1790r.b(v13) > i15 || this.f1790r.m(v13) > i15) {
                        V0(rVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public final void V0(RecyclerView.r rVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                while (true) {
                    i11--;
                    if (i11 >= i10) {
                        View v10 = v(i11);
                        h0(i11);
                        rVar.g(v10);
                    } else {
                        return;
                    }
                }
            } else {
                while (i10 > i11) {
                    View v11 = v(i10);
                    h0(i10);
                    rVar.g(v11);
                    i10--;
                }
            }
        }
    }

    public final void W0() {
        this.u = (this.f1788p == 1 || !R0()) ? this.f1792t : !this.f1792t;
    }

    public final int X0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        E0();
        this.f1789q.f1806a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        a1(i11, abs, true, wVar);
        c cVar = this.f1789q;
        int F0 = F0(rVar, cVar, wVar, false) + cVar.f1812g;
        if (F0 < 0) {
            return 0;
        }
        if (abs > F0) {
            i10 = i11 * F0;
        }
        this.f1790r.o(-i10);
        this.f1789q.f1815j = i10;
        return i10;
    }

    public final void Y0(int i10) {
        if (i10 == 0 || i10 == 1) {
            c((String) null);
            if (i10 != this.f1788p || this.f1790r == null) {
                s a10 = s.a(this, i10);
                this.f1790r = a10;
                this.A.f1797a = a10;
                this.f1788p = i10;
                j0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(e.a("invalid orientation:", i10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Z(androidx.recyclerview.widget.RecyclerView.r r18, androidx.recyclerview.widget.RecyclerView.w r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f1796z
            r9 = -1
            if (r0 != 0) goto L_0x000f
            int r0 = r6.f1794x
            if (r0 == r9) goto L_0x0019
        L_0x000f:
            int r0 = r19.b()
            if (r0 != 0) goto L_0x0019
            r17.e0(r18)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f1796z
            r10 = 0
            r11 = 1
            if (r0 == 0) goto L_0x002a
            int r0 = r0.f1817a
            if (r0 < 0) goto L_0x0025
            r1 = r11
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            if (r1 == 0) goto L_0x002a
            r6.f1794x = r0
        L_0x002a:
            r17.E0()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1806a = r10
            r17.W0()
            androidx.recyclerview.widget.RecyclerView r0 = r6.f1867b
            if (r0 != 0) goto L_0x003a
        L_0x0038:
            r0 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r0 = r0.getFocusedChild()
            if (r0 == 0) goto L_0x0038
            androidx.recyclerview.widget.b r1 = r6.f1866a
            boolean r1 = r1.k(r0)
            if (r1 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r6.A
            boolean r2 = r1.f1801e
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x0083
            int r2 = r6.f1794x
            if (r2 != r9) goto L_0x0083
            androidx.recyclerview.widget.LinearLayoutManager$d r2 = r6.f1796z
            if (r2 == 0) goto L_0x005a
            goto L_0x0083
        L_0x005a:
            if (r0 == 0) goto L_0x02c0
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.e(r0)
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.g()
            if (r1 >= r2) goto L_0x0078
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.b(r0)
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.k()
            if (r1 > r2) goto L_0x02c0
        L_0x0078:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r6.A
            int r2 = androidx.recyclerview.widget.RecyclerView.l.G(r0)
            r1.b(r0, r2)
            goto L_0x02c0
        L_0x0083:
            r1.c()
            androidx.recyclerview.widget.LinearLayoutManager$a r14 = r6.A
            boolean r0 = r6.u
            boolean r1 = r6.f1793v
            r0 = r0 ^ r1
            r14.f1800d = r0
            boolean r0 = r8.f1927g
            if (r0 != 0) goto L_0x0199
            int r0 = r6.f1794x
            if (r0 != r9) goto L_0x0099
            goto L_0x0199
        L_0x0099:
            if (r0 < 0) goto L_0x0195
            int r1 = r19.b()
            if (r0 < r1) goto L_0x00a3
            goto L_0x0195
        L_0x00a3:
            int r0 = r6.f1794x
            r14.f1798b = r0
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = r6.f1796z
            if (r1 == 0) goto L_0x00d2
            int r2 = r1.f1817a
            if (r2 < 0) goto L_0x00b1
            r2 = r11
            goto L_0x00b2
        L_0x00b1:
            r2 = r10
        L_0x00b2:
            if (r2 == 0) goto L_0x00d2
            boolean r0 = r1.f1819c
            r14.f1800d = r0
            if (r0 == 0) goto L_0x00c6
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = r6.f1796z
            int r1 = r1.f1818b
            goto L_0x0186
        L_0x00c6:
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = r6.f1796z
            int r1 = r1.f1818b
            goto L_0x0190
        L_0x00d2:
            int r1 = r6.f1795y
            if (r1 != r13) goto L_0x0178
            android.view.View r0 = r6.r(r0)
            if (r0 == 0) goto L_0x0146
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.c(r0)
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.l()
            if (r1 <= r2) goto L_0x00ec
            goto L_0x0164
        L_0x00ec:
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.e(r0)
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.k()
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x0107
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.k()
            r14.f1799c = r0
            r14.f1800d = r10
            goto L_0x0193
        L_0x0107:
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.g()
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.b(r0)
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x0122
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.g()
            r14.f1799c = r0
            r14.f1800d = r11
            goto L_0x0193
        L_0x0122:
            boolean r1 = r14.f1800d
            if (r1 == 0) goto L_0x013d
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r0 = r1.b(r0)
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r2 = r1.f2141b
            if (r13 != r2) goto L_0x0134
            r2 = r10
            goto L_0x013b
        L_0x0134:
            int r2 = r1.l()
            int r1 = r1.f2141b
            int r2 = r2 - r1
        L_0x013b:
            int r2 = r2 + r0
            goto L_0x0143
        L_0x013d:
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r2 = r1.e(r0)
        L_0x0143:
            r14.f1799c = r2
            goto L_0x0193
        L_0x0146:
            int r0 = r17.w()
            if (r0 <= 0) goto L_0x0164
            android.view.View r0 = r6.v(r10)
            int r0 = androidx.recyclerview.widget.RecyclerView.l.G(r0)
            int r1 = r6.f1794x
            if (r1 >= r0) goto L_0x015a
            r0 = r11
            goto L_0x015b
        L_0x015a:
            r0 = r10
        L_0x015b:
            boolean r1 = r6.u
            if (r0 != r1) goto L_0x0161
            r0 = r11
            goto L_0x0162
        L_0x0161:
            r0 = r10
        L_0x0162:
            r14.f1800d = r0
        L_0x0164:
            boolean r0 = r14.f1800d
            if (r0 == 0) goto L_0x016f
            androidx.recyclerview.widget.s r0 = r14.f1797a
            int r0 = r0.g()
            goto L_0x0175
        L_0x016f:
            androidx.recyclerview.widget.s r0 = r14.f1797a
            int r0 = r0.k()
        L_0x0175:
            r14.f1799c = r0
            goto L_0x0193
        L_0x0178:
            boolean r0 = r6.u
            r14.f1800d = r0
            if (r0 == 0) goto L_0x0188
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.g()
            int r1 = r6.f1795y
        L_0x0186:
            int r0 = r0 - r1
            goto L_0x0191
        L_0x0188:
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.k()
            int r1 = r6.f1795y
        L_0x0190:
            int r0 = r0 + r1
        L_0x0191:
            r14.f1799c = r0
        L_0x0193:
            r0 = r11
            goto L_0x019a
        L_0x0195:
            r6.f1794x = r9
            r6.f1795y = r13
        L_0x0199:
            r0 = r10
        L_0x019a:
            if (r0 == 0) goto L_0x019e
            goto L_0x02bc
        L_0x019e:
            int r0 = r17.w()
            if (r0 != 0) goto L_0x01a6
            goto L_0x0298
        L_0x01a6:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f1867b
            if (r0 != 0) goto L_0x01ac
        L_0x01aa:
            r0 = 0
            goto L_0x01bb
        L_0x01ac:
            android.view.View r0 = r0.getFocusedChild()
            if (r0 == 0) goto L_0x01aa
            androidx.recyclerview.widget.b r1 = r6.f1866a
            boolean r1 = r1.k(r0)
            if (r1 == 0) goto L_0x01bb
            goto L_0x01aa
        L_0x01bb:
            if (r0 == 0) goto L_0x01e7
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.m) r1
            boolean r2 = r1.c()
            if (r2 != 0) goto L_0x01db
            int r2 = r1.a()
            if (r2 < 0) goto L_0x01db
            int r1 = r1.a()
            int r2 = r19.b()
            if (r1 >= r2) goto L_0x01db
            r1 = r11
            goto L_0x01dc
        L_0x01db:
            r1 = r10
        L_0x01dc:
            if (r1 == 0) goto L_0x01e7
            int r1 = androidx.recyclerview.widget.RecyclerView.l.G(r0)
            r14.b(r0, r1)
            goto L_0x0296
        L_0x01e7:
            boolean r0 = r6.f1791s
            boolean r1 = r6.f1793v
            if (r0 == r1) goto L_0x01ef
            goto L_0x0298
        L_0x01ef:
            boolean r0 = r14.f1800d
            if (r0 == 0) goto L_0x0221
            boolean r0 = r6.u
            if (r0 == 0) goto L_0x020b
            int r4 = r17.w()
            int r5 = r19.b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.M0(r1, r2, r3, r4, r5)
            goto L_0x024e
        L_0x020b:
            int r0 = r17.w()
            int r3 = r0 + -1
            int r5 = r19.b()
            r4 = -1
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.M0(r1, r2, r3, r4, r5)
            goto L_0x024e
        L_0x0221:
            boolean r0 = r6.u
            if (r0 == 0) goto L_0x023b
            int r0 = r17.w()
            int r3 = r0 + -1
            int r5 = r19.b()
            r4 = -1
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.M0(r1, r2, r3, r4, r5)
            goto L_0x024e
        L_0x023b:
            int r4 = r17.w()
            int r5 = r19.b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.M0(r1, r2, r3, r4, r5)
        L_0x024e:
            if (r0 == 0) goto L_0x0298
            int r1 = androidx.recyclerview.widget.RecyclerView.l.G(r0)
            r14.a(r0, r1)
            boolean r1 = r8.f1927g
            if (r1 != 0) goto L_0x0296
            boolean r1 = r17.x0()
            if (r1 == 0) goto L_0x0296
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.e(r0)
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.g()
            if (r1 >= r2) goto L_0x0280
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r0 = r1.b(r0)
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.k()
            if (r0 >= r1) goto L_0x027e
            goto L_0x0280
        L_0x027e:
            r0 = r10
            goto L_0x0281
        L_0x0280:
            r0 = r11
        L_0x0281:
            if (r0 == 0) goto L_0x0296
            boolean r0 = r14.f1800d
            if (r0 == 0) goto L_0x028e
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.g()
            goto L_0x0294
        L_0x028e:
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r0 = r0.k()
        L_0x0294:
            r14.f1799c = r0
        L_0x0296:
            r0 = r11
            goto L_0x0299
        L_0x0298:
            r0 = r10
        L_0x0299:
            if (r0 == 0) goto L_0x029c
            goto L_0x02bc
        L_0x029c:
            boolean r0 = r14.f1800d
            if (r0 == 0) goto L_0x02a7
            androidx.recyclerview.widget.s r0 = r14.f1797a
            int r0 = r0.g()
            goto L_0x02ad
        L_0x02a7:
            androidx.recyclerview.widget.s r0 = r14.f1797a
            int r0 = r0.k()
        L_0x02ad:
            r14.f1799c = r0
            boolean r0 = r6.f1793v
            if (r0 == 0) goto L_0x02b9
            int r0 = r19.b()
            int r0 = r0 + r9
            goto L_0x02ba
        L_0x02b9:
            r0 = r10
        L_0x02ba:
            r14.f1798b = r0
        L_0x02bc:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.A
            r0.f1801e = r11
        L_0x02c0:
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r1 = r0.f1815j
            if (r1 < 0) goto L_0x02c8
            r1 = r11
            goto L_0x02c9
        L_0x02c8:
            r1 = r9
        L_0x02c9:
            r0.f1811f = r1
            int[] r0 = r6.D
            r0[r10] = r10
            r0[r11] = r10
            r6.y0(r8, r0)
            int[] r0 = r6.D
            r0 = r0[r10]
            int r0 = java.lang.Math.max(r10, r0)
            androidx.recyclerview.widget.s r1 = r6.f1790r
            int r1 = r1.k()
            int r1 = r1 + r0
            int[] r0 = r6.D
            r0 = r0[r11]
            int r0 = java.lang.Math.max(r10, r0)
            androidx.recyclerview.widget.s r2 = r6.f1790r
            int r2 = r2.h()
            int r2 = r2 + r0
            boolean r0 = r8.f1927g
            if (r0 == 0) goto L_0x032d
            int r0 = r6.f1794x
            if (r0 == r9) goto L_0x032d
            int r3 = r6.f1795y
            if (r3 == r13) goto L_0x032d
            android.view.View r0 = r6.r(r0)
            if (r0 == 0) goto L_0x032d
            boolean r3 = r6.u
            if (r3 == 0) goto L_0x0318
            androidx.recyclerview.widget.s r3 = r6.f1790r
            int r3 = r3.g()
            androidx.recyclerview.widget.s r4 = r6.f1790r
            int r0 = r4.b(r0)
            int r3 = r3 - r0
            int r0 = r6.f1795y
            goto L_0x0327
        L_0x0318:
            androidx.recyclerview.widget.s r3 = r6.f1790r
            int r0 = r3.e(r0)
            androidx.recyclerview.widget.s r3 = r6.f1790r
            int r3 = r3.k()
            int r0 = r0 - r3
            int r3 = r6.f1795y
        L_0x0327:
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x032c
            int r1 = r1 + r3
            goto L_0x032d
        L_0x032c:
            int r2 = r2 - r3
        L_0x032d:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.A
            boolean r3 = r0.f1800d
            if (r3 == 0) goto L_0x0338
            boolean r3 = r6.u
            if (r3 == 0) goto L_0x033c
            goto L_0x033e
        L_0x0338:
            boolean r3 = r6.u
            if (r3 == 0) goto L_0x033e
        L_0x033c:
            r3 = r9
            goto L_0x033f
        L_0x033e:
            r3 = r11
        L_0x033f:
            r6.T0(r7, r8, r0, r3)
            r17.q(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            androidx.recyclerview.widget.s r3 = r6.f1790r
            int r3 = r3.i()
            if (r3 != 0) goto L_0x0359
            androidx.recyclerview.widget.s r3 = r6.f1790r
            int r3 = r3.f()
            if (r3 != 0) goto L_0x0359
            r3 = r11
            goto L_0x035a
        L_0x0359:
            r3 = r10
        L_0x035a:
            r0.f1816l = r3
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1814i = r10
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.A
            boolean r3 = r0.f1800d
            if (r3 == 0) goto L_0x03b2
            int r3 = r0.f1798b
            int r0 = r0.f1799c
            r6.c1(r3, r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1813h = r1
            r6.F0(r7, r0, r8, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r1 = r0.f1807b
            int r3 = r0.f1809d
            int r0 = r0.f1808c
            if (r0 <= 0) goto L_0x0384
            int r2 = r2 + r0
        L_0x0384:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.A
            int r4 = r0.f1798b
            int r0 = r0.f1799c
            r6.b1(r4, r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1813h = r2
            int r2 = r0.f1809d
            int r4 = r0.f1810e
            int r2 = r2 + r4
            r0.f1809d = r2
            r6.F0(r7, r0, r8, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r2 = r0.f1807b
            int r0 = r0.f1808c
            if (r0 <= 0) goto L_0x03f8
            r6.c1(r3, r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f1789q
            r1.f1813h = r0
            r6.F0(r7, r1, r8, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r1 = r0.f1807b
            goto L_0x03f8
        L_0x03b2:
            int r3 = r0.f1798b
            int r0 = r0.f1799c
            r6.b1(r3, r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1813h = r2
            r6.F0(r7, r0, r8, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r2 = r0.f1807b
            int r3 = r0.f1809d
            int r0 = r0.f1808c
            if (r0 <= 0) goto L_0x03cb
            int r1 = r1 + r0
        L_0x03cb:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.A
            int r4 = r0.f1798b
            int r0 = r0.f1799c
            r6.c1(r4, r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1813h = r1
            int r1 = r0.f1809d
            int r4 = r0.f1810e
            int r1 = r1 + r4
            r0.f1809d = r1
            r6.F0(r7, r0, r8, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r1 = r0.f1807b
            int r0 = r0.f1808c
            if (r0 <= 0) goto L_0x03f8
            r6.b1(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f1789q
            r2.f1813h = r0
            r6.F0(r7, r2, r8, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            int r2 = r0.f1807b
        L_0x03f8:
            int r0 = r17.w()
            if (r0 <= 0) goto L_0x041c
            boolean r0 = r6.u
            boolean r3 = r6.f1793v
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0410
            int r0 = r6.N0(r2, r7, r8, r11)
            int r1 = r1 + r0
            int r2 = r2 + r0
            int r0 = r6.O0(r1, r7, r8, r10)
            goto L_0x041a
        L_0x0410:
            int r0 = r6.O0(r1, r7, r8, r11)
            int r1 = r1 + r0
            int r2 = r2 + r0
            int r0 = r6.N0(r2, r7, r8, r10)
        L_0x041a:
            int r1 = r1 + r0
            int r2 = r2 + r0
        L_0x041c:
            boolean r0 = r8.k
            if (r0 == 0) goto L_0x04b5
            int r0 = r17.w()
            if (r0 == 0) goto L_0x04b5
            boolean r0 = r8.f1927g
            if (r0 != 0) goto L_0x04b5
            boolean r0 = r17.x0()
            if (r0 != 0) goto L_0x0432
            goto L_0x04b5
        L_0x0432:
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r0 = r7.f1899d
            int r3 = r0.size()
            android.view.View r4 = r6.v(r10)
            int r4 = androidx.recyclerview.widget.RecyclerView.l.G(r4)
            r5 = r10
            r13 = r5
            r14 = r13
        L_0x0443:
            if (r5 >= r3) goto L_0x0473
            java.lang.Object r15 = r0.get(r5)
            androidx.recyclerview.widget.RecyclerView$z r15 = (androidx.recyclerview.widget.RecyclerView.z) r15
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0452
            goto L_0x046f
        L_0x0452:
            int r11 = r15.c()
            if (r11 >= r4) goto L_0x045a
            r11 = 1
            goto L_0x045b
        L_0x045a:
            r11 = r10
        L_0x045b:
            boolean r12 = r6.u
            if (r11 == r12) goto L_0x0461
            r11 = r9
            goto L_0x0462
        L_0x0461:
            r11 = 1
        L_0x0462:
            androidx.recyclerview.widget.s r12 = r6.f1790r
            android.view.View r15 = r15.f1942a
            int r12 = r12.c(r15)
            if (r11 != r9) goto L_0x046e
            int r13 = r13 + r12
            goto L_0x046f
        L_0x046e:
            int r14 = r14 + r12
        L_0x046f:
            int r5 = r5 + 1
            r11 = 1
            goto L_0x0443
        L_0x0473:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r6.f1789q
            r3.k = r0
            if (r13 <= 0) goto L_0x0493
            android.view.View r0 = r17.Q0()
            int r0 = androidx.recyclerview.widget.RecyclerView.l.G(r0)
            r6.c1(r0, r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1813h = r13
            r0.f1808c = r10
            r1 = 0
            r0.a(r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r6.F0(r7, r0, r8, r10)
        L_0x0493:
            if (r14 <= 0) goto L_0x04b0
            android.view.View r0 = r17.P0()
            int r0 = androidx.recyclerview.widget.RecyclerView.l.G(r0)
            r6.b1(r0, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.f1813h = r14
            r0.f1808c = r10
            r1 = 0
            r0.a(r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r6.F0(r7, r0, r8, r10)
            goto L_0x04b1
        L_0x04b0:
            r1 = 0
        L_0x04b1:
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f1789q
            r0.k = r1
        L_0x04b5:
            boolean r0 = r8.f1927g
            if (r0 != 0) goto L_0x04c2
            androidx.recyclerview.widget.s r0 = r6.f1790r
            int r1 = r0.l()
            r0.f2141b = r1
            goto L_0x04c7
        L_0x04c2:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.A
            r0.c()
        L_0x04c7:
            boolean r0 = r6.f1793v
            r6.f1791s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.Z(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public void Z0(boolean z9) {
        c((String) null);
        if (this.f1793v != z9) {
            this.f1793v = z9;
            j0();
        }
    }

    public final PointF a(int i10) {
        if (w() == 0) {
            return null;
        }
        boolean z9 = false;
        int i11 = 1;
        if (i10 < RecyclerView.l.G(v(0))) {
            z9 = true;
        }
        if (z9 != this.u) {
            i11 = -1;
        }
        return this.f1788p == 0 ? new PointF((float) i11, 0.0f) : new PointF(0.0f, (float) i11);
    }

    public void a0(RecyclerView.w wVar) {
        this.f1796z = null;
        this.f1794x = -1;
        this.f1795y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void a1(int i10, int i11, boolean z9, RecyclerView.w wVar) {
        boolean z10;
        int i12;
        int i13;
        c cVar = this.f1789q;
        int i14 = 1;
        boolean z11 = false;
        if (this.f1790r.i() == 0 && this.f1790r.f() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.f1816l = z10;
        this.f1789q.f1811f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(wVar, iArr);
        int max = Math.max(0, this.D[0]);
        int max2 = Math.max(0, this.D[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar2 = this.f1789q;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f1813h = i12;
        if (!z11) {
            max = max2;
        }
        cVar2.f1814i = max;
        if (z11) {
            cVar2.f1813h = this.f1790r.h() + i12;
            View P0 = P0();
            c cVar3 = this.f1789q;
            if (this.u) {
                i14 = -1;
            }
            cVar3.f1810e = i14;
            int G = RecyclerView.l.G(P0);
            c cVar4 = this.f1789q;
            cVar3.f1809d = G + cVar4.f1810e;
            cVar4.f1807b = this.f1790r.b(P0);
            i13 = this.f1790r.b(P0) - this.f1790r.g();
        } else {
            View Q0 = Q0();
            c cVar5 = this.f1789q;
            cVar5.f1813h = this.f1790r.k() + cVar5.f1813h;
            c cVar6 = this.f1789q;
            if (!this.u) {
                i14 = -1;
            }
            cVar6.f1810e = i14;
            int G2 = RecyclerView.l.G(Q0);
            c cVar7 = this.f1789q;
            cVar6.f1809d = G2 + cVar7.f1810e;
            cVar7.f1807b = this.f1790r.e(Q0);
            i13 = (-this.f1790r.e(Q0)) + this.f1790r.k();
        }
        c cVar8 = this.f1789q;
        cVar8.f1808c = i11;
        if (z9) {
            cVar8.f1808c = i11 - i13;
        }
        cVar8.f1812g = i13;
    }

    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f1796z = (d) parcelable;
            j0();
        }
    }

    public final void b1(int i10, int i11) {
        this.f1789q.f1808c = this.f1790r.g() - i11;
        c cVar = this.f1789q;
        cVar.f1810e = this.u ? -1 : 1;
        cVar.f1809d = i10;
        cVar.f1811f = 1;
        cVar.f1807b = i11;
        cVar.f1812g = Integer.MIN_VALUE;
    }

    public final void c(String str) {
        if (this.f1796z == null) {
            super.c(str);
        }
    }

    public final Parcelable c0() {
        d dVar = this.f1796z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (w() > 0) {
            E0();
            boolean z9 = this.f1791s ^ this.u;
            dVar2.f1819c = z9;
            if (z9) {
                View P0 = P0();
                dVar2.f1818b = this.f1790r.g() - this.f1790r.b(P0);
                dVar2.f1817a = RecyclerView.l.G(P0);
            } else {
                View Q0 = Q0();
                dVar2.f1817a = RecyclerView.l.G(Q0);
                dVar2.f1818b = this.f1790r.e(Q0) - this.f1790r.k();
            }
        } else {
            dVar2.f1817a = -1;
        }
        return dVar2;
    }

    public final void c1(int i10, int i11) {
        this.f1789q.f1808c = i11 - this.f1790r.k();
        c cVar = this.f1789q;
        cVar.f1809d = i10;
        cVar.f1810e = this.u ? 1 : -1;
        cVar.f1811f = -1;
        cVar.f1807b = i11;
        cVar.f1812g = Integer.MIN_VALUE;
    }

    public final boolean e() {
        return this.f1788p == 0;
    }

    public final boolean f() {
        return this.f1788p == 1;
    }

    public final void i(int i10, int i11, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        if (this.f1788p != 0) {
            i10 = i11;
        }
        if (w() != 0 && i10 != 0) {
            E0();
            a1(i10 > 0 ? 1 : -1, Math.abs(i10), true, wVar);
            z0(wVar, this.f1789q, cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r7, androidx.recyclerview.widget.RecyclerView.l.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f1796z
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f1817a
            if (r4 < 0) goto L_0x000d
            r5 = r3
            goto L_0x000e
        L_0x000d:
            r5 = r1
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f1819c
            goto L_0x0022
        L_0x0013:
            r6.W0()
            boolean r0 = r6.u
            int r4 = r6.f1794x
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            r0 = r1
        L_0x0027:
            int r3 = r6.C
            if (r0 >= r3) goto L_0x0039
            if (r4 < 0) goto L_0x0039
            if (r4 >= r7) goto L_0x0039
            r3 = r8
            androidx.recyclerview.widget.m$b r3 = (androidx.recyclerview.widget.m.b) r3
            r3.a(r4, r1)
            int r4 = r4 + r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j(int, androidx.recyclerview.widget.RecyclerView$l$c):void");
    }

    public final int k(RecyclerView.w wVar) {
        return A0(wVar);
    }

    public int k0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1788p == 1) {
            return 0;
        }
        return X0(i10, rVar, wVar);
    }

    public int l(RecyclerView.w wVar) {
        return B0(wVar);
    }

    public final void l0(int i10) {
        this.f1794x = i10;
        this.f1795y = Integer.MIN_VALUE;
        d dVar = this.f1796z;
        if (dVar != null) {
            dVar.f1817a = -1;
        }
        j0();
    }

    public int m(RecyclerView.w wVar) {
        return C0(wVar);
    }

    public int m0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1788p == 0) {
            return 0;
        }
        return X0(i10, rVar, wVar);
    }

    public final int n(RecyclerView.w wVar) {
        return A0(wVar);
    }

    public int o(RecyclerView.w wVar) {
        return B0(wVar);
    }

    public int p(RecyclerView.w wVar) {
        return C0(wVar);
    }

    public final View r(int i10) {
        int w10 = w();
        if (w10 == 0) {
            return null;
        }
        int G = i10 - RecyclerView.l.G(v(0));
        if (G >= 0 && G < w10) {
            View v10 = v(G);
            if (RecyclerView.l.G(v10) == i10) {
                return v10;
            }
        }
        return super.r(i10);
    }

    public RecyclerView.m s() {
        return new RecyclerView.m(-2, -2);
    }

    public final boolean t0() {
        boolean z9;
        if (!(this.f1877m == 1073741824 || this.f1876l == 1073741824)) {
            int w10 = w();
            int i10 = 0;
            while (true) {
                if (i10 >= w10) {
                    z9 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = v(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z9 = true;
                    break;
                }
                i10++;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public void v0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1906a = i10;
        w0(oVar);
    }

    public boolean x0() {
        return this.f1796z == null && this.f1791s == this.f1793v;
    }

    public void y0(RecyclerView.w wVar, int[] iArr) {
        boolean z9;
        int i10;
        int i11;
        if (wVar.f1921a != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = this.f1790r.l();
        } else {
            i10 = 0;
        }
        if (this.f1789q.f1811f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void z0(RecyclerView.w wVar, c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.f1809d;
        if (i10 >= 0 && i10 < wVar.b()) {
            ((m.b) cVar2).a(i10, Math.max(0, cVar.f1812g));
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1788p = 1;
        this.f1792t = false;
        this.u = false;
        this.f1793v = false;
        this.w = true;
        this.f1794x = -1;
        this.f1795y = Integer.MIN_VALUE;
        this.f1796z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.l.d H = RecyclerView.l.H(context, attributeSet, i10, i11);
        Y0(H.f1882a);
        boolean z9 = H.f1884c;
        c((String) null);
        if (z9 != this.f1792t) {
            this.f1792t = z9;
            j0();
        }
        Z0(H.f1885d);
    }
}
