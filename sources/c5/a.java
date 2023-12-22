package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f2458a;

    public a(d dVar) {
        this.f2458a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2458a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2458a.b();
    }
}
