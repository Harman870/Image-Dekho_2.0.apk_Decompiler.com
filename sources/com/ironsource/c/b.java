package com.ironsource.c;

import com.ironsource.sdk.e.a.a;
import com.ironsource.sdk.utils.SDKUtils;
import x8.f;

public final class b {
    public static String a() {
        String sDKVersion = SDKUtils.getSDKVersion();
        f.e(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }

    public static String b() {
        String str = a.f5579a;
        f.e(str, "OMID_LIB_VERSION");
        return str;
    }

    public static String c() {
        return "7";
    }
}
