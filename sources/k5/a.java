package k5;

import a0.d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.activity.f;
import n5.b;

public final class a {
    public static float a(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int c(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return (a10 == null || a10.type != 16) ? i11 : a10.data;
    }

    public static TimeInterpolator d(Context context, int i10, Interpolator interpolator) {
        boolean z9;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (b(valueOf, "cubic-bezier") || b(valueOf, "path")) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return j0.a.b(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                }
                StringBuilder g10 = f.g("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                g10.append(split.length);
                throw new IllegalArgumentException(g10.toString());
            } else if (b(valueOf, "path")) {
                return j0.a.c(d.d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g("Invalid motion easing type: ", valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }
}
