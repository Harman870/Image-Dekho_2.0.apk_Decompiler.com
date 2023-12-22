package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f2040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2041b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2042c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2043d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.z zVar) {
        this.f2043d = kVar;
        this.f2040a = zVar;
        this.f2041b = view;
        this.f2042c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2041b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2042c.setListener((Animator.AnimatorListener) null);
        this.f2043d.c(this.f2040a);
        this.f2043d.f2065o.remove(this.f2040a);
        this.f2043d.j();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2043d.getClass();
    }
}
