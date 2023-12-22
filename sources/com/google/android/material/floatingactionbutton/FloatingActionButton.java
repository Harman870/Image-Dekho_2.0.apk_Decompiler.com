package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import i5.d;
import j4.r5;
import j5.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.h;
import r5.f;
import r5.i;
import r5.m;
import s4.g;
import v4.b;
import v4.e;

public class FloatingActionButton extends y implements h5.a, m, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f3188b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f3189c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f3190d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f3191e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f3192f;

    /* renamed from: g  reason: collision with root package name */
    public int f3193g;

    /* renamed from: h  reason: collision with root package name */
    public int f3194h;

    /* renamed from: i  reason: collision with root package name */
    public int f3195i;

    /* renamed from: j  reason: collision with root package name */
    public int f3196j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3197l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f3198m = new Rect();

    /* renamed from: n  reason: collision with root package name */
    public final Rect f3199n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    public final o f3200o;

    /* renamed from: p  reason: collision with root package name */
    public final r5 f3201p;

    /* renamed from: q  reason: collision with root package name */
    public d f3202q;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3203a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3204b;

        public BaseBehavior() {
            this.f3204b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.D);
            this.f3204b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f3198m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1242h == 0) {
                fVar.f1242h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z9;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z9 = ((CoordinatorLayout.f) layoutParams).f1235a instanceof BottomSheetBehavior;
                } else {
                    z9 = false;
                }
                if (z9) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z9;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList f10 = coordinatorLayout.f(floatingActionButton);
            int size = f10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) f10.get(i13);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z9 = ((CoordinatorLayout.f) layoutParams).f1235a instanceof BottomSheetBehavior;
                    } else {
                        z9 = false;
                    }
                    if (z9 && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            Rect rect = floatingActionButton.f3198m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                i11 = rect.right;
            } else if (floatingActionButton.getLeft() <= fVar.leftMargin) {
                i11 = -rect.left;
            } else {
                i11 = 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                i12 = rect.bottom;
            } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                i12 = -rect.top;
            }
            if (i12 != 0) {
                WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                floatingActionButton.offsetTopAndBottom(i12);
            }
            if (i11 == 0) {
                return true;
            }
            WeakHashMap<View, l0> weakHashMap2 = h0.y.f6776a;
            floatingActionButton.offsetLeftAndRight(i11);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f3204b && fVar.f1240f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3203a == null) {
                this.f3203a = new Rect();
            }
            Rect rect = this.f3203a;
            j5.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h((v4.b) null, false);
                return true;
            }
            floatingActionButton.m((b.a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.h((v4.b) null, false);
                return true;
            }
            floatingActionButton.m((b.a) null, false);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b implements q5.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {
        public c(FloatingActionButton floatingActionButton) {
        }

        public final void a() {
            throw null;
        }

        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 2130903548(0x7f0301fc, float:1.7413917E38)
            r9 = 2132018013(0x7f14035d, float:1.967432E38)
            r1 = r17
            android.content.Context r1 = x5.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3198m = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3199n = r1
            android.content.Context r10 = r16.getContext()
            int[] r3 = c.a.C
            r11 = 0
            int[] r6 = new int[r11]
            r4 = 2130903548(0x7f0301fc, float:1.7413917E38)
            r5 = 2132018013(0x7f14035d, float:1.967432E38)
            r1 = r10
            r2 = r18
            android.content.res.TypedArray r1 = j5.s.d(r1, r2, r3, r4, r5, r6)
            r2 = 1
            android.content.res.ColorStateList r3 = n5.c.a(r10, r1, r2)
            r0.f3188b = r3
            r3 = 2
            r4 = -1
            int r3 = r1.getInt(r3, r4)
            r5 = 0
            android.graphics.PorterDuff$Mode r3 = j5.x.b(r3, r5)
            r0.f3189c = r3
            r3 = 12
            android.content.res.ColorStateList r3 = n5.c.a(r10, r1, r3)
            r0.f3192f = r3
            r3 = 7
            int r3 = r1.getInt(r3, r4)
            r0.f3194h = r3
            r3 = 6
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.f3195i = r3
            r3 = 3
            int r3 = r1.getDimensionPixelSize(r3, r11)
            r0.f3193g = r3
            r3 = 4
            r4 = 0
            float r3 = r1.getDimension(r3, r4)
            r5 = 9
            float r5 = r1.getDimension(r5, r4)
            r6 = 11
            float r4 = r1.getDimension(r6, r4)
            r6 = 16
            boolean r6 = r1.getBoolean(r6, r11)
            r0.f3197l = r6
            android.content.res.Resources r6 = r16.getResources()
            r12 = 2131100324(0x7f0602a4, float:1.7813026E38)
            int r6 = r6.getDimensionPixelSize(r12)
            r12 = 10
            int r12 = r1.getDimensionPixelSize(r12, r11)
            r0.setMaxImageSize(r12)
            r12 = 15
            s4.g r12 = s4.g.a(r10, r1, r12)
            r13 = 8
            s4.g r13 = s4.g.a(r10, r1, r13)
            r5.g r14 = r5.i.f11702m
            int[] r15 = c.a.M
            android.content.res.TypedArray r9 = r10.obtainStyledAttributes(r7, r15, r8, r9)
            int r15 = r9.getResourceId(r11, r11)
            int r8 = r9.getResourceId(r2, r11)
            r9.recycle()
            r5.i$a r8 = r5.i.a(r10, r15, r8, r14)
            r5.i r9 = new r5.i
            r9.<init>(r8)
            r8 = 5
            boolean r8 = r1.getBoolean(r8, r11)
            boolean r2 = r1.getBoolean(r11, r2)
            r0.setEnabled(r2)
            r1.recycle()
            androidx.appcompat.widget.o r1 = new androidx.appcompat.widget.o
            r1.<init>(r0)
            r0.f3200o = r1
            r2 = 2130903548(0x7f0301fc, float:1.7413917E38)
            r1.b(r7, r2)
            j4.r5 r1 = new j4.r5
            r1.<init>(r0)
            r0.f3201p = r1
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            r1.n(r9)
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            android.content.res.ColorStateList r2 = r0.f3188b
            android.graphics.PorterDuff$Mode r7 = r0.f3189c
            android.content.res.ColorStateList r9 = r0.f3192f
            int r10 = r0.f3193g
            r1.g(r2, r7, r9, r10)
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            r1.k = r6
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            float r2 = r1.f3222h
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0110
            r1.f3222h = r3
            float r2 = r1.f3223i
            float r6 = r1.f3224j
            r1.k(r3, r2, r6)
        L_0x0110:
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            float r2 = r1.f3223i
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0123
            r1.f3223i = r5
            float r2 = r1.f3222h
            float r3 = r1.f3224j
            r1.k(r2, r5, r3)
        L_0x0123:
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            float r2 = r1.f3224j
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            r1.f3224j = r4
            float r2 = r1.f3222h
            float r3 = r1.f3223i
            r1.k(r2, r3, r4)
        L_0x0136:
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            r1.f3226m = r12
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            r1.f3227n = r13
            com.google.android.material.floatingactionbutton.d r1 = r16.getImpl()
            r1.f3220f = r8
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r0.setScaleType(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private d getImpl() {
        if (this.f3202q == null) {
            this.f3202q = new i5.d(this, new b());
        }
        return this.f3202q;
    }

    public final boolean a() {
        return this.f3201p.f8439a;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.f3233t == null) {
            impl.f3233t = new ArrayList<>();
        }
        impl.f3233t.add((Object) null);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(e eVar) {
        d impl = getImpl();
        if (impl.f3232s == null) {
            impl.f3232s = new ArrayList<>();
        }
        impl.f3232s.add(eVar);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.u == null) {
            impl.u = new ArrayList<>();
        }
        impl.u.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f3195i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
        }
        return resources.getDimensionPixelSize(i10 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f3188b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3189c;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f3223i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3224j;
    }

    public Drawable getContentBackground() {
        return getImpl().f3219e;
    }

    public int getCustomSize() {
        return this.f3195i;
    }

    public int getExpandedComponentIdHint() {
        return this.f3201p.f8440b;
    }

    public g getHideMotionSpec() {
        return getImpl().f3227n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3192f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3192f;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f3215a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f3226m;
    }

    public int getSize() {
        return this.f3194h;
    }

    public int getSizeDimension() {
        return g(this.f3194h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3190d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3191e;
    }

    public boolean getUseCompatPadding() {
        return this.f3197l;
    }

    public final void h(v4.b bVar, boolean z9) {
        a aVar;
        boolean z10;
        int i10;
        AnimatorSet animatorSet;
        d impl = getImpl();
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = new a(this, bVar);
        }
        boolean z11 = true;
        if (impl.f3234v.getVisibility() != 0 ? impl.f3231r == 2 : impl.f3231r != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            Animator animator = impl.f3225l;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl.f3234v;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            if (!y.g.c(floatingActionButton) || impl.f3234v.isInEditMode()) {
                z11 = false;
            }
            if (z11) {
                g gVar = impl.f3227n;
                if (gVar != null) {
                    animatorSet = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = impl.c(0.0f, 0.4f, 0.4f, d.F, d.G);
                }
                animatorSet.addListener(new b(impl, z9, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3233t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            FloatingActionButton floatingActionButton2 = impl.f3234v;
            if (z9) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton2.b(i10, z9);
            if (aVar != null) {
                aVar.f3206a.a(aVar.f3207b);
            }
        }
    }

    public final boolean i() {
        d impl = getImpl();
        int visibility = impl.f3234v.getVisibility();
        int i10 = impl.f3231r;
        if (visibility == 0) {
            if (i10 != 1) {
                return false;
            }
        } else if (i10 == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        d impl = getImpl();
        int visibility = impl.f3234v.getVisibility();
        int i10 = impl.f3231r;
        if (visibility != 0) {
            if (i10 != 2) {
                return false;
            }
        } else if (i10 == 1) {
            return false;
        }
        return true;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f3198m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f3190d;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f3191e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(j.c(colorForState, mode));
        }
    }

    public final void m(b.a aVar, boolean z9) {
        a aVar2;
        boolean z10;
        boolean z11;
        AnimatorSet animatorSet;
        float f10;
        float f11;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new a(this, aVar);
        }
        boolean z12 = true;
        if (impl.f3234v.getVisibility() == 0 ? impl.f3231r == 1 : impl.f3231r != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            Animator animator = impl.f3225l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f3226m == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            FloatingActionButton floatingActionButton = impl.f3234v;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            if (!y.g.c(floatingActionButton) || impl.f3234v.isInEditMode()) {
                z12 = false;
            }
            if (z12) {
                if (impl.f3234v.getVisibility() != 0) {
                    float f12 = 0.0f;
                    impl.f3234v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton2 = impl.f3234v;
                    if (z11) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton2.setScaleY(f10);
                    FloatingActionButton floatingActionButton3 = impl.f3234v;
                    if (z11) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton3.setScaleX(f11);
                    if (z11) {
                        f12 = 0.4f;
                    }
                    impl.f3229p = f12;
                    Matrix matrix = impl.A;
                    impl.a(f12, matrix);
                    impl.f3234v.setImageMatrix(matrix);
                }
                g gVar = impl.f3226m;
                if (gVar != null) {
                    animatorSet = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = impl.c(1.0f, 1.0f, 1.0f, d.D, d.E);
                }
                animatorSet.addListener(new c(impl, z9, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3232s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f3234v.b(0, z9);
            impl.f3234v.setAlpha(1.0f);
            impl.f3234v.setScaleY(1.0f);
            impl.f3234v.setScaleX(1.0f);
            impl.f3229p = 1.0f;
            Matrix matrix2 = impl.A;
            impl.a(1.0f, matrix2);
            impl.f3234v.setImageMatrix(matrix2);
            if (aVar2 != null) {
                aVar2.f3206a.b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        f fVar = impl.f3216b;
        if (fVar != null) {
            z5.c.r(impl.f3234v, fVar);
        }
        if (!(impl instanceof i5.d)) {
            ViewTreeObserver viewTreeObserver = impl.f3234v.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new i5.c(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f3234v.getViewTreeObserver();
        i5.c cVar = impl.B;
        if (cVar != null) {
            viewTreeObserver.removeOnPreDrawListener(cVar);
            impl.B = null;
        }
    }

    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f3196j = (sizeDimension - this.k) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f3198m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof u5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u5.a aVar = (u5.a) parcelable;
        super.onRestoreInstanceState(aVar.f9479a);
        r5 r5Var = this.f3201p;
        Bundle orDefault = aVar.f12202c.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        r5Var.getClass();
        r5Var.f8439a = orDefault.getBoolean("expanded", false);
        r5Var.f8440b = orDefault.getInt("expandedComponentIdHint", 0);
        if (r5Var.f8439a) {
            ViewParent parent = ((View) r5Var.f8441c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).d((View) r5Var.f8441c);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        u5.a aVar = new u5.a(onSaveInstanceState);
        h<String, Bundle> hVar = aVar.f12202c;
        r5 r5Var = this.f3201p;
        r5Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", r5Var.f8439a);
        bundle.putInt("expandedComponentIdHint", r5Var.f8440b);
        hVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f3199n;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            if (y.g.c(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                k(rect);
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !this.f3199n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3188b != colorStateList) {
            this.f3188b = colorStateList;
            d impl = getImpl();
            f fVar = impl.f3216b;
            if (fVar != null) {
                fVar.setTintList(colorStateList);
            }
            i5.a aVar = impl.f3218d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f7867m = colorStateList.getColorForState(aVar.getState(), aVar.f7867m);
                }
                aVar.f7870p = colorStateList;
                aVar.f7868n = true;
                aVar.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3189c != mode) {
            this.f3189c = mode;
            f fVar = getImpl().f3216b;
            if (fVar != null) {
                fVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f3222h != f10) {
            impl.f3222h = f10;
            impl.k(f10, impl.f3223i, impl.f3224j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3223i != f10) {
            impl.f3223i = f10;
            impl.k(impl.f3222h, f10, impl.f3224j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3224j != f10) {
            impl.f3224j = f10;
            impl.k(impl.f3222h, impl.f3223i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f3195i) {
            this.f3195i = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = getImpl().f3216b;
        if (fVar != null) {
            fVar.j(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        if (z9 != getImpl().f3220f) {
            getImpl().f3220f = z9;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f3201p.f8440b = i10;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f3227n = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f10 = impl.f3229p;
            impl.f3229p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f3234v.setImageMatrix(matrix);
            if (this.f3190d != null) {
                l();
            }
        }
    }

    public void setImageResource(int i10) {
        this.f3200o.c(i10);
        l();
    }

    public void setMaxImageSize(int i10) {
        this.k = i10;
        d impl = getImpl();
        if (impl.f3230q != i10) {
            impl.f3230q = i10;
            float f10 = impl.f3229p;
            impl.f3229p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f3234v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3192f != colorStateList) {
            this.f3192f = colorStateList;
            getImpl().m(this.f3192f);
        }
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<d.f> arrayList = getImpl().u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<d.f> arrayList = getImpl().u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z9) {
        d impl = getImpl();
        impl.f3221g = z9;
        impl.q();
    }

    public void setShapeAppearanceModel(i iVar) {
        getImpl().n(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f3226m = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f3195i = 0;
        if (i10 != this.f3194h) {
            this.f3194h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3190d != colorStateList) {
            this.f3190d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3191e != mode) {
            this.f3191e = mode;
            l();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f3197l != z9) {
            this.f3197l = z9;
            getImpl().i();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
