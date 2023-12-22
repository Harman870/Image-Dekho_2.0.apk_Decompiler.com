package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.mediationsdk.C0186j;
import com.ironsource.mediationsdk.C0187k;
import com.ironsource.mediationsdk.C0189n;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.l;
import com.ironsource.mediationsdk.events.e;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import w7.b;

public final class d extends j implements BannerSmashListener, h {

    /* renamed from: m  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.d f4401m;

    /* renamed from: n  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.d f4402n;

    /* renamed from: o  reason: collision with root package name */
    public String f4403o;

    /* renamed from: p  reason: collision with root package name */
    public String f4404p;

    /* renamed from: q  reason: collision with root package name */
    public C0186j f4405q;

    /* renamed from: r  reason: collision with root package name */
    public C0183f f4406r;

    /* renamed from: s  reason: collision with root package name */
    public ISDemandOnlyBannerLayout f4407s;

    /* renamed from: t  reason: collision with root package name */
    public final a f4408t = MediationServices.getProvider().getSessionDepthService();
    public final a.C0056a u = MediationServices.getEditor().getSessionDepthServiceEditor();

    public d(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter, C0183f fVar) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f4438f = j10;
        this.f4403o = str;
        this.f4404p = str2;
        this.f4405q = new C0186j();
        this.f4433a.initBannerForBidding(str, str2, this.f4435c, this);
        this.f4406r = fVar;
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new j.a[]{j.a.LOADED, j.a.LOAD_IN_PROGRESS, j.a.SHOW_IN_PROGRESS}, j.a.NOT_LOADED);
        if (c()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        j();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f4407s;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.f4382e = true;
            iSDemandOnlyBannerLayout.f4381d = null;
            iSDemandOnlyBannerLayout.f4379b = null;
            iSDemandOnlyBannerLayout.f4380c = null;
            iSDemandOnlyBannerLayout.f4378a = null;
            iSDemandOnlyBannerLayout.removeBannerListener();
        }
        this.f4407s = null;
        AbstractAdapter abstractAdapter = this.f4433a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f4435c);
        }
        l(IronSourceConstants.BN_INSTANCE_DESTROY, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + g());
    }

    public final void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Auction failed. error " + i10 + " - " + str);
        this.f4439g = null;
        this.f4440h = null;
        l(83501, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, i()}});
        if (f(j.a.LOAD_IN_PROGRESS)) {
            m(new IronSourceError(621, "No available ad to load"));
        }
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + i());
        j.a[] aVarArr = {j.a.NOT_LOADED, j.a.LOADED};
        j.a aVar = j.a.LOAD_IN_PROGRESS;
        j.a a10 = a(aVarArr, aVar);
        if (a10 != aVar && a10 != j.a.SHOW_IN_PROGRESS) {
            this.f4439g = null;
            this.f4440h = null;
            this.f4405q = new C0186j();
            l(IronSourceConstants.BN_INSTANCE_LOAD, (Object[][]) null);
            if (!h()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing configuration settings");
            } else {
                this.f4407s = iSDemandOnlyBannerLayout;
                this.f4401m = new com.ironsource.mediationsdk.utils.d();
                ironLog.verbose();
                d(new b(this));
                if (this.f4406r.f4557a.a()) {
                    ironLog.verbose();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(e());
                    C0187k kVar = new C0187k(IronSource.AD_UNIT.BANNER);
                    kVar.a((List<String>) arrayList);
                    kVar.b("" + f() + e());
                    kVar.a(g());
                    kVar.b(IronSourceUtils.isEncryptedResponse());
                    kVar.c(true);
                    kVar.a(true);
                    kVar.a(this.f4407s.getSize());
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new w7.a(this, kVar));
                    return;
                }
                ironLog.verbose("can't load the banner the auction isn't enabled");
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing server configuration");
            }
            m(ironSourceError);
        } else if (iSDemandOnlyBannerLayout != null && !iSDemandOnlyBannerLayout.isDestroyed()) {
            this.f4407s.getListener().a(g(), new IronSourceError(619, a10 == aVar ? "load already in progress" : "cannot load because show is in progress"));
        }
    }

    public final void a(C0182e.a aVar, long j10, int i10, String str) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f4439g = aVar.f4493a;
        this.f4440h = aVar.f4496d;
        b.a aVar2 = new b.a(aVar.f4494b);
        if (!TextUtils.isEmpty(str)) {
            l(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
        }
        l(83502, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        l(83511, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.a()}});
        j.a aVar3 = j.a.LOAD_IN_PROGRESS;
        if (f(aVar3)) {
            if (aVar2.b()) {
                ironSourceError = new IronSourceError(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
            } else {
                com.ironsource.mediationsdk.adunit.a.a a10 = aVar2.a(0);
                this.f4405q.c(a10.g());
                this.f4405q.a(a10.i());
                this.f4405q.b(a10.h());
                String b10 = a10.b();
                a(b10);
                ironLog.verbose();
                if (!f(aVar3)) {
                    return;
                }
                if (b10 == null) {
                    ironLog.verbose("serverData is null");
                    ironSourceError = new IronSourceError(618, "No available ad to load");
                } else {
                    l(83302, (Object[][]) null);
                    this.f4402n = new com.ironsource.mediationsdk.utils.d();
                    this.f4433a.initBannerForBidding(this.f4403o, this.f4404p, this.f4435c, this);
                    this.f4433a.loadBannerForDemandOnlyForBidding(this.f4435c, b10, this.f4407s, this);
                    return;
                }
            }
            m(ironSourceError);
        }
    }

    public final void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    public final Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        try {
            if (c()) {
                hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
            } else {
                C0189n.a(hashMap, this.f4407s.getSize());
            }
            AbstractAdapter abstractAdapter = this.f4433a;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.f4433a;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f4434b.f4703a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f4434b.f4703a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (h()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f4434b.f4708f));
            if (!TextUtils.isEmpty(this.f4439g)) {
                hashMap.put("auctionId", this.f4439g);
            }
            JSONObject jSONObject = this.f4440h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f4440h);
            }
            if (!TextUtils.isEmpty(this.f4442j)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f4442j);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Instance: " + e() + " " + e10.getMessage());
        }
        return hashMap;
    }

    public final boolean c() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f4407s;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    public final void l(int i10, Object[][] objArr) {
        Map<String, Object> b10 = b();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        b10.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.getMessage());
            }
        }
        e.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(b10)));
    }

    public final void m(IronSourceError ironSourceError) {
        boolean z9;
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + n());
        if (e(j.a.LOAD_IN_PROGRESS, j.a.NOT_LOADED)) {
            j();
            long a10 = com.ironsource.mediationsdk.utils.d.a(this.f4401m);
            if (ironSourceError.getErrorCode() == 606) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                l(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a10)}});
            } else {
                l(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a10)}});
            }
            j.c(this.f4405q.b(), e(), f(), this.f4442j, IronSourceUtils.getCurrentMethodName());
            if (!c()) {
                this.f4407s.getListener().a(g(), ironSourceError);
            }
        }
    }

    public final String n() {
        return this.f4434b.f4703a.isMultipleInstances() ? this.f4434b.f4703a.getProviderTypeForReflection() : this.f4434b.f4703a.getProviderName();
    }

    public final void onBannerAdClicked() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + n());
        l(IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        if (!c()) {
            a listener = this.f4407s.getListener();
            String g10 = g();
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = (ISDemandOnlyBannerListener) listener.a();
            l.a.a((Runnable) new a.d(g10, iSDemandOnlyBannerListener), iSDemandOnlyBannerListener != null);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + n());
        l(IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        if (!c()) {
            a listener = this.f4407s.getListener();
            String g10 = g();
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = (ISDemandOnlyBannerListener) listener.a();
            l.a.a((Runnable) new a.e(g10, iSDemandOnlyBannerListener), iSDemandOnlyBannerListener != null);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + n());
        long a10 = com.ironsource.mediationsdk.utils.d.a(this.f4402n);
        l(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a10)}});
        m(ironSourceError);
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + n());
        com.ironsource.mediationsdk.services.a aVar = this.f4408t;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        int a10 = aVar.a(ad_unit);
        boolean z9 = false;
        l(83305, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(a10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.f4402n))}});
        if (e(j.a.LOAD_IN_PROGRESS, j.a.LOADED)) {
            j();
            if (!c()) {
                IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new ISDemandOnlyBannerLayout.a(view, layoutParams));
            }
            l(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(a10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.f4401m))}});
            this.u.b(ad_unit);
            j.c(this.f4405q.a(), e(), f(), this.f4442j, IronSourceUtils.getCurrentMethodName());
            if (!c()) {
                a listener = this.f4407s.getListener();
                String g10 = g();
                ISDemandOnlyBannerListener iSDemandOnlyBannerListener = (ISDemandOnlyBannerListener) listener.a();
                a.b bVar = new a.b(g10, iSDemandOnlyBannerListener);
                if (iSDemandOnlyBannerListener != null) {
                    z9 = true;
                }
                l.a.a((Runnable) bVar, z9);
            }
        }
    }

    public final void onBannerAdScreenDismissed() {
    }

    public final void onBannerAdScreenPresented() {
    }

    public final void onBannerAdShown() {
        boolean z9;
        if (e(j.a.LOADED, j.a.SHOW_IN_PROGRESS)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("smash - " + n());
            l(IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            j.c(this.f4405q.c(), e(), f(), this.f4442j, IronSourceUtils.getCurrentMethodName());
            if (!c()) {
                a listener = this.f4407s.getListener();
                String g10 = g();
                ISDemandOnlyBannerListener iSDemandOnlyBannerListener = (ISDemandOnlyBannerListener) listener.a();
                a.c cVar = new a.c(g10, iSDemandOnlyBannerListener);
                if (iSDemandOnlyBannerListener != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                l.a.a((Runnable) cVar, z9);
            }
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + n() + " " + ironSourceError.toString());
    }

    public final void onBannerInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + n());
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + i());
        j.a[] aVarArr = {j.a.NOT_LOADED, j.a.LOADED};
        j.a aVar = j.a.LOAD_IN_PROGRESS;
        j.a a10 = a(aVarArr, aVar);
        if (a10 != aVar && a10 != j.a.SHOW_IN_PROGRESS) {
            this.f4439g = null;
            this.f4440h = null;
            this.f4405q = new C0186j();
            l(IronSourceConstants.BN_INSTANCE_LOAD, (Object[][]) null);
            if (c()) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, "bannerLayout is null or destroyed");
            } else if (!k()) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
                l(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, (Object[][]) null);
            } else {
                try {
                    C0182e.a aVar2 = (C0182e.a) oVar.a(new k());
                    com.ironsource.mediationsdk.adunit.a.a a11 = new b.a(aVar2.f4494b).a(e());
                    if (a11 == null) {
                        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                        l(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, (Object[][]) null);
                        m(buildLoadFailedError);
                        return;
                    }
                    String b10 = a11.b();
                    if (b10 == null) {
                        ironLog.error("serverData is null");
                        m(new IronSourceError(618, "No available ad to load"));
                        return;
                    }
                    a(b10);
                    b(aVar2.f4493a);
                    a(aVar2.f4496d);
                    l(83302, (Object[][]) null);
                    this.f4405q.c(a11.g());
                    this.f4401m = new com.ironsource.mediationsdk.utils.d();
                    ironLog.verbose();
                    d(new w7.b(this));
                    this.f4433a.initBannerForBidding(this.f4403o, this.f4404p, this.f4435c, this);
                    this.f4433a.loadBannerForDemandOnlyForBidding(this.f4435c, b10, iSDemandOnlyBannerLayout, this);
                    return;
                } catch (Exception e10) {
                    ironSourceError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e10.getMessage());
                }
            }
            m(ironSourceError);
        } else if (iSDemandOnlyBannerLayout != null && !iSDemandOnlyBannerLayout.isDestroyed()) {
            this.f4407s.getListener().a(g(), new IronSourceError(619, a10 == aVar ? "load already in progress" : "cannot load because show is in progress"));
        }
    }
}
