package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12547a;

    public n(o oVar) {
        this.f12547a = oVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f12547a.q();
        this.f12547a.f12560r.start();
    }
}
