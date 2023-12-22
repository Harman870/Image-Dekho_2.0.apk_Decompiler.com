package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.bidding.c;
import com.ironsource.mediationsdk.c.b;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.events.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.e;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

public final class K extends O implements c, b.a, BannerSmashListener {

    /* renamed from: h  reason: collision with root package name */
    public d f3946h;

    /* renamed from: i  reason: collision with root package name */
    public b f3947i;

    /* renamed from: j  reason: collision with root package name */
    public a f3948j = a.NONE;
    public J k;

    /* renamed from: l  reason: collision with root package name */
    public IronSourceBannerLayout f3949l;

    /* renamed from: m  reason: collision with root package name */
    public String f3950m;

    /* renamed from: n  reason: collision with root package name */
    public JSONObject f3951n;

    /* renamed from: o  reason: collision with root package name */
    public int f3952o;

    /* renamed from: p  reason: collision with root package name */
    public String f3953p;

    /* renamed from: q  reason: collision with root package name */
    public e f3954q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f3955r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.d f3956s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3957t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public JSONObject f3958v;

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public K(d dVar, J j10, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z9) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f3946h = dVar;
        this.f3947i = new b(dVar.f());
        this.k = j10;
        this.f3990f = i10;
        this.f3950m = str;
        this.f3952o = i11;
        this.f3953p = str2;
        this.f3951n = jSONObject;
        this.f3957t = z9;
        this.f3958v = null;
        if (j()) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isBidder = " + h() + ", shouldEarlyInit = " + i());
            this.u = true;
            w();
        }
    }

    public final Map<String, Object> a(AdData adData) {
        AbstractAdapter abstractAdapter;
        JSONObject a10 = adData != null ? com.ironsource.mediationsdk.d.c.a(adData.getAdUnitData()) : null;
        try {
            if (!h() || (abstractAdapter = this.f3985a) == null) {
                return null;
            }
            return abstractAdapter.getBannerBiddingData(this.f3988d, a10);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.f3985a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s());
        a((int) IronSourceConstants.BN_INSTANCE_DESTROY, (Object[][]) null);
        g(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f3985a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f3986b.f4703a.getBannerSettings());
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to destroy banner from " + this.f3985a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
        }
    }

    public final void a(int i10, Object[][] objArr) {
        boolean z9;
        Map<String, Object> q10 = q();
        synchronized (this.f3955r) {
            z9 = this.f3948j == a.DESTROYED;
        }
        if (z9) {
            q10.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f3949l;
            if (ironSourceBannerLayout != null) {
                C0189n.a(q10, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f3950m)) {
            q10.put("auctionId", this.f3950m);
        }
        JSONObject jSONObject = this.f3951n;
        if (jSONObject != null && jSONObject.length() > 0) {
            q10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f3951n);
        }
        e eVar = this.f3954q;
        if (eVar != null) {
            q10.put("placement", eVar.getPlacementName());
        }
        if (i10 == 3005 || i10 == 3002 || i10 == 3012 || i10 == 3015 || i10 == 3008 || i10 == 3305 || i10 == 3300 || i10 == 3306 || i10 == 3307 || i10 == 3302 || i10 == 3303 || i10 == 3304 || i10 == 3009) {
            com.ironsource.mediationsdk.events.e.d();
            com.ironsource.mediationsdk.events.b.a(q10, this.f3952o, this.f3953p);
        }
        q10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f3990f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    q10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error(n() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        com.ironsource.mediationsdk.events.e.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(q10)));
    }

    public final void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObject = null;
        a((int) IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, (Object[][]) null);
        if (adData != null) {
            jSONObject = com.ironsource.mediationsdk.d.c.a(adData.getAdUnitData());
        }
        try {
            this.f3985a.collectBannerBiddingData(this.f3988d, jSONObject, biddingDataCallback);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to collectBannerBiddingData from " + this.f3985a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    public final void b() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (u(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (u(a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.f3948j);
            return;
        }
        t(ironSourceError);
    }

    public final IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.BANNER;
    }

    public final String e() {
        return "ProgBannerSmash";
    }

    public final void f() {
        this.f3947i.c();
        super.f();
    }

    public final void g(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(x() + "state = " + aVar.name());
        synchronized (this.f3955r) {
            this.f3948j = aVar;
        }
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(s());
        a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        J j10 = this.k;
        if (j10 != null) {
            j10.a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(s());
        a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        J j10 = this.k;
        if (j10 != null) {
            j10.d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(x() + "error = " + ironSourceError);
        this.f3947i.d();
        if (u(a.LOADING, a.LOAD_FAILED)) {
            t(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(s());
        this.f3947i.d();
        if (u(a.LOADING, a.LOADED)) {
            a(this.f3957t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.f3956s))}});
            J j10 = this.k;
            if (j10 != null) {
                j10.a(this, view, layoutParams);
                return;
            }
            return;
        }
        a(this.f3957t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(s());
        a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        J j10 = this.k;
        if (j10 != null) {
            j10.b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(s());
        a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        J j10 = this.k;
        if (j10 != null) {
            j10.c(this);
        }
    }

    public final void onBannerAdShown() {
        boolean z9;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s());
        synchronized (this.f3955r) {
            if (this.f3948j == a.LOADED) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        if (z9) {
            a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            J j10 = this.k;
            if (j10 != null) {
                j10.e(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f3948j);
        a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f3948j}, new Object[]{IronSourceConstants.EVENTS_EXT1, n()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(x() + "error = " + ironSourceError);
        this.f3947i.d();
        if (u(a.INIT_IN_PROGRESS, a.NONE)) {
            J j10 = this.k;
            if (j10 != null) {
                j10.a(ironSourceError, this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f3948j);
    }

    public final void onBannerInitSuccess() {
        String str;
        IronLog.INTERNAL.verbose(s());
        if (u(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            boolean z9 = false;
            if (this.u) {
                this.u = false;
            } else if (!h()) {
                IronSourceBannerLayout ironSourceBannerLayout = this.f3949l;
                if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                    z9 = true;
                }
                if (!z9) {
                    if (this.f3949l == null) {
                        str = "banner is null";
                    } else {
                        str = "banner is destroyed";
                    }
                    this.k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, str), this);
                    return;
                }
                v((String) null);
            }
        }
    }

    public final void t(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            a(this.f3957t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.f3956s))}});
        } else {
            a(this.f3957t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.f3956s))}});
        }
        J j10 = this.k;
        if (j10 != null) {
            j10.a(ironSourceError, this);
        }
    }

    public final boolean u(a aVar, a aVar2) {
        boolean z9;
        synchronized (this.f3955r) {
            if (this.f3948j == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(x() + "set state from '" + this.f3948j + "' to '" + aVar2 + "'");
                z9 = true;
                this.f3948j = aVar2;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void v(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s());
        if (u(a.READY_TO_LOAD, a.LOADING)) {
            this.f3956s = new com.ironsource.mediationsdk.utils.d();
            a(this.f3957t ? IronSourceConstants.BN_INSTANCE_RELOAD : IronSourceConstants.BN_INSTANCE_LOAD, (Object[][]) null);
            if (this.f3985a != null) {
                try {
                    if (h()) {
                        this.f3985a.loadBannerForBidding(this.f3988d, this.f3958v, str, this.f3949l, this);
                    } else {
                        this.f3985a.loadBanner(this.f3988d, this.f3958v, this.f3949l, this);
                    }
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("Exception while trying to load banner from " + this.f3985a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                    a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
                }
            }
        } else {
            ironLog.error("wrong state - state = " + this.f3948j);
        }
    }

    public final void w() {
        IronLog.INTERNAL.verbose();
        g(a.INIT_IN_PROGRESS);
        if (this.f3985a != null) {
            try {
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f3985a.setPluginData(pluginType);
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("Exception while trying to set custom params from " + this.f3985a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
                th.printStackTrace();
                a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
        try {
            if (this.f3985a == null) {
                return;
            }
            if (h()) {
                this.f3985a.initBannerForBidding(this.f3946h.a(), this.f3946h.b(), this.f3988d, this);
            } else {
                this.f3985a.initBanners(this.f3946h.a(), this.f3946h.b(), this.f3988d, this);
            }
        } catch (Throwable th2) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to init banner from " + this.f3985a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            th2.printStackTrace();
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th2.getLocalizedMessage()));
            a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th2.getLocalizedMessage()}});
        }
    }

    public final String x() {
        return String.format("%s - ", new Object[]{s()});
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, e eVar, String str, JSONObject jSONObject) {
        IronSourceError ironSourceError;
        J j10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(s());
        this.f3954q = eVar;
        this.f3958v = jSONObject;
        if (!(ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed())) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            j10 = this.k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.f3985a == null) {
            ironLog.verbose("mAdapter is null");
            j10 = this.k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        } else {
            this.f3949l = ironSourceBannerLayout;
            this.f3947i.a(this);
            try {
                if (h()) {
                    v(str);
                    return;
                } else {
                    w();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                return;
            }
        }
        j10.a(ironSourceError, this);
    }
}
