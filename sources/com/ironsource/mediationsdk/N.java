package com.ironsource.mediationsdk;

import android.text.TextUtils;
import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.bidding.c;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.events.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public final class N extends O implements c, InterstitialSmashListener {

    /* renamed from: h  reason: collision with root package name */
    public a f3968h = a.NO_INIT;

    /* renamed from: i  reason: collision with root package name */
    public M f3969i;

    /* renamed from: j  reason: collision with root package name */
    public Timer f3970j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public String f3971l;

    /* renamed from: m  reason: collision with root package name */
    public String f3972m;

    /* renamed from: n  reason: collision with root package name */
    public long f3973n;

    /* renamed from: o  reason: collision with root package name */
    public JSONObject f3974o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f3975p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public boolean f3976q;

    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public class b extends TimerTask {
        public b() {
        }

        public final void run() {
            N n2 = N.this;
            n2.b("timed out state=" + N.this.f3968h.name() + " isBidder=" + N.this.h(), 0);
            N n10 = N.this;
            if (n10.f3968h != a.INIT_IN_PROGRESS || !n10.h()) {
                N.this.g(a.LOAD_FAILED);
                long time = new Date().getTime();
                N n11 = N.this;
                n11.f3969i.a(ErrorBuilder.buildLoadFailedError("timed out"), N.this, time - n11.f3973n);
                return;
            }
            N.this.g(a.NO_INIT);
        }
    }

    public N(String str, String str2, NetworkSettings networkSettings, M m2, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f3971l = str;
        this.f3972m = str2;
        this.f3969i = m2;
        this.f3970j = null;
        this.k = i10;
        this.f3974o = null;
    }

    public final Map<String, Object> a(AdData adData) {
        JSONObject a10 = adData != null ? com.ironsource.mediationsdk.d.c.a(adData.getAdUnitData()) : null;
        try {
            if (h()) {
                return this.f3985a.getInterstitialBiddingData(this.f3988d, a10);
            }
            return null;
        } catch (Throwable th) {
            b("getBiddingData exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            return null;
        }
    }

    public final void a() {
        b("isBidder = " + h() + ", shouldEarlyInit = " + i(), 0);
        this.f3976q = true;
        g(a.INIT_IN_PROGRESS);
        u();
        try {
            if (h()) {
                this.f3985a.initInterstitialForBidding(this.f3971l, this.f3972m, this.f3988d, this);
            } else {
                this.f3985a.initInterstitial(this.f3971l, this.f3972m, this.f3988d, this);
            }
        } catch (Throwable th) {
            b(n() + " initForBidding exception : " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(int i10, Object[][] objArr) {
        Map<String, Object> q10 = q();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    q10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                b("IS sendProviderEvent " + e10.getMessage(), 3);
            }
        }
        e.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(q10)));
    }

    public final void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObject = null;
        a((int) IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN, (Object[][]) null);
        if (adData != null) {
            jSONObject = com.ironsource.mediationsdk.d.c.a(adData.getAdUnitData());
        }
        try {
            this.f3985a.collectInterstitialBiddingData(this.f3988d, jSONObject, biddingDataCallback);
        } catch (Throwable th) {
            b("collectBiddingData exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        try {
            this.f3973n = new Date().getTime();
            this.f3974o = jSONObject;
            b("loadInterstitial", 0);
            this.f3987c = false;
            if (h()) {
                w();
                g(a.LOAD_IN_PROGRESS);
                this.f3985a.loadInterstitialForBidding(this.f3988d, jSONObject, str, this);
            } else if (this.f3968h == a.NO_INIT) {
                w();
                g(a.INIT_IN_PROGRESS);
                u();
                this.f3985a.initInterstitial(this.f3971l, this.f3972m, this.f3988d, this);
            } else {
                w();
                g(a.LOAD_IN_PROGRESS);
                this.f3985a.loadInterstitial(this.f3988d, jSONObject, this);
            }
        } catch (Throwable th) {
            b("loadInterstitial exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    public final void b() {
        try {
            this.f3985a.showInterstitial(this.f3988d, this);
        } catch (Throwable th) {
            b(n() + "showInterstitial exception : " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.INTERSTITIAL;
    }

    public final String e() {
        return "ProgIsSmash";
    }

    public final void g(a aVar) {
        b("current state=" + this.f3968h + ", new state=" + aVar, 0);
        this.f3968h = aVar;
    }

    public final boolean g() {
        if (this.f3968h != a.LOADED) {
            return false;
        }
        try {
            return this.f3985a.isInterstitialReady(this.f3988d);
        } catch (Throwable th) {
            b("isReadyToShow exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            a((int) IronSourceConstants.TROUBLESHOOTING_IS_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        t("onInterstitialAdClicked");
        this.f3969i.d(this);
    }

    public final void onInterstitialAdClosed() {
        t("onInterstitialAdClosed");
        this.f3969i.b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        t("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f3968h.name());
        v();
        if (this.f3968h == a.LOAD_IN_PROGRESS) {
            g(a.LOAD_FAILED);
            this.f3969i.a(ironSourceError, this, new Date().getTime() - this.f3973n);
        }
    }

    public final void onInterstitialAdOpened() {
        t("onInterstitialAdOpened");
        this.f3969i.a(this);
    }

    public final void onInterstitialAdReady() {
        t("onInterstitialAdReady state=" + this.f3968h.name());
        v();
        if (this.f3968h == a.LOAD_IN_PROGRESS) {
            g(a.LOADED);
            this.f3969i.a(this, new Date().getTime() - this.f3973n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        t("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f3969i.a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        t("onInterstitialAdShowSucceeded");
        this.f3969i.c(this);
    }

    public final void onInterstitialAdVisible() {
        t("onInterstitialAdVisible");
        this.f3969i.e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        t("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f3968h.name());
        if (this.f3968h == a.INIT_IN_PROGRESS) {
            v();
            g(a.NO_INIT);
            this.f3969i.b(ironSourceError, this);
            if (!h()) {
                this.f3969i.a(ironSourceError, this, v0.b() - this.f3973n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        t("onInterstitialInitSuccess state=" + this.f3968h.name());
        if (this.f3968h == a.INIT_IN_PROGRESS) {
            v();
            if (h() || this.f3976q) {
                this.f3976q = false;
                g(a.INIT_SUCCESS);
            } else {
                g(a.LOAD_IN_PROGRESS);
                w();
                try {
                    this.f3985a.loadInterstitial(this.f3988d, this.f3974o, this);
                } catch (Throwable th) {
                    b("onInterstitialInitSuccess exception: " + th.getLocalizedMessage(), 3);
                    th.printStackTrace();
                    onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
                }
            }
            this.f3969i.f(this);
        }
    }

    public final void t(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + n() + " : " + str, 0);
    }

    public final void u() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f3985a.setPluginData(pluginType);
            }
        } catch (Throwable th) {
            b("setCustomParams() " + th.getMessage(), 0);
        }
    }

    public final void v() {
        synchronized (this.f3975p) {
            Timer timer = this.f3970j;
            if (timer != null) {
                timer.cancel();
                this.f3970j = null;
            }
        }
    }

    public final void w() {
        synchronized (this.f3975p) {
            b("start timer", 0);
            v();
            Timer timer = new Timer();
            this.f3970j = timer;
            timer.schedule(new b(), (long) (this.k * 1000));
        }
    }
}
