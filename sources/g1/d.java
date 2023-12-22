package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class d extends c0 {

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f6489a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6490b = false;

        public a(View view) {
            this.f6489a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            v.f6555a.V(this.f6489a, 1.0f);
            if (this.f6490b) {
                this.f6489a.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f6489a;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.d.h(view) && this.f6489a.getLayerType() == 0) {
                this.f6490b = true;
                this.f6489a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d() {
    }

    public d(int i10) {
        if ((i10 & -4) == 0) {
            this.f6476x = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        v.f6555a.V(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, v.f6556b, new float[]{f11});
        ofFloat.addListener(new a(view));
        b(new c(view));
        return ofFloat;
    }

    public final void h(r rVar) {
        L(rVar);
        rVar.f6546a.put("android:fade:transitionAlpha", Float.valueOf(v.f6555a.U(rVar.f6547b)));
    }
}
