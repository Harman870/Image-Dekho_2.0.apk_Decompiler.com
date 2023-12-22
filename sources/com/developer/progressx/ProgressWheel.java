package com.developer.progressx;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

public class ProgressWheel extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f2687a = 28;

    /* renamed from: b  reason: collision with root package name */
    public int f2688b = 4;

    /* renamed from: c  reason: collision with root package name */
    public int f2689c = 4;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2690d;

    /* renamed from: e  reason: collision with root package name */
    public double f2691e;

    /* renamed from: f  reason: collision with root package name */
    public double f2692f;

    /* renamed from: g  reason: collision with root package name */
    public float f2693g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2694h;

    /* renamed from: i  reason: collision with root package name */
    public long f2695i;

    /* renamed from: j  reason: collision with root package name */
    public int f2696j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f2697l;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f2698m;

    /* renamed from: n  reason: collision with root package name */
    public RectF f2699n;

    /* renamed from: o  reason: collision with root package name */
    public float f2700o;

    /* renamed from: p  reason: collision with root package name */
    public long f2701p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2702q;

    /* renamed from: r  reason: collision with root package name */
    public float f2703r;

    /* renamed from: s  reason: collision with root package name */
    public float f2704s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2705t;
    public boolean u;

    public interface a {
        void a();
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public float f2706a;

        /* renamed from: b  reason: collision with root package name */
        public float f2707b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2708c;

        /* renamed from: d  reason: collision with root package name */
        public float f2709d;

        /* renamed from: e  reason: collision with root package name */
        public int f2710e;

        /* renamed from: f  reason: collision with root package name */
        public int f2711f;

        /* renamed from: g  reason: collision with root package name */
        public int f2712g;

        /* renamed from: h  reason: collision with root package name */
        public int f2713h;

        /* renamed from: i  reason: collision with root package name */
        public int f2714i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2715j;
        public boolean k;

        public static class a implements Parcelable.Creator<b> {
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public final Object[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f2706a = parcel.readFloat();
            this.f2707b = parcel.readFloat();
            boolean z9 = true;
            this.f2708c = parcel.readByte() != 0;
            this.f2709d = parcel.readFloat();
            this.f2710e = parcel.readInt();
            this.f2711f = parcel.readInt();
            this.f2712g = parcel.readInt();
            this.f2713h = parcel.readInt();
            this.f2714i = parcel.readInt();
            this.f2715j = parcel.readByte() != 0;
            this.k = parcel.readByte() == 0 ? false : z9;
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f2706a);
            parcel.writeFloat(this.f2707b);
            parcel.writeByte(this.f2708c ? (byte) 1 : 0);
            parcel.writeFloat(this.f2709d);
            parcel.writeInt(this.f2710e);
            parcel.writeInt(this.f2711f);
            parcel.writeInt(this.f2712g);
            parcel.writeInt(this.f2713h);
            parcel.writeInt(this.f2714i);
            parcel.writeByte(this.f2715j ? (byte) 1 : 0);
            parcel.writeByte(this.k ? (byte) 1 : 0);
        }
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z9 = false;
        this.f2690d = false;
        this.f2691e = 0.0d;
        this.f2692f = 460.0d;
        this.f2693g = 0.0f;
        this.f2694h = true;
        this.f2695i = 0;
        this.f2696j = -1442840576;
        this.k = 16777215;
        this.f2697l = new Paint();
        this.f2698m = new Paint();
        this.f2699n = new RectF();
        this.f2700o = 230.0f;
        this.f2701p = 0;
        this.f2703r = 0.0f;
        this.f2704s = 0.0f;
        this.f2705t = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2350l);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f2688b = (int) TypedValue.applyDimension(1, (float) this.f2688b, displayMetrics);
        this.f2689c = (int) TypedValue.applyDimension(1, (float) this.f2689c, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, (float) this.f2687a, displayMetrics);
        this.f2687a = applyDimension;
        this.f2687a = (int) obtainStyledAttributes.getDimension(3, (float) applyDimension);
        this.f2690d = obtainStyledAttributes.getBoolean(4, false);
        this.f2688b = (int) obtainStyledAttributes.getDimension(2, (float) this.f2688b);
        this.f2689c = (int) obtainStyledAttributes.getDimension(8, (float) this.f2689c);
        this.f2700o = obtainStyledAttributes.getFloat(9, this.f2700o / 360.0f) * 360.0f;
        this.f2692f = (double) obtainStyledAttributes.getInt(1, (int) this.f2692f);
        this.f2696j = obtainStyledAttributes.getColor(0, this.f2696j);
        this.k = obtainStyledAttributes.getColor(7, this.k);
        this.f2702q = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f2701p = SystemClock.uptimeMillis();
            this.f2705t = true;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        this.u = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z9;
    }

    public final void a() {
    }

    public final void b() {
        this.f2697l.setColor(this.f2696j);
        this.f2697l.setAntiAlias(true);
        this.f2697l.setStyle(Paint.Style.STROKE);
        this.f2697l.setStrokeWidth((float) this.f2688b);
        this.f2698m.setColor(this.k);
        this.f2698m.setAntiAlias(true);
        this.f2698m.setStyle(Paint.Style.STROKE);
        this.f2698m.setStrokeWidth((float) this.f2689c);
    }

    public int getBarColor() {
        return this.f2696j;
    }

    public int getBarWidth() {
        return this.f2688b;
    }

    public int getCircleRadius() {
        return this.f2687a;
    }

    public float getProgress() {
        if (this.f2705t) {
            return -1.0f;
        }
        return this.f2703r / 360.0f;
    }

    public int getRimColor() {
        return this.k;
    }

    public int getRimWidth() {
        return this.f2689c;
    }

    public float getSpinSpeed() {
        return this.f2700o / 360.0f;
    }

    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        canvas.drawArc(this.f2699n, 360.0f, 360.0f, false, this.f2698m);
        if (this.u) {
            float f12 = 0.0f;
            boolean z9 = true;
            if (this.f2705t) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f2701p;
                float f13 = (((float) uptimeMillis) * this.f2700o) / 1000.0f;
                long j10 = this.f2695i;
                if (j10 >= 200) {
                    double d10 = this.f2691e + ((double) uptimeMillis);
                    this.f2691e = d10;
                    double d11 = this.f2692f;
                    if (d10 > d11) {
                        this.f2691e = d10 - d11;
                        this.f2695i = 0;
                        this.f2694h = !this.f2694h;
                    }
                    float cos = (((float) Math.cos(((this.f2691e / d11) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f14 = (float) 254;
                    if (this.f2694h) {
                        this.f2693g = cos * f14;
                    } else {
                        float f15 = (1.0f - cos) * f14;
                        this.f2703r = (this.f2693g - f15) + this.f2703r;
                        this.f2693g = f15;
                    }
                } else {
                    this.f2695i = j10 + uptimeMillis;
                }
                float f16 = this.f2703r + f13;
                this.f2703r = f16;
                if (f16 > 360.0f) {
                    this.f2703r = f16 - 360.0f;
                }
                this.f2701p = SystemClock.uptimeMillis();
                float f17 = this.f2703r - 90.0f;
                float f18 = this.f2693g + 16.0f;
                if (isInEditMode()) {
                    f18 = 135.0f;
                    f11 = 0.0f;
                } else {
                    f11 = f17;
                }
                canvas.drawArc(this.f2699n, f11, f18, false, this.f2697l);
            } else {
                float f19 = this.f2703r;
                if (f19 != this.f2704s) {
                    this.f2703r = Math.min(this.f2703r + ((((float) (SystemClock.uptimeMillis() - this.f2701p)) / 1000.0f) * this.f2700o), this.f2704s);
                    this.f2701p = SystemClock.uptimeMillis();
                } else {
                    z9 = false;
                }
                if (f19 != this.f2703r) {
                    a();
                }
                float f20 = this.f2703r;
                if (!this.f2702q) {
                    f12 = ((float) (1.0d - Math.pow((double) (1.0f - (f20 / 360.0f)), (double) 4.0f))) * 360.0f;
                    f20 = ((float) (1.0d - Math.pow((double) (1.0f - (this.f2703r / 360.0f)), (double) 2.0f))) * 360.0f;
                }
                if (isInEditMode()) {
                    f10 = 360.0f;
                } else {
                    f10 = f20;
                }
                canvas.drawArc(this.f2699n, f12 - 90.0f, f10, false, this.f2697l);
            }
            if (z9) {
                invalidate();
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2687a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2687a;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f2703r = bVar.f2706a;
        this.f2704s = bVar.f2707b;
        this.f2705t = bVar.f2708c;
        this.f2700o = bVar.f2709d;
        this.f2688b = bVar.f2710e;
        this.f2696j = bVar.f2711f;
        this.f2689c = bVar.f2712g;
        this.k = bVar.f2713h;
        this.f2687a = bVar.f2714i;
        this.f2702q = bVar.f2715j;
        this.f2690d = bVar.k;
        this.f2701p = SystemClock.uptimeMillis();
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f2706a = this.f2703r;
        bVar.f2707b = this.f2704s;
        bVar.f2708c = this.f2705t;
        bVar.f2709d = this.f2700o;
        bVar.f2710e = this.f2688b;
        bVar.f2711f = this.f2696j;
        bVar.f2712g = this.f2689c;
        bVar.f2713h = this.k;
        bVar.f2714i = this.f2687a;
        bVar.f2715j = this.f2702q;
        bVar.k = this.f2690d;
        return bVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (!this.f2690d) {
            int i14 = (i10 - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i14, (i11 - paddingBottom) - paddingTop), (this.f2687a * 2) - (this.f2688b * 2));
            int i15 = ((i14 - min) / 2) + paddingLeft;
            int i16 = ((((i11 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i17 = this.f2688b;
            this.f2699n = new RectF((float) (i15 + i17), (float) (i16 + i17), (float) ((i15 + min) - i17), (float) ((i16 + min) - i17));
        } else {
            int i18 = this.f2688b;
            this.f2699n = new RectF((float) (paddingLeft + i18), (float) (paddingTop + i18), (float) ((i10 - paddingRight) - i18), (float) ((i11 - paddingBottom) - i18));
        }
        b();
        invalidate();
    }

    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            this.f2701p = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i10) {
        this.f2696j = i10;
        b();
        if (!this.f2705t) {
            invalidate();
        }
    }

    public void setBarWidth(int i10) {
        this.f2688b = i10;
        if (!this.f2705t) {
            invalidate();
        }
    }

    public void setCallback(a aVar) {
        if (!this.f2705t) {
            a();
        }
    }

    public void setCircleRadius(int i10) {
        this.f2687a = i10;
        if (!this.f2705t) {
            invalidate();
        }
    }

    public void setInstantProgress(float f10) {
        if (this.f2705t) {
            this.f2703r = 0.0f;
            this.f2705t = false;
        }
        if (f10 > 1.0f) {
            f10 -= 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 != this.f2704s) {
            float min = Math.min(f10 * 360.0f, 360.0f);
            this.f2704s = min;
            this.f2703r = min;
            this.f2701p = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    public void setLinearProgress(boolean z9) {
        this.f2702q = z9;
        if (!this.f2705t) {
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f2705t) {
            this.f2703r = 0.0f;
            this.f2705t = false;
            a();
        }
        if (f10 > 1.0f) {
            f10 -= 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        float f11 = this.f2704s;
        if (f10 != f11) {
            if (this.f2703r == f11) {
                this.f2701p = SystemClock.uptimeMillis();
            }
            this.f2704s = Math.min(f10 * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setRimColor(int i10) {
        this.k = i10;
        b();
        if (!this.f2705t) {
            invalidate();
        }
    }

    public void setRimWidth(int i10) {
        this.f2689c = i10;
        if (!this.f2705t) {
            invalidate();
        }
    }

    public void setSpinSpeed(float f10) {
        this.f2700o = f10 * 360.0f;
    }
}
