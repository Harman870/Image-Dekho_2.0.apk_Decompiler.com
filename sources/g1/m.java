package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6530a;

    public m(k kVar) {
        this.f6530a = kVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6530a.n();
        animator.removeListener(this);
    }
}
