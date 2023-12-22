package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.i1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.imgdkh.app.R;
import g.f;
import h0.l0;
import h0.s0;
import h0.y;
import j5.h;
import j5.i;
import j5.m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import r5.f;
import r5.i;
import r5.j;
import y.a;
import z5.c;

public class NavigationView extends m {
    public static final int[] u = {16842912};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f3267v = {-16842910};

    /* renamed from: h  reason: collision with root package name */
    public final h f3268h;

    /* renamed from: i  reason: collision with root package name */
    public final i f3269i;

    /* renamed from: j  reason: collision with root package name */
    public a f3270j;
    public final int k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f3271l = new int[2];

    /* renamed from: m  reason: collision with root package name */
    public f f3272m;

    /* renamed from: n  reason: collision with root package name */
    public l5.a f3273n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3274o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3275p = true;

    /* renamed from: q  reason: collision with root package name */
    public int f3276q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3277r = 0;

    /* renamed from: s  reason: collision with root package name */
    public Path f3278s;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f3279t = new RectF();

    public interface a {
    }

    public static class b extends n0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f3280c;

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
            this.f3280c = parcel.readBundle(classLoader);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeBundle(this.f3280c);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2130903922(0x7f030372, float:1.7414676E38)
            r9 = 2132018014(0x7f14035e, float:1.9674323E38)
            r1 = r19
            android.content.Context r1 = x5.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            j5.i r10 = new j5.i
            r10.<init>()
            r0.f3269i = r10
            r11 = 2
            int[] r1 = new int[r11]
            r0.f3271l = r1
            r12 = 1
            r0.f3274o = r12
            r0.f3275p = r12
            r13 = 0
            r0.f3276q = r13
            r0.f3277r = r13
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f3279t = r1
            android.content.Context r14 = r18.getContext()
            j5.h r15 = new j5.h
            r15.<init>(r14)
            r0.f3268h = r15
            int[] r6 = c.a.Q
            int[] r5 = new int[r13]
            j5.s.a(r14, r7, r8, r9)
            r4 = 2130903922(0x7f030372, float:1.7414676E38)
            r16 = 2132018014(0x7f14035e, float:1.9674323E38)
            r1 = r14
            r2 = r20
            r3 = r6
            r17 = r5
            r5 = r16
            r11 = r6
            r6 = r17
            j5.s.b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.i1 r1 = new androidx.appcompat.widget.i1
            android.content.res.TypedArray r2 = r14.obtainStyledAttributes(r7, r11, r8, r9)
            r1.<init>(r14, r2)
            boolean r2 = r1.l(r12)
            if (r2 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r2 = r1.e(r12)
            java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
            h0.y.d.q(r0, r2)
        L_0x006e:
            r2 = 7
            int r2 = r1.d(r2, r13)
            r0.f3277r = r2
            int r2 = r1.h(r13, r13)
            r0.f3276q = r2
            android.graphics.drawable.Drawable r2 = r18.getBackground()
            if (r2 == 0) goto L_0x0089
            android.graphics.drawable.Drawable r2 = r18.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00b4
        L_0x0089:
            r5.i$a r2 = r5.i.b(r14, r7, r8, r9)
            r5.i r3 = new r5.i
            r3.<init>(r2)
            android.graphics.drawable.Drawable r2 = r18.getBackground()
            r5.f r4 = new r5.f
            r4.<init>((r5.i) r3)
            boolean r3 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x00ac
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.k(r2)
        L_0x00ac:
            r4.i(r14)
            java.util.WeakHashMap<android.view.View, h0.l0> r2 = h0.y.f6776a
            h0.y.d.q(r0, r4)
        L_0x00b4:
            r2 = 8
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x00c4
            int r2 = r1.d(r2, r13)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00c4:
            r2 = 2
            boolean r2 = r1.a(r2, r13)
            r0.setFitsSystemWindows(r2)
            r2 = 3
            int r2 = r1.d(r2, r13)
            r0.k = r2
            r2 = 30
            boolean r3 = r1.l(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00e1
            android.content.res.ColorStateList r2 = r1.b(r2)
            goto L_0x00e2
        L_0x00e1:
            r2 = r4
        L_0x00e2:
            r3 = 33
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x00ef
            int r3 = r1.i(r3, r13)
            goto L_0x00f0
        L_0x00ef:
            r3 = r13
        L_0x00f0:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00fb
            if (r2 != 0) goto L_0x00fb
            android.content.res.ColorStateList r2 = r0.b(r5)
        L_0x00fb:
            r6 = 14
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0108
            android.content.res.ColorStateList r5 = r1.b(r6)
            goto L_0x010c
        L_0x0108:
            android.content.res.ColorStateList r5 = r0.b(r5)
        L_0x010c:
            r6 = 24
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0119
            int r6 = r1.i(r6, r13)
            goto L_0x011a
        L_0x0119:
            r6 = r13
        L_0x011a:
            r7 = 13
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0129
            int r7 = r1.d(r7, r13)
            r0.setItemIconSize(r7)
        L_0x0129:
            r7 = 25
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0136
            android.content.res.ColorStateList r7 = r1.b(r7)
            goto L_0x0137
        L_0x0136:
            r7 = r4
        L_0x0137:
            if (r6 != 0) goto L_0x0142
            if (r7 != 0) goto L_0x0142
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.b(r7)
        L_0x0142:
            r8 = 10
            android.graphics.drawable.Drawable r8 = r1.e(r8)
            if (r8 != 0) goto L_0x0188
            r9 = 17
            boolean r9 = r1.l(r9)
            if (r9 != 0) goto L_0x015d
            r9 = 18
            boolean r9 = r1.l(r9)
            if (r9 == 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r9 = r13
            goto L_0x015e
        L_0x015d:
            r9 = r12
        L_0x015e:
            if (r9 == 0) goto L_0x0188
            android.content.Context r8 = r18.getContext()
            r9 = 19
            android.content.res.ColorStateList r8 = n5.c.b(r8, r1, r9)
            android.graphics.drawable.InsetDrawable r8 = r0.c(r1, r8)
            r9 = 16
            android.content.res.ColorStateList r9 = n5.c.b(r14, r1, r9)
            if (r9 == 0) goto L_0x0188
            android.graphics.drawable.InsetDrawable r11 = r0.c(r1, r4)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = o5.a.a(r9)
            r12.<init>(r9, r4, r11)
            r10.f8651m = r12
            r10.f()
        L_0x0188:
            r4 = 11
            boolean r9 = r1.l(r4)
            if (r9 == 0) goto L_0x0197
            int r4 = r1.d(r4, r13)
            r0.setItemHorizontalPadding(r4)
        L_0x0197:
            r4 = 26
            boolean r9 = r1.l(r4)
            if (r9 == 0) goto L_0x01a6
            int r4 = r1.d(r4, r13)
            r0.setItemVerticalPadding(r4)
        L_0x01a6:
            r4 = 6
            int r4 = r1.d(r4, r13)
            r0.setDividerInsetStart(r4)
            r4 = 5
            int r4 = r1.d(r4, r13)
            r0.setDividerInsetEnd(r4)
            r4 = 32
            int r4 = r1.d(r4, r13)
            r0.setSubheaderInsetStart(r4)
            r4 = 31
            int r4 = r1.d(r4, r13)
            r0.setSubheaderInsetEnd(r4)
            r4 = 34
            boolean r9 = r0.f3274o
            boolean r4 = r1.a(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            r4 = 4
            boolean r9 = r0.f3275p
            boolean r4 = r1.a(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            r4 = 12
            int r4 = r1.d(r4, r13)
            r9 = 15
            r11 = 1
            int r9 = r1.h(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.a r9 = new com.google.android.material.navigation.a
            r9.<init>(r0)
            r15.f443e = r9
            r10.f8643d = r11
            r10.d(r14, r15)
            if (r3 == 0) goto L_0x0200
            r10.f8646g = r3
            r10.f()
        L_0x0200:
            r10.f8647h = r2
            r10.f()
            r10.k = r5
            r10.f()
            int r2 = r18.getOverScrollMode()
            r10.A = r2
            com.google.android.material.internal.NavigationMenuView r3 = r10.f8640a
            if (r3 == 0) goto L_0x0217
            r3.setOverScrollMode(r2)
        L_0x0217:
            if (r6 == 0) goto L_0x021e
            r10.f8648i = r6
            r10.f()
        L_0x021e:
            r10.f8649j = r7
            r10.f()
            r10.f8650l = r8
            r10.f()
            r10.f8654p = r4
            r10.f()
            android.content.Context r2 = r15.f439a
            r15.b(r10, r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f8640a
            if (r2 != 0) goto L_0x0278
            android.view.LayoutInflater r2 = r10.f8645f
            r3 = 2131492920(0x7f0c0038, float:1.8609306E38)
            android.view.View r2 = r2.inflate(r3, r0, r13)
            com.google.android.material.internal.NavigationMenuView r2 = (com.google.android.material.internal.NavigationMenuView) r2
            r10.f8640a = r2
            j5.i$h r3 = new j5.i$h
            com.google.android.material.internal.NavigationMenuView r4 = r10.f8640a
            r3.<init>(r4)
            r2.setAccessibilityDelegateCompat(r3)
            j5.i$c r2 = r10.f8644e
            if (r2 != 0) goto L_0x0258
            j5.i$c r2 = new j5.i$c
            r2.<init>()
            r10.f8644e = r2
        L_0x0258:
            int r2 = r10.A
            r3 = -1
            if (r2 == r3) goto L_0x0262
            com.google.android.material.internal.NavigationMenuView r3 = r10.f8640a
            r3.setOverScrollMode(r2)
        L_0x0262:
            android.view.LayoutInflater r2 = r10.f8645f
            r3 = 2131492917(0x7f0c0035, float:1.86093E38)
            com.google.android.material.internal.NavigationMenuView r4 = r10.f8640a
            android.view.View r2 = r2.inflate(r3, r4, r13)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r10.f8641b = r2
            com.google.android.material.internal.NavigationMenuView r2 = r10.f8640a
            j5.i$c r3 = r10.f8644e
            r2.setAdapter(r3)
        L_0x0278:
            com.google.android.material.internal.NavigationMenuView r2 = r10.f8640a
            r0.addView(r2)
            r2 = 27
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x028c
            int r2 = r1.i(r2, r13)
            r0.d(r2)
        L_0x028c:
            r2 = 9
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x02ae
            int r2 = r1.i(r2, r13)
            android.view.LayoutInflater r3 = r10.f8645f
            android.widget.LinearLayout r4 = r10.f8641b
            android.view.View r2 = r3.inflate(r2, r4, r13)
            android.widget.LinearLayout r3 = r10.f8641b
            r3.addView(r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f8640a
            int r3 = r2.getPaddingBottom()
            r2.setPadding(r13, r13, r13, r3)
        L_0x02ae:
            r1.n()
            l5.a r1 = new l5.a
            r1.<init>(r0)
            r0.f3273n = r1
            android.view.ViewTreeObserver r1 = r18.getViewTreeObserver()
            l5.a r2 = r0.f3273n
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f3272m == null) {
            this.f3272m = new f(getContext());
        }
        return this.f3272m;
    }

    public final void a(s0 s0Var) {
        int i10;
        i iVar = this.f3269i;
        iVar.getClass();
        int e10 = s0Var.e();
        if (iVar.f8661y != e10) {
            iVar.f8661y = e10;
            if (iVar.f8641b.getChildCount() != 0 || !iVar.w) {
                i10 = 0;
            } else {
                i10 = iVar.f8661y;
            }
            NavigationMenuView navigationMenuView = iVar.f8640a;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = iVar.f8640a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, s0Var.b());
        y.b(iVar.f8641b, s0Var);
    }

    public final ColorStateList b(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList b10 = y.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = b10.getDefaultColor();
        int[] iArr = f3267v;
        return new ColorStateList(new int[][]{iArr, u, FrameLayout.EMPTY_STATE_SET}, new int[]{b10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable c(i1 i1Var, ColorStateList colorStateList) {
        r5.f fVar = new r5.f(new r5.i(r5.i.a(getContext(), i1Var.i(17, 0), i1Var.i(18, 0), new r5.a((float) 0))));
        fVar.k(colorStateList);
        return new InsetDrawable(fVar, i1Var.d(22, 0), i1Var.d(23, 0), i1Var.d(21, 0), i1Var.d(20, 0));
    }

    public final void d(int i10) {
        i.c cVar = this.f3269i.f8644e;
        if (cVar != null) {
            cVar.f8666e = true;
        }
        getMenuInflater().inflate(i10, this.f3268h);
        i iVar = this.f3269i;
        i.c cVar2 = iVar.f8644e;
        if (cVar2 != null) {
            cVar2.f8666e = false;
        }
        iVar.f();
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f3278s == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f3278s);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f3269i.f8644e.f8665d;
    }

    public int getDividerInsetEnd() {
        return this.f3269i.f8657s;
    }

    public int getDividerInsetStart() {
        return this.f3269i.f8656r;
    }

    public int getHeaderCount() {
        return this.f3269i.f8641b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f3269i.f8650l;
    }

    public int getItemHorizontalPadding() {
        return this.f3269i.f8652n;
    }

    public int getItemIconPadding() {
        return this.f3269i.f8654p;
    }

    public ColorStateList getItemIconTintList() {
        return this.f3269i.k;
    }

    public int getItemMaxLines() {
        return this.f3269i.f8660x;
    }

    public ColorStateList getItemTextColor() {
        return this.f3269i.f8649j;
    }

    public int getItemVerticalPadding() {
        return this.f3269i.f8653o;
    }

    public Menu getMenu() {
        return this.f3268h;
    }

    public int getSubheaderInsetEnd() {
        return this.f3269i.u;
    }

    public int getSubheaderInsetStart() {
        return this.f3269i.f8658t;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.q(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f3273n);
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i12 = this.k;
            }
            super.onMeasure(i10, i11);
        }
        i12 = Math.min(View.MeasureSpec.getSize(i10), this.k);
        i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        super.onMeasure(i10, i11);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f9479a);
        h hVar = this.f3268h;
        Bundle bundle = bVar.f3280c;
        hVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !hVar.u.isEmpty()) {
            Iterator<WeakReference<j>> it = hVar.u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    hVar.u.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.e(parcelable2);
                    }
                }
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable j10;
        b bVar = new b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f3280c = bundle;
        h hVar = this.f3268h;
        if (!hVar.u.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<j>> it = hVar.u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    hVar.u.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (j10 = jVar.j()) != null) {
                        sparseArray.put(id, j10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return bVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!(getParent() instanceof DrawerLayout) || this.f3277r <= 0 || !(getBackground() instanceof r5.f)) {
            this.f3278s = null;
            this.f3279t.setEmpty();
            return;
        }
        r5.f fVar = (r5.f) getBackground();
        r5.i iVar = fVar.f11660a.f11681a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        int i14 = this.f3276q;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (Gravity.getAbsoluteGravity(i14, y.e.d(this)) == 3) {
            aVar.f((float) this.f3277r);
            aVar.d((float) this.f3277r);
        } else {
            aVar.e((float) this.f3277r);
            aVar.c((float) this.f3277r);
        }
        fVar.setShapeAppearanceModel(new r5.i(aVar));
        if (this.f3278s == null) {
            this.f3278s = new Path();
        }
        this.f3278s.reset();
        this.f3279t.set(0.0f, 0.0f, (float) i10, (float) i11);
        r5.j jVar = j.a.f11736a;
        f.b bVar = fVar.f11660a;
        jVar.a(bVar.f11681a, bVar.f11690j, this.f3279t, (f.a) null, this.f3278s);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z9) {
        this.f3275p = z9;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f3268h.findItem(i10);
        if (findItem != null) {
            this.f3269i.f8644e.h((androidx.appcompat.view.menu.h) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8657s = i10;
        iVar.f();
    }

    public void setDividerInsetStart(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8656r = i10;
        iVar.f();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof r5.f) {
            ((r5.f) background).j(f10);
        }
    }

    public void setItemBackground(Drawable drawable) {
        j5.i iVar = this.f3269i;
        iVar.f8650l = drawable;
        iVar.f();
    }

    public void setItemBackgroundResource(int i10) {
        Context context = getContext();
        Object obj = y.a.f13006a;
        setItemBackground(a.b.b(context, i10));
    }

    public void setItemHorizontalPadding(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8652n = i10;
        iVar.f();
    }

    public void setItemHorizontalPaddingResource(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8652n = getResources().getDimensionPixelSize(i10);
        iVar.f();
    }

    public void setItemIconPadding(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8654p = i10;
        iVar.f();
    }

    public void setItemIconPaddingResource(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8654p = getResources().getDimensionPixelSize(i10);
        iVar.f();
    }

    public void setItemIconSize(int i10) {
        j5.i iVar = this.f3269i;
        if (iVar.f8655q != i10) {
            iVar.f8655q = i10;
            iVar.f8659v = true;
            iVar.f();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        j5.i iVar = this.f3269i;
        iVar.k = colorStateList;
        iVar.f();
    }

    public void setItemMaxLines(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8660x = i10;
        iVar.f();
    }

    public void setItemTextAppearance(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8648i = i10;
        iVar.f();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        j5.i iVar = this.f3269i;
        iVar.f8649j = colorStateList;
        iVar.f();
    }

    public void setItemVerticalPadding(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8653o = i10;
        iVar.f();
    }

    public void setItemVerticalPaddingResource(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8653o = getResources().getDimensionPixelSize(i10);
        iVar.f();
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.f3270j = aVar;
    }

    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        j5.i iVar = this.f3269i;
        if (iVar != null) {
            iVar.A = i10;
            NavigationMenuView navigationMenuView = iVar.f8640a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        j5.i iVar = this.f3269i;
        iVar.u = i10;
        iVar.f();
    }

    public void setSubheaderInsetStart(int i10) {
        j5.i iVar = this.f3269i;
        iVar.f8658t = i10;
        iVar.f();
    }

    public void setTopInsetScrimEnabled(boolean z9) {
        this.f3274o = z9;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f3268h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f3269i.f8644e.h((androidx.appcompat.view.menu.h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
