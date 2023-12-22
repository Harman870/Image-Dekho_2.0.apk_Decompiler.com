package com.ironsource.mediationsdk.model;

import x8.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4710a;

    public b() {
        this("");
    }

    public b(String str) {
        f.f(str, "auctionData");
        this.f4710a = str;
    }

    public final String a() {
        return this.f4710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f4710a, ((b) obj).f4710a);
    }

    public final int hashCode() {
        return this.f4710a.hashCode();
    }

    public final String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f4710a + ')';
    }
}
