package i5;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import r5.f;
import r5.i;
import r5.j;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final j f7856a = j.a.f11736a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f7857b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f7858c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f7859d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f7860e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f7861f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final C0099a f7862g = new C0099a();

    /* renamed from: h  reason: collision with root package name */
    public float f7863h;

    /* renamed from: i  reason: collision with root package name */
    public int f7864i;

    /* renamed from: j  reason: collision with root package name */
    public int f7865j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public int f7866l;

    /* renamed from: m  reason: collision with root package name */
    public int f7867m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7868n = true;

    /* renamed from: o  reason: collision with root package name */
    public i f7869o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f7870p;

    /* renamed from: i5.a$a  reason: collision with other inner class name */
    public class C0099a extends Drawable.ConstantState {
        public C0099a() {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return a.this;
        }
    }

    public a(i iVar) {
        this.f7869o = iVar;
        Paint paint = new Paint(1);
        this.f7857b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final RectF a() {
        this.f7861f.set(getBounds());
        return this.f7861f;
    }

    public final void draw(Canvas canvas) {
        if (this.f7868n) {
            Paint paint = this.f7857b;
            Rect rect = this.f7859d;
            copyBounds(rect);
            float height = this.f7863h / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{a0.a.b(this.f7864i, this.f7867m), a0.a.b(this.f7865j, this.f7867m), a0.a.b(a0.a.c(this.f7865j, 0), this.f7867m), a0.a.b(a0.a.c(this.f7866l, 0), this.f7867m), a0.a.b(this.f7866l, this.f7867m), a0.a.b(this.k, this.f7867m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f7868n = false;
        }
        float strokeWidth = this.f7857b.getStrokeWidth() / 2.0f;
        copyBounds(this.f7859d);
        this.f7860e.set(this.f7859d);
        float min = Math.min(this.f7869o.f11707e.a(a()), this.f7860e.width() / 2.0f);
        if (this.f7869o.d(a())) {
            this.f7860e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f7860e, min, min, this.f7857b);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f7862g;
    }

    public final int getOpacity() {
        return this.f7863h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f7869o.d(a())) {
            outline.setRoundRect(getBounds(), this.f7869o.f11707e.a(a()));
            return;
        }
        copyBounds(this.f7859d);
        this.f7860e.set(this.f7859d);
        this.f7856a.a(this.f7869o, 1.0f, this.f7860e, (f.a) null, this.f7858c);
        Path path = this.f7858c;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f7869o.d(a())) {
            return true;
        }
        int round = Math.round(this.f7863h);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f7870p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void onBoundsChange(Rect rect) {
        this.f7868n = true;
    }

    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f7870p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f7867m)) == this.f7867m)) {
            this.f7868n = true;
            this.f7867m = colorForState;
        }
        if (this.f7868n) {
            invalidateSelf();
        }
        return this.f7868n;
    }

    public final void setAlpha(int i10) {
        this.f7857b.setAlpha(i10);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7857b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
