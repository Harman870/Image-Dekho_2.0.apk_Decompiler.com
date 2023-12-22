package com.ironsource.mediationsdk.adunit.e;

import com.ironsource.mediationsdk.adunit.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Map;
import x8.f;

public final class b<Smash extends c<?>> extends h<Smash> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i10, List<? extends Smash> list, Map<String, ? extends a> map) {
        super(i10, list, map);
        f.f(list, "waterfall");
        f.f(map, "waterfallFromServer");
    }

    public final void a(Smash smash) {
        f.f(smash, "smash");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(smash.r().name() + " - Smash " + smash.o() + " is ready to load");
        this.f4310e.add(smash);
    }
}
