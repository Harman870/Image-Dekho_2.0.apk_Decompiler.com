package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Context context, int i10) {
        if (context != null) {
            return (int) TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i10;
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        float min = Math.min(((float) displayMetrics.widthPixels) / f10, ((float) displayMetrics.heightPixels) / f10);
        float f11 = displayMetrics.xdpi;
        float f12 = displayMetrics.ydpi;
        float f13 = ((float) displayMetrics.widthPixels) / f11;
        float f14 = ((float) displayMetrics.heightPixels) / f12;
        double sqrt = Math.sqrt((double) ((f14 * f14) + (f13 * f13)));
        int i10 = context.getResources().getConfiguration().smallestScreenWidthDp;
        return "smallestWidth = " + min + " diagonalInches = " + sqrt + " smallScreenDpApi =  " + i10;
    }

    public static boolean isLargeScreen(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }
}
