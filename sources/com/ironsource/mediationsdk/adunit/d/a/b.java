package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.b.j;
import com.ironsource.mediationsdk.adunit.c.b.e;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.d;
import com.ironsource.mediationsdk.z;
import java.util.HashMap;

public class b<Listener extends e> extends a<Listener> implements AdapterAdRewardListener {

    /* renamed from: q  reason: collision with root package name */
    public d f4262q;

    public b(a aVar, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.f4262q = new d();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.f4262q = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.f4268h != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(c("placement name = " + v()));
            if (this.f4266f != null) {
                HashMap hashMap = new HashMap();
                if (z.a().f5061j != null) {
                    for (String next : z.a().f5061j.keySet()) {
                        hashMap.put(com.ironsource.adapters.ironsource.a.j("custom_", next), z.a().f5061j.get(next));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f4266f.f4162f.a(v(), this.f4268h.getRewardName(), this.f4268h.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, n()), d.a(this.f4262q), hashMap, z.a().f5059i);
            }
            ((e) this.f4264d).a((b<?>) this, this.f4268h);
            return;
        }
        IronLog.INTERNAL.verbose(c("placement is null "));
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f4266f;
        if (dVar != null) {
            j jVar = dVar.f4163g;
            jVar.n("mCurrentPlacement is null state = " + this.f4267g);
        }
    }
}
