package com.ironsource.sdk.h;

import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f5668a;

    public e(JSONObject jSONObject) {
        this.f5668a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final boolean a() {
        return this.f5668a.optBoolean("useCacheDir", false);
    }
}
