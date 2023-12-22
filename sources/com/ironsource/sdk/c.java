package com.ironsource.sdk;

import com.ironsource.sdk.j.a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5146a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5147b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f5148c = null;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f5149d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5150e;

    /* renamed from: f  reason: collision with root package name */
    public String f5151f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5152g;

    public c(String str, a aVar) {
        this.f5151f = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f5152g = (a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    public final b a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f5151f);
            jSONObject.put("rewarded", this.f5146a);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return new b((this.f5147b || this.f5150e) ? d.a() : d.a(jSONObject), this.f5151f, this.f5146a, this.f5147b, this.f5150e, this.f5149d, this.f5152g, this.f5148c);
    }
}
