package com.ironsource.mediationsdk.adunit.d.a;

import android.text.TextUtils;
import androidx.fragment.app.w0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.b.c;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.c.b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class c<Listener extends com.ironsource.mediationsdk.adunit.c.b.c> implements AdapterAdListener, NetworkInitializationListener, com.ironsource.mediationsdk.adunit.b.c, b.a, m.a {

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.d.a f4263c;

    /* renamed from: d  reason: collision with root package name */
    public Listener f4264d;

    /* renamed from: e  reason: collision with root package name */
    public BaseAdAdapter<?, AdapterAdListener> f4265e;

    /* renamed from: f  reason: collision with root package name */
    public d f4266f;

    /* renamed from: g  reason: collision with root package name */
    public a f4267g = a.NONE;

    /* renamed from: h  reason: collision with root package name */
    public Placement f4268h;

    /* renamed from: i  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.a f4269i;

    /* renamed from: j  reason: collision with root package name */
    public JSONObject f4270j;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public AdData f4271l;

    /* renamed from: m  reason: collision with root package name */
    public Long f4272m;

    /* renamed from: n  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.d f4273n;

    /* renamed from: o  reason: collision with root package name */
    public b f4274o = new b(((long) this.f4263c.f4256d) * 1000);

    /* renamed from: p  reason: collision with root package name */
    public final Object f4275p = new Object();

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public c(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        this.f4263c = aVar;
        this.f4264d = listener;
        this.f4266f = new d(aVar.f4253a, d.b.PROVIDER, this);
        this.f4269i = aVar2;
        this.f4270j = aVar2.f4704b;
        this.f4265e = baseAdAdapter;
    }

    public AdData a(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(com.ironsource.mediationsdk.d.c.a(this.f4270j));
        return new AdData(str, hashMap, a(map));
    }

    public Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter baseAdAdapter = this.f4265e;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : str);
            BaseAdAdapter baseAdAdapter2 = this.f4265e;
            if (baseAdAdapter2 != null) {
                str = baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
        } catch (Exception unused) {
            IronLog.INTERNAL.error(c("could not get adapter version for event data" + o()));
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f4269i.f4703a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f4269i.f4703a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(l()));
        boolean z9 = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.k)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.k);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, t());
        JSONObject jSONObject = this.f4263c.f4258f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f4263c.f4258f);
        }
        if (!TextUtils.isEmpty(this.f4263c.f4259g)) {
            hashMap.put("auctionId", this.f4263c.f4259g);
        }
        if (!(bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_OPENED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED || bVar == com.ironsource.mediationsdk.adunit.b.b.SHOW_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED)) {
            z9 = false;
        }
        if (z9) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f4263c.f4260h));
            if (!TextUtils.isEmpty(this.f4263c.f4261i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f4263c.f4261i);
            }
        }
        if (!TextUtils.isEmpty(this.f4263c.f4255c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f4263c.f4255c.getCustomNetwork());
        }
        return hashMap;
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(DataKeys.USER_ID, this.f4263c.f4254b);
        return map;
    }

    public void a() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
        if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) baseAdAdapter).loadAd(this.f4271l, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(c("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public final void a(String str) {
        C0182e.a();
        this.k = C0182e.d(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        r6.f4264d.a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out"), r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state = "
            r1.<init>(r2)
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r6.f4267g
            r1.append(r2)
            java.lang.String r2 = ", isBidder = "
            r1.append(r2)
            boolean r2 = r6.k()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r6.c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.utils.d r0 = r6.f4273n
            long r0 = com.ironsource.mediationsdk.utils.d.a(r0)
            java.lang.String r2 = "time out"
            java.lang.Object r3 = r6.f4275p
            monitor-enter(r3)
            boolean r4 = r6.f()     // Catch:{ all -> 0x007e }
            r5 = 1025(0x401, float:1.436E-42)
            if (r4 == 0) goto L_0x0057
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = com.ironsource.mediationsdk.adunit.d.a.c.a.FAILED     // Catch:{ all -> 0x007e }
            r6.f4267g = r4     // Catch:{ all -> 0x007e }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f4266f     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x004c
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f4159c     // Catch:{ all -> 0x007e }
            r4.a((long) r0, (int) r5)     // Catch:{ all -> 0x007e }
            com.ironsource.mediationsdk.adunit.b.d r4 = r6.f4266f     // Catch:{ all -> 0x007e }
            com.ironsource.mediationsdk.adunit.b.h r4 = r4.f4159c     // Catch:{ all -> 0x007e }
            r4.a((long) r0, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x007e }
        L_0x004c:
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            Listener r0 = r6.f4264d
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r2)
            r0.a(r1, r6)
            return
        L_0x0057:
            java.lang.String r0 = "unexpected timeout for %s, state - %s, error - %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r2 = 0
            java.lang.String r4 = r6.o()     // Catch:{ all -> 0x007e }
            r1[r2] = r4     // Catch:{ all -> 0x007e }
            r2 = 1
            com.ironsource.mediationsdk.adunit.d.a.c$a r4 = r6.f4267g     // Catch:{ all -> 0x007e }
            r1[r2] = r4     // Catch:{ all -> 0x007e }
            r2 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x007e }
            r1[r2] = r4     // Catch:{ all -> 0x007e }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x007e }
            com.ironsource.mediationsdk.adunit.b.d r1 = r6.f4266f     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x007c
            com.ironsource.mediationsdk.adunit.b.j r1 = r1.f4163g     // Catch:{ all -> 0x007e }
            r1.l(r0)     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.a.c.b():void");
    }

    public final void b(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f4266f == null) {
            return;
        }
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            if (e()) {
                this.f4266f.f4159c.c(j10, i10);
            } else {
                this.f4266f.f4159c.b(j10, i10);
            }
        } else if (TextUtils.isEmpty(str)) {
            this.f4266f.f4159c.a(j10, i10);
        } else if (e()) {
            this.f4266f.f4159c.b(j10, i10, str);
        } else {
            this.f4266f.f4159c.a(j10, i10, str);
        }
    }

    public final void b(String str, Map<String, Object> map) {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(c((String) null));
            boolean z9 = false;
            if (e()) {
                this.f4266f.f4159c.a();
            } else {
                this.f4266f.f4159c.a(false);
            }
            this.f4272m = null;
            this.f4273n = new com.ironsource.mediationsdk.utils.d();
            this.f4271l = a(str, map);
            synchronized (this.f4275p) {
                if (this.f4267g != a.NONE) {
                    z9 = true;
                } else {
                    this.f4267g = a.INIT_IN_PROGRESS;
                }
            }
            if (z9) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.f4267g;
                ironLog.error(c(str2));
                this.f4266f.f4163g.n(str2);
                onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f4263c.f4253a), str2);
                return;
            }
            this.f4274o.a(this);
            AdapterBaseInterface networkAdapter = this.f4265e.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f4271l, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + o();
            ironLog.error(c(str3));
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f4263c.f4253a), str3);
        } catch (Throwable th) {
            String str4 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str4));
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4163g.n(str4);
            }
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f4263c.f4253a), str4);
        }
    }

    public boolean b_() {
        return g();
    }

    public final String c(String str) {
        String str2 = this.f4263c.f4253a.name() + " - " + o() + " - state = " + this.f4267g;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return w0.d(str2, " - ", str);
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public final boolean f() {
        a aVar = this.f4267g;
        return aVar == a.INIT_IN_PROGRESS || aVar == a.LOADING;
    }

    public final boolean g() {
        return this.f4267g == a.LOADED;
    }

    public final boolean h() {
        return this.f4267g == a.FAILED;
    }

    public final void i() {
        IronLog.INTERNAL.verbose(c((String) null));
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.a();
        }
    }

    public final Long j() {
        return this.f4272m;
    }

    public final boolean k() {
        return this.f4269i.f4706d;
    }

    public final int l() {
        return this.f4269i.f4708f;
    }

    public final int m() {
        return this.f4269i.f4709g;
    }

    public final String n() {
        return this.f4269i.f4703a.getProviderName();
    }

    public final String o() {
        return String.format("%s %s", new Object[]{n(), Integer.valueOf(hashCode())});
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(c((String) null));
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.c(v());
        }
        this.f4264d.h(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error = "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r7.c(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.c.b r0 = r7.f4274o
            if (r0 == 0) goto L_0x0026
            r0.d()
        L_0x0026:
            com.ironsource.mediationsdk.utils.d r0 = r7.f4273n
            long r5 = com.ironsource.mediationsdk.utils.d.a(r0)
            java.lang.Object r0 = r7.f4275p
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f4267g     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.LOADING     // Catch:{ all -> 0x00d4 }
            if (r1 != r2) goto L_0x004c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.b(r2, r3, r4, r5)     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r8 = com.ironsource.mediationsdk.adunit.d.a.c.a.FAILED     // Catch:{ all -> 0x00d4 }
            r7.f4267g = r8     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            Listener r8 = r7.f4264d
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r0.<init>(r9, r10)
            r8.a(r0, r7)
            return
        L_0x004c:
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.FAILED     // Catch:{ all -> 0x00d4 }
            if (r1 != r2) goto L_0x0059
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.b(r2, r3, r4, r5)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            return
        L_0x0059:
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.d.a.c.a.LOADED     // Catch:{ all -> 0x00d4 }
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != r2) goto L_0x008f
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r1 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED     // Catch:{ all -> 0x00d4 }
            if (r8 != r1) goto L_0x008f
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d4 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00d4 }
            r7.f4272m = r8     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.b.d r8 = r7.f4266f     // Catch:{ all -> 0x00d4 }
            if (r8 == 0) goto L_0x008d
            com.ironsource.mediationsdk.adunit.b.j r8 = r8.f4163g     // Catch:{ all -> 0x00d4 }
            java.lang.String r9 = "ad expired for %s, state = %s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.model.a r1 = r7.f4269i     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.f4703a     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r1.getProviderName()     // Catch:{ all -> 0x00d4 }
            r10[r5] = r1     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r7.f4267g     // Catch:{ all -> 0x00d4 }
            r10[r4] = r1     // Catch:{ all -> 0x00d4 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x00d4 }
            r8.p(r9)     // Catch:{ all -> 0x00d4 }
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            return
        L_0x008f:
            java.lang.String r8 = "unexpected load failed for %s, state - %s, error - %s, %s"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = r7.o()     // Catch:{ all -> 0x00d4 }
            r1[r5] = r2     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = r7.f4267g     // Catch:{ all -> 0x00d4 }
            r1[r4] = r2     // Catch:{ all -> 0x00d4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00d4 }
            r1[r3] = r9     // Catch:{ all -> 0x00d4 }
            r9 = 3
            r1[r9] = r10     // Catch:{ all -> 0x00d4 }
            java.lang.String r8 = java.lang.String.format(r8, r1)     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f4266f     // Catch:{ all -> 0x00d4 }
            if (r9 == 0) goto L_0x00d2
            boolean r9 = r7.e()     // Catch:{ all -> 0x00d4 }
            if (r9 == 0) goto L_0x00bd
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f4266f     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.b.j r9 = r9.f4163g     // Catch:{ all -> 0x00d4 }
            r9.i(r8)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d2
        L_0x00bd:
            com.ironsource.mediationsdk.adunit.d.a r9 = r7.f4263c     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r9 = r9.f4253a     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00d4 }
            if (r9 != r10) goto L_0x00cb
            com.ironsource.mediationsdk.adunit.d.a.c$a r9 = r7.f4267g     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r10 = com.ironsource.mediationsdk.adunit.d.a.c.a.SHOWING     // Catch:{ all -> 0x00d4 }
            if (r9 == r10) goto L_0x00d2
        L_0x00cb:
            com.ironsource.mediationsdk.adunit.b.d r9 = r7.f4266f     // Catch:{ all -> 0x00d4 }
            com.ironsource.mediationsdk.adunit.b.j r9 = r9.f4163g     // Catch:{ all -> 0x00d4 }
            r9.h(r8)     // Catch:{ all -> 0x00d4 }
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            return
        L_0x00d4:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.d.a.c.onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType, int, java.lang.String):void");
    }

    public void onAdLoadSuccess() {
        boolean z9;
        IronLog.INTERNAL.verbose(c((String) null));
        b bVar = this.f4274o;
        if (bVar != null) {
            bVar.d();
        }
        synchronized (this.f4275p) {
            a aVar = this.f4267g;
            z9 = false;
            if (aVar == a.LOADING) {
                long a10 = com.ironsource.mediationsdk.utils.d.a(this.f4273n);
                if (this.f4266f != null) {
                    if (e()) {
                        this.f4266f.f4159c.a(a10);
                    } else {
                        this.f4266f.f4159c.a(a10, false);
                    }
                }
                this.f4267g = a.LOADED;
                z9 = d();
            } else if (aVar != a.FAILED) {
                String format = String.format("unexpected load success for %s, state - %s", new Object[]{o(), this.f4267g});
                if (this.f4266f != null) {
                    if (e()) {
                        this.f4266f.f4163g.g(format);
                    } else {
                        this.f4266f.f4163g.f(format);
                    }
                }
            }
        }
        if (z9) {
            this.f4264d.f(this);
        }
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(c((String) null));
        this.f4267g = a.SHOWING;
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4162f.b(v());
        }
        this.f4264d.g(this);
    }

    public void onInitFailed(int i10, String str) {
        boolean z9;
        IronLog.INTERNAL.verbose(c("error = " + i10 + ", " + str));
        a aVar = this.f4267g;
        if (aVar == a.INIT_IN_PROGRESS) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            b bVar = this.f4274o;
            if (bVar != null) {
                bVar.d();
            }
            this.f4267g = a.FAILED;
            b(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, com.ironsource.mediationsdk.utils.d.a(this.f4273n));
            this.f4264d.a(new IronSourceError(i10, str), this);
        } else if (aVar != a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{o(), this.f4267g, Integer.valueOf(i10), str});
            d dVar = this.f4266f;
            if (dVar != null) {
                dVar.f4163g.c(format);
            }
        }
    }

    public void onInitSuccess() {
        boolean z9;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c((String) null));
        a aVar = this.f4267g;
        if (aVar == a.INIT_IN_PROGRESS) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            b bVar = this.f4274o;
            if (bVar != null) {
                bVar.d();
            }
            this.f4267g = a.READY_TO_LOAD;
            ironLog.verbose(c((String) null));
            this.f4267g = a.LOADING;
            try {
                this.f4274o.a(this);
                a();
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage() + " - state = " + this.f4267g;
                IronLog.INTERNAL.error(c(str));
                d dVar = this.f4266f;
                if (dVar != null) {
                    dVar.f4163g.n(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
            }
        } else if (aVar != a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", new Object[]{o(), this.f4267g});
            d dVar2 = this.f4266f;
            if (dVar2 != null) {
                dVar2.f4163g.b(format);
            }
        }
    }

    public final String p() {
        return this.f4269i.f4703a.getProviderTypeForReflection();
    }

    public final String q() {
        return this.f4263c.f4259g;
    }

    public final IronSource.AD_UNIT r() {
        return this.f4263c.f4253a;
    }

    public final void s() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f4265e;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f4265e = null;
            } catch (Exception e10) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f4269i.f4703a.getProviderName() + " - " + e10.getLocalizedMessage() + " - state = " + this.f4267g;
                IronLog.INTERNAL.error(c(str));
                this.f4266f.f4163g.n(str);
            }
        }
        d dVar = this.f4266f;
        if (dVar != null) {
            dVar.f4157a = null;
            dVar.f4160d = null;
            dVar.f4161e = null;
            dVar.f4158b = null;
            dVar.f4159c = null;
            dVar.f4162f = null;
            dVar.f4163g = null;
            this.f4266f = null;
        }
        b bVar = this.f4274o;
        if (bVar != null) {
            bVar.c();
            this.f4274o = null;
        }
    }

    public final Integer t() {
        com.ironsource.mediationsdk.adunit.d.a aVar = this.f4263c;
        if (aVar != null) {
            return Integer.valueOf(aVar.f4257e);
        }
        return null;
    }

    public final boolean u() {
        return this.f4267g == a.SHOWING;
    }

    public final String v() {
        Placement placement = this.f4268h;
        return placement == null ? "" : placement.getPlacementName();
    }
}
