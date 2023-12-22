package n5;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import z5.c;

public final class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, c.e(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
