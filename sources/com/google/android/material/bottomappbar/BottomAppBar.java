package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import j5.x;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v4.e;
import v4.f;
import z5.c;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f2916x0 = 0;
    public Integer U;
    public Animator V;
    public Animator W;

    /* renamed from: o0  reason: collision with root package name */
    public int f2917o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2918q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2919r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2920s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2921t0;
    public int u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2922v0;

    /* renamed from: w0  reason: collision with root package name */
    public Behavior f2923w0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j  reason: collision with root package name */
        public final Rect f2924j = new Rect();
        public WeakReference<BottomAppBar> k;

        /* renamed from: l  reason: collision with root package name */
        public int f2925l;

        /* renamed from: m  reason: collision with root package name */
        public final a f2926m = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = Behavior.this.k.get();
                if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = Behavior.this.f2924j;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.k(rect);
                    int height2 = Behavior.this.f2924j.height();
                    bottomAppBar.B(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f11707e.a(new RectF(Behavior.this.f2924j)));
                    height = height2;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f2925l == 0) {
                    if (bottomAppBar.f2918q0 == 1) {
                        fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (x.a(view)) {
                        fVar.leftMargin += 0;
                    } else {
                        fVar.rightMargin += 0;
                    }
                }
                int i18 = BottomAppBar.f2916x0;
                bottomAppBar.A();
                throw null;
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.k = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f2916x0;
            View w = bottomAppBar.w();
            if (w != null) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (!y.g.c(w)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) w.getLayoutParams();
                    fVar.f1238d = 17;
                    int i12 = bottomAppBar.f2918q0;
                    if (i12 == 1) {
                        fVar.f1238d = 49;
                    }
                    if (i12 == 0) {
                        fVar.f1238d |= 80;
                    }
                    this.f2925l = ((CoordinatorLayout.f) w.getLayoutParams()).bottomMargin;
                    if (w instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) w;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d();
                        floatingActionButton.e(new e(bottomAppBar));
                        floatingActionButton.f();
                    }
                    w.addOnLayoutChangeListener(this.f2926m);
                    bottomAppBar.A();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i10);
            super.h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11);
        }
    }

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f2928a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2929b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f2930c;

        public a(ActionMenuView actionMenuView, int i10, boolean z9) {
            this.f2928a = actionMenuView;
            this.f2929b = i10;
            this.f2930c = z9;
        }

        public final void run() {
            ActionMenuView actionMenuView = this.f2928a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.x(actionMenuView, this.f2929b, this.f2930c));
        }
    }

    public static class b extends n0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2932c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2933d;

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
            this.f2932c = parcel.readInt();
            this.f2933d = parcel.readInt() != 0;
        }

        public b(Toolbar.i iVar) {
            super(iVar);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f2932c);
            parcel.writeInt(this.f2933d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return k5.a.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return y(this.f2917o0);
    }

    private float getFabTranslationY() {
        if (this.f2918q0 == 1) {
            return -getTopEdgeTreatment().f12522d;
        }
        View w = w();
        int i10 = 0;
        if (w != null) {
            i10 = (-((getMeasuredHeight() + getBottomInset()) - w.getMeasuredHeight())) / 2;
        }
        return (float) i10;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final void A() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f2922v0) {
            z();
        }
        throw null;
    }

    public final void B(int i10) {
        float f10 = (float) i10;
        if (f10 != getTopEdgeTreatment().f12521c) {
            getTopEdgeTreatment().f12521c = f10;
            throw null;
        }
    }

    public final void C(ActionMenuView actionMenuView, int i10, boolean z9, boolean z10) {
        a aVar = new a(actionMenuView, i10, z9);
        if (z10) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.f2923w0 == null) {
            this.f2923w0 = new Behavior();
        }
        return this.f2923w0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f12522d;
    }

    public int getFabAlignmentMode() {
        return this.f2917o0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f2919r0;
    }

    public int getFabAnchorMode() {
        return this.f2918q0;
    }

    public int getFabAnimationMode() {
        return this.p0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f12520b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f12519a;
    }

    public boolean getHideOnScroll() {
        return this.f2921t0;
    }

    public int getMenuAlignmentMode() {
        return this.f2920s0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.r(this, (r5.f) null);
        throw null;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.V;
            if (animator2 != null) {
                animator2.cancel();
            }
            A();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.W == null) {
            actionMenuView.setAlpha(1.0f);
            if (!z()) {
                C(actionMenuView, 0, false, false);
            } else {
                C(actionMenuView, this.f2917o0, this.f2922v0, false);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f9479a);
        this.f2917o0 = bVar.f2932c;
        this.f2922v0 = bVar.f2933d;
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b((Toolbar.i) super.onSaveInstanceState());
        bVar.f2932c = this.f2917o0;
        bVar.f2933d = this.f2922v0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h((Drawable) null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f12522d = f10;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    public void setElevation(float f10) {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFabAlignmentMode(int r13) {
        /*
            r12 = this;
            r0 = 0
            r12.u0 = r0
            boolean r1 = r12.f2922v0
            java.util.WeakHashMap<android.view.View, h0.l0> r2 = h0.y.f6776a
            boolean r2 = h0.y.g.c(r12)
            r3 = 1
            if (r2 != 0) goto L_0x0020
            int r1 = r12.u0
            if (r1 == 0) goto L_0x00b6
            r12.u0 = r0
            android.view.Menu r2 = r12.getMenu()
            r2.clear()
            r12.k(r1)
            goto L_0x00b6
        L_0x0020:
            android.animation.Animator r2 = r12.W
            if (r2 == 0) goto L_0x0027
            r2.cancel()
        L_0x0027:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = r12.z()
            if (r4 != 0) goto L_0x0035
            r1 = r0
            r4 = r1
            goto L_0x0036
        L_0x0035:
            r4 = r13
        L_0x0036:
            androidx.appcompat.widget.ActionMenuView r5 = r12.getActionMenuView()
            if (r5 != 0) goto L_0x003d
            goto L_0x009f
        L_0x003d:
            int r6 = r12.getFabAlignmentAnimationDuration()
            float r6 = (float) r6
            float[] r7 = new float[r3]
            r8 = 1065353216(0x3f800000, float:1.0)
            r7[r0] = r8
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r5, r9, r7)
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r10 = r10 * r6
            long r10 = (long) r10
            r7.setDuration(r10)
            float r10 = r5.getTranslationX()
            int r11 = r12.x(r5, r4, r1)
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0094
            float[] r8 = new float[r3]
            r10 = 0
            r8[r0] = r10
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r5, r9, r8)
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            float r6 = r6 * r9
            long r9 = (long) r6
            r8.setDuration(r9)
            v4.d r6 = new v4.d
            r6.<init>(r12, r5, r4, r1)
            r8.addListener(r6)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r0] = r8
            r4[r3] = r7
            r1.playSequentially(r4)
            r2.add(r1)
            goto L_0x009f
        L_0x0094:
            float r1 = r5.getAlpha()
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x009f
            r2.add(r7)
        L_0x009f:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r1.playTogether(r2)
            r12.W = r1
            v4.c r2 = new v4.c
            r2.<init>(r12)
            r1.addListener(r2)
            android.animation.Animator r1 = r12.W
            r1.start()
        L_0x00b6:
            int r1 = r12.f2917o0
            if (r1 == r13) goto L_0x013b
            boolean r1 = h0.y.g.c(r12)
            if (r1 != 0) goto L_0x00c2
            goto L_0x013b
        L_0x00c2:
            android.animation.Animator r1 = r12.V
            if (r1 == 0) goto L_0x00c9
            r1.cancel()
        L_0x00c9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.p0
            r4 = 0
            if (r2 != r3) goto L_0x00f8
            android.view.View r2 = r12.w()
            boolean r5 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r5 == 0) goto L_0x00de
            r4 = r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
        L_0x00de:
            float[] r2 = new float[r3]
            float r3 = r12.y(r13)
            r2[r0] = r3
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            int r2 = r12.getFabAlignmentAnimationDuration()
            long r2 = (long) r2
            r0.setDuration(r2)
            r1.add(r0)
            goto L_0x0114
        L_0x00f8:
            android.view.View r0 = r12.w()
            boolean r2 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r2 == 0) goto L_0x0103
            r4 = r0
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
        L_0x0103:
            if (r4 == 0) goto L_0x0114
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x010c
            goto L_0x0114
        L_0x010c:
            v4.b r0 = new v4.b
            r0.<init>(r12, r13)
            r4.h(r0, r3)
        L_0x0114:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r1)
            android.content.Context r1 = r12.getContext()
            r2 = 2130903891(0x7f030353, float:1.7414613E38)
            android.view.animation.LinearInterpolator r3 = s4.a.f11855a
            android.animation.TimeInterpolator r1 = k5.a.d(r1, r2, r3)
            r0.setInterpolator(r1)
            r12.V = r0
            v4.a r1 = new v4.a
            r1.<init>(r12)
            r0.addListener(r1)
            android.animation.Animator r0 = r12.V
            r0.start()
        L_0x013b:
            r12.f2917o0 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.setFabAlignmentMode(int):void");
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f2919r0 != i10) {
            this.f2919r0 = i10;
            A();
            throw null;
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f2918q0 = i10;
        A();
        throw null;
    }

    public void setFabAnimationMode(int i10) {
        this.p0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f12523e) {
            getTopEdgeTreatment().f12523e = f10;
            throw null;
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f12520b = f10;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f12519a = f10;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z9) {
        this.f2921t0 = z9;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f2920s0 != i10) {
            this.f2920s0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                C(actionMenuView, this.f2917o0, z(), false);
            }
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.U == null)) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View w() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            v.a r2 = r0.f1216b
            java.lang.Object r2 = r2.f12378b
            m.h r2 = (m.h) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = r0.f1218d
            r3.clear()
            if (r2 == 0) goto L_0x0028
            java.util.ArrayList r3 = r0.f1218d
            r3.addAll(r2)
        L_0x0028:
            java.util.ArrayList r0 = r0.f1218d
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x0042
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x002e
        L_0x0042:
            return r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.w():android.view.View");
    }

    public final int x(ActionMenuView actionMenuView, int i10, boolean z9) {
        int i11;
        if (this.f2920s0 != 1 && (i10 != 1 || !z9)) {
            return 0;
        }
        boolean a10 = x.a(this);
        int measuredWidth = a10 ? getMeasuredWidth() : 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f5858a & 8388615) == 8388611) {
                measuredWidth = a10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = a10 ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            i11 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!a10) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        return measuredWidth - ((right + 0) + i11);
    }

    public final float y(int i10) {
        boolean a10 = x.a(this);
        int i11 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        View w = w();
        int i12 = 0;
        if (!(this.f2919r0 == -1 || w == null)) {
            i12 = 0 + (w.getMeasuredWidth() / 2) + this.f2919r0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - i12;
        if (a10) {
            i11 = -1;
        }
        return (float) (measuredWidth * i11);
    }

    public final boolean z() {
        FloatingActionButton floatingActionButton;
        View w = w();
        if (w instanceof FloatingActionButton) {
            floatingActionButton = (FloatingActionButton) w;
        } else {
            floatingActionButton = null;
        }
        if (floatingActionButton == null || !floatingActionButton.j()) {
            return false;
        }
        return true;
    }
}
