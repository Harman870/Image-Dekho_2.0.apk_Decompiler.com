package com.ironsource.mediationsdk.b;

import android.text.TextUtils;
import com.ironsource.c.b;
import com.ironsource.environment.c.a;
import com.ironsource.environment.c.e;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.WaterfallConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public a() {
        new e();
    }

    public final void a(b bVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("omv", b.b());
            hashMap.put("ompv", b.c());
            hashMap.put("sdkv", b.a());
            e.a((Map<String, Object>) hashMap);
        } catch (Exception unused) {
        }
    }

    public final void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put("flr", waterfallConfiguration.getFloor());
                jSONObject.put("clng", waterfallConfiguration.getCeiling());
            } catch (JSONException unused) {
            }
        }
        int length = jSONObject.length();
        a.C0041a a10 = com.ironsource.mediationsdk.d.a.a(ad_unit);
        if (length == 0) {
            e.a("infp", a10);
        } else {
            e.a("infp", jSONObject, a10);
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            e.a("usid", (Object) str);
        }
    }

    public final void a(boolean z9) {
        e.a("gpi", (Object) Boolean.valueOf(z9));
    }
}
