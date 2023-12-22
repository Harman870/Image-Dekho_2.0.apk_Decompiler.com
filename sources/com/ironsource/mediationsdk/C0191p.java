package com.ironsource.mediationsdk;

import x8.f;

/* renamed from: com.ironsource.mediationsdk.p  reason: case insensitive filesystem */
public final class C0191p {

    /* renamed from: a  reason: collision with root package name */
    public String f4815a;

    /* renamed from: b  reason: collision with root package name */
    public String f4816b;

    /* renamed from: c  reason: collision with root package name */
    public String f4817c;

    public C0191p(String str, String str2, String str3) {
        f.f(str, "cachedAppKey");
        f.f(str2, "cachedUserId");
        f.f(str3, "cachedSettings");
        this.f4815a = str;
        this.f4816b = str2;
        this.f4817c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0191p)) {
            return false;
        }
        C0191p pVar = (C0191p) obj;
        return f.a(this.f4815a, pVar.f4815a) && f.a(this.f4816b, pVar.f4816b) && f.a(this.f4817c, pVar.f4817c);
    }

    public final int hashCode() {
        int hashCode = this.f4816b.hashCode();
        return this.f4817c.hashCode() + ((hashCode + (this.f4815a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CachedResponse(cachedAppKey=" + this.f4815a + ", cachedUserId=" + this.f4816b + ", cachedSettings=" + this.f4817c + ')';
    }
}
