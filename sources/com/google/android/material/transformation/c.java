package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c5.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3456a;

    public c(d dVar) {
        this.f3456a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d.C0023d revealInfo = this.f3456a.getRevealInfo();
        revealInfo.f2465c = Float.MAX_VALUE;
        this.f3456a.setRevealInfo(revealInfo);
    }
}
