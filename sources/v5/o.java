package v5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;
import com.imgdkh.app.R;
import d3.k;
import h0.l0;
import h0.y;
import i0.d;
import i0.f;
import java.util.WeakHashMap;
import l2.c;

public final class o extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f12548e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12549f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f12550g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f12551h;

    /* renamed from: i  reason: collision with root package name */
    public final j f12552i = new j(0, this);

    /* renamed from: j  reason: collision with root package name */
    public final k f12553j = new k(this);
    public final k k = new k(this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f12554l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12555m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12556n;

    /* renamed from: o  reason: collision with root package name */
    public long f12557o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f12558p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f12559q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f12560r;

    public o(a aVar) {
        super(aVar);
        this.f12549f = k5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f12548e = k5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f12550g = k5.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, s4.a.f11855a);
    }

    public final void a() {
        boolean z9;
        if (this.f12558p.isTouchExplorationEnabled()) {
            if (this.f12551h.getInputType() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !this.f12564d.hasFocus()) {
                this.f12551h.dismissDropDown();
            }
        }
        this.f12551h.post(new c(1, this));
    }

    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.f12553j;
    }

    public final View.OnClickListener f() {
        return this.f12552i;
    }

    public final d h() {
        return this.k;
    }

    public final boolean i(int i10) {
        return i10 != 0;
    }

    public final boolean j() {
        return this.f12554l;
    }

    public final boolean l() {
        return this.f12556n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f12551h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new l(this));
            this.f12551h.setOnDismissListener(new m(this));
            boolean z9 = false;
            this.f12551h.setThreshold(0);
            this.f12561a.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z9 = true;
            }
            if (!z9 && this.f12558p.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = this.f12564d;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.d.s(checkableImageButton, 2);
            }
            this.f12561a.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(f fVar) {
        boolean z9;
        boolean z10 = true;
        if (this.f12551h.getInputType() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            fVar.g(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = fVar.f7091a.isShowingHintText();
        } else {
            Bundle extras = fVar.f7091a.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z10 = false;
            }
        }
        if (z10) {
            fVar.j((String) null);
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z9;
        if (this.f12558p.isEnabled()) {
            boolean z10 = false;
            if (this.f12551h.getInputType() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                if (accessibilityEvent.getEventType() == 32768 && this.f12556n && !this.f12551h.isPopupShowing()) {
                    z10 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z10) {
                    u();
                    this.f12555m = true;
                    this.f12557o = System.currentTimeMillis();
                }
            }
        }
    }

    public final void r() {
        int i10 = this.f12549f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(this.f12550g);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new a(this, 1));
        this.f12560r = ofFloat;
        int i11 = this.f12548e;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(this.f12550g);
        ofFloat2.setDuration((long) i11);
        ofFloat2.addUpdateListener(new a(this, 1));
        this.f12559q = ofFloat2;
        ofFloat2.addListener(new n(this));
        this.f12558p = (AccessibilityManager) this.f12563c.getSystemService("accessibility");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f12551h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f12551h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z9) {
        if (this.f12556n != z9) {
            this.f12556n = z9;
            this.f12560r.cancel();
            this.f12559q.start();
        }
    }

    public final void u() {
        boolean z9;
        if (this.f12551h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f12557o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.f12555m = false;
            }
            if (!this.f12555m) {
                t(!this.f12556n);
                if (this.f12556n) {
                    this.f12551h.requestFocus();
                    this.f12551h.showDropDown();
                    return;
                }
                this.f12551h.dismissDropDown();
                return;
            }
            this.f12555m = false;
        }
    }
}
