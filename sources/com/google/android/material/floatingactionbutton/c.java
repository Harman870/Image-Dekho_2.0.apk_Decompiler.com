package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3212a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f3213b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3214c;

    public c(d dVar, boolean z9, a aVar) {
        this.f3214c = dVar;
        this.f3212a = z9;
        this.f3213b = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3214c;
        dVar.f3231r = 0;
        dVar.f3225l = null;
        d.g gVar = this.f3213b;
        if (gVar != null) {
            ((a) gVar).f3206a.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f3214c.f3234v.b(0, this.f3212a);
        d dVar = this.f3214c;
        dVar.f3231r = 2;
        dVar.f3225l = animator;
    }
}
