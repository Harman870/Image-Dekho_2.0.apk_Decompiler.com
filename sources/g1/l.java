package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import m.b;

public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f6528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f6529b;

    public l(k kVar, b bVar) {
        this.f6529b = kVar;
        this.f6528a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6528a.remove(animator);
        this.f6529b.f6515m.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6529b.f6515m.add(animator);
    }
}
