package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0.c;
import r5.f;
import r5.i;
import s5.d;
import s5.g;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public s5.a f3290a;

    /* renamed from: b  reason: collision with root package name */
    public f f3291b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f3292c;

    /* renamed from: d  reason: collision with root package name */
    public i f3293d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f3294e = new c();

    /* renamed from: f  reason: collision with root package name */
    public float f3295f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3296g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f3297h = 5;

    /* renamed from: i  reason: collision with root package name */
    public o0.c f3298i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3299j;
    public float k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f3300l;

    /* renamed from: m  reason: collision with root package name */
    public int f3301m;

    /* renamed from: n  reason: collision with root package name */
    public int f3302n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<V> f3303o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<View> f3304p;

    /* renamed from: q  reason: collision with root package name */
    public int f3305q = -1;

    /* renamed from: r  reason: collision with root package name */
    public VelocityTracker f3306r;

    /* renamed from: s  reason: collision with root package name */
    public int f3307s;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedHashSet f3308t = new LinkedHashSet();
    public final a u = new a();

    public class a extends c.C0121c {
        public a() {
        }

        public final int a(View view, int i10) {
            return z5.c.e(i10, SideSheetBehavior.this.f3290a.a(), SideSheetBehavior.this.f3301m);
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            return SideSheetBehavior.this.f3301m;
        }

        public final void h(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f3296g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        public final void i(View view, int i10, int i11) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            WeakReference<View> weakReference = SideSheetBehavior.this.f3304p;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                s5.a aVar = SideSheetBehavior.this.f3290a;
                int left = view.getLeft();
                view.getRight();
                int i12 = aVar.f11874a.f3301m;
                if (left <= i12) {
                    marginLayoutParams.rightMargin = i12 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.f3308t.isEmpty()) {
                s5.a aVar2 = sideSheetBehavior.f3290a;
                int i13 = aVar2.f11874a.f3301m;
                aVar2.a();
                for (s5.b b10 : sideSheetBehavior.f3308t) {
                    b10.b();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
            if (r4 != false) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r4 == false) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
            if (java.lang.Math.abs(r7 - r0.a()) < java.lang.Math.abs(r7 - r0.f11874a.f3301m)) goto L_0x0092;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r6, float r7, float r8) {
            /*
                r5 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                s5.a r0 = r0.f3290a
                r0.getClass()
                r1 = 0
                int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                r3 = 1
                if (r2 >= 0) goto L_0x000f
                goto L_0x0092
            L_0x000f:
                int r2 = r6.getRight()
                float r2 = (float) r2
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r4 = r0.f11874a
                float r4 = r4.k
                float r4 = r4 * r7
                float r4 = r4 + r2
                float r2 = java.lang.Math.abs(r4)
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r4 = r0.f11874a
                r4.getClass()
                r4 = 1056964608(0x3f000000, float:0.5)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r4 = 0
                if (r2 <= 0) goto L_0x002c
                r2 = r3
                goto L_0x002d
            L_0x002c:
                r2 = r4
            L_0x002d:
                if (r2 == 0) goto L_0x0066
                float r7 = java.lang.Math.abs(r7)
                float r1 = java.lang.Math.abs(r8)
                int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r7 <= 0) goto L_0x003d
                r7 = r3
                goto L_0x003e
            L_0x003d:
                r7 = r4
            L_0x003e:
                if (r7 == 0) goto L_0x004e
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r7 = r0.f11874a
                r7.getClass()
                r7 = 500(0x1f4, float:7.0E-43)
                float r7 = (float) r7
                int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r7 <= 0) goto L_0x004e
                r7 = r3
                goto L_0x004f
            L_0x004e:
                r7 = r4
            L_0x004f:
                if (r7 != 0) goto L_0x0094
                int r7 = r6.getLeft()
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r8 = r0.f11874a
                int r8 = r8.f3301m
                int r0 = r0.a()
                int r8 = r8 - r0
                int r8 = r8 / 2
                if (r7 <= r8) goto L_0x0063
                r4 = r3
            L_0x0063:
                if (r4 == 0) goto L_0x0092
                goto L_0x0094
            L_0x0066:
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0079
                float r7 = java.lang.Math.abs(r7)
                float r8 = java.lang.Math.abs(r8)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 <= 0) goto L_0x0077
                r4 = r3
            L_0x0077:
                if (r4 != 0) goto L_0x0094
            L_0x0079:
                int r7 = r6.getLeft()
                int r8 = r0.a()
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r0.f11874a
                int r0 = r0.f3301m
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L_0x0094
            L_0x0092:
                r7 = 3
                goto L_0x0095
            L_0x0094:
                r7 = 5
            L_0x0095:
                com.google.android.material.sidesheet.SideSheetBehavior r8 = com.google.android.material.sidesheet.SideSheetBehavior.this
                r8.getClass()
                r8.t(r6, r7, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.j(android.view.View, float, float):void");
        }

        public final boolean k(View view, int i10) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f3297h == 1 || (weakReference = sideSheetBehavior.f3303o) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    public static class b extends n0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f3310c;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3310c = parcel.readInt();
        }

        public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f3310c = sideSheetBehavior.f3297h;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f3310c);
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f3311a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3312b;

        /* renamed from: c  reason: collision with root package name */
        public final s5.f f3313c = new s5.f(0, this);

        public c() {
        }

        public final void a(int i10) {
            WeakReference<V> weakReference = SideSheetBehavior.this.f3303o;
            if (weakReference != null && weakReference.get() != null) {
                this.f3311a = i10;
                if (!this.f3312b) {
                    s5.f fVar = this.f3313c;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.m((View) SideSheetBehavior.this.f3303o.get(), fVar);
                    this.f3312b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.V);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3292c = n5.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f3293d = new i(i.b(context, attributeSet, 0, 2132018153));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f3305q = resourceId;
            WeakReference<View> weakReference = this.f3304p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3304p = null;
            WeakReference<V> weakReference2 = this.f3303o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    if (y.g.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        if (this.f3293d != null) {
            f fVar = new f(this.f3293d);
            this.f3291b = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f3292c;
            if (colorStateList != null) {
                this.f3291b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3291b.setTint(typedValue.data);
            }
        }
        this.f3295f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f3296g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f3290a == null) {
            this.f3290a = new s5.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.f3303o = null;
        this.f3298i = null;
    }

    public final void f() {
        this.f3303o = null;
        this.f3298i = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z9;
        o0.c cVar;
        VelocityTracker velocityTracker;
        if ((v10.isShown() || y.e(v10) != null) && this.f3296g) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.f3299j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3306r) != null) {
            velocityTracker.recycle();
            this.f3306r = null;
        }
        if (this.f3306r == null) {
            this.f3306r = VelocityTracker.obtain();
        }
        this.f3306r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f3307s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f3299j) {
            this.f3299j = false;
            return false;
        }
        if (this.f3299j || (cVar = this.f3298i) == null || !cVar.r(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int i11;
        int i12;
        View findViewById;
        int i13;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.d.b(coordinatorLayout) && !y.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.f3303o == null) {
            this.f3303o = new WeakReference<>(v10);
            f fVar = this.f3291b;
            if (fVar != null) {
                y.d.q(v10, fVar);
                f fVar2 = this.f3291b;
                float f10 = this.f3295f;
                if (f10 == -1.0f) {
                    f10 = y.i.i(v10);
                }
                fVar2.j(f10);
            } else {
                ColorStateList colorStateList = this.f3292c;
                if (colorStateList != null) {
                    y.i.q(v10, colorStateList);
                }
            }
            if (this.f3297h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (v10.getVisibility() != i13) {
                v10.setVisibility(i13);
            }
            u();
            if (y.d.c(v10) == 0) {
                y.d.s(v10, 1);
            }
            if (y.e(v10) == null) {
                y.o(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f3298i == null) {
            this.f3298i = new o0.c(coordinatorLayout.getContext(), coordinatorLayout, this.u);
        }
        s5.a aVar = this.f3290a;
        aVar.getClass();
        int left = v10.getLeft() - aVar.f11874a.f3302n;
        coordinatorLayout.r(v10, i10);
        this.f3301m = coordinatorLayout.getWidth();
        this.f3300l = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f3290a.getClass();
            i11 = marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        this.f3302n = i11;
        int i15 = this.f3297h;
        if (i15 == 1 || i15 == 2) {
            s5.a aVar2 = this.f3290a;
            aVar2.getClass();
            i14 = left - (v10.getLeft() - aVar2.f11874a.f3302n);
        } else if (i15 != 3) {
            if (i15 == 5) {
                i14 = this.f3290a.f11874a.f3301m;
            } else {
                StringBuilder g10 = androidx.activity.f.g("Unexpected value: ");
                g10.append(this.f3297h);
                throw new IllegalStateException(g10.toString());
            }
        }
        v10.offsetLeftAndRight(i14);
        if (!(this.f3304p != null || (i12 = this.f3305q) == -1 || (findViewById = coordinatorLayout.findViewById(i12)) == null)) {
            this.f3304p = new WeakReference<>(findViewById);
        }
        for (s5.b bVar : this.f3308t) {
            if (bVar instanceof g) {
                ((g) bVar).getClass();
            }
        }
        return true;
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    public final void n(View view, Parcelable parcelable) {
        int i10 = ((b) parcelable).f3310c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f3297h = i10;
    }

    public final Parcelable o(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        boolean z12 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f3297h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        o0.c cVar = this.f3298i;
        if (cVar == null || (!this.f3296g && i10 != 1)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3306r) != null) {
            velocityTracker.recycle();
            this.f3306r = null;
        }
        if (this.f3306r == null) {
            this.f3306r = VelocityTracker.obtain();
        }
        this.f3306r.addMovement(motionEvent);
        o0.c cVar2 = this.f3298i;
        if (cVar2 == null || (!this.f3296g && this.f3297h != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.f3299j) {
            if (cVar2 == null || (!this.f3296g && this.f3297h != 1)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && Math.abs(((float) this.f3307s) - motionEvent.getX()) > ((float) this.f3298i.f10480b)) {
                z12 = true;
            }
            if (z12) {
                this.f3298i.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3299j;
    }

    public final void s(int i10) {
        View view;
        int i11;
        if (this.f3297h != i10) {
            this.f3297h = i10;
            WeakReference<V> weakReference = this.f3303o;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.f3297h == 5) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                if (view.getVisibility() != i11) {
                    view.setVisibility(i11);
                }
                for (s5.b a10 : this.f3308t) {
                    a10.a();
                }
                u();
            }
        }
    }

    public final void t(View view, int i10, boolean z9) {
        int i11;
        boolean z10;
        s5.a aVar = this.f3290a;
        SideSheetBehavior<? extends View> sideSheetBehavior = aVar.f11874a;
        if (i10 == 3) {
            i11 = sideSheetBehavior.f3290a.a();
        } else if (i10 == 5) {
            i11 = sideSheetBehavior.f3290a.f11874a.f3301m;
        } else {
            sideSheetBehavior.getClass();
            throw new IllegalArgumentException(e.a("Invalid state to get outer edge offset: ", i10));
        }
        o0.c cVar = aVar.f11874a.f3298i;
        if (cVar == null || (!z9 ? !cVar.s(view, i11, view.getTop()) : !cVar.q(i11, view.getTop()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            s(2);
            this.f3294e.a(i10);
            return;
        }
        s(i10);
    }

    public final void u() {
        View view;
        WeakReference<V> weakReference = this.f3303o;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            y.k(view, 262144);
            y.h(view, 0);
            y.k(view, 1048576);
            y.h(view, 0);
            if (this.f3297h != 5) {
                y.l(view, f.a.f7100l, new d(this, 5));
            }
            if (this.f3297h != 3) {
                y.l(view, f.a.f7099j, new d(this, 3));
            }
        }
    }
}
