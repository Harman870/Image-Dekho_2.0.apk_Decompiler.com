package com.ironsource.sdk.controller;

import org.json.JSONObject;
import x8.f;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f5496a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f5497b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5498c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    static {
        new a((byte) 0);
    }

    public r(String str, String str2, JSONObject jSONObject) {
        f.f(str, "adId");
        f.f(str2, "command");
        this.f5498c = str;
        this.f5496a = str2;
        this.f5497b = jSONObject;
    }

    public static final r a(String str) {
        f.f(str, "jsonStr");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("adId");
        String string2 = jSONObject.getString("command");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        f.e(string, "adId");
        f.e(string2, "command");
        return new r(string, string2, optJSONObject);
    }

    public final String a() {
        return this.f5498c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return f.a(this.f5498c, rVar.f5498c) && f.a(this.f5496a, rVar.f5496a) && f.a(this.f5497b, rVar.f5497b);
    }

    public final int hashCode() {
        int hashCode = (this.f5496a.hashCode() + (this.f5498c.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f5497b;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "MessageToNative(adId=" + this.f5498c + ", command=" + this.f5496a + ", params=" + this.f5497b + ')';
    }
}
