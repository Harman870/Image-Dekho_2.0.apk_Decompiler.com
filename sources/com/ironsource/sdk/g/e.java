package com.ironsource.sdk.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f5654a;

    /* renamed from: b  reason: collision with root package name */
    public int f5655b;

    public e(int i10, String str) {
        this.f5655b = i10;
        this.f5654a = str == null ? "" : str;
    }

    public final String toString() {
        return "error - code:" + this.f5655b + ", message:" + this.f5654a;
    }
}
