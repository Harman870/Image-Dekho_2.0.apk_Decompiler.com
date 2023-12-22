package v5;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.i1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.imgdkh.app.R;
import h0.g;
import h0.l0;
import h0.y;
import j5.x;
import java.util.WeakHashMap;
import n5.c;

@SuppressLint({"ViewConstructor"})
public final class y extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12608a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f12609b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f12610c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f12611d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f12612e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f12613f;

    /* renamed from: g  reason: collision with root package name */
    public int f12614g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView.ScaleType f12615h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnLongClickListener f12616i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12617j;

    public y(TextInputLayout textInputLayout, i1 i1Var) {
        super(textInputLayout.getContext());
        CharSequence k;
        this.f12608a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f12611d = checkableImageButton;
        CharSequence charSequence = null;
        i0 i0Var = new i0(getContext(), (AttributeSet) null);
        this.f12609b = i0Var;
        if (c.d(getContext())) {
            g.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f12616i;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        q.d(checkableImageButton, onLongClickListener);
        this.f12616i = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        q.d(checkableImageButton, (View.OnLongClickListener) null);
        if (i1Var.l(67)) {
            this.f12612e = c.b(getContext(), i1Var, 67);
        }
        if (i1Var.l(68)) {
            this.f12613f = x.b(i1Var.h(68, -1), (PorterDuff.Mode) null);
        }
        if (i1Var.l(64)) {
            a(i1Var.e(64));
            if (i1Var.l(63) && checkableImageButton.getContentDescription() != (k = i1Var.k(63))) {
                checkableImageButton.setContentDescription(k);
            }
            checkableImageButton.setCheckable(i1Var.a(62, true));
        }
        int d10 = i1Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f12614g) {
                this.f12614g = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (i1Var.l(66)) {
                ImageView.ScaleType b10 = q.b(i1Var.h(66, -1));
                this.f12615h = b10;
                checkableImageButton.setScaleType(b10);
            }
            i0Var.setVisibility(8);
            i0Var.setId(R.id.textinput_prefix_text);
            i0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            y.g.f(i0Var, 1);
            i0Var.setTextAppearance(i1Var.i(58, 0));
            if (i1Var.l(59)) {
                i0Var.setTextColor(i1Var.b(59));
            }
            CharSequence k10 = i1Var.k(57);
            this.f12610c = !TextUtils.isEmpty(k10) ? k10 : charSequence;
            i0Var.setText(k10);
            d();
            addView(checkableImageButton);
            addView(i0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        this.f12611d.setImageDrawable(drawable);
        if (drawable != null) {
            q.a(this.f12608a, this.f12611d, this.f12612e, this.f12613f);
            b(true);
            q.c(this.f12608a, this.f12611d, this.f12612e);
            return;
        }
        b(false);
        CheckableImageButton checkableImageButton = this.f12611d;
        View.OnLongClickListener onLongClickListener = this.f12616i;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        q.d(checkableImageButton, onLongClickListener);
        this.f12616i = null;
        CheckableImageButton checkableImageButton2 = this.f12611d;
        checkableImageButton2.setOnLongClickListener((View.OnLongClickListener) null);
        q.d(checkableImageButton2, (View.OnLongClickListener) null);
        if (this.f12611d.getContentDescription() != null) {
            this.f12611d.setContentDescription((CharSequence) null);
        }
    }

    public final void b(boolean z9) {
        boolean z10;
        int i10 = 0;
        if (this.f12611d.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            CheckableImageButton checkableImageButton = this.f12611d;
            if (!z9) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        boolean z9;
        EditText editText = this.f12608a.f3335d;
        if (editText != null) {
            int i10 = 0;
            if (this.f12611d.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
                i10 = y.e.f(editText);
            }
            i0 i0Var = this.f12609b;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, l0> weakHashMap2 = h0.y.f6776a;
            y.e.k(i0Var, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void d() {
        int i10 = 8;
        int i11 = (this.f12610c == null || this.f12617j) ? 8 : 0;
        if (this.f12611d.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f12609b.setVisibility(i11);
        this.f12608a.o();
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
