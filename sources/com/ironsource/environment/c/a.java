package com.ironsource.environment.c;

import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f3707a;

    /* renamed from: b  reason: collision with root package name */
    public long f3708b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f3709c;

    /* renamed from: com.ironsource.environment.c.a$a  reason: collision with other inner class name */
    public enum C0041a {
        REWARDED_VIDEO,
        INTERSTITIAL,
        OFFERWALL,
        BANNER,
        NATIVE_AD
    }

    public a(int i10, long j10, JSONObject jSONObject) {
        this.f3707a = i10;
        this.f3708b = j10;
        this.f3709c = jSONObject;
    }

    public a(int i10, JSONObject jSONObject) {
        this.f3708b = -1;
        this.f3707a = i10;
        this.f3708b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f3709c = new JSONObject();
        } else {
            this.f3709c = jSONObject;
        }
    }

    public int a() {
        return this.f3707a;
    }

    public void a(int i10) {
        this.f3707a = i10;
    }

    public void a(String str, Object obj) {
        try {
            this.f3709c.put(str, obj);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public long b() {
        return this.f3708b;
    }

    public String c() {
        return this.f3709c.toString();
    }

    public JSONObject d() {
        return this.f3709c;
    }

    public String toString() {
        return ("{\"eventId\":" + a() + ",\"timestamp\":" + b() + "," + c().substring(1) + "}").replace(",", "\n");
    }
}
