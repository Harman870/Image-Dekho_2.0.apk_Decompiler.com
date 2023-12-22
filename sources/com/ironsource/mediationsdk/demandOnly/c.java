package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.mediationsdk.C0184g;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.d;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, d> f4399a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public e f4400b;

    public c(List<NetworkSettings> list, d dVar, String str, String str2, e eVar) {
        d dVar2 = dVar;
        String sessionId = IronSourceUtils.getSessionId();
        boolean z9 = dVar2.f4721j;
        this.f4400b = eVar;
        C0183f fVar = new C0183f(new C0184g(dVar2.f4720i, z9, sessionId));
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a10 = C0180c.a().a(next, next.getBannerSettings(), true, false);
                if (a10 != null) {
                    d dVar3 = new d(str, str2, next, dVar2.f4714c, a10, fVar);
                    dVar3.a(z9);
                    this.f4399a.put(dVar3.g(), dVar3);
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f4399a.get(str);
        if (dVar == null) {
            this.f4400b.a(IronSourceConstants.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.BANNER_AD_UNIT);
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout);
    }

    public final synchronized void a(String str) {
        d dVar = this.f4399a.get(str);
        if (dVar == null) {
            this.f4400b.a(IronSourceConstants.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.BANNER_AD_UNIT).getErrorMessage());
            return;
        }
        dVar.a();
    }
}
