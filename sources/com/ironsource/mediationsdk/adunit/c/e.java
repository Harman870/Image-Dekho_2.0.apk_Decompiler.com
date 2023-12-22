package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.c.a.a;
import com.ironsource.mediationsdk.adunit.d.a.b;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;

public abstract class e<Smash extends b<?>> extends c<Smash, AdapterAdRewardListener> implements com.ironsource.mediationsdk.adunit.c.b.e {
    public e(a aVar, c cVar, IronSourceSegment ironSourceSegment, boolean z9) {
        super(aVar, cVar, ironSourceSegment, z9);
    }

    public final void a(b<?> bVar, Placement placement) {
        IronLog.INTERNAL.verbose(b(bVar.o()));
        this.f4235v.b(placement, this.f4217b.a(bVar.q()));
    }
}
