package com.ironsource.mediationsdk.adunit.c;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.fragment.app.v0;
import androidx.fragment.app.w0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.j;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C0179b;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.C0181d;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.mediationsdk.C0184g;
import com.ironsource.mediationsdk.C0187k;
import com.ironsource.mediationsdk.C0192q;
import com.ironsource.mediationsdk.C0193r;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.S;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.c.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.adunit.e.f;
import com.ironsource.mediationsdk.adunit.e.g;
import com.ironsource.mediationsdk.bidding.d;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.l;
import com.ironsource.mediationsdk.utils.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class d<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>, Listener extends AdapterAdListener> implements j, S, com.ironsource.mediationsdk.adunit.b.c, com.ironsource.mediationsdk.adunit.c.b.c, com.ironsource.mediationsdk.adunit.e.d, C0179b, com.ironsource.mediationsdk.bidding.b, C0181d {
    public Boolean A;
    public com.ironsource.mediationsdk.d.c B;
    public final com.ironsource.mediationsdk.services.a C = MediationServices.getProvider().getSessionDepthService();
    public a.C0056a D = MediationServices.getEditor().getSessionDepthServiceEditor();
    public boolean E;
    public com.ironsource.mediationsdk.testSuite.c F;
    public AtomicBoolean G = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.e.c<Smash> f4217b;

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> f4218c;

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap<String, h.a> f4219d;

    /* renamed from: e  reason: collision with root package name */
    public C0183f f4220e;

    /* renamed from: f  reason: collision with root package name */
    public h f4221f;

    /* renamed from: g  reason: collision with root package name */
    public int f4222g;

    /* renamed from: h  reason: collision with root package name */
    public String f4223h = "";

    /* renamed from: i  reason: collision with root package name */
    public JSONObject f4224i;

    /* renamed from: j  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.a.a f4225j;
    public Placement k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4226l = false;

    /* renamed from: m  reason: collision with root package name */
    public NetworkStateReceiver f4227m;

    /* renamed from: n  reason: collision with root package name */
    public m f4228n;

    /* renamed from: o  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.d f4229o;

    /* renamed from: p  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.d f4230p;

    /* renamed from: q  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.c.a.a f4231q;

    /* renamed from: r  reason: collision with root package name */
    public a f4232r;

    /* renamed from: s  reason: collision with root package name */
    public a f4233s;

    /* renamed from: t  reason: collision with root package name */
    public C0193r f4234t;
    public com.ironsource.mediationsdk.adunit.b.d u;

    /* renamed from: v  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.c.d.a f4235v;
    public com.ironsource.mediationsdk.utils.a w;

    /* renamed from: x  reason: collision with root package name */
    public IronSourceSegment f4236x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f4237y = new Object();

    /* renamed from: z  reason: collision with root package name */
    public long f4238z = 0;

    public enum a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public class b extends TimerTask {
        public b() {
        }

        public final void run() {
            d dVar = d.this;
            dVar.getClass();
            IronLog.INTERNAL.verbose(dVar.b((String) null));
            AsyncTask.execute(new t7.b(dVar));
        }
    }

    public class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f4247a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ StringBuilder f4248b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ List f4249c;

        public c(HashMap hashMap, StringBuilder sb, ArrayList arrayList) {
            this.f4247a = hashMap;
            this.f4248b = sb;
            this.f4249c = arrayList;
        }

        public final void a(String str) {
            d.this.u.f4160d.a(str);
            d.this.k(this.f4247a, this.f4249c, this.f4248b.toString());
        }

        public final void a(List<com.ironsource.mediationsdk.utils.j> list, long j10, List<String> list2) {
            d.this.u.f4160d.a(j10);
            for (com.ironsource.mediationsdk.utils.j next : list) {
                NetworkSettings a10 = d.this.f4231q.a(next.b());
                HashMap d10 = d.this.d(C0180c.a().a(a10, d.this.f4231q.a()), a10);
                if (next.c() != null) {
                    this.f4247a.put(next.b(), next.c());
                    StringBuilder sb = this.f4248b;
                    sb.append(next.a());
                    sb.append(next.b());
                    sb.append(",");
                    d.this.u.f4160d.a(d10, next.d());
                } else {
                    d.this.u.f4160d.a(d10, next.d(), next.e());
                }
            }
            for (String a11 : list2) {
                NetworkSettings a12 = d.this.f4231q.a(a11);
                d.this.u.f4160d.b(d.this.d(C0180c.a().a(a12, d.this.f4231q.a()), a12), j10);
            }
            d.this.k(this.f4247a, this.f4249c, this.f4248b.toString());
        }
    }

    public d(com.ironsource.mediationsdk.adunit.c.a.a aVar, com.ironsource.mediationsdk.d.c cVar, IronSourceSegment ironSourceSegment, boolean z9) {
        boolean z10;
        IronLog.INTERNAL.verbose("adUnit = " + aVar.a() + ", loading mode = " + aVar.h().f4208a);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.a());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.sendAutomationLog(sb.toString());
        com.ironsource.mediationsdk.utils.d dVar = new com.ironsource.mediationsdk.utils.d();
        this.f4236x = ironSourceSegment;
        this.f4231q = aVar;
        this.u = new com.ironsource.mediationsdk.adunit.b.d(aVar.a(), d.b.MEDIATION, this);
        this.f4235v = n();
        this.f4233s = new a(this.f4231q.h(), this);
        h(a.NONE);
        this.B = cVar;
        this.f4217b = new com.ironsource.mediationsdk.adunit.e.c<>(this.f4231q.d().k, this.f4231q.d().f4979e, this);
        this.u.f4158b.a(s(), this.f4231q.h().f4208a.toString());
        this.f4218c = new ConcurrentHashMap<>();
        this.f4219d = new ConcurrentHashMap<>();
        this.k = null;
        w();
        this.f4224i = new JSONObject();
        if (this.f4231q.m()) {
            this.f4220e = new C0183f(new C0184g(this.f4231q.d(), z9, IronSourceUtils.getSessionId()));
        }
        this.f4221f = new h(this.f4231q.c(), this.f4231q.d().f4978d);
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : this.f4231q.c()) {
            arrayList.add(new l(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f4231q.a())));
        }
        this.f4228n = new m(arrayList);
        IronLog.INTERNAL.verbose(b((String) null));
        ArrayList arrayList2 = new ArrayList();
        for (NetworkSettings next2 : this.f4231q.c()) {
            if (com.ironsource.mediationsdk.adunit.e.c.a(C0180c.a().a(next2, this.f4231q.a()), this.f4231q.a(), next2.getProviderInstanceName()) || (!next2.shouldEarlyInit() && !next2.isIronSource() && !next2.isBidder(this.f4231q.a()))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new t7.a(this, next2));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f4231q.k(), this.f4231q.l(), arrayList2);
        this.f4229o = new com.ironsource.mediationsdk.utils.d();
        h(a.READY_TO_LOAD);
        this.f4234t = new C0193r(aVar.g(), this);
        this.w = new com.ironsource.mediationsdk.utils.a();
        this.u.f4158b.a(com.ironsource.mediationsdk.utils.d.a(dVar));
        if (this.f4231q.h().b()) {
            IronLog.INTERNAL.verbose("first automatic load");
            i();
        }
    }

    private void a(Smash smash) {
        IronLog.INTERNAL.verbose(b((String) null));
        com.ironsource.mediationsdk.adunit.a.a o10 = o(smash);
        if (o10 != null) {
            String b10 = o10.b();
            Map<String, Object> a10 = com.ironsource.mediationsdk.d.c.a(o10.c());
            a10.put("adUnit", this.f4231q.a());
            smash.a(b10);
            smash.b(b10, a10);
            return;
        }
        String str = "loadSmash - missing auctionResponseItem for " + smash.n() + " state = " + this.f4232r;
        com.ironsource.mediationsdk.adunit.b.d dVar = this.u;
        if (dVar != null) {
            dVar.f4163g.n(str);
        }
    }

    private void b(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        com.ironsource.mediationsdk.adunit.a.a o10;
        if (this.f4231q.m() && (o10 = o(cVar)) != null) {
            com.ironsource.mediationsdk.adunit.e.c<Smash> cVar2 = this.f4217b;
            cVar2.a(cVar2.f4290b, o10.a(x()));
        }
    }

    private void z() {
        IronLog.INTERNAL.verbose(b((String) null));
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings next : this.f4231q.c()) {
            if (!next.isBidder(this.f4231q.a()) && q(next)) {
                l lVar = new l(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f4231q.a()));
                if (!this.f4228n.b(lVar)) {
                    copyOnWriteArrayList.add(new com.ironsource.mediationsdk.adunit.a.a(lVar.n()));
                }
            }
        }
        c("fallback_" + System.currentTimeMillis(), copyOnWriteArrayList);
    }

    public final void A() {
        IronLog.INTERNAL.verbose();
        g<Smash> c10 = new f(this.f4231q).c(this.f4217b.a(), this.f4218c);
        if (c10.a()) {
            f(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        for (Smash a10 : c10.c()) {
            a(a10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r4 <= 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        new java.util.Timer().schedule(new com.ironsource.mediationsdk.adunit.c.d.b(r6), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0.verbose(b((java.lang.String) null));
        android.os.AsyncTask.execute(new t7.b(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r6.G.set(false);
        r4 = r6.f4231q.d().f4981g - com.ironsource.mediationsdk.utils.d.a(r6.f4229o);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1 = 0
            java.lang.String r2 = r6.b((java.lang.String) r1)
            r0.verbose(r2)
            java.lang.Object r2 = r6.f4237y
            monitor-enter(r2)
            com.ironsource.mediationsdk.adunit.c.d$a r3 = r6.f4232r     // Catch:{ all -> 0x0052 }
            com.ironsource.mediationsdk.adunit.c.d$a r4 = com.ironsource.mediationsdk.adunit.c.d.a.AUCTION     // Catch:{ all -> 0x0052 }
            if (r3 != r4) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            return
        L_0x0015:
            r6.h((com.ironsource.mediationsdk.adunit.c.d.a) r4)     // Catch:{ all -> 0x0052 }
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.G
            r3 = 0
            r2.set(r3)
            com.ironsource.mediationsdk.utils.d r2 = r6.f4229o
            long r2 = com.ironsource.mediationsdk.utils.d.a(r2)
            com.ironsource.mediationsdk.adunit.c.a.a r4 = r6.f4231q
            com.ironsource.mediationsdk.utils.c r4 = r4.d()
            long r4 = r4.f4981g
            long r4 = r4 - r2
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0042
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ironsource.mediationsdk.adunit.c.d$b r1 = new com.ironsource.mediationsdk.adunit.c.d$b
            r1.<init>()
            r0.schedule(r1, r4)
            return
        L_0x0042:
            java.lang.String r1 = r6.b((java.lang.String) r1)
            r0.verbose(r1)
            t7.b r0 = new t7.b
            r0.<init>(r6)
            android.os.AsyncTask.execute(r0)
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.d.B():void");
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(e(networkSettings), this.f4231q.a(), str);
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str);

    public Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap c10 = v0.c(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z9 = true;
        c10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f4224i;
        if (jSONObject != null && jSONObject.length() > 0) {
            c10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f4224i);
        }
        c10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.C.a(this.f4231q.a())));
        if (bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON || bVar == com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS || bVar == com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED) {
            c10.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f4222g));
            if (!TextUtils.isEmpty(this.f4223h)) {
                c10.put(IronSourceConstants.AUCTION_FALLBACK, this.f4223h);
            }
        }
        if (bVar == com.ironsource.mediationsdk.adunit.b.b.INIT_STARTED || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST || bVar == com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST_WATERFALL || bVar == com.ironsource.mediationsdk.adunit.b.b.COLLECT_TOKEN || bVar == com.ironsource.mediationsdk.adunit.b.b.COLLECT_TOKENS_COMPLETED || bVar == com.ironsource.mediationsdk.adunit.b.b.COLLECT_TOKENS_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN || bVar == com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN_SUCCESS || bVar == com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.INSTANCE_COLLECT_TOKEN_TIMED_OUT) {
            z9 = false;
        }
        if (z9 && !TextUtils.isEmpty(this.f4217b.f4290b)) {
            c10.put("auctionId", this.f4217b.f4290b);
        }
        return c10;
    }

    public final void a() {
        if (this.f4231q.h().b()) {
            h(a.READY_TO_LOAD);
            l(false, true);
            i();
        }
    }

    public final void a(int i10) {
        com.ironsource.mediationsdk.adunit.b.j jVar = this.u.f4163g;
        jVar.o("waterfalls hold too many with size = " + i10);
    }

    public final void a(Context context, boolean z9) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("track = " + z9));
        try {
            this.f4226l = z9;
            if (z9) {
                if (this.f4227m == null) {
                    this.f4227m = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f4227m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f4227m != null) {
                context.getApplicationContext().unregisterReceiver(this.f4227m);
            }
        } catch (Exception e10) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f4236x = ironSourceSegment;
    }

    public final void a(com.ironsource.mediationsdk.testSuite.c cVar) {
        this.F = cVar;
        this.E = cVar != null;
        this.A = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (g() != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r3.A.booleanValue() != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f4226l
            if (r0 == 0) goto L_0x004a
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r3.f4231q
            com.ironsource.mediationsdk.adunit.c.c.a r0 = r0.h()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.A
            r1 = 0
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r2 = r1
            goto L_0x0045
        L_0x002b:
            r2 = 1
            if (r4 == 0) goto L_0x003b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003b
            boolean r0 = r3.g()
            if (r0 == 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            if (r4 != 0) goto L_0x0029
            java.lang.Boolean r0 = r3.A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0029
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r3.l(r4, r1)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.d.a(boolean):void");
    }

    public final String b(String str) {
        String name = this.f4231q.a().name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return w0.d(name, " - ", str);
    }

    public final void b(NetworkSettings networkSettings) {
        AdapterBaseInterface a10 = C0180c.a().a(networkSettings, this.f4231q.a());
        if (a10 != null) {
            this.u.f4160d.a((Map<String, Object>) d(a10, networkSettings));
        }
    }

    public final String c(String str, List list) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f4218c.clear();
        this.f4219d.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.ironsource.mediationsdk.adunit.a.a aVar = (com.ironsource.mediationsdk.adunit.a.a) list.get(i10);
            NetworkSettings a10 = this.f4231q.a(aVar.a());
            com.ironsource.mediationsdk.adunit.d.a.c cVar = null;
            if (a10 != null) {
                C0180c.a().a(a10, this.f4231q.a());
                BaseAdAdapter<?, ?> b10 = C0180c.a().b(a10, this.f4231q.a());
                if (b10 == null) {
                    b10 = null;
                }
                if (b10 != null) {
                    cVar = a(a10, b10, this.C.a(this.f4231q.a()), str);
                    this.f4218c.put(cVar.n(), aVar);
                    this.f4219d.put(aVar.a(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a10.getProviderInstanceName()));
                }
            } else {
                String str2 = "could not find matching provider settings for auction response item - item = " + aVar.a() + " state = " + this.f4232r;
                IronLog.INTERNAL.error(b(str2));
                this.u.f4163g.a(str2);
            }
            if (cVar != null) {
                copyOnWriteArrayList.add(cVar);
                sb.append(String.format("%s%s", new Object[]{Integer.valueOf(cVar.l()), aVar.a()}));
            }
            if (i10 != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f4217b.a(this.f4231q.h().f4208a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + sb));
        return sb.toString();
    }

    public final HashMap d(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f4231q.a())));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.logException(ironSourceTag, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
        }
        return hashMap;
    }

    public void d() {
        IronLog.INTERNAL.verbose(b((String) null));
        i();
    }

    public abstract JSONObject e(NetworkSettings networkSettings);

    public void f(int i10, String str, boolean z9) {
        h(a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f4231q.h().a()) {
            if (!z9) {
                this.u.f4159c.a(com.ironsource.mediationsdk.utils.d.a(this.f4230p), i10, str);
            }
            j(new IronSourceError(i10, str), false);
        } else {
            if (!z9) {
                this.u.f4163g.a(i10, str);
            }
            l(false, false);
        }
        a aVar = this.f4233s;
        if (aVar.f4175a.b()) {
            ironLog.verbose();
            aVar.b(aVar.f4175a.f4210c);
        }
    }

    public final void f(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        boolean z9;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(cVar.o()));
        if (!cVar.q().equals(this.f4217b.f4290b)) {
            String str = "invoked from " + cVar.n() + " with state = " + this.f4232r + " auctionId: " + cVar.q() + " and the current id is " + this.f4217b.f4290b;
            ironLog.verbose(str);
            this.u.f4163g.f(str);
            return;
        }
        List<Smash> a10 = this.f4217b.a();
        f fVar = new f(this.f4231q);
        boolean a11 = fVar.a(cVar, a10, this.f4218c);
        synchronized (this.f4237y) {
            if (a11) {
                try {
                    synchronized (this.f4237y) {
                        a aVar = this.f4232r;
                        if (aVar != a.LOADING) {
                            if (aVar != a.READY_TO_SHOW) {
                                z9 = false;
                            }
                        }
                        z9 = true;
                    }
                    if (z9) {
                        v(cVar);
                        b(cVar);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (fVar.a(a10)) {
                com.ironsource.mediationsdk.adunit.d.a.c b10 = fVar.b(a10, this.f4218c);
                v(b10);
                b((com.ironsource.mediationsdk.adunit.d.a.c<?>) b10);
            }
        }
        this.f4219d.put(cVar.n(), h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (m(a.LOADING, a.READY_TO_SHOW)) {
            long a12 = com.ironsource.mediationsdk.utils.d.a(this.f4230p);
            if (p()) {
                this.u.f4159c.a(a12);
            } else {
                this.u.f4159c.a(a12, y());
            }
            if (this.f4231q.h().b()) {
                this.f4234t.a(0);
            }
            t(cVar);
        }
    }

    public void g(Context context, C0187k kVar, d dVar) {
        C0183f fVar = this.f4220e;
        if (fVar != null) {
            fVar.a(context, kVar, (C0181d) dVar);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public final void g(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        ImpressionData a10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(cVar.o()));
        this.u.f4162f.b(x());
        this.f4217b.a(cVar);
        this.f4228n.a(cVar);
        if (this.f4228n.b(cVar)) {
            ironLog.verbose(b(cVar.n() + " was session capped"));
            cVar.i();
            IronSourceUtils.sendAutomationLog(cVar.n() + " was session capped");
        }
        com.ironsource.mediationsdk.utils.j.b(ContextProvider.getInstance().getApplicationContext(), x(), this.f4231q.a());
        if (com.ironsource.mediationsdk.utils.j.a(ContextProvider.getInstance().getApplicationContext(), x(), this.f4231q.a())) {
            ironLog.verbose(b("placement " + x() + " is capped"));
            this.u.f4162f.j(x());
        }
        this.D.b(this.f4231q.a());
        if (this.f4231q.m()) {
            com.ironsource.mediationsdk.adunit.a.a o10 = o(cVar);
            if (o10 != null) {
                b(cVar);
                C0183f.a(o10, cVar.l(), this.f4225j, x());
                this.f4219d.put(cVar.n(), h.a.ISAuctionPerformanceShowedSuccessfully);
                if ((!(this instanceof g)) && (a10 = o10.a(x())) != null) {
                    Iterator it = new HashSet(this.B.b()).iterator();
                    while (it.hasNext()) {
                        ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                        IronLog ironLog2 = IronLog.CALLBACK;
                        ironLog2.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a10));
                        impressionDataListener.onImpressionSuccess(a10);
                    }
                }
            } else {
                String n2 = cVar.n();
                String j10 = com.ironsource.adapters.ironsource.a.j("showing instance missing from waterfall - ", n2);
                ironLog.verbose(b(j10));
                this.u.f4163g.a(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, j10, n2);
            }
        }
        r(cVar);
        if (this.f4231q.h().b()) {
            l(false, false);
        }
        a aVar = this.f4233s;
        if (aVar.f4175a.f4208a == a.C0048a.AUTOMATIC_LOAD_WHILE_SHOW) {
            IronLog.INTERNAL.verbose();
            aVar.b(aVar.f4175a.f4209b);
        }
    }

    public boolean g() {
        return false;
    }

    public final void h(a aVar) {
        synchronized (this.f4237y) {
            this.f4232r = aVar;
        }
    }

    public final void h(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog.INTERNAL.verbose(b(cVar.o()));
        this.u.f4162f.c(x());
        this.f4235v.a(this.k, this.f4217b.a(cVar.q()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0110, code lost:
        if (r7.f4231q.m() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0112, code lost:
        r0.verbose(b("auction disabled"));
        z();
        A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1 = 0
            java.lang.String r2 = r7.b((java.lang.String) r1)
            r0.verbose(r2)
            java.lang.Object r2 = r7.f4237y
            monitor-enter(r2)
            com.ironsource.mediationsdk.adunit.c.a.a r3 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a r3 = r3.h()     // Catch:{ all -> 0x0122 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0122 }
            r4 = 0
            if (r3 == 0) goto L_0x003a
            com.ironsource.mediationsdk.utils.m r3 = r7.f4228n     // Catch:{ all -> 0x0122 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x003a
            java.lang.String r1 = "all smashes are capped"
            java.lang.String r3 = r7.b((java.lang.String) r1)     // Catch:{ all -> 0x0122 }
            r0.verbose(r3)     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = r0.a()     // Catch:{ all -> 0x0122 }
            int r0 = com.ironsource.mediationsdk.adunit.a.a.e(r0)     // Catch:{ all -> 0x0122 }
            r7.f(r0, r1, r4)     // Catch:{ all -> 0x0122 }
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            return
        L_0x003a:
            com.ironsource.mediationsdk.adunit.c.a.a r3 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a r3 = r3.h()     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a$a r3 = r3.f4208a     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a$a r5 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0122 }
            if (r3 == r5) goto L_0x0081
            com.ironsource.mediationsdk.adunit.c.d$a r3 = r7.f4232r     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.d$a r6 = com.ironsource.mediationsdk.adunit.c.d.a.SHOWING     // Catch:{ all -> 0x0122 }
            if (r3 != r6) goto L_0x0081
            java.lang.String r0 = "load cannot be invoked while showing an ad"
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r7.b((java.lang.String) r0)     // Catch:{ all -> 0x0122 }
            r3.error(r5)     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r5 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r5.a()     // Catch:{ all -> 0x0122 }
            int r5 = com.ironsource.mediationsdk.adunit.a.a.c(r5)     // Catch:{ all -> 0x0122 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a r0 = r0.h()     // Catch:{ all -> 0x0122 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x007a
            boolean r0 = r7.p()     // Catch:{ all -> 0x0122 }
            r7.j(r3, r0)     // Catch:{ all -> 0x0122 }
            goto L_0x007f
        L_0x007a:
            com.ironsource.mediationsdk.adunit.c.d.a r0 = r7.f4235v     // Catch:{ all -> 0x0122 }
            r0.a((boolean) r4, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ all -> 0x0122 }
        L_0x007f:
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            return
        L_0x0081:
            com.ironsource.mediationsdk.adunit.c.a.a r1 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a r1 = r1.h()     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.c.a$a r1 = r1.f4208a     // Catch:{ all -> 0x0122 }
            if (r1 == r5) goto L_0x00b2
            com.ironsource.mediationsdk.adunit.c.d$a r1 = r7.f4232r     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.d$a r3 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_LOAD     // Catch:{ all -> 0x0122 }
            if (r1 == r3) goto L_0x0095
            com.ironsource.mediationsdk.adunit.c.d$a r3 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_SHOW     // Catch:{ all -> 0x0122 }
            if (r1 != r3) goto L_0x00a5
        L_0x0095:
            com.ironsource.mediationsdk.q r1 = com.ironsource.mediationsdk.C0192q.a()     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r3 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.a()     // Catch:{ all -> 0x0122 }
            boolean r1 = r1.a(r3)     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x00b2
        L_0x00a5:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "load is already in progress"
            java.lang.String r1 = r7.b((java.lang.String) r1)     // Catch:{ all -> 0x0122 }
            r0.error(r1)     // Catch:{ all -> 0x0122 }
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            return
        L_0x00b2:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            r7.f4224i = r1     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.utils.a r1 = r7.w     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r3 = r7.f4231q     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.a()     // Catch:{ all -> 0x0122 }
            r1.a(r3, r4)     // Catch:{ all -> 0x0122 }
            boolean r1 = r7.p()     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x00d2
            com.ironsource.mediationsdk.adunit.b.d r1 = r7.u     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.b.h r1 = r1.f4159c     // Catch:{ all -> 0x0122 }
            r1.a()     // Catch:{ all -> 0x0122 }
            goto L_0x00dd
        L_0x00d2:
            com.ironsource.mediationsdk.adunit.b.d r1 = r7.u     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.b.h r1 = r1.f4159c     // Catch:{ all -> 0x0122 }
            boolean r3 = r7.y()     // Catch:{ all -> 0x0122 }
            r1.a((boolean) r3)     // Catch:{ all -> 0x0122 }
        L_0x00dd:
            com.ironsource.mediationsdk.utils.d r1 = new com.ironsource.mediationsdk.utils.d     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            r7.f4230p = r1     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = r7.f4231q     // Catch:{ all -> 0x0122 }
            boolean r1 = r1.m()     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0104
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r1 = r7.f4219d     // Catch:{ all -> 0x0122 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x0100
            com.ironsource.mediationsdk.h r1 = r7.f4221f     // Catch:{ all -> 0x0122 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r3 = r7.f4219d     // Catch:{ all -> 0x0122 }
            r1.a((java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h.a>) r3)     // Catch:{ all -> 0x0122 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r1 = r7.f4219d     // Catch:{ all -> 0x0122 }
            r1.clear()     // Catch:{ all -> 0x0122 }
        L_0x0100:
            r7.B()     // Catch:{ all -> 0x0122 }
            goto L_0x0109
        L_0x0104:
            com.ironsource.mediationsdk.adunit.c.d$a r1 = com.ironsource.mediationsdk.adunit.c.d.a.LOADING     // Catch:{ all -> 0x0122 }
            r7.h((com.ironsource.mediationsdk.adunit.c.d.a) r1)     // Catch:{ all -> 0x0122 }
        L_0x0109:
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = r7.f4231q
            boolean r1 = r1.m()
            if (r1 != 0) goto L_0x0121
            java.lang.String r1 = "auction disabled"
            java.lang.String r1 = r7.b((java.lang.String) r1)
            r0.verbose(r1)
            r7.z()
            r7.A()
        L_0x0121:
            return
        L_0x0122:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.d.i():void");
    }

    public void i(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar, AdInfo adInfo) {
        this.f4235v.a(adInfo);
    }

    public void j(IronSourceError ironSourceError, boolean z9) {
        C0192q.a().a(this.f4231q.a(), ironSourceError, z9);
    }

    public final void k(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z9 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.u.f4161e.a(0, 1005, "No candidates available for auctioning");
            f(com.ironsource.mediationsdk.adunit.a.a.d(this.f4231q.a()), "no available ad to load", false);
            return;
        }
        this.u.f4161e.a(str);
        if (this.f4220e != null) {
            int a10 = this.C.a(this.f4231q.a());
            C0187k kVar = new C0187k(this.f4231q.a());
            kVar.b(IronSourceUtils.isEncryptedResponse());
            kVar.a(map);
            kVar.a(list);
            kVar.a(this.f4221f);
            kVar.a(a10);
            kVar.a(this.f4236x);
            kVar.d(this.E);
            com.ironsource.mediationsdk.testSuite.c cVar = this.F;
            if (cVar != null && cVar.a()) {
                z9 = true;
            }
            kVar.e(z9);
            g(ContextProvider.getInstance().getApplicationContext(), kVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    public final void l(boolean z9, boolean z10) {
        synchronized (this.f4237y) {
            Boolean bool = this.A;
            if (bool == null || bool.booleanValue() != z9) {
                this.A = Boolean.valueOf(z9);
                long j10 = 0;
                if (this.f4238z != 0) {
                    j10 = new Date().getTime() - this.f4238z;
                }
                this.f4238z = new Date().getTime();
                this.u.f4159c.a(z9, j10, z10);
                com.ironsource.mediationsdk.adunit.c.d.a aVar = this.f4235v;
                com.ironsource.mediationsdk.adunit.e.c<Smash> cVar = this.f4217b;
                aVar.a(z9, cVar.a(cVar.f4290b));
            }
        }
    }

    public final boolean m(a aVar, a aVar2) {
        boolean z9;
        synchronized (this.f4237y) {
            if (this.f4232r == aVar) {
                z9 = true;
                this.f4232r = aVar2;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public abstract com.ironsource.mediationsdk.adunit.c.d.a n();

    public final com.ironsource.mediationsdk.adunit.a.a o(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        return this.f4218c.get(cVar.n());
    }

    public final void o() {
        for (NetworkSettings a10 : this.f4231q.c()) {
            C0180c.a().a(a10, this.f4231q.a());
        }
    }

    public abstract boolean p();

    public final boolean q(NetworkSettings networkSettings) {
        AdapterBaseInterface a10 = C0180c.a().a(networkSettings, this.f4231q.a());
        if (a10 instanceof AdapterSettingsInterface) {
            return this.f4217b.a(this.f4231q.h().f4208a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a10).getLoadWhileShowSupportedState(networkSettings), a10, this.f4231q.a());
        }
        return false;
    }

    public void r(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        this.f4235v.c(this.f4217b.a(cVar.q()));
    }

    /* access modifiers changed from: package-private */
    public abstract String s();

    public void t(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        if (this.f4231q.h().a()) {
            i(cVar, this.f4217b.a(cVar.q()));
        } else {
            l(true, false);
        }
    }

    public abstract String u();

    public final void v(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        if (this.f4231q.m() && this.G.compareAndSet(false, true)) {
            com.ironsource.mediationsdk.adunit.a.a o10 = o(cVar);
            if (o10 != null) {
                C0183f.a(o10, cVar.l(), this.f4225j);
                ArrayList arrayList = new ArrayList();
                for (Smash n2 : this.f4217b.a()) {
                    arrayList.add(n2.n());
                }
                C0183f.a((ArrayList<String>) arrayList, this.f4218c, cVar.l(), this.f4225j, o10);
                return;
            }
            String n10 = cVar.n();
            String j10 = com.ironsource.adapters.ironsource.a.j("winner instance missing from waterfall - ", n10);
            IronLog.INTERNAL.verbose(b(j10));
            this.u.f4163g.a(1010, j10, n10);
        }
    }

    public void w() {
        C0192q.a().a(this.f4231q.a(), this.f4231q.f());
    }

    public final String x() {
        Placement placement = this.k;
        return placement == null ? "" : placement.getPlacementName();
    }

    public boolean y() {
        return false;
    }

    public final void a(int i10, String str, int i11, String str2, long j10) {
        boolean z9;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b((String) null));
        synchronized (this.f4237y) {
            z9 = this.f4232r == a.AUCTION;
        }
        if (z9) {
            String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.sendAutomationLog(u() + ": " + str3);
            this.f4222g = i11;
            this.f4223h = str2;
            this.f4224i = new JSONObject();
            z();
            this.u.f4161e.a(j10, i10, str);
            h(a.LOADING);
            A();
            return;
        }
        this.u.f4163g.e("unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f4232r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r7 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        r8 = r6.f4237y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        if (r7.b() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        r0 = r6.f4237y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009f, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r1 = r6.f4232r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        if (r1 == r2) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a6, code lost:
        if (r1 != com.ironsource.mediationsdk.adunit.c.d.a.f4243e) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ab, code lost:
        if (r3 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0 = new com.ironsource.mediationsdk.adunit.e.f(r6.f4231q).b(r6.f4217b.a(), r6.f4218c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c0, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c2, code lost:
        v(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c9, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cb, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cc, code lost:
        r7 = r7.c().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d8, code lost:
        if (r7.hasNext() == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00da, code lost:
        a((com.ironsource.mediationsdk.adunit.d.a.c) r7.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e6, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r7, com.ironsource.mediationsdk.adunit.d.a.c<?> r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4237y
            monitor-enter(r0)
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r2.<init>()     // Catch:{ all -> 0x012a }
            java.lang.String r3 = r8.o()     // Catch:{ all -> 0x012a }
            r2.append(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = " - error = "
            r2.append(r3)     // Catch:{ all -> 0x012a }
            r2.append(r7)     // Catch:{ all -> 0x012a }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x012a }
            java.lang.String r7 = r6.b((java.lang.String) r7)     // Catch:{ all -> 0x012a }
            r1.verbose(r7)     // Catch:{ all -> 0x012a }
            java.lang.String r7 = r8.q()     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.e.c<Smash> r2 = r6.f4217b     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r2.f4290b     // Catch:{ all -> 0x012a }
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x012a }
            if (r7 == 0) goto L_0x00ea
            com.ironsource.mediationsdk.adunit.c.d$a r7 = r6.f4232r     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.c.d$a r2 = com.ironsource.mediationsdk.adunit.c.d.a.AUCTION     // Catch:{ all -> 0x012a }
            if (r7 != r2) goto L_0x003a
            goto L_0x00ea
        L_0x003a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r7 = r6.f4219d     // Catch:{ all -> 0x012a }
            java.lang.String r8 = r8.n()     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.h$a r2 = com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x012a }
            r7.put(r8, r2)     // Catch:{ all -> 0x012a }
            java.lang.Object r7 = r6.f4237y     // Catch:{ all -> 0x012a }
            monitor-enter(r7)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.c.d$a r8 = r6.f4232r     // Catch:{ all -> 0x00e7 }
            com.ironsource.mediationsdk.adunit.c.d$a r2 = com.ironsource.mediationsdk.adunit.c.d.a.LOADING     // Catch:{ all -> 0x00e7 }
            r3 = 1
            r4 = 0
            if (r8 != r2) goto L_0x0052
            r8 = r3
            goto L_0x0053
        L_0x0052:
            r8 = r4
        L_0x0053:
            monitor-exit(r7)     // Catch:{ all -> 0x00e7 }
            if (r8 != 0) goto L_0x006b
            java.lang.Object r7 = r6.f4237y     // Catch:{ all -> 0x012a }
            monitor-enter(r7)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.c.d$a r8 = r6.f4232r     // Catch:{ all -> 0x0068 }
            com.ironsource.mediationsdk.adunit.c.d$a r5 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_SHOW     // Catch:{ all -> 0x0068 }
            if (r8 != r5) goto L_0x0061
            r8 = r3
            goto L_0x0062
        L_0x0061:
            r8 = r4
        L_0x0062:
            monitor-exit(r7)     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            r7 = 0
            goto L_0x0090
        L_0x0068:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0068 }
            throw r8     // Catch:{ all -> 0x012a }
        L_0x006b:
            r1.verbose()     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.e.c<Smash> r7 = r6.f4217b     // Catch:{ all -> 0x012a }
            java.util.List r7 = r7.a()     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.e.f r8 = new com.ironsource.mediationsdk.adunit.e.f     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = r6.f4231q     // Catch:{ all -> 0x012a }
            r8.<init>(r1)     // Catch:{ all -> 0x012a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r1 = r6.f4218c     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.e.g r7 = r8.c(r7, r1)     // Catch:{ all -> 0x012a }
            boolean r8 = r7.a()     // Catch:{ all -> 0x012a }
            if (r8 == 0) goto L_0x0090
            r7 = 509(0x1fd, float:7.13E-43)
            java.lang.String r8 = "Mediation No fill"
            r6.f(r7, r8, r4)     // Catch:{ all -> 0x012a }
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            return
        L_0x0090:
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            if (r7 != 0) goto L_0x0094
            return
        L_0x0094:
            java.lang.Object r8 = r6.f4237y
            monitor-enter(r8)
            boolean r0 = r7.b()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r6.f4237y     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c9 }
            com.ironsource.mediationsdk.adunit.c.d$a r1 = r6.f4232r     // Catch:{ all -> 0x00c6 }
            if (r1 == r2) goto L_0x00aa
            com.ironsource.mediationsdk.adunit.c.d$a r2 = com.ironsource.mediationsdk.adunit.c.d.a.READY_TO_SHOW     // Catch:{ all -> 0x00c6 }
            if (r1 != r2) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r3 = r4
        L_0x00aa:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x00cb
            com.ironsource.mediationsdk.adunit.e.f r0 = new com.ironsource.mediationsdk.adunit.e.f     // Catch:{ all -> 0x00c9 }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = r6.f4231q     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            com.ironsource.mediationsdk.adunit.e.c<Smash> r1 = r6.f4217b     // Catch:{ all -> 0x00c9 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r2 = r6.f4218c     // Catch:{ all -> 0x00c9 }
            com.ironsource.mediationsdk.adunit.d.a.c r0 = r0.b(r1, r2)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00cb
            r6.v(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x00cb
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r7     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r7 = move-exception
            goto L_0x00e5
        L_0x00cb:
            monitor-exit(r8)     // Catch:{ all -> 0x00c9 }
            java.util.List r7 = r7.c()
            java.util.Iterator r7 = r7.iterator()
        L_0x00d4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r7.next()
            com.ironsource.mediationsdk.adunit.d.a.c r8 = (com.ironsource.mediationsdk.adunit.d.a.c) r8
            r6.a(r8)
            goto L_0x00d4
        L_0x00e4:
            return
        L_0x00e5:
            monitor-exit(r8)     // Catch:{ all -> 0x00c9 }
            throw r7
        L_0x00e7:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e7 }
            throw r8     // Catch:{ all -> 0x012a }
        L_0x00ea:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            java.lang.String r2 = "onAdLoadFailed was invoked from "
            r7.<init>(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r8.n()     // Catch:{ all -> 0x012a }
            r7.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = " with state ="
            r7.append(r2)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.c.d$a r2 = r6.f4232r     // Catch:{ all -> 0x012a }
            r7.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = " auctionId: "
            r7.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r8 = r8.q()     // Catch:{ all -> 0x012a }
            r7.append(r8)     // Catch:{ all -> 0x012a }
            java.lang.String r8 = " and the current id is "
            r7.append(r8)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.e.c<Smash> r8 = r6.f4217b     // Catch:{ all -> 0x012a }
            java.lang.String r8 = r8.f4290b     // Catch:{ all -> 0x012a }
            r7.append(r8)     // Catch:{ all -> 0x012a }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x012a }
            r1.verbose(r7)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.b.d r8 = r6.u     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.adunit.b.j r8 = r8.f4163g     // Catch:{ all -> 0x012a }
            r8.h(r7)     // Catch:{ all -> 0x012a }
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            return
        L_0x012a:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.d.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    public final void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        boolean z9;
        boolean z10;
        IronLog.INTERNAL.verbose(b((String) null));
        synchronized (this.f4237y) {
            z9 = false;
            z10 = this.f4232r == a.AUCTION;
        }
        if (z10) {
            this.f4223h = "";
            this.f4222g = i10;
            this.f4225j = aVar;
            this.f4224i = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.u.f4163g.b(i11, str2);
            }
            if (jSONObject2 != null) {
                z9 = jSONObject2.optBoolean("isAdUnitCapped", false);
            }
            this.w.a(this.f4231q.a(), z9);
            if (this.w.a(this.f4231q.a())) {
                this.u.f4161e.c(str);
                f(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String c10 = c(str, list);
            this.u.f4161e.a(j10);
            this.u.f4161e.b(c10);
            h(a.LOADING);
            A();
            return;
        }
        com.ironsource.mediationsdk.adunit.b.j jVar = this.u.f4163g;
        jVar.d("unexpected auction success for auctionId - " + str + " state = " + this.f4232r);
    }
}
