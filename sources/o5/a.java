package o5;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f10595a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f10596b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f10595a, 0)) != 0) {
            Log.w(f10596b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z9 = false;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z9 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z10 = true;
            }
        }
        return z9 && z10;
    }
}
