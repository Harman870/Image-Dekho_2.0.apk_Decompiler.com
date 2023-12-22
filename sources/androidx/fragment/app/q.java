package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f1607a;

    /* renamed from: b  reason: collision with root package name */
    public final Animator f1608b;

    public q(Animator animator) {
        this.f1607a = null;
        this.f1608b = animator;
    }

    public q(Animation animation) {
        this.f1607a = animation;
        this.f1608b = null;
    }
}
