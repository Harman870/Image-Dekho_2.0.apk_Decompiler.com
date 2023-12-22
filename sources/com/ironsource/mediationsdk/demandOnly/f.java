package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.mediationsdk.C0184g;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.h;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.e;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f4412a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, g> f4413b;

    /* renamed from: c  reason: collision with root package name */
    public final n<ISDemandOnlyInterstitialListener> f4414c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4415d = MediationServices.getProvider().getSessionDepthService();

    /* renamed from: e  reason: collision with root package name */
    public final a.C0056a f4416e = MediationServices.getEditor().getSessionDepthServiceEditor();

    public f(List<NetworkSettings> list, h hVar, C0180c cVar, n nVar, String str, String str2, e eVar) {
        h hVar2 = hVar;
        String sessionId = IronSourceUtils.getSessionId();
        boolean z9 = hVar2.f4748h;
        C0184g gVar = new C0184g(hVar2.f4747g, z9, sessionId);
        this.f4413b = new ConcurrentHashMap<>();
        this.f4412a = eVar;
        this.f4414c = nVar;
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a10 = cVar.a(next, next.getInterstitialSettings(), true, false);
                if (a10 != null) {
                    String str3 = str;
                    String str4 = str2;
                    NetworkSettings networkSettings = next;
                    g gVar2 = r6;
                    g gVar3 = new g(str3, str4, networkSettings, this.f4414c.a(next.getSubProviderId()), TimeUnit.SECONDS.toMillis((long) hVar2.f4745e), a10, new C0183f(gVar));
                    gVar2.a(z9);
                    this.f4413b.put(next.getSubProviderId(), gVar2);
                }
            } else {
                C0180c cVar2 = cVar;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + next.getProviderTypeForReflection());
            }
            hVar2 = hVar;
        }
    }

    public final void a(p.c cVar) {
        String a10 = cVar.a();
        String b10 = cVar.b();
        try {
            g gVar = this.f4413b.get(a10);
            if (gVar == null) {
                this.f4412a.a(2503, a10);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT);
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.f4414c.a(a10).onInterstitialAdLoadFailed(a10, buildNonExistentInstanceError);
            } else if (TextUtils.isEmpty(b10)) {
                gVar.a();
            } else {
                gVar.a(new o.a(IronSourceAES.decode(e.a().b(), b10)));
            }
        } catch (Exception e10) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.f4414c.a(a10).onInterstitialAdLoadFailed(a10, buildLoadFailedError);
        }
    }

    public final void a(String str) {
        try {
            g gVar = this.f4413b.get(str);
            if (gVar == null) {
                this.f4412a.a(2507, str);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT);
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.f4414c.a(str).onInterstitialAdShowFailed(str, buildNonExistentInstanceError);
                return;
            }
            gVar.c();
        } catch (Exception e10) {
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial exception " + e10.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.f4414c.a(str).onInterstitialAdShowFailed(str, buildShowFailedError);
        }
    }
}
