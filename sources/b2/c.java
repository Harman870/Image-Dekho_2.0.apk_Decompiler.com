package b2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import b2.f;

public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f2210a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2211b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2212c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2213d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2214e;

    /* renamed from: f  reason: collision with root package name */
    public int f2215f;

    /* renamed from: g  reason: collision with root package name */
    public int f2216g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2217h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f2218i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f2219j;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f2220a;

        public a(f fVar) {
            this.f2220a = fVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f2214e = true;
        this.f2216g = -1;
        y3.a.h(aVar);
        this.f2210a = aVar;
    }

    public final void a() {
        int i10;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f fVar = this.f2210a.f2220a;
        f.a aVar = fVar.f2230i;
        if (aVar != null) {
            i10 = aVar.f2239e;
        } else {
            i10 = -1;
        }
        if (i10 == fVar.f2222a.d() - 1) {
            this.f2215f++;
        }
        int i11 = this.f2216g;
        if (i11 != -1 && this.f2215f >= i11) {
            stop();
        }
    }

    public final void b() {
        y3.a.g("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f2213d);
        if (this.f2210a.f2220a.f2222a.d() != 1) {
            if (!this.f2211b) {
                this.f2211b = true;
                f fVar = this.f2210a.f2220a;
                if (fVar.f2231j) {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                } else if (!fVar.f2224c.contains(this)) {
                    boolean isEmpty = fVar.f2224c.isEmpty();
                    fVar.f2224c.add(this);
                    if (isEmpty && !fVar.f2227f) {
                        fVar.f2227f = true;
                        fVar.f2231j = false;
                        fVar.a();
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f2213d) {
            if (this.f2217h) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f2219j == null) {
                    this.f2219j = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f2219j);
                this.f2217h = false;
            }
            f fVar = this.f2210a.f2220a;
            f.a aVar = fVar.f2230i;
            if (aVar != null) {
                bitmap = aVar.f2241g;
            } else {
                bitmap = fVar.f2232l;
            }
            if (this.f2219j == null) {
                this.f2219j = new Rect();
            }
            Rect rect = this.f2219j;
            if (this.f2218i == null) {
                this.f2218i = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f2218i);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f2210a;
    }

    public final int getIntrinsicHeight() {
        return this.f2210a.f2220a.f2237q;
    }

    public final int getIntrinsicWidth() {
        return this.f2210a.f2220a.f2236p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f2211b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2217h = true;
    }

    public final void setAlpha(int i10) {
        if (this.f2218i == null) {
            this.f2218i = new Paint(2);
        }
        this.f2218i.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2218i == null) {
            this.f2218i = new Paint(2);
        }
        this.f2218i.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z9, boolean z10) {
        y3.a.g("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f2213d);
        this.f2214e = z9;
        if (!z9) {
            this.f2211b = false;
            f fVar = this.f2210a.f2220a;
            fVar.f2224c.remove(this);
            if (fVar.f2224c.isEmpty()) {
                fVar.f2227f = false;
            }
        } else if (this.f2212c) {
            b();
        }
        return super.setVisible(z9, z10);
    }

    public final void start() {
        this.f2212c = true;
        this.f2215f = 0;
        if (this.f2214e) {
            b();
        }
    }

    public final void stop() {
        this.f2212c = false;
        this.f2211b = false;
        f fVar = this.f2210a.f2220a;
        fVar.f2224c.remove(this);
        if (fVar.f2224c.isEmpty()) {
            fVar.f2227f = false;
        }
    }
}
