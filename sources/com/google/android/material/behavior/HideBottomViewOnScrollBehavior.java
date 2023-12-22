package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.imgdkh.app.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f2892a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public int f2893b;

    /* renamed from: c  reason: collision with root package name */
    public int f2894c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f2895d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f2896e;

    /* renamed from: f  reason: collision with root package name */
    public int f2897f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2898g = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f2899h = 0;

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f2900i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2900i = null;
        }
    }

    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f2897f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f2893b = k5.a.c(v10.getContext(), R.attr.motionDurationLong2, 225);
        this.f2894c = k5.a.c(v10.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2895d = k5.a.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, s4.a.f11858d);
        this.f2896e = k5.a.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, s4.a.f11857c);
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        boolean z9 = false;
        if (i10 > 0) {
            if (this.f2898g == 1) {
                z9 = true;
            }
            if (!z9) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2900i;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f2898g = 1;
                Iterator<b> it = this.f2892a.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                s(view, this.f2897f + this.f2899h, (long) this.f2894c, this.f2896e);
            }
        } else if (i10 < 0) {
            if (this.f2898g == 2) {
                z9 = true;
            }
            if (!z9) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f2900i;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f2898g = 2;
                Iterator<b> it2 = this.f2892a.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                s(view, 0, (long) this.f2893b, this.f2895d);
            }
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f2900i = v10.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }
}
