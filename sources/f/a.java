package f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import b0.a;

public class a extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f6279a;

    public a(Drawable drawable) {
        Drawable drawable2 = this.f6279a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f6279a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f6279a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f6279a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f6279a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f6279a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f6279a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f6279a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f6279a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f6279a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f6279a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f6279a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f6279a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return a.C0017a.d(this.f6279a);
    }

    public final boolean isStateful() {
        return this.f6279a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f6279a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f6279a.setBounds(rect);
    }

    public final boolean onLevelChange(int i10) {
        return this.f6279a.setLevel(i10);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public final void setAlpha(int i10) {
        this.f6279a.setAlpha(i10);
    }

    public final void setAutoMirrored(boolean z9) {
        a.C0017a.e(this.f6279a, z9);
    }

    public final void setChangingConfigurations(int i10) {
        this.f6279a.setChangingConfigurations(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6279a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z9) {
        this.f6279a.setDither(z9);
    }

    public final void setFilterBitmap(boolean z9) {
        this.f6279a.setFilterBitmap(z9);
    }

    public void setHotspot(float f10, float f11) {
        a.b.e(this.f6279a, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        a.b.f(this.f6279a, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f6279a.setState(iArr);
    }

    public final void setTint(int i10) {
        a.b.g(this.f6279a, i10);
    }

    public final void setTintList(ColorStateList colorStateList) {
        a.b.h(this.f6279a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        a.b.i(this.f6279a, mode);
    }

    public boolean setVisible(boolean z9, boolean z10) {
        return super.setVisible(z9, z10) || this.f6279a.setVisible(z9, z10);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
