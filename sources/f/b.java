package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b0.a;
import com.imgdkh.app.R;
import y3.a;

public final class b extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    public static final float f6280m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final Paint f6281a;

    /* renamed from: b  reason: collision with root package name */
    public float f6282b;

    /* renamed from: c  reason: collision with root package name */
    public float f6283c;

    /* renamed from: d  reason: collision with root package name */
    public float f6284d;

    /* renamed from: e  reason: collision with root package name */
    public float f6285e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6286f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f6287g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final int f6288h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6289i = false;

    /* renamed from: j  reason: collision with root package name */
    public float f6290j;
    public float k;

    /* renamed from: l  reason: collision with root package name */
    public int f6291l = 2;

    public b(Context context) {
        Paint paint = new Paint();
        this.f6281a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, a.f13036r, R.attr.drawerArrowStyle, com.ironsource.sdk.mediation.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.k = (float) (Math.cos((double) f6280m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z9 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f6286f != z9) {
            this.f6286f = z9;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f6285e) {
            this.f6285e = round;
            invalidateSelf();
        }
        this.f6288h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f6283c = (float) Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f6282b = (float) Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f6284d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z9) {
        if (this.f6289i != z9) {
            this.f6289i = z9;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i10 = this.f6291l;
        boolean z9 = false;
        int i11 = 1;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? a.c.a(this) == 0 : a.c.a(this) == 1))) {
            z9 = true;
        }
        float f12 = this.f6282b;
        float sqrt = (float) Math.sqrt((double) (f12 * f12 * 2.0f));
        float f13 = this.f6283c;
        float f14 = this.f6290j;
        float e10 = com.ironsource.adapters.ironsource.a.e(sqrt, f13, f14, f13);
        float e11 = com.ironsource.adapters.ironsource.a.e(this.f6284d, f13, f14, f13);
        float round = (float) Math.round(((this.k - 0.0f) * f14) + 0.0f);
        float f15 = f6280m;
        float f16 = this.f6290j;
        float e12 = com.ironsource.adapters.ironsource.a.e(f15, 0.0f, f16, 0.0f);
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = -180.0f;
        }
        if (z9) {
            f11 = 180.0f;
        } else {
            f11 = 0.0f;
        }
        float e13 = com.ironsource.adapters.ironsource.a.e(f11, f10, f16, f10);
        double d10 = (double) e10;
        double d11 = (double) e12;
        float f17 = e13;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(Math.sin(d11) * d10);
        this.f6287g.rewind();
        float strokeWidth = this.f6281a.getStrokeWidth() + this.f6285e;
        float e14 = com.ironsource.adapters.ironsource.a.e(-this.k, strokeWidth, this.f6290j, strokeWidth);
        float f18 = (-e11) / 2.0f;
        this.f6287g.moveTo(f18 + round, 0.0f);
        this.f6287g.rLineTo(e11 - (round * 2.0f), 0.0f);
        this.f6287g.moveTo(f18, e14);
        this.f6287g.rLineTo(round2, round3);
        this.f6287g.moveTo(f18, -e14);
        this.f6287g.rLineTo(round2, -round3);
        this.f6287g.close();
        canvas.save();
        float strokeWidth2 = this.f6281a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth2);
        float f19 = this.f6285e;
        canvas2.translate((float) bounds.centerX(), (strokeWidth2 * 1.5f) + f19 + ((float) ((((int) (height - (2.0f * f19))) / 4) * 2)));
        if (this.f6286f) {
            if (this.f6289i ^ z9) {
                i11 = -1;
            }
            canvas2.rotate(f17 * ((float) i11));
        } else if (z9) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f6287g, this.f6281a);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f6288h;
    }

    public final int getIntrinsicWidth() {
        return this.f6288h;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i10) {
        if (i10 != this.f6281a.getAlpha()) {
            this.f6281a.setAlpha(i10);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6281a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f6290j != f10) {
            this.f6290j = f10;
            invalidateSelf();
        }
    }
}
