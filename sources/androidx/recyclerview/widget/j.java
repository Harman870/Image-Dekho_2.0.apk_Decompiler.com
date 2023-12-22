package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f2054a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2055b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2056c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2057d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2057d = kVar;
        this.f2054a = aVar;
        this.f2055b = viewPropertyAnimator;
        this.f2056c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2055b.setListener((Animator.AnimatorListener) null);
        this.f2056c.setAlpha(1.0f);
        this.f2056c.setTranslationX(0.0f);
        this.f2056c.setTranslationY(0.0f);
        this.f2057d.c(this.f2054a.f2070b);
        this.f2057d.f2068r.remove(this.f2054a.f2070b);
        this.f2057d.j();
    }

    public final void onAnimationStart(Animator animator) {
        k kVar = this.f2057d;
        RecyclerView.z zVar = this.f2054a.f2070b;
        kVar.getClass();
    }
}
