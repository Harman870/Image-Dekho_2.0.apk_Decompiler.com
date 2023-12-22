package com.ironsource.mediationsdk.adunit.adapter.utility;

import org.json.JSONObject;
import x8.f;

public final class NativeAdProperties {

    /* renamed from: a  reason: collision with root package name */
    public final AdOptionsPosition f4131a;

    /* renamed from: b  reason: collision with root package name */
    public final AdOptionsPosition f4132b;

    public NativeAdProperties(JSONObject jSONObject) {
        AdOptionsPosition adOptionsPosition;
        f.f(jSONObject, "config");
        AdOptionsPosition adOptionsPosition2 = AdOptionsPosition.BOTTOM_LEFT;
        this.f4131a = adOptionsPosition2;
        String optString = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, adOptionsPosition2.toString());
        try {
            f.e(optString, "position");
            adOptionsPosition = AdOptionsPosition.valueOf(optString);
        } catch (Exception unused) {
            adOptionsPosition = this.f4131a;
        }
        this.f4132b = adOptionsPosition;
    }

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.f4132b;
    }
}
