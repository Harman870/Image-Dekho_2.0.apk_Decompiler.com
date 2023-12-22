package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.recyclerview.widget.RecyclerView;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0015b f2012a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2013b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2014c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2015a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2016b;

        public final void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f2016b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f2015a &= ~(1 << i10);
        }

        public final int b(int i10) {
            long j10;
            a aVar = this.f2016b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j10 = this.f2015a;
                }
                j10 = this.f2015a & ((1 << i10) - 1);
            } else {
                if (i10 >= 64) {
                    return Long.bitCount(this.f2015a) + aVar.b(i10 - 64);
                }
                j10 = this.f2015a & ((1 << i10) - 1);
            }
            return Long.bitCount(j10);
        }

        public final void c() {
            if (this.f2016b == null) {
                this.f2016b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2015a & (1 << i10)) != 0;
            }
            c();
            return this.f2016b.d(i10 - 64);
        }

        public final void e(int i10, boolean z9) {
            if (i10 >= 64) {
                c();
                this.f2016b.e(i10 - 64, z9);
                return;
            }
            long j10 = this.f2015a;
            boolean z10 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f2015a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z9) {
                h(i10);
            } else {
                a(i10);
            }
            if (z10 || this.f2016b != null) {
                c();
                this.f2016b.e(0, z10);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2016b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2015a;
            boolean z9 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2015a = j12;
            long j13 = j10 - 1;
            this.f2015a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2016b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2016b.f(0);
            }
            return z9;
        }

        public final void g() {
            this.f2015a = 0;
            a aVar = this.f2016b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f2016b.h(i10 - 64);
                return;
            }
            this.f2015a |= 1 << i10;
        }

        public final String toString() {
            if (this.f2016b == null) {
                return Long.toBinaryString(this.f2015a);
            }
            return this.f2016b.toString() + "xx" + Long.toBinaryString(this.f2015a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface C0015b {
    }

    public b(v vVar) {
        this.f2012a = vVar;
    }

    public final void a(View view, int i10, boolean z9) {
        int i11;
        if (i10 < 0) {
            i11 = ((v) this.f2012a).a();
        } else {
            i11 = f(i10);
        }
        this.f2013b.e(i11, z9);
        if (z9) {
            i(view);
        }
        v vVar = (v) this.f2012a;
        vVar.f2146a.addView(view, i11);
        vVar.f2146a.getClass();
        RecyclerView.I(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int i11;
        if (i10 < 0) {
            i11 = ((v) this.f2012a).a();
        } else {
            i11 = f(i10);
        }
        this.f2013b.e(i11, z9);
        if (z9) {
            i(view);
        }
        v vVar = (v) this.f2012a;
        vVar.getClass();
        RecyclerView.z I = RecyclerView.I(view);
        if (I != null) {
            if (I.k() || I.o()) {
                I.f1951j &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(I);
                throw new IllegalArgumentException(f.e(vVar.f2146a, sb));
            }
        }
        vVar.f2146a.attachViewToParent(view, i11, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.z I;
        int f10 = f(i10);
        this.f2013b.f(f10);
        v vVar = (v) this.f2012a;
        View childAt = vVar.f2146a.getChildAt(f10);
        if (!(childAt == null || (I = RecyclerView.I(childAt)) == null)) {
            if (!I.k() || I.o()) {
                I.b(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(I);
                throw new IllegalArgumentException(f.e(vVar.f2146a, sb));
            }
        }
        vVar.f2146a.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((v) this.f2012a).f2146a.getChildAt(f(i10));
    }

    public final int e() {
        return ((v) this.f2012a).a() - this.f2014c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((v) this.f2012a).a();
        int i11 = i10;
        while (i11 < a10) {
            int b10 = i10 - (i11 - this.f2013b.b(i11));
            if (b10 == 0) {
                while (this.f2013b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((v) this.f2012a).f2146a.getChildAt(i10);
    }

    public final int h() {
        return ((v) this.f2012a).a();
    }

    public final void i(View view) {
        this.f2014c.add(view);
        v vVar = (v) this.f2012a;
        vVar.getClass();
        RecyclerView.z I = RecyclerView.I(view);
        if (I != null) {
            RecyclerView recyclerView = vVar.f2146a;
            int i10 = I.f1957q;
            if (i10 == -1) {
                View view2 = I.f1942a;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                i10 = y.d.c(view2);
            }
            I.f1956p = i10;
            if (recyclerView.K()) {
                I.f1957q = 4;
                recyclerView.D0.add(I);
                return;
            }
            View view3 = I.f1942a;
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            y.d.s(view3, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((v) this.f2012a).f2146a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f2013b.d(indexOfChild)) {
            return indexOfChild - this.f2013b.b(indexOfChild);
        }
        return -1;
    }

    public final boolean k(View view) {
        return this.f2014c.contains(view);
    }

    public final void l(View view) {
        if (this.f2014c.remove(view)) {
            v vVar = (v) this.f2012a;
            vVar.getClass();
            RecyclerView.z I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = vVar.f2146a;
                int i10 = I.f1956p;
                if (recyclerView.K()) {
                    I.f1957q = i10;
                    recyclerView.D0.add(I);
                } else {
                    View view2 = I.f1942a;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.s(view2, i10);
                }
                I.f1956p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2013b.toString() + ", hidden list:" + this.f2014c.size();
    }
}
