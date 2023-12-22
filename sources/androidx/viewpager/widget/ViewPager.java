package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.d0;
import androidx.fragment.app.h0;
import androidx.fragment.app.o;
import androidx.lifecycle.g;
import h0.l0;
import h0.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import y.a;

public class ViewPager extends ViewGroup {
    public static final int[] U = {16842931};
    public static final a V = new a();
    public static final b W = new b();
    public int A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int F = -1;
    public VelocityTracker G;
    public int H;
    public int I;
    public int J;
    public int K;
    public EdgeEffect L;
    public EdgeEffect M;
    public boolean N = true;
    public boolean O;
    public int P;
    public ArrayList Q;
    public h R;
    public final c S = new c();
    public int T = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f2155a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f2156b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final e f2157c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2158d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public j1.a f2159e;

    /* renamed from: f  reason: collision with root package name */
    public int f2160f;

    /* renamed from: g  reason: collision with root package name */
    public int f2161g = -1;

    /* renamed from: h  reason: collision with root package name */
    public Parcelable f2162h = null;

    /* renamed from: i  reason: collision with root package name */
    public Scroller f2163i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2164j;
    public i k;

    /* renamed from: l  reason: collision with root package name */
    public int f2165l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f2166m;

    /* renamed from: n  reason: collision with root package name */
    public int f2167n;

    /* renamed from: o  reason: collision with root package name */
    public int f2168o;

    /* renamed from: p  reason: collision with root package name */
    public float f2169p = -3.4028235E38f;

    /* renamed from: q  reason: collision with root package name */
    public float f2170q = Float.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public int f2171r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2172s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2173t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public int f2174v = 1;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2175x;

    /* renamed from: y  reason: collision with root package name */
    public int f2176y;

    /* renamed from: z  reason: collision with root package name */
    public int f2177z;

    public static class a implements Comparator<e> {
        public final int compare(Object obj, Object obj2) {
            return ((e) obj).f2180b - ((e) obj2).f2180b;
        }
    }

    public static class b implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.p();
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public o f2179a;

        /* renamed from: b  reason: collision with root package name */
        public int f2180b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2181c;

        /* renamed from: d  reason: collision with root package name */
        public float f2182d;

        /* renamed from: e  reason: collision with root package name */
        public float f2183e;
    }

    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2184a;

        /* renamed from: b  reason: collision with root package name */
        public int f2185b;

        /* renamed from: c  reason: collision with root package name */
        public float f2186c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2187d;

        public f() {
            super(-1, -1);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.U);
            this.f2185b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class g extends h0.a {
        public g() {
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            j1.a aVar;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            j1.a aVar2 = ViewPager.this.f2159e;
            boolean z9 = true;
            if (aVar2 == null || aVar2.b() <= 1) {
                z9 = false;
            }
            accessibilityEvent.setScrollable(z9);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f2159e) != null) {
                accessibilityEvent.setItemCount(aVar.b());
                accessibilityEvent.setFromIndex(ViewPager.this.f2160f);
                accessibilityEvent.setToIndex(ViewPager.this.f2160f);
            }
        }

        public final void d(View view, i0.f fVar) {
            boolean z9;
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            fVar.g(ViewPager.class.getName());
            j1.a aVar = ViewPager.this.f2159e;
            if (aVar == null || aVar.b() <= 1) {
                z9 = false;
            } else {
                z9 = true;
            }
            fVar.k(z9);
            if (ViewPager.this.canScrollHorizontally(1)) {
                fVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                fVar.a(8192);
            }
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            ViewPager viewPager;
            int i11;
            if (super.g(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i11 = viewPager.f2160f - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i11 = viewPager.f2160f + 1;
            }
            viewPager.setCurrentItem(i11);
            return true;
        }
    }

    public interface h {
        void a(int i10);

        void b(int i10);

        void c(float f10, int i10, int i11);
    }

    public class i extends DataSetObserver {
        public i() {
        }

        public final void onChanged() {
            ViewPager.this.e();
        }

        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public static class j extends n0.a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2190c;

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f2191d;

        public static class a implements Parcelable.ClassLoaderCreator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new j[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
            this.f2190c = parcel.readInt();
            this.f2191d = parcel.readParcelable(classLoader);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("FragmentPager.SavedState{");
            g10.append(Integer.toHexString(System.identityHashCode(this)));
            g10.append(" position=");
            g10.append(this.f2190c);
            g10.append("}");
            return g10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f2190c);
            parcel.writeParcelable(this.f2191d, i10);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f2163i = new Scroller(context2, W);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.A = viewConfiguration.getScaledPagingTouchSlop();
        this.H = (int) (400.0f * f10);
        this.I = viewConfiguration.getScaledMaximumFlingVelocity();
        this.L = new EdgeEffect(context2);
        this.M = new EdgeEffect(context2);
        this.J = (int) (25.0f * f10);
        this.K = (int) (2.0f * f10);
        this.f2176y = (int) (f10 * 16.0f);
        y.n(this, new g());
        if (y.d.c(this) == 0) {
            y.d.s(this, 1);
        }
        y.i.u(this, new j1.b(this));
    }

    public static boolean c(int i10, int i11, int i12, View view, boolean z9) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && c(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z9 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.f2173t != z9) {
            this.f2173t = z9;
        }
    }

    public final e a(int i10, int i11) {
        e eVar = new e();
        eVar.f2180b = i10;
        g8.b bVar = (g8.b) this.f2159e;
        if (bVar.f1449c == null) {
            androidx.fragment.app.y yVar = bVar.f1447a;
            yVar.getClass();
            bVar.f1449c = new androidx.fragment.app.a(yVar);
        }
        long j10 = (long) i10;
        int id = getId();
        o D2 = bVar.f1447a.D("android:switcher:" + id + ":" + j10);
        if (D2 != null) {
            androidx.fragment.app.a aVar = bVar.f1449c;
            aVar.getClass();
            aVar.b(new h0.a(7, D2));
        } else {
            g8.a aVar2 = (g8.a) bVar.f6643f.get(i10);
            Context context = bVar.f6643f.f6388a;
            aVar2.f6642c.putInt("FragmentPagerItem:Position", i10);
            D2 = o.v(context, aVar2.f6641b, aVar2.f6642c);
            androidx.fragment.app.a aVar3 = bVar.f1449c;
            int id2 = getId();
            int id3 = getId();
            aVar3.c(id2, D2, "android:switcher:" + id3 + ":" + j10, 1);
        }
        if (D2 != bVar.f1450d) {
            if (D2.C) {
                D2.C = false;
            }
            if (bVar.f1448b == 1) {
                bVar.f1449c.j(D2, g.c.STARTED);
            } else {
                D2.Z(false);
            }
        }
        bVar.f6644g.f(i10, new WeakReference(D2));
        eVar.f2179a = D2;
        this.f2159e.getClass();
        eVar.f2182d = 1.0f;
        if (i11 < 0 || i11 >= this.f2156b.size()) {
            this.f2156b.add(eVar);
        } else {
            this.f2156b.add(i11, eVar);
        }
        return eVar;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e h10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2180b == this.f2160f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList<View> arrayList) {
        e h10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2180b == this.f2160f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z9;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.f2184a;
        if (view.getClass().getAnnotation(d.class) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        fVar.f2184a = z11;
        if (!this.f2172s) {
            super.addView(view, i10, layoutParams);
        } else if (!z11) {
            fVar.f2187d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r0 > 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        if (r0 <= 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 0
            r2 = 1
            if (r0 != r6) goto L_0x0009
            goto L_0x0062
        L_0x0009:
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r3 = r0.getParent()
        L_0x000f:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001c
            if (r3 != r6) goto L_0x0017
            r3 = r2
            goto L_0x001d
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000f
        L_0x001c:
            r3 = r1
        L_0x001d:
            if (r3 != 0) goto L_0x0063
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0033:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0033
        L_0x004c:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L_0x0062:
            r0 = 0
        L_0x0063:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00af
            if (r3 == r0) goto L_0x00af
            if (r7 != r5) goto L_0x008e
            android.graphics.Rect r4 = r6.f2158d
            android.graphics.Rect r4 = r6.g(r3, r4)
            int r4 = r4.left
            android.graphics.Rect r5 = r6.f2158d
            android.graphics.Rect r5 = r6.g(r0, r5)
            int r5 = r5.left
            if (r0 == 0) goto L_0x00a9
            if (r4 < r5) goto L_0x00a9
            int r0 = r6.f2160f
            if (r0 <= 0) goto L_0x00c9
            goto L_0x00c2
        L_0x008e:
            if (r7 != r4) goto L_0x00c9
            android.graphics.Rect r1 = r6.f2158d
            android.graphics.Rect r1 = r6.g(r3, r1)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2158d
            android.graphics.Rect r2 = r6.g(r0, r2)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00a9
            if (r1 > r2) goto L_0x00a9
            boolean r0 = r6.m()
            goto L_0x00ad
        L_0x00a9:
            boolean r0 = r3.requestFocus()
        L_0x00ad:
            r1 = r0
            goto L_0x00c9
        L_0x00af:
            if (r7 == r5) goto L_0x00be
            if (r7 != r2) goto L_0x00b4
            goto L_0x00be
        L_0x00b4:
            if (r7 == r4) goto L_0x00b9
            r0 = 2
            if (r7 != r0) goto L_0x00c9
        L_0x00b9:
            boolean r1 = r6.m()
            goto L_0x00c9
        L_0x00be:
            int r0 = r6.f2160f
            if (r0 <= 0) goto L_0x00c9
        L_0x00c2:
            int r0 = r0 - r2
            r6.u = r1
            r6.u(r0, r1, r2, r1)
            r1 = r2
        L_0x00c9:
            if (r1 == 0) goto L_0x00d2
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    public final boolean canScrollHorizontally(int i10) {
        if (this.f2159e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f2169p)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f2170q));
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.f2164j = true;
        if (this.f2163i.isFinished() || !this.f2163i.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2163i.getCurrX();
        int currY = this.f2163i.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                this.f2163i.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.k(this);
    }

    public final void d(boolean z9) {
        boolean z10;
        if (this.T == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f2163i.isFinished()) {
                this.f2163i.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2163i.getCurrX();
                int currY = this.f2163i.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.u = false;
        for (int i10 = 0; i10 < this.f2156b.size(); i10++) {
            e eVar = this.f2156b.get(i10);
            if (eVar.f2181c) {
                eVar.f2181c = false;
                z10 = true;
            }
        }
        if (!z10) {
            return;
        }
        if (z9) {
            c cVar = this.S;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.m(this, cVar);
            return;
        }
        this.S.run();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0062
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x005d
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0044
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005d
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.b(r4)
            goto L_0x005e
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x005d
            boolean r6 = r5.b(r1)
            goto L_0x005e
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.m()
            goto L_0x005e
        L_0x0041:
            r6 = 66
            goto L_0x0058
        L_0x0044:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0056
            int r6 = r5.f2160f
            if (r6 <= 0) goto L_0x005d
            int r6 = r6 - r1
            r5.u = r2
            r5.u(r6, r2, r1, r2)
            r6 = r1
            goto L_0x005e
        L_0x0056:
            r6 = 17
        L_0x0058:
            boolean r6 = r5.b(r6)
            goto L_0x005e
        L_0x005d:
            r6 = r2
        L_0x005e:
            if (r6 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2180b == this.f2160f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        j1.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z9 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2159e) != null && aVar.b() > 1)) {
            if (!this.L.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.f2169p * ((float) width));
                this.L.setSize(height, width);
                z9 = false | this.L.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.M.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f2170q + 1.0f)) * ((float) width2));
                this.M.setSize(height2, width2);
                z9 |= this.M.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.L.finish();
            this.M.finish();
        }
        if (z9) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.k(this);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2166m;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e() {
        boolean z9;
        int b10 = this.f2159e.b();
        this.f2155a = b10;
        if (this.f2156b.size() >= (this.f2174v * 2) + 1 || this.f2156b.size() >= b10) {
            z9 = false;
        } else {
            z9 = true;
        }
        int i10 = this.f2160f;
        for (int i11 = 0; i11 < this.f2156b.size(); i11++) {
            j1.a aVar = this.f2159e;
            o oVar = this.f2156b.get(i11).f2179a;
            aVar.getClass();
        }
        Collections.sort(this.f2156b, V);
        if (z9) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                f fVar = (f) getChildAt(i12).getLayoutParams();
                if (!fVar.f2184a) {
                    fVar.f2186c = 0.0f;
                }
            }
            u(i10, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i10) {
        h hVar = this.R;
        if (hVar != null) {
            hVar.b(i10);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar2 = (h) this.Q.get(i11);
                if (hVar2 != null) {
                    hVar2.b(i10);
                }
            }
        }
    }

    public final Rect g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                return rect;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public j1.a getAdapter() {
        return this.f2159e;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f2160f;
    }

    public int getOffscreenPageLimit() {
        return this.f2174v;
    }

    public int getPageMargin() {
        return this.f2165l;
    }

    public final e h(View view) {
        for (int i10 = 0; i10 < this.f2156b.size(); i10++) {
            e eVar = this.f2156b.get(i10);
            j1.a aVar = this.f2159e;
            o oVar = eVar.f2179a;
            ((d0) aVar).getClass();
            if (oVar.F == view) {
                return eVar;
            }
        }
        return null;
    }

    public final e i() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f11 = clientWidth > 0 ? ((float) this.f2165l) / ((float) clientWidth) : 0.0f;
        e eVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z9 = true;
        float f12 = 0.0f;
        while (i11 < this.f2156b.size()) {
            e eVar2 = this.f2156b.get(i11);
            if (!z9 && eVar2.f2180b != (i10 = i12 + 1)) {
                eVar2 = this.f2157c;
                eVar2.f2183e = f10 + f12 + f11;
                eVar2.f2180b = i10;
                this.f2159e.getClass();
                eVar2.f2182d = 1.0f;
                i11--;
            }
            f10 = eVar2.f2183e;
            float f13 = eVar2.f2182d + f10 + f11;
            if (!z9 && scrollX < f10) {
                return eVar;
            }
            if (scrollX < f13 || i11 == this.f2156b.size() - 1) {
                return eVar2;
            }
            i12 = eVar2.f2180b;
            f12 = eVar2.f2182d;
            i11++;
            z9 = false;
            eVar = eVar2;
        }
        return eVar;
    }

    public final e j(int i10) {
        for (int i11 = 0; i11 < this.f2156b.size(); i11++) {
            e eVar = this.f2156b.get(i11);
            if (eVar.f2180b == i10) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(float r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.P
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r2
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.f2184a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f2185b
            r9 = r9 & 7
            if (r9 == r1) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$h r0 = r12.R
            if (r0 == 0) goto L_0x0072
            r0.c(r13, r14, r15)
        L_0x0072:
            java.util.ArrayList r0 = r12.Q
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
        L_0x007a:
            if (r2 >= r0) goto L_0x008c
            java.util.ArrayList r3 = r12.Q
            java.lang.Object r3 = r3.get(r2)
            androidx.viewpager.widget.ViewPager$h r3 = (androidx.viewpager.widget.ViewPager.h) r3
            if (r3 == 0) goto L_0x0089
            r3.c(r13, r14, r15)
        L_0x0089:
            int r2 = r2 + 1
            goto L_0x007a
        L_0x008c:
            r12.O = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(float, int, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.B = motionEvent.getX(i10);
            this.F = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        j1.a aVar = this.f2159e;
        if (aVar == null || this.f2160f >= aVar.b() - 1) {
            return false;
        }
        this.u = false;
        u(this.f2160f + 1, 0, true, false);
        return true;
    }

    public final boolean n(int i10) {
        if (this.f2156b.size() != 0) {
            e i11 = i();
            int clientWidth = getClientWidth();
            int i12 = this.f2165l;
            int i13 = clientWidth + i12;
            float f10 = (float) clientWidth;
            int i14 = i11.f2180b;
            float f11 = ((((float) i10) / f10) - i11.f2183e) / (i11.f2182d + (((float) i12) / f10));
            this.O = false;
            k(f11, i14, (int) (((float) i13) * f11));
            if (this.O) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.N) {
            return false;
        } else {
            this.O = false;
            k(0.0f, 0, 0);
            if (this.O) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final boolean o(float f10) {
        boolean z9;
        boolean z10;
        float f11 = this.B - f10;
        this.B = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.f2169p * clientWidth;
        float f13 = this.f2170q * clientWidth;
        boolean z11 = false;
        e eVar = this.f2156b.get(0);
        ArrayList<e> arrayList = this.f2156b;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f2180b != 0) {
            f12 = eVar.f2183e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (eVar2.f2180b != this.f2159e.b() - 1) {
            f13 = eVar2.f2183e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z9) {
                this.L.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.M.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.B = (scrollX - ((float) i10)) + this.B;
        scrollTo(i10, getScrollY());
        n(i10);
        return z11;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.S);
        Scroller scroller = this.f2163i;
        if (scroller != null && !scroller.isFinished()) {
            this.f2163i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f2165l
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.f2166m
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r1 = r0.f2156b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            j1.a r1 = r0.f2159e
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f2165l
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r5 = r0.f2156b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            float r7 = r5.f2183e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f2156b
            int r8 = r8.size()
            int r9 = r5.f2180b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f2156b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            int r10 = r10.f2180b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f2180b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r5 = r0.f2156b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0064
            float r7 = r5.f2183e
            float r11 = r5.f2182d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0064:
            j1.a r11 = r0.f2159e
            r11.getClass()
            r11 = 1065353216(0x3f800000, float:1.0)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r11 = r11 + r7
            r7 = r11
        L_0x0071:
            int r11 = r0.f2165l
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.f2166m
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f2167n
            int r15 = r0.f2165l
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f2168o
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f2166m
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z9;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.w) {
                return true;
            }
            if (this.f2175x) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.D = x9;
            this.B = x9;
            float y9 = motionEvent.getY();
            this.E = y9;
            this.C = y9;
            this.F = motionEvent.getPointerId(0);
            this.f2175x = false;
            this.f2164j = true;
            this.f2163i.computeScrollOffset();
            if (this.T != 2 || Math.abs(this.f2163i.getFinalX() - this.f2163i.getCurrX()) <= this.K) {
                d(false);
                this.w = false;
            } else {
                this.f2163i.abortAnimation();
                this.u = false;
                p();
                this.w = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.F;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x10 = motionEvent.getX(findPointerIndex);
                float f11 = x10 - this.B;
                float abs = Math.abs(f11);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y10 - this.E);
                int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    float f12 = this.B;
                    if ((f12 >= ((float) this.f2177z) || i11 <= 0) && (f12 <= ((float) (getWidth() - this.f2177z)) || f11 >= 0.0f)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (!z9 && c((int) f11, (int) x10, (int) y10, this, false)) {
                        this.B = x10;
                        this.C = y10;
                        this.f2175x = true;
                        return false;
                    }
                }
                float f13 = (float) this.A;
                if (abs > f13 && abs * 0.5f > abs2) {
                    this.w = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f14 = this.D;
                    float f15 = (float) this.A;
                    if (i11 > 0) {
                        f10 = f14 + f15;
                    } else {
                        f10 = f14 - f15;
                    }
                    this.B = f10;
                    this.C = y10;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f13) {
                    this.f2175x = true;
                }
                if (this.w && o(x10)) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.k(this);
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        return this.w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r12 = (androidx.viewpager.widget.ViewPager.f) r12
            boolean r14 = r12.f2184a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f2185b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.f2184a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$e r10 = r0.h(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f2183e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f2187d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f2187d = r14
            float r9 = r9.f2186c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.f2167n = r5
            int r3 = r3 - r7
            r0.f2168o = r3
            r0.P = r11
            boolean r1 = r0.N
            if (r1 == 0) goto L_0x0118
            int r1 = r0.f2160f
            r2 = 0
            r0.t(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.N = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i10, int i11) {
        f fVar;
        f fVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f2177z = Math.min(measuredWidth / 10, this.f2176y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z9 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt.getVisibility() == 8 || (fVar2 = (f) childAt.getLayoutParams()) == null || !fVar2.f2184a)) {
                int i15 = fVar2.f2185b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z10 = i17 == 48 || i17 == 80;
                if (!(i16 == 3 || i16 == 5)) {
                    z9 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z9 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = fVar2.width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = fVar2.height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z9) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f2171r = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f2172s = true;
        p();
        this.f2172s = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f2184a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * fVar.f2186c), 1073741824), this.f2171r);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        e h10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2180b == this.f2160f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i12 += i11;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f9479a);
        if (this.f2159e != null) {
            u(jVar.f2190c, 0, false, true);
            return;
        }
        this.f2161g = jVar.f2190c;
        this.f2162h = jVar.f2191d;
    }

    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f2190c = this.f2160f;
        j1.a aVar = this.f2159e;
        if (aVar != null) {
            aVar.getClass();
            jVar.f2191d = null;
        }
        return jVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f2165l;
            r(i10, i12, i14, i14);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r0 = r10.getEdgeFlags()
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            j1.a r0 = r9.f2159e
            if (r0 == 0) goto L_0x01a2
            int r0 = r0.b()
            if (r0 != 0) goto L_0x001a
            goto L_0x01a2
        L_0x001a:
            android.view.VelocityTracker r0 = r9.G
            if (r0 != 0) goto L_0x0024
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.G = r0
        L_0x0024:
            android.view.VelocityTracker r0 = r9.G
            r0.addMovement(r10)
            int r0 = r10.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L_0x017a
            r3 = -1
            if (r0 == r2) goto L_0x00e4
            r4 = 2
            if (r0 == r4) goto L_0x006f
            r3 = 3
            if (r0 == r3) goto L_0x0064
            r3 = 5
            if (r0 == r3) goto L_0x0054
            r3 = 6
            if (r0 == r3) goto L_0x0043
            goto L_0x019a
        L_0x0043:
            r9.l(r10)
            int r0 = r9.F
            int r0 = r10.findPointerIndex(r0)
            float r10 = r10.getX(r0)
            r9.B = r10
            goto L_0x019a
        L_0x0054:
            int r0 = r10.getActionIndex()
            float r3 = r10.getX(r0)
            r9.B = r3
            int r10 = r10.getPointerId(r0)
            goto L_0x0198
        L_0x0064:
            boolean r10 = r9.w
            if (r10 == 0) goto L_0x019a
            int r10 = r9.f2160f
            r9.t(r10, r1, r2, r1)
            goto L_0x0175
        L_0x006f:
            boolean r0 = r9.w
            if (r0 != 0) goto L_0x00cf
            int r0 = r9.F
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x007d
            goto L_0x0175
        L_0x007d:
            float r3 = r10.getX(r0)
            float r4 = r9.B
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r10.getY(r0)
            float r5 = r9.C
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r9.A
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cf
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00cf
            r9.w = r2
            android.view.ViewParent r4 = r9.getParent()
            if (r4 == 0) goto L_0x00ab
            r4.requestDisallowInterceptTouchEvent(r2)
        L_0x00ab:
            float r4 = r9.D
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b8
            int r3 = r9.A
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bc
        L_0x00b8:
            int r3 = r9.A
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bc:
            r9.B = r4
            r9.C = r0
            r9.setScrollState(r2)
            r9.setScrollingCacheEnabled(r2)
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L_0x00cf
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00cf:
            boolean r0 = r9.w
            if (r0 == 0) goto L_0x019a
            int r0 = r9.F
            int r0 = r10.findPointerIndex(r0)
            float r10 = r10.getX(r0)
            boolean r10 = r9.o(r10)
            r1 = r1 | r10
            goto L_0x019a
        L_0x00e4:
            boolean r0 = r9.w
            if (r0 == 0) goto L_0x019a
            android.view.VelocityTracker r0 = r9.G
            r4 = 1000(0x3e8, float:1.401E-42)
            int r5 = r9.I
            float r5 = (float) r5
            r0.computeCurrentVelocity(r4, r5)
            int r4 = r9.F
            float r0 = r0.getXVelocity(r4)
            int r0 = (int) r0
            r9.u = r2
            int r4 = r9.getClientWidth()
            int r5 = r9.getScrollX()
            androidx.viewpager.widget.ViewPager$e r6 = r9.i()
            int r7 = r9.f2165l
            float r7 = (float) r7
            float r4 = (float) r4
            float r7 = r7 / r4
            int r8 = r6.f2180b
            float r5 = (float) r5
            float r5 = r5 / r4
            float r4 = r6.f2183e
            float r5 = r5 - r4
            float r4 = r6.f2182d
            float r4 = r4 + r7
            float r5 = r5 / r4
            int r4 = r9.F
            int r4 = r10.findPointerIndex(r4)
            float r10 = r10.getX(r4)
            float r4 = r9.D
            float r10 = r10 - r4
            int r10 = (int) r10
            int r10 = java.lang.Math.abs(r10)
            int r4 = r9.J
            if (r10 <= r4) goto L_0x013b
            int r10 = java.lang.Math.abs(r0)
            int r4 = r9.H
            if (r10 <= r4) goto L_0x013b
            if (r0 <= 0) goto L_0x0138
            goto L_0x0149
        L_0x0138:
            int r8 = r8 + 1
            goto L_0x0149
        L_0x013b:
            int r10 = r9.f2160f
            if (r8 < r10) goto L_0x0143
            r10 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x0146
        L_0x0143:
            r10 = 1058642330(0x3f19999a, float:0.6)
        L_0x0146:
            float r5 = r5 + r10
            int r10 = (int) r5
            int r8 = r8 + r10
        L_0x0149:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r9.f2156b
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0172
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r9.f2156b
            java.lang.Object r10 = r10.get(r1)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r1 = r9.f2156b
            int r4 = r1.size()
            int r4 = r4 + r3
            java.lang.Object r1 = r1.get(r4)
            androidx.viewpager.widget.ViewPager$e r1 = (androidx.viewpager.widget.ViewPager.e) r1
            int r10 = r10.f2180b
            int r1 = r1.f2180b
            int r1 = java.lang.Math.min(r8, r1)
            int r8 = java.lang.Math.max(r10, r1)
        L_0x0172:
            r9.u(r8, r0, r2, r2)
        L_0x0175:
            boolean r1 = r9.s()
            goto L_0x019a
        L_0x017a:
            android.widget.Scroller r0 = r9.f2163i
            r0.abortAnimation()
            r9.u = r1
            r9.p()
            float r0 = r10.getX()
            r9.D = r0
            r9.B = r0
            float r0 = r10.getY()
            r9.E = r0
            r9.C = r0
            int r10 = r10.getPointerId(r1)
        L_0x0198:
            r9.F = r10
        L_0x019a:
            if (r1 == 0) goto L_0x01a1
            java.util.WeakHashMap<android.view.View, h0.l0> r10 = h0.y.f6776a
            h0.y.d.k(r9)
        L_0x01a1:
            return r2
        L_0x01a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        q(this.f2160f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r5 == r6) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r6 >= 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r6 >= 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        if (r6 >= 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012f, code lost:
        if (r10 < r14.f2156b.size()) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0143, code lost:
        if (r10 < r14.f2156b.size()) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0155, code lost:
        if (r10 < r14.f2156b.size()) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0160, code lost:
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r15) {
        /*
            r14 = this;
            int r0 = r14.f2160f
            if (r0 == r15) goto L_0x000b
            androidx.viewpager.widget.ViewPager$e r0 = r14.j(r0)
            r14.f2160f = r15
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            j1.a r15 = r14.f2159e
            if (r15 != 0) goto L_0x0011
            return
        L_0x0011:
            boolean r15 = r14.u
            if (r15 == 0) goto L_0x0016
            return
        L_0x0016:
            android.os.IBinder r15 = r14.getWindowToken()
            if (r15 != 0) goto L_0x001d
            return
        L_0x001d:
            j1.a r15 = r14.f2159e
            r15.c(r14)
            int r15 = r14.f2174v
            int r1 = r14.f2160f
            int r1 = r1 - r15
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            j1.a r3 = r14.f2159e
            int r3 = r3.b()
            int r4 = r3 + -1
            int r5 = r14.f2160f
            int r5 = r5 + r15
            int r15 = java.lang.Math.min(r4, r5)
            int r4 = r14.f2155a
            if (r3 != r4) goto L_0x038b
        L_0x003f:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r14.f2156b
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x005b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r14.f2156b
            java.lang.Object r4 = r4.get(r2)
            androidx.viewpager.widget.ViewPager$e r4 = (androidx.viewpager.widget.ViewPager.e) r4
            int r5 = r4.f2180b
            int r6 = r14.f2160f
            if (r5 < r6) goto L_0x0058
            if (r5 != r6) goto L_0x005b
            goto L_0x005c
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 != 0) goto L_0x0066
            if (r3 <= 0) goto L_0x0066
            int r4 = r14.f2160f
            androidx.viewpager.widget.ViewPager$e r4 = r14.a(r4, r2)
        L_0x0066:
            r5 = 1
            if (r4 == 0) goto L_0x02e0
            int r6 = r2 + -1
            if (r6 < 0) goto L_0x0076
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            int r8 = r14.getClientWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 > 0) goto L_0x0081
            r10 = 0
            goto L_0x008d
        L_0x0081:
            float r10 = r4.f2182d
            float r10 = r9 - r10
            int r11 = r14.getPaddingLeft()
            float r11 = (float) r11
            float r12 = (float) r8
            float r11 = r11 / r12
            float r10 = r10 + r11
        L_0x008d:
            int r11 = r14.f2160f
            int r11 = r11 - r5
            r12 = 0
        L_0x0091:
            if (r11 < 0) goto L_0x00df
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x00b7
            if (r11 >= r1) goto L_0x00b7
            if (r7 != 0) goto L_0x009c
            goto L_0x00df
        L_0x009c:
            int r13 = r7.f2180b
            if (r11 != r13) goto L_0x00dc
            boolean r13 = r7.f2181c
            if (r13 != 0) goto L_0x00dc
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r13 = r14.f2156b
            r13.remove(r6)
            j1.a r13 = r14.f2159e
            androidx.fragment.app.o r7 = r7.f2179a
            r13.a(r11, r7)
            int r6 = r6 + -1
            int r2 = r2 + -1
            if (r6 < 0) goto L_0x00db
            goto L_0x00d2
        L_0x00b7:
            if (r7 == 0) goto L_0x00c5
            int r13 = r7.f2180b
            if (r11 != r13) goto L_0x00c5
            float r7 = r7.f2182d
            float r12 = r12 + r7
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00db
            goto L_0x00d2
        L_0x00c5:
            int r7 = r6 + 1
            androidx.viewpager.widget.ViewPager$e r7 = r14.a(r11, r7)
            float r7 = r7.f2182d
            float r12 = r12 + r7
            int r2 = r2 + 1
            if (r6 < 0) goto L_0x00db
        L_0x00d2:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x00dc
        L_0x00db:
            r7 = 0
        L_0x00dc:
            int r11 = r11 + -1
            goto L_0x0091
        L_0x00df:
            float r1 = r4.f2182d
            int r6 = r2 + 1
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0164
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00f8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x00f9
        L_0x00f8:
            r7 = 0
        L_0x00f9:
            if (r8 > 0) goto L_0x00fd
            r8 = 0
            goto L_0x0106
        L_0x00fd:
            int r10 = r14.getPaddingRight()
            float r10 = (float) r10
            float r8 = (float) r8
            float r10 = r10 / r8
            float r8 = r10 + r9
        L_0x0106:
            int r9 = r14.f2160f
            int r9 = r9 + r5
            r10 = r6
        L_0x010a:
            if (r9 >= r3) goto L_0x0164
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x0132
            if (r9 <= r15) goto L_0x0132
            if (r7 != 0) goto L_0x0115
            goto L_0x0164
        L_0x0115:
            int r11 = r7.f2180b
            if (r9 != r11) goto L_0x0161
            boolean r11 = r7.f2181c
            if (r11 != 0) goto L_0x0161
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r11 = r14.f2156b
            r11.remove(r10)
            j1.a r11 = r14.f2159e
            androidx.fragment.app.o r7 = r7.f2179a
            r11.a(r9, r7)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            int r7 = r7.size()
            if (r10 >= r7) goto L_0x0160
            goto L_0x0157
        L_0x0132:
            if (r7 == 0) goto L_0x0146
            int r11 = r7.f2180b
            if (r9 != r11) goto L_0x0146
            float r7 = r7.f2182d
            float r1 = r1 + r7
            int r10 = r10 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            int r7 = r7.size()
            if (r10 >= r7) goto L_0x0160
            goto L_0x0157
        L_0x0146:
            androidx.viewpager.widget.ViewPager$e r7 = r14.a(r9, r10)
            int r10 = r10 + 1
            float r7 = r7.f2182d
            float r1 = r1 + r7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            int r7 = r7.size()
            if (r10 >= r7) goto L_0x0160
        L_0x0157:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r14.f2156b
            java.lang.Object r7 = r7.get(r10)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            int r9 = r9 + 1
            goto L_0x010a
        L_0x0164:
            j1.a r15 = r14.f2159e
            int r15 = r15.b()
            int r1 = r14.getClientWidth()
            if (r1 <= 0) goto L_0x0176
            int r3 = r14.f2165l
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 / r1
            goto L_0x0177
        L_0x0176:
            r3 = 0
        L_0x0177:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01ff
            int r7 = r0.f2180b
            int r8 = r4.f2180b
            if (r7 >= r8) goto L_0x01c4
            float r8 = r0.f2183e
            float r0 = r0.f2182d
            float r8 = r8 + r0
            float r8 = r8 + r3
            r0 = 0
        L_0x0188:
            int r7 = r7 + r5
            int r9 = r4.f2180b
            if (r7 > r9) goto L_0x01ff
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r14.f2156b
            int r9 = r9.size()
            if (r0 >= r9) goto L_0x01ff
        L_0x0195:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r14.f2156b
            java.lang.Object r9 = r9.get(r0)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            int r10 = r9.f2180b
            if (r7 <= r10) goto L_0x01ae
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r14.f2156b
            int r10 = r10.size()
            int r10 = r10 + -1
            if (r0 >= r10) goto L_0x01ae
            int r0 = r0 + 1
            goto L_0x0195
        L_0x01ae:
            int r10 = r9.f2180b
            if (r7 >= r10) goto L_0x01bd
            j1.a r10 = r14.f2159e
            r10.getClass()
            float r10 = r1 + r3
            float r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x01ae
        L_0x01bd:
            r9.f2183e = r8
            float r9 = r9.f2182d
            float r9 = r9 + r3
            float r8 = r8 + r9
            goto L_0x0188
        L_0x01c4:
            if (r7 <= r8) goto L_0x01ff
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r14.f2156b
            int r8 = r8.size()
            int r8 = r8 + -1
            float r0 = r0.f2183e
        L_0x01d0:
            int r7 = r7 + -1
            int r9 = r4.f2180b
            if (r7 < r9) goto L_0x01ff
            if (r8 < 0) goto L_0x01ff
        L_0x01d8:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r14.f2156b
            java.lang.Object r9 = r9.get(r8)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            int r10 = r9.f2180b
            if (r7 >= r10) goto L_0x01e9
            if (r8 <= 0) goto L_0x01e9
            int r8 = r8 + -1
            goto L_0x01d8
        L_0x01e9:
            int r10 = r9.f2180b
            if (r7 <= r10) goto L_0x01f8
            j1.a r10 = r14.f2159e
            r10.getClass()
            float r10 = r1 + r3
            float r0 = r0 - r10
            int r7 = r7 + -1
            goto L_0x01e9
        L_0x01f8:
            float r10 = r9.f2182d
            float r10 = r10 + r3
            float r0 = r0 - r10
            r9.f2183e = r0
            goto L_0x01d0
        L_0x01ff:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r0 = r14.f2156b
            int r0 = r0.size()
            float r7 = r4.f2183e
            int r8 = r4.f2180b
            int r9 = r8 + -1
            if (r8 != 0) goto L_0x020f
            r10 = r7
            goto L_0x0212
        L_0x020f:
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0212:
            r14.f2169p = r10
            int r15 = r15 + -1
            if (r8 != r15) goto L_0x021d
            float r8 = r4.f2182d
            float r8 = r8 + r7
            float r8 = r8 - r1
            goto L_0x0220
        L_0x021d:
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0220:
            r14.f2170q = r8
            int r2 = r2 + -1
        L_0x0224:
            if (r2 < 0) goto L_0x024c
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r14.f2156b
            java.lang.Object r8 = r8.get(r2)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
        L_0x022e:
            int r10 = r8.f2180b
            if (r9 <= r10) goto L_0x023d
            j1.a r10 = r14.f2159e
            int r9 = r9 + -1
            r10.getClass()
            float r10 = r1 + r3
            float r7 = r7 - r10
            goto L_0x022e
        L_0x023d:
            float r11 = r8.f2182d
            float r11 = r11 + r3
            float r7 = r7 - r11
            r8.f2183e = r7
            if (r10 != 0) goto L_0x0247
            r14.f2169p = r7
        L_0x0247:
            int r2 = r2 + -1
            int r9 = r9 + -1
            goto L_0x0224
        L_0x024c:
            float r2 = r4.f2183e
            float r7 = r4.f2182d
            float r2 = r2 + r7
            float r2 = r2 + r3
            int r7 = r4.f2180b
            int r7 = r7 + r5
        L_0x0255:
            if (r6 >= r0) goto L_0x0281
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r14.f2156b
            java.lang.Object r8 = r8.get(r6)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
        L_0x025f:
            int r9 = r8.f2180b
            if (r7 >= r9) goto L_0x026e
            j1.a r9 = r14.f2159e
            int r7 = r7 + 1
            r9.getClass()
            float r9 = r1 + r3
            float r2 = r2 + r9
            goto L_0x025f
        L_0x026e:
            if (r9 != r15) goto L_0x0276
            float r9 = r8.f2182d
            float r9 = r9 + r2
            float r9 = r9 - r1
            r14.f2170q = r9
        L_0x0276:
            r8.f2183e = r2
            float r8 = r8.f2182d
            float r8 = r8 + r3
            float r2 = r2 + r8
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L_0x0255
        L_0x0281:
            j1.a r15 = r14.f2159e
            androidx.fragment.app.o r0 = r4.f2179a
            androidx.fragment.app.d0 r15 = (androidx.fragment.app.d0) r15
            r15.getClass()
            androidx.fragment.app.o r1 = r15.f1450d
            if (r0 == r1) goto L_0x02e0
            if (r1 == 0) goto L_0x02b9
            boolean r2 = r1.C
            if (r2 == 0) goto L_0x0297
            r2 = 0
            r1.C = r2
        L_0x0297:
            int r2 = r15.f1448b
            if (r2 != r5) goto L_0x02b5
            androidx.fragment.app.a r1 = r15.f1449c
            if (r1 != 0) goto L_0x02ab
            androidx.fragment.app.y r1 = r15.f1447a
            r1.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r1)
            r15.f1449c = r2
        L_0x02ab:
            androidx.fragment.app.a r1 = r15.f1449c
            androidx.fragment.app.o r2 = r15.f1450d
            androidx.lifecycle.g$c r3 = androidx.lifecycle.g.c.STARTED
            r1.j(r2, r3)
            goto L_0x02b9
        L_0x02b5:
            r2 = 0
            r1.Z(r2)
        L_0x02b9:
            boolean r1 = r0.C
            if (r1 == r5) goto L_0x02bf
            r0.C = r5
        L_0x02bf:
            int r1 = r15.f1448b
            if (r1 != r5) goto L_0x02db
            androidx.fragment.app.a r1 = r15.f1449c
            if (r1 != 0) goto L_0x02d3
            androidx.fragment.app.y r1 = r15.f1447a
            r1.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r1)
            r15.f1449c = r2
        L_0x02d3:
            androidx.fragment.app.a r1 = r15.f1449c
            androidx.lifecycle.g$c r2 = androidx.lifecycle.g.c.RESUMED
            r1.j(r0, r2)
            goto L_0x02de
        L_0x02db:
            r0.Z(r5)
        L_0x02de:
            r15.f1450d = r0
        L_0x02e0:
            j1.a r15 = r14.f2159e
            androidx.fragment.app.d0 r15 = (androidx.fragment.app.d0) r15
            androidx.fragment.app.a r0 = r15.f1449c
            if (r0 == 0) goto L_0x030d
            boolean r1 = r15.f1451e
            if (r1 != 0) goto L_0x0308
            r15.f1451e = r5     // Catch:{ all -> 0x0303 }
            boolean r1 = r0.f1496g     // Catch:{ all -> 0x0303 }
            if (r1 != 0) goto L_0x02fb
            androidx.fragment.app.y r1 = r0.f1409p     // Catch:{ all -> 0x0303 }
            r1.z(r0, r5)     // Catch:{ all -> 0x0303 }
            r0 = 0
            r15.f1451e = r0
            goto L_0x0309
        L_0x02fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0303 }
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)     // Catch:{ all -> 0x0303 }
            throw r0     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r0 = move-exception
            r1 = 0
            r15.f1451e = r1
            throw r0
        L_0x0308:
            r0 = 0
        L_0x0309:
            r1 = 0
            r15.f1449c = r1
            goto L_0x030f
        L_0x030d:
            r1 = 0
            r0 = 0
        L_0x030f:
            int r15 = r14.getChildCount()
            r2 = r0
        L_0x0314:
            if (r2 >= r15) goto L_0x0340
            android.view.View r3 = r14.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r4 = (androidx.viewpager.widget.ViewPager.f) r4
            r4.getClass()
            boolean r5 = r4.f2184a
            if (r5 != 0) goto L_0x033d
            float r5 = r4.f2186c
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x033d
            androidx.viewpager.widget.ViewPager$e r3 = r14.h(r3)
            if (r3 == 0) goto L_0x033d
            float r5 = r3.f2182d
            r4.f2186c = r5
            int r3 = r3.f2180b
            r4.getClass()
        L_0x033d:
            int r2 = r2 + 1
            goto L_0x0314
        L_0x0340:
            boolean r15 = r14.hasFocus()
            if (r15 == 0) goto L_0x038a
            android.view.View r15 = r14.findFocus()
            if (r15 == 0) goto L_0x0361
        L_0x034c:
            android.view.ViewParent r2 = r15.getParent()
            if (r2 == r14) goto L_0x035d
            if (r2 == 0) goto L_0x0361
            boolean r15 = r2 instanceof android.view.View
            if (r15 != 0) goto L_0x0359
            goto L_0x0361
        L_0x0359:
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            goto L_0x034c
        L_0x035d:
            androidx.viewpager.widget.ViewPager$e r1 = r14.h(r15)
        L_0x0361:
            if (r1 == 0) goto L_0x0369
            int r15 = r1.f2180b
            int r1 = r14.f2160f
            if (r15 == r1) goto L_0x038a
        L_0x0369:
            int r15 = r14.getChildCount()
            if (r0 >= r15) goto L_0x038a
            android.view.View r15 = r14.getChildAt(r0)
            androidx.viewpager.widget.ViewPager$e r1 = r14.h(r15)
            if (r1 == 0) goto L_0x0387
            int r1 = r1.f2180b
            int r2 = r14.f2160f
            if (r1 != r2) goto L_0x0387
            r1 = 2
            boolean r15 = r15.requestFocus(r1)
            if (r15 == 0) goto L_0x0387
            goto L_0x038a
        L_0x0387:
            int r0 = r0 + 1
            goto L_0x0369
        L_0x038a:
            return
        L_0x038b:
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ NotFoundException -> 0x0398 }
            int r0 = r14.getId()     // Catch:{ NotFoundException -> 0x0398 }
            java.lang.String r15 = r15.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0398 }
            goto L_0x03a0
        L_0x0398:
            int r15 = r14.getId()
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
        L_0x03a0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            int r2 = r14.f2155a
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " Pager id: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = " Pager class: "
            r1.append(r15)
            java.lang.Class r15 = r14.getClass()
            r1.append(r15)
            java.lang.String r15 = " Problematic adapter: "
            r1.append(r15)
            j1.a r15 = r14.f2159e
            java.lang.Class r15 = r15.getClass()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.f2156b.isEmpty()) {
            e j10 = j(this.f2160f);
            min = (int) ((j10 != null ? Math.min(j10.f2183e, this.f2170q) : 0.0f) * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                d(false);
            } else {
                return;
            }
        } else if (!this.f2163i.isFinished()) {
            this.f2163i.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)));
        }
        scrollTo(min, getScrollY());
    }

    public final void removeView(View view) {
        if (this.f2172s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.F = -1;
        this.w = false;
        this.f2175x = false;
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G = null;
        }
        this.L.onRelease();
        this.M.onRelease();
        if (this.L.isFinished() || this.M.isFinished()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public void setAdapter(j1.a aVar) {
        j1.a aVar2 = this.f2159e;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f2159e.c(this);
            for (int i10 = 0; i10 < this.f2156b.size(); i10++) {
                e eVar = this.f2156b.get(i10);
                this.f2159e.a(eVar.f2180b, eVar.f2179a);
            }
            d0 d0Var = (d0) this.f2159e;
            androidx.fragment.app.a aVar3 = d0Var.f1449c;
            if (aVar3 != null) {
                if (!d0Var.f1451e) {
                    try {
                        d0Var.f1451e = true;
                        if (!aVar3.f1496g) {
                            aVar3.f1409p.z(aVar3, true);
                            d0Var.f1451e = false;
                        } else {
                            throw new IllegalStateException("This transaction is already being added to the back stack");
                        }
                    } catch (Throwable th) {
                        d0Var.f1451e = false;
                        throw th;
                    }
                }
                d0Var.f1449c = null;
            }
            this.f2156b.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((f) getChildAt(i11).getLayoutParams()).f2184a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f2160f = 0;
            scrollTo(0, 0);
        }
        this.f2159e = aVar;
        this.f2155a = 0;
        if (aVar != null) {
            if (this.k == null) {
                this.k = new i();
            }
            synchronized (this.f2159e) {
            }
            this.u = false;
            boolean z9 = this.N;
            this.N = true;
            this.f2155a = this.f2159e.b();
            if (this.f2161g >= 0) {
                this.f2159e.getClass();
                u(this.f2161g, 0, false, true);
                this.f2161g = -1;
                this.f2162h = null;
            } else if (!z9) {
                p();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.u = false;
        u(i10, 0, !this.N, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to " + 1);
            i10 = 1;
        }
        if (i10 != this.f2174v) {
            this.f2174v = i10;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.R = hVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f2165l;
        this.f2165l = i10;
        int width = getWidth();
        r(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = y.a.f13006a;
        setPageMarginDrawable(a.b.b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2166m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.T != i10) {
            this.T = i10;
            h hVar = this.R;
            if (hVar != null) {
                hVar.a(i10);
            }
            ArrayList arrayList = this.Q;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    h hVar2 = (h) this.Q.get(i11);
                    if (hVar2 != null) {
                        hVar2.a(i10);
                    }
                }
            }
        }
    }

    public final void t(int i10, int i11, boolean z9, boolean z10) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        e j10 = j(i10);
        if (j10 != null) {
            i12 = (int) (Math.max(this.f2169p, Math.min(j10.f2183e, this.f2170q)) * ((float) getClientWidth()));
        } else {
            i12 = 0;
        }
        if (z9) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f2163i;
                if (scroller == null || scroller.isFinished()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    if (this.f2164j) {
                        i13 = this.f2163i.getCurrX();
                    } else {
                        i13 = this.f2163i.getStartX();
                    }
                    this.f2163i.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i13 = getScrollX();
                }
                int i15 = i13;
                int scrollY = getScrollY();
                int i16 = i12 - i15;
                int i17 = 0 - scrollY;
                if (i16 == 0 && i17 == 0) {
                    d(false);
                    p();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i18 = clientWidth / 2;
                    float f10 = (float) clientWidth;
                    float f11 = (float) i18;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i16)) * 1.0f) / f10) - 0.5f) * 0.47123894f))) * f11) + f11;
                    int abs = Math.abs(i11);
                    if (abs > 0) {
                        i14 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        this.f2159e.getClass();
                        i14 = (int) (((((float) Math.abs(i16)) / ((f10 * 1.0f) + ((float) this.f2165l))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i14, 600);
                    this.f2164j = false;
                    this.f2163i.startScroll(i15, scrollY, i16, i17, min);
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.k(this);
                }
            }
            if (z10) {
                f(i10);
                return;
            }
            return;
        }
        if (z10) {
            f(i10);
        }
        d(false);
        scrollTo(i12, 0);
        n(i12);
    }

    public final void u(int i10, int i11, boolean z9, boolean z10) {
        j1.a aVar = this.f2159e;
        boolean z11 = false;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z10 || this.f2160f != i10 || this.f2156b.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f2159e.b()) {
                i10 = this.f2159e.b() - 1;
            }
            int i12 = this.f2174v;
            int i13 = this.f2160f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f2156b.size(); i14++) {
                    this.f2156b.get(i14).f2181c = true;
                }
            }
            if (this.f2160f != i10) {
                z11 = true;
            }
            if (this.N) {
                this.f2160f = i10;
                if (z11) {
                    f(i10);
                }
                requestLayout();
                return;
            }
            q(i10);
            t(i10, i11, z9, z11);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2166m;
    }
}
