package com.google.android.material.appbar;

import android.view.View;
import i0.j;

public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2891b;

    public c(AppBarLayout appBarLayout, boolean z9) {
        this.f2890a = appBarLayout;
        this.f2891b = z9;
    }

    public final boolean a(View view) {
        this.f2890a.setExpanded(this.f2891b);
        return true;
    }
}
