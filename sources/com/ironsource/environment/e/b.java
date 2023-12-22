package com.ironsource.environment.e;

import com.ironsource.environment.c.c;
import com.ironsource.environment.c.d;
import org.json.JSONObject;
import x8.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f3737a = a.f3733b;

    /* renamed from: b  reason: collision with root package name */
    public final c f3738b = new c();

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject a10 = d.a(jSONObject.optJSONObject("md"));
        if (a10 != null) {
            jSONObject.put("md", a10);
        }
        return jSONObject;
    }

    public final JSONObject a() {
        JSONObject a10 = this.f3738b.a(this.f3737a);
        f.e(a10, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a10);
    }
}
