package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import b0.a;
import com.imgdkh.app.R;
import j5.q;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n5.d;
import r5.f;
import r5.i;
import r5.j;
import s4.g;

public final class a extends f implements Drawable.Callback, q.b {
    public static final int[] V0 = {16842910};
    public static final ShapeDrawable W0 = new ShapeDrawable(new OvalShape());
    public float A;
    public int A0;
    public float B = -1.0f;
    public int B0;
    public ColorStateList C;
    public int C0;
    public float D;
    public int D0;
    public ColorStateList E;
    public int E0;
    public CharSequence F;
    public int F0;
    public boolean G;
    public boolean G0;
    public Drawable H;
    public int H0;
    public ColorStateList I;
    public int I0 = 255;
    public float J;
    public ColorFilter J0;
    public boolean K;
    public PorterDuffColorFilter K0;
    public boolean L;
    public ColorStateList L0;
    public Drawable M;
    public PorterDuff.Mode M0 = PorterDuff.Mode.SRC_IN;
    public RippleDrawable N;
    public int[] N0;
    public ColorStateList O;
    public boolean O0;
    public float P;
    public ColorStateList P0;
    public SpannableStringBuilder Q;
    public WeakReference<C0026a> Q0 = new WeakReference<>((Object) null);
    public boolean R;
    public TextUtils.TruncateAt R0;
    public boolean S;
    public boolean S0;
    public Drawable T;
    public int T0;
    public ColorStateList U;
    public boolean U0;
    public g V;
    public g W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: o0  reason: collision with root package name */
    public float f3074o0;
    public float p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f3075q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f3076r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f3077s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Context f3078t0;
    public final Paint u0 = new Paint(1);

    /* renamed from: v0  reason: collision with root package name */
    public final Paint.FontMetrics f3079v0 = new Paint.FontMetrics();

    /* renamed from: w0  reason: collision with root package name */
    public final RectF f3080w0 = new RectF();

    /* renamed from: x0  reason: collision with root package name */
    public final PointF f3081x0 = new PointF();

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f3082y;

    /* renamed from: y0  reason: collision with root package name */
    public final Path f3083y0 = new Path();

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f3084z;

    /* renamed from: z0  reason: collision with root package name */
    public final q f3085z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0026a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132018216);
        i(context);
        this.f3078t0 = context;
        q qVar = new q(this);
        this.f3085z0 = qVar;
        this.F = "";
        qVar.f8699a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = V0;
        setState(iArr);
        if (!Arrays.equals(this.N0, iArr)) {
            this.N0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.S0 = true;
        int[] iArr2 = o5.a.f10595a;
        W0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z9) {
        if (this.S != z9) {
            boolean S2 = S();
            this.S = z9;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    o(this.T);
                } else {
                    V(this.T);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f10) {
        if (this.B != f10) {
            this.B = f10;
            i iVar = this.f11660a.f11681a;
            iVar.getClass();
            i.a aVar = new i.a(iVar);
            aVar.e(f10);
            aVar.f(f10);
            aVar.d(f10);
            aVar.c(f10);
            setShapeAppearanceModel(new i(aVar));
        }
    }

    public final void C(Drawable drawable) {
        Drawable drawable2 = this.H;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof b0.f) {
            drawable2 = ((b0.f) drawable2).b();
        }
        if (drawable2 != drawable) {
            float q10 = q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.H = drawable3;
            float q11 = q();
            V(drawable2);
            if (T()) {
                o(this.H);
            }
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void D(float f10) {
        if (this.J != f10) {
            float q10 = q();
            this.J = f10;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (T()) {
                a.b.h(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z9) {
        if (this.G != z9) {
            boolean T2 = T();
            this.G = z9;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    o(this.H);
                } else {
                    V(this.H);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.U0) {
                f.b bVar = this.f11660a;
                if (bVar.f11684d != colorStateList) {
                    bVar.f11684d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f10) {
        if (this.D != f10) {
            this.D = f10;
            this.u0.setStrokeWidth(f10);
            if (this.U0) {
                this.f11660a.k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void I(Drawable drawable) {
        Drawable drawable2 = this.M;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof b0.f) {
            drawable2 = ((b0.f) drawable2).b();
        }
        if (drawable2 != drawable) {
            float r4 = r();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.M = drawable3;
            int[] iArr = o5.a.f10595a;
            this.N = new RippleDrawable(o5.a.a(this.E), this.M, W0);
            float r10 = r();
            V(drawable2);
            if (U()) {
                o(this.M);
            }
            invalidateSelf();
            if (r4 != r10) {
                v();
            }
        }
    }

    public final void J(float f10) {
        if (this.f3076r0 != f10) {
            this.f3076r0 = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f10) {
        if (this.f3075q0 != f10) {
            this.f3075q0 = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (U()) {
                a.b.h(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z9) {
        if (this.L != z9) {
            boolean U2 = U();
            this.L = z9;
            boolean U3 = U();
            if (U2 != U3) {
                if (U3) {
                    o(this.M);
                } else {
                    V(this.M);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f10) {
        if (this.Z != f10) {
            float q10 = q();
            this.Z = f10;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void P(float f10) {
        if (this.Y != f10) {
            float q10 = q();
            this.Y = f10;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (this.O0) {
                colorStateList2 = o5.a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.P0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void R(d dVar) {
        q qVar = this.f3085z0;
        Context context = this.f3078t0;
        if (qVar.f8704f != dVar) {
            qVar.f8704f = dVar;
            if (dVar != null) {
                dVar.f(context, qVar.f8699a, qVar.f8700b);
                q.b bVar = qVar.f8703e.get();
                if (bVar != null) {
                    qVar.f8699a.drawableState = bVar.getState();
                }
                dVar.e(context, qVar.f8699a, qVar.f8700b);
                qVar.f8702d = true;
            }
            q.b bVar2 = qVar.f8703e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final boolean S() {
        return this.S && this.T != null && this.G0;
    }

    public final boolean T() {
        return this.G && this.H != null;
    }

    public final boolean U() {
        return this.L && this.M != null;
    }

    public final void a() {
        v();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        boolean z9;
        int i15;
        float f11;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.I0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            if (!this.U0) {
                this.u0.setColor(this.A0);
                this.u0.setStyle(Paint.Style.FILL);
                this.f3080w0.set(bounds);
                canvas2.drawRoundRect(this.f3080w0, s(), s(), this.u0);
            }
            if (!this.U0) {
                this.u0.setColor(this.B0);
                this.u0.setStyle(Paint.Style.FILL);
                Paint paint = this.u0;
                ColorFilter colorFilter = this.J0;
                if (colorFilter == null) {
                    colorFilter = this.K0;
                }
                paint.setColorFilter(colorFilter);
                this.f3080w0.set(bounds);
                canvas2.drawRoundRect(this.f3080w0, s(), s(), this.u0);
            }
            if (this.U0) {
                super.draw(canvas);
            }
            float f12 = 0.0f;
            if (this.D > 0.0f && !this.U0) {
                this.u0.setColor(this.D0);
                this.u0.setStyle(Paint.Style.STROKE);
                if (!this.U0) {
                    Paint paint2 = this.u0;
                    ColorFilter colorFilter2 = this.J0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.K0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f3080w0;
                float f13 = this.D / 2.0f;
                rectF.set(((float) bounds.left) + f13, ((float) bounds.top) + f13, ((float) bounds.right) - f13, ((float) bounds.bottom) - f13);
                float f14 = this.B - (this.D / 2.0f);
                canvas2.drawRoundRect(this.f3080w0, f14, f14, this.u0);
            }
            this.u0.setColor(this.E0);
            this.u0.setStyle(Paint.Style.FILL);
            this.f3080w0.set(bounds);
            if (!this.U0) {
                canvas2.drawRoundRect(this.f3080w0, s(), s(), this.u0);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f3083y0;
                j jVar = this.f11676r;
                f.b bVar = this.f11660a;
                jVar.a(bVar.f11681a, bVar.f11690j, rectF2, this.f11675q, path);
                f(canvas, this.u0, this.f3083y0, this.f11660a.f11681a, h());
            }
            if (T()) {
                p(bounds, this.f3080w0);
                RectF rectF3 = this.f3080w0;
                float f15 = rectF3.left;
                float f16 = rectF3.top;
                canvas2.translate(f15, f16);
                this.H.setBounds(0, 0, (int) this.f3080w0.width(), (int) this.f3080w0.height());
                this.H.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (S()) {
                p(bounds, this.f3080w0);
                RectF rectF4 = this.f3080w0;
                float f17 = rectF4.left;
                float f18 = rectF4.top;
                canvas2.translate(f17, f18);
                this.T.setBounds(0, 0, (int) this.f3080w0.width(), (int) this.f3080w0.height());
                this.T.draw(canvas2);
                canvas2.translate(-f17, -f18);
            }
            if (!this.S0 || this.F == null) {
                i12 = i11;
                i13 = 0;
                i14 = 255;
            } else {
                PointF pointF = this.f3081x0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.F != null) {
                    float q10 = q() + this.X + this.f3074o0;
                    if (a.c.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + q10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - q10;
                        align = Paint.Align.RIGHT;
                    }
                    this.f3085z0.f8699a.getFontMetrics(this.f3079v0);
                    Paint.FontMetrics fontMetrics = this.f3079v0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.f3080w0;
                rectF5.setEmpty();
                if (this.F != null) {
                    float q11 = q() + this.X + this.f3074o0;
                    float r4 = r() + this.f3077s0 + this.p0;
                    if (a.c.a(this) == 0) {
                        rectF5.left = ((float) bounds.left) + q11;
                        f11 = ((float) bounds.right) - r4;
                    } else {
                        rectF5.left = ((float) bounds.left) + r4;
                        f11 = ((float) bounds.right) - q11;
                    }
                    rectF5.right = f11;
                    rectF5.top = (float) bounds.top;
                    rectF5.bottom = (float) bounds.bottom;
                }
                q qVar = this.f3085z0;
                if (qVar.f8704f != null) {
                    qVar.f8699a.drawableState = getState();
                    q qVar2 = this.f3085z0;
                    qVar2.f8704f.e(this.f3078t0, qVar2.f8699a, qVar2.f8700b);
                }
                this.f3085z0.f8699a.setTextAlign(align);
                q qVar3 = this.f3085z0;
                String charSequence = this.F.toString();
                if (!qVar3.f8702d) {
                    f10 = qVar3.f8701c;
                } else {
                    if (charSequence != null) {
                        f12 = qVar3.f8699a.measureText(charSequence, 0, charSequence.length());
                    }
                    qVar3.f8701c = f12;
                    qVar3.f8702d = false;
                    f10 = f12;
                }
                if (Math.round(f10) > Math.round(this.f3080w0.width())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i15 = canvas.save();
                    canvas2.clipRect(this.f3080w0);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence2 = this.F;
                if (z9 && this.R0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, this.f3085z0.f8699a, this.f3080w0.width(), this.R0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                PointF pointF2 = this.f3081x0;
                i12 = i11;
                float f19 = pointF2.x;
                i13 = 0;
                float f20 = pointF2.y;
                i14 = 255;
                canvas.drawText(charSequence3, 0, length, f19, f20, this.f3085z0.f8699a);
                if (z9) {
                    canvas2.restoreToCount(i15);
                }
            }
            if (U()) {
                RectF rectF6 = this.f3080w0;
                rectF6.setEmpty();
                if (U()) {
                    float f21 = this.f3077s0 + this.f3076r0;
                    if (a.c.a(this) == 0) {
                        float f22 = ((float) bounds.right) - f21;
                        rectF6.right = f22;
                        rectF6.left = f22 - this.P;
                    } else {
                        float f23 = ((float) bounds.left) + f21;
                        rectF6.left = f23;
                        rectF6.right = f23 + this.P;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f24 = this.P;
                    float f25 = exactCenterY - (f24 / 2.0f);
                    rectF6.top = f25;
                    rectF6.bottom = f25 + f24;
                }
                RectF rectF7 = this.f3080w0;
                float f26 = rectF7.left;
                float f27 = rectF7.top;
                canvas2.translate(f26, f27);
                this.M.setBounds(i13, i13, (int) this.f3080w0.width(), (int) this.f3080w0.height());
                int[] iArr = o5.a.f10595a;
                this.N.setBounds(this.M.getBounds());
                this.N.jumpToCurrentState();
                this.N.draw(canvas2);
                canvas2.translate(-f26, -f27);
            }
            if (this.I0 < i14) {
                canvas2.restoreToCount(i12);
            }
        }
    }

    public final int getAlpha() {
        return this.I0;
    }

    public final ColorFilter getColorFilter() {
        return this.J0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    public final int getIntrinsicWidth() {
        float f10;
        float f11;
        float q10 = q() + this.X + this.f3074o0;
        q qVar = this.f3085z0;
        String charSequence = this.F.toString();
        if (!qVar.f8702d) {
            f10 = qVar.f8701c;
        } else {
            if (charSequence == null) {
                f11 = 0.0f;
            } else {
                f11 = qVar.f8699a.measureText(charSequence, 0, charSequence.length());
            }
            qVar.f8701c = f11;
            qVar.f8702d = false;
            f10 = f11;
        }
        return Math.min(Math.round(r() + f10 + q10 + this.p0 + this.f3077s0), this.T0);
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.B);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        }
        outline.setAlpha(((float) this.I0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        boolean z9;
        boolean z10;
        ColorStateList colorStateList;
        if (t(this.f3082y) || t(this.f3084z) || t(this.C)) {
            return true;
        }
        if (this.O0 && t(this.P0)) {
            return true;
        }
        d dVar = this.f3085z0.f8704f;
        if (dVar == null || (colorStateList = dVar.f10372j) == null || !colorStateList.isStateful()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return true;
        }
        if (!this.S || this.T == null || !this.R) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || u(this.H) || u(this.T) || t(this.L0)) {
            return true;
        }
        return false;
    }

    public final void o(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            a.c.b(drawable, a.c.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.M) {
                if (drawable.isStateful()) {
                    drawable.setState(this.N0);
                }
                a.b.h(drawable, this.O);
                return;
            }
            Drawable drawable2 = this.H;
            if (drawable == drawable2 && this.K) {
                a.b.h(drawable2, this.I);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (T()) {
            onLayoutDirectionChanged |= a.c.b(this.H, i10);
        }
        if (S()) {
            onLayoutDirectionChanged |= a.c.b(this.T, i10);
        }
        if (U()) {
            onLayoutDirectionChanged |= a.c.b(this.M, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (T()) {
            onLevelChange |= this.H.setLevel(i10);
        }
        if (S()) {
            onLevelChange |= this.T.setLevel(i10);
        }
        if (U()) {
            onLevelChange |= this.M.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.U0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.N0);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (T() || S()) {
            float f11 = this.X + this.Y;
            if (this.G0) {
                drawable = this.T;
            } else {
                drawable = this.H;
            }
            float f12 = this.J;
            if (f12 <= 0.0f && drawable != null) {
                f12 = (float) drawable.getIntrinsicWidth();
            }
            if (a.c.a(this) == 0) {
                float f13 = ((float) rect.left) + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = ((float) rect.right) - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.G0) {
                drawable2 = this.T;
            } else {
                drawable2 = this.H;
            }
            float f15 = this.J;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f3078t0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f15) {
                    f10 = (float) drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!T() && !S()) {
            return 0.0f;
        }
        float f10 = this.Y;
        if (this.G0) {
            drawable = this.T;
        } else {
            drawable = this.H;
        }
        float f11 = this.J;
        if (f11 <= 0.0f && drawable != null) {
            f11 = (float) drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.Z;
    }

    public final float r() {
        if (U()) {
            return this.f3075q0 + this.P + this.f3076r0;
        }
        return 0.0f;
    }

    public final float s() {
        if (this.U0) {
            return this.f11660a.f11681a.f11707e.a(h());
        }
        return this.B;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        if (this.I0 != i10) {
            this.I0 = i10;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.J0 != colorFilter) {
            this.J0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.M0 != mode) {
            this.M0 = mode;
            ColorStateList colorStateList = this.L0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.K0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (T()) {
            visible |= this.H.setVisible(z9, z10);
        }
        if (S()) {
            visible |= this.T.setVisible(z9, z10);
        }
        if (U()) {
            visible |= this.M.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        C0026a aVar = this.Q0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f3082y;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.A0);
        } else {
            i10 = 0;
        }
        int d10 = d(i10);
        boolean z14 = true;
        if (this.A0 != d10) {
            this.A0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f3084z;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.B0);
        } else {
            i11 = 0;
        }
        int d11 = d(i11);
        if (this.B0 != d11) {
            this.B0 = d11;
            onStateChange = true;
        }
        int b10 = a0.a.b(d11, d10);
        if (this.C0 != b10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f11660a.f11683c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 || z10) {
            this.C0 = b10;
            k(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.D0);
        } else {
            i12 = 0;
        }
        if (this.D0 != i12) {
            this.D0 = i12;
            onStateChange = true;
        }
        if (this.P0 == null || !o5.a.b(iArr)) {
            i13 = 0;
        } else {
            i13 = this.P0.getColorForState(iArr, this.E0);
        }
        if (this.E0 != i13) {
            this.E0 = i13;
            if (this.O0) {
                onStateChange = true;
            }
        }
        d dVar = this.f3085z0.f8704f;
        if (dVar == null || (colorStateList = dVar.f10372j) == null) {
            i14 = 0;
        } else {
            i14 = colorStateList.getColorForState(iArr, this.F0);
        }
        if (this.F0 != i14) {
            this.F0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                } else if (state[i16] == 16842912) {
                    z11 = true;
                    break;
                } else {
                    i16++;
                }
            }
        }
        z11 = false;
        if (!z11 || !this.R) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.G0 == z12 || this.T == null) {
            z13 = false;
        } else {
            float q10 = q();
            this.G0 = z12;
            if (q10 != q()) {
                onStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.L0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.H0);
        } else {
            i15 = 0;
        }
        if (this.H0 != i15) {
            this.H0 = i15;
            ColorStateList colorStateList6 = this.L0;
            PorterDuff.Mode mode = this.M0;
            if (colorStateList6 == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            }
            this.K0 = porterDuffColorFilter;
        } else {
            z14 = onStateChange;
        }
        if (u(this.H)) {
            z14 |= this.H.setState(iArr);
        }
        if (u(this.T)) {
            z14 |= this.T.setState(iArr);
        }
        if (u(this.M)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z14 |= this.M.setState(iArr3);
        }
        int[] iArr4 = o5.a.f10595a;
        if (u(this.N)) {
            z14 |= this.N.setState(iArr2);
        }
        if (z14) {
            invalidateSelf();
        }
        if (z13) {
            v();
        }
        return z14;
    }

    public final void x(boolean z9) {
        if (this.R != z9) {
            this.R = z9;
            float q10 = q();
            if (!z9 && this.G0) {
                this.G0 = false;
            }
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.T != drawable) {
            float q10 = q();
            this.T = drawable;
            float q11 = q();
            V(this.T);
            o(this.T);
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        boolean z9;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (!this.S || this.T == null || !this.R) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                a.b.h(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
