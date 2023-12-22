package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import x8.f;

/* renamed from: com.ironsource.mediationsdk.v  reason: case insensitive filesystem */
public final class C0197v {

    /* renamed from: a  reason: collision with root package name */
    public final String f5037a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5038b;

    public C0197v(String str, String str2) {
        f.f(str, "appKey");
        f.f(str2, DataKeys.USER_ID);
        this.f5037a = str;
        this.f5038b = str2;
    }

    public final String a() {
        return this.f5037a;
    }

    public final String b() {
        return this.f5038b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0197v)) {
            return false;
        }
        C0197v vVar = (C0197v) obj;
        return f.a(this.f5037a, vVar.f5037a) && f.a(this.f5038b, vVar.f5038b);
    }

    public final int hashCode() {
        return this.f5038b.hashCode() + (this.f5037a.hashCode() * 31);
    }

    public final String toString() {
        return "InitConfig(appKey=" + this.f5037a + ", userId=" + this.f5038b + ')';
    }
}
