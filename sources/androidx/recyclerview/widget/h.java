package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f2044a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2045b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2046c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2047d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2048e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2049f;

    public h(k kVar, RecyclerView.z zVar, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2049f = kVar;
        this.f2044a = zVar;
        this.f2045b = i10;
        this.f2046c = view;
        this.f2047d = i11;
        this.f2048e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f2045b != 0) {
            this.f2046c.setTranslationX(0.0f);
        }
        if (this.f2047d != 0) {
            this.f2046c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2048e.setListener((Animator.AnimatorListener) null);
        this.f2049f.c(this.f2044a);
        this.f2049f.f2066p.remove(this.f2044a);
        this.f2049f.j();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2049f.getClass();
    }
}
