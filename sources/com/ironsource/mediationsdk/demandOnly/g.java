package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0181d;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.mediationsdk.C0185i;
import com.ironsource.mediationsdk.C0186j;
import com.ironsource.mediationsdk.C0187k;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.events.e;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.d;
import com.ironsource.sdk.controller.h;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

public final class g extends j implements InterstitialSmashListener, h {

    /* renamed from: m  reason: collision with root package name */
    public d f4417m;

    /* renamed from: n  reason: collision with root package name */
    public d f4418n;

    /* renamed from: o  reason: collision with root package name */
    public ISDemandOnlyInterstitialListener f4419o;

    /* renamed from: p  reason: collision with root package name */
    public C0186j f4420p;

    /* renamed from: q  reason: collision with root package name */
    public C0183f f4421q;

    /* renamed from: r  reason: collision with root package name */
    public q f4422r = new q.b();

    /* renamed from: s  reason: collision with root package name */
    public final com.ironsource.mediationsdk.services.a f4423s = MediationServices.getProvider().getSessionDepthService();

    /* renamed from: t  reason: collision with root package name */
    public final a.C0056a f4424t = MediationServices.getEditor().getSessionDepthServiceEditor();

    public class a extends TimerTask {
        public a() {
        }

        public final void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + g.this.i());
            g.this.m(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"));
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        public final void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + g.this.i());
            g.this.m(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j10, AbstractAdapter abstractAdapter, C0183f fVar) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f4419o = iSDemandOnlyInterstitialListener;
        this.f4438f = j10;
        this.f4433a.initInterstitial(str, str2, this.f4435c, this);
        this.f4421q = fVar;
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + i());
        j.a aVar = j.a.NOT_LOADED;
        j.a aVar2 = j.a.LOADED;
        j.a aVar3 = j.a.LOAD_IN_PROGRESS;
        j.a a10 = a(new j.a[]{aVar, aVar2}, aVar3);
        if (a10 == aVar || a10 == aVar2) {
            this.f4439g = null;
            this.f4440h = null;
            this.f4442j = null;
            this.f4420p = new C0186j();
            l(2002, (Object[][]) null);
            this.f4417m = new d();
            d(new b());
            if (k()) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
                l(IronSourceConstants.IS_AD_UNIT_CAPPED, (Object[][]) null);
                m(buildLoadFailedError);
            } else if (!h()) {
                this.f4418n = new d();
                this.f4433a.loadInterstitial(this.f4435c, (JSONObject) null, this);
            } else if (!this.f4421q.f4557a.a()) {
                ironLog.verbose("can't load the interstitial the auction isn't enabled");
                m(new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing server configuration"));
            } else {
                l(82500, (Object[][]) null);
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                C0187k kVar = new C0187k(ad_unit);
                kVar.b(IronSourceUtils.isEncryptedResponse());
                kVar.c(true);
                kVar.a(true);
                kVar.b(f() + e());
                kVar.a(g());
                kVar.a(this.f4423s.a(ad_unit));
                C0185i iVar = new C0185i(e(), false);
                iVar.a(this.f4422r.a());
                Map<String, Object> interstitialBiddingData = this.f4433a.getInterstitialBiddingData(this.f4435c, new JSONObject());
                if (interstitialBiddingData != null) {
                    iVar.a((Map<String, ? extends Object>) interstitialBiddingData);
                }
                kVar.a(iVar);
                ironLog.verbose("auction waterfallString = " + kVar.j());
                l(82510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, kVar.j()}});
                this.f4421q.a(ContextProvider.getInstance().getApplicationContext(), kVar, (C0181d) this);
            }
        } else {
            m(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, a10 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
        }
    }

    public final void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error " + i10 + " - " + str);
        this.f4439g = null;
        this.f4440h = null;
        l(82300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, i()}});
        if (f(j.a.LOAD_IN_PROGRESS)) {
            m(new IronSourceError(1164, "No available ad to load"));
        }
    }

    public final void a(C0182e.a aVar, long j10, int i10, String str) {
        String str2;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f4439g = aVar.f4493a;
        this.f4440h = aVar.f4496d;
        b.a aVar2 = new b.a(aVar.f4494b);
        if (!aVar2.b()) {
            com.ironsource.mediationsdk.a.a aVar3 = aVar.f4500h;
            if (aVar3 != null) {
                this.f4422r = aVar3.a(g());
            }
            com.ironsource.mediationsdk.adunit.a.a a10 = aVar2.a(0);
            this.f4420p.c(a10.g());
            this.f4420p.a(a10.i());
            this.f4420p.b(a10.h());
            str2 = a10.b();
            a(str2);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str)) {
            l(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
        }
        l(82301, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        l(82302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, aVar2.a()}});
        j.a aVar4 = j.a.LOAD_IN_PROGRESS;
        if (f(aVar4)) {
            if (aVar2.b()) {
                ironSourceError = new IronSourceError(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
            } else {
                ironLog.verbose();
                if (!f(aVar4)) {
                    return;
                }
                if (str2 == null) {
                    ironLog.verbose("serverData is null");
                    ironSourceError = new IronSourceError(1162, "No available ad to load");
                } else {
                    l(82002, (Object[][]) null);
                    this.f4433a.loadInterstitialForBidding(this.f4435c, (JSONObject) null, str2, this);
                    return;
                }
            }
            m(ironSourceError);
        }
    }

    public final void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    public final void c() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + e() + ", state=" + i());
        l(IronSourceConstants.IS_INSTANCE_SHOW, (Object[][]) null);
        j.a aVar = j.a.LOADED;
        j.a aVar2 = j.a.SHOW_IN_PROGRESS;
        if (e(aVar, aVar2)) {
            this.f4433a.showInterstitial(this.f4435c, this);
        } else {
            this.f4419o.onInterstitialAdShowFailed(g(), f(aVar2) ? new IronSourceError(IronSourceError.ERROR_DO_IS_SHOW_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing") : f(j.a.LOAD_IN_PROGRESS) ? new IronSourceError(IronSourceError.ERROR_DO_IS_SHOW_DURING_LOAD, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(IronSourceError.ERROR_DO_IS_SHOW_NO_AVAILABLE_ADS, "showInterstitial error: no available ads to show"));
        }
    }

    public final boolean d() {
        boolean z9 = false;
        if (!f(j.a.LOADED)) {
            return false;
        }
        try {
            z9 = this.f4433a.isInterstitialReady(this.f4435c);
            l(z9 ? IronSourceConstants.IS_INSTANCE_READY_TRUE : IronSourceConstants.IS_INSTANCE_READY_FALSE, (Object[][]) null);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception=" + e10.getMessage());
        }
        return z9;
    }

    public final void l(int i10, Object[][] objArr) {
        Map<String, Object> b10 = b();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    b10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
            }
        }
        e.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(b10)));
    }

    public final void m(IronSourceError ironSourceError) {
        boolean z9;
        IronLog.INTERNAL.verbose("instanceName = " + e() + ", error = " + ironSourceError.getErrorMessage());
        j();
        if (e(j.a.LOAD_IN_PROGRESS, j.a.NOT_LOADED)) {
            long a10 = d.a(this.f4417m);
            if (ironSourceError.getErrorCode() == 1158) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                l(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
            } else {
                l(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            }
            j.c(this.f4420p.b(), e(), f(), this.f4442j, IronSourceUtils.getCurrentMethodName());
            this.f4419o.onInterstitialAdLoadFailed(g(), ironSourceError);
        }
    }

    public final void onInterstitialAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + e());
        l(2006, new Object[0][]);
        this.f4419o.onInterstitialAdClicked(g());
    }

    public final void onInterstitialAdClosed() {
        b(j.a.NOT_LOADED);
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + e());
        com.ironsource.mediationsdk.services.a aVar = this.f4423s;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        l(IronSourceConstants.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aVar.a(ad_unit))}});
        this.f4424t.b(ad_unit);
        this.f4419o.onInterstitialAdClosed(g());
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + e() + " state=" + i());
        long a10 = d.a(this.f4418n);
        l(82110, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a10)}});
        m(ironSourceError);
    }

    public final void onInterstitialAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + e());
        l(IronSourceConstants.IS_INSTANCE_OPENED, new Object[0][]);
        j.c(this.f4420p.c(), e(), f(), this.f4442j, IronSourceUtils.getCurrentMethodName());
        this.f4419o.onInterstitialAdOpened(g());
    }

    public final void onInterstitialAdReady() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + e() + " state=" + i());
        j();
        l(82003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(d.a(this.f4418n))}});
        if (e(j.a.LOAD_IN_PROGRESS, j.a.LOADED)) {
            l(2003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(d.a(this.f4417m))}});
            j.c(this.f4420p.a(), e(), f(), this.f4442j, IronSourceUtils.getCurrentMethodName());
            this.f4419o.onInterstitialAdReady(g());
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.toString() + " instance name= " + e() + " state=" + i());
        b(j.a.NOT_LOADED);
        l(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        this.f4419o.onInterstitialAdShowFailed(g(), ironSourceError);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + e());
        l(IronSourceConstants.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }

    public final void a(o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + i());
        j.a aVar = j.a.NOT_LOADED;
        j.a aVar2 = j.a.LOADED;
        j.a aVar3 = j.a.LOAD_IN_PROGRESS;
        j.a a10 = a(new j.a[]{aVar, aVar2}, aVar3);
        if (a10 == aVar || a10 == aVar2) {
            this.f4439g = null;
            this.f4440h = null;
            this.f4442j = null;
            this.f4420p = new C0186j();
            l(2002, (Object[][]) null);
            this.f4417m = new d();
            d(new a());
            if (!k()) {
                m(new IronSourceError(IronSourceConstants.IS_AD_UNIT_CAPPED, "loadInterstitialWithAdm: must be called by bidder instance"));
                return;
            }
            try {
                C0182e.a aVar4 = (C0182e.a) oVar.a(new k());
                com.ironsource.mediationsdk.adunit.a.a a11 = new b.a(aVar4.f4494b).a(e());
                if (a11 == null) {
                    IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                    l(IronSourceConstants.IS_AD_UNIT_CAPPED, (Object[][]) null);
                    m(buildLoadFailedError);
                    return;
                }
                String b10 = a11.b();
                if (b10 == null) {
                    ironLog.error("serverData is null");
                    m(new IronSourceError(1162, "No available ad to load"));
                    return;
                }
                a(b10);
                b(aVar4.f4493a);
                a(aVar4.f4496d);
                l(82002, (Object[][]) null);
                this.f4420p.c(a11.g());
                this.f4418n = new d();
                this.f4433a.loadInterstitialForBidding(this.f4435c, (JSONObject) null, b10, this);
            } catch (Exception e10) {
                m(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e10.getMessage()));
            }
        } else {
            m(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, a10 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
        }
    }
}
