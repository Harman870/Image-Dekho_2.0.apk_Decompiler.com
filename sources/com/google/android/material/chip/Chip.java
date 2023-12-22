package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.c;
import androidx.appcompat.widget.f;
import b0.a;
import com.google.android.material.chip.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import i0.f;
import j5.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import n5.d;
import r5.i;
import r5.m;
import s4.g;

public class Chip extends f implements a.C0026a, m {
    public static final Rect w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f3054x = {16842913};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3055y = {16842911};

    /* renamed from: e  reason: collision with root package name */
    public a f3056e;

    /* renamed from: f  reason: collision with root package name */
    public InsetDrawable f3057f;

    /* renamed from: g  reason: collision with root package name */
    public RippleDrawable f3058g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f3059h;

    /* renamed from: i  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3060i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3061j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3062l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3063m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3064n;

    /* renamed from: o  reason: collision with root package name */
    public int f3065o;

    /* renamed from: p  reason: collision with root package name */
    public int f3066p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3067q;

    /* renamed from: r  reason: collision with root package name */
    public final b f3068r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3069s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f3070t = new Rect();
    public final RectF u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final a f3071v = new a();

    public class a extends c {
        public a() {
            super(0);
        }

        public final void k(int i10) {
        }

        public final void l(Typeface typeface, boolean z9) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            a aVar = chip.f3056e;
            if (aVar.S0) {
                charSequence = aVar.F;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends o0.a {
        public b(Chip chip) {
            super(chip);
        }

        public final void l(ArrayList arrayList) {
            boolean z9 = false;
            arrayList.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.w;
            if (chip.d()) {
                Chip chip2 = Chip.this;
                a aVar = chip2.f3056e;
                if (aVar != null && aVar.L) {
                    z9 = true;
                }
                if (z9 && chip2.f3059h != null) {
                    arrayList.add(1);
                }
            }
        }

        public final void o(int i10, i0.f fVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                fVar.i(closeIconContentDescription);
                fVar.f7091a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                fVar.b(f.a.f7096g);
                fVar.f7091a.setEnabled(Chip.this.isEnabled());
                return;
            }
            fVar.i(charSequence);
            fVar.f7091a.setBoundsInParent(Chip.w);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0353  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r1 = 2130903257(0x7f0300d9, float:1.7413327E38)
            r2 = 2132018216(0x7f140428, float:1.9674732E38)
            r3 = r18
            android.content.Context r2 = x5.a.a(r3, r7, r1, r2)
            r0.<init>(r2, r7, r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3070t = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.u = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.f3071v = r1
            android.content.Context r8 = r17.getContext()
            r9 = 1
            r10 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b3
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03ab
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03a5
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x039f
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r9)
            if (r2 == 0) goto L_0x0397
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0397
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0397
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r9)
            if (r2 != r9) goto L_0x0397
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r10)
            if (r1 == r10) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r11 = new com.google.android.material.chip.a
            r11.<init>(r8, r7)
            android.content.Context r1 = r11.f3078t0
            int[] r12 = c.a.f2367y
            r13 = 0
            int[] r6 = new int[r13]
            r5 = 2132018216(0x7f140428, float:1.9674732E38)
            r4 = 2130903257(0x7f0300d9, float:1.7413327E38)
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = j5.s.d(r1, r2, r3, r4, r5, r6)
            r14 = 37
            boolean r2 = r1.hasValue(r14)
            r11.U0 = r2
            android.content.Context r2 = r11.f3078t0
            r3 = 24
            android.content.res.ColorStateList r2 = n5.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r11.f3082y
            if (r3 == r2) goto L_0x00c9
            r11.f3082y = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00c9:
            android.content.Context r2 = r11.f3078t0
            r3 = 11
            android.content.res.ColorStateList r2 = n5.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r11.f3084z
            if (r3 == r2) goto L_0x00de
            r11.f3084z = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00de:
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            float r4 = r11.A
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00f3
            r11.A = r2
            r11.invalidateSelf()
            r11.v()
        L_0x00f3:
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0102
            float r2 = r1.getDimension(r2, r3)
            r11.B(r2)
        L_0x0102:
            android.content.Context r2 = r11.f3078t0
            r4 = 22
            android.content.res.ColorStateList r2 = n5.c.a(r2, r1, r4)
            r11.G(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r3)
            r11.H(r2)
            android.content.Context r2 = r11.f3078t0
            r4 = 36
            android.content.res.ColorStateList r2 = n5.c.a(r2, r1, r4)
            r11.Q(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x012a
            java.lang.String r2 = ""
        L_0x012a:
            java.lang.CharSequence r4 = r11.F
            boolean r4 = android.text.TextUtils.equals(r4, r2)
            if (r4 != 0) goto L_0x013e
            r11.F = r2
            j5.q r2 = r11.f3085z0
            r2.f8702d = r9
            r11.invalidateSelf()
            r11.v()
        L_0x013e:
            android.content.Context r2 = r11.f3078t0
            boolean r4 = r1.hasValue(r13)
            if (r4 == 0) goto L_0x0152
            int r4 = r1.getResourceId(r13, r13)
            if (r4 == 0) goto L_0x0152
            n5.d r5 = new n5.d
            r5.<init>(r2, r4)
            goto L_0x0153
        L_0x0152:
            r5 = 0
        L_0x0153:
            float r2 = r5.k
            float r2 = r1.getDimension(r9, r2)
            r5.k = r2
            r11.R(r5)
            r2 = 3
            int r4 = r1.getInt(r2, r13)
            if (r4 == r9) goto L_0x0171
            r5 = 2
            if (r4 == r5) goto L_0x016e
            if (r4 == r2) goto L_0x016b
            goto L_0x0175
        L_0x016b:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x0173
        L_0x016e:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0173
        L_0x0171:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x0173:
            r11.R0 = r2
        L_0x0175:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r13)
            r11.F(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x019b
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x019b
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x019b
            r4 = 15
            boolean r4 = r1.getBoolean(r4, r13)
            r11.F(r4)
        L_0x019b:
            android.content.Context r4 = r11.f3078t0
            r5 = 14
            android.graphics.drawable.Drawable r4 = n5.c.c(r4, r1, r5)
            r11.C(r4)
            r4 = 17
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x01b7
            android.content.Context r5 = r11.f3078t0
            android.content.res.ColorStateList r4 = n5.c.a(r5, r1, r4)
            r11.E(r4)
        L_0x01b7:
            r4 = 16
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r5)
            r11.D(r4)
            r4 = 31
            boolean r4 = r1.getBoolean(r4, r13)
            r11.N(r4)
            if (r7 == 0) goto L_0x01e6
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01e6
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01e6
            r4 = 26
            boolean r4 = r1.getBoolean(r4, r13)
            r11.N(r4)
        L_0x01e6:
            android.content.Context r4 = r11.f3078t0
            r5 = 25
            android.graphics.drawable.Drawable r4 = n5.c.c(r4, r1, r5)
            r11.I(r4)
            android.content.Context r4 = r11.f3078t0
            r5 = 30
            android.content.res.ColorStateList r4 = n5.c.a(r4, r1, r5)
            r11.M(r4)
            r4 = 28
            float r4 = r1.getDimension(r4, r3)
            r11.K(r4)
            r4 = 6
            boolean r4 = r1.getBoolean(r4, r13)
            r11.x(r4)
            r4 = 10
            boolean r4 = r1.getBoolean(r4, r13)
            r11.A(r4)
            if (r7 == 0) goto L_0x0231
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0231
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x0231
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r13)
            r11.A(r2)
        L_0x0231:
            android.content.Context r2 = r11.f3078t0
            r4 = 7
            android.graphics.drawable.Drawable r2 = n5.c.c(r2, r1, r4)
            r11.y(r2)
            r2 = 9
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x024c
            android.content.Context r4 = r11.f3078t0
            android.content.res.ColorStateList r2 = n5.c.a(r4, r1, r2)
            r11.z(r2)
        L_0x024c:
            android.content.Context r2 = r11.f3078t0
            r4 = 39
            s4.g r2 = s4.g.a(r2, r1, r4)
            r11.V = r2
            android.content.Context r2 = r11.f3078t0
            r4 = 33
            s4.g r2 = s4.g.a(r2, r1, r4)
            r11.W = r2
            r2 = 21
            float r2 = r1.getDimension(r2, r3)
            float r4 = r11.X
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0274
            r11.X = r2
            r11.invalidateSelf()
            r11.v()
        L_0x0274:
            r2 = 35
            float r2 = r1.getDimension(r2, r3)
            r11.P(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r11.O(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r3)
            float r4 = r11.f3074o0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x029a
            r11.f3074o0 = r2
            r11.invalidateSelf()
            r11.v()
        L_0x029a:
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            float r4 = r11.p0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x02ae
            r11.p0 = r2
            r11.invalidateSelf()
            r11.v()
        L_0x02ae:
            r2 = 29
            float r2 = r1.getDimension(r2, r3)
            r11.L(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r3)
            r11.J(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r3)
            float r3 = r11.f3077s0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02d4
            r11.f3077s0 = r2
            r11.invalidateSelf()
            r11.v()
        L_0x02d4:
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r11.T0 = r2
            r1.recycle()
            int[] r6 = new int[r13]
            r15 = 2132018216(0x7f140428, float:1.9674732E38)
            r16 = 2130903257(0x7f0300d9, float:1.7413327E38)
            r4 = 2130903257(0x7f0300d9, float:1.7413327E38)
            r5 = 2132018216(0x7f140428, float:1.9674732E38)
            r1 = r8
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = j5.s.d(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r13)
            r0.f3064n = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            android.content.res.Resources r2 = r2.getResources()
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r9, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f3066p = r2
            r1.recycle()
            r0.setChipDrawable(r11)
            float r1 = h0.y.i.i(r17)
            r11.j(r1)
            int[] r6 = new int[r13]
            r1 = r8
            r2 = r19
            r3 = r12
            r4 = r16
            r5 = r15
            android.content.res.TypedArray r1 = j5.s.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r14)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f3068r = r1
            r17.e()
            if (r2 != 0) goto L_0x035b
            b5.b r1 = new b5.b
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x035b:
            boolean r1 = r0.f3061j
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r11.F
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r11.R0
            r0.setEllipsize(r1)
            r17.h()
            com.google.android.material.chip.a r1 = r0.f3056e
            boolean r1 = r1.S0
            if (r1 != 0) goto L_0x0379
            r0.setLines(r9)
            r0.setHorizontallyScrolling(r9)
        L_0x0379:
            r0.setGravity(r10)
            r17.g()
            boolean r1 = r0.f3064n
            if (r1 == 0) goto L_0x0388
            int r1 = r0.f3066p
            r0.setMinHeight(r1)
        L_0x0388:
            int r1 = h0.y.e.d(r17)
            r0.f3065o = r1
            b5.a r1 = new b5.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x0397:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x039f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03a5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03ab:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03b3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        this.u.setEmpty();
        if (d() && this.f3059h != null) {
            a aVar = this.f3056e;
            RectF rectF = this.u;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.U()) {
                float f10 = aVar.f3077s0 + aVar.f3076r0 + aVar.P + aVar.f3075q0 + aVar.p0;
                if (a.c.a(aVar) == 0) {
                    float f11 = (float) bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = (float) bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.u;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f3070t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f3070t;
    }

    private d getTextAppearance() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.f3085z0.f8704f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.f3062l != z9) {
            this.f3062l = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.k != z9) {
            this.k = z9;
            refreshDrawableState();
        }
    }

    public final void a() {
        c(this.f3066p);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i10) {
        int i11;
        this.f3066p = i10;
        int i12 = 0;
        if (!this.f3064n) {
            InsetDrawable insetDrawable = this.f3057f;
            if (insetDrawable == null) {
                int[] iArr = o5.a.f10595a;
                f();
            } else if (insetDrawable != null) {
                this.f3057f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = o5.a.f10595a;
                f();
            }
        } else {
            int max = Math.max(0, i10 - ((int) this.f3056e.A));
            int max2 = Math.max(0, i10 - this.f3056e.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i11 = max2 / 2;
                } else {
                    i11 = 0;
                }
                if (max > 0) {
                    i12 = max / 2;
                }
                int i13 = i12;
                if (this.f3057f != null) {
                    Rect rect = new Rect();
                    this.f3057f.getPadding(rect);
                    if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                        int[] iArr3 = o5.a.f10595a;
                        f();
                        return;
                    }
                }
                if (getMinHeight() != i10) {
                    setMinHeight(i10);
                }
                if (getMinWidth() != i10) {
                    setMinWidth(i10);
                }
                this.f3057f = new InsetDrawable(this.f3056e, i11, i13, i11, i13);
                int[] iArr4 = o5.a.f10595a;
                f();
                return;
            }
            InsetDrawable insetDrawable2 = this.f3057f;
            if (insetDrawable2 == null) {
                int[] iArr5 = o5.a.f10595a;
                f();
            } else if (insetDrawable2 != null) {
                this.f3057f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = o5.a.f10595a;
                f();
            }
        }
    }

    public final boolean d() {
        a aVar = this.f3056e;
        if (aVar != null) {
            Drawable drawable = aVar.M;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof b0.f) {
                drawable = ((b0.f) drawable).b();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f3069s
            if (r0 != 0) goto L_0x0009
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L_0x0009:
            com.google.android.material.chip.Chip$b r0 = r9.f3068r
            android.view.accessibility.AccessibilityManager r1 = r0.f10468h
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0074
            android.view.accessibility.AccessibilityManager r1 = r0.f10468h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 256(0x100, float:3.59E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r1 == r4) goto L_0x0044
            r4 = 9
            if (r1 == r4) goto L_0x0044
            r4 = 10
            if (r1 == r4) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            int r1 = r0.f10472m
            if (r1 == r5) goto L_0x0074
            if (r1 != r5) goto L_0x003b
            goto L_0x0072
        L_0x003b:
            r0.f10472m = r5
            r0.q(r5, r7)
            r0.q(r1, r6)
            goto L_0x0072
        L_0x0044:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x0062
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L_0x0062
            r1 = r2
            goto L_0x0063
        L_0x0062:
            r1 = r3
        L_0x0063:
            int r4 = r0.f10472m
            if (r4 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r0.f10472m = r1
            r0.q(r1, r7)
            r0.q(r4, r6)
        L_0x0070:
            if (r1 == r5) goto L_0x0074
        L_0x0072:
            r0 = r2
            goto L_0x0075
        L_0x0074:
            r0 = r3
        L_0x0075:
            if (r0 != 0) goto L_0x007f
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r2 = r3
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3069s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f3068r;
        bVar.getClass();
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i12 = 0;
                                while (i10 < repeatCount && bVar.m(i11, (Rect) null)) {
                                    i10++;
                                    i12 = 1;
                                }
                                i10 = i12;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i13 = bVar.f10471l;
                    if (i13 != Integer.MIN_VALUE) {
                        if (i13 == 0) {
                            Chip.this.performClick();
                        } else if (i13 == 1) {
                            Chip chip = Chip.this;
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f3059h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f3069s) {
                                chip.f3068r.q(1, 1);
                            }
                        }
                    }
                    i10 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i10 = bVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i10 = bVar.m(1, (Rect) null);
            }
        }
        if (i10 == 0 || this.f3068r.f10471l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        a aVar = this.f3056e;
        boolean z9 = false;
        if (aVar != null && a.u(aVar.M)) {
            a aVar2 = this.f3056e;
            int isEnabled = isEnabled();
            if (this.f3063m) {
                isEnabled++;
            }
            if (this.f3062l) {
                isEnabled++;
            }
            if (this.k) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f3063m) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f3062l) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.k) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.N0, iArr)) {
                aVar2.N0 = iArr;
                if (aVar2.U()) {
                    z9 = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (z9) {
            invalidate();
        }
    }

    public final void e() {
        boolean z9;
        boolean z10 = true;
        if (d()) {
            a aVar = this.f3056e;
            if (aVar == null || !aVar.L) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 && this.f3059h != null) {
                y.n(this, this.f3068r);
                this.f3069s = z10;
            }
        }
        y.n(this, (h0.a) null);
        z10 = false;
        this.f3069s = z10;
    }

    public final void f() {
        this.f3058g = new RippleDrawable(o5.a.a(this.f3056e.E), getBackgroundDrawable(), (Drawable) null);
        a aVar = this.f3056e;
        if (aVar.O0) {
            aVar.O0 = false;
            aVar.P0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f3058g;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f3056e) != null) {
            int r4 = (int) (aVar.r() + aVar.f3077s0 + aVar.p0);
            a aVar2 = this.f3056e;
            int q10 = (int) (aVar2.q() + aVar2.X + aVar2.f3074o0);
            if (this.f3057f != null) {
                Rect rect = new Rect();
                this.f3057f.getPadding(rect);
                q10 += rect.left;
                r4 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.e.k(this, q10, paddingTop, r4, paddingBottom);
        }
    }

    public CharSequence getAccessibilityClassName() {
        boolean z9;
        if (!TextUtils.isEmpty(this.f3067q)) {
            return this.f3067q;
        }
        a aVar = this.f3056e;
        if (aVar == null || !aVar.R) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            ViewParent parent = getParent();
            if (!(parent instanceof b5.c)) {
                return "android.widget.Button";
            }
            ((b5.c) parent).getClass();
            throw null;
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3057f;
        return insetDrawable == null ? this.f3056e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.f3084z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3056e;
    }

    public float getChipEndPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.f3077s0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f3056e;
        if (aVar == null || (drawable = aVar.H) == null) {
            return null;
        }
        if (drawable instanceof b0.f) {
            drawable = ((b0.f) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        a aVar = this.f3056e;
        if (aVar == null || (drawable = aVar.M) == null) {
            return null;
        }
        if (drawable instanceof b0.f) {
            drawable = ((b0.f) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.f3076r0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.f3075q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.O;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.R0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f3069s) {
            b bVar = this.f3068r;
            if (bVar.f10471l == 1 || bVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.E;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f3056e.f11660a.f11681a;
    }

    public g getShowMotionSpec() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.p0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f3056e;
        if (aVar != null) {
            return aVar.f3074o0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        a aVar = this.f3056e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f3071v);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z5.c.r(this, this.f3056e);
    }

    public final int[] onCreateDrawableState(int i10) {
        boolean z9;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3054x);
        }
        a aVar = this.f3056e;
        if (aVar == null || !aVar.R) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            View.mergeDrawableStates(onCreateDrawableState, f3055y);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (this.f3069s) {
            b bVar = this.f3068r;
            int i11 = bVar.f10471l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z9) {
                bVar.m(i10, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z9 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z9 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z9);
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i10;
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        a aVar = this.f3056e;
        if (aVar == null || !aVar.R) {
            z9 = false;
        } else {
            z9 = true;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof b5.c) {
            b5.c cVar = (b5.c) getParent();
            int i11 = -1;
            if (cVar.f8633c) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= cVar.getChildCount()) {
                        i13 = -1;
                        break;
                    }
                    View childAt = cVar.getChildAt(i12);
                    if (childAt instanceof Chip) {
                        if (cVar.getChildAt(i12).getVisibility() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    i12++;
                }
                i10 = i13;
            } else {
                i10 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.b.a(i11, 1, i10, 1, false, isChecked()).f7107a);
        }
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f3065o != i10) {
            this.f3065o = i10;
            g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.k
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x004e
            r5.setCloseIconPressed(r3)
            goto L_0x004e
        L_0x002b:
            boolean r0 = r5.k
            if (r0 == 0) goto L_0x0044
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f3059h
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            boolean r0 = r5.f3069s
            if (r0 == 0) goto L_0x0042
            com.google.android.material.chip.Chip$b r0 = r5.f3068r
            r0.q(r2, r2)
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            r5.setCloseIconPressed(r3)
            goto L_0x0051
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r2)
        L_0x004e:
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3067q = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3058g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3058g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z9) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.x(z9);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.x(aVar.f3078t0.getResources().getBoolean(i10));
        }
    }

    public void setChecked(boolean z9) {
        a aVar = this.f3056e;
        if (aVar == null) {
            this.f3061j = z9;
        } else if (aVar.R) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.y(e.a.a(aVar.f3078t0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.z(y.a.b(aVar.f3078t0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.A(aVar.f3078t0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z9) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.A(z9);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.f3084z != colorStateList) {
            aVar.f3084z = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList b10;
        a aVar = this.f3056e;
        if (aVar != null && aVar.f3084z != (b10 = y.a.b(aVar.f3078t0, i10))) {
            aVar.f3084z = b10;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.B(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.B(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f3056e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.Q0 = new WeakReference<>((Object) null);
            }
            this.f3056e = aVar;
            aVar.S0 = false;
            aVar.Q0 = new WeakReference<>(this);
            c(this.f3066p);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.f3077s0 != f10) {
            aVar.f3077s0 = f10;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            float dimension = aVar.f3078t0.getResources().getDimension(i10);
            if (aVar.f3077s0 != dimension) {
                aVar.f3077s0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.C(e.a.a(aVar.f3078t0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.D(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.D(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.E(y.a.b(aVar.f3078t0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.F(aVar.f3078t0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z9) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.F(z9);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.A != f10) {
            aVar.A = f10;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            float dimension = aVar.f3078t0.getResources().getDimension(i10);
            if (aVar.A != dimension) {
                aVar.A = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.X != f10) {
            aVar.X = f10;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            float dimension = aVar.f3078t0.getResources().getDimension(i10);
            if (aVar.X != dimension) {
                aVar.X = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.G(y.a.b(aVar.f3078t0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.H(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.H(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.Q != charSequence) {
            f0.a c10 = f0.a.c();
            aVar.Q = c10.d(charSequence, c10.f6298c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.J(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.J(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.I(e.a.a(aVar.f3078t0, i10));
        }
        e();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.K(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.L(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.L(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.M(y.a.b(aVar.f3078t0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z9) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.N(z9);
        }
        e();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.j(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3056e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f3056e;
                if (aVar != null) {
                    aVar.R0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.f3064n = z9;
        c(this.f3066p);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(g gVar) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.W = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.W = g.b(aVar.f3078t0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.O(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.O(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.P(aVar.f3078t0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(j5.g<Chip> gVar) {
    }

    public void setLayoutDirection(int i10) {
        if (this.f3056e != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.T0 = i10;
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3060i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3059h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        if (!this.f3056e.O0) {
            f();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.Q(y.a.b(aVar.f3078t0, i10));
            if (!this.f3056e.O0) {
                f();
            }
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        this.f3056e.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.V = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.V = g.b(aVar.f3078t0, i10);
        }
    }

    public void setSingleLine(boolean z9) {
        if (z9) {
            super.setSingleLine(z9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        a aVar = this.f3056e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.S0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            a aVar2 = this.f3056e;
            if (aVar2 != null && !TextUtils.equals(aVar2.F, charSequence)) {
                aVar2.F = charSequence;
                aVar2.f3085z0.f8702d = true;
                aVar2.invalidateSelf();
                aVar2.v();
            }
        }
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.R(new d(aVar.f3078t0, i10));
        }
        h();
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.R(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.p0 != f10) {
            aVar.p0 = f10;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            float dimension = aVar.f3078t0.getResources().getDimension(i10);
            if (aVar.p0 != dimension) {
                aVar.p0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        a aVar = this.f3056e;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            q qVar = aVar.f3085z0;
            d dVar = qVar.f8704f;
            if (dVar != null) {
                dVar.k = applyDimension;
                qVar.f8699a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f3056e;
        if (aVar != null && aVar.f3074o0 != f10) {
            aVar.f3074o0 = f10;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f3056e;
        if (aVar != null) {
            float dimension = aVar.f3078t0.getResources().getDimension(i10);
            if (aVar.f3074o0 != dimension) {
                aVar.f3074o0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f3056e;
        if (aVar != null) {
            aVar.R(new d(aVar.f3078t0, i10));
        }
        h();
    }
}
