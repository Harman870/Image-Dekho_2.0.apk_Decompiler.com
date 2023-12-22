package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f5747b;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f5748a = new JSONObject();

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f5747b == null) {
                f5747b = new d();
            }
            dVar = f5747b;
        }
        return dVar;
    }

    public final String a(Context context) {
        try {
            return a.AnonymousClass1.a(b(context).toString());
        } catch (Exception unused) {
            return a.AnonymousClass1.a(new JSONObject().toString());
        }
    }

    public final void a(Context context, String str, String str2) {
        Activity activity;
        if (context != null) {
            try {
                new Thread(new c8.a(context, this)).start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(h.a(activity)));
            a("appOrientation", SDKUtils.translateRequestedOrientation(h.m(activity)));
        }
        if (context != null) {
            a(b.c(context));
            a(b.b(context));
        }
        a(str2);
        b(str);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    public final synchronized void a(String str, Object obj) {
        try {
            this.f5748a.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject.opt(next));
        }
    }

    public final JSONObject b(Context context) {
        b();
        if (context != null) {
            a(b.c(context));
            a(b.b(context));
        }
        try {
            return new JSONObject(this.f5748a.toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            a("applicationKey", SDKUtils.encodeString(str));
        }
    }

    public final void b(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String next : map.keySet()) {
            a(next, SDKUtils.encodeString(map.get(next)));
        }
    }

    public final void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (!TextUtils.isEmpty(controllerConfig)) {
            try {
                a("chinaCDN", new JSONObject(controllerConfig).opt("chinaCDN"));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        b(SDKUtils.getInitSDKParams());
        if (IronSourceQaProperties.isInitialized()) {
            f5747b.b(IronSourceQaProperties.getInstance().getParameters());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", com.ironsource.sdk.e.a.a.f5579a);
        hashMap.put("omidPartnerVersion", "7");
        f5747b.b((Map<String, String>) hashMap);
    }
}
