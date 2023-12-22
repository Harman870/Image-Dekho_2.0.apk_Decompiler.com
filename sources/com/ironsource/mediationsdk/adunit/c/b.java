package com.ironsource.mediationsdk.adunit.c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C0181d;
import com.ironsource.mediationsdk.C0187k;
import com.ironsource.mediationsdk.C0189n;
import com.ironsource.mediationsdk.C0192q;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.c.d;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.j;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b extends d<com.ironsource.mediationsdk.adunit.d.b, AdapterAdViewListener> implements a {
    public boolean H = false;

    /* renamed from: a  reason: collision with root package name */
    public IronSourceBannerLayout f4207a;

    public b(List<NetworkSettings> list, d dVar, String str, c cVar, IronSourceSegment ironSourceSegment, boolean z9) {
        super(new com.ironsource.mediationsdk.adunit.c.a.b(str, list, dVar), cVar, ironSourceSegment, z9);
    }

    public final AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(networkSettings.getBannerSettings(), this.f4231q.a(), str, this.f4207a);
    }

    public final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str) {
        return new com.ironsource.mediationsdk.adunit.d.b(new com.ironsource.mediationsdk.adunit.d.a(IronSource.AD_UNIT.BANNER, this.f4231q.b(), i10, this.f4224i, str, this.f4222g, this.f4223h, networkSettings, this.f4231q.e()), baseAdAdapter, this.f4207a, this.k, this.H, this);
    }

    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        Map<String, Object> a10 = super.a(bVar);
        IronSourceBannerLayout ironSourceBannerLayout = this.f4207a;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            C0189n.a(a10, this.f4207a.getSize());
        }
        if (this.k != null) {
            a10.put("placement", x());
        }
        return a10;
    }

    public final void a(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog.INTERNAL.verbose(b(cVar.o()));
        this.f4235v.e(this.f4217b.a(cVar.q()));
    }

    public final void a(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("mState = " + this.f4232r);
        super.f(cVar);
        if (m(d.a.READY_TO_SHOW, d.a.SHOWING)) {
            this.f4217b.a(cVar);
            C0189n.a(this.f4207a, view, layoutParams);
            this.f4233s.b();
            this.f4235v.a(this.f4217b.a(cVar.q()), this.H);
        }
    }

    public final void b(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog.INTERNAL.verbose(b(cVar.o()));
        this.f4235v.f(this.f4217b.a(cVar.q()));
    }

    public final void c(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog.INTERNAL.verbose(b(cVar.o()));
        this.f4235v.d(this.f4217b.a(cVar.q()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[Catch:{ all -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1 = 0
            java.lang.String r1 = r5.b((java.lang.String) r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r5.f4207a     // Catch:{ all -> 0x00a0 }
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = "mIronSourceBanner is null"
            r0.error(r1)     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.adunit.b.d r0 = r5.u     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.adunit.b.h r0 = r0.f4159c     // Catch:{ all -> 0x00a0 }
            r1 = 622(0x26e, float:8.72E-43)
            r0.b(r1)     // Catch:{ all -> 0x00a0 }
            return
        L_0x001d:
            boolean r1 = r1.isShown()     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0026:
            r0.verbose(r1)     // Catch:{ all -> 0x00a0 }
            r1 = r2
            goto L_0x0052
        L_0x002b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r5.f4207a     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.hasWindowFocus()     // Catch:{ all -> 0x00a0 }
            if (r1 != 0) goto L_0x0036
            java.lang.String r1 = "banner has no window focus"
            goto L_0x0026
        L_0x0036:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ all -> 0x00a0 }
            r1.<init>()     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r5.f4207a     // Catch:{ all -> 0x00a0 }
            boolean r1 = r3.getGlobalVisibleRect(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "visible = "
            r3.<init>(r4)     // Catch:{ all -> 0x00a0 }
            r3.append(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a0 }
            r0.verbose(r3)     // Catch:{ all -> 0x00a0 }
        L_0x0052:
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r5.f4237y     // Catch:{ all -> 0x00a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.adunit.c.d$a r3 = com.ironsource.mediationsdk.adunit.c.d.a.SHOWING     // Catch:{ all -> 0x0089 }
            com.ironsource.mediationsdk.adunit.c.d$a r4 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_LOAD     // Catch:{ all -> 0x0089 }
            boolean r3 = r5.m(r3, r4)     // Catch:{ all -> 0x0089 }
            r4 = 1
            if (r3 == 0) goto L_0x006b
            java.lang.String r2 = "start reload"
            r0.verbose(r2)     // Catch:{ all -> 0x0089 }
            r5.H = r4     // Catch:{ all -> 0x0089 }
            r2 = r4
            goto L_0x007e
        L_0x006b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)     // Catch:{ all -> 0x0089 }
            com.ironsource.mediationsdk.adunit.c.d$a r4 = r5.f4232r     // Catch:{ all -> 0x0089 }
            r3.append(r4)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0089 }
            r0.error(r3)     // Catch:{ all -> 0x0089 }
        L_0x007e:
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x0088
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r5.f4207a     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.model.Placement r1 = r5.k     // Catch:{ all -> 0x00a0 }
            r5.a((com.ironsource.mediationsdk.IronSourceBannerLayout) r0, (com.ironsource.mediationsdk.model.Placement) r1)     // Catch:{ all -> 0x00a0 }
        L_0x0088:
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x008c:
            java.lang.String r1 = "banner is not visible, reload skipped"
            r0.verbose(r1)     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.adunit.b.d r0 = r5.u     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.adunit.b.h r0 = r0.f4159c     // Catch:{ all -> 0x00a0 }
            r1 = 613(0x265, float:8.59E-43)
            r0.b(r1)     // Catch:{ all -> 0x00a0 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r5.f4233s     // Catch:{ all -> 0x00a0 }
            r0.b()     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r0 = move-exception
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.u
            com.ironsource.mediationsdk.adunit.b.j r1 = r1.f4163g
            java.lang.String r0 = r0.getMessage()
            r1.q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.b.d():void");
    }

    public final JSONObject e(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    public final void f(int i10, String str, boolean z9) {
        if (this.H) {
            if (!z9) {
                this.u.f4159c.b(com.ironsource.mediationsdk.utils.d.a(this.f4230p), i10, str);
                C0192q.a().a(this.f4231q.a(), new IronSourceError(i10, str), true);
            }
            if (this.H) {
                h(d.a.SHOWING);
            }
            this.f4233s.b();
            return;
        }
        super.f(i10, str, z9);
    }

    public final void g(Context context, C0187k kVar, d dVar) {
        if (this.f4220e != null) {
            ISBannerSize iSBannerSize = null;
            IronSourceBannerLayout ironSourceBannerLayout = this.f4207a;
            if (!(ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null)) {
                iSBannerSize = this.f4207a.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? C0189n.a() : ISBannerSize.BANNER : this.f4207a.getSize();
            }
            kVar.a(iSBannerSize);
            this.f4220e.a(context, kVar, (C0181d) dVar);
            return;
        }
        IronLog.INTERNAL.error(b("mAuctionHandler is null"));
    }

    public final com.ironsource.mediationsdk.adunit.c.d.a n() {
        return new com.ironsource.mediationsdk.adunit.c.d.b();
    }

    public final boolean p() {
        return this.H;
    }

    public final void r(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
    }

    public final String s() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    public final void t(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
    }

    public final String u() {
        return "BN";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f A[Catch:{ all -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.IronSourceBannerLayout r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x000c
            boolean r2 = r6.isDestroyed()     // Catch:{ all -> 0x008d }
            if (r2 != 0) goto L_0x000c
            r2 = r0
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            if (r2 != 0) goto L_0x0035
            java.lang.String r2 = "can't destroy banner - %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x008d }
            if (r6 != 0) goto L_0x0018
            java.lang.String r6 = "banner is null"
            goto L_0x001a
        L_0x0018:
            java.lang.String r6 = "banner is destroyed"
        L_0x001a:
            r0[r1] = r6     // Catch:{ all -> 0x008d }
            java.lang.String r6 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "destroy banner failed - errorMessage = "
            r1.<init>(r2)     // Catch:{ all -> 0x008d }
            r1.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x008d }
            r0.error(r6)     // Catch:{ all -> 0x008d }
            goto L_0x00bc
        L_0x0035:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "destroying banner"
            r0.verbose(r2)     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.a r0 = r5.f4233s     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.c.a r2 = r0.f4175a     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.c.a$a r2 = r2.f4208a     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.c.a$a r3 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.MANUAL_WITH_AUTOMATIC_RELOAD     // Catch:{ all -> 0x008d }
            if (r2 != r3) goto L_0x004b
            com.ironsource.lifecycle.a.a r0 = r0.f4177c     // Catch:{ all -> 0x008d }
            r0.a()     // Catch:{ all -> 0x008d }
        L_0x004b:
            com.ironsource.mediationsdk.adunit.e.c<Smash> r0 = r5.f4217b     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.d.a.c<?> r0 = r0.f4291c     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.d.b r0 = (com.ironsource.mediationsdk.adunit.d.b) r0     // Catch:{ all -> 0x008d }
            r2 = 0
            if (r0 == 0) goto L_0x007e
            java.lang.Integer r3 = r0.t()     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x0063
            java.lang.Integer r3 = r0.t()     // Catch:{ all -> 0x008d }
            int r3 = r3.intValue()     // Catch:{ all -> 0x008d }
            goto L_0x006f
        L_0x0063:
            com.ironsource.mediationsdk.services.a r3 = r5.C     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.a.a r4 = r5.f4231q     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = r4.a()     // Catch:{ all -> 0x008d }
            int r3 = r3.a(r4)     // Catch:{ all -> 0x008d }
        L_0x006f:
            com.ironsource.mediationsdk.adunit.b.d r4 = r5.u     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f4159c     // Catch:{ all -> 0x008d }
            r4.a((int) r3)     // Catch:{ all -> 0x008d }
            r0.c()     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.e.c<Smash> r0 = r5.f4217b     // Catch:{ all -> 0x008d }
            r0.a((com.ironsource.mediationsdk.adunit.d.a.c<?>) r2)     // Catch:{ all -> 0x008d }
        L_0x007e:
            com.ironsource.mediationsdk.C0189n.b((com.ironsource.mediationsdk.IronSourceBannerLayout) r6)     // Catch:{ all -> 0x008d }
            r5.f4207a = r2     // Catch:{ all -> 0x008d }
            r5.k = r2     // Catch:{ all -> 0x008d }
            r5.H = r1     // Catch:{ all -> 0x008d }
            com.ironsource.mediationsdk.adunit.c.d$a r6 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_LOAD     // Catch:{ all -> 0x008d }
            r5.h((com.ironsource.mediationsdk.adunit.c.d.a) r6)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "destroyBanner - exception = "
            r0.<init>(r1)
            java.lang.String r6 = r6.getLocalizedMessage()
            r0.append(r6)
            java.lang.String r6 = " state = "
            r0.append(r6)
            com.ironsource.mediationsdk.adunit.c.d$a r6 = r5.f4232r
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = r5.b((java.lang.String) r6)
            r0.error(r1)
            com.ironsource.mediationsdk.adunit.b.d r0 = r5.u
            if (r0 == 0) goto L_0x00bc
            com.ironsource.mediationsdk.adunit.b.j r0 = r0.f4163g
            r0.n(r6)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.b.a(com.ironsource.mediationsdk.IronSourceBannerLayout):void");
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + placement);
        boolean z9 = ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
        int i10 = IronSourceError.ERROR_CODE_GENERIC;
        if (!z9) {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        } else if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = placement == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
            i10 = com.ironsource.mediationsdk.adunit.a.a.b(this.f4231q.a());
        } else if (j.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f4231q.a())) {
            str = String.format("placement %s is capped", new Object[]{placement.getPlacementName()});
            i10 = com.ironsource.mediationsdk.adunit.a.a.f(this.f4231q.a());
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            f(i10, str, false);
            return;
        }
        this.f4207a = ironSourceBannerLayout;
        this.k = placement;
        i();
    }
}
