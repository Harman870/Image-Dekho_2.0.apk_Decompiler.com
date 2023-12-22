package com.ironsource.mediationsdk.model;

import java.util.Map;
import p8.g;
import x8.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f4711a;

    public c() {
        this(g.f10706a);
    }

    public c(Map<String, String> map) {
        f.f(map, "mediationTypes");
        this.f4711a = map;
    }

    public final Map<String, String> a() {
        return this.f4711a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f.a(this.f4711a, ((c) obj).f4711a);
    }

    public final int hashCode() {
        return this.f4711a.hashCode();
    }

    public final String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f4711a + ')';
    }
}
