package com.ironsource.sdk.a;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.a.c;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap f5087a = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5088a;

        /* renamed from: b  reason: collision with root package name */
        public String f5089b;

        /* renamed from: c  reason: collision with root package name */
        public Context f5090c;

        /* renamed from: d  reason: collision with root package name */
        public String f5091d;
    }

    public d(a aVar, byte b10) {
        Context context = aVar.f5090c;
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(context);
        f5087a.put("deviceos", SDKUtils.encodeString(a10.f5764c));
        f5087a.put("deviceosversion", SDKUtils.encodeString(a10.f5765d));
        f5087a.put("deviceapilevel", Integer.valueOf(a10.f5766e));
        f5087a.put("deviceoem", SDKUtils.encodeString(a10.f5762a));
        f5087a.put("devicemodel", SDKUtils.encodeString(a10.f5763b));
        f5087a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f5087a.put("applicationkey", SDKUtils.encodeString(aVar.f5089b));
        f5087a.put("sessionid", SDKUtils.encodeString(aVar.f5088a));
        f5087a.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f5087a.put("env", "prod");
        f5087a.put("origin", "n");
        if (!TextUtils.isEmpty(aVar.f5091d)) {
            f5087a.put("applicationuserid", SDKUtils.encodeString(aVar.f5091d));
        }
        f5087a.put("connectiontype", com.ironsource.d.a.a(aVar.f5090c));
    }

    public static void a(String str) {
        f5087a.put("connectiontype", SDKUtils.encodeString(str));
    }

    public final Map<String, Object> a() {
        return f5087a;
    }
}
