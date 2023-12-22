package com.ironsource.mediationsdk.events;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.events.b;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class e extends b {
    public static e G;
    public String E;
    public final a F = MediationServices.getProvider().getSessionDepthService();

    private e() {
        this.f4526y = "ironbeast";
        this.f4525v = 2;
        this.f4527z = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.E = "";
    }

    public static synchronized e d() {
        e eVar;
        synchronized (e.class) {
            if (G == null) {
                e eVar2 = new e();
                G = eVar2;
                eVar2.c();
            }
            eVar = G;
        }
        return eVar;
    }

    public final void i() {
        this.A.add(2001);
        this.A.add(2002);
        this.A.add(2003);
        this.A.add(2004);
        this.A.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.A.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.A.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.A.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.A.add(3001);
        this.A.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.A.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_SHOW));
        this.A.add(Integer.valueOf(IronSourceConstants.NT_LOAD));
        this.A.add(Integer.valueOf(IronSourceConstants.NT_CALLBACK_LOAD_ERROR));
        this.A.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD));
        this.A.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS));
        this.A.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.A.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_SHOW));
    }

    public final boolean j(com.ironsource.environment.c.a aVar) {
        return false;
    }

    public final String k(int i10) {
        return this.E;
    }

    public final boolean l(com.ironsource.environment.c.a aVar) {
        int a10 = aVar.a();
        return a10 == 2004 || a10 == 2005 || a10 == 2204 || a10 == 2301 || a10 == 2300 || a10 == 3009 || a10 == 3502 || a10 == 3501 || a10 == 4005 || a10 == 4009 || a10 == 4502 || a10 == 4501;
    }

    public final int m(com.ironsource.environment.c.a aVar) {
        a aVar2;
        IronSource.AD_UNIT ad_unit;
        int a10 = b.a((IronSource.AD_UNIT) null, aVar.a());
        if (a10 == b.a.BANNER.f4535g) {
            aVar2 = this.F;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (a10 == b.a.NATIVE_AD.f4535g) {
            aVar2 = this.F;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            aVar2 = this.F;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return aVar2.a(ad_unit);
    }
}
