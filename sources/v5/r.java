package v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import com.google.android.material.textfield.TextInputLayout;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n5.c;

public final class r {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f12565a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12566b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12567c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f12568d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f12569e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f12570f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f12571g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f12572h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f12573i;

    /* renamed from: j  reason: collision with root package name */
    public int f12574j;
    public FrameLayout k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f12575l;

    /* renamed from: m  reason: collision with root package name */
    public final float f12576m;

    /* renamed from: n  reason: collision with root package name */
    public int f12577n;

    /* renamed from: o  reason: collision with root package name */
    public int f12578o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f12579p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12580q;

    /* renamed from: r  reason: collision with root package name */
    public i0 f12581r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f12582s;

    /* renamed from: t  reason: collision with root package name */
    public int f12583t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f12584v;
    public CharSequence w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12585x;

    /* renamed from: y  reason: collision with root package name */
    public i0 f12586y;

    /* renamed from: z  reason: collision with root package name */
    public int f12587z;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12588a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f12589b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f12590c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f12591d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f12588a = i10;
            this.f12589b = textView;
            this.f12590c = i11;
            this.f12591d = textView2;
        }

        public final void onAnimationEnd(Animator animator) {
            i0 i0Var;
            r rVar = r.this;
            rVar.f12577n = this.f12588a;
            rVar.f12575l = null;
            TextView textView = this.f12589b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f12590c == 1 && (i0Var = r.this.f12581r) != null) {
                    i0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f12591d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f12591d.setAlpha(1.0f);
            }
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f12591d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f12591d.setAlpha(0.0f);
            }
        }
    }

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12571g = context;
        this.f12572h = textInputLayout;
        this.f12576m = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f12565a = k5.a.c(context, R.attr.motionDurationShort4, 217);
        this.f12566b = k5.a.c(context, R.attr.motionDurationMedium4, 167);
        this.f12567c = k5.a.c(context, R.attr.motionDurationShort4, 167);
        this.f12568d = k5.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, s4.a.f11858d);
        LinearInterpolator linearInterpolator = s4.a.f11855a;
        this.f12569e = k5.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f12570f = k5.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        if (this.f12573i == null && this.k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f12571g);
            this.f12573i = linearLayout;
            linearLayout.setOrientation(0);
            this.f12572h.addView(this.f12573i, -1, -2);
            this.k = new FrameLayout(this.f12571g);
            this.f12573i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f12572h.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.f12573i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f12573i.setVisibility(0);
        this.f12574j++;
    }

    public final void b() {
        boolean z9;
        if (this.f12573i == null || this.f12572h.getEditText() == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            EditText editText = this.f12572h.getEditText();
            boolean d10 = c.d(this.f12571g);
            LinearLayout linearLayout = this.f12573i;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            int f10 = y.e.f(editText);
            if (d10) {
                f10 = this.f12571g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = this.f12571g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (d10) {
                dimensionPixelSize = this.f12571g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e10 = y.e.e(editText);
            if (d10) {
                e10 = this.f12571g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            y.e.k(linearLayout, f10, dimensionPixelSize, e10, 0);
        }
    }

    public final void c() {
        Animator animator = this.f12575l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z9, TextView textView, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        float f10;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z12;
        if (textView != null && z9) {
            if (i10 == i12 || i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f10});
                if (z11) {
                    i13 = this.f12566b;
                } else {
                    i13 = this.f12567c;
                }
                ofFloat.setDuration((long) i13);
                if (z11) {
                    timeInterpolator = this.f12569e;
                } else {
                    timeInterpolator = this.f12570f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 != i12 || i11 == 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    ofFloat.setStartDelay((long) this.f12567c);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f12576m, 0.0f});
                    ofFloat2.setDuration((long) this.f12565a);
                    ofFloat2.setInterpolator(this.f12568d);
                    ofFloat2.setStartDelay((long) this.f12567c);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f12581r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f12586y;
    }

    public final void f() {
        this.f12579p = null;
        c();
        if (this.f12577n == 1) {
            this.f12578o = (!this.f12585x || TextUtils.isEmpty(this.w)) ? 0 : 2;
        }
        i(this.f12577n, this.f12578o, h(this.f12581r, ""));
    }

    public final void g(TextView textView, int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f12573i;
        if (viewGroup2 != null) {
            boolean z9 = true;
            if (!(i10 == 0 || i10 == 1)) {
                z9 = false;
            }
            if (z9 && (viewGroup = this.k) != null) {
                viewGroup2 = viewGroup;
            }
            viewGroup2.removeView(textView);
            int i11 = this.f12574j - 1;
            this.f12574j = i11;
            LinearLayout linearLayout = this.f12573i;
            if (i11 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f12572h;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (!y.g.c(textInputLayout) || !this.f12572h.isEnabled() || (this.f12578o == this.f12577n && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public final void i(int i10, int i11, boolean z9) {
        TextView e10;
        TextView e11;
        int i12 = i10;
        int i13 = i11;
        boolean z10 = z9;
        if (i12 != i13) {
            if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f12575l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i14 = i10;
                int i15 = i11;
                d(arrayList2, this.f12585x, this.f12586y, 2, i14, i15);
                d(arrayList2, this.f12580q, this.f12581r, 1, i14, i15);
                z5.c.n(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, e(i10), i10, e(i13)));
                animatorSet.start();
            } else if (i12 != i13) {
                if (!(i13 == 0 || (e11 = e(i13)) == null)) {
                    e11.setVisibility(0);
                    e11.setAlpha(1.0f);
                }
                if (!(i12 == 0 || (e10 = e(i10)) == null)) {
                    e10.setVisibility(4);
                    if (i12 == 1) {
                        e10.setText((CharSequence) null);
                    }
                }
                this.f12577n = i13;
            }
            this.f12572h.p();
            this.f12572h.s(z10, false);
            this.f12572h.v();
        }
    }
}
