package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.d.d;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.adunit.d.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

public final class f extends c<c, AdapterAdInteractionListener> {
    public f(List<NetworkSettings> list, h hVar, String str, com.ironsource.mediationsdk.d.c cVar, IronSourceSegment ironSourceSegment, boolean z9) {
        super(new com.ironsource.mediationsdk.adunit.c.a.c(str, list, hVar), cVar, ironSourceSegment, z9);
    }

    public final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str) {
        return new c(new a(IronSource.AD_UNIT.INTERSTITIAL, this.f4231q.b(), i10, this.f4224i, str, this.f4222g, this.f4223h, networkSettings, this.f4231q.e()), baseAdAdapter, this);
    }

    public final JSONObject e(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }

    public final com.ironsource.mediationsdk.adunit.c.d.a n() {
        return new d();
    }

    public final String s() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    public final String u() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }
}
