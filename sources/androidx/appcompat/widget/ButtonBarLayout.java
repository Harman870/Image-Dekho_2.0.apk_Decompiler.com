package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import y3.a;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f588a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f589b;

    /* renamed from: c  reason: collision with root package name */
    public int f590c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.f13033o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        y.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f588a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f588a);
        }
    }

    private void setStacked(boolean z9) {
        if (this.f589b == z9) {
            return;
        }
        if (!z9 || this.f588a) {
            this.f589b = z9;
            setOrientation(z9 ? 1 : 0);
            setGravity(z9 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z9 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z9;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int i15 = 0;
        if (this.f588a) {
            if (size > this.f590c && this.f589b) {
                setStacked(false);
            }
            this.f590c = size;
        }
        if (this.f589b || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z9 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z9 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f588a && !this.f589b) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                setStacked(true);
                z9 = true;
            }
        }
        if (z9) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            i13 = -1;
            if (i16 >= childCount) {
                i16 = -1;
                break;
            } else if (getChildAt(i16).getVisibility() == 0) {
                break;
            } else {
                i16++;
            }
        }
        if (i16 >= 0) {
            View childAt = getChildAt(i16);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i15 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f589b) {
                int i17 = i16 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i17 >= childCount2) {
                        break;
                    } else if (getChildAt(i17).getVisibility() == 0) {
                        i13 = i17;
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i13 >= 0) {
                    i14 = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i14 = getPaddingBottom();
            }
            i15 += i14;
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.d.d(this) != i15) {
            setMinimumHeight(i15);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z9) {
        if (this.f588a != z9) {
            this.f588a = z9;
            if (!z9 && this.f589b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
