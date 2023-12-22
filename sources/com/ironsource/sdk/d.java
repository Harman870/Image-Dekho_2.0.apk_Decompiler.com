package com.ironsource.sdk;

import androidx.activity.f;
import com.ironsource.sdk.g.d;
import org.json.JSONObject;

public final class d {
    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(b bVar) {
        return (bVar.a() ? d.e.f5647a : bVar.f5127a ? d.e.RewardedVideo : d.e.f5649c).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        StringBuilder g10 = f.g("ManRewInst_");
        g10.append(jSONObject.optString("name"));
        return g10.toString();
    }
}
