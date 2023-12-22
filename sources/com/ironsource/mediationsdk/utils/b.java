package com.ironsource.mediationsdk.utils;

import org.json.JSONObject;
import x8.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4968a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4969b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f4970c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4971d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4972e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4973f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4974g;

    public b(JSONObject jSONObject) {
        f.f(jSONObject, "config");
        this.f4970c = jSONObject;
        this.f4968a = jSONObject.optBoolean("isExternalArmEventsEnabled", true);
        String optString = jSONObject.optString("externalArmEventsUrl", "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData");
        f.e(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f4969b = optString;
        this.f4971d = jSONObject.optBoolean("sid", true);
        this.f4972e = jSONObject.optBoolean("radvid", false);
        this.f4973f = jSONObject.optInt("uaeh", 0);
        this.f4974g = jSONObject.optBoolean("sharedThreadPool", false);
    }

    public final boolean a() {
        return this.f4971d;
    }

    public final boolean b() {
        return this.f4972e;
    }

    public final int c() {
        return this.f4973f;
    }

    public final boolean d() {
        return this.f4974g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f4970c, ((b) obj).f4970c);
    }

    public final int hashCode() {
        return this.f4970c.hashCode();
    }

    public final String toString() {
        return "ApplicationGeneralSettings(config=" + this.f4970c + ')';
    }
}
