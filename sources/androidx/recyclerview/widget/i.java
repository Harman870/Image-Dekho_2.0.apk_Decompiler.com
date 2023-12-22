package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f2050a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2051b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2052c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2053d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2053d = kVar;
        this.f2050a = aVar;
        this.f2051b = viewPropertyAnimator;
        this.f2052c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2051b.setListener((Animator.AnimatorListener) null);
        this.f2052c.setAlpha(1.0f);
        this.f2052c.setTranslationX(0.0f);
        this.f2052c.setTranslationY(0.0f);
        this.f2053d.c(this.f2050a.f2069a);
        this.f2053d.f2068r.remove(this.f2050a.f2069a);
        this.f2053d.j();
    }

    public final void onAnimationStart(Animator animator) {
        k kVar = this.f2053d;
        RecyclerView.z zVar = this.f2050a.f2069a;
        kVar.getClass();
    }
}
