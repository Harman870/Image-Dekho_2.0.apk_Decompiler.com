package com.ironsource.mediationsdk.demandOnly;

import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.sdk.b;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

public final class i extends j implements RewardedVideoSmashListener {

    /* renamed from: m  reason: collision with root package name */
    public b f4430m;

    /* renamed from: n  reason: collision with root package name */
    public long f4431n;

    public class a extends TimerTask {
        public a() {
        }

        public final void run() {
            i iVar = i.this;
            iVar.m("load timed out state=" + i.this.i());
            if (i.this.e(j.a.LOAD_IN_PROGRESS, j.a.NOT_LOADED)) {
                long b10 = v0.b();
                i iVar2 = i.this;
                iVar2.f4430m.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), i.this, b10 - iVar2.f4431n);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.model.NetworkSettings r6, com.ironsource.mediationsdk.sdk.b r7, long r8, com.ironsource.mediationsdk.AbstractAdapter r10) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getInterstitialSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r0.<init>(r6, r1, r2)
            r3.<init>(r0, r10)
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            org.json.JSONObject r1 = r6.getRewardedVideoSettings()
            r0.<init>(r6, r1, r2)
            r3.f4434b = r0
            org.json.JSONObject r6 = r0.f4704b
            r3.f4435c = r6
            r3.f4433a = r10
            r3.f4430m = r7
            r3.f4438f = r8
            r10.initRewardedVideoForDemandOnly(r4, r5, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.demandOnly.i.<init>(java.lang.String, java.lang.String, com.ironsource.mediationsdk.model.NetworkSettings, com.ironsource.mediationsdk.sdk.b, long, com.ironsource.mediationsdk.AbstractAdapter):void");
    }

    public final void a() {
        m("showRewardedVideo state=" + i());
        j.a aVar = j.a.LOADED;
        j.a aVar2 = j.a.SHOW_IN_PROGRESS;
        if (e(aVar, aVar2)) {
            this.f4433a.showRewardedVideo(this.f4435c, this);
        } else {
            this.f4430m.a(f(aVar2) ? new IronSourceError(IronSourceError.ERROR_DO_RV_SHOW_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing") : f(j.a.LOAD_IN_PROGRESS) ? new IronSourceError(IronSourceError.ERROR_DO_RV_SHOW_DURING_LOAD, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(IronSourceError.ERROR_DO_RV_SHOW_NO_AVAILABLE_ADS, "showRewardedVideo error: no available ads to show"), this);
        }
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        IronSourceError ironSourceError;
        m("loadRewardedVideo state=" + i());
        j.a aVar = j.a.NOT_LOADED;
        j.a aVar2 = j.a.LOADED;
        j.a aVar3 = j.a.LOAD_IN_PROGRESS;
        j.a a10 = a(new j.a[]{aVar, aVar2}, aVar3);
        if (a10 == aVar || a10 == aVar2) {
            this.f4431n = v0.b();
            m("start timer");
            d(new a());
            if (k()) {
                this.f4439g = str2;
                this.f4440h = jSONObject;
                this.f4441i = list;
                this.f4433a.loadRewardedVideoForDemandOnlyForBidding(this.f4435c, str, this);
                return;
            }
            this.f4433a.loadRewardedVideoForDemandOnly(this.f4435c, this);
        } else if (a10 == aVar3) {
            this.f4430m.a(ironSourceError, this, 0);
        } else {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress");
            this.f4430m.a(ironSourceError, this, 0);
        }
    }

    public final boolean c() {
        if (!f(j.a.LOADED)) {
            return false;
        }
        try {
            return this.f4433a.isRewardedVideoAvailable(this.f4435c);
        } catch (Exception e10) {
            m("isRewardedVideoAvailable exception: " + e10.getLocalizedMessage());
            return false;
        }
    }

    public final void l(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f4434b.f4703a.getProviderName() + " : " + str, 0);
    }

    public final void m(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f4434b.f4703a.getProviderName() + " : " + str, 0);
    }

    public final void onRewardedVideoAdClicked() {
        l("onRewardedVideoAdClicked");
        this.f4430m.c(this);
    }

    public final void onRewardedVideoAdClosed() {
        b(j.a.NOT_LOADED);
        l("onRewardedVideoAdClosed");
        this.f4430m.b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        l("onRewardedVideoAdOpened");
        this.f4430m.a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        l("onRewardedVideoAdRewarded");
        this.f4430m.e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        b(j.a.NOT_LOADED);
        l("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f4430m.a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        l("onRewardedVideoAdVisible");
        this.f4430m.d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z9) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        l("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (e(j.a.LOAD_IN_PROGRESS, j.a.NOT_LOADED)) {
            this.f4430m.a(ironSourceError, this, v0.b() - this.f4431n);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        l("onRewardedVideoLoadSuccess state=" + i());
        j();
        if (e(j.a.LOAD_IN_PROGRESS, j.a.LOADED)) {
            this.f4430m.a(this, v0.b() - this.f4431n);
        }
    }
}
