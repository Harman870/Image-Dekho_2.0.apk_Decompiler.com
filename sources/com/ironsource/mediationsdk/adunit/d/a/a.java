package com.ironsource.mediationsdk.adunit.d.a;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.b.j;
import com.ironsource.mediationsdk.adunit.c.b.b;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Locale;

public abstract class a<Listener extends b> extends c<Listener> implements AdapterAdInteractionListener {
    public a(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdAdapter, aVar2, listener);
    }

    public final void a(Activity activity, Placement placement) {
        int i10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("placementName = " + placement.getPlacementName()));
        try {
            this.f4268h = placement;
            this.f4267g = c.a.SHOWING;
            this.f4266f.f4162f.a(activity, v());
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
            if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) baseAdAdapter).showAd(this.f4271l, this);
                return;
            }
            ironLog.error(c("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4163g.n("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            this.f4267g = c.a.FAILED;
            String str = "showAd - exception = " + th.getLocalizedMessage() + " - state = " + this.f4267g;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error(c(str));
            d dVar2 = this.f4266f;
            if (dVar2 != null) {
                dVar2.f4163g.n(str);
            }
            IronSource.AD_UNIT ad_unit = this.f4263c.f4253a;
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i10 = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i10 = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else {
                ironLog2.warning("ad unit not supported - " + ad_unit);
                i10 = IronSourceError.ERROR_CODE_GENERIC;
            }
            onAdShowFailed(i10, str);
        }
    }

    public final void a(boolean z9) {
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.a(z9);
        }
    }

    public final boolean b_() {
        if (this.f4271l == null || !g()) {
            return false;
        }
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
            if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
                return ((AdapterAdFullScreenInterface) baseAdAdapter).isAdAvailable(this.f4271l);
            }
            IronLog.INTERNAL.error(c("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4163g.n("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
            }
            return false;
        } catch (Throwable th) {
            String str = "isReadyToShow - exception = " + th.getLocalizedMessage() + " - state = " + this.f4267g;
            IronLog.INTERNAL.error(c(str));
            d dVar2 = this.f4266f;
            if (dVar2 != null) {
                dVar2.f4163g.n(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        ((com.ironsource.mediationsdk.adunit.c.b.b) r5.f4264d).b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdClosed() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1 = 0
            java.lang.String r1 = r5.c(r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f4275p
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r5.f4267g     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.SHOWING     // Catch:{ all -> 0x008d }
            if (r1 != r2) goto L_0x0066
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = com.ironsource.mediationsdk.adunit.d.a.c.a.NONE     // Catch:{ all -> 0x008d }
            r5.f4267g = r1     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f4266f     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = ""
            com.ironsource.mediationsdk.adunit.d.a r2 = r5.f4263c     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r2.f4253a     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x008d }
            if (r2 != r3) goto L_0x0052
            Listener r1 = r5.f4264d     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.b.b r1 = (com.ironsource.mediationsdk.adunit.c.b.b) r1     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r1.h()     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            java.lang.String r3 = "otherInstanceAvailable = "
            r2.<init>(r3)     // Catch:{ all -> 0x008d }
            int r3 = r1.length()     // Catch:{ all -> 0x008d }
            if (r3 <= 0) goto L_0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            java.lang.String r4 = "true|"
            r3.<init>(r4)     // Catch:{ all -> 0x008d }
            r3.append(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x008d }
            goto L_0x004b
        L_0x0049:
            java.lang.String r1 = "false"
        L_0x004b:
            r2.append(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x008d }
        L_0x0052:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f4266f     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.b.a r2 = r2.f4162f     // Catch:{ all -> 0x008d }
            java.lang.String r3 = r5.v()     // Catch:{ all -> 0x008d }
            r2.a((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x008d }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            Listener r0 = r5.f4264d
            com.ironsource.mediationsdk.adunit.c.b.b r0 = (com.ironsource.mediationsdk.adunit.c.b.b) r0
            r0.b(r5)
            return
        L_0x0066:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f4266f     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x008b
            com.ironsource.mediationsdk.adunit.b.j r1 = r1.f4163g     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            java.lang.String r3 = "unexpected closed for "
            r2.<init>(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r3 = r5.o()     // Catch:{ all -> 0x008d }
            r2.append(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r3 = " - state = "
            r2.append(r3)     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.d.a.c$a r3 = r5.f4267g     // Catch:{ all -> 0x008d }
            r2.append(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008d }
            r1.k(r2)     // Catch:{ all -> 0x008d }
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.a.a.onAdClosed():void");
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(c((String) null));
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.e(v());
        }
        ((b) this.f4264d).d(this);
    }

    public void onAdShowFailed(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i10 + ", " + str));
        if (this.f4267g == c.a.SHOWING) {
            this.f4267g = c.a.FAILED;
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4162f.a(v(), i10, str, "");
            }
            ((b) this.f4264d).a(new IronSourceError(i10, str), (a<?>) this);
            return;
        }
        d dVar2 = this.f4266f;
        if (dVar2 != null) {
            j jVar = dVar2.f4163g;
            String o10 = o();
            c.a aVar = this.f4267g;
            jVar.j(String.format(Locale.ENGLISH, "unexpected show failed for %s, state - %s, error - %d %s", new Object[]{o10, aVar, Integer.valueOf(i10), str}));
        }
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(c((String) null));
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.a(v());
        }
        ((b) this.f4264d).a(this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(c((String) null));
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.d(v());
        }
        ((b) this.f4264d).c(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(c((String) null));
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.f(v());
        }
    }
}
