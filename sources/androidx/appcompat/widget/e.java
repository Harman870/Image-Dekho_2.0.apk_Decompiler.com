package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f768a;

    /* renamed from: b  reason: collision with root package name */
    public final j f769b;

    /* renamed from: c  reason: collision with root package name */
    public int f770c = -1;

    /* renamed from: d  reason: collision with root package name */
    public g1 f771d;

    /* renamed from: e  reason: collision with root package name */
    public g1 f772e;

    /* renamed from: f  reason: collision with root package name */
    public g1 f773f;

    public e(View view) {
        this.f768a = view;
        this.f769b = j.a();
    }

    public final void a() {
        boolean z9;
        Drawable background = this.f768a.getBackground();
        if (background != null) {
            boolean z10 = true;
            if (this.f771d != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (this.f773f == null) {
                    this.f773f = new g1();
                }
                g1 g1Var = this.f773f;
                g1Var.f783a = null;
                g1Var.f786d = false;
                g1Var.f784b = null;
                g1Var.f785c = false;
                View view = this.f768a;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                ColorStateList g10 = y.i.g(view);
                if (g10 != null) {
                    g1Var.f786d = true;
                    g1Var.f783a = g10;
                }
                PorterDuff.Mode h10 = y.i.h(this.f768a);
                if (h10 != null) {
                    g1Var.f785c = true;
                    g1Var.f784b = h10;
                }
                if (g1Var.f786d || g1Var.f785c) {
                    j.e(background, g1Var, this.f768a.getDrawableState());
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            g1 g1Var2 = this.f772e;
            if (g1Var2 != null) {
                j.e(background, g1Var2, this.f768a.getDrawableState());
                return;
            }
            g1 g1Var3 = this.f771d;
            if (g1Var3 != null) {
                j.e(background, g1Var3, this.f768a.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        g1 g1Var = this.f772e;
        if (g1Var != null) {
            return g1Var.f783a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        g1 g1Var = this.f772e;
        if (g1Var != null) {
            return g1Var.f784b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r0.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.view.View r0 = r7.f768a
            android.content.Context r0 = r0.getContext()
            int[] r3 = y3.a.E
            androidx.appcompat.widget.i1 r0 = androidx.appcompat.widget.i1.m(r0, r8, r3, r9)
            android.view.View r1 = r7.f768a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f809b
            r4 = r8
            r6 = r9
            h0.y.m(r1, r2, r3, r4, r5, r6)
            r8 = 0
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x006b }
            r1 = -1
            if (r9 == 0) goto L_0x0042
            int r8 = r0.i(r8, r1)     // Catch:{ all -> 0x006b }
            r7.f770c = r8     // Catch:{ all -> 0x006b }
            androidx.appcompat.widget.j r8 = r7.f769b     // Catch:{ all -> 0x006b }
            android.view.View r9 = r7.f768a     // Catch:{ all -> 0x006b }
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x006b }
            int r2 = r7.f770c     // Catch:{ all -> 0x006b }
            monitor-enter(r8)     // Catch:{ all -> 0x006b }
            androidx.appcompat.widget.y0 r3 = r8.f813a     // Catch:{ all -> 0x003f }
            android.content.res.ColorStateList r9 = r3.h(r9, r2)     // Catch:{ all -> 0x003f }
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0042
            r7.g(r9)     // Catch:{ all -> 0x006b }
            goto L_0x0042
        L_0x003f:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            throw r9     // Catch:{ all -> 0x006b }
        L_0x0042:
            r8 = 1
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0052
            android.view.View r9 = r7.f768a     // Catch:{ all -> 0x006b }
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch:{ all -> 0x006b }
            h0.y.i.q(r9, r8)     // Catch:{ all -> 0x006b }
        L_0x0052:
            r8 = 2
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0067
            android.view.View r9 = r7.f768a     // Catch:{ all -> 0x006b }
            int r8 = r0.h(r8, r1)     // Catch:{ all -> 0x006b }
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.o0.b(r8, r1)     // Catch:{ all -> 0x006b }
            h0.y.i.r(r9, r8)     // Catch:{ all -> 0x006b }
        L_0x0067:
            r0.n()
            return
        L_0x006b:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f770c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f770c = i10;
        j jVar = this.f769b;
        if (jVar != null) {
            Context context = this.f768a.getContext();
            synchronized (jVar) {
                colorStateList = jVar.f813a.h(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f771d == null) {
                this.f771d = new g1();
            }
            g1 g1Var = this.f771d;
            g1Var.f783a = colorStateList;
            g1Var.f786d = true;
        } else {
            this.f771d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f772e == null) {
            this.f772e = new g1();
        }
        g1 g1Var = this.f772e;
        g1Var.f783a = colorStateList;
        g1Var.f786d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f772e == null) {
            this.f772e = new g1();
        }
        g1 g1Var = this.f772e;
        g1Var.f784b = mode;
        g1Var.f785c = true;
        a();
    }
}
