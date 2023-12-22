package j5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.s0;
import c.a;

public class f extends s0 {

    /* renamed from: p  reason: collision with root package name */
    public Drawable f8635p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f8636q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f8637r;

    /* renamed from: s  reason: collision with root package name */
    public int f8638s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8639t;
    public boolean u;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f8636q = new Rect();
        this.f8637r = new Rect();
        this.f8638s = 119;
        this.f8639t = true;
        this.u = false;
        TypedArray d10 = s.d(context, attributeSet, a.E, 0, 0, new int[0]);
        this.f8638s = d10.getInt(1, this.f8638s);
        Drawable drawable = d10.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8639t = d10.getBoolean(2, true);
        d10.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8635p;
        if (drawable != null) {
            if (this.u) {
                this.u = false;
                Rect rect = this.f8636q;
                Rect rect2 = this.f8637r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f8639t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f8638s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f8635p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8635p;
        if (drawable != null && drawable.isStateful()) {
            this.f8635p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f8635p;
    }

    public int getForegroundGravity() {
        return this.f8638s;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8635p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        this.u = z9 | this.u;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8635p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f8635p);
            }
            this.f8635p = drawable;
            this.u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8638s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f8638s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f8638s = i10;
            if (i10 == 119 && this.f8635p != null) {
                this.f8635p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8635p;
    }
}
