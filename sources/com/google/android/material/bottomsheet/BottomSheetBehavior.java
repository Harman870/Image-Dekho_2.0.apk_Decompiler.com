package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.imgdkh.app.R;
import h0.a;
import h0.l0;
import h0.y;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o0.c;
import r5.f;
import r5.i;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.e A = new e();
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F = 0.5f;
    public int G;
    public float H = -1.0f;
    public boolean I;
    public boolean J;
    public boolean K = true;
    public int L = 4;
    public o0.c M;
    public boolean N;
    public int O;
    public boolean P;
    public float Q = 0.1f;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;
    public final ArrayList<c> W = new ArrayList<>();
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f2934a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2935a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2936b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f2937b0;

    /* renamed from: c  reason: collision with root package name */
    public float f2938c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f2939c0 = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public int f2940d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f2941d0 = new b();

    /* renamed from: e  reason: collision with root package name */
    public int f2942e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2943f;

    /* renamed from: g  reason: collision with root package name */
    public int f2944g;

    /* renamed from: h  reason: collision with root package name */
    public int f2945h;

    /* renamed from: i  reason: collision with root package name */
    public f f2946i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2947j;
    public int k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f2948l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f2949m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2950n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2951o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2952p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2953q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2954r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2955s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2956t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public int f2957v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2958x;

    /* renamed from: y  reason: collision with root package name */
    public i f2959y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2960z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2961a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2962b;

        public a(View view, int i10) {
            this.f2961a = view;
            this.f2962b = i10;
        }

        public final void run() {
            BottomSheetBehavior.this.F(this.f2961a, this.f2962b, false);
        }
    }

    public class b extends c.C0121c {
        public b() {
        }

        public final int a(View view, int i10) {
            return view.getLeft();
        }

        public final int b(View view, int i10) {
            return z5.c.e(i10, BottomSheetBehavior.this.x(), d());
        }

        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.I) {
                return bottomSheetBehavior.T;
            }
            return bottomSheetBehavior.G;
        }

        public final void h(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        public final void i(View view, int i10, int i11) {
            BottomSheetBehavior.this.u(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f2964a.x()) < java.lang.Math.abs(r5.getTop() - r4.f2964a.E)) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
            if (java.lang.Math.abs(r6 - r4.f2964a.E) < java.lang.Math.abs(r6 - r4.f2964a.G)) goto L_0x00f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d0, code lost:
            if (java.lang.Math.abs(r6 - r7.D) < java.lang.Math.abs(r6 - r4.f2964a.G)) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
            if (r6 < java.lang.Math.abs(r6 - r7.G)) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
            if (java.lang.Math.abs(r6 - r0) < java.lang.Math.abs(r6 - r4.f2964a.G)) goto L_0x00f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r6 > r4.f2964a.E) goto L_0x00f9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                if (r1 >= 0) goto L_0x0022
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f2936b
                if (r6 == 0) goto L_0x000e
                goto L_0x00e1
            L_0x000e:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.E
                if (r6 <= r7) goto L_0x00e1
                goto L_0x00f9
            L_0x0022:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r3 = r1.I
                if (r3 == 0) goto L_0x0083
                boolean r1 = r1.E(r5, r7)
                if (r1 == 0) goto L_0x0083
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0043
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.f2940d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0059
            L_0x0043:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r7.T
                int r7 = r7.x()
                int r7 = r7 + r0
                int r7 = r7 / 2
                if (r6 <= r7) goto L_0x0056
                r6 = r2
                goto L_0x0057
            L_0x0056:
                r6 = 0
            L_0x0057:
                if (r6 == 0) goto L_0x005c
            L_0x0059:
                r6 = 5
                goto L_0x00fc
            L_0x005c:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f2936b
                if (r6 == 0) goto L_0x0064
                goto L_0x00e1
            L_0x0064:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.x()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.E
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00f9
                goto L_0x00e1
            L_0x0083:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00b5
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0094
                goto L_0x00b5
            L_0x0094:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f2936b
                if (r6 == 0) goto L_0x009b
                goto L_0x00fb
            L_0x009b:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00fb
                goto L_0x00f4
            L_0x00b5:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r0 = r7.f2936b
                if (r0 == 0) goto L_0x00d3
                int r7 = r7.D
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00fb
                goto L_0x00e1
            L_0x00d3:
                int r0 = r7.E
                if (r6 >= r0) goto L_0x00e3
                int r7 = r7.G
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00f4
            L_0x00e1:
                r6 = 3
                goto L_0x00fc
            L_0x00e3:
                int r7 = r6 - r0
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00fb
            L_0x00f4:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
            L_0x00f9:
                r6 = 6
                goto L_0x00fc
            L_0x00fb:
                r6 = 4
            L_0x00fc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                r7.F(r5, r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.j(android.view.View, float, float):void");
        }

        public final boolean k(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.L;
            if (i11 == 1 || bottomSheetBehavior.f2935a0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.Y == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    public static class d extends n0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f2965c;

        /* renamed from: d  reason: collision with root package name */
        public int f2966d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2967e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2968f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2969g;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2965c = parcel.readInt();
            this.f2966d = parcel.readInt();
            boolean z9 = false;
            this.f2967e = parcel.readInt() == 1;
            this.f2968f = parcel.readInt() == 1;
            this.f2969g = parcel.readInt() == 1 ? true : z9;
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f2965c = bottomSheetBehavior.L;
            this.f2966d = bottomSheetBehavior.f2942e;
            this.f2967e = bottomSheetBehavior.f2936b;
            this.f2968f = bottomSheetBehavior.I;
            this.f2969g = bottomSheetBehavior.J;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f2965c);
            parcel.writeInt(this.f2966d);
            parcel.writeInt(this.f2967e ? 1 : 0);
            parcel.writeInt(this.f2968f ? 1 : 0);
            parcel.writeInt(this.f2969g ? 1 : 0);
        }
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f2970a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2971b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2972c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                e eVar = e.this;
                eVar.f2971b = false;
                o0.c cVar = BottomSheetBehavior.this.M;
                if (cVar == null || !cVar.g()) {
                    e eVar2 = e.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.D(eVar2.f2970a);
                        return;
                    }
                    return;
                }
                e eVar3 = e.this;
                eVar3.a(eVar3.f2970a);
            }
        }

        public e() {
        }

        public final void a(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.U;
            if (weakReference != null && weakReference.get() != null) {
                this.f2970a = i10;
                if (!this.f2971b) {
                    a aVar = this.f2972c;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.m((View) BottomSheetBehavior.this.U.get(), aVar);
                    this.f2971b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        int i11;
        this.f2945h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2366x);
        int i12 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2947j = n5.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2959y = new i(i.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018011));
        }
        if (this.f2959y != null) {
            f fVar = new f(this.f2959y);
            this.f2946i = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f2947j;
            if (colorStateList != null) {
                this.f2946i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2946i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.B = ofFloat;
        ofFloat.setDuration(500);
        this.B.addUpdateListener(new w4.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2948l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i11 = peekValue.data) != -1) {
            B(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            B(i11);
        }
        boolean z9 = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z9) {
            this.I = z9;
            if (!z9 && this.L == 5) {
                C(4);
            }
            G();
        }
        this.f2950n = obtainStyledAttributes.getBoolean(13, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2936b != z10) {
            this.f2936b = z10;
            if (this.U != null) {
                s();
            }
            D((!this.f2936b || this.L != 6) ? this.L : i12);
            H(this.L, true);
            G();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f2934a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f10;
        if (this.U != null) {
            this.E = (int) ((1.0f - f10) * ((float) this.T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            i10 = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        } else {
            i10 = peekValue2.data;
        }
        A(i10);
        this.f2940d = obtainStyledAttributes.getInt(11, 500);
        this.f2951o = obtainStyledAttributes.getBoolean(17, false);
        this.f2952p = obtainStyledAttributes.getBoolean(18, false);
        this.f2953q = obtainStyledAttributes.getBoolean(19, false);
        this.f2954r = obtainStyledAttributes.getBoolean(20, true);
        this.f2955s = obtainStyledAttributes.getBoolean(14, false);
        this.f2956t = obtainStyledAttributes.getBoolean(15, false);
        this.u = obtainStyledAttributes.getBoolean(16, false);
        this.f2958x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f2938c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View v10 = v(viewGroup.getChildAt(i10));
                if (v10 != null) {
                    return v10;
                }
            }
        }
        return null;
    }

    public final void A(int i10) {
        if (i10 >= 0) {
            this.C = i10;
            H(this.L, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f2943f
            if (r4 != 0) goto L_0x0015
            r3.f2943f = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f2943f
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f2942e
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x001f
        L_0x0017:
            r3.f2943f = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f2942e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.J()
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.B(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (h0.y.g.b(r4) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x0074
            r1 = 2
            if (r4 != r1) goto L_0x0008
            goto L_0x0074
        L_0x0008:
            boolean r1 = r3.I
            if (r1 != 0) goto L_0x0026
            r1 = 5
            if (r4 != r1) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L_0x0026:
            r1 = 6
            if (r4 != r1) goto L_0x0037
            boolean r1 = r3.f2936b
            if (r1 == 0) goto L_0x0037
            int r1 = r3.y(r4)
            int r2 = r3.D
            if (r1 > r2) goto L_0x0037
            r1 = 3
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            java.lang.ref.WeakReference<V> r2 = r3.U
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0043
            goto L_0x0070
        L_0x0043:
            java.lang.ref.WeakReference<V> r4 = r3.U
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L_0x0065
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x0065
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            boolean r1 = h0.y.g.b(r4)
            if (r1 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006c
            r4.post(r2)
            goto L_0x0073
        L_0x006c:
            r2.run()
            goto L_0x0073
        L_0x0070:
            r3.D(r4)
        L_0x0073:
            return
        L_0x0074:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
            if (r4 != r0) goto L_0x0081
            java.lang.String r4 = "DRAGGING"
            goto L_0x0083
        L_0x0081:
            java.lang.String r4 = "SETTLING"
        L_0x0083:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = androidx.activity.e.c(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    public final void D(int i10) {
        if (this.L != i10) {
            this.L = i10;
            WeakReference<V> weakReference = this.U;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i10 == 3) {
                    I(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    I(false);
                }
                H(i10, true);
                for (int i11 = 0; i11 < this.W.size(); i11++) {
                    this.W.get(i11).b();
                }
                G();
            }
        }
    }

    public final boolean E(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    public final void F(View view, int i10, boolean z9) {
        int y9 = y(i10);
        o0.c cVar = this.M;
        if (cVar != null && (!z9 ? cVar.s(view, view.getLeft(), y9) : cVar.q(view.getLeft(), y9))) {
            D(2);
            H(i10, true);
            this.A.a(i10);
            return;
        }
        D(i10);
    }

    public final void G() {
        View view;
        f.a aVar;
        int i10;
        boolean z9;
        h0.a aVar2;
        WeakReference<V> weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            y.k(view, 524288);
            y.h(view, 0);
            y.k(view, 262144);
            y.h(view, 0);
            y.k(view, 1048576);
            y.h(view, 0);
            int i11 = this.f2939c0.get(0, -1);
            if (i11 != -1) {
                y.k(view, i11);
                y.h(view, 0);
                this.f2939c0.delete(0);
            }
            int i12 = 6;
            if (!this.f2936b && this.L != 6) {
                SparseIntArray sparseIntArray = this.f2939c0;
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                w4.c cVar = new w4.c(this, 6);
                ArrayList f10 = y.f(view);
                int i13 = 0;
                while (true) {
                    if (i13 >= f10.size()) {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = y.f6779d;
                            if (i14 >= iArr.length || i15 != -1) {
                                i10 = i15;
                            } else {
                                int i16 = iArr[i14];
                                boolean z10 = true;
                                for (int i17 = 0; i17 < f10.size(); i17++) {
                                    if (((f.a) f10.get(i17)).a() != i16) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    z10 &= z9;
                                }
                                if (z10) {
                                    i15 = i16;
                                }
                                i14++;
                            }
                        }
                        i10 = i15;
                    } else if (TextUtils.equals(string, ((f.a) f10.get(i13)).b())) {
                        i10 = ((f.a) f10.get(i13)).a();
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i10 != -1) {
                    f.a aVar3 = new f.a((Object) null, i10, string, cVar, (Class) null);
                    View.AccessibilityDelegate d10 = y.d(view);
                    if (d10 == null) {
                        aVar2 = null;
                    } else if (d10 instanceof a.C0089a) {
                        aVar2 = ((a.C0089a) d10).f6679a;
                    } else {
                        aVar2 = new h0.a(d10);
                    }
                    if (aVar2 == null) {
                        aVar2 = new h0.a();
                    }
                    y.n(view, aVar2);
                    y.k(view, aVar3.a());
                    y.f(view).add(aVar3);
                    y.h(view, 0);
                }
                sparseIntArray.put(0, i10);
            }
            if (this.I && this.L != 5) {
                z(view, f.a.f7100l, 5);
            }
            int i18 = this.L;
            if (i18 == 3) {
                if (this.f2936b) {
                    i12 = 4;
                }
                aVar = f.a.k;
            } else if (i18 == 4) {
                if (this.f2936b) {
                    i12 = 3;
                }
                aVar = f.a.f7099j;
            } else if (i18 == 6) {
                z(view, f.a.k, 4);
                z(view, f.a.f7099j, 3);
                return;
            } else {
                return;
            }
            z(view, aVar, i12);
        }
    }

    public final void H(int i10, boolean z9) {
        boolean z10;
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            if (this.L != 3 || (!this.f2958x && x() != 0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f2960z != z10 && this.f2946i != null) {
                this.f2960z = z10;
                float f10 = 0.0f;
                if (!z9 || (valueAnimator = this.B) == null) {
                    ValueAnimator valueAnimator2 = this.B;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.B.cancel();
                    }
                    r5.f fVar = this.f2946i;
                    if (!this.f2960z) {
                        f10 = 1.0f;
                    }
                    f.b bVar = fVar.f11660a;
                    if (bVar.f11690j != f10) {
                        bVar.f11690j = f10;
                        fVar.f11664e = true;
                        fVar.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    this.B.reverse();
                } else {
                    if (!z10) {
                        f10 = 1.0f;
                    }
                    this.B.setFloatValues(new float[]{1.0f - f10, f10});
                    this.B.start();
                }
            }
        }
    }

    public final void I(boolean z9) {
        WeakReference<V> weakReference = this.U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z9) {
                    if (this.f2937b0 == null) {
                        this.f2937b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    V childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.U.get() && z9) {
                        this.f2937b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z9) {
                    this.f2937b0 = null;
                }
            }
        }
    }

    public final void J() {
        View view;
        if (this.U != null) {
            s();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    public final void f() {
        this.U = null;
        this.M = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        o0.c cVar;
        boolean z9;
        View view;
        if (!v10.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference<View> weakReference = this.V;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.p(view, x9, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2935a0 = true;
                }
            }
            if (this.Y != -1 || coordinatorLayout.p(v10, x9, this.Z)) {
                z9 = false;
            } else {
                z9 = true;
            }
            this.N = z9;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2935a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (cVar = this.M) != null && cVar.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.V;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(((float) this.Z) - motionEvent.getY()) <= ((float) this.M.f10480b)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x017d A[LOOP:0: B:79:0x0175->B:81:0x017d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, int r12) {
        /*
            r9 = this;
            java.util.WeakHashMap<android.view.View, h0.l0> r0 = h0.y.f6776a
            boolean r0 = h0.y.d.b(r10)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = h0.y.d.b(r11)
            if (r0 != 0) goto L_0x0012
            r11.setFitsSystemWindows(r1)
        L_0x0012:
            java.lang.ref.WeakReference<V> r0 = r9.U
            r2 = 0
            if (r0 != 0) goto L_0x00e0
            android.content.res.Resources r0 = r10.getResources()
            r3 = 2131099763(0x7f060073, float:1.7811888E38)
            int r0 = r0.getDimensionPixelSize(r3)
            r9.f2944g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L_0x0034
            boolean r3 = r9.f2950n
            if (r3 != 0) goto L_0x0034
            boolean r3 = r9.f2943f
            if (r3 != 0) goto L_0x0034
            r3 = r1
            goto L_0x0035
        L_0x0034:
            r3 = r2
        L_0x0035:
            boolean r4 = r9.f2951o
            if (r4 != 0) goto L_0x0050
            boolean r4 = r9.f2952p
            if (r4 != 0) goto L_0x0050
            boolean r4 = r9.f2953q
            if (r4 != 0) goto L_0x0050
            boolean r4 = r9.f2955s
            if (r4 != 0) goto L_0x0050
            boolean r4 = r9.f2956t
            if (r4 != 0) goto L_0x0050
            boolean r4 = r9.u
            if (r4 != 0) goto L_0x0050
            if (r3 != 0) goto L_0x0050
            goto L_0x0084
        L_0x0050:
            w4.b r4 = new w4.b
            r4.<init>(r9, r3)
            j5.x$b r3 = new j5.x$b
            int r5 = h0.y.e.f(r11)
            int r6 = r11.getPaddingTop()
            int r7 = h0.y.e.e(r11)
            int r8 = r11.getPaddingBottom()
            r3.<init>(r5, r6, r7, r8)
            j5.v r5 = new j5.v
            r5.<init>(r4, r3)
            h0.y.i.u(r11, r5)
            boolean r3 = h0.y.g.b(r11)
            if (r3 == 0) goto L_0x007c
            h0.y.h.c(r11)
            goto L_0x0084
        L_0x007c:
            j5.w r3 = new j5.w
            r3.<init>()
            r11.addOnAttachStateChangeListener(r3)
        L_0x0084:
            w4.d r3 = new w4.d
            r3.<init>(r11)
            r4 = 30
            if (r0 < r4) goto L_0x0096
            h0.r0$d$a r0 = new h0.r0$d$a
            r0.<init>(r3)
            r11.setWindowInsetsAnimationCallback(r0)
            goto L_0x00ad
        L_0x0096:
            r0 = 2131296824(0x7f090238, float:1.8211576E38)
            java.lang.Object r0 = r11.getTag(r0)
            r4 = 2131296832(0x7f090240, float:1.8211592E38)
            h0.r0$c$a r5 = new h0.r0$c$a
            r5.<init>(r11, r3)
            r11.setTag(r4, r5)
            if (r0 != 0) goto L_0x00ad
            r11.setOnApplyWindowInsetsListener(r5)
        L_0x00ad:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r9.U = r0
            r5.f r0 = r9.f2946i
            if (r0 == 0) goto L_0x00cd
            h0.y.d.q(r11, r0)
            r5.f r0 = r9.f2946i
            float r3 = r9.H
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00c9
            float r3 = h0.y.i.i(r11)
        L_0x00c9:
            r0.j(r3)
            goto L_0x00d4
        L_0x00cd:
            android.content.res.ColorStateList r0 = r9.f2947j
            if (r0 == 0) goto L_0x00d4
            h0.y.i.q(r11, r0)
        L_0x00d4:
            r9.G()
            int r0 = h0.y.d.c(r11)
            if (r0 != 0) goto L_0x00e0
            h0.y.d.s(r11, r1)
        L_0x00e0:
            o0.c r0 = r9.M
            if (r0 != 0) goto L_0x00f1
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r0 = r9.f2941d0
            o0.c r3 = new o0.c
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4, r10, r0)
            r9.M = r3
        L_0x00f1:
            int r0 = r11.getTop()
            r10.r(r11, r12)
            int r12 = r10.getWidth()
            r9.S = r12
            int r10 = r10.getHeight()
            r9.T = r10
            int r10 = r11.getHeight()
            r9.R = r10
            int r12 = r9.T
            int r10 = r12 - r10
            int r3 = r9.w
            if (r10 >= r3) goto L_0x011d
            boolean r10 = r9.f2954r
            if (r10 == 0) goto L_0x0119
            r9.R = r12
            goto L_0x011d
        L_0x0119:
            int r10 = r12 - r3
            r9.R = r10
        L_0x011d:
            int r10 = r9.R
            int r12 = r12 - r10
            int r10 = java.lang.Math.max(r2, r12)
            r9.D = r10
            int r10 = r9.T
            float r10 = (float) r10
            float r12 = r9.F
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r12
            float r3 = r3 * r10
            int r10 = (int) r3
            r9.E = r10
            r9.s()
            int r10 = r9.L
            r12 = 3
            if (r10 != r12) goto L_0x013f
            int r10 = r9.x()
            goto L_0x0154
        L_0x013f:
            r12 = 6
            if (r10 != r12) goto L_0x0145
            int r10 = r9.E
            goto L_0x0154
        L_0x0145:
            boolean r12 = r9.I
            if (r12 == 0) goto L_0x014f
            r12 = 5
            if (r10 != r12) goto L_0x014f
            int r10 = r9.T
            goto L_0x0154
        L_0x014f:
            r12 = 4
            if (r10 != r12) goto L_0x0158
            int r10 = r9.G
        L_0x0154:
            r11.offsetTopAndBottom(r10)
            goto L_0x0165
        L_0x0158:
            if (r10 == r1) goto L_0x015d
            r12 = 2
            if (r10 != r12) goto L_0x0165
        L_0x015d:
            int r10 = r11.getTop()
            int r0 = r0 - r10
            r11.offsetTopAndBottom(r0)
        L_0x0165:
            int r10 = r9.L
            r9.H(r10, r2)
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.view.View r11 = v(r11)
            r10.<init>(r11)
            r9.V = r10
        L_0x0175:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r10 = r9.W
            int r10 = r10.size()
            if (r2 >= r10) goto L_0x018b
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r10 = r9.W
            java.lang.Object r10 = r10.get(r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r10 = (com.google.android.material.bottomsheet.BottomSheetBehavior.c) r10
            r10.getClass()
            int r2 = r2 + 1
            goto L_0x0175
        L_0x018b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.k, marginLayoutParams.width), w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f2948l, marginLayoutParams.height));
        return true;
    }

    public final boolean j(View view) {
        WeakReference<View> weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        int i13;
        if (i12 != 1) {
            WeakReference<View> weakReference = this.V;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v10.getTop();
                int i14 = top - i11;
                if (i11 <= 0) {
                    if (i11 < 0 && !view.canScrollVertically(-1)) {
                        int i15 = this.G;
                        if (i14 > i15 && !this.I) {
                            int i16 = top - i15;
                            iArr[1] = i16;
                            int i17 = -i16;
                            WeakHashMap<View, l0> weakHashMap = y.f6776a;
                            v10.offsetTopAndBottom(i17);
                            i13 = 4;
                            D(i13);
                        } else if (this.K) {
                            iArr[1] = i11;
                        } else {
                            return;
                        }
                    }
                    u(v10.getTop());
                    this.O = i11;
                    this.P = true;
                } else if (i14 < x()) {
                    int x9 = top - x();
                    iArr[1] = x9;
                    int i18 = -x9;
                    WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                    v10.offsetTopAndBottom(i18);
                    i13 = 3;
                    D(i13);
                    u(v10.getTop());
                    this.O = i11;
                    this.P = true;
                } else if (this.K) {
                    iArr[1] = i11;
                } else {
                    return;
                }
                int i19 = -i11;
                WeakHashMap<View, l0> weakHashMap3 = y.f6776a;
                v10.offsetTopAndBottom(i19);
                D(1);
                u(v10.getTop());
                this.O = i11;
                this.P = true;
            }
        }
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f2934a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f2942e = dVar.f2966d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f2936b = dVar.f2967e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = dVar.f2968f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = dVar.f2969g;
            }
        }
        int i11 = dVar.f2965c;
        if (i11 == 1 || i11 == 2) {
            this.L = 4;
        } else {
            this.L = i11;
        }
    }

    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5.getTop() <= r3.E) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.D) < java.lang.Math.abs(r4 - r3.G)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.G)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.G)) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (java.lang.Math.abs(r4 - r3.E) < java.lang.Math.abs(r4 - r3.G)) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.x()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.D(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.V
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00b6
            boolean r4 = r3.P
            if (r4 != 0) goto L_0x001f
            goto L_0x00b6
        L_0x001f:
            int r4 = r3.O
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0035
            boolean r4 = r3.f2936b
            if (r4 == 0) goto L_0x002b
            goto L_0x00b0
        L_0x002b:
            int r4 = r5.getTop()
            int r6 = r3.E
            if (r4 <= r6) goto L_0x00b0
            goto L_0x00ad
        L_0x0035:
            boolean r4 = r3.I
            if (r4 == 0) goto L_0x0056
            android.view.VelocityTracker r4 = r3.X
            if (r4 != 0) goto L_0x003f
            r4 = 0
            goto L_0x004e
        L_0x003f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f2938c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.X
            int r1 = r3.Y
            float r4 = r4.getYVelocity(r1)
        L_0x004e:
            boolean r4 = r3.E(r5, r4)
            if (r4 == 0) goto L_0x0056
            r0 = 5
            goto L_0x00b0
        L_0x0056:
            int r4 = r3.O
            if (r4 != 0) goto L_0x0093
            int r4 = r5.getTop()
            boolean r1 = r3.f2936b
            if (r1 == 0) goto L_0x0074
            int r7 = r3.D
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.G
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x00af
            goto L_0x00b0
        L_0x0074:
            int r1 = r3.E
            if (r4 >= r1) goto L_0x0083
            int r6 = r3.G
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00ad
            goto L_0x00b0
        L_0x0083:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.G
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
            goto L_0x00ad
        L_0x0093:
            boolean r4 = r3.f2936b
            if (r4 == 0) goto L_0x0098
            goto L_0x00af
        L_0x0098:
            int r4 = r5.getTop()
            int r0 = r3.E
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.G
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
        L_0x00ad:
            r0 = r7
            goto L_0x00b0
        L_0x00af:
            r0 = r6
        L_0x00b0:
            r4 = 0
            r3.F(r5, r0, r4)
            r3.P = r4
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        o0.c cVar = this.M;
        if (cVar == null || (!this.K && i10 != 1)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(((float) this.Z) - motionEvent.getY());
            o0.c cVar2 = this.M;
            if (abs > ((float) cVar2.f10480b)) {
                cVar2.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int t10 = t();
        if (this.f2936b) {
            this.G = Math.max(this.T - t10, this.D);
        } else {
            this.G = this.T - t10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f2949m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r3 = this;
            boolean r0 = r3.f2943f
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f2944g
            int r1 = r3.T
            int r2 = r3.S
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.R
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f2957v
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f2950n
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f2951o
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f2949m
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f2942e
            int r2 = r3.f2945h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f2942e
            int r1 = r3.f2957v
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():int");
    }

    public final void u(int i10) {
        if (((View) this.U.get()) != null && !this.W.isEmpty()) {
            int i11 = this.G;
            if (i10 <= i11 && i11 != x()) {
                x();
            }
            for (int i12 = 0; i12 < this.W.size(); i12++) {
                this.W.get(i12).a();
            }
        }
    }

    public final int w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final int x() {
        if (this.f2936b) {
            return this.D;
        }
        return Math.max(this.C, this.f2954r ? 0 : this.w);
    }

    public final int y(int i10) {
        if (i10 == 3) {
            return x();
        }
        if (i10 == 4) {
            return this.G;
        }
        if (i10 == 5) {
            return this.T;
        }
        if (i10 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(androidx.activity.e.a("Invalid state to get top offset: ", i10));
    }

    public final void z(View view, f.a aVar, int i10) {
        y.l(view, aVar, new w4.c(this, i10));
    }
}
