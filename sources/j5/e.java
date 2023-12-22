package j5;

import android.view.View;
import android.view.ViewGroup;
import com.imgdkh.app.R;
import h0.g;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f8631a;

    /* renamed from: b  reason: collision with root package name */
    public int f8632b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8633c;

    /* renamed from: d  reason: collision with root package name */
    public int f8634d;

    public boolean a() {
        return this.f8633c;
    }

    public int getItemSpacing() {
        return this.f8632b;
    }

    public int getLineSpacing() {
        return this.f8631a;
    }

    public int getRowCount() {
        return this.f8634d;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getChildCount() == 0) {
            this.f8634d = 0;
            return;
        }
        this.f8634d = 1;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = getPaddingRight();
        } else {
            i14 = getPaddingLeft();
        }
        if (z10) {
            i15 = getPaddingLeft();
        } else {
            i15 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i18 = (i12 - i10) - i15;
        int i19 = i14;
        int i20 = paddingTop;
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = g.c(marginLayoutParams);
                    i17 = g.b(marginLayoutParams);
                } else {
                    i17 = 0;
                    i16 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i19 + i16;
                if (!this.f8633c && measuredWidth > i18) {
                    i20 = this.f8631a + paddingTop;
                    this.f8634d++;
                    i19 = i14;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f8634d - 1));
                int i22 = i19 + i16;
                int measuredWidth2 = childAt.getMeasuredWidth() + i22;
                int measuredHeight = childAt.getMeasuredHeight() + i20;
                if (z10) {
                    i22 = i18 - measuredWidth2;
                    measuredWidth2 = (i18 - i19) - i16;
                }
                childAt.layout(i22, i20, measuredWidth2, measuredHeight);
                i19 += childAt.getMeasuredWidth() + i16 + i17 + this.f8632b;
                paddingTop = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i12 = size;
        } else {
            i12 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i11;
            } else {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i14 = 0;
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i13 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f8631a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i13 + i14 + this.f8632b + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i14;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingRight2, size);
        } else if (mode != 1073741824) {
            size = paddingRight2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f8632b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f8631a = i10;
    }

    public void setSingleLine(boolean z9) {
        this.f8633c = z9;
    }
}
