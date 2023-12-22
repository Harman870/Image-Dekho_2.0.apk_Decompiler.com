package com.ironsource.mediationsdk;

import x8.f;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final String f5040a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5041b;

    public y(String str, String str2) {
        f.f(str, "advId");
        f.f(str2, "advIdType");
        this.f5040a = str;
        this.f5041b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return f.a(this.f5040a, yVar.f5040a) && f.a(this.f5041b, yVar.f5041b);
    }

    public final int hashCode() {
        return this.f5041b.hashCode() + (this.f5040a.hashCode() * 31);
    }

    public final String toString() {
        return "IronSourceAdvId(advId=" + this.f5040a + ", advIdType=" + this.f5041b + ')';
    }
}
