package v5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.j1;
import com.google.android.material.textfield.a;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class g extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f12531e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12532f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f12533g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f12534h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f12535i;

    /* renamed from: j  reason: collision with root package name */
    public final c f12536j = new c(this);
    public final d k = new d(this);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f12537l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f12538m;

    public g(a aVar) {
        super(aVar);
        this.f12531e = k5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f12532f = k5.a.c(aVar.getContext(), R.attr.motionDurationShort3, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        this.f12533g = k5.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, s4.a.f11855a);
        this.f12534h = k5.a.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, s4.a.f11858d);
    }

    public final void a() {
        if (this.f12562b.f3386p == null) {
            t(u());
        }
    }

    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final View.OnClickListener f() {
        return this.f12536j;
    }

    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    public final void m(EditText editText) {
        this.f12535i = editText;
        this.f12561a.setEndIconVisible(u());
    }

    public final void p(boolean z9) {
        if (this.f12562b.f3386p != null) {
            t(z9);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f12534h);
        ofFloat.setDuration((long) this.f12532f);
        ofFloat.addUpdateListener(new a(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(this.f12533g);
        ofFloat2.setDuration((long) this.f12531e);
        ofFloat2.addUpdateListener(new b(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12537l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f12537l.addListener(new e(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(this.f12533g);
        ofFloat3.setDuration((long) this.f12531e);
        ofFloat3.addUpdateListener(new b(this));
        this.f12538m = ofFloat3;
        ofFloat3.addListener(new f(this));
    }

    public final void s() {
        EditText editText = this.f12535i;
        if (editText != null) {
            editText.post(new j1(1, this));
        }
    }

    public final void t(boolean z9) {
        boolean z10 = this.f12562b.c() == z9;
        if (z9 && !this.f12537l.isRunning()) {
            this.f12538m.cancel();
            this.f12537l.start();
            if (z10) {
                this.f12537l.end();
            }
        } else if (!z9) {
            this.f12537l.cancel();
            this.f12538m.start();
            if (z10) {
                this.f12538m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f12535i;
        return editText != null && (editText.hasFocus() || this.f12564d.hasFocus()) && this.f12535i.getText().length() > 0;
    }
}
