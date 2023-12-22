package com.ironsource.mediationsdk.adunit.e;

import com.ironsource.mediationsdk.adunit.d.a.c;
import java.util.List;
import x8.f;

public final class g<Smash extends c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final h<Smash> f4305a;

    public g(h<Smash> hVar) {
        f.f(hVar, "smashPicker");
        this.f4305a = hVar;
    }

    public final boolean a() {
        return this.f4305a.b() == 0;
    }

    public final boolean b() {
        return this.f4305a.f4310e.isEmpty() && this.f4305a.f4312g.isEmpty();
    }

    public final List<Smash> c() {
        return this.f4305a.f4310e;
    }
}
