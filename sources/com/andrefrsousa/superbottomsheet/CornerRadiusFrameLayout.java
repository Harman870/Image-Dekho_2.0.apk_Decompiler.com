package com.andrefrsousa.superbottomsheet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import x8.f;

public final class CornerRadiusFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2526a = true;

    /* renamed from: b  reason: collision with root package name */
    public final Path f2527b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2528c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2529d = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CornerRadiusFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f.f(context, "context");
    }

    public final void draw(Canvas canvas) {
        if (this.f2526a) {
            super.draw(canvas);
            return;
        }
        f.c(canvas);
        int save = canvas.save();
        canvas.clipPath(this.f2527b);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f2528c.set(0.0f, 0.0f, (float) i10, (float) i11);
        Path path = this.f2527b;
        path.reset();
        path.addRoundRect(this.f2528c, this.f2529d, Path.Direction.CW);
        path.close();
    }

    public final void setCornerRadius$lib_release(float f10) {
        float[] fArr = this.f2529d;
        boolean z9 = false;
        fArr[0] = f10;
        fArr[1] = f10;
        fArr[2] = f10;
        fArr[3] = f10;
        if (f10 == 0.0f) {
            z9 = true;
        }
        this.f2526a = z9;
        if (getWidth() != 0 && getHeight() != 0) {
            Path path = this.f2527b;
            path.reset();
            path.addRoundRect(this.f2528c, this.f2529d, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }
}
