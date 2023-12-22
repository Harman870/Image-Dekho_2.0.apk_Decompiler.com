package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12529a;

    public e(g gVar) {
        this.f12529a = gVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f12529a.f12562b.g(true);
    }
}
