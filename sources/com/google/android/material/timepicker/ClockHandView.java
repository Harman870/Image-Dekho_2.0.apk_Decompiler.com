package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f3408a = new ValueAnimator();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3409b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3410c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final int f3411d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3412e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f3413f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f3414g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3415h;

    /* renamed from: i  reason: collision with root package name */
    public float f3416i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3417j;
    public double k;

    /* renamed from: l  reason: collision with root package name */
    public int f3418l;

    /* renamed from: m  reason: collision with root package name */
    public int f3419m;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f3413f = paint;
        this.f3414g = new RectF();
        this.f3419m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.A, R.attr.materialClockStyle, 2132018294);
        k5.a.c(context, R.attr.motionDurationLong2, 200);
        k5.a.d(context, R.attr.motionEasingEmphasizedInterpolator, s4.a.f11856b);
        this.f3418l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3411d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3415h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3412e = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(((float) this.f3418l) * 0.66f) : this.f3418l;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f3408a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    public final void c(float f10, boolean z9) {
        float f11 = f10 % 360.0f;
        this.f3416i = f11;
        this.k = Math.toRadians((double) (f11 - 90.0f));
        float a10 = (float) a(this.f3419m);
        float cos = (((float) Math.cos(this.k)) * a10) + ((float) (getWidth() / 2));
        float sin = (a10 * ((float) Math.sin(this.k))) + ((float) (getHeight() / 2));
        RectF rectF = this.f3414g;
        float f12 = (float) this.f3411d;
        rectF.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f3410c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a10 = a(this.f3419m);
        float f10 = (float) width;
        float f11 = (float) a10;
        float f12 = (float) height;
        this.f3413f.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.k)) * f11) + f10, (f11 * ((float) Math.sin(this.k))) + f12, (float) this.f3411d, this.f3413f);
        double sin = Math.sin(this.k);
        double cos = Math.cos(this.k);
        double d10 = (double) ((float) (a10 - this.f3411d));
        float f13 = (float) (width + ((int) (cos * d10)));
        float f14 = (float) (height + ((int) (d10 * sin)));
        this.f3413f.setStrokeWidth((float) this.f3415h);
        canvas.drawLine(f10, f12, f13, f14, this.f3413f);
        canvas.drawCircle(f10, f12, this.f3412e, this.f3413f);
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (!this.f3408a.isRunning()) {
            b(this.f3416i);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f3417j = false;
            z9 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f3417j;
            if (this.f3409b) {
                if (((float) Math.hypot((double) (x9 - ((float) (getWidth() / 2))), (double) (y9 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics())) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                this.f3419m = i10;
            }
            z9 = false;
        } else {
            z10 = false;
            z9 = false;
        }
        boolean z13 = this.f3417j;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y9 - ((float) (getHeight() / 2))), (double) (x9 - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = (float) degrees;
        if (this.f3416i != f10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z9 || !z11) {
            if (z11 || z10) {
                b(f10);
            }
            this.f3417j = z13 | z12;
            return true;
        }
        z12 = true;
        this.f3417j = z13 | z12;
        return true;
    }
}
