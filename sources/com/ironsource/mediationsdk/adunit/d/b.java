package com.ironsource.mediationsdk.adunit.d;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0189n;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

public final class b extends c<a> implements BannerAdListener {

    /* renamed from: q  reason: collision with root package name */
    public final IronSourceBannerLayout f4284q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f4285r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(com.ironsource.mediationsdk.adunit.d.a r5, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener> r6, com.ironsource.mediationsdk.IronSourceBannerLayout r7, com.ironsource.mediationsdk.model.Placement r8, boolean r9, com.ironsource.mediationsdk.adunit.c.b.a r10) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.model.a r0 = new com.ironsource.mediationsdk.model.a
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r5.f4255c
            org.json.JSONObject r2 = r1.getBannerSettings()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER
            r0.<init>(r1, r2, r3)
            r4.<init>(r5, r6, r0, r10)
            r4.f4284q = r7
            r4.f4268h = r8
            r4.f4285r = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.b.<init>(com.ironsource.mediationsdk.adunit.d.a, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter, com.ironsource.mediationsdk.IronSourceBannerLayout, com.ironsource.mediationsdk.model.Placement, boolean, com.ironsource.mediationsdk.adunit.c.b.a):void");
    }

    public final AdData a(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(com.ironsource.mediationsdk.d.c.a(this.f4270j));
        return new AdData(str, hashMap, a(map));
    }

    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        Map<String, Object> a10 = super.a(bVar);
        IronSourceBannerLayout ironSourceBannerLayout = this.f4284q;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            C0189n.a(a10, this.f4284q.getSize());
        }
        if (this.f4268h != null) {
            a10.put("placement", v());
        }
        return a10;
    }

    public final Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> a10 = super.a(map);
        a aVar = this.f4263c;
        if (!(aVar == null || this.f4284q == null || !TextUtils.isEmpty(aVar.f4255c.getCustomNetwork()))) {
            a10.put(IronSourceConstants.BANNER_LAYOUT, this.f4284q);
        }
        return a10;
    }

    public final void a() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
        if (baseAdAdapter instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) baseAdAdapter).loadAd(this.f4271l, ContextProvider.getInstance().getCurrentActiveActivity(), this.f4284q.getSize(), this);
        } else {
            IronLog.INTERNAL.error(c("adapter not instance of AdapterBannerInterface"));
        }
    }

    public final void c() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(o());
        this.f4267g = c.a.NONE;
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
        if (baseAdAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (baseAdAdapter instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) baseAdAdapter).destroyAd(this.f4271l);
            } else {
                ironLog.error(c("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.f4267g;
            IronLog.INTERNAL.error(c(str));
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4163g.n(str);
            }
        }
        d dVar2 = this.f4266f;
        if (dVar2 != null) {
            dVar2.f4159c.a(t().intValue());
        }
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return this.f4285r;
    }

    public final void onAdLeftApplication() {
        d dVar;
        Placement placement = this.f4268h;
        if (!(placement == null || (dVar = this.f4266f) == null)) {
            dVar.f4162f.g(placement.getPlacementName());
        }
        Listener listener = this.f4264d;
        if (listener != null) {
            ((a) listener).c(this);
        }
    }

    public final void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (g() && (listener = this.f4264d) != null) {
            ((a) listener).a(this, view, layoutParams);
        }
    }

    public final void onAdOpened() {
        IronLog.INTERNAL.verbose(c((String) null));
        if (g()) {
            super.onAdOpened();
        } else if (this.f4267g != c.a.FAILED) {
            String format = String.format("unexpected onAdOpened for %s, state - %s", new Object[]{o(), this.f4267g});
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4163g.m(format);
            }
        }
    }

    public final void onAdScreenDismissed() {
        d dVar;
        Placement placement = this.f4268h;
        if (!(placement == null || (dVar = this.f4266f) == null)) {
            dVar.f4162f.i(placement.getPlacementName());
        }
        Listener listener = this.f4264d;
        if (listener != null) {
            ((a) listener).b(this);
        }
    }

    public final void onAdScreenPresented() {
        d dVar;
        Placement placement = this.f4268h;
        if (!(placement == null || (dVar = this.f4266f) == null)) {
            dVar.f4162f.h(placement.getPlacementName());
        }
        Listener listener = this.f4264d;
        if (listener != null) {
            ((a) listener).a(this);
        }
    }
}
