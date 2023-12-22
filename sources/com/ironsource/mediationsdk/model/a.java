package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public NetworkSettings f4703a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f4704b;

    /* renamed from: c  reason: collision with root package name */
    public IronSource.AD_UNIT f4705c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4706d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4707e;

    /* renamed from: f  reason: collision with root package name */
    public int f4708f;

    /* renamed from: g  reason: collision with root package name */
    public int f4709g;

    public a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f4703a = networkSettings;
        this.f4704b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f4708f = optInt;
        this.f4706d = optInt == 2;
        this.f4707e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f4709g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f4705c = ad_unit;
    }
}
