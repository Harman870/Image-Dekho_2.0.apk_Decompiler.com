package com.ironsource.mediationsdk.adunit.e;

import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import x8.f;

public final class a<Smash extends c<?>> extends h<Smash> {

    /* renamed from: h  reason: collision with root package name */
    public boolean f4288h;

    public a() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i10, List list, Map map, boolean z9, int i11) {
        super(i10, list, map);
        f.f(list, "waterfall");
        f.f(map, "waterfallFromServer");
        this.f4288h = false;
    }

    public final void a(Smash smash) {
        String str;
        f.f(smash, "smash");
        if (!smash.k()) {
            IronLog.INTERNAL.verbose(smash.r().name() + " - Smash " + smash.n() + " (non-bidder) is ready to load");
            this.f4310e.add(smash);
            return;
        }
        this.f4288h = true;
        if (b() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.n() + ". No other instances will be loaded at the same time.";
            this.f4310e.add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.n() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.r().name() + " - " + str);
        IronSourceUtils.sendAutomationLog(str);
    }

    public final boolean a() {
        return super.a() || this.f4288h;
    }
}
