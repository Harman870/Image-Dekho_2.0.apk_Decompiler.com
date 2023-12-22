package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import c5.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f3455b;

    public b(d dVar, Drawable drawable) {
        this.f3454a = dVar;
        this.f3455b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3454a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f3454a.setCircularRevealOverlayDrawable(this.f3455b);
    }
}
