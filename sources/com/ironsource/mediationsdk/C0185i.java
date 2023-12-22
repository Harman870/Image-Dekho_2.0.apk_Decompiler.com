package com.ironsource.mediationsdk;

import java.util.HashMap;
import java.util.Map;
import p8.g;
import x8.f;

/* renamed from: com.ironsource.mediationsdk.i  reason: case insensitive filesystem */
public final class C0185i {

    /* renamed from: a  reason: collision with root package name */
    public final String f4592a;

    /* renamed from: b  reason: collision with root package name */
    public String f4593b = "";

    /* renamed from: c  reason: collision with root package name */
    public Map<String, ? extends Object> f4594c = g.f10706a;

    public C0185i(String str, boolean z9) {
        f.f(str, "name");
        this.f4592a = str;
        new HashMap();
    }

    public final String a() {
        return this.f4592a;
    }

    public final void a(String str) {
        f.f(str, "<set-?>");
        this.f4593b = str;
    }

    public final void a(Map<String, ? extends Object> map) {
        f.f(map, "<set-?>");
        this.f4594c = map;
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.f4593b;
    }

    public final Map<String, Object> d() {
        return this.f4594c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0185i) && f.a(this.f4592a, ((C0185i) obj).f4592a);
    }

    public final int hashCode() {
        return (this.f4592a.hashCode() * 31) + 0;
    }

    public final String toString() {
        return "AuctionInstanceInfo(name=" + this.f4592a + ", bidder=" + false + ')';
    }
}
