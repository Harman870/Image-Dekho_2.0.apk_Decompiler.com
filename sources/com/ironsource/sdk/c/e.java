package com.ironsource.sdk.c;

import com.ironsource.sdk.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5173a = "e";

    /* renamed from: c  reason: collision with root package name */
    public static e f5174c;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, f> f5175b = Collections.synchronizedMap(new HashMap());

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f5174c == null) {
                f5174c = new e();
            }
            eVar = f5174c;
        }
        return eVar;
    }

    public static String a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static boolean b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static a d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new a();
        }
    }

    public final f a(String str) {
        if (str.isEmpty() || !this.f5175b.containsKey(str)) {
            return null;
        }
        return this.f5175b.get(str);
    }

    public a c(JSONObject jSONObject) {
        a aVar = new a();
        try {
            return d(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
            return aVar;
        }
    }
}
