package com.ironsource.environment;

import x8.f;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final l f3761a;

    public n(l lVar) {
        f.f(lVar, "time");
        this.f3761a = lVar;
    }

    public final boolean a(long j10, long j11) {
        long a10 = this.f3761a.a();
        return j11 <= 0 || j10 <= 0 || a10 < j10 || a10 - j10 > j11;
    }
}
