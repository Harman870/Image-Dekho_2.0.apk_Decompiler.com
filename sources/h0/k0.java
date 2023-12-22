package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class k0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f6705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6706b;

    public k0(m0 m0Var, View view) {
        this.f6705a = m0Var;
        this.f6706b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6705a.e(this.f6706b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6705a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f6705a.k();
    }
}
