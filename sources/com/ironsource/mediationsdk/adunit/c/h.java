package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.c.c.a;
import com.ironsource.mediationsdk.adunit.c.d.f;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.adunit.d.e;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

public final class h extends e<e> {
    public h(List<NetworkSettings> list, q qVar, String str, boolean z9, c cVar, IronSourceSegment ironSourceSegment, boolean z10) {
        super(new com.ironsource.mediationsdk.adunit.c.a.e(str, list, qVar, z9), cVar, ironSourceSegment, z10);
    }

    public final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str) {
        return new e(new a(IronSource.AD_UNIT.REWARDED_VIDEO, this.f4231q.b(), i10, this.f4224i, str, this.f4222g, this.f4223h, networkSettings, this.f4231q.e()), baseAdAdapter, this);
    }

    public final JSONObject e(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    public final com.ironsource.mediationsdk.adunit.c.d.a n() {
        return new f();
    }

    public final String s() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    public final String u() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    public final boolean y() {
        return this.f4231q.h().f4208a == a.C0048a.MANUAL;
    }
}
