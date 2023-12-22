package com.ironsource.mediationsdk.d;

import com.ironsource.mediationsdk.logger.IronLog;
import x8.f;

public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(Object obj, String str) {
        f.f(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        IronLog.API.error(str);
        return false;
    }
}
