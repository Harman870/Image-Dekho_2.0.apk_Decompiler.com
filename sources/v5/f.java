package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12530a;

    public f(g gVar) {
        this.f12530a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f12530a.f12562b.g(false);
    }
}
