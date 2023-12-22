package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

public final class a extends IronSourceLogger {
    private a() {
        super("console");
    }

    public a(int i10) {
        super("console", 0);
    }

    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        StringBuilder sb = new StringBuilder("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(" ");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Activity: ");
        sb3.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb3.append(" ");
        String sb4 = sb3.toString();
        if (i10 == 0) {
            Log.v("ironSourceSDK: " + ironSourceTag, sb2 + sb4 + str);
        } else if (i10 == 1) {
            Log.i("ironSourceSDK: " + ironSourceTag, str);
        } else if (i10 == 2) {
            Log.w("ironSourceSDK: " + ironSourceTag, str);
        } else if (i10 == 3) {
            Log.e("ironSourceSDK: " + ironSourceTag, str);
        }
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, ":stacktrace[");
        h10.append(Log.getStackTraceString(th));
        h10.append("]");
        log(ironSourceTag, h10.toString(), 3);
    }
}
