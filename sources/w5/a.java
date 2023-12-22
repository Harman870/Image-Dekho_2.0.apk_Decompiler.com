package w5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.i0;
import com.imgdkh.app.R;
import n5.b;

public final class a extends i0 {
    public a(Context context, AttributeSet attributeSet) {
        super(x5.a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z9 = true;
        if (b.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = c.a.O;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m2 = m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(m2 == -1 ? false : z9)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i12, typedValue) || typedValue.type != 2) {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            }
        }
        return i10;
    }

    public final void l(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, c.a.N);
        int m2 = m(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (m2 >= 0) {
            setLineHeight(m2);
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (b.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            l(i10, context.getTheme());
        }
    }
}
