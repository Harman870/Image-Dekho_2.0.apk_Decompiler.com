package com.ironsource.lifecycle;

import x8.f;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final g f3783a;

    /* renamed from: b  reason: collision with root package name */
    public long f3784b = System.currentTimeMillis();

    public a(g gVar) {
        f.f(gVar, "task");
        this.f3783a = gVar;
        d.a().a(this);
    }

    public final void a() {
        this.f3784b = System.currentTimeMillis();
    }

    public final void b() {
        this.f3783a.f3819a = Long.valueOf(System.currentTimeMillis() - this.f3784b);
        this.f3783a.run();
    }
}
