package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import i0.j;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2886b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2887c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2888d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2889e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f2889e = baseBehavior;
        this.f2885a = coordinatorLayout;
        this.f2886b = appBarLayout;
        this.f2887c = view;
        this.f2888d = i10;
    }

    public final boolean a(View view) {
        this.f2889e.E(this.f2885a, this.f2886b, this.f2887c, this.f2888d, new int[]{0, 0});
        return true;
    }
}
