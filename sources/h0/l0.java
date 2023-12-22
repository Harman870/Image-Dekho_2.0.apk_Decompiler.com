package h0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f6707a;

    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public l0(View view) {
        this.f6707a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f6707a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f6707a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f6707a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(m0 m0Var) {
        View view = this.f6707a.get();
        if (view == null) {
            return;
        }
        if (m0Var != null) {
            view.animate().setListener(new k0(m0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f10) {
        View view = this.f6707a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
