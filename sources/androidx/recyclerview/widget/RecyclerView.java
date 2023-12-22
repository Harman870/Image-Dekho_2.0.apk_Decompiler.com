package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d0.i;
import h0.g0;
import h0.l0;
import h0.y;
import i0.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class RecyclerView extends ViewGroup implements h0.l {
    public static final int[] G0 = {16843830};
    public static final Class<?>[] H0;
    public static final b I0 = new b();
    public int A;
    public final int[] A0;
    public int B;
    public final int[] B0;
    public h C;
    public final int[] C0;
    public EdgeEffect D;
    public final ArrayList D0;
    public EdgeEffect E;
    public a E0;
    public EdgeEffect F;
    public final c F0;
    public EdgeEffect G;
    public i H;
    public int I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public n Q;
    public final int R;
    public final int S;
    public float T;
    public float U;
    public boolean V;
    public final y W;

    /* renamed from: a  reason: collision with root package name */
    public final t f1820a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1821b;

    /* renamed from: c  reason: collision with root package name */
    public u f1822c;

    /* renamed from: d  reason: collision with root package name */
    public a f1823d;

    /* renamed from: e  reason: collision with root package name */
    public b f1824e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f1825f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1826g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1827h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1828i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f1829j;
    public d k;

    /* renamed from: l  reason: collision with root package name */
    public l f1830l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<k> f1831m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<o> f1832n;

    /* renamed from: o  reason: collision with root package name */
    public o f1833o;

    /* renamed from: o0  reason: collision with root package name */
    public m f1834o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1835p;
    public m.b p0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1836q;

    /* renamed from: q0  reason: collision with root package name */
    public final w f1837q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1838r;

    /* renamed from: r0  reason: collision with root package name */
    public p f1839r0;

    /* renamed from: s  reason: collision with root package name */
    public int f1840s;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f1841s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1842t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1843t0;
    public boolean u;
    public boolean u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1844v;

    /* renamed from: v0  reason: collision with root package name */
    public j f1845v0;
    public int w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1846w0;

    /* renamed from: x  reason: collision with root package name */
    public final AccessibilityManager f1847x;

    /* renamed from: x0  reason: collision with root package name */
    public x f1848x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1849y;

    /* renamed from: y0  reason: collision with root package name */
    public final int[] f1850y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1851z;

    /* renamed from: z0  reason: collision with root package name */
    public h0.m f1852z0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            long j10;
            long j11;
            i iVar = RecyclerView.this.H;
            if (iVar != null) {
                k kVar = (k) iVar;
                boolean z9 = !kVar.f2059h.isEmpty();
                boolean z10 = !kVar.f2061j.isEmpty();
                boolean z11 = !kVar.k.isEmpty();
                boolean z12 = !kVar.f2060i.isEmpty();
                if (z9 || z10 || z12 || z11) {
                    Iterator<z> it = kVar.f2059h.iterator();
                    while (it.hasNext()) {
                        z next = it.next();
                        View view = next.f1942a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f2067q.add(next);
                        animate.setDuration(kVar.f1860d).alpha(0.0f).setListener(new f(view, animate, kVar, next)).start();
                    }
                    kVar.f2059h.clear();
                    if (z10) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(kVar.f2061j);
                        kVar.f2063m.add(arrayList);
                        kVar.f2061j.clear();
                        c cVar = new c(kVar, arrayList);
                        if (z9) {
                            View view2 = ((k.b) arrayList.get(0)).f2075a.f1942a;
                            long j12 = kVar.f1860d;
                            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                            y.d.n(view2, cVar, j12);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z11) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(kVar.k);
                        kVar.f2064n.add(arrayList2);
                        kVar.k.clear();
                        d dVar = new d(kVar, arrayList2);
                        if (z9) {
                            View view3 = ((k.a) arrayList2.get(0)).f2069a.f1942a;
                            long j13 = kVar.f1860d;
                            WeakHashMap<View, l0> weakHashMap2 = h0.y.f6776a;
                            y.d.n(view3, dVar, j13);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z12) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(kVar.f2060i);
                        kVar.f2062l.add(arrayList3);
                        kVar.f2060i.clear();
                        e eVar = new e(kVar, arrayList3);
                        if (z9 || z10 || z11) {
                            long j14 = 0;
                            if (z9) {
                                j10 = kVar.f1860d;
                            } else {
                                j10 = 0;
                            }
                            if (z10) {
                                j11 = kVar.f1861e;
                            } else {
                                j11 = 0;
                            }
                            if (z11) {
                                j14 = kVar.f1862f;
                            }
                            View view4 = ((z) arrayList3.get(0)).f1942a;
                            WeakHashMap<View, l0> weakHashMap3 = h0.y.f6776a;
                            y.d.n(view4, eVar, Math.max(j11, j14) + j10);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.f1846w0 = false;
        }
    }

    public static class b implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c {
        public c() {
        }
    }

    public static abstract class d<VH extends z> {

        /* renamed from: a  reason: collision with root package name */
        public final e f1855a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1856b = false;

        public abstract int a();

        public long b(int i10) {
            return -1;
        }

        public int c(int i10) {
            return 0;
        }

        public abstract void d(VH vh, int i10);

        public abstract z e(RecyclerView recyclerView, int i10);

        public void f(VH vh) {
        }
    }

    public static class e extends Observable<f> {
        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((f) this.mObservers.get(size)).a();
            }
        }
    }

    public static abstract class f {
        public void a() {
        }
    }

    public interface g {
        int a();
    }

    public static class h {
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f1857a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1858b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f1859c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f1860d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f1861e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f1862f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1863a;

            /* renamed from: b  reason: collision with root package name */
            public int f1864b;

            public final void a(z zVar) {
                View view = zVar.f1942a;
                this.f1863a = view.getLeft();
                this.f1864b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(z zVar) {
            RecyclerView recyclerView;
            int i10 = zVar.f1951j & 14;
            if (!zVar.g() && (i10 & 4) == 0 && (recyclerView = zVar.f1958r) != null) {
                recyclerView.F(zVar);
            }
        }

        public abstract boolean a(z zVar, z zVar2, c cVar, c cVar2);

        public final void c(z zVar) {
            boolean z9;
            b bVar = this.f1857a;
            if (bVar != null) {
                j jVar = (j) bVar;
                boolean z10 = true;
                zVar.n(true);
                if (zVar.f1949h != null && zVar.f1950i == null) {
                    zVar.f1949h = null;
                }
                zVar.f1950i = null;
                if ((zVar.f1951j & 16) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = zVar.f1942a;
                    recyclerView.c0();
                    b bVar2 = recyclerView.f1824e;
                    int indexOfChild = ((v) bVar2.f2012a).f2146a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.l(view);
                    } else if (bVar2.f2013b.d(indexOfChild)) {
                        bVar2.f2013b.f(indexOfChild);
                        bVar2.l(view);
                        ((v) bVar2.f2012a).b(indexOfChild);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z I = RecyclerView.I(view);
                        recyclerView.f1821b.k(I);
                        recyclerView.f1821b.h(I);
                    }
                    recyclerView.d0(!z10);
                    if (!z10 && zVar.k()) {
                        RecyclerView.this.removeDetachedView(zVar.f1942a, false);
                    }
                }
            }
        }

        public final void d() {
            int size = this.f1858b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1858b.get(i10).a();
            }
            this.f1858b.clear();
        }

        public abstract void e(z zVar);

        public abstract void f();

        public abstract boolean g();
    }

    public class j implements i.b {
        public j() {
        }
    }

    public static abstract class k {
        public void c(Canvas canvas, RecyclerView recyclerView) {
        }

        public void d(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public b f1866a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1867b;

        /* renamed from: c  reason: collision with root package name */
        public b0 f1868c;

        /* renamed from: d  reason: collision with root package name */
        public b0 f1869d;

        /* renamed from: e  reason: collision with root package name */
        public v f1870e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1871f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1872g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1873h = true;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1874i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f1875j;
        public boolean k;

        /* renamed from: l  reason: collision with root package name */
        public int f1876l;

        /* renamed from: m  reason: collision with root package name */
        public int f1877m;

        /* renamed from: n  reason: collision with root package name */
        public int f1878n;

        /* renamed from: o  reason: collision with root package name */
        public int f1879o;

        public class a implements b0.b {
            public a() {
            }

            public final int a() {
                l lVar = l.this;
                return lVar.f1878n - lVar.E();
            }

            public final int b(View view) {
                l.this.getClass();
                return (view.getLeft() - ((m) view.getLayoutParams()).f1887b.left) - ((m) view.getLayoutParams()).leftMargin;
            }

            public final View c(int i10) {
                return l.this.v(i10);
            }

            public final int d() {
                return l.this.D();
            }

            public final int e(View view) {
                l.this.getClass();
                return view.getRight() + ((m) view.getLayoutParams()).f1887b.right + ((m) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements b0.b {
            public b() {
            }

            public final int a() {
                l lVar = l.this;
                return lVar.f1879o - lVar.C();
            }

            public final int b(View view) {
                l.this.getClass();
                return (view.getTop() - ((m) view.getLayoutParams()).f1887b.top) - ((m) view.getLayoutParams()).topMargin;
            }

            public final View c(int i10) {
                return l.this.v(i10);
            }

            public final int d() {
                return l.this.F();
            }

            public final int e(View view) {
                l.this.getClass();
                return view.getBottom() + ((m) view.getLayoutParams()).f1887b.bottom + ((m) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1882a;

            /* renamed from: b  reason: collision with root package name */
            public int f1883b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1884c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1885d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f1868c = new b0(aVar);
            this.f1869d = new b0(bVar);
        }

        public static int G(View view) {
            return ((m) view.getLayoutParams()).a();
        }

        public static d H(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.c.f13178b, i10, i11);
            dVar.f1882a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1883b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1884c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1885d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean L(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static void M(View view, int i10, int i11, int i12, int i13) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f1887b;
            view.layout(i10 + rect.left + mVar.leftMargin, i11 + rect.top + mVar.topMargin, (i12 - rect.right) - mVar.rightMargin, (i13 - rect.bottom) - mVar.bottomMargin);
        }

        public static int h(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r6 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int x(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x001a
                if (r8 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r8 != r1) goto L_0x002f
                if (r6 == r2) goto L_0x0020
                if (r6 == 0) goto L_0x002f
                if (r6 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r8 < 0) goto L_0x001e
            L_0x001c:
                r6 = r3
                goto L_0x0031
            L_0x001e:
                if (r8 != r1) goto L_0x0022
            L_0x0020:
                r8 = r5
                goto L_0x0031
            L_0x0022:
                if (r8 != r0) goto L_0x002f
                if (r6 == r2) goto L_0x002c
                if (r6 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r8 = r5
                r6 = r7
                goto L_0x0031
            L_0x002c:
                r8 = r5
                r6 = r2
                goto L_0x0031
            L_0x002f:
                r6 = r7
                r8 = r6
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.x(boolean, int, int, int, int):int");
        }

        public final int A() {
            RecyclerView recyclerView = this.f1867b;
            d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public final int B() {
            RecyclerView recyclerView = this.f1867b;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            return y.e.d(recyclerView);
        }

        public final int C() {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int D() {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int I(r rVar, w wVar) {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView == null || recyclerView.k == null || !f()) {
                return 1;
            }
            return this.f1867b.k.a();
        }

        public final void J(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((m) view.getLayoutParams()).f1887b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f1867b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1867b.f1829j;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean K() {
            return false;
        }

        public void N(int i10) {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                int e10 = recyclerView.f1824e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f1824e.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void O(int i10) {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                int e10 = recyclerView.f1824e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f1824e.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void P(RecyclerView recyclerView) {
        }

        public View Q(View view, int i10, r rVar, w wVar) {
            return null;
        }

        public void R(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1867b;
            r rVar = recyclerView.f1821b;
            w wVar = recyclerView.f1837q0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z9 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1867b.canScrollVertically(-1) && !this.f1867b.canScrollHorizontally(-1) && !this.f1867b.canScrollHorizontally(1)) {
                    z9 = false;
                }
                accessibilityEvent.setScrollable(z9);
                d dVar = this.f1867b.k;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.a());
                }
            }
        }

        public final void S(View view, i0.f fVar) {
            z I = RecyclerView.I(view);
            if (I != null && !I.i() && !this.f1866a.k(I.f1942a)) {
                RecyclerView recyclerView = this.f1867b;
                T(recyclerView.f1821b, recyclerView.f1837q0, view, fVar);
            }
        }

        public void T(r rVar, w wVar, View view, i0.f fVar) {
            int i10 = 0;
            int G = f() ? G(view) : 0;
            if (e()) {
                i10 = G(view);
            }
            fVar.h(f.b.a(G, 1, i10, 1, false, false));
        }

        public void U(int i10, int i11) {
        }

        public void V() {
        }

        public void W(int i10, int i11) {
        }

        public void X(int i10, int i11) {
        }

        public void Y(int i10, int i11) {
        }

        public void Z(r rVar, w wVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void a0(w wVar) {
        }

        public final void b(View view, int i10, boolean z9) {
            z I = RecyclerView.I(view);
            if (z9 || I.i()) {
                c0 c0Var = this.f1867b.f1825f;
                c0.a orDefault = c0Var.f2026a.getOrDefault(I, null);
                if (orDefault == null) {
                    orDefault = c0.a.a();
                    c0Var.f2026a.put(I, orDefault);
                }
                orDefault.f2029a |= 1;
            } else {
                this.f1867b.f1825f.d(I);
            }
            m mVar = (m) view.getLayoutParams();
            if (I.p() || I.j()) {
                if (I.j()) {
                    I.f1954n.k(I);
                } else {
                    I.f1951j &= -33;
                }
                this.f1866a.b(view, i10, view.getLayoutParams(), false);
            } else {
                int i11 = -1;
                if (view.getParent() == this.f1867b) {
                    int j10 = this.f1866a.j(view);
                    if (i10 == -1) {
                        i10 = this.f1866a.e();
                    }
                    if (j10 == -1) {
                        StringBuilder g10 = androidx.activity.f.g("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        g10.append(this.f1867b.indexOfChild(view));
                        throw new IllegalStateException(androidx.activity.f.e(this.f1867b, g10));
                    } else if (j10 != i10) {
                        l lVar = this.f1867b.f1830l;
                        View v10 = lVar.v(j10);
                        if (v10 != null) {
                            lVar.v(j10);
                            lVar.f1866a.c(j10);
                            m mVar2 = (m) v10.getLayoutParams();
                            z I2 = RecyclerView.I(v10);
                            if (I2.i()) {
                                c0 c0Var2 = lVar.f1867b.f1825f;
                                c0.a orDefault2 = c0Var2.f2026a.getOrDefault(I2, null);
                                if (orDefault2 == null) {
                                    orDefault2 = c0.a.a();
                                    c0Var2.f2026a.put(I2, orDefault2);
                                }
                                orDefault2.f2029a = 1 | orDefault2.f2029a;
                            } else {
                                lVar.f1867b.f1825f.d(I2);
                            }
                            lVar.f1866a.b(v10, i10, mVar2, I2.i());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j10 + lVar.f1867b.toString());
                        }
                    }
                } else {
                    this.f1866a.a(view, i10, false);
                    mVar.f1888c = true;
                    v vVar = this.f1870e;
                    if (vVar != null && vVar.f1910e) {
                        vVar.f1907b.getClass();
                        z I3 = RecyclerView.I(view);
                        if (I3 != null) {
                            i11 = I3.c();
                        }
                        if (i11 == vVar.f1906a) {
                            vVar.f1911f = view;
                        }
                    }
                }
            }
            if (mVar.f1889d) {
                I.f1942a.invalidate();
                mVar.f1889d = false;
            }
        }

        public void b0(Parcelable parcelable) {
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public Parcelable c0() {
            return null;
        }

        public final void d(View view, Rect rect) {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.J(view));
            }
        }

        public void d0(int i10) {
        }

        public boolean e() {
            return this instanceof CarouselLayoutManager;
        }

        public final void e0(r rVar) {
            int w = w();
            while (true) {
                w--;
                if (w < 0) {
                    return;
                }
                if (!RecyclerView.I(v(w)).o()) {
                    View v10 = v(w);
                    h0(w);
                    rVar.g(v10);
                }
            }
        }

        public boolean f() {
            return false;
        }

        public final void f0(r rVar) {
            int size = rVar.f1896a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = rVar.f1896a.get(i10).f1942a;
                z I = RecyclerView.I(view);
                if (!I.o()) {
                    I.n(false);
                    if (I.k()) {
                        this.f1867b.removeDetachedView(view, false);
                    }
                    i iVar = this.f1867b.H;
                    if (iVar != null) {
                        iVar.e(I);
                    }
                    I.n(true);
                    z I2 = RecyclerView.I(view);
                    I2.f1954n = null;
                    I2.f1955o = false;
                    I2.f1951j &= -33;
                    rVar.h(I2);
                }
            }
            rVar.f1896a.clear();
            ArrayList<z> arrayList = rVar.f1897b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1867b.invalidate();
            }
        }

        public boolean g(m mVar) {
            return mVar != null;
        }

        public final void g0(View view, r rVar) {
            b bVar = this.f1866a;
            int indexOfChild = ((v) bVar.f2012a).f2146a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f2013b.f(indexOfChild)) {
                    bVar.l(view);
                }
                ((v) bVar.f2012a).b(indexOfChild);
            }
            rVar.g(view);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f1866a;
            r4 = r0.f(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.v(r4)
                if (r0 == 0) goto L_0x002b
                androidx.recyclerview.widget.b r0 = r3.f1866a
                int r4 = r0.f(r4)
                androidx.recyclerview.widget.b$b r1 = r0.f2012a
                androidx.recyclerview.widget.v r1 = (androidx.recyclerview.widget.v) r1
                androidx.recyclerview.widget.RecyclerView r1 = r1.f2146a
                android.view.View r1 = r1.getChildAt(r4)
                if (r1 != 0) goto L_0x0019
                goto L_0x002b
            L_0x0019:
                androidx.recyclerview.widget.b$a r2 = r0.f2013b
                boolean r2 = r2.f(r4)
                if (r2 == 0) goto L_0x0024
                r0.l(r1)
            L_0x0024:
                androidx.recyclerview.widget.b$b r0 = r0.f2012a
                androidx.recyclerview.widget.v r0 = (androidx.recyclerview.widget.v) r0
                r0.b(r4)
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.h0(int):void");
        }

        public void i(int i10, int i11, w wVar, c cVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
            if (r10 == false) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean i0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.D()
                int r1 = r8.F()
                int r2 = r8.f1878n
                int r3 = r8.E()
                int r2 = r2 - r3
                int r3 = r8.f1879o
                int r4 = r8.C()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.B()
                r7 = 1
                if (r3 != r7) goto L_0x005c
                if (r2 == 0) goto L_0x0057
                goto L_0x0064
            L_0x0057:
                int r2 = java.lang.Math.max(r6, r10)
                goto L_0x0064
            L_0x005c:
                if (r6 == 0) goto L_0x005f
                goto L_0x0063
            L_0x005f:
                int r6 = java.lang.Math.min(r4, r2)
            L_0x0063:
                r2 = r6
            L_0x0064:
                if (r1 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                int r1 = java.lang.Math.min(r5, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00ab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L_0x0074
                goto L_0x00a8
            L_0x0074:
                int r11 = r8.D()
                int r13 = r8.F()
                int r3 = r8.f1878n
                int r4 = r8.E()
                int r3 = r3 - r4
                int r4 = r8.f1879o
                int r5 = r8.C()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f1867b
                android.graphics.Rect r5 = r5.f1827h
                r8.z(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L_0x00a8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L_0x00a8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L_0x00a8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto L_0x00a6
                goto L_0x00a8
            L_0x00a6:
                r10 = r7
                goto L_0x00a9
            L_0x00a8:
                r10 = r0
            L_0x00a9:
                if (r10 == 0) goto L_0x00b0
            L_0x00ab:
                if (r2 != 0) goto L_0x00b1
                if (r1 == 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                return r0
            L_0x00b1:
                if (r12 == 0) goto L_0x00b7
                r9.scrollBy(r2, r1)
                goto L_0x00ba
            L_0x00b7:
                r9.b0(r2, r1, r0)
            L_0x00ba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.i0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void j(int i10, c cVar) {
        }

        public final void j0() {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int k(w wVar) {
            return 0;
        }

        public int k0(int i10, r rVar, w wVar) {
            return 0;
        }

        public int l(w wVar) {
            return 0;
        }

        public void l0(int i10) {
        }

        public int m(w wVar) {
            return 0;
        }

        public int m0(int i10, r rVar, w wVar) {
            return 0;
        }

        public int n(w wVar) {
            return 0;
        }

        public final void n0(RecyclerView recyclerView) {
            o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int o(w wVar) {
            return 0;
        }

        public final void o0(int i10, int i11) {
            this.f1878n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f1876l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.G0;
            }
            this.f1879o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f1877m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.G0;
            }
        }

        public int p(w wVar) {
            return 0;
        }

        public void p0(Rect rect, int i10, int i11) {
            int E = E() + D() + rect.width();
            int C = C() + F() + rect.height();
            RecyclerView recyclerView = this.f1867b;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            this.f1867b.setMeasuredDimension(h(i10, E, y.d.e(recyclerView)), h(i11, C, y.d.d(this.f1867b)));
        }

        public final void q(r rVar) {
            int w = w();
            while (true) {
                w--;
                if (w >= 0) {
                    View v10 = v(w);
                    z I = RecyclerView.I(v10);
                    if (!I.o()) {
                        if (!I.g() || I.i() || this.f1867b.k.f1856b) {
                            v(w);
                            this.f1866a.c(w);
                            rVar.i(v10);
                            this.f1867b.f1825f.d(I);
                        } else {
                            h0(w);
                            rVar.h(I);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void q0(int i10, int i11) {
            int w = w();
            if (w == 0) {
                this.f1867b.n(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < w; i16++) {
                View v10 = v(i16);
                Rect rect = this.f1867b.f1827h;
                z(v10, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f1867b.f1827h.set(i13, i14, i12, i15);
            p0(this.f1867b.f1827h, i10, i11);
        }

        public View r(int i10) {
            int w = w();
            for (int i11 = 0; i11 < w; i11++) {
                View v10 = v(i11);
                z I = RecyclerView.I(v10);
                if (I != null && I.c() == i10 && !I.o() && (this.f1867b.f1837q0.f1927g || !I.i())) {
                    return v10;
                }
            }
            return null;
        }

        public final void r0(RecyclerView recyclerView) {
            int i10;
            if (recyclerView == null) {
                this.f1867b = null;
                this.f1866a = null;
                i10 = 0;
                this.f1878n = 0;
            } else {
                this.f1867b = recyclerView;
                this.f1866a = recyclerView.f1824e;
                this.f1878n = recyclerView.getWidth();
                i10 = recyclerView.getHeight();
            }
            this.f1879o = i10;
            this.f1876l = 1073741824;
            this.f1877m = 1073741824;
        }

        public abstract m s();

        public final boolean s0(View view, int i10, int i11, m mVar) {
            return view.isLayoutRequested() || !this.f1873h || !L(view.getWidth(), i10, mVar.width) || !L(view.getHeight(), i11, mVar.height);
        }

        public m t(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public boolean t0() {
            return false;
        }

        public m u(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public final boolean u0(View view, int i10, int i11, m mVar) {
            return !this.f1873h || !L(view.getMeasuredWidth(), i10, mVar.width) || !L(view.getMeasuredHeight(), i11, mVar.height);
        }

        public final View v(int i10) {
            b bVar = this.f1866a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public void v0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int w() {
            b bVar = this.f1866a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void w0(o oVar) {
            v vVar = this.f1870e;
            if (!(vVar == null || oVar == vVar || !vVar.f1910e)) {
                vVar.d();
            }
            this.f1870e = oVar;
            RecyclerView recyclerView = this.f1867b;
            y yVar = recyclerView.W;
            RecyclerView.this.removeCallbacks(yVar);
            yVar.f1936c.abortAnimation();
            if (oVar.f1913h) {
                StringBuilder g10 = androidx.activity.f.g("An instance of ");
                g10.append(oVar.getClass().getSimpleName());
                g10.append(" was started more than once. Each instance of");
                g10.append(oVar.getClass().getSimpleName());
                g10.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", g10.toString());
            }
            oVar.f1907b = recyclerView;
            oVar.f1908c = this;
            int i10 = oVar.f1906a;
            if (i10 != -1) {
                recyclerView.f1837q0.f1921a = i10;
                oVar.f1910e = true;
                oVar.f1909d = true;
                oVar.f1911f = recyclerView.f1830l.r(i10);
                oVar.f1907b.W.a();
                oVar.f1913h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean x0() {
            return false;
        }

        public int y(r rVar, w wVar) {
            RecyclerView recyclerView = this.f1867b;
            if (recyclerView == null || recyclerView.k == null || !e()) {
                return 1;
            }
            return this.f1867b.k.a();
        }

        public void z(View view, Rect rect) {
            int[] iArr = RecyclerView.G0;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.f1887b;
            rect.set((view.getLeft() - rect2.left) - mVar.leftMargin, (view.getTop() - rect2.top) - mVar.topMargin, view.getRight() + rect2.right + mVar.rightMargin, view.getBottom() + rect2.bottom + mVar.bottomMargin);
        }
    }

    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public z f1886a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1887b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1888c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1889d = false;

        public m(int i10, int i11) {
            super(i10, i11);
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public m(m mVar) {
            super(mVar);
        }

        public final int a() {
            return this.f1886a.c();
        }

        public final boolean b() {
            return (this.f1886a.f1951j & 2) != 0;
        }

        public final boolean c() {
            return this.f1886a.i();
        }
    }

    public static abstract class n {
    }

    public interface o {
        boolean a(MotionEvent motionEvent);

        void b();

        void onTouchEvent(MotionEvent motionEvent);
    }

    public static abstract class p {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class q {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f1890a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1891b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<z> f1892a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f1893b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1894c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f1895d = 0;
        }

        public final a a(int i10) {
            a aVar = this.f1890a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f1890a.put(i10, aVar2);
            return aVar2;
        }
    }

    public final class r {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<z> f1896a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<z> f1897b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<z> f1898c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<z> f1899d;

        /* renamed from: e  reason: collision with root package name */
        public int f1900e;

        /* renamed from: f  reason: collision with root package name */
        public int f1901f;

        /* renamed from: g  reason: collision with root package name */
        public q f1902g;

        public r() {
            ArrayList<z> arrayList = new ArrayList<>();
            this.f1896a = arrayList;
            this.f1899d = Collections.unmodifiableList(arrayList);
            this.f1900e = 2;
            this.f1901f = 2;
        }

        public final void a(z zVar, boolean z9) {
            h0.a aVar;
            RecyclerView.j(zVar);
            View view = zVar.f1942a;
            x xVar = RecyclerView.this.f1848x0;
            if (xVar != null) {
                x.a aVar2 = xVar.f2149e;
                if (aVar2 instanceof x.a) {
                    aVar = (h0.a) aVar2.f2151e.remove(view);
                } else {
                    aVar = null;
                }
                h0.y.n(view, aVar);
            }
            if (z9) {
                RecyclerView.this.getClass();
                d dVar = RecyclerView.this.k;
                if (dVar != null) {
                    dVar.f(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f1837q0 != null) {
                    recyclerView.f1825f.e(zVar);
                }
            }
            zVar.f1958r = null;
            q c10 = c();
            c10.getClass();
            int i10 = zVar.f1947f;
            ArrayList<z> arrayList = c10.a(i10).f1892a;
            if (c10.f1890a.get(i10).f1893b > arrayList.size()) {
                zVar.m();
                arrayList.add(zVar);
            }
        }

        public final int b(int i10) {
            if (i10 < 0 || i10 >= RecyclerView.this.f1837q0.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i10);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f1837q0.b());
                throw new IndexOutOfBoundsException(androidx.activity.f.e(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f1837q0.f1927g) {
                return i10;
            }
            return recyclerView.f1823d.f(i10, 0);
        }

        public final q c() {
            if (this.f1902g == null) {
                this.f1902g = new q();
            }
            return this.f1902g;
        }

        public final View d(int i10) {
            return j(i10, Long.MAX_VALUE).f1942a;
        }

        public final void e() {
            for (int size = this.f1898c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f1898c.clear();
            int[] iArr = RecyclerView.G0;
            m.b bVar = RecyclerView.this.p0;
            int[] iArr2 = bVar.f2116c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2117d = 0;
        }

        public final void f(int i10) {
            a(this.f1898c.get(i10), true);
            this.f1898c.remove(i10);
        }

        public final void g(View view) {
            z I = RecyclerView.I(view);
            if (I.k()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (I.j()) {
                I.f1954n.k(I);
            } else if (I.p()) {
                I.f1951j &= -33;
            }
            h(I);
            if (RecyclerView.this.H != null && !I.h()) {
                RecyclerView.this.H.e(I);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(androidx.recyclerview.widget.RecyclerView.z r10) {
            /*
                r9 = this;
                boolean r0 = r10.j()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x00f8
                android.view.View r0 = r10.f1942a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00f8
            L_0x0012:
                boolean r0 = r10.k()
                if (r0 != 0) goto L_0x00df
                boolean r0 = r10.o()
                if (r0 != 0) goto L_0x00cd
                int r0 = r10.f1951j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r10.f1942a
                java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
                boolean r0 = h0.y.d.i(r0)
                if (r0 == 0) goto L_0x0030
                r0 = r1
                goto L_0x0031
            L_0x0030:
                r0 = r2
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r3 = r3.k
                boolean r3 = r10.h()
                if (r3 == 0) goto L_0x00bb
                int r3 = r9.f1901f
                if (r3 <= 0) goto L_0x00b1
                int r3 = r10.f1951j
                r3 = r3 & 526(0x20e, float:7.37E-43)
                if (r3 == 0) goto L_0x0047
                r3 = r1
                goto L_0x0048
            L_0x0047:
                r3 = r2
            L_0x0048:
                if (r3 != 0) goto L_0x00b1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r9.f1898c
                int r3 = r3.size()
                int r4 = r9.f1901f
                if (r3 < r4) goto L_0x005b
                if (r3 <= 0) goto L_0x005b
                r9.f(r2)
                int r3 = r3 + -1
            L_0x005b:
                int[] r4 = androidx.recyclerview.widget.RecyclerView.G0
                if (r3 <= 0) goto L_0x00aa
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.m$b r4 = r4.p0
                int r5 = r10.f1944c
                int[] r6 = r4.f2116c
                if (r6 == 0) goto L_0x007b
                int r6 = r4.f2117d
                int r6 = r6 * 2
                r7 = r2
            L_0x006e:
                if (r7 >= r6) goto L_0x007b
                int[] r8 = r4.f2116c
                r8 = r8[r7]
                if (r8 != r5) goto L_0x0078
                r4 = r1
                goto L_0x007c
            L_0x0078:
                int r7 = r7 + 2
                goto L_0x006e
            L_0x007b:
                r4 = r2
            L_0x007c:
                if (r4 != 0) goto L_0x00aa
            L_0x007e:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x00a9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r9.f1898c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r4 = (androidx.recyclerview.widget.RecyclerView.z) r4
                int r4 = r4.f1944c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.m$b r5 = r5.p0
                int[] r6 = r5.f2116c
                if (r6 == 0) goto L_0x00a6
                int r6 = r5.f2117d
                int r6 = r6 * 2
                r7 = r2
            L_0x0099:
                if (r7 >= r6) goto L_0x00a6
                int[] r8 = r5.f2116c
                r8 = r8[r7]
                if (r8 != r4) goto L_0x00a3
                r4 = r1
                goto L_0x00a7
            L_0x00a3:
                int r7 = r7 + 2
                goto L_0x0099
            L_0x00a6:
                r4 = r2
            L_0x00a7:
                if (r4 != 0) goto L_0x007e
            L_0x00a9:
                int r3 = r3 + r1
            L_0x00aa:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r4 = r9.f1898c
                r4.add(r3, r10)
                r3 = r1
                goto L_0x00b2
            L_0x00b1:
                r3 = r2
            L_0x00b2:
                if (r3 != 0) goto L_0x00b8
                r9.a(r10, r1)
                goto L_0x00b9
            L_0x00b8:
                r1 = r2
            L_0x00b9:
                r2 = r3
                goto L_0x00bc
            L_0x00bb:
                r1 = r2
            L_0x00bc:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c0 r3 = r3.f1825f
                r3.e(r10)
                if (r2 != 0) goto L_0x00cc
                if (r1 != 0) goto L_0x00cc
                if (r0 == 0) goto L_0x00cc
                r0 = 0
                r10.f1958r = r0
            L_0x00cc:
                return
            L_0x00cd:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.activity.f.e(r1, r0)
                r10.<init>(r0)
                throw r10
            L_0x00df:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r10)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = androidx.activity.f.e(r10, r1)
                r0.<init>(r10)
                throw r0
            L_0x00f8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
                boolean r4 = r10.j()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r10 = r10.f1942a
                android.view.ViewParent r10 = r10.getParent()
                if (r10 == 0) goto L_0x0115
                goto L_0x0116
            L_0x0115:
                r1 = r2
            L_0x0116:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = androidx.activity.f.e(r10, r3)
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.h(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$z r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
                int r0 = r5.f1951j
                r1 = r0 & 12
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x000e
                r1 = r2
                goto L_0x000f
            L_0x000e:
                r1 = r3
            L_0x000f:
                if (r1 != 0) goto L_0x005b
                r0 = r0 & 2
                if (r0 == 0) goto L_0x0017
                r0 = r2
                goto L_0x0018
            L_0x0017:
                r0 = r3
            L_0x0018:
                if (r0 == 0) goto L_0x005b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r0 = r0.H
                if (r0 == 0) goto L_0x0045
                java.util.List r1 = r5.d()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x003f
                boolean r0 = r0.f2152g
                if (r0 == 0) goto L_0x0039
                boolean r0 = r5.g()
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = r3
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = r3
                goto L_0x0040
            L_0x003f:
                r0 = r2
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r0 = r3
                goto L_0x0046
            L_0x0045:
                r0 = r2
            L_0x0046:
                if (r0 == 0) goto L_0x0049
                goto L_0x005b
            L_0x0049:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1897b
                if (r0 != 0) goto L_0x0054
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1897b = r0
            L_0x0054:
                r5.f1954n = r4
                r5.f1955o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1897b
                goto L_0x0088
            L_0x005b:
                boolean r0 = r5.g()
                if (r0 == 0) goto L_0x0082
                boolean r0 = r5.i()
                if (r0 != 0) goto L_0x0082
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.k
                boolean r0 = r0.f1856b
                if (r0 == 0) goto L_0x0070
                goto L_0x0082
            L_0x0070:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.activity.f.e(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x0082:
                r5.f1954n = r4
                r5.f1955o = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1896a
            L_0x0088:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.i(android.view.View):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:152:0x02fb, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x045d, code lost:
            if (r7.g() == false) goto L_0x0493;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0491, code lost:
            if ((r11 == 0 || r11 + r9 < r21) == false) goto L_0x0493;
         */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x033b  */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x0401  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x0445  */
        /* JADX WARNING: Removed duplicated region for block: B:217:0x0448  */
        /* JADX WARNING: Removed duplicated region for block: B:280:0x0566  */
        /* JADX WARNING: Removed duplicated region for block: B:281:0x056d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.z j(int r20, long r21) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                if (r0 < 0) goto L_0x058f
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f1837q0
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x058f
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f1837q0
                boolean r2 = r2.f1927g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r1.f1897b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = r5
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1897b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.z) r7
                boolean r8 = r7.p()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.c()
                if (r8 != r0) goto L_0x0042
                r7.b(r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r6.k
                boolean r7 = r7.f1856b
                if (r7 == 0) goto L_0x0086
                androidx.recyclerview.widget.a r6 = r6.f1823d
                int r6 = r6.f(r0, r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.k
                int r7 = r7.a()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.k
                long r6 = r7.b(r6)
                r8 = r5
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1897b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.z) r9
                boolean r10 = r9.p()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f1946e
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x0083
                r9.b(r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = r5
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x0245
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1896a
                int r7 = r7.size()
                r8 = r5
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1896a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.z) r9
                boolean r10 = r9.p()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.c()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.g()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r10 = r10.f1837q0
                boolean r10 = r10.f1927g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.i()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.b(r3)
                goto L_0x01b0
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r7 = r7.f1824e
                java.util.ArrayList r8 = r7.f2014c
                int r8 = r8.size()
                r9 = r5
            L_0x00d4:
                if (r9 >= r8) goto L_0x00ff
                java.util.ArrayList r10 = r7.f2014c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.b$b r11 = r7.f2012a
                androidx.recyclerview.widget.v r11 = (androidx.recyclerview.widget.v) r11
                r11.getClass()
                androidx.recyclerview.widget.RecyclerView$z r11 = androidx.recyclerview.widget.RecyclerView.I(r10)
                int r12 = r11.c()
                if (r12 != r0) goto L_0x00fc
                boolean r12 = r11.g()
                if (r12 != 0) goto L_0x00fc
                boolean r11 = r11.i()
                if (r11 != 0) goto L_0x00fc
                goto L_0x0100
            L_0x00fc:
                int r9 = r9 + 1
                goto L_0x00d4
            L_0x00ff:
                r10 = r4
            L_0x0100:
                if (r10 == 0) goto L_0x0188
                androidx.recyclerview.widget.RecyclerView$z r7 = androidx.recyclerview.widget.RecyclerView.I(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r8 = r8.f1824e
                androidx.recyclerview.widget.b$b r9 = r8.f2012a
                androidx.recyclerview.widget.v r9 = (androidx.recyclerview.widget.v) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f2146a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0171
                androidx.recyclerview.widget.b$a r11 = r8.f2013b
                boolean r11 = r11.d(r9)
                if (r11 == 0) goto L_0x015a
                androidx.recyclerview.widget.b$a r11 = r8.f2013b
                r11.a(r9)
                r8.l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r8 = r8.f1824e
                int r8 = r8.j(r10)
                if (r8 == r6) goto L_0x0141
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r9 = r9.f1824e
                r9.c(r8)
                r1.i(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.b(r8)
                goto L_0x01b6
            L_0x0141:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.activity.f.e(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015a:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0171:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0188:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1898c
                int r7 = r7.size()
                r8 = r5
            L_0x018f:
                if (r8 >= r7) goto L_0x01b5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1898c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.z) r9
                boolean r10 = r9.g()
                if (r10 != 0) goto L_0x01b2
                int r10 = r9.c()
                if (r10 != r0) goto L_0x01b2
                boolean r10 = r9.e()
                if (r10 != 0) goto L_0x01b2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1898c
                r7.remove(r8)
            L_0x01b0:
                r7 = r9
                goto L_0x01b6
            L_0x01b2:
                int r8 = r8 + 1
                goto L_0x018f
            L_0x01b5:
                r7 = r4
            L_0x01b6:
                if (r7 == 0) goto L_0x0245
                boolean r8 = r7.i()
                if (r8 == 0) goto L_0x01c5
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.f1837q0
                boolean r8 = r8.f1927g
                goto L_0x0200
            L_0x01c5:
                int r8 = r7.f1944c
                if (r8 < 0) goto L_0x022c
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r9 = r9.k
                int r9 = r9.a()
                if (r8 >= r9) goto L_0x022c
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r9 = r8.f1837q0
                boolean r9 = r9.f1927g
                if (r9 != 0) goto L_0x01e8
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.k
                int r9 = r7.f1944c
                int r8 = r8.c(r9)
                int r9 = r7.f1947f
                if (r8 == r9) goto L_0x01e8
                goto L_0x01fd
            L_0x01e8:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.k
                boolean r9 = r8.f1856b
                if (r9 == 0) goto L_0x01ff
                long r9 = r7.f1946e
                int r11 = r7.f1944c
                long r11 = r8.b(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fd
                goto L_0x01ff
            L_0x01fd:
                r8 = r5
                goto L_0x0200
            L_0x01ff:
                r8 = 1
            L_0x0200:
                if (r8 != 0) goto L_0x022a
                r8 = 4
                r7.b(r8)
                boolean r8 = r7.j()
                if (r8 == 0) goto L_0x0219
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f1942a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$r r8 = r7.f1954n
                r8.k(r7)
                goto L_0x0225
            L_0x0219:
                boolean r8 = r7.p()
                if (r8 == 0) goto L_0x0225
                int r8 = r7.f1951j
                r8 = r8 & -33
                r7.f1951j = r8
            L_0x0225:
                r1.h(r7)
                r7 = r4
                goto L_0x0245
            L_0x022a:
                r2 = 1
                goto L_0x0245
            L_0x022c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.activity.f.e(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0245:
                if (r7 != 0) goto L_0x03ff
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r10 = r10.f1823d
                int r10 = r10.f(r0, r5)
                if (r10 < 0) goto L_0x03ce
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r11 = r11.k
                int r11 = r11.a()
                if (r10 >= r11) goto L_0x03ce
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r11 = r11.k
                int r11 = r11.c(r10)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.k
                boolean r13 = r12.f1856b
                if (r13 == 0) goto L_0x0301
                long r12 = r12.b(r10)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1896a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0276:
                if (r7 < 0) goto L_0x02cd
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r14 = r1.f1896a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.z) r14
                long r8 = r14.f1946e
                int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r8 != 0) goto L_0x02ca
                boolean r8 = r14.p()
                if (r8 != 0) goto L_0x02ca
                int r8 = r14.f1947f
                if (r11 != r8) goto L_0x02ab
                r14.b(r3)
                boolean r3 = r14.i()
                if (r3 == 0) goto L_0x02a9
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1837q0
                boolean r3 = r3.f1927g
                if (r3 != 0) goto L_0x02a9
                int r3 = r14.f1951j
                r3 = r3 & -15
                r3 = r3 | 2
                r14.f1951j = r3
            L_0x02a9:
                r7 = r14
                goto L_0x02fc
            L_0x02ab:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r8 = r1.f1896a
                r8.remove(r7)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r14.f1942a
                r8.removeDetachedView(r9, r5)
                android.view.View r8 = r14.f1942a
                androidx.recyclerview.widget.RecyclerView$z r8 = androidx.recyclerview.widget.RecyclerView.I(r8)
                r8.f1954n = r4
                r8.f1955o = r5
                int r9 = r8.f1951j
                r9 = r9 & -33
                r8.f1951j = r9
                r1.h(r8)
            L_0x02ca:
                int r7 = r7 + -1
                goto L_0x0276
            L_0x02cd:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f1898c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02d4:
                if (r3 < 0) goto L_0x02fb
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1898c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.z) r7
                long r8 = r7.f1946e
                int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r8 != 0) goto L_0x02f8
                boolean r8 = r7.e()
                if (r8 != 0) goto L_0x02f8
                int r8 = r7.f1947f
                if (r11 != r8) goto L_0x02f4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r8 = r1.f1898c
                r8.remove(r3)
                goto L_0x02fc
            L_0x02f4:
                r1.f(r3)
                goto L_0x02fb
            L_0x02f8:
                int r3 = r3 + -1
                goto L_0x02d4
            L_0x02fb:
                r7 = r4
            L_0x02fc:
                if (r7 == 0) goto L_0x0301
                r7.f1944c = r10
                r2 = 1
            L_0x0301:
                if (r7 != 0) goto L_0x0341
                androidx.recyclerview.widget.RecyclerView$q r3 = r19.c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r3 = r3.f1890a
                java.lang.Object r3 = r3.get(r11)
                androidx.recyclerview.widget.RecyclerView$q$a r3 = (androidx.recyclerview.widget.RecyclerView.q.a) r3
                if (r3 == 0) goto L_0x0338
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r3.f1892a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0338
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r3.f1892a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x0320:
                if (r7 < 0) goto L_0x0338
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r6 = (androidx.recyclerview.widget.RecyclerView.z) r6
                boolean r6 = r6.e()
                if (r6 != 0) goto L_0x0335
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.z) r3
                goto L_0x0339
            L_0x0335:
                int r7 = r7 + -1
                goto L_0x0320
            L_0x0338:
                r3 = r4
            L_0x0339:
                if (r3 == 0) goto L_0x0340
                r3.m()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.G0
            L_0x0340:
                r7 = r3
            L_0x0341:
                if (r7 != 0) goto L_0x03ff
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
                if (r3 == 0) goto L_0x036c
                androidx.recyclerview.widget.RecyclerView$q r3 = r1.f1902g
                androidx.recyclerview.widget.RecyclerView$q$a r3 = r3.a(r11)
                long r8 = r3.f1894c
                r12 = 0
                int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r3 == 0) goto L_0x0368
                long r8 = r8 + r6
                int r3 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
                if (r3 >= 0) goto L_0x0366
                goto L_0x0368
            L_0x0366:
                r3 = r5
                goto L_0x0369
            L_0x0368:
                r3 = 1
            L_0x0369:
                if (r3 != 0) goto L_0x036c
                return r4
            L_0x036c:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r8 = r3.k
                r8.getClass()
                java.lang.String r9 = "RV CreateView"
                int r10 = d0.i.f6035a     // Catch:{ all -> 0x03c7 }
                d0.i.a.a(r9)     // Catch:{ all -> 0x03c7 }
                androidx.recyclerview.widget.RecyclerView$z r3 = r8.e(r3, r11)     // Catch:{ all -> 0x03c7 }
                android.view.View r8 = r3.f1942a     // Catch:{ all -> 0x03c7 }
                android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x03c7 }
                if (r8 != 0) goto L_0x03bf
                r3.f1947f = r11     // Catch:{ all -> 0x03c7 }
                d0.i.a.b()
                int[] r8 = androidx.recyclerview.widget.RecyclerView.G0
                android.view.View r8 = r3.f1942a
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.D(r8)
                if (r8 == 0) goto L_0x039c
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r8)
                r3.f1943b = r9
            L_0x039c:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                long r8 = r8.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r10 = r1.f1902g
                long r8 = r8 - r6
                androidx.recyclerview.widget.RecyclerView$q$a r6 = r10.a(r11)
                long r10 = r6.f1894c
                r12 = 0
                int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r7 != 0) goto L_0x03b2
                goto L_0x03bb
            L_0x03b2:
                r12 = 4
                long r10 = r10 / r12
                r17 = 3
                long r10 = r10 * r17
                long r8 = r8 / r12
                long r8 = r8 + r10
            L_0x03bb:
                r6.f1894c = r8
                r7 = r3
                goto L_0x03ff
            L_0x03bf:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03c7 }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03c7 }
                throw r0     // Catch:{ all -> 0x03c7 }
            L_0x03c7:
                r0 = move-exception
                int r2 = d0.i.f6035a
                d0.i.a.b()
                throw r0
            L_0x03ce:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r10)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f1837q0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.activity.f.e(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x03ff:
                if (r2 == 0) goto L_0x0437
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1837q0
                boolean r6 = r3.f1927g
                if (r6 != 0) goto L_0x0437
                int r6 = r7.f1951j
                r8 = r6 & 8192(0x2000, float:1.14794E-41)
                if (r8 == 0) goto L_0x0411
                r8 = 1
                goto L_0x0412
            L_0x0411:
                r8 = r5
            L_0x0412:
                if (r8 == 0) goto L_0x0437
                r6 = r6 & -8193(0xffffffffffffdfff, float:NaN)
                r6 = r6 | r5
                r7.f1951j = r6
                boolean r3 = r3.f1930j
                if (r3 == 0) goto L_0x0437
                androidx.recyclerview.widget.RecyclerView.i.b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r3 = r3.H
                r7.d()
                r3.getClass()
                androidx.recyclerview.widget.RecyclerView$i$c r3 = new androidx.recyclerview.widget.RecyclerView$i$c
                r3.<init>()
                r3.a(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.U(r7, r3)
            L_0x0437:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1837q0
                boolean r3 = r3.f1927g
                if (r3 == 0) goto L_0x0448
                boolean r3 = r7.f()
                if (r3 == 0) goto L_0x0448
                r7.f1948g = r0
                goto L_0x0493
            L_0x0448:
                boolean r3 = r7.f()
                if (r3 == 0) goto L_0x045f
                int r3 = r7.f1951j
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0456
                r3 = 1
                goto L_0x0457
            L_0x0456:
                r3 = r5
            L_0x0457:
                if (r3 != 0) goto L_0x045f
                boolean r3 = r7.g()
                if (r3 == 0) goto L_0x0493
            L_0x045f:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f1823d
                int r3 = r3.f(r0, r5)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r7.f1958r = r6
                int r8 = r7.f1947f
                long r9 = r6.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0497
                androidx.recyclerview.widget.RecyclerView$q r6 = r1.f1902g
                androidx.recyclerview.widget.RecyclerView$q$a r6 = r6.a(r8)
                long r11 = r6.f1895d
                r13 = 0
                int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r6 == 0) goto L_0x0490
                long r11 = r11 + r9
                int r6 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r6 >= 0) goto L_0x048e
                goto L_0x0490
            L_0x048e:
                r6 = r5
                goto L_0x0491
            L_0x0490:
                r6 = 1
            L_0x0491:
                if (r6 != 0) goto L_0x0497
            L_0x0493:
                r0 = 1
                r3 = r5
                goto L_0x055e
            L_0x0497:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r6 = r6.k
                r6.getClass()
                r7.f1944c = r3
                boolean r8 = r6.f1856b
                if (r8 == 0) goto L_0x04aa
                long r11 = r6.b(r3)
                r7.f1946e = r11
            L_0x04aa:
                int r8 = r7.f1951j
                r8 = r8 & -520(0xfffffffffffffdf8, float:NaN)
                r8 = r8 | 1
                r7.f1951j = r8
                int r8 = d0.i.f6035a
                java.lang.String r8 = "RV OnBindView"
                d0.i.a.a(r8)
                r7.d()
                r6.d(r7, r3)
                java.util.ArrayList r3 = r7.k
                if (r3 == 0) goto L_0x04c6
                r3.clear()
            L_0x04c6:
                int r3 = r7.f1951j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f1951j = r3
                android.view.View r3 = r7.f1942a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r6 = r3 instanceof androidx.recyclerview.widget.RecyclerView.m
                if (r6 == 0) goto L_0x04db
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                r6 = 1
                r3.f1888c = r6
            L_0x04db:
                d0.i.a.b()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r3 = r1.f1902g
                int r6 = r7.f1947f
                long r11 = r11 - r9
                androidx.recyclerview.widget.RecyclerView$q$a r3 = r3.a(r6)
                long r8 = r3.f1895d
                r13 = 0
                int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r6 != 0) goto L_0x04f6
                goto L_0x04fe
            L_0x04f6:
                r13 = 4
                long r8 = r8 / r13
                r15 = 3
                long r8 = r8 * r15
                long r11 = r11 / r13
                long r11 = r11 + r8
            L_0x04fe:
                r3.f1895d = r11
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.f1847x
                if (r3 == 0) goto L_0x050e
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x050e
                r3 = 1
                goto L_0x050f
            L_0x050e:
                r3 = r5
            L_0x050f:
                if (r3 == 0) goto L_0x0552
                android.view.View r3 = r7.f1942a
                java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
                int r6 = h0.y.d.c(r3)
                r8 = 1
                if (r6 != 0) goto L_0x051f
                h0.y.d.s(r3, r8)
            L_0x051f:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.x r6 = r6.f1848x0
                if (r6 != 0) goto L_0x0526
                goto L_0x0550
            L_0x0526:
                androidx.recyclerview.widget.x$a r6 = r6.f2149e
                boolean r9 = r6 instanceof androidx.recyclerview.widget.x.a
                if (r9 == 0) goto L_0x054d
                r6.getClass()
                android.view.View$AccessibilityDelegate r9 = h0.y.d(r3)
                if (r9 != 0) goto L_0x0536
                goto L_0x0544
            L_0x0536:
                boolean r4 = r9 instanceof h0.a.C0089a
                if (r4 == 0) goto L_0x053f
                h0.a$a r9 = (h0.a.C0089a) r9
                h0.a r4 = r9.f6679a
                goto L_0x0544
            L_0x053f:
                h0.a r4 = new h0.a
                r4.<init>(r9)
            L_0x0544:
                if (r4 == 0) goto L_0x054d
                if (r4 == r6) goto L_0x054d
                java.util.WeakHashMap r9 = r6.f2151e
                r9.put(r3, r4)
            L_0x054d:
                h0.y.n(r3, r6)
            L_0x0550:
                r3 = r8
                goto L_0x0553
            L_0x0552:
                r3 = 1
            L_0x0553:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r4 = r4.f1837q0
                boolean r4 = r4.f1927g
                if (r4 == 0) goto L_0x055d
                r7.f1948g = r0
            L_0x055d:
                r0 = r3
            L_0x055e:
                android.view.View r4 = r7.f1942a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x056d
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                goto L_0x057b
            L_0x056d:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                boolean r6 = r6.checkLayoutParams(r4)
                if (r6 != 0) goto L_0x0583
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r4)
            L_0x057b:
                androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.m) r4
                android.view.View r6 = r7.f1942a
                r6.setLayoutParams(r4)
                goto L_0x0585
            L_0x0583:
                androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.m) r4
            L_0x0585:
                r4.f1886a = r7
                if (r2 == 0) goto L_0x058c
                if (r3 == 0) goto L_0x058c
                r5 = r0
            L_0x058c:
                r4.f1889d = r5
                return r7
            L_0x058f:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f1837q0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.activity.f.e(r0, r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.j(int, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        public final void k(z zVar) {
            (zVar.f1955o ? this.f1897b : this.f1896a).remove(zVar);
            zVar.f1954n = null;
            zVar.f1955o = false;
            zVar.f1951j &= -33;
        }

        public final void l() {
            l lVar = RecyclerView.this.f1830l;
            this.f1901f = this.f1900e + (lVar != null ? lVar.f1875j : 0);
            for (int size = this.f1898c.size() - 1; size >= 0 && this.f1898c.size() > this.f1901f; size--) {
                f(size);
            }
        }
    }

    public interface s {
        void a();
    }

    public class t extends f {
        public t() {
        }

        public final void a() {
            RecyclerView.this.i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1837q0.f1926f = true;
            recyclerView.T(true);
            if (!RecyclerView.this.f1823d.g()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    public static class u extends n0.a {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f1905c;

        public static class a implements Parcelable.ClassLoaderCreator<u> {
            public final Object createFromParcel(Parcel parcel) {
                return new u(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new u[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new u(parcel, classLoader);
            }
        }

        public u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1905c = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public u(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeParcelable(this.f1905c, 0);
        }
    }

    public static abstract class v {

        /* renamed from: a  reason: collision with root package name */
        public int f1906a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1907b;

        /* renamed from: c  reason: collision with root package name */
        public l f1908c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1909d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1910e;

        /* renamed from: f  reason: collision with root package name */
        public View f1911f;

        /* renamed from: g  reason: collision with root package name */
        public final a f1912g = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f1913h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f1914a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f1915b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f1916c = Integer.MIN_VALUE;

            /* renamed from: d  reason: collision with root package name */
            public int f1917d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f1918e = null;

            /* renamed from: f  reason: collision with root package name */
            public boolean f1919f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f1920g = 0;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f1917d;
                if (i10 >= 0) {
                    this.f1917d = -1;
                    recyclerView.L(i10);
                    this.f1919f = false;
                } else if (this.f1919f) {
                    Interpolator interpolator = this.f1918e;
                    if (interpolator == null || this.f1916c >= 1) {
                        int i11 = this.f1916c;
                        if (i11 >= 1) {
                            recyclerView.W.b(this.f1914a, this.f1915b, i11, interpolator);
                            int i12 = this.f1920g + 1;
                            this.f1920g = i12;
                            if (i12 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f1919f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f1920g = 0;
                }
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            l lVar = this.f1908c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i10);
            }
            StringBuilder g10 = androidx.activity.f.g("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            g10.append(b.class.getCanonicalName());
            Log.w("RecyclerView", g10.toString());
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f1907b;
            int i12 = -1;
            if (this.f1906a == -1 || recyclerView == null) {
                d();
            }
            if (this.f1909d && this.f1911f == null && this.f1908c != null && (a10 = a(this.f1906a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.Z((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            boolean z9 = false;
            this.f1909d = false;
            View view = this.f1911f;
            if (view != null) {
                this.f1907b.getClass();
                z I = RecyclerView.I(view);
                if (I != null) {
                    i12 = I.c();
                }
                if (i12 == this.f1906a) {
                    View view2 = this.f1911f;
                    w wVar = recyclerView.f1837q0;
                    c(view2, this.f1912g);
                    this.f1912g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1911f = null;
                }
            }
            if (this.f1910e) {
                w wVar2 = recyclerView.f1837q0;
                a aVar = this.f1912g;
                o oVar = (o) this;
                if (oVar.f1907b.f1830l.w() == 0) {
                    oVar.d();
                } else {
                    int i13 = oVar.f2137o;
                    int i14 = i13 - i10;
                    if (i13 * i14 <= 0) {
                        i14 = 0;
                    }
                    oVar.f2137o = i14;
                    int i15 = oVar.f2138p;
                    int i16 = i15 - i11;
                    if (i15 * i16 <= 0) {
                        i16 = 0;
                    }
                    oVar.f2138p = i16;
                    if (i14 == 0 && i16 == 0) {
                        PointF a11 = oVar.a(oVar.f1906a);
                        if (a11 != null) {
                            float f11 = a11.x;
                            if (!(f11 == 0.0f && a11.y == 0.0f)) {
                                float f12 = a11.y;
                                float sqrt = (float) Math.sqrt((double) ((f12 * f12) + (f11 * f11)));
                                float f13 = a11.x / sqrt;
                                a11.x = f13;
                                float f14 = a11.y / sqrt;
                                a11.y = f14;
                                oVar.k = a11;
                                oVar.f2137o = (int) (f13 * 10000.0f);
                                oVar.f2138p = (int) (f14 * 10000.0f);
                                int h10 = oVar.h(10000);
                                LinearInterpolator linearInterpolator = oVar.f2132i;
                                aVar.f1914a = (int) (((float) oVar.f2137o) * 1.2f);
                                aVar.f1915b = (int) (((float) oVar.f2138p) * 1.2f);
                                aVar.f1916c = (int) (((float) h10) * 1.2f);
                                aVar.f1918e = linearInterpolator;
                                aVar.f1919f = true;
                            }
                        }
                        aVar.f1917d = oVar.f1906a;
                        oVar.d();
                    }
                }
                a aVar2 = this.f1912g;
                if (aVar2.f1917d >= 0) {
                    z9 = true;
                }
                aVar2.a(recyclerView);
                if (z9 && this.f1910e) {
                    this.f1909d = true;
                    recyclerView.W.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.f1910e) {
                this.f1910e = false;
                o oVar = (o) this;
                oVar.f2138p = 0;
                oVar.f2137o = 0;
                oVar.k = null;
                this.f1907b.f1837q0.f1921a = -1;
                this.f1911f = null;
                this.f1906a = -1;
                this.f1909d = false;
                l lVar = this.f1908c;
                if (lVar.f1870e == this) {
                    lVar.f1870e = null;
                }
                this.f1908c = null;
                this.f1907b = null;
            }
        }
    }

    public static class w {

        /* renamed from: a  reason: collision with root package name */
        public int f1921a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1922b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1923c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1924d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f1925e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1926f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1927g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1928h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1929i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1930j = false;
        public boolean k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1931l;

        /* renamed from: m  reason: collision with root package name */
        public long f1932m;

        /* renamed from: n  reason: collision with root package name */
        public int f1933n;

        public final void a(int i10) {
            if ((this.f1924d & i10) == 0) {
                StringBuilder g10 = androidx.activity.f.g("Layout state should be one of ");
                g10.append(Integer.toBinaryString(i10));
                g10.append(" but it is ");
                g10.append(Integer.toBinaryString(this.f1924d));
                throw new IllegalStateException(g10.toString());
            }
        }

        public final int b() {
            return this.f1927g ? this.f1922b - this.f1923c : this.f1925e;
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("State{mTargetPosition=");
            g10.append(this.f1921a);
            g10.append(", mData=");
            g10.append((Object) null);
            g10.append(", mItemCount=");
            g10.append(this.f1925e);
            g10.append(", mIsMeasuring=");
            g10.append(this.f1929i);
            g10.append(", mPreviousLayoutItemCount=");
            g10.append(this.f1922b);
            g10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            g10.append(this.f1923c);
            g10.append(", mStructureChanged=");
            g10.append(this.f1926f);
            g10.append(", mInPreLayout=");
            g10.append(this.f1927g);
            g10.append(", mRunSimpleAnimations=");
            g10.append(this.f1930j);
            g10.append(", mRunPredictiveAnimations=");
            g10.append(this.k);
            g10.append('}');
            return g10.toString();
        }
    }

    public static abstract class x {
    }

    public class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f1934a;

        /* renamed from: b  reason: collision with root package name */
        public int f1935b;

        /* renamed from: c  reason: collision with root package name */
        public OverScroller f1936c;

        /* renamed from: d  reason: collision with root package name */
        public Interpolator f1937d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1938e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1939f = false;

        public y() {
            b bVar = RecyclerView.I0;
            this.f1937d = bVar;
            this.f1936c = new OverScroller(RecyclerView.this.getContext(), bVar);
        }

        public final void a() {
            if (this.f1938e) {
                this.f1939f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.d.m(recyclerView, this);
        }

        public final void b(int i10, int i11, int i12, Interpolator interpolator) {
            boolean z9;
            int i13;
            int i14;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i11 * i11) + (i10 * i10)));
                RecyclerView recyclerView = RecyclerView.this;
                if (z9) {
                    i13 = recyclerView.getWidth();
                } else {
                    i13 = recyclerView.getHeight();
                }
                int i15 = i13 / 2;
                float f10 = (float) i13;
                float f11 = (float) i15;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f10) - 0.5f) * 0.47123894f))) * f11) + f11;
                if (sqrt > 0) {
                    i14 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z9) {
                        abs = abs2;
                    }
                    i14 = (int) (((((float) abs) / f10) + 1.0f) * 300.0f);
                }
                i12 = Math.min(i14, 2000);
            }
            int i16 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.I0;
            }
            if (this.f1937d != interpolator) {
                this.f1937d = interpolator;
                this.f1936c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1935b = 0;
            this.f1934a = 0;
            RecyclerView.this.setScrollState(2);
            this.f1936c.startScroll(0, 0, i10, i11, i16);
            a();
        }

        public final void run() {
            int i10;
            int i11;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1830l == null) {
                recyclerView.removeCallbacks(this);
                this.f1936c.abortAnimation();
                return;
            }
            this.f1939f = false;
            this.f1938e = true;
            recyclerView.m();
            OverScroller overScroller = this.f1936c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f1934a;
                int i14 = currY - this.f1935b;
                this.f1934a = currX;
                this.f1935b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.C0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.r(i13, i14, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.C0;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.l(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.k != null) {
                    int[] iArr3 = recyclerView3.C0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.Z(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.C0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i13 -= i10;
                    i14 -= i11;
                    v vVar = recyclerView4.f1830l.f1870e;
                    if (vVar != null && !vVar.f1909d && vVar.f1910e) {
                        int b10 = recyclerView4.f1837q0.b();
                        if (b10 == 0) {
                            vVar.d();
                        } else {
                            if (vVar.f1906a >= b10) {
                                vVar.f1906a = b10 - 1;
                            }
                            vVar.b(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f1831m.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.C0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.s(i10, i11, i13, i14, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.C0;
                int i15 = i13 - iArr6[0];
                int i16 = i14 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.t(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.isFinished() || ((z9 || i15 != 0) && (z10 || i16 != 0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                RecyclerView recyclerView7 = RecyclerView.this;
                v vVar2 = recyclerView7.f1830l.f1870e;
                if (vVar2 == null || !vVar2.f1909d) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 || !z11) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    m mVar = recyclerView8.f1834o0;
                    if (mVar != null) {
                        mVar.a(recyclerView8, i10, i11);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else if (i15 > 0) {
                            i12 = currVelocity;
                        } else {
                            i12 = 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        if (i12 < 0) {
                            recyclerView9.v();
                            if (recyclerView9.D.isFinished()) {
                                recyclerView9.D.onAbsorb(-i12);
                            }
                        } else if (i12 > 0) {
                            recyclerView9.w();
                            if (recyclerView9.F.isFinished()) {
                                recyclerView9.F.onAbsorb(i12);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.x();
                            if (recyclerView9.E.isFinished()) {
                                recyclerView9.E.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.u();
                            if (recyclerView9.G.isFinished()) {
                                recyclerView9.G.onAbsorb(currVelocity);
                            }
                        } else {
                            recyclerView9.getClass();
                        }
                        if (!(i12 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                            y.d.k(recyclerView9);
                        }
                    }
                    m.b bVar = RecyclerView.this.p0;
                    int[] iArr7 = bVar.f2116c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    bVar.f2117d = 0;
                }
            }
            v vVar3 = RecyclerView.this.f1830l.f1870e;
            if (vVar3 != null && vVar3.f1909d) {
                vVar3.b(0, 0);
            }
            this.f1938e = false;
            if (this.f1939f) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, l0> weakHashMap2 = h0.y.f6776a;
                y.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.e0(1);
        }
    }

    public static abstract class z {

        /* renamed from: s  reason: collision with root package name */
        public static final List<Object> f1941s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1942a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f1943b;

        /* renamed from: c  reason: collision with root package name */
        public int f1944c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1945d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f1946e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1947f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1948g = -1;

        /* renamed from: h  reason: collision with root package name */
        public z f1949h = null;

        /* renamed from: i  reason: collision with root package name */
        public z f1950i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f1951j;
        public ArrayList k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f1952l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1953m = 0;

        /* renamed from: n  reason: collision with root package name */
        public r f1954n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1955o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1956p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f1957q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f1958r;

        public z(View view) {
            if (view != null) {
                this.f1942a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            } else if ((1024 & this.f1951j) == 0) {
                if (this.k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.k = arrayList;
                    this.f1952l = Collections.unmodifiableList(arrayList);
                }
                this.k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f1951j = i10 | this.f1951j;
        }

        public final int c() {
            int i10 = this.f1948g;
            return i10 == -1 ? this.f1944c : i10;
        }

        public final List<Object> d() {
            if ((this.f1951j & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0) {
                return f1941s;
            }
            ArrayList arrayList = this.k;
            return (arrayList == null || arrayList.size() == 0) ? f1941s : this.f1952l;
        }

        public final boolean e() {
            return (this.f1942a.getParent() == null || this.f1942a.getParent() == this.f1958r) ? false : true;
        }

        public final boolean f() {
            return (this.f1951j & 1) != 0;
        }

        public final boolean g() {
            return (this.f1951j & 4) != 0;
        }

        public final boolean h() {
            if ((this.f1951j & 16) == 0) {
                View view = this.f1942a;
                WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                if (!y.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i() {
            return (this.f1951j & 8) != 0;
        }

        public final boolean j() {
            return this.f1954n != null;
        }

        public final boolean k() {
            return (this.f1951j & 256) != 0;
        }

        public final void l(int i10, boolean z9) {
            if (this.f1945d == -1) {
                this.f1945d = this.f1944c;
            }
            if (this.f1948g == -1) {
                this.f1948g = this.f1944c;
            }
            if (z9) {
                this.f1948g += i10;
            }
            this.f1944c += i10;
            if (this.f1942a.getLayoutParams() != null) {
                ((m) this.f1942a.getLayoutParams()).f1888c = true;
            }
        }

        public final void m() {
            this.f1951j = 0;
            this.f1944c = -1;
            this.f1945d = -1;
            this.f1946e = -1;
            this.f1948g = -1;
            this.f1953m = 0;
            this.f1949h = null;
            this.f1950i = null;
            ArrayList arrayList = this.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f1951j &= -1025;
            this.f1956p = 0;
            this.f1957q = -1;
            RecyclerView.j(this);
        }

        public final void n(boolean z9) {
            int i10;
            int i11 = this.f1953m;
            int i12 = z9 ? i11 - 1 : i11 + 1;
            this.f1953m = i12;
            if (i12 < 0) {
                this.f1953m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z9 && i12 == 1) {
                i10 = this.f1951j | 16;
            } else if (z9 && i12 == 0) {
                i10 = this.f1951j & -17;
            } else {
                return;
            }
            this.f1951j = i10;
        }

        public final boolean o() {
            return (this.f1951j & 128) != 0;
        }

        public final boolean p() {
            return (this.f1951j & 32) != 0;
        }

        public final String toString() {
            String str;
            boolean z9;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, "{");
            h10.append(Integer.toHexString(hashCode()));
            h10.append(" position=");
            h10.append(this.f1944c);
            h10.append(" id=");
            h10.append(this.f1946e);
            h10.append(", oldPos=");
            h10.append(this.f1945d);
            h10.append(", pLpos:");
            h10.append(this.f1948g);
            StringBuilder sb = new StringBuilder(h10.toString());
            if (j()) {
                sb.append(" scrap ");
                if (this.f1955o) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (g()) {
                sb.append(" invalid");
            }
            if (!f()) {
                sb.append(" unbound");
            }
            boolean z10 = true;
            if ((this.f1951j & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                sb.append(" update");
            }
            if (i()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (k()) {
                sb.append(" tmpDetached");
            }
            if (!h()) {
                StringBuilder g10 = androidx.activity.f.g(" not recyclable(");
                g10.append(this.f1953m);
                g10.append(")");
                sb.append(g10.toString());
            }
            if ((this.f1951j & 512) == 0 && !g()) {
                z10 = false;
            }
            if (z10) {
                sb.append(" undefined adapter position");
            }
            if (this.f1942a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            G0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            H0 = r1
            androidx.recyclerview.widget.RecyclerView$b r0 = new androidx.recyclerview.widget.RecyclerView$b
            r0.<init>()
            I0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float f10;
        float f11;
        boolean z9;
        int i11;
        StringBuilder sb;
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i12 = i10;
        this.f1820a = new t();
        this.f1821b = new r();
        this.f1825f = new c0();
        this.f1827h = new Rect();
        this.f1828i = new Rect();
        this.f1829j = new RectF();
        this.f1831m = new ArrayList<>();
        this.f1832n = new ArrayList<>();
        this.f1840s = 0;
        this.f1849y = false;
        this.f1851z = false;
        this.A = 0;
        this.B = 0;
        this.C = new h();
        this.H = new k();
        this.I = 0;
        this.J = -1;
        this.T = Float.MIN_VALUE;
        this.U = Float.MIN_VALUE;
        this.V = true;
        this.W = new y();
        this.p0 = new m.b();
        this.f1837q0 = new w();
        this.f1843t0 = false;
        this.u0 = false;
        this.f1845v0 = new j();
        this.f1846w0 = false;
        char c10 = 2;
        this.f1850y0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new ArrayList();
        this.E0 = new a();
        this.F0 = new c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.P = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = g0.f6700a;
            f10 = g0.a.a(viewConfiguration);
        } else {
            f10 = g0.a(viewConfiguration, context2);
        }
        this.T = f10;
        if (i13 >= 26) {
            f11 = g0.a.b(viewConfiguration);
        } else {
            f11 = g0.a(viewConfiguration, context2);
        }
        this.U = f11;
        this.R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.S = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        setWillNotDraw(z9);
        this.H.f1857a = this.f1845v0;
        this.f1823d = new a(new w(this));
        this.f1824e = new b(new v(this));
        WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
        if (i13 >= 26) {
            i11 = y.k.b(this);
        } else {
            i11 = 0;
        }
        if (i11 == 0 && i13 >= 26) {
            y.k.l(this, 8);
        }
        if (y.d.c(this) == 0) {
            y.d.s(this, 1);
        }
        this.f1847x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new x(this));
        int[] iArr = z5.c.f13178b;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i12, 0);
        if (i13 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1826g = obtainStyledAttributes.getBoolean(1, true);
        int i14 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(androidx.activity.f.e(this, androidx.activity.f.g("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i14 = 4;
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(l.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(H0);
                        Object[] objArr2 = new Object[i14];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        noSuchMethodException = e10;
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e16);
                }
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        int[] iArr2 = G0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i12, 0);
        if (i15 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        }
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i10));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static z I(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f1886a;
    }

    private h0.m getScrollingChildHelper() {
        if (this.f1852z0 == null) {
            this.f1852z0 = new h0.m(this);
        }
        return this.f1852z0;
    }

    public static void j(z zVar) {
        Reference reference = zVar.f1943b;
        if (reference != null) {
            Object obj = reference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        zVar.f1943b = null;
                        return;
                    } else if (view != zVar.f1942a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.View):android.view.View");
    }

    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1832n.size();
        int i10 = 0;
        while (i10 < size) {
            o oVar = this.f1832n.get(i10);
            if (!oVar.a(motionEvent) || action == 3) {
                i10++;
            } else {
                this.f1833o = oVar;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int e10 = this.f1824e.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            z I2 = I(this.f1824e.d(i12));
            if (!I2.o()) {
                int c10 = I2.c();
                if (c10 < i10) {
                    i10 = c10;
                }
                if (c10 > i11) {
                    i11 = c10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final z E(int i10) {
        z zVar = null;
        if (this.f1849y) {
            return null;
        }
        int h10 = this.f1824e.h();
        for (int i11 = 0; i11 < h10; i11++) {
            z I2 = I(this.f1824e.g(i11));
            if (I2 != null && !I2.i() && F(I2) == i10) {
                if (!this.f1824e.k(I2.f1942a)) {
                    return I2;
                }
                zVar = I2;
            }
        }
        return zVar;
    }

    public final int F(z zVar) {
        boolean z9;
        if ((zVar.f1951j & IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && zVar.f()) {
            a aVar = this.f1823d;
            int i10 = zVar.f1944c;
            int size = aVar.f2000b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f2000b.get(i11);
                int i12 = bVar.f2004a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = bVar.f2005b;
                        if (i13 <= i10) {
                            int i14 = bVar.f2007d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = bVar.f2005b;
                        if (i15 == i10) {
                            i10 = bVar.f2007d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (bVar.f2007d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (bVar.f2005b <= i10) {
                    i10 += bVar.f2007d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long G(z zVar) {
        if (this.k.f1856b) {
            return zVar.f1946e;
        }
        return (long) zVar.f1944c;
    }

    public final z H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        m mVar = (m) view.getLayoutParams();
        if (!mVar.f1888c) {
            return mVar.f1887b;
        }
        if (this.f1837q0.f1927g && (mVar.b() || mVar.f1886a.g())) {
            return mVar.f1887b;
        }
        Rect rect = mVar.f1887b;
        rect.set(0, 0, 0, 0);
        int size = this.f1831m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1827h.set(0, 0, 0, 0);
            Rect rect2 = this.f1827h;
            this.f1831m.get(i10).getClass();
            ((m) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            int i11 = rect.left;
            Rect rect3 = this.f1827h;
            rect.left = i11 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        mVar.f1888c = false;
        return rect;
    }

    public final boolean K() {
        return this.A > 0;
    }

    public final void L(int i10) {
        if (this.f1830l != null) {
            setScrollState(2);
            this.f1830l.l0(i10);
            awakenScrollBars();
        }
    }

    public final void M() {
        int h10 = this.f1824e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((m) this.f1824e.g(i10).getLayoutParams()).f1888c = true;
        }
        r rVar = this.f1821b;
        int size = rVar.f1898c.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) rVar.f1898c.get(i11).f1942a.getLayoutParams();
            if (mVar != null) {
                mVar.f1888c = true;
            }
        }
    }

    public final void N(int i10, int i11, boolean z9) {
        int i12 = i10 + i11;
        int h10 = this.f1824e.h();
        for (int i13 = 0; i13 < h10; i13++) {
            z I2 = I(this.f1824e.g(i13));
            if (I2 != null && !I2.o()) {
                int i14 = I2.f1944c;
                if (i14 >= i12) {
                    I2.l(-i11, z9);
                } else if (i14 >= i10) {
                    I2.b(8);
                    I2.l(-i11, z9);
                    I2.f1944c = i10 - 1;
                }
                this.f1837q0.f1926f = true;
            }
        }
        r rVar = this.f1821b;
        int size = rVar.f1898c.size();
        while (true) {
            size--;
            if (size >= 0) {
                z zVar = rVar.f1898c.get(size);
                if (zVar != null) {
                    int i15 = zVar.f1944c;
                    if (i15 >= i12) {
                        zVar.l(-i11, z9);
                    } else if (i15 >= i10) {
                        zVar.b(8);
                        rVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void O() {
        this.A++;
    }

    public final void P(boolean z9) {
        int i10;
        boolean z10 = true;
        int i11 = this.A - 1;
        this.A = i11;
        if (i11 < 1) {
            this.A = 0;
            if (z9) {
                int i12 = this.w;
                this.w = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.f1847x;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z10 = false;
                    }
                    if (z10) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        i0.b.b(obtain, i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.D0.size() - 1; size >= 0; size--) {
                    z zVar = (z) this.D0.get(size);
                    if (zVar.f1942a.getParent() == this && !zVar.o() && (i10 = zVar.f1957q) != -1) {
                        View view = zVar.f1942a;
                        WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                        y.d.s(view, i10);
                        zVar.f1957q = -1;
                    }
                }
                this.D0.clear();
            }
        }
    }

    public final void Q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getPointerId(i10);
            int x9 = (int) (motionEvent.getX(i10) + 0.5f);
            this.N = x9;
            this.L = x9;
            int y9 = (int) (motionEvent.getY(i10) + 0.5f);
            this.O = y9;
            this.M = y9;
        }
    }

    public final void R() {
        if (!this.f1846w0 && this.f1835p) {
            a aVar = this.E0;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.d.m(this, aVar);
            this.f1846w0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if (r0 != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S() {
        /*
            r6 = this;
            boolean r0 = r6.f1849y
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.a r0 = r6.f1823d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2000b
            r0.l(r1)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2001c
            r0.l(r1)
            boolean r0 = r6.f1851z
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1830l
            r0.V()
        L_0x0019:
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1830l
            boolean r0 = r0.x0()
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            androidx.recyclerview.widget.a r0 = r6.f1823d
            r0.j()
            goto L_0x0037
        L_0x0032:
            androidx.recyclerview.widget.a r0 = r6.f1823d
            r0.c()
        L_0x0037:
            boolean r0 = r6.f1843t0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r6.u0
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = r2
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            androidx.recyclerview.widget.RecyclerView$w r3 = r6.f1837q0
            boolean r4 = r6.f1838r
            if (r4 == 0) goto L_0x0063
            androidx.recyclerview.widget.RecyclerView$i r4 = r6.H
            if (r4 == 0) goto L_0x0063
            boolean r4 = r6.f1849y
            if (r4 != 0) goto L_0x0059
            if (r0 != 0) goto L_0x0059
            androidx.recyclerview.widget.RecyclerView$l r5 = r6.f1830l
            boolean r5 = r5.f1871f
            if (r5 == 0) goto L_0x0063
        L_0x0059:
            if (r4 == 0) goto L_0x0061
            androidx.recyclerview.widget.RecyclerView$d r4 = r6.k
            boolean r4 = r4.f1856b
            if (r4 == 0) goto L_0x0063
        L_0x0061:
            r4 = r1
            goto L_0x0064
        L_0x0063:
            r4 = r2
        L_0x0064:
            r3.f1930j = r4
            if (r4 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6.f1849y
            if (r0 != 0) goto L_0x0080
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.H
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1830l
            boolean r0 = r0.x0()
            if (r0 == 0) goto L_0x007c
            r0 = r1
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            r3.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S():void");
    }

    public final void T(boolean z9) {
        this.f1851z = z9 | this.f1851z;
        this.f1849y = true;
        int h10 = this.f1824e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            z I2 = I(this.f1824e.g(i10));
            if (I2 != null && !I2.o()) {
                I2.b(6);
            }
        }
        M();
        r rVar = this.f1821b;
        int size = rVar.f1898c.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = rVar.f1898c.get(i11);
            if (zVar != null) {
                zVar.b(6);
                zVar.a((Object) null);
            }
        }
        d dVar = RecyclerView.this.k;
        if (dVar == null || !dVar.f1856b) {
            rVar.e();
        }
    }

    public final void U(z zVar, i.c cVar) {
        boolean z9 = false;
        int i10 = (zVar.f1951j & -8193) | 0;
        zVar.f1951j = i10;
        if (this.f1837q0.f1928h) {
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            if (z9 && !zVar.i() && !zVar.o()) {
                this.f1825f.f2027b.f(G(zVar), zVar);
            }
        }
        this.f1825f.b(zVar, cVar);
    }

    public final void V() {
        i iVar = this.H;
        if (iVar != null) {
            iVar.f();
        }
        l lVar = this.f1830l;
        if (lVar != null) {
            lVar.e0(this.f1821b);
            this.f1830l.f0(this.f1821b);
        }
        r rVar = this.f1821b;
        rVar.f1896a.clear();
        rVar.e();
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1827h.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f1888c) {
                Rect rect = mVar.f1887b;
                Rect rect2 = this.f1827h;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1827h);
            offsetRectIntoDescendantCoords(view, this.f1827h);
        }
        this.f1830l.i0(this, view, this.f1827h, !this.f1838r, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z9 = false;
        e0(0);
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z9 = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z9 |= this.E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z9 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z9 |= this.G.isFinished();
        }
        if (z9) {
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.d.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r18.m()
            androidx.recyclerview.widget.RecyclerView$d r0 = r8.k
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x002b
            int[] r0 = r8.C0
            r0[r13] = r13
            r0[r12] = r13
            r8.Z(r9, r10, r0)
            int[] r0 = r8.C0
            r1 = r0[r13]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x0031
        L_0x002b:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x0031:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r8.f1831m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003c
            r18.invalidate()
        L_0x003c:
            int[] r7 = r8.C0
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r8.A0
            r6 = 0
            r0 = r18
            r1 = r15
            r2 = r14
            r3 = r16
            r4 = r17
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.C0
            r1 = r0[r13]
            int r2 = r16 - r1
            r0 = r0[r12]
            int r3 = r17 - r0
            if (r1 != 0) goto L_0x0061
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r0 = r13
            goto L_0x0062
        L_0x0061:
            r0 = r12
        L_0x0062:
            int r1 = r8.N
            int[] r4 = r8.A0
            r5 = r4[r13]
            int r1 = r1 - r5
            r8.N = r1
            int r1 = r8.O
            r4 = r4[r12]
            int r1 = r1 - r4
            r8.O = r1
            int[] r1 = r8.B0
            r6 = r1[r13]
            int r6 = r6 + r5
            r1[r13] = r6
            r5 = r1[r12]
            int r5 = r5 + r4
            r1[r12] = r5
            int r1 = r18.getOverScrollMode()
            r4 = 2
            if (r1 == r4) goto L_0x0118
            if (r11 == 0) goto L_0x0115
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = z5.c.l(r11, r1)
            if (r1 != 0) goto L_0x0115
            float r1 = r21.getX()
            float r2 = (float) r2
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b5
            r18.v()
            android.widget.EdgeEffect r6 = r8.D
            float r11 = -r2
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            goto L_0x00cb
        L_0x00b5:
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r18.w()
            android.widget.EdgeEffect r6 = r8.F
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r2 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
        L_0x00cb:
            l0.d.a.a(r6, r11, r4)
            r4 = 1
            goto L_0x00d1
        L_0x00d0:
            r4 = r13
        L_0x00d1:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            r18.x()
            android.widget.EdgeEffect r4 = r8.E
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r1 = r1 / r7
            l0.d.a.a(r4, r6, r1)
            goto L_0x0105
        L_0x00eb:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0106
            r18.u()
            android.widget.EdgeEffect r4 = r8.G
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r1 = r1 / r11
            float r7 = r7 - r1
            l0.d.a.a(r4, r6, r7)
        L_0x0105:
            r4 = 1
        L_0x0106:
            if (r4 != 0) goto L_0x0110
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0110
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
        L_0x0110:
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            h0.y.d.k(r18)
        L_0x0115:
            r18.l(r19, r20)
        L_0x0118:
            if (r15 != 0) goto L_0x011c
            if (r14 == 0) goto L_0x011f
        L_0x011c:
            r8.t(r15, r14)
        L_0x011f:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0128
            r18.invalidate()
        L_0x0128:
            if (r0 != 0) goto L_0x0131
            if (r15 != 0) goto L_0x0131
            if (r14 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r12 = r13
            goto L_0x0132
        L_0x0131:
            r12 = 1
        L_0x0132:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        z zVar;
        c0();
        O();
        int i14 = d0.i.f6035a;
        i.a.a("RV Scroll");
        z(this.f1837q0);
        if (i10 != 0) {
            i12 = this.f1830l.k0(i10, this.f1821b, this.f1837q0);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f1830l.m0(i11, this.f1821b, this.f1837q0);
        } else {
            i13 = 0;
        }
        i.a.b();
        int e10 = this.f1824e.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f1824e.d(i15);
            z H2 = H(d10);
            if (!(H2 == null || (zVar = H2.f1950i) == null)) {
                View view = zVar.f1942a;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        P(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    public final void a0(int i10) {
        v vVar;
        if (!this.u) {
            setScrollState(0);
            y yVar = this.W;
            RecyclerView.this.removeCallbacks(yVar);
            yVar.f1936c.abortAnimation();
            l lVar = this.f1830l;
            if (!(lVar == null || (vVar = lVar.f1870e) == null)) {
                vVar.d();
            }
            l lVar2 = this.f1830l;
            if (lVar2 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            lVar2.l0(i10);
            awakenScrollBars();
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        l lVar = this.f1830l;
        if (lVar != null) {
            lVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10, int i11, boolean z9) {
        l lVar = this.f1830l;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.u) {
            int i12 = 0;
            if (!lVar.e()) {
                i10 = 0;
            }
            if (!this.f1830l.f()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z9) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    getScrollingChildHelper().g(i12, 1);
                }
                this.W.b(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void c0() {
        int i10 = this.f1840s + 1;
        this.f1840s = i10;
        if (i10 == 1 && !this.u) {
            this.f1842t = false;
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f1830l.g((m) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        l lVar = this.f1830l;
        if (lVar != null && lVar.e()) {
            return this.f1830l.k(this.f1837q0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        l lVar = this.f1830l;
        if (lVar != null && lVar.e()) {
            return this.f1830l.l(this.f1837q0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        l lVar = this.f1830l;
        if (lVar != null && lVar.e()) {
            return this.f1830l.m(this.f1837q0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        l lVar = this.f1830l;
        if (lVar != null && lVar.f()) {
            return this.f1830l.n(this.f1837q0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        l lVar = this.f1830l;
        if (lVar != null && lVar.f()) {
            return this.f1830l.o(this.f1837q0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        l lVar = this.f1830l;
        if (lVar != null && lVar.f()) {
            return this.f1830l.p(this.f1837q0);
        }
        return 0;
    }

    public final void d0(boolean z9) {
        if (this.f1840s < 1) {
            this.f1840s = 1;
        }
        if (!z9 && !this.u) {
            this.f1842t = false;
        }
        if (this.f1840s == 1) {
            if (z9 && this.f1842t && !this.u && this.f1830l != null && this.k != null) {
                o();
            }
            if (!this.u) {
                this.f1842t = false;
            }
        }
        this.f1840s--;
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return getScrollingChildHelper().a(f10, f11, z9);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z9;
        float f10;
        float f11;
        super.draw(canvas);
        int size = this.f1831m.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f1831m.get(i10).d(canvas, this);
        }
        EdgeEffect edgeEffect = this.D;
        boolean z11 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z9 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1826g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.D;
            z9 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1826g) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.E;
            z9 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1826g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.F;
            z9 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1826g) {
                f11 = (float) (getPaddingRight() + (-getWidth()));
                f10 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f11 = (float) (-getWidth());
                f10 = (float) (-getHeight());
            }
            canvas.translate(f11, f10);
            EdgeEffect edgeEffect8 = this.G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z9 |= z10;
            canvas.restoreToCount(save4);
        }
        if (z9 || this.H == null || this.f1831m.size() <= 0 || !this.H.g()) {
            z11 = z9;
        }
        if (z11) {
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.d.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void f(z zVar) {
        boolean z9;
        View view = zVar.f1942a;
        if (view.getParent() == this) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f1821b.k(H(view));
        if (zVar.k()) {
            this.f1824e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.f1824e;
        if (!z9) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((v) bVar.f2012a).f2146a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f2013b.h(indexOfChild);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0164, code lost:
        if (r3 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x017e, code lost:
        if (r6 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0181, code lost:
        if (r3 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0184, code lost:
        if (r6 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018c, code lost:
        if ((r6 * r2) < 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0194, code lost:
        if ((r6 * r2) > 0) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1830l
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView$d r0 = r13.k
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1830l
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.K()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.u
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r7) goto L_0x002c
            if (r15 != r1) goto L_0x008d
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1830l
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0042
            if (r15 != r7) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003a
        L_0x0039:
            r0 = r4
        L_0x003a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0042
            r0 = r1
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            if (r0 != 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$l r8 = r13.f1830l
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1830l
            int r0 = r0.B()
            if (r0 != r1) goto L_0x0057
            r0 = r1
            goto L_0x0058
        L_0x0057:
            r0 = r2
        L_0x0058:
            if (r15 != r7) goto L_0x005c
            r8 = r1
            goto L_0x005d
        L_0x005c:
            r8 = r2
        L_0x005d:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0063
            r0 = 66
            goto L_0x0064
        L_0x0063:
            r0 = r5
        L_0x0064:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x006c
            r0 = r1
            goto L_0x006d
        L_0x006c:
            r0 = r2
        L_0x006d:
            if (r0 == 0) goto L_0x0088
            r13.m()
            android.view.View r0 = r13.A(r14)
            if (r0 != 0) goto L_0x0079
            return r6
        L_0x0079:
            r13.c0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1830l
            androidx.recyclerview.widget.RecyclerView$r r8 = r13.f1821b
            androidx.recyclerview.widget.RecyclerView$w r9 = r13.f1837q0
            r0.Q(r14, r15, r8, r9)
            r13.d0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b1
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            r13.m()
            android.view.View r0 = r13.A(r14)
            if (r0 != 0) goto L_0x009f
            return r6
        L_0x009f:
            r13.c0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1830l
            androidx.recyclerview.widget.RecyclerView$r r3 = r13.f1821b
            androidx.recyclerview.widget.RecyclerView$w r8 = r13.f1837q0
            android.view.View r0 = r0.Q(r14, r15, r3, r8)
            r13.d0(r2)
            goto L_0x00b1
        L_0x00b0:
            r0 = r3
        L_0x00b1:
            if (r0 == 0) goto L_0x00c8
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c8
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c4
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c4:
            r13.W(r0, r6)
            return r14
        L_0x00c8:
            if (r0 == 0) goto L_0x0197
            if (r0 != r13) goto L_0x00ce
            goto L_0x0197
        L_0x00ce:
            android.view.View r3 = r13.A(r0)
            if (r3 != 0) goto L_0x00d7
            r1 = r2
            goto L_0x0198
        L_0x00d7:
            if (r14 != 0) goto L_0x00db
            goto L_0x0198
        L_0x00db:
            android.view.View r3 = r13.A(r14)
            if (r3 != 0) goto L_0x00e3
            goto L_0x0198
        L_0x00e3:
            android.graphics.Rect r3 = r13.f1827h
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r3 = r13.f1828i
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r2 = r13.f1827h
            r13.offsetDescendantRectToMyCoords(r14, r2)
            android.graphics.Rect r2 = r13.f1828i
            r13.offsetDescendantRectToMyCoords(r0, r2)
            androidx.recyclerview.widget.RecyclerView$l r2 = r13.f1830l
            int r2 = r2.B()
            if (r2 != r1) goto L_0x0111
            r2 = -1
            goto L_0x0112
        L_0x0111:
            r2 = r1
        L_0x0112:
            android.graphics.Rect r3 = r13.f1827h
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f1828i
            int r9 = r8.left
            if (r6 < r9) goto L_0x0120
            int r10 = r3.right
            if (r10 > r9) goto L_0x0128
        L_0x0120:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x0128
            r6 = r1
            goto L_0x0135
        L_0x0128:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0130
            if (r6 < r11) goto L_0x0134
        L_0x0130:
            if (r6 <= r9) goto L_0x0134
            r6 = -1
            goto L_0x0135
        L_0x0134:
            r6 = 0
        L_0x0135:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x013f
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x0147
        L_0x013f:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x0147
            r3 = r1
            goto L_0x0154
        L_0x0147:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x014f
            if (r9 < r8) goto L_0x0153
        L_0x014f:
            if (r9 <= r10) goto L_0x0153
            r3 = -1
            goto L_0x0154
        L_0x0153:
            r3 = 0
        L_0x0154:
            if (r15 == r1) goto L_0x018f
            if (r15 == r7) goto L_0x0187
            if (r15 == r5) goto L_0x0184
            if (r15 == r4) goto L_0x0181
            r2 = 66
            if (r15 == r2) goto L_0x017e
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x0167
            if (r3 <= 0) goto L_0x0197
            goto L_0x0198
        L_0x0167:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = androidx.activity.f.e(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x017e:
            if (r6 <= 0) goto L_0x0197
            goto L_0x0198
        L_0x0181:
            if (r3 >= 0) goto L_0x0197
            goto L_0x0198
        L_0x0184:
            if (r6 >= 0) goto L_0x0197
            goto L_0x0198
        L_0x0187:
            if (r3 > 0) goto L_0x0198
            if (r3 != 0) goto L_0x0197
            int r6 = r6 * r2
            if (r6 < 0) goto L_0x0197
            goto L_0x0198
        L_0x018f:
            if (r3 < 0) goto L_0x0198
            if (r3 != 0) goto L_0x0197
            int r6 = r6 * r2
            if (r6 > 0) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r1 = 0
        L_0x0198:
            if (r1 == 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x019f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(k kVar) {
        l lVar = this.f1830l;
        if (lVar != null) {
            lVar.c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1831m.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1831m.add(kVar);
        M();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f1830l;
        if (lVar != null) {
            return lVar.s();
        }
        throw new IllegalStateException(androidx.activity.f.e(this, androidx.activity.f.g("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f1830l;
        if (lVar != null) {
            return lVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.activity.f.e(this, androidx.activity.f.g("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return this.k;
    }

    public int getBaseline() {
        l lVar = this.f1830l;
        if (lVar == null) {
            return super.getBaseline();
        }
        lVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f1826g;
    }

    public x getCompatAccessibilityDelegate() {
        return this.f1848x0;
    }

    public h getEdgeEffectFactory() {
        return this.C;
    }

    public i getItemAnimator() {
        return this.H;
    }

    public int getItemDecorationCount() {
        return this.f1831m.size();
    }

    public l getLayoutManager() {
        return this.f1830l;
    }

    public int getMaxFlingVelocity() {
        return this.S;
    }

    public int getMinFlingVelocity() {
        return this.R;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public n getOnFlingListener() {
        return this.Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.V;
    }

    public q getRecycledViewPool() {
        return this.f1821b.c();
    }

    public int getScrollState() {
        return this.I;
    }

    public final void h(p pVar) {
        if (this.f1841s0 == null) {
            this.f1841s0 = new ArrayList();
        }
        this.f1841s0.add(pVar);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public final void i(String str) {
        if (K()) {
            if (str == null) {
                throw new IllegalStateException(androidx.activity.f.e(this, androidx.activity.f.g("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.activity.f.e(this, androidx.activity.f.g(""))));
        }
    }

    public final boolean isAttachedToWindow() {
        return this.f1835p;
    }

    public final boolean isLayoutSuppressed() {
        return this.u;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6711d;
    }

    public final void k() {
        int h10 = this.f1824e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            z I2 = I(this.f1824e.g(i10));
            if (!I2.o()) {
                I2.f1945d = -1;
                I2.f1948g = -1;
            }
        }
        r rVar = this.f1821b;
        int size = rVar.f1898c.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = rVar.f1898c.get(i11);
            zVar.f1945d = -1;
            zVar.f1948g = -1;
        }
        int size2 = rVar.f1896a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z zVar2 = rVar.f1896a.get(i12);
            zVar2.f1945d = -1;
            zVar2.f1948g = -1;
        }
        ArrayList<z> arrayList = rVar.f1897b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                z zVar3 = rVar.f1897b.get(i13);
                zVar3.f1945d = -1;
                zVar3.f1948g = -1;
            }
        }
    }

    public final void l(int i10, int i11) {
        boolean z9;
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z9 = false;
        } else {
            this.D.onRelease();
            z9 = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.F.onRelease();
            z9 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.E.onRelease();
            z9 |= this.E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.G.onRelease();
            z9 |= this.G.isFinished();
        }
        if (z9) {
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.d.k(this);
        }
    }

    public final void m() {
        if (!this.f1838r || this.f1849y) {
            int i10 = d0.i.f6035a;
            i.a.a("RV FullInvalidate");
            o();
            i.a.b();
        } else if (this.f1823d.g()) {
            this.f1823d.getClass();
            if (this.f1823d.g()) {
                int i11 = d0.i.f6035a;
                i.a.a("RV FullInvalidate");
                o();
                i.a.b();
            }
        }
    }

    public final void n(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
        setMeasuredDimension(l.h(i10, paddingRight, y.d.e(this)), l.h(i11, getPaddingBottom() + getPaddingTop(), y.d.d(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: androidx.recyclerview.widget.RecyclerView$z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: androidx.recyclerview.widget.RecyclerView$i$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: androidx.recyclerview.widget.RecyclerView$i$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: androidx.recyclerview.widget.RecyclerView$i$c} */
    /* JADX WARNING: type inference failed for: r10v0, types: [androidx.recyclerview.widget.RecyclerView$z] */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x039e, code lost:
        if (r0.f1824e.k(getFocusedChild()) == false) goto L_0x045f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r17 = this;
            r0 = r17
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.k
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000b
            java.lang.String r1 = "No adapter attached; skipping layout"
            goto L_0x0011
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "No layout manager attached; skipping layout"
        L_0x0011:
            android.util.Log.e(r2, r1)
            return
        L_0x0015:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            r3 = 0
            r1.f1929i = r3
            int r1 = r1.f1924d
            r4 = 1
            if (r1 != r4) goto L_0x0023
            r17.p()
            goto L_0x0055
        L_0x0023:
            androidx.recyclerview.widget.a r1 = r0.f1823d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r1.f2001c
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0037
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r1.f2000b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0037
            r1 = r4
            goto L_0x0038
        L_0x0037:
            r1 = r3
        L_0x0038:
            if (r1 != 0) goto L_0x0055
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            int r1 = r1.f1878n
            int r5 = r17.getWidth()
            if (r1 != r5) goto L_0x0055
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            int r1 = r1.f1879o
            int r5 = r17.getHeight()
            if (r1 == r5) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            r1.n0(r0)
            goto L_0x005d
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            r1.n0(r0)
            r17.q()
        L_0x005d:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            r5 = 4
            r1.a(r5)
            r17.c0()
            r17.O()
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            r1.f1924d = r4
            boolean r1 = r1.f1930j
            r6 = 0
            if (r1 == 0) goto L_0x0300
            androidx.recyclerview.widget.b r1 = r0.f1824e
            int r1 = r1.e()
            int r1 = r1 - r4
        L_0x0079:
            if (r1 < 0) goto L_0x01b0
            androidx.recyclerview.widget.b r7 = r0.f1824e
            android.view.View r7 = r7.d(r1)
            androidx.recyclerview.widget.RecyclerView$z r7 = I(r7)
            boolean r8 = r7.o()
            if (r8 == 0) goto L_0x008d
            goto L_0x01ab
        L_0x008d:
            long r8 = r0.G(r7)
            androidx.recyclerview.widget.RecyclerView$i r10 = r0.H
            r10.getClass()
            androidx.recyclerview.widget.RecyclerView$i$c r10 = new androidx.recyclerview.widget.RecyclerView$i$c
            r10.<init>()
            r10.a(r7)
            androidx.recyclerview.widget.c0 r11 = r0.f1825f
            m.e<androidx.recyclerview.widget.RecyclerView$z> r11 = r11.f2027b
            java.lang.Object r11 = r11.e(r8, r6)
            androidx.recyclerview.widget.RecyclerView$z r11 = (androidx.recyclerview.widget.RecyclerView.z) r11
            if (r11 == 0) goto L_0x01a6
            boolean r12 = r11.o()
            if (r12 != 0) goto L_0x01a6
            androidx.recyclerview.widget.c0 r12 = r0.f1825f
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r12 = r12.f2026a
            java.lang.Object r12 = r12.getOrDefault(r11, r6)
            androidx.recyclerview.widget.c0$a r12 = (androidx.recyclerview.widget.c0.a) r12
            if (r12 == 0) goto L_0x00c3
            int r12 = r12.f2029a
            r12 = r12 & r4
            if (r12 == 0) goto L_0x00c3
            r12 = r4
            goto L_0x00c4
        L_0x00c3:
            r12 = r3
        L_0x00c4:
            androidx.recyclerview.widget.c0 r13 = r0.f1825f
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r13 = r13.f2026a
            java.lang.Object r13 = r13.getOrDefault(r7, r6)
            androidx.recyclerview.widget.c0$a r13 = (androidx.recyclerview.widget.c0.a) r13
            if (r13 == 0) goto L_0x00d7
            int r13 = r13.f2029a
            r13 = r13 & r4
            if (r13 == 0) goto L_0x00d7
            r13 = r4
            goto L_0x00d8
        L_0x00d7:
            r13 = r3
        L_0x00d8:
            if (r12 == 0) goto L_0x00de
            if (r11 != r7) goto L_0x00de
            goto L_0x01a6
        L_0x00de:
            androidx.recyclerview.widget.c0 r14 = r0.f1825f
            androidx.recyclerview.widget.RecyclerView$i$c r5 = r14.c(r11, r5)
            androidx.recyclerview.widget.c0 r14 = r0.f1825f
            r14.a(r7, r10)
            androidx.recyclerview.widget.c0 r10 = r0.f1825f
            r14 = 8
            androidx.recyclerview.widget.RecyclerView$i$c r10 = r10.c(r7, r14)
            if (r5 != 0) goto L_0x017c
            androidx.recyclerview.widget.b r5 = r0.f1824e
            int r5 = r5.e()
            r10 = r3
        L_0x00fa:
            if (r10 >= r5) goto L_0x0158
            androidx.recyclerview.widget.b r12 = r0.f1824e
            android.view.View r12 = r12.d(r10)
            androidx.recyclerview.widget.RecyclerView$z r12 = I(r12)
            if (r12 != r7) goto L_0x0109
            goto L_0x0155
        L_0x0109:
            long r13 = r0.G(r12)
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x0155
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.k
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0138
            boolean r1 = r1.f1856b
            if (r1 == 0) goto L_0x0138
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.append(r4)
            r3.append(r12)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = androidx.activity.f.e(r0, r3)
            r1.<init>(r2)
            throw r1
        L_0x0138:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.append(r4)
            r3.append(r12)
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = androidx.activity.f.e(r0, r3)
            r1.<init>(r2)
            throw r1
        L_0x0155:
            int r10 = r10 + 1
            goto L_0x00fa
        L_0x0158:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.append(r8)
            r5.append(r11)
            java.lang.String r8 = " cannot be found but it is necessary for "
            r5.append(r8)
            r5.append(r7)
            java.lang.String r7 = r17.y()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L_0x01ab
        L_0x017c:
            r11.n(r3)
            if (r12 == 0) goto L_0x0184
            r0.f(r11)
        L_0x0184:
            if (r11 == r7) goto L_0x019a
            if (r13 == 0) goto L_0x018b
            r0.f(r7)
        L_0x018b:
            r11.f1949h = r7
            r0.f(r11)
            androidx.recyclerview.widget.RecyclerView$r r8 = r0.f1821b
            r8.k(r11)
            r7.n(r3)
            r7.f1950i = r11
        L_0x019a:
            androidx.recyclerview.widget.RecyclerView$i r8 = r0.H
            boolean r5 = r8.a(r11, r7, r5, r10)
            if (r5 == 0) goto L_0x01ab
            r17.R()
            goto L_0x01ab
        L_0x01a6:
            androidx.recyclerview.widget.c0 r5 = r0.f1825f
            r5.a(r7, r10)
        L_0x01ab:
            int r1 = r1 + -1
            r5 = 4
            goto L_0x0079
        L_0x01b0:
            androidx.recyclerview.widget.c0 r1 = r0.f1825f
            androidx.recyclerview.widget.RecyclerView$c r2 = r0.F0
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r4 = r1.f2026a
            int r4 = r4.f9301c
        L_0x01b8:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0300
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r5 = r1.f2026a
            java.lang.Object r5 = r5.h(r4)
            r8 = r5
            androidx.recyclerview.widget.RecyclerView$z r8 = (androidx.recyclerview.widget.RecyclerView.z) r8
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r5 = r1.f2026a
            java.lang.Object r5 = r5.j(r4)
            androidx.recyclerview.widget.c0$a r5 = (androidx.recyclerview.widget.c0.a) r5
            int r7 = r5.f2029a
            r9 = r7 & 3
            r10 = 3
            if (r9 != r10) goto L_0x01d5
            goto L_0x01dd
        L_0x01d5:
            r9 = r7 & 1
            if (r9 == 0) goto L_0x01ed
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2030b
            if (r6 != 0) goto L_0x01ea
        L_0x01dd:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$l r7 = r6.f1830l
            android.view.View r8 = r8.f1942a
            androidx.recyclerview.widget.RecyclerView$r r6 = r6.f1821b
            r7.g0(r8, r6)
            goto L_0x02f2
        L_0x01ea:
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f2031c
            goto L_0x024a
        L_0x01ed:
            r9 = r7 & 14
            r10 = 14
            if (r9 != r10) goto L_0x01f5
            goto L_0x02af
        L_0x01f5:
            r9 = r7 & 12
            r10 = 12
            if (r9 != r10) goto L_0x023f
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2030b
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f2031c
            r2.getClass()
            r8.n(r3)
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            boolean r10 = r9.f1849y
            androidx.recyclerview.widget.RecyclerView$i r9 = r9.H
            if (r10 == 0) goto L_0x0214
            boolean r6 = r9.a(r8, r8, r6, r7)
            if (r6 == 0) goto L_0x02f2
            goto L_0x0238
        L_0x0214:
            androidx.recyclerview.widget.z r9 = (androidx.recyclerview.widget.z) r9
            r9.getClass()
            int r10 = r6.f1863a
            int r11 = r7.f1863a
            if (r10 != r11) goto L_0x022b
            int r12 = r6.f1864b
            int r13 = r7.f1864b
            if (r12 == r13) goto L_0x0226
            goto L_0x022b
        L_0x0226:
            r9.c(r8)
            r6 = r3
            goto L_0x0236
        L_0x022b:
            int r6 = r6.f1864b
            int r12 = r7.f1864b
            r7 = r9
            r9 = r10
            r10 = r6
            boolean r6 = r7.h(r8, r9, r10, r11, r12)
        L_0x0236:
            if (r6 == 0) goto L_0x02f2
        L_0x0238:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.R()
            goto L_0x02f2
        L_0x023f:
            r9 = r7 & 4
            if (r9 == 0) goto L_0x02ab
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f2030b
            r16 = r7
            r7 = r6
            r6 = r16
        L_0x024a:
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$r r9 = r9.f1821b
            r9.k(r8)
            androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
            r13.f(r8)
            r8.n(r3)
            androidx.recyclerview.widget.RecyclerView$i r9 = r13.H
            androidx.recyclerview.widget.z r9 = (androidx.recyclerview.widget.z) r9
            r9.getClass()
            int r10 = r6.f1863a
            int r6 = r6.f1864b
            android.view.View r11 = r8.f1942a
            if (r7 != 0) goto L_0x026d
            int r12 = r11.getLeft()
            goto L_0x026f
        L_0x026d:
            int r12 = r7.f1863a
        L_0x026f:
            if (r7 != 0) goto L_0x0276
            int r7 = r11.getTop()
            goto L_0x0278
        L_0x0276:
            int r7 = r7.f1864b
        L_0x0278:
            r14 = r7
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x029a
            if (r10 != r12) goto L_0x0283
            if (r6 == r14) goto L_0x029a
        L_0x0283:
            int r7 = r11.getWidth()
            int r7 = r7 + r12
            int r15 = r11.getHeight()
            int r15 = r15 + r14
            r11.layout(r12, r14, r7, r15)
            r7 = r9
            r9 = r10
            r10 = r6
            r11 = r12
            r12 = r14
            boolean r6 = r7.h(r8, r9, r10, r11, r12)
            goto L_0x02a5
        L_0x029a:
            androidx.recyclerview.widget.k r9 = (androidx.recyclerview.widget.k) r9
            r9.m(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r6 = r9.f2059h
            r6.add(r8)
            r6 = 1
        L_0x02a5:
            if (r6 == 0) goto L_0x02f2
            r13.R()
            goto L_0x02f2
        L_0x02ab:
            r6 = r7 & 8
            if (r6 == 0) goto L_0x02f2
        L_0x02af:
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f2030b
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f2031c
            androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
            r13.getClass()
            r8.n(r3)
            androidx.recyclerview.widget.RecyclerView$i r9 = r13.H
            androidx.recyclerview.widget.z r9 = (androidx.recyclerview.widget.z) r9
            r9.getClass()
            if (r6 == 0) goto L_0x02dc
            int r10 = r6.f1863a
            int r11 = r7.f1863a
            if (r10 != r11) goto L_0x02d0
            int r12 = r6.f1864b
            int r14 = r7.f1864b
            if (r12 == r14) goto L_0x02dc
        L_0x02d0:
            int r6 = r6.f1864b
            int r12 = r7.f1864b
            r7 = r9
            r9 = r10
            r10 = r6
            boolean r6 = r7.h(r8, r9, r10, r11, r12)
            goto L_0x02ed
        L_0x02dc:
            androidx.recyclerview.widget.k r9 = (androidx.recyclerview.widget.k) r9
            r9.m(r8)
            android.view.View r6 = r8.f1942a
            r7 = 0
            r6.setAlpha(r7)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r6 = r9.f2060i
            r6.add(r8)
            r6 = 1
        L_0x02ed:
            if (r6 == 0) goto L_0x02f2
            r13.R()
        L_0x02f2:
            r5.f2029a = r3
            r6 = 0
            r5.f2030b = r6
            r5.f2031c = r6
            g0.e r7 = androidx.recyclerview.widget.c0.a.f2028d
            r7.a(r5)
            goto L_0x01b8
        L_0x0300:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            androidx.recyclerview.widget.RecyclerView$r r2 = r0.f1821b
            r1.f0(r2)
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            int r2 = r1.f1925e
            r1.f1922b = r2
            r0.f1849y = r3
            r0.f1851z = r3
            r1.f1930j = r3
            r1.k = r3
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            r1.f1871f = r3
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.f1821b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r1 = r1.f1897b
            if (r1 == 0) goto L_0x0322
            r1.clear()
        L_0x0322:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            boolean r2 = r1.k
            if (r2 == 0) goto L_0x0331
            r1.f1875j = r3
            r1.k = r3
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.f1821b
            r1.l()
        L_0x0331:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1830l
            androidx.recyclerview.widget.RecyclerView$w r2 = r0.f1837q0
            r1.a0(r2)
            r1 = 1
            r0.P(r1)
            r0.d0(r3)
            androidx.recyclerview.widget.c0 r1 = r0.f1825f
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r2 = r1.f2026a
            r2.clear()
            m.e<androidx.recyclerview.widget.RecyclerView$z> r1 = r1.f2027b
            r1.b()
            int[] r1 = r0.f1850y0
            r2 = r1[r3]
            r4 = 1
            r5 = r1[r4]
            r0.C(r1)
            int[] r1 = r0.f1850y0
            r7 = r1[r3]
            if (r7 != r2) goto L_0x0361
            r1 = r1[r4]
            if (r1 == r5) goto L_0x0360
            goto L_0x0361
        L_0x0360:
            r4 = r3
        L_0x0361:
            if (r4 == 0) goto L_0x0366
            r0.t(r3, r3)
        L_0x0366:
            boolean r1 = r0.V
            r4 = -1
            if (r1 == 0) goto L_0x045f
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.k
            if (r1 == 0) goto L_0x045f
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x045f
            int r1 = r17.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L_0x045f
            int r1 = r17.getDescendantFocusability()
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r2) goto L_0x038e
            boolean r1 = r17.isFocused()
            if (r1 == 0) goto L_0x038e
            goto L_0x045f
        L_0x038e:
            boolean r1 = r17.isFocused()
            if (r1 != 0) goto L_0x03a2
            android.view.View r1 = r17.getFocusedChild()
            androidx.recyclerview.widget.b r2 = r0.f1824e
            boolean r1 = r2.k(r1)
            if (r1 != 0) goto L_0x03a2
            goto L_0x045f
        L_0x03a2:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            long r1 = r1.f1932m
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x03e6
            androidx.recyclerview.widget.RecyclerView$d r7 = r0.k
            boolean r7 = r7.f1856b
            if (r7 == 0) goto L_0x03e6
            if (r7 != 0) goto L_0x03b4
            r9 = r6
            goto L_0x03e4
        L_0x03b4:
            androidx.recyclerview.widget.b r7 = r0.f1824e
            int r7 = r7.h()
            r8 = r3
            r9 = r6
        L_0x03bc:
            if (r8 >= r7) goto L_0x03e4
            androidx.recyclerview.widget.b r10 = r0.f1824e
            android.view.View r10 = r10.g(r8)
            androidx.recyclerview.widget.RecyclerView$z r10 = I(r10)
            if (r10 == 0) goto L_0x03e1
            boolean r11 = r10.i()
            if (r11 != 0) goto L_0x03e1
            long r11 = r10.f1946e
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x03e1
            androidx.recyclerview.widget.b r9 = r0.f1824e
            android.view.View r11 = r10.f1942a
            boolean r9 = r9.k(r11)
            if (r9 == 0) goto L_0x03e7
            r9 = r10
        L_0x03e1:
            int r8 = r8 + 1
            goto L_0x03bc
        L_0x03e4:
            r10 = r9
            goto L_0x03e7
        L_0x03e6:
            r10 = r6
        L_0x03e7:
            if (r10 == 0) goto L_0x03ff
            androidx.recyclerview.widget.b r1 = r0.f1824e
            android.view.View r2 = r10.f1942a
            boolean r1 = r1.k(r2)
            if (r1 != 0) goto L_0x03ff
            android.view.View r1 = r10.f1942a
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x03fc
            goto L_0x03ff
        L_0x03fc:
            android.view.View r6 = r10.f1942a
            goto L_0x0444
        L_0x03ff:
            androidx.recyclerview.widget.b r1 = r0.f1824e
            int r1 = r1.e()
            if (r1 <= 0) goto L_0x0444
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            int r2 = r1.f1931l
            r7 = -1
            if (r2 == r7) goto L_0x040f
            r3 = r2
        L_0x040f:
            int r1 = r1.b()
            r2 = r3
        L_0x0414:
            if (r2 >= r1) goto L_0x042b
            androidx.recyclerview.widget.RecyclerView$z r7 = r0.E(r2)
            if (r7 != 0) goto L_0x041d
            goto L_0x042b
        L_0x041d:
            android.view.View r8 = r7.f1942a
            boolean r8 = r8.hasFocusable()
            if (r8 == 0) goto L_0x0428
            android.view.View r6 = r7.f1942a
            goto L_0x0444
        L_0x0428:
            int r2 = r2 + 1
            goto L_0x0414
        L_0x042b:
            int r1 = java.lang.Math.min(r1, r3)
        L_0x042f:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0444
            androidx.recyclerview.widget.RecyclerView$z r2 = r0.E(r1)
            if (r2 != 0) goto L_0x043a
            goto L_0x0444
        L_0x043a:
            android.view.View r3 = r2.f1942a
            boolean r3 = r3.hasFocusable()
            if (r3 == 0) goto L_0x042f
            android.view.View r6 = r2.f1942a
        L_0x0444:
            if (r6 == 0) goto L_0x045f
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            int r1 = r1.f1933n
            long r2 = (long) r1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x045c
            android.view.View r1 = r6.findViewById(r1)
            if (r1 == 0) goto L_0x045c
            boolean r2 = r1.isFocusable()
            if (r2 == 0) goto L_0x045c
            r6 = r1
        L_0x045c:
            r6.requestFocus()
        L_0x045f:
            androidx.recyclerview.widget.RecyclerView$w r1 = r0.f1837q0
            r1.f1932m = r4
            r2 = -1
            r1.f1931l = r2
            r1.f1933n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    public final void onAttachedToWindow() {
        boolean z9;
        super.onAttachedToWindow();
        this.A = 0;
        this.f1835p = true;
        if (!this.f1838r || isLayoutRequested()) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f1838r = z9;
        l lVar = this.f1830l;
        if (lVar != null) {
            lVar.f1872g = true;
        }
        this.f1846w0 = false;
        ThreadLocal<m> threadLocal = m.f2108e;
        m mVar = threadLocal.get();
        this.f1834o0 = mVar;
        if (mVar == null) {
            this.f1834o0 = new m();
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            Display b10 = y.e.b(this);
            float f10 = 60.0f;
            if (!isInEditMode() && b10 != null) {
                float refreshRate = b10.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f10 = refreshRate;
                }
            }
            m mVar2 = this.f1834o0;
            mVar2.f2112c = (long) (1.0E9f / f10);
            threadLocal.set(mVar2);
        }
        this.f1834o0.f2110a.add(this);
    }

    public final void onDetachedFromWindow() {
        v vVar;
        super.onDetachedFromWindow();
        i iVar = this.H;
        if (iVar != null) {
            iVar.f();
        }
        setScrollState(0);
        y yVar = this.W;
        RecyclerView.this.removeCallbacks(yVar);
        yVar.f1936c.abortAnimation();
        l lVar = this.f1830l;
        if (!(lVar == null || (vVar = lVar.f1870e) == null)) {
            vVar.d();
        }
        this.f1835p = false;
        l lVar2 = this.f1830l;
        if (lVar2 != null) {
            lVar2.f1872g = false;
            lVar2.P(this);
        }
        this.D0.clear();
        removeCallbacks(this.E0);
        this.f1825f.getClass();
        do {
        } while (c0.a.f2028d.b() != null);
        m mVar = this.f1834o0;
        if (mVar != null) {
            mVar.f2110a.remove(this);
            this.f1834o0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1831m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1831m.get(i10).c(canvas, this);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f1830l != null && !this.u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.f1830l.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1830l.e()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        Y((int) (f10 * this.T), (int) (f11 * this.U), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1830l.f()) {
                        f11 = -axisValue;
                    } else if (this.f1830l.e()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        Y((int) (f10 * this.T), (int) (f11 * this.U), motionEvent);
                    }
                }
                f11 = 0.0f;
                f10 = 0.0f;
                Y((int) (f10 * this.T), (int) (f11 * this.U), motionEvent);
            }
            f10 = 0.0f;
            Y((int) (f10 * this.T), (int) (f11 * this.U), motionEvent);
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.u) {
            return false;
        }
        this.f1833o = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        l lVar = this.f1830l;
        if (lVar == null) {
            return false;
        }
        boolean e10 = lVar.e();
        boolean f10 = this.f1830l.f();
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1844v) {
                this.f1844v = false;
            }
            this.J = motionEvent.getPointerId(0);
            int x9 = (int) (motionEvent.getX() + 0.5f);
            this.N = x9;
            this.L = x9;
            int y9 = (int) (motionEvent.getY() + 0.5f);
            this.O = y9;
            this.M = y9;
            if (this.I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.B0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f10) {
                e10 |= true;
            }
            getScrollingChildHelper().g(e10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.K.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.J);
            if (findPointerIndex < 0) {
                StringBuilder g10 = androidx.activity.f.g("Error processing scroll; pointer index for id ");
                g10.append(this.J);
                g10.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", g10.toString());
                return false;
            }
            int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.I != 1) {
                int i10 = x10 - this.L;
                int i11 = y10 - this.M;
                if (!e10 || Math.abs(i10) <= this.P) {
                    z9 = false;
                } else {
                    this.N = x10;
                    z9 = true;
                }
                if (f10 && Math.abs(i11) > this.P) {
                    this.O = y10;
                    z9 = true;
                }
                if (z9) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.J = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.N = x11;
            this.L = x11;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.O = y11;
            this.M = y11;
        } else if (actionMasked == 6) {
            Q(motionEvent);
        }
        if (this.I == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = d0.i.f6035a;
        i.a.a("RV OnLayout");
        o();
        i.a.b();
        this.f1838r = true;
    }

    public final void onMeasure(int i10, int i11) {
        l lVar = this.f1830l;
        if (lVar == null) {
            n(i10, i11);
            return;
        }
        boolean z9 = false;
        if (lVar.K()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f1830l.f1867b.n(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z9 = true;
            }
            if (!z9 && this.k != null) {
                if (this.f1837q0.f1924d == 1) {
                    p();
                }
                this.f1830l.o0(i10, i11);
                this.f1837q0.f1929i = true;
                q();
                this.f1830l.q0(i10, i11);
                if (this.f1830l.t0()) {
                    this.f1830l.o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f1837q0.f1929i = true;
                    q();
                    this.f1830l.q0(i10, i11);
                }
            }
        } else if (this.f1836q) {
            this.f1830l.f1867b.n(i10, i11);
        } else {
            w wVar = this.f1837q0;
            if (wVar.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            d dVar = this.k;
            if (dVar != null) {
                wVar.f1925e = dVar.a();
            } else {
                wVar.f1925e = 0;
            }
            c0();
            this.f1830l.f1867b.n(i10, i11);
            d0(false);
            this.f1837q0.f1927g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u uVar = (u) parcelable;
        this.f1822c = uVar;
        super.onRestoreInstanceState(uVar.f9479a);
        l lVar = this.f1830l;
        if (lVar != null && (parcelable2 = this.f1822c.f1905c) != null) {
            lVar.b0(parcelable2);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        u uVar = new u(super.onSaveInstanceState());
        u uVar2 = this.f1822c;
        if (uVar2 != null) {
            uVar.f1905c = uVar2.f1905c;
        } else {
            l lVar = this.f1830l;
            if (lVar != null) {
                parcelable = lVar.c0();
            } else {
                parcelable = null;
            }
            uVar.f1905c = parcelable;
        }
        return uVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.G = null;
            this.E = null;
            this.F = null;
            this.D = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0308, code lost:
        if (r5 < r8) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x031b, code lost:
        if (r8 != 0) goto L_0x037a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            boolean r0 = r6.u
            r8 = 0
            if (r0 != 0) goto L_0x03c4
            boolean r0 = r6.f1844v
            if (r0 == 0) goto L_0x000f
            goto L_0x03c4
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f1833o
            r1 = 3
            r2 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0023
            int r0 = r20.getAction()
            if (r0 != 0) goto L_0x001e
            r0 = r8
            goto L_0x0031
        L_0x001e:
            boolean r0 = r19.B(r20)
            goto L_0x0031
        L_0x0023:
            r0.onTouchEvent(r7)
            int r0 = r20.getAction()
            if (r0 == r1) goto L_0x002e
            if (r0 != r9) goto L_0x0030
        L_0x002e:
            r6.f1833o = r2
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r19.X()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1830l
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.e()
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1830l
            boolean r11 = r0.f()
            android.view.VelocityTracker r0 = r6.K
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.K = r0
        L_0x0053:
            int r0 = r20.getActionMasked()
            int r3 = r20.getActionIndex()
            if (r0 != 0) goto L_0x0063
            int[] r4 = r6.B0
            r4[r9] = r8
            r4[r8] = r8
        L_0x0063:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r20)
            int[] r4 = r6.B0
            r5 = r4[r8]
            float r5 = (float) r5
            r4 = r4[r9]
            float r4 = (float) r4
            r12.offsetLocation(r5, r4)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x038a
            java.lang.String r5 = "RecyclerView"
            r13 = 2
            if (r0 == r9) goto L_0x018c
            if (r0 == r13) goto L_0x00b0
            if (r0 == r1) goto L_0x00a8
            r1 = 5
            if (r0 == r1) goto L_0x008c
            r1 = 6
            if (r0 == r1) goto L_0x0087
            goto L_0x0188
        L_0x0087:
            r19.Q(r20)
            goto L_0x0188
        L_0x008c:
            int r0 = r7.getPointerId(r3)
            r6.J = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.N = r0
            r6.L = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.O = r0
            r6.M = r0
            goto L_0x0188
        L_0x00a8:
            r19.X()
            r6.setScrollState(r8)
            goto L_0x0188
        L_0x00b0:
            int r0 = r6.J
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00d0
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            int r1 = r6.J
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0)
            return r8
        L_0x00d0:
            float r1 = r7.getX(r0)
            float r1 = r1 + r4
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r4
            int r14 = (int) r0
            int r0 = r6.N
            int r0 = r0 - r13
            int r1 = r6.O
            int r1 = r1 - r14
            int r2 = r6.I
            if (r2 == r9) goto L_0x0115
            if (r10 == 0) goto L_0x00fb
            int r2 = r6.P
            if (r0 <= 0) goto L_0x00f2
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f7
        L_0x00f2:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f7:
            if (r0 == 0) goto L_0x00fb
            r2 = r9
            goto L_0x00fc
        L_0x00fb:
            r2 = r8
        L_0x00fc:
            if (r11 == 0) goto L_0x0110
            int r3 = r6.P
            if (r1 <= 0) goto L_0x0108
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x010d
        L_0x0108:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x010d:
            if (r1 == 0) goto L_0x0110
            r2 = r9
        L_0x0110:
            if (r2 == 0) goto L_0x0115
            r6.setScrollState(r9)
        L_0x0115:
            r15 = r0
            r16 = r1
            int r0 = r6.I
            if (r0 != r9) goto L_0x0188
            int[] r3 = r6.C0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0126
            r1 = r15
            goto L_0x0127
        L_0x0126:
            r1 = r8
        L_0x0127:
            if (r11 == 0) goto L_0x012c
            r2 = r16
            goto L_0x012d
        L_0x012c:
            r2 = r8
        L_0x012d:
            int[] r4 = r6.A0
            r5 = 0
            r0 = r19
            boolean r0 = r0.r(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x015a
            int[] r0 = r6.C0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.B0
            r1 = r0[r8]
            int[] r2 = r6.A0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r19.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015a:
            r0 = r16
            int[] r1 = r6.A0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.N = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.O = r14
            if (r10 == 0) goto L_0x016c
            r1 = r15
            goto L_0x016d
        L_0x016c:
            r1 = r8
        L_0x016d:
            if (r11 == 0) goto L_0x0170
            r8 = r0
        L_0x0170:
            boolean r1 = r6.Y(r1, r8, r7)
            if (r1 == 0) goto L_0x017d
            android.view.ViewParent r1 = r19.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017d:
            androidx.recyclerview.widget.m r1 = r6.f1834o0
            if (r1 == 0) goto L_0x0188
            if (r15 != 0) goto L_0x0185
            if (r0 == 0) goto L_0x0188
        L_0x0185:
            r1.a(r6, r15, r0)
        L_0x0188:
            r18 = r12
            goto L_0x03b2
        L_0x018c:
            android.view.VelocityTracker r0 = r6.K
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.K
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r6.S
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            r0 = 0
            if (r10 == 0) goto L_0x01a8
            android.view.VelocityTracker r1 = r6.K
            int r3 = r6.J
            float r1 = r1.getXVelocity(r3)
            float r1 = -r1
            goto L_0x01a9
        L_0x01a8:
            r1 = r0
        L_0x01a9:
            if (r11 == 0) goto L_0x01b5
            android.view.VelocityTracker r3 = r6.K
            int r4 = r6.J
            float r3 = r3.getYVelocity(r4)
            float r3 = -r3
            goto L_0x01b6
        L_0x01b5:
            r3 = r0
        L_0x01b6:
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x01c3
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01bf
            goto L_0x01c3
        L_0x01bf:
            r18 = r12
            goto L_0x0382
        L_0x01c3:
            int r0 = (int) r1
            int r1 = (int) r3
            androidx.recyclerview.widget.RecyclerView$l r3 = r6.f1830l
            if (r3 != 0) goto L_0x01cf
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r5, r0)
            goto L_0x01f8
        L_0x01cf:
            boolean r4 = r6.u
            if (r4 == 0) goto L_0x01d4
            goto L_0x01f8
        L_0x01d4:
            boolean r3 = r3.e()
            androidx.recyclerview.widget.RecyclerView$l r4 = r6.f1830l
            boolean r4 = r4.f()
            if (r3 == 0) goto L_0x01e8
            int r5 = java.lang.Math.abs(r0)
            int r7 = r6.R
            if (r5 >= r7) goto L_0x01e9
        L_0x01e8:
            r0 = r8
        L_0x01e9:
            if (r4 == 0) goto L_0x01f3
            int r5 = java.lang.Math.abs(r1)
            int r7 = r6.R
            if (r5 >= r7) goto L_0x01f4
        L_0x01f3:
            r1 = r8
        L_0x01f4:
            if (r0 != 0) goto L_0x01fc
            if (r1 != 0) goto L_0x01fc
        L_0x01f8:
            r18 = r12
            goto L_0x037f
        L_0x01fc:
            float r5 = (float) r0
            float r7 = (float) r1
            boolean r10 = r6.dispatchNestedPreFling(r5, r7)
            if (r10 != 0) goto L_0x037c
            if (r3 != 0) goto L_0x020a
            if (r4 == 0) goto L_0x0209
            goto L_0x020a
        L_0x0209:
            r9 = r8
        L_0x020a:
            r6.dispatchNestedFling(r5, r7, r9)
            androidx.recyclerview.widget.RecyclerView$n r5 = r6.Q
            if (r5 == 0) goto L_0x031e
            androidx.recyclerview.widget.a0 r5 = (androidx.recyclerview.widget.a0) r5
            androidx.recyclerview.widget.RecyclerView r7 = r5.f2008a
            androidx.recyclerview.widget.RecyclerView$l r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x021c
            goto L_0x0224
        L_0x021c:
            androidx.recyclerview.widget.RecyclerView r10 = r5.f2008a
            androidx.recyclerview.widget.RecyclerView$d r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x0228
        L_0x0224:
            r18 = r12
            goto L_0x031b
        L_0x0228:
            androidx.recyclerview.widget.RecyclerView r10 = r5.f2008a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r1)
            if (r11 > r10) goto L_0x023f
            int r11 = java.lang.Math.abs(r0)
            if (r11 <= r10) goto L_0x023b
            goto L_0x023f
        L_0x023b:
            r18 = r12
            goto L_0x031a
        L_0x023f:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.v.b
            if (r10 != 0) goto L_0x0244
            goto L_0x0256
        L_0x0244:
            androidx.recyclerview.widget.u r5 = (androidx.recyclerview.widget.u) r5
            if (r10 != 0) goto L_0x0249
            goto L_0x0254
        L_0x0249:
            androidx.recyclerview.widget.t r2 = new androidx.recyclerview.widget.t
            androidx.recyclerview.widget.RecyclerView r11 = r5.f2008a
            android.content.Context r11 = r11.getContext()
            r2.<init>(r5, r11)
        L_0x0254:
            if (r2 != 0) goto L_0x025a
        L_0x0256:
            r18 = r12
            goto L_0x0316
        L_0x025a:
            int r8 = r7.A()
            if (r8 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            boolean r11 = r7.f()
            if (r11 == 0) goto L_0x026c
            androidx.recyclerview.widget.s r5 = r5.e(r7)
            goto L_0x0278
        L_0x026c:
            boolean r11 = r7.e()
            if (r11 == 0) goto L_0x0277
            androidx.recyclerview.widget.s r5 = r5.d(r7)
            goto L_0x0278
        L_0x0277:
            r5 = 0
        L_0x0278:
            if (r5 != 0) goto L_0x027e
        L_0x027a:
            r18 = r12
            goto L_0x030a
        L_0x027e:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r14 = r7.w()
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x028c:
            if (r15 >= r14) goto L_0x02b2
            r20 = r14
            android.view.View r14 = r7.v(r15)
            r18 = r12
            if (r14 != 0) goto L_0x0299
            goto L_0x02ab
        L_0x0299:
            int r12 = androidx.recyclerview.widget.u.c(r14, r5)
            if (r12 > 0) goto L_0x02a4
            if (r12 <= r11) goto L_0x02a4
            r11 = r12
            r17 = r14
        L_0x02a4:
            if (r12 < 0) goto L_0x02ab
            if (r12 >= r13) goto L_0x02ab
            r13 = r12
            r16 = r14
        L_0x02ab:
            int r15 = r15 + 1
            r14 = r20
            r12 = r18
            goto L_0x028c
        L_0x02b2:
            r18 = r12
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x02bd
            if (r0 <= 0) goto L_0x02c1
            goto L_0x02bf
        L_0x02bd:
            if (r1 <= 0) goto L_0x02c1
        L_0x02bf:
            r5 = 1
            goto L_0x02c2
        L_0x02c1:
            r5 = 0
        L_0x02c2:
            if (r5 == 0) goto L_0x02cb
            if (r16 == 0) goto L_0x02cb
            int r5 = androidx.recyclerview.widget.RecyclerView.l.G(r16)
            goto L_0x030b
        L_0x02cb:
            if (r5 != 0) goto L_0x02d4
            if (r17 == 0) goto L_0x02d4
            int r5 = androidx.recyclerview.widget.RecyclerView.l.G(r17)
            goto L_0x030b
        L_0x02d4:
            if (r5 == 0) goto L_0x02d8
            r16 = r17
        L_0x02d8:
            if (r16 != 0) goto L_0x02db
            goto L_0x030a
        L_0x02db:
            int r11 = androidx.recyclerview.widget.RecyclerView.l.G(r16)
            int r12 = r7.A()
            if (r10 == 0) goto L_0x02ff
            r10 = r7
            androidx.recyclerview.widget.RecyclerView$v$b r10 = (androidx.recyclerview.widget.RecyclerView.v.b) r10
            int r12 = r12 + -1
            android.graphics.PointF r10 = r10.a(r12)
            if (r10 == 0) goto L_0x02ff
            float r12 = r10.x
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x02fd
            float r10 = r10.y
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x02ff
        L_0x02fd:
            r10 = 1
            goto L_0x0300
        L_0x02ff:
            r10 = 0
        L_0x0300:
            if (r10 != r5) goto L_0x0304
            r5 = -1
            goto L_0x0305
        L_0x0304:
            r5 = 1
        L_0x0305:
            int r5 = r5 + r11
            if (r5 < 0) goto L_0x030a
            if (r5 < r8) goto L_0x030b
        L_0x030a:
            r5 = -1
        L_0x030b:
            r8 = -1
            if (r5 != r8) goto L_0x0310
            r8 = 0
            goto L_0x0316
        L_0x0310:
            r2.f1906a = r5
            r7.w0(r2)
            r8 = 1
        L_0x0316:
            if (r8 == 0) goto L_0x031a
            r8 = 1
            goto L_0x031b
        L_0x031a:
            r8 = 0
        L_0x031b:
            if (r8 == 0) goto L_0x0320
            goto L_0x037a
        L_0x031e:
            r18 = r12
        L_0x0320:
            if (r9 == 0) goto L_0x037e
            if (r4 == 0) goto L_0x0326
            r3 = r3 | 2
        L_0x0326:
            h0.m r2 = r19.getScrollingChildHelper()
            r4 = 1
            r2.g(r3, r4)
            int r2 = r6.S
            int r3 = -r2
            int r0 = java.lang.Math.min(r0, r2)
            int r10 = java.lang.Math.max(r3, r0)
            int r0 = r6.S
            int r2 = -r0
            int r0 = java.lang.Math.min(r1, r0)
            int r11 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.RecyclerView$y r0 = r6.W
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r2 = 2
            r1.setScrollState(r2)
            r1 = 0
            r0.f1935b = r1
            r0.f1934a = r1
            android.view.animation.Interpolator r1 = r0.f1937d
            androidx.recyclerview.widget.RecyclerView$b r2 = I0
            if (r1 == r2) goto L_0x0366
            r0.f1937d = r2
            android.widget.OverScroller r1 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r2)
            r0.f1936c = r1
        L_0x0366:
            android.widget.OverScroller r7 = r0.f1936c
            r8 = 0
            r9 = 0
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r7.fling(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.a()
        L_0x037a:
            r8 = 1
            goto L_0x037f
        L_0x037c:
            r18 = r12
        L_0x037e:
            r8 = 0
        L_0x037f:
            if (r8 != 0) goto L_0x0385
            r8 = 0
        L_0x0382:
            r6.setScrollState(r8)
        L_0x0385:
            r19.X()
            r0 = 1
            goto L_0x03b3
        L_0x038a:
            r18 = r12
            int r0 = r7.getPointerId(r8)
            r6.J = r0
            float r0 = r20.getX()
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.N = r0
            r6.L = r0
            float r0 = r20.getY()
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.O = r0
            r6.M = r0
            if (r11 == 0) goto L_0x03aa
            r10 = r10 | 2
        L_0x03aa:
            h0.m r0 = r19.getScrollingChildHelper()
            r1 = 0
            r0.g(r10, r1)
        L_0x03b2:
            r0 = 0
        L_0x03b3:
            if (r0 != 0) goto L_0x03bd
            android.view.VelocityTracker r0 = r6.K
            r1 = r18
            r0.addMovement(r1)
            goto L_0x03bf
        L_0x03bd:
            r1 = r18
        L_0x03bf:
            r1.recycle()
            r0 = 1
            return r0
        L_0x03c4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[EDGE_INSN: B:106:0x00a2->B:38:0x00a2 ?: BREAK  
    EDGE_INSN: B:107:0x00a2->B:38:0x00a2 ?: BREAK  
    EDGE_INSN: B:108:0x00a2->B:38:0x00a2 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            r1 = 1
            r0.a(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            r11.z(r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            r2 = 0
            r0.f1929i = r2
            r11.c0()
            androidx.recyclerview.widget.c0 r0 = r11.f1825f
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r3 = r0.f2026a
            r3.clear()
            m.e<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f2027b
            r0.b()
            r11.O()
            r11.S()
            boolean r0 = r11.V
            r3 = 0
            if (r0 == 0) goto L_0x0039
            boolean r0 = r11.hasFocus()
            if (r0 == 0) goto L_0x0039
            androidx.recyclerview.widget.RecyclerView$d r0 = r11.k
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r11.getFocusedChild()
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            if (r0 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            android.view.View r0 = r11.A(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r0 = r3
            goto L_0x0049
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView$z r0 = r11.H(r0)
        L_0x0049:
            r4 = -1
            r6 = -1
            if (r0 != 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            r0.f1932m = r4
            r0.f1931l = r6
            r0.f1933n = r6
            goto L_0x00a4
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$w r7 = r11.f1837q0
            androidx.recyclerview.widget.RecyclerView$d r8 = r11.k
            boolean r8 = r8.f1856b
            if (r8 == 0) goto L_0x0061
            long r4 = r0.f1946e
        L_0x0061:
            r7.f1932m = r4
            boolean r4 = r11.f1849y
            if (r4 == 0) goto L_0x0069
        L_0x0067:
            r4 = r6
            goto L_0x007b
        L_0x0069:
            boolean r4 = r0.i()
            if (r4 == 0) goto L_0x0072
            int r4 = r0.f1945d
            goto L_0x007b
        L_0x0072:
            androidx.recyclerview.widget.RecyclerView r4 = r0.f1958r
            if (r4 != 0) goto L_0x0077
            goto L_0x0067
        L_0x0077:
            int r4 = r4.F(r0)
        L_0x007b:
            r7.f1931l = r4
            androidx.recyclerview.widget.RecyclerView$w r4 = r11.f1837q0
            android.view.View r0 = r0.f1942a
        L_0x0081:
            int r5 = r0.getId()
        L_0x0085:
            boolean r7 = r0.isFocused()
            if (r7 != 0) goto L_0x00a2
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r0.hasFocus()
            if (r7 == 0) goto L_0x00a2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getFocusedChild()
            int r7 = r0.getId()
            if (r7 == r6) goto L_0x0085
            goto L_0x0081
        L_0x00a2:
            r4.f1933n = r5
        L_0x00a4:
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            boolean r4 = r0.f1930j
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r11.u0
            if (r4 == 0) goto L_0x00b0
            r4 = r1
            goto L_0x00b1
        L_0x00b0:
            r4 = r2
        L_0x00b1:
            r0.f1928h = r4
            r11.u0 = r2
            r11.f1843t0 = r2
            boolean r4 = r0.k
            r0.f1927g = r4
            androidx.recyclerview.widget.RecyclerView$d r4 = r11.k
            int r4 = r4.a()
            r0.f1925e = r4
            int[] r0 = r11.f1850y0
            r11.C(r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            boolean r0 = r0.f1930j
            r4 = 2
            if (r0 == 0) goto L_0x013d
            androidx.recyclerview.widget.b r0 = r11.f1824e
            int r0 = r0.e()
            r5 = r2
        L_0x00d6:
            if (r5 >= r0) goto L_0x013d
            androidx.recyclerview.widget.b r7 = r11.f1824e
            android.view.View r7 = r7.d(r5)
            androidx.recyclerview.widget.RecyclerView$z r7 = I(r7)
            boolean r8 = r7.o()
            if (r8 != 0) goto L_0x013a
            boolean r8 = r7.g()
            if (r8 == 0) goto L_0x00f5
            androidx.recyclerview.widget.RecyclerView$d r8 = r11.k
            boolean r8 = r8.f1856b
            if (r8 != 0) goto L_0x00f5
            goto L_0x013a
        L_0x00f5:
            androidx.recyclerview.widget.RecyclerView$i r8 = r11.H
            androidx.recyclerview.widget.RecyclerView.i.b(r7)
            r7.d()
            r8.getClass()
            androidx.recyclerview.widget.RecyclerView$i$c r8 = new androidx.recyclerview.widget.RecyclerView$i$c
            r8.<init>()
            r8.a(r7)
            androidx.recyclerview.widget.c0 r9 = r11.f1825f
            r9.b(r7, r8)
            androidx.recyclerview.widget.RecyclerView$w r8 = r11.f1837q0
            boolean r8 = r8.f1928h
            if (r8 == 0) goto L_0x013a
            int r8 = r7.f1951j
            r8 = r8 & r4
            if (r8 == 0) goto L_0x011a
            r8 = r1
            goto L_0x011b
        L_0x011a:
            r8 = r2
        L_0x011b:
            if (r8 == 0) goto L_0x013a
            boolean r8 = r7.i()
            if (r8 != 0) goto L_0x013a
            boolean r8 = r7.o()
            if (r8 != 0) goto L_0x013a
            boolean r8 = r7.g()
            if (r8 != 0) goto L_0x013a
            long r8 = r11.G(r7)
            androidx.recyclerview.widget.c0 r10 = r11.f1825f
            m.e<androidx.recyclerview.widget.RecyclerView$z> r10 = r10.f2027b
            r10.f(r8, r7)
        L_0x013a:
            int r5 = r5 + 1
            goto L_0x00d6
        L_0x013d:
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x01eb
            androidx.recyclerview.widget.b r0 = r11.f1824e
            int r0 = r0.h()
            r5 = r2
        L_0x014a:
            if (r5 >= r0) goto L_0x0167
            androidx.recyclerview.widget.b r7 = r11.f1824e
            android.view.View r7 = r7.g(r5)
            androidx.recyclerview.widget.RecyclerView$z r7 = I(r7)
            boolean r8 = r7.o()
            if (r8 != 0) goto L_0x0164
            int r8 = r7.f1945d
            if (r8 != r6) goto L_0x0164
            int r8 = r7.f1944c
            r7.f1945d = r8
        L_0x0164:
            int r5 = r5 + 1
            goto L_0x014a
        L_0x0167:
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            boolean r5 = r0.f1926f
            r0.f1926f = r2
            androidx.recyclerview.widget.RecyclerView$l r6 = r11.f1830l
            androidx.recyclerview.widget.RecyclerView$r r7 = r11.f1821b
            r6.Z(r7, r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            r0.f1926f = r5
            r0 = r2
        L_0x0179:
            androidx.recyclerview.widget.b r5 = r11.f1824e
            int r5 = r5.e()
            if (r0 >= r5) goto L_0x01eb
            androidx.recyclerview.widget.b r5 = r11.f1824e
            android.view.View r5 = r5.d(r0)
            androidx.recyclerview.widget.RecyclerView$z r5 = I(r5)
            boolean r6 = r5.o()
            if (r6 == 0) goto L_0x0192
            goto L_0x01e8
        L_0x0192:
            androidx.recyclerview.widget.c0 r6 = r11.f1825f
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r6 = r6.f2026a
            java.lang.Object r6 = r6.getOrDefault(r5, r3)
            androidx.recyclerview.widget.c0$a r6 = (androidx.recyclerview.widget.c0.a) r6
            if (r6 == 0) goto L_0x01a6
            int r6 = r6.f2029a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x01a6
            r6 = r1
            goto L_0x01a7
        L_0x01a6:
            r6 = r2
        L_0x01a7:
            if (r6 != 0) goto L_0x01e8
            androidx.recyclerview.widget.RecyclerView.i.b(r5)
            r6 = 8192(0x2000, float:1.14794E-41)
            int r7 = r5.f1951j
            r6 = r6 & r7
            if (r6 == 0) goto L_0x01b5
            r6 = r1
            goto L_0x01b6
        L_0x01b5:
            r6 = r2
        L_0x01b6:
            androidx.recyclerview.widget.RecyclerView$i r7 = r11.H
            r5.d()
            r7.getClass()
            androidx.recyclerview.widget.RecyclerView$i$c r7 = new androidx.recyclerview.widget.RecyclerView$i$c
            r7.<init>()
            r7.a(r5)
            if (r6 == 0) goto L_0x01cc
            r11.U(r5, r7)
            goto L_0x01e8
        L_0x01cc:
            androidx.recyclerview.widget.c0 r6 = r11.f1825f
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r8 = r6.f2026a
            java.lang.Object r8 = r8.getOrDefault(r5, r3)
            androidx.recyclerview.widget.c0$a r8 = (androidx.recyclerview.widget.c0.a) r8
            if (r8 != 0) goto L_0x01e1
            androidx.recyclerview.widget.c0$a r8 = androidx.recyclerview.widget.c0.a.a()
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.c0$a> r6 = r6.f2026a
            r6.put(r5, r8)
        L_0x01e1:
            int r5 = r8.f2029a
            r5 = r5 | r4
            r8.f2029a = r5
            r8.f2030b = r7
        L_0x01e8:
            int r0 = r0 + 1
            goto L_0x0179
        L_0x01eb:
            r11.k()
            r11.P(r1)
            r11.d0(r2)
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.f1837q0
            r0.f1924d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        boolean z9;
        c0();
        O();
        this.f1837q0.a(6);
        this.f1823d.c();
        this.f1837q0.f1925e = this.k.a();
        w wVar = this.f1837q0;
        wVar.f1923c = 0;
        wVar.f1927g = false;
        this.f1830l.Z(this.f1821b, wVar);
        w wVar2 = this.f1837q0;
        wVar2.f1926f = false;
        this.f1822c = null;
        if (!wVar2.f1930j || this.H == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        wVar2.f1930j = z9;
        wVar2.f1924d = 4;
        P(true);
        d0(false);
    }

    public final boolean r(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public final void removeDetachedView(View view, boolean z9) {
        z I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.f1951j &= -257;
            } else if (!I2.o()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(I2);
                throw new IllegalArgumentException(androidx.activity.f.e(this, sb));
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z9);
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z9;
        v vVar = this.f1830l.f1870e;
        boolean z10 = true;
        if (vVar == null || !vVar.f1910e) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 && !K()) {
            z10 = false;
        }
        if (!z10 && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.f1830l.i0(this, view, rect, z9, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        int size = this.f1832n.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1832n.get(i10).b();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public final void requestLayout() {
        if (this.f1840s != 0 || this.u) {
            this.f1842t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void scrollBy(int i10, int i11) {
        l lVar = this.f1830l;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.u) {
            boolean e10 = lVar.e();
            boolean f10 = this.f1830l.f();
            if (e10 || f10) {
                if (!e10) {
                    i10 = 0;
                }
                if (!f10) {
                    i11 = 0;
                }
                Y(i10, i11, (MotionEvent) null);
            }
        }
    }

    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (K()) {
            if (accessibilityEvent != null) {
                i10 = i0.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.w |= i11;
            i11 = 1;
        }
        if (i11 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(x xVar) {
        this.f1848x0 = xVar;
        h0.y.n(this, xVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.f1855a.unregisterObserver(this.f1820a);
            this.k.getClass();
        }
        V();
        a aVar = this.f1823d;
        aVar.l(aVar.f2000b);
        aVar.l(aVar.f2001c);
        d dVar3 = this.k;
        this.k = dVar;
        if (dVar != null) {
            dVar.f1855a.registerObserver(this.f1820a);
        }
        r rVar = this.f1821b;
        d dVar4 = this.k;
        rVar.f1896a.clear();
        rVar.e();
        q c10 = rVar.c();
        if (dVar3 != null) {
            c10.f1891b--;
        }
        if (c10.f1891b == 0) {
            for (int i10 = 0; i10 < c10.f1890a.size(); i10++) {
                c10.f1890a.valueAt(i10).f1892a.clear();
            }
        }
        if (dVar4 != null) {
            c10.f1891b++;
        }
        this.f1837q0.f1926f = true;
        T(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar != null) {
            setChildrenDrawingOrderEnabled(gVar != null);
        }
    }

    public void setClipToPadding(boolean z9) {
        if (z9 != this.f1826g) {
            this.G = null;
            this.E = null;
            this.F = null;
            this.D = null;
        }
        this.f1826g = z9;
        super.setClipToPadding(z9);
        if (this.f1838r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        hVar.getClass();
        this.C = hVar;
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    }

    public void setHasFixedSize(boolean z9) {
        this.f1836q = z9;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.H;
        if (iVar2 != null) {
            iVar2.f();
            this.H.f1857a = null;
        }
        this.H = iVar;
        if (iVar != null) {
            iVar.f1857a = this.f1845v0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        r rVar = this.f1821b;
        rVar.f1900e = i10;
        rVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(l lVar) {
        v vVar;
        if (lVar != this.f1830l) {
            setScrollState(0);
            y yVar = this.W;
            RecyclerView.this.removeCallbacks(yVar);
            yVar.f1936c.abortAnimation();
            l lVar2 = this.f1830l;
            if (!(lVar2 == null || (vVar = lVar2.f1870e) == null)) {
                vVar.d();
            }
            if (this.f1830l != null) {
                i iVar = this.H;
                if (iVar != null) {
                    iVar.f();
                }
                this.f1830l.e0(this.f1821b);
                this.f1830l.f0(this.f1821b);
                r rVar = this.f1821b;
                rVar.f1896a.clear();
                rVar.e();
                if (this.f1835p) {
                    l lVar3 = this.f1830l;
                    lVar3.f1872g = false;
                    lVar3.P(this);
                }
                this.f1830l.r0((RecyclerView) null);
                this.f1830l = null;
            } else {
                r rVar2 = this.f1821b;
                rVar2.f1896a.clear();
                rVar2.e();
            }
            b bVar = this.f1824e;
            bVar.f2013b.g();
            int size = bVar.f2014c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                v vVar2 = (v) bVar.f2012a;
                vVar2.getClass();
                z I2 = I((View) bVar.f2014c.get(size));
                if (I2 != null) {
                    RecyclerView recyclerView = vVar2.f2146a;
                    int i10 = I2.f1956p;
                    if (recyclerView.K()) {
                        I2.f1957q = i10;
                        recyclerView.D0.add(I2);
                    } else {
                        View view = I2.f1942a;
                        WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                        y.d.s(view, i10);
                    }
                    I2.f1956p = 0;
                }
                bVar.f2014c.remove(size);
            }
            v vVar3 = (v) bVar.f2012a;
            int a10 = vVar3.a();
            for (int i11 = 0; i11 < a10; i11++) {
                View childAt = vVar3.f2146a.getChildAt(i11);
                RecyclerView recyclerView2 = vVar3.f2146a;
                recyclerView2.getClass();
                I(childAt);
                d dVar = recyclerView2.k;
                childAt.clearAnimation();
            }
            vVar3.f2146a.removeAllViews();
            this.f1830l = lVar;
            if (lVar != null) {
                if (lVar.f1867b == null) {
                    lVar.r0(this);
                    if (this.f1835p) {
                        this.f1830l.f1872g = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(androidx.activity.f.e(lVar.f1867b, sb));
                }
            }
            this.f1821b.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z9) {
        h0.m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f6711d) {
            View view = scrollingChildHelper.f6710c;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.i.z(view);
        }
        scrollingChildHelper.f6711d = z9;
    }

    public void setOnFlingListener(n nVar) {
        this.Q = nVar;
    }

    @Deprecated
    public void setOnScrollListener(p pVar) {
        this.f1839r0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.V = z9;
    }

    public void setRecycledViewPool(q qVar) {
        r rVar = this.f1821b;
        q qVar2 = rVar.f1902g;
        if (qVar2 != null) {
            qVar2.f1891b--;
        }
        rVar.f1902g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.f1902g.f1891b++;
        }
    }

    public void setRecyclerListener(s sVar) {
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        v vVar;
        if (i10 != this.I) {
            this.I = i10;
            if (i10 != 2) {
                y yVar = this.W;
                RecyclerView.this.removeCallbacks(yVar);
                yVar.f1936c.abortAnimation();
                l lVar = this.f1830l;
                if (!(lVar == null || (vVar = lVar.f1870e) == null)) {
                    vVar.d();
                }
            }
            l lVar2 = this.f1830l;
            if (lVar2 != null) {
                lVar2.d0(i10);
            }
            p pVar = this.f1839r0;
            if (pVar != null) {
                pVar.a(this, i10);
            }
            ArrayList arrayList = this.f1841s0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((p) this.f1841s0.get(size)).a(this, i10);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int i11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                i11 = viewConfiguration.getScaledPagingTouchSlop();
                this.P = i11;
            }
        }
        i11 = viewConfiguration.getScaledTouchSlop();
        this.P = i11;
    }

    public void setViewCacheExtension(x xVar) {
        this.f1821b.getClass();
    }

    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z9) {
        v vVar;
        if (z9 != this.u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z9) {
                this.u = false;
                if (!(!this.f1842t || this.f1830l == null || this.k == null)) {
                    requestLayout();
                }
                this.f1842t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.u = true;
            this.f1844v = true;
            setScrollState(0);
            y yVar = this.W;
            RecyclerView.this.removeCallbacks(yVar);
            yVar.f1936c.abortAnimation();
            l lVar = this.f1830l;
            if (lVar != null && (vVar = lVar.f1870e) != null) {
                vVar.d();
            }
        }
    }

    public final void t(int i10, int i11) {
        this.B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        p pVar = this.f1839r0;
        if (pVar != null) {
            pVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.f1841s0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((p) this.f1841s0.get(size)).b(this, i10, i11);
            }
        }
        this.B--;
    }

    public final void u() {
        int i10;
        int i11;
        if (this.G == null) {
            this.C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.G = edgeEffect;
            if (this.f1826g) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final void v() {
        int i10;
        int i11;
        if (this.D == null) {
            this.C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.D = edgeEffect;
            if (this.f1826g) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final void w() {
        int i10;
        int i11;
        if (this.F == null) {
            this.C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.F = edgeEffect;
            if (this.f1826g) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final void x() {
        int i10;
        int i11;
        if (this.E == null) {
            this.C.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.E = edgeEffect;
            if (this.f1826g) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final String y() {
        StringBuilder g10 = androidx.activity.f.g(" ");
        g10.append(super.toString());
        g10.append(", adapter:");
        g10.append(this.k);
        g10.append(", layout:");
        g10.append(this.f1830l);
        g10.append(", context:");
        g10.append(getContext());
        return g10.toString();
    }

    public final void z(w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.W.f1936c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            wVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        wVar.getClass();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f1830l;
        if (lVar != null) {
            return lVar.u(layoutParams);
        }
        throw new IllegalStateException(androidx.activity.f.e(this, androidx.activity.f.g("RecyclerView has no LayoutManager")));
    }
}
