package com.ironsource.mediationsdk.events;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.events.b;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class i extends b {
    public static i G;
    public String E;
    public final a F = MediationServices.getProvider().getSessionDepthService();

    private i() {
        this.f4526y = "outcome";
        this.f4525v = 3;
        this.f4527z = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.E = "";
    }

    public static synchronized i d() {
        i iVar;
        synchronized (i.class) {
            if (G == null) {
                i iVar2 = new i();
                G = iVar2;
                iVar2.c();
            }
            iVar = G;
        }
        return iVar;
    }

    public final void i() {
        this.A.add(1000);
        this.A.add(1001);
        this.A.add(1002);
        this.A.add(1003);
        this.A.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.A.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.A.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.A.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.A.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.A.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.A.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    public final boolean j(com.ironsource.environment.c.a aVar) {
        return aVar.a() == 305;
    }

    public final String k(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.E : "";
    }

    public final boolean l(com.ironsource.environment.c.a aVar) {
        int a10 = aVar.a();
        return a10 == 14 || a10 == 514 || a10 == 305 || a10 == 1003 || a10 == 1005 || a10 == 1203 || a10 == 1010 || a10 == 1301 || a10 == 1302;
    }

    public final int m(com.ironsource.environment.c.a aVar) {
        return this.F.a(b.a((IronSource.AD_UNIT) null, aVar.a()) == b.a.OFFERWALL.f4535g ? IronSource.AD_UNIT.OFFERWALL : IronSource.AD_UNIT.REWARDED_VIDEO);
    }
}
