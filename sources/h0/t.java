package h0;

import android.view.View;
import android.view.ViewTreeObserver;

public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f6773a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f6774b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f6775c;

    public t(View view, Runnable runnable) {
        this.f6773a = view;
        this.f6774b = view.getViewTreeObserver();
        this.f6775c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            t tVar = new t(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(tVar);
            view.addOnAttachStateChangeListener(tVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        if (this.f6774b.isAlive()) {
            viewTreeObserver = this.f6774b;
        } else {
            viewTreeObserver = this.f6773a.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.f6773a.removeOnAttachStateChangeListener(this);
        this.f6775c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f6774b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        (this.f6774b.isAlive() ? this.f6774b : this.f6773a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f6773a.removeOnAttachStateChangeListener(this);
    }
}
