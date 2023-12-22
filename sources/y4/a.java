package y4;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.imgdkh.app.R;
import r5.i;
import r5.m;

public class a extends CardView implements Checkable, m {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f13046i = {R.attr.state_dragged};

    /* renamed from: h  reason: collision with root package name */
    public boolean f13047h;

    /* renamed from: y4.a$a  reason: collision with other inner class name */
    public interface C0171a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public i getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public final boolean isChecked() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (this.f13047h) {
            View.mergeDrawableStates(onCreateDrawableState, f13046i);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z9) {
        throw null;
    }

    public void setChecked(boolean z9) {
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i10) {
        throw null;
    }

    public void setCheckedIconMargin(int i10) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            getResources().getDimensionPixelSize(i10);
            throw null;
        }
    }

    public void setCheckedIconResource(int i10) {
        e.a.a(getContext(), i10);
        throw null;
    }

    public void setCheckedIconSize(int i10) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            getResources().getDimensionPixelSize(i10);
            throw null;
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z9) {
        super.setClickable(z9);
    }

    public void setDragged(boolean z9) {
        if (this.f13047h != z9) {
            this.f13047h = z9;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        throw null;
    }

    public void setOnCheckedChangeListener(C0171a aVar) {
    }

    public void setPreventCornerOverlap(boolean z9) {
        super.setPreventCornerOverlap(z9);
        throw null;
    }

    public void setProgress(float f10) {
        throw null;
    }

    public void setRadius(float f10) {
        super.setRadius(f10);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i10) {
        y.a.b(getContext(), i10);
        throw null;
    }

    public void setShapeAppearanceModel(i iVar) {
        setClipToOutline(iVar.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i10) {
        throw null;
    }

    public void setUseCompatPadding(boolean z9) {
        super.setUseCompatPadding(z9);
        throw null;
    }

    public final void toggle() {
    }
}
