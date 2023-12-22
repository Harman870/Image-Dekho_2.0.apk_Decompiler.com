package com.ironsource.mediationsdk.adunit.d;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.b.b;
import com.ironsource.mediationsdk.adunit.b.h;
import com.ironsource.mediationsdk.adunit.b.j;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Map;
import x8.f;

public final class d extends c<com.ironsource.mediationsdk.adunit.c.b.c> implements NativeAdListener {

    /* renamed from: a  reason: collision with root package name */
    public AdapterNativeAdData f4286a;

    /* renamed from: b  reason: collision with root package name */
    public AdapterNativeAdViewBinder f4287b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(com.ironsource.mediationsdk.adunit.d.a r5, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> r6, com.ironsource.mediationsdk.model.Placement r7, com.ironsource.mediationsdk.adunit.c.b.c r8) {
        /*
            r4 = this;
            java.lang.String r0 = "adSmashData"
            x8.f.f(r5, r0)
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r5.f4255c
            org.json.JSONObject r2 = r1.getNativeAdSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD
            r0.<init>(r1, r2, r3)
            r4.<init>(r5, r6, r0, r8)
            r4.f4268h = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.d.<init>(com.ironsource.mediationsdk.adunit.d.a, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter, com.ironsource.mediationsdk.model.Placement, com.ironsource.mediationsdk.adunit.c.b.c):void");
    }

    public final Map<String, Object> a(b bVar) {
        f.f(bVar, "event");
        Map<String, Object> a10 = super.a(bVar);
        if (this.f4268h != null) {
            f.e(a10, "data");
            a10.put("placement", v());
        }
        f.e(a10, "data");
        return a10;
    }

    public final void a() {
        j jVar;
        if (!(this.f4265e instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(c("adapter not instance of AdapterNativeAdInterface"));
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
            f.d(baseAdAdapter, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
            AdData adData = this.f4271l;
            f.e(adData, "mCurrentAdData");
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            f.e(currentActiveActivity, "getInstance().currentActiveActivity");
            ((AdapterNativeAdInterface) baseAdAdapter).loadAd(adData, currentActiveActivity, this);
        } else {
            IronLog.INTERNAL.error(c("activity must not be null"));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f4266f;
            if (dVar != null && (jVar = dVar.f4163g) != null) {
                jVar.n("activity must not be null");
            }
        }
    }

    public final void c() {
        h hVar;
        j jVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(o());
        this.f4267g = c.a.NONE;
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
        if (baseAdAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (baseAdAdapter instanceof AdapterNativeAdInterface) {
                f.d(baseAdAdapter, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData adData = this.f4271l;
                f.e(adData, "mCurrentAdData");
                ((AdapterNativeAdInterface) baseAdAdapter).destroyAd(adData);
            } else {
                ironLog.error(c("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f4266f;
            if (!(dVar == null || (jVar = dVar.f4163g) == null)) {
                jVar.n(str);
            }
        }
        com.ironsource.mediationsdk.adunit.b.d dVar2 = this.f4266f;
        if (dVar2 != null && (hVar = dVar2.f4159c) != null) {
            Integer t10 = t();
            f.e(t10, IronSourceConstants.KEY_SESSION_DEPTH);
            hVar.a(t10.intValue());
        }
    }

    public final void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        f.f(adapterNativeAdData, "adapterNativeAdData");
        f.f(adapterNativeAdViewBinder, "nativeAdViewBinder");
        this.f4286a = adapterNativeAdData;
        this.f4287b = adapterNativeAdViewBinder;
        onAdLoadSuccess();
    }

    public final void onAdOpened() {
        j jVar;
        IronLog.INTERNAL.verbose(c((String) null));
        if (g()) {
            super.onAdOpened();
        } else if (this.f4267g != c.a.FAILED) {
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{o(), this.f4267g}, 2));
            f.e(format, "format(format, *args)");
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f4266f;
            if (dVar != null && (jVar = dVar.f4163g) != null) {
                jVar.m(format);
            }
        }
    }
}
