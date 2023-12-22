package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f12508a;

    public a(BottomAppBar bottomAppBar) {
        this.f12508a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f12508a.getClass();
        this.f12508a.V = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f12508a.getClass();
    }
}
