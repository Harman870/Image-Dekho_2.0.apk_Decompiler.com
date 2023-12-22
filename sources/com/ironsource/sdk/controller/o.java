package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public String f5487a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f5488b;

    /* renamed from: c  reason: collision with root package name */
    public String f5489c;

    /* renamed from: d  reason: collision with root package name */
    public String f5490d;

    public o(JSONObject jSONObject) {
        this.f5487a = jSONObject.optString("functionName");
        this.f5488b = jSONObject.optJSONObject("functionParams");
        this.f5489c = jSONObject.optString("success");
        this.f5490d = jSONObject.optString("fail");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f5487a);
            jSONObject.put("functionParams", this.f5488b);
            jSONObject.put("success", this.f5489c);
            jSONObject.put("fail", this.f5490d);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
