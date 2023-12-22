package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f2036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2037b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2038c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2039d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.z zVar) {
        this.f2039d = kVar;
        this.f2036a = zVar;
        this.f2037b = viewPropertyAnimator;
        this.f2038c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2037b.setListener((Animator.AnimatorListener) null);
        this.f2038c.setAlpha(1.0f);
        this.f2039d.c(this.f2036a);
        this.f2039d.f2067q.remove(this.f2036a);
        this.f2039d.j();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2039d.getClass();
    }
}
