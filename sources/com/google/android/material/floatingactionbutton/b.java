package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3209b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f3210c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3211d;

    public b(d dVar, boolean z9, a aVar) {
        this.f3211d = dVar;
        this.f3209b = z9;
        this.f3210c = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3208a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        int i10;
        d dVar = this.f3211d;
        dVar.f3231r = 0;
        dVar.f3225l = null;
        if (!this.f3208a) {
            FloatingActionButton floatingActionButton = dVar.f3234v;
            boolean z9 = this.f3209b;
            if (z9) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z9);
            d.g gVar = this.f3210c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f3206a.a(aVar.f3207b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f3211d.f3234v.b(0, this.f3209b);
        d dVar = this.f3211d;
        dVar.f3231r = 1;
        dVar.f3225l = animator;
        this.f3208a = false;
    }
}
