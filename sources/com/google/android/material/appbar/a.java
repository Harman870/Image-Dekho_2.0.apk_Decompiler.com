package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2882a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2883b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2884c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f2884c = baseBehavior;
        this.f2882a = coordinatorLayout;
        this.f2883b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2884c.A(this.f2882a, this.f2883b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
