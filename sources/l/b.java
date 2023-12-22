package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f9162a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f9163b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f9164c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f9165d;

    /* renamed from: e  reason: collision with root package name */
    public float f9166e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9167f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9168g = true;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f9169h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f9170i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f9171j;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public b(float f10, ColorStateList colorStateList) {
        this.f9162a = f10;
        this.f9163b = new Paint(5);
        b(colorStateList);
        this.f9164c = new RectF();
        this.f9165d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f9169h = colorStateList;
        this.f9163b.setColor(colorStateList.getColorForState(getState(), this.f9169h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f9164c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f9165d.set(rect);
        if (this.f9167f) {
            float f10 = this.f9166e;
            float f11 = this.f9162a;
            boolean z9 = this.f9168g;
            float f12 = 1.5f * f10;
            if (z9) {
                f12 = (float) (((1.0d - c.f9172a) * ((double) f11)) + ((double) f12));
            } else {
                int i10 = c.f9173b;
            }
            if (z9) {
                f10 = (float) (((1.0d - c.f9172a) * ((double) f11)) + ((double) f10));
            }
            this.f9165d.inset((int) Math.ceil((double) f10), (int) Math.ceil((double) f12));
            this.f9164c.set(this.f9165d);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f9163b;
        if (this.f9170i == null || paint.getColorFilter() != null) {
            z9 = false;
        } else {
            paint.setColorFilter(this.f9170i);
            z9 = true;
        }
        RectF rectF = this.f9164c;
        float f10 = this.f9162a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z9) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f9165d, this.f9162a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f9169h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f9171j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f9169h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b.isStateful():boolean");
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f9169h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z9 = colorForState != this.f9163b.getColor();
        if (z9) {
            this.f9163b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f9171j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z9;
        }
        this.f9170i = a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i10) {
        this.f9163b.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9163b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f9171j = colorStateList;
        this.f9170i = a(colorStateList, this.k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f9170i = a(this.f9171j, mode);
        invalidateSelf();
    }
}
