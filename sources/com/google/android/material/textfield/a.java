package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.e;
import androidx.activity.f;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.i1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.imgdkh.app.R;
import h0.g;
import h0.l0;
import h0.y;
import j5.r;
import j5.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import v5.h;
import v5.o;
import v5.p;
import v5.q;
import v5.v;

@SuppressLint({"ViewConstructor"})
public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f3372a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f3373b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f3374c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f3375d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f3376e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnLongClickListener f3377f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckableImageButton f3378g;

    /* renamed from: h  reason: collision with root package name */
    public final d f3379h;

    /* renamed from: i  reason: collision with root package name */
    public int f3380i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.h> f3381j = new LinkedHashSet<>();
    public ColorStateList k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f3382l;

    /* renamed from: m  reason: collision with root package name */
    public int f3383m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView.ScaleType f3384n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnLongClickListener f3385o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f3386p;

    /* renamed from: q  reason: collision with root package name */
    public final i0 f3387q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3388r;

    /* renamed from: s  reason: collision with root package name */
    public EditText f3389s;

    /* renamed from: t  reason: collision with root package name */
    public final AccessibilityManager f3390t;
    public i0.d u;

    /* renamed from: v  reason: collision with root package name */
    public final C0032a f3391v = new C0032a();

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0032a extends r {
        public C0032a() {
        }

        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.b().b();
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        public final void a(TextInputLayout textInputLayout) {
            if (a.this.f3389s != textInputLayout.getEditText()) {
                a aVar = a.this;
                EditText editText = aVar.f3389s;
                if (editText != null) {
                    editText.removeTextChangedListener(aVar.f3391v);
                    if (a.this.f3389s.getOnFocusChangeListener() == a.this.b().e()) {
                        a.this.f3389s.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                a.this.f3389s = textInputLayout.getEditText();
                a aVar2 = a.this;
                EditText editText2 = aVar2.f3389s;
                if (editText2 != null) {
                    editText2.addTextChangedListener(aVar2.f3391v);
                }
                a.this.b().m(a.this.f3389s);
                a aVar3 = a.this;
                aVar3.i(aVar3.b());
            }
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        public final void onViewAttachedToWindow(View view) {
            a aVar = a.this;
            if (aVar.u != null && aVar.f3390t != null) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (y.g.b(aVar)) {
                    i0.c.a(aVar.f3390t, aVar.u);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            i0.d dVar = aVar.u;
            if (dVar != null && (accessibilityManager = aVar.f3390t) != null) {
                i0.c.b(accessibilityManager, dVar);
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<p> f3395a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final a f3396b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3397c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3398d;

        public d(a aVar, i1 i1Var) {
            this.f3396b = aVar;
            this.f3397c = i1Var.i(26, 0);
            this.f3398d = i1Var.i(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, i1 i1Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        b bVar = new b();
        this.f3390t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3372a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3373b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f3374c = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f3378g = a11;
        this.f3379h = new d(this, i1Var);
        CharSequence charSequence = null;
        i0 i0Var = new i0(getContext(), (AttributeSet) null);
        this.f3387q = i0Var;
        if (i1Var.l(36)) {
            this.f3375d = n5.c.b(getContext(), i1Var, 36);
        }
        if (i1Var.l(37)) {
            this.f3376e = x.b(i1Var.h(37, -1), (PorterDuff.Mode) null);
        }
        if (i1Var.l(35)) {
            h(i1Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!i1Var.l(51)) {
            if (i1Var.l(30)) {
                this.k = n5.c.b(getContext(), i1Var, 30);
            }
            if (i1Var.l(31)) {
                this.f3382l = x.b(i1Var.h(31, -1), (PorterDuff.Mode) null);
            }
        }
        if (i1Var.l(28)) {
            f(i1Var.h(28, 0));
            if (i1Var.l(25) && a11.getContentDescription() != (k10 = i1Var.k(25))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(i1Var.a(24, true));
        } else if (i1Var.l(51)) {
            if (i1Var.l(52)) {
                this.k = n5.c.b(getContext(), i1Var, 52);
            }
            if (i1Var.l(53)) {
                this.f3382l = x.b(i1Var.h(53, -1), (PorterDuff.Mode) null);
            }
            f(i1Var.a(51, false) ? 1 : 0);
            CharSequence k11 = i1Var.k(49);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = i1Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f3383m) {
                this.f3383m = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            if (i1Var.l(29)) {
                ImageView.ScaleType b10 = q.b(i1Var.h(29, -1));
                this.f3384n = b10;
                a11.setScaleType(b10);
                a10.setScaleType(b10);
            }
            i0Var.setVisibility(8);
            i0Var.setId(R.id.textinput_suffix_text);
            i0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            y.g.f(i0Var, 1);
            i0Var.setTextAppearance(i1Var.i(70, 0));
            if (i1Var.l(71)) {
                i0Var.setTextColor(i1Var.b(71));
            }
            CharSequence k12 = i1Var.k(69);
            this.f3386p = !TextUtils.isEmpty(k12) ? k12 : charSequence;
            i0Var.setText(k12);
            m();
            frameLayout.addView(a11);
            addView(i0Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f3349q0.add(bVar);
            if (textInputLayout.f3335d != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (n5.c.d(getContext())) {
            g.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final p b() {
        d dVar = this.f3379h;
        int i10 = this.f3380i;
        p pVar = dVar.f3395a.get(i10);
        if (pVar == null) {
            if (i10 == -1) {
                pVar = new h(dVar.f3396b);
            } else if (i10 == 0) {
                pVar = new v(dVar.f3396b);
            } else if (i10 == 1) {
                pVar = new v5.x(dVar.f3396b, dVar.f3398d);
            } else if (i10 == 2) {
                pVar = new v5.g(dVar.f3396b);
            } else if (i10 == 3) {
                pVar = new o(dVar.f3396b);
            } else {
                throw new IllegalArgumentException(e.a("Invalid end icon mode: ", i10));
            }
            dVar.f3395a.append(i10, pVar);
        }
        return pVar;
    }

    public final boolean c() {
        return this.f3373b.getVisibility() == 0 && this.f3378g.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f3374c.getVisibility() == 0;
    }

    public final void e(boolean z9) {
        boolean z10;
        boolean isActivated;
        boolean isChecked;
        p b10 = b();
        boolean z11 = true;
        if (!b10.k() || (isChecked = this.f3378g.isChecked()) == b10.l()) {
            z10 = false;
        } else {
            this.f3378g.setChecked(!isChecked);
            z10 = true;
        }
        if (!(b10 instanceof o) || (isActivated = this.f3378g.isActivated()) == b10.j()) {
            z11 = z10;
        } else {
            this.f3378g.setActivated(!isActivated);
        }
        if (z9 || z11) {
            q.c(this.f3372a, this.f3378g, this.k);
        }
    }

    public final void f(int i10) {
        boolean z9;
        Drawable drawable;
        AccessibilityManager accessibilityManager;
        if (this.f3380i != i10) {
            p b10 = b();
            i0.d dVar = this.u;
            if (!(dVar == null || (accessibilityManager = this.f3390t) == null)) {
                i0.c.b(accessibilityManager, dVar);
            }
            CharSequence charSequence = null;
            this.u = null;
            b10.s();
            this.f3380i = i10;
            Iterator<TextInputLayout.h> it = this.f3381j.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            if (i10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            g(z9);
            p b11 = b();
            int i11 = this.f3379h.f3397c;
            if (i11 == 0) {
                i11 = b11.d();
            }
            if (i11 != 0) {
                drawable = e.a.a(getContext(), i11);
            } else {
                drawable = null;
            }
            this.f3378g.setImageDrawable(drawable);
            if (drawable != null) {
                q.a(this.f3372a, this.f3378g, this.k, this.f3382l);
                q.c(this.f3372a, this.f3378g, this.k);
            }
            int c10 = b11.c();
            if (c10 != 0) {
                charSequence = getResources().getText(c10);
            }
            if (this.f3378g.getContentDescription() != charSequence) {
                this.f3378g.setContentDescription(charSequence);
            }
            this.f3378g.setCheckable(b11.k());
            if (b11.i(this.f3372a.getBoxBackgroundMode())) {
                b11.r();
                i0.d h10 = b11.h();
                this.u = h10;
                if (!(h10 == null || this.f3390t == null)) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    if (y.g.b(this)) {
                        i0.c.a(this.f3390t, this.u);
                    }
                }
                View.OnClickListener f10 = b11.f();
                CheckableImageButton checkableImageButton = this.f3378g;
                View.OnLongClickListener onLongClickListener = this.f3385o;
                checkableImageButton.setOnClickListener(f10);
                q.d(checkableImageButton, onLongClickListener);
                EditText editText = this.f3389s;
                if (editText != null) {
                    b11.m(editText);
                    i(b11);
                }
                q.a(this.f3372a, this.f3378g, this.k, this.f3382l);
                e(true);
                return;
            }
            StringBuilder g10 = f.g("The current box background mode ");
            g10.append(this.f3372a.getBoxBackgroundMode());
            g10.append(" is not supported by the end icon mode ");
            g10.append(i10);
            throw new IllegalStateException(g10.toString());
        }
    }

    public final void g(boolean z9) {
        if (c() != z9) {
            this.f3378g.setVisibility(z9 ? 0 : 8);
            j();
            l();
            this.f3372a.o();
        }
    }

    public final void h(Drawable drawable) {
        this.f3374c.setImageDrawable(drawable);
        k();
        q.a(this.f3372a, this.f3374c, this.f3375d, this.f3376e);
    }

    public final void i(p pVar) {
        if (this.f3389s != null) {
            if (pVar.e() != null) {
                this.f3389s.setOnFocusChangeListener(pVar.e());
            }
            if (pVar.g() != null) {
                this.f3378g.setOnFocusChangeListener(pVar.g());
            }
        }
    }

    public final void j() {
        int i10 = 8;
        this.f3373b.setVisibility((this.f3378g.getVisibility() != 0 || d()) ? 8 : 0);
        if (c() || d() || !((this.f3386p == null || this.f3388r) ? true : false)) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.f3374c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.material.textfield.TextInputLayout r0 = r4.f3372a
            v5.r r3 = r0.f3341j
            boolean r3 = r3.f12580q
            if (r3 == 0) goto L_0x001a
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x001a
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            com.google.android.material.internal.CheckableImageButton r3 = r4.f3374c
            if (r0 == 0) goto L_0x0021
            r0 = r2
            goto L_0x0023
        L_0x0021:
            r0 = 8
        L_0x0023:
            r3.setVisibility(r0)
            r4.j()
            r4.l()
            int r0 = r4.f3380i
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            if (r1 != 0) goto L_0x0039
            com.google.android.material.textfield.TextInputLayout r0 = r4.f3372a
            r0.o()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.a.k():void");
    }

    public final void l() {
        int i10;
        if (this.f3372a.f3335d != null) {
            if (c() || d()) {
                i10 = 0;
            } else {
                EditText editText = this.f3372a.f3335d;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                i10 = y.e.e(editText);
            }
            i0 i0Var = this.f3387q;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f3372a.f3335d.getPaddingTop();
            int paddingBottom = this.f3372a.f3335d.getPaddingBottom();
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            y.e.k(i0Var, dimensionPixelSize, paddingTop, i10, paddingBottom);
        }
    }

    public final void m() {
        int visibility = this.f3387q.getVisibility();
        boolean z9 = false;
        int i10 = (this.f3386p == null || this.f3388r) ? 8 : 0;
        if (visibility != i10) {
            p b10 = b();
            if (i10 == 0) {
                z9 = true;
            }
            b10.p(z9);
        }
        j();
        this.f3387q.setVisibility(i10);
        this.f3372a.o();
    }
}
