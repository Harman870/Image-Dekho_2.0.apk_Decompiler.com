package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.l0;
import h0.y;
import i0.f;
import java.util.WeakHashMap;
import o0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public c f2902a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2903b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2904c;

    /* renamed from: d  reason: collision with root package name */
    public int f2905d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f2906e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f2907f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f2908g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final a f2909h = new a();

    public class a extends c.C0121c {

        /* renamed from: a  reason: collision with root package name */
        public int f2910a;

        /* renamed from: b  reason: collision with root package name */
        public int f2911b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            r0 = r3.f2910a - r4.getWidth();
            r4 = r3.f2910a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r0 != false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r0 != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, h0.l0> r0 = h0.y.f6776a
                int r0 = h0.y.e.d(r4)
                r1 = 1
                if (r0 != r1) goto L_0x000b
                r0 = r1
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f2905d
                if (r2 != 0) goto L_0x0015
                if (r0 == 0) goto L_0x0019
                goto L_0x0021
            L_0x0015:
                if (r2 != r1) goto L_0x002b
                if (r0 == 0) goto L_0x0021
            L_0x0019:
                int r0 = r3.f2910a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L_0x0039
            L_0x0021:
                int r0 = r3.f2910a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f2910a
                goto L_0x0039
            L_0x002b:
                int r0 = r3.f2910a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f2910a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L_0x0039:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int):int");
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            return view.getWidth();
        }

        public final void g(View view, int i10) {
            this.f2911b = i10;
            this.f2910a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f2904c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f2904c = false;
            }
        }

        public final void h(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        public final void i(View view, int i10, int i11) {
            float width = ((float) view.getWidth()) * SwipeDismissBehavior.this.f2907f;
            float width2 = ((float) view.getWidth()) * SwipeDismissBehavior.this.f2908g;
            float abs = (float) Math.abs(i10 - this.f2910a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f2910a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f2912c.f2906e)) goto L_0x0054;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f2911b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, h0.l0> r4 = h0.y.f6776a
                int r4 = h0.y.e.d(r8)
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f2905d
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x0054
            L_0x0021:
                if (r5 != 0) goto L_0x002d
                if (r4 == 0) goto L_0x002a
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x002a:
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x002d:
                if (r5 != r2) goto L_0x0056
                if (r4 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x0034:
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x0039:
                int r1 = r8.getLeft()
                int r4 = r7.f2910a
                int r1 = r1 - r4
                int r4 = r8.getWidth()
                float r4 = (float) r4
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r5 = r5.f2906e
                float r4 = r4 * r5
                int r4 = java.lang.Math.round(r4)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r4) goto L_0x0056
            L_0x0054:
                r1 = r2
                goto L_0x0057
            L_0x0056:
                r1 = r3
            L_0x0057:
                if (r1 == 0) goto L_0x006d
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 < 0) goto L_0x0068
                int r9 = r8.getLeft()
                int r0 = r7.f2910a
                if (r9 >= r0) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                int r0 = r0 + r10
                goto L_0x0070
            L_0x0068:
                int r9 = r7.f2910a
                int r0 = r9 - r10
                goto L_0x0070
            L_0x006d:
                int r0 = r7.f2910a
                r2 = r3
            L_0x0070:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                o0.c r9 = r9.f2902a
                int r10 = r8.getTop()
                boolean r9 = r9.q(r0, r10)
                if (r9 == 0) goto L_0x008b
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, h0.l0> r10 = h0.y.f6776a
                h0.y.d.m(r8, r9)
                goto L_0x0092
            L_0x008b:
                if (r2 == 0) goto L_0x0092
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.getClass()
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        public final boolean k(View view, int i10) {
            int i11 = this.f2911b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f2913a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2914b;

        public b(View view, boolean z9) {
            this.f2913a = view;
            this.f2914b = z9;
        }

        public final void run() {
            c cVar = SwipeDismissBehavior.this.f2902a;
            if (cVar != null && cVar.g()) {
                View view = this.f2913a;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.d.m(view, this);
            } else if (this.f2914b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z9 = this.f2903b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z9 = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2903b = z9;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2903b = false;
        }
        if (!z9) {
            return false;
        }
        if (this.f2902a == null) {
            this.f2902a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f2909h);
        }
        if (this.f2904c || !this.f2902a.r(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.d.c(v10) == 0) {
            y.d.s(v10, 1);
            y.k(v10, 1048576);
            y.h(v10, 0);
            if (s(v10)) {
                y.l(v10, f.a.f7100l, new u4.a(this));
            }
        }
        return false;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f2902a == null) {
            return false;
        }
        if (this.f2904c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2902a.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
