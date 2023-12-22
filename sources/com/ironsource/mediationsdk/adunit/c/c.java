package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.b.b;
import com.ironsource.mediationsdk.adunit.c.c.a;
import com.ironsource.mediationsdk.adunit.c.d;
import com.ironsource.mediationsdk.adunit.d.a.a;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;

public abstract class c<Smash extends a<?>, Listener extends AdapterAdInteractionListener> extends d<Smash, Listener> implements b {
    public c(com.ironsource.mediationsdk.adunit.c.a.a aVar, com.ironsource.mediationsdk.d.c cVar, IronSourceSegment ironSourceSegment, boolean z9) {
        super(aVar, cVar, ironSourceSegment, z9);
    }

    public static String C(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.j() != null) {
                sb.append(smash.n());
                sb.append(":");
                sb.append(smash.j());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final void D(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash == null || smash2 != smash) {
                smash2.a(false);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(smash2.o() + " - not ready to show"));
            } else {
                smash.a(true);
                return;
            }
        }
    }

    public final void E(String str, IronSourceError ironSourceError) {
        this.u.f4162f.a(x(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f4233s.a();
        com.ironsource.mediationsdk.adunit.c.d.a aVar = this.f4235v;
        com.ironsource.mediationsdk.adunit.e.c<Smash> cVar = this.f4217b;
        aVar.a(ironSourceError, cVar.a(cVar.f4290b));
        if (this.f4231q.h().b()) {
            l(false, false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.ironsource.mediationsdk.adunit.d.a.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.app.Activity r9, com.ironsource.mediationsdk.model.Placement r10) {
        /*
            r8 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state = "
            r1.<init>(r2)
            com.ironsource.mediationsdk.adunit.c.d$a r2 = r8.f4232r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r8.b((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r1 = r8.f4237y
            monitor-enter(r1)
            r8.k = r10     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.b.d r2 = r8.u     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.b.a r2 = r2.f4162f     // Catch:{ all -> 0x012d }
            java.lang.String r3 = r8.x()     // Catch:{ all -> 0x012d }
            r2.a((android.app.Activity) r9, (java.lang.String) r3)     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.d$a r2 = r8.f4232r     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.d$a r3 = com.ironsource.mediationsdk.adunit.c.d.a.SHOWING     // Catch:{ all -> 0x012d }
            r4 = 0
            if (r2 != r3) goto L_0x005f
            java.lang.String r10 = "can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.a.a r5 = r8.f4231q     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r5.a()     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r6 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x012d }
            if (r5 != r6) goto L_0x0041
            r0 = 1022(0x3fe, float:1.432E-42)
            goto L_0x005b
        L_0x0041:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r6 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x012d }
            if (r5 != r6) goto L_0x0048
            r0 = 1036(0x40c, float:1.452E-42)
            goto L_0x005b
        L_0x0048:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            java.lang.String r7 = "ad unit not supported - "
            r6.<init>(r7)     // Catch:{ all -> 0x012d }
            r6.append(r5)     // Catch:{ all -> 0x012d }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x012d }
            r0.warning(r5)     // Catch:{ all -> 0x012d }
            r0 = 510(0x1fe, float:7.15E-43)
        L_0x005b:
            r2.<init>(r0, r10)     // Catch:{ all -> 0x012d }
            goto L_0x00c1
        L_0x005f:
            com.ironsource.mediationsdk.adunit.c.d$a r0 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_SHOW     // Catch:{ all -> 0x012d }
            if (r2 == r0) goto L_0x006d
            java.lang.String r10 = "show called while no ads are available"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012d }
            r0 = 509(0x1fd, float:7.13E-43)
            r2.<init>(r0, r10)     // Catch:{ all -> 0x012d }
            goto L_0x00c1
        L_0x006d:
            if (r10 != 0) goto L_0x0081
            java.lang.String r10 = "empty default placement"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r8.f4231q     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = r0.a()     // Catch:{ all -> 0x012d }
            int r0 = com.ironsource.mediationsdk.adunit.a.a.b(r0)     // Catch:{ all -> 0x012d }
            r2.<init>(r0, r10)     // Catch:{ all -> 0x012d }
            goto L_0x00c1
        L_0x0081:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x012d }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x012d }
            java.lang.String r2 = r10.getPlacementName()     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.a.a r5 = r8.f4231q     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r5.a()     // Catch:{ all -> 0x012d }
            boolean r0 = com.ironsource.mediationsdk.utils.j.a(r0, r2, r5)     // Catch:{ all -> 0x012d }
            if (r0 == 0) goto L_0x00c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            java.lang.String r2 = "placement "
            r0.<init>(r2)     // Catch:{ all -> 0x012d }
            java.lang.String r10 = r10.getPlacementName()     // Catch:{ all -> 0x012d }
            r0.append(r10)     // Catch:{ all -> 0x012d }
            java.lang.String r10 = " is capped"
            r0.append(r10)     // Catch:{ all -> 0x012d }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r8.f4231q     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = r0.a()     // Catch:{ all -> 0x012d }
            int r0 = com.ironsource.mediationsdk.adunit.a.a.f(r0)     // Catch:{ all -> 0x012d }
            r2.<init>(r0, r10)     // Catch:{ all -> 0x012d }
            goto L_0x00c1
        L_0x00c0:
            r2 = r4
        L_0x00c1:
            if (r2 == 0) goto L_0x00d6
            com.ironsource.mediationsdk.logger.IronLog r10 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r2.getErrorMessage()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r8.b((java.lang.String) r0)     // Catch:{ all -> 0x012d }
            r10.error(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r10 = ""
            r8.E(r10, r2)     // Catch:{ all -> 0x012d }
            goto L_0x0113
        L_0x00d6:
            com.ironsource.mediationsdk.adunit.e.c<Smash> r10 = r8.f4217b     // Catch:{ all -> 0x012d }
            java.util.List r10 = r10.a()     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.e.f r0 = new com.ironsource.mediationsdk.adunit.e.f     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.c.a.a r2 = r8.f4231q     // Catch:{ all -> 0x012d }
            r0.<init>(r2)     // Catch:{ all -> 0x012d }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r2 = r8.f4218c     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.adunit.d.a.c r0 = r0.b(r10, r2)     // Catch:{ all -> 0x012d }
            r4 = r0
            com.ironsource.mediationsdk.adunit.d.a.a r4 = (com.ironsource.mediationsdk.adunit.d.a.a) r4     // Catch:{ all -> 0x012d }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r0 = r8.f4218c     // Catch:{ all -> 0x012d }
            java.util.List r0 = com.ironsource.mediationsdk.adunit.e.f.a(r10, r0)     // Catch:{ all -> 0x012d }
            r8.D(r4, r0)     // Catch:{ all -> 0x012d }
            if (r4 == 0) goto L_0x00fe
            r8.h((com.ironsource.mediationsdk.adunit.c.d.a) r3)     // Catch:{ all -> 0x012d }
            r8.v(r4)     // Catch:{ all -> 0x012d }
            goto L_0x0113
        L_0x00fe:
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r8.f4231q     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = r0.a()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012d }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r10 = C(r10)     // Catch:{ all -> 0x012d }
            r8.E(r10, r0)     // Catch:{ all -> 0x012d }
        L_0x0113:
            monitor-exit(r1)     // Catch:{ all -> 0x012d }
            if (r4 == 0) goto L_0x012c
            com.ironsource.mediationsdk.model.Placement r10 = r8.k
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r8.f4231q
            com.ironsource.mediationsdk.adunit.c.c.a r0 = r0.h()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0129
            com.ironsource.mediationsdk.r r0 = r8.f4234t
            r0.a()
        L_0x0129:
            r4.a(r9, r10)
        L_0x012c:
            return
        L_0x012d:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012d }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.c.a(android.app.Activity, com.ironsource.mediationsdk.model.Placement):void");
    }

    public final void a(a<?> aVar) {
        IronLog.INTERNAL.verbose(b(aVar.o()));
        this.f4235v.b(this.f4217b.a(aVar.q()));
    }

    public final void a(IronSourceError ironSourceError, a<?> aVar) {
        com.ironsource.mediationsdk.adunit.a.a aVar2;
        if (this.f4231q.m() && (aVar2 = this.f4218c.get(aVar.n())) != null) {
            com.ironsource.mediationsdk.adunit.e.c<Smash> cVar = this.f4217b;
            cVar.a(cVar.f4290b, aVar2.a(x()));
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(aVar.o() + " - error = " + ironSourceError));
        this.f4219d.put(aVar.n(), h.a.ISAuctionPerformanceFailedToShow);
        h(d.a.READY_TO_LOAD);
        E("", ironSourceError);
    }

    public final void b(a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(aVar.o()));
        if (this.f4232r == d.a.SHOWING) {
            h(d.a.READY_TO_LOAD);
        }
        a aVar2 = this.f4233s;
        if (aVar2.f4175a.f4208a == a.C0048a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            ironLog.verbose();
            aVar2.b(aVar2.f4175a.f4209b);
        }
        this.f4235v.g(this.f4217b.a(aVar.q()));
    }

    public final void c(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(b(aVar.o()));
        this.f4235v.a();
    }

    public final void d(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog.INTERNAL.verbose(b(aVar.o()));
        this.f4235v.b();
    }

    public final boolean g() {
        boolean z9;
        synchronized (this.f4237y) {
            if (this.f4232r == d.a.READY_TO_SHOW) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        if (!z9) {
            return false;
        }
        if (this.f4226l && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        for (Smash b_ : this.f4217b.a()) {
            if (b_.b_()) {
                return true;
            }
        }
        return false;
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        if (this.f4232r == d.a.READY_TO_SHOW) {
            for (Smash smash : this.f4217b.a()) {
                if (smash.g()) {
                    sb.append(smash.n());
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    public final boolean p() {
        return false;
    }
}
