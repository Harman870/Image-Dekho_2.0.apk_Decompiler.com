package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.f;
import androidx.fragment.app.v0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.bidding.d;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.services.IMediationServiceEditor;
import com.ironsource.mediationsdk.services.IMediationServiceProvider;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.mediationsdk.utils.j;
import com.ironsource.mediationsdk.utils.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import r7.d;
import r7.e;

public final class c0 extends C0190o implements M, C0181d, C0194s {
    public boolean A;
    public final com.ironsource.mediationsdk.services.a B;
    public final a.C0056a C;

    /* renamed from: e  reason: collision with root package name */
    public m f4345e;

    /* renamed from: f  reason: collision with root package name */
    public int f4346f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentHashMap<String, N> f4347g;

    /* renamed from: h  reason: collision with root package name */
    public CopyOnWriteArrayList<N> f4348h;

    /* renamed from: i  reason: collision with root package name */
    public ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> f4349i;

    /* renamed from: j  reason: collision with root package name */
    public ConcurrentHashMap<String, h.a> f4350j;
    public com.ironsource.mediationsdk.adunit.a.a k;

    /* renamed from: l  reason: collision with root package name */
    public String f4351l;

    /* renamed from: m  reason: collision with root package name */
    public String f4352m;

    /* renamed from: n  reason: collision with root package name */
    public JSONObject f4353n;

    /* renamed from: o  reason: collision with root package name */
    public int f4354o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4355p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f4356q;

    /* renamed from: r  reason: collision with root package name */
    public final long f4357r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4358s;

    /* renamed from: t  reason: collision with root package name */
    public C0183f f4359t;
    public h u;

    /* renamed from: v  reason: collision with root package name */
    public long f4360v;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public long f4361x;

    /* renamed from: y  reason: collision with root package name */
    public int f4362y;

    /* renamed from: z  reason: collision with root package name */
    public String f4363z = "";

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c0 c0Var = c0.this;
            c0Var.i(3);
            AsyncTask.execute(new e(c0Var));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(List<NetworkSettings> list, com.ironsource.mediationsdk.model.h hVar, String str, String str2, int i10, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        com.ironsource.mediationsdk.model.h hVar2 = hVar;
        IMediationServiceProvider provider = MediationServices.getProvider();
        IMediationServiceEditor editor = MediationServices.getEditor();
        boolean z9 = false;
        this.A = false;
        this.B = provider.getSessionDepthService();
        this.C = editor.getSessionDepthServiceEditor();
        long b10 = v0.b();
        d(IronSourceConstants.IS_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_IS_MANAGER_NAME}}, false);
        i(1);
        this.f4347g = new ConcurrentHashMap<>();
        this.f4348h = new CopyOnWriteArrayList<>();
        this.f4349i = new ConcurrentHashMap<>();
        this.f4350j = new ConcurrentHashMap<>();
        this.f4351l = "";
        this.f4352m = "";
        this.f4353n = null;
        this.f4354o = hVar2.f4743c;
        this.f4355p = hVar2.f4744d;
        this.f4356q = hVar2.f4749i;
        this.f4357r = hVar2.f4750j;
        C0192q a10 = C0192q.a();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        a10.a(ad_unit, i10);
        c cVar = hVar2.f4747g;
        this.w = cVar.f4981g;
        z9 = cVar.f4977c > 0 ? true : z9;
        this.f4358s = z9;
        if (z9) {
            this.f4359t = new C0183f(ad_unit, cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings dVar : list) {
            arrayList.add(new d(this, dVar, hVar, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(hVar2.k, hVar2.f4751l, arrayList);
        this.u = new h(list, cVar.f4978d);
        this.f4345e = new m(new ArrayList(this.f4347g.values()));
        for (N next : this.f4347g.values()) {
            if (next.j()) {
                next.a();
            }
        }
        this.f4360v = v0.b();
        i(2);
        d(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - b10)}}, false);
    }

    public static void e(N n2, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + n2.n() + " : " + str, 0);
    }

    public static boolean h(int i10) {
        return i10 == 2002 || i10 == 2003 || i10 == 2200 || i10 == 2213 || i10 == 2005 || i10 == 2204 || i10 == 2201 || i10 == 2203 || i10 == 2006 || i10 == 2004 || i10 == 2110 || i10 == 2301 || i10 == 2300 || i10 == 2303;
    }

    public static void j(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        j(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f4362y = i11;
        this.f4363z = str2;
        this.f4353n = null;
        k();
        if (TextUtils.isEmpty(str)) {
            d(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}, false);
        } else {
            d(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}, false);
        }
        l();
    }

    public final void b(N n2) {
        synchronized (this) {
            e(n2, "onInterstitialAdClosed");
            com.ironsource.mediationsdk.services.a aVar = this.B;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            c(IronSourceConstants.IS_INSTANCE_CLOSED, n2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aVar.a(ad_unit))}}, true);
            this.C.b(ad_unit);
            C0196u.a().c(this.f4814d);
            i(2);
        }
    }

    public final void c(int i10, N n2, Object[][] objArr, boolean z9) {
        Map<String, Object> q10 = n2.q();
        if (!TextUtils.isEmpty(this.f4352m)) {
            q10.put("auctionId", this.f4352m);
        }
        JSONObject jSONObject = this.f4353n;
        if (jSONObject != null && jSONObject.length() > 0) {
            q10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f4353n);
        }
        if (z9 && !TextUtils.isEmpty(this.f4351l)) {
            q10.put("placement", this.f4351l);
        }
        if (h(i10)) {
            com.ironsource.mediationsdk.events.e.d();
            com.ironsource.mediationsdk.events.b.a(q10, this.f4362y, this.f4363z);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    q10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.events.e.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(q10)));
    }

    public final void c(N n2) {
        e(n2, "onInterstitialAdShowSucceeded");
        C0196u.a().d(this.f4814d);
        c(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, n2, (Object[][]) null, true);
    }

    public final void d(int i10, Object[][] objArr, boolean z9) {
        HashMap c10 = v0.c(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        c10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f4352m)) {
            c10.put("auctionId", this.f4352m);
        }
        JSONObject jSONObject = this.f4353n;
        if (jSONObject != null && jSONObject.length() > 0) {
            c10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f4353n);
        }
        if (z9 && !TextUtils.isEmpty(this.f4351l)) {
            c10.put("placement", this.f4351l);
        }
        if (h(i10)) {
            com.ironsource.mediationsdk.events.e.d();
            com.ironsource.mediationsdk.events.b.a(c10, this.f4362y, this.f4363z);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                j("sendMediationEvent " + e10.getMessage());
            }
        }
        com.ironsource.mediationsdk.events.e.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(c10)));
    }

    public final void e(N n2) {
        e(n2, "onInterstitialAdVisible");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean e() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0038 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0038 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            int r0 = r3.f4346f     // Catch:{ all -> 0x0038 }
            r2 = 5
            if (r0 == r2) goto L_0x001b
        L_0x0019:
            monitor-exit(r3)
            return r1
        L_0x001b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.N> r0 = r3.f4348h     // Catch:{ all -> 0x0038 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x0021:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0038 }
            com.ironsource.mediationsdk.N r2 = (com.ironsource.mediationsdk.N) r2     // Catch:{ all -> 0x0038 }
            boolean r2 = r2.g()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0021
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0036:
            monitor-exit(r3)
            return r1
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.c0.e():boolean");
    }

    public final void f(List<com.ironsource.mediationsdk.adunit.a.a> list) {
        this.f4348h.clear();
        this.f4349i.clear();
        this.f4350j.clear();
        StringBuilder sb = new StringBuilder();
        for (com.ironsource.mediationsdk.adunit.a.a next : list) {
            StringBuilder sb2 = new StringBuilder();
            N n2 = this.f4347g.get(next.a());
            StringBuilder g10 = f.g(n2 != null ? Integer.toString(n2.l()) : TextUtils.isEmpty(next.b()) ? IronSourceConstants.BOOLEAN_TRUE_AS_STRING : "2");
            g10.append(next.a());
            sb2.append(g10.toString());
            sb2.append(",");
            sb.append(sb2.toString());
            N n10 = this.f4347g.get(next.a());
            if (n10 != null) {
                n10.f3987c = true;
                this.f4348h.add(n10);
                this.f4349i.put(n10.n(), next);
                this.f4350j.put(next.a(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                j("updateWaterfall() - could not find matching smash for auction response item " + next.a());
            }
        }
        j("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            j("Updated waterfall is empty");
        }
        d(IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}, false);
    }

    public final void g(Map<String, Object> map, List<String> list, String str) {
        if (map.size() == 0 && list.size() == 0) {
            d(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}, false);
            j("makeAuction() failed - No candidates available for auctioning");
            C0192q.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
            d(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
            i(2);
            return;
        }
        d(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str}}, false);
        int a10 = this.B.a(IronSource.AD_UNIT.INTERSTITIAL);
        C0183f fVar = this.f4359t;
        if (fVar != null) {
            fVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.u, a10, this.f4813c);
        }
    }

    public final void i(int i10) {
        this.f4346f = i10;
        j("state=" + f.n(i10));
    }

    public final void k() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (N next : this.f4347g.values()) {
            if (!next.h()) {
                IronLog.INTERNAL.verbose();
                boolean z9 = false;
                if (!next.k() && !this.f4345e.b(next)) {
                    z9 = true;
                }
                if (z9) {
                    copyOnWriteArrayList.add(new com.ironsource.mediationsdk.adunit.a.a(next.n()));
                }
            }
        }
        this.f4352m = "fallback_" + System.currentTimeMillis();
        f((List<com.ironsource.mediationsdk.adunit.a.a>) copyOnWriteArrayList);
    }

    public final void l() {
        if (this.f4348h.isEmpty()) {
            i(2);
            d(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C0192q.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        i(4);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4348h.size() && i10 < this.f4354o; i11++) {
            N n2 = this.f4348h.get(i11);
            if (n2.f3987c) {
                if (!this.f4355p || !n2.h()) {
                    m(n2);
                    i10++;
                } else if (i10 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + n2.n() + ". No other instances will be loaded at the same time.";
                    j(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m(n2);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + n2.n() + " as a non bidder is being loaded";
                    j(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    public final void m(N n2) {
        String b10 = this.f4349i.get(n2.n()).b();
        JSONObject c10 = this.f4349i.get(n2.n()).c();
        n2.a(b10);
        c(2002, n2, (Object[][]) null, false);
        n2.a(b10, c10);
    }

    public class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f4364a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ StringBuilder f4365b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ List f4366c;

        public a(HashMap hashMap, StringBuilder sb, ArrayList arrayList) {
            this.f4364a = hashMap;
            this.f4365b = sb;
            this.f4366c = arrayList;
        }

        public final void a(String str) {
            c0.this.d(IronSourceConstants.IS_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}, false);
            c0.this.g(this.f4364a, this.f4366c, this.f4365b.toString());
        }

        public final void a(List<j> list, long j10, List<String> list2) {
            c0.this.d(IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}, false);
            for (j next : list) {
                if (next.c() != null) {
                    this.f4364a.put(next.b(), next.c());
                    StringBuilder sb = this.f4365b;
                    sb.append(next.a());
                    sb.append(next.b());
                    sb.append(",");
                    c0 c0Var = c0.this;
                    c0Var.c(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, c0Var.f4347g.get(next.b()), new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(next.d())}}, false);
                } else {
                    c0 c0Var2 = c0.this;
                    c0Var2.c(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, c0Var2.f4347g.get(next.b()), new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(next.d())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, next.e()}}, false);
                }
            }
            for (String str : list2) {
                c0 c0Var3 = c0.this;
                ConcurrentHashMap<String, N> concurrentHashMap = c0Var3.f4347g;
                c0Var3.c(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, concurrentHashMap.get(str), new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}, false);
            }
            c0.this.g(this.f4364a, this.f4366c, this.f4365b.toString());
        }
    }

    public final void b(IronSourceError ironSourceError, N n2) {
        c(IronSourceConstants.IS_INSTANCE_INIT_FAILED, n2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.app.Activity r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f4346f     // Catch:{ all -> 0x0046 }
            r1 = 2111(0x83f, float:2.958E-42)
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 6
            r6 = 3
            if (r0 != r5) goto L_0x0049
            java.lang.String r11 = "showInterstitial error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0046 }
            r12.log(r0, r11, r6)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0046 }
            r0 = 1036(0x40c, float:1.452E-42)
            r12.<init>(r0, r11)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.u r5 = com.ironsource.mediationsdk.C0196u.a()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r6 = r10.f4814d     // Catch:{ all -> 0x0046 }
            r5.a(r12, r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object[][] r12 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0046 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r5[r4] = r0     // Catch:{ all -> 0x0046 }
            r12[r3] = r5     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "reason"
            r0[r3] = r2     // Catch:{ all -> 0x0046 }
            r0[r4] = r11     // Catch:{ all -> 0x0046 }
            r12[r4] = r0     // Catch:{ all -> 0x0046 }
            r10.d(r1, r12, r3)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return
        L_0x0046:
            r11 = move-exception
            goto L_0x0207
        L_0x0049:
            r7 = 5
            r8 = 509(0x1fd, float:7.13E-43)
            if (r0 == r7) goto L_0x009d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = "showInterstitial() error state="
            r11.<init>(r12)     // Catch:{ all -> 0x0046 }
            int r12 = r10.f4346f     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = androidx.activity.f.l(r12)     // Catch:{ all -> 0x0046 }
            r11.append(r12)     // Catch:{ all -> 0x0046 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0046 }
            j(r11)     // Catch:{ all -> 0x0046 }
            java.lang.String r11 = "showInterstitial error: show called while no ads are available"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0046 }
            r12.log(r0, r11, r6)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0046 }
            r12.<init>(r8, r11)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.u r0 = com.ironsource.mediationsdk.C0196u.a()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r5 = r10.f4814d     // Catch:{ all -> 0x0046 }
            r0.a(r12, r5)     // Catch:{ all -> 0x0046 }
            java.lang.Object[][] r12 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "errorCode"
            r0[r3] = r5     // Catch:{ all -> 0x0046 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0046 }
            r0[r4] = r5     // Catch:{ all -> 0x0046 }
            r12[r3] = r0     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "reason"
            r0[r3] = r2     // Catch:{ all -> 0x0046 }
            r0[r4] = r11     // Catch:{ all -> 0x0046 }
            r12[r4] = r0     // Catch:{ all -> 0x0046 }
            r10.d(r1, r12, r3)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return
        L_0x009d:
            if (r12 != 0) goto L_0x00d9
            java.lang.String r11 = "showInterstitial error: empty default placement"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0046 }
            r12.log(r0, r11, r6)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0046 }
            r0 = 1020(0x3fc, float:1.43E-42)
            r12.<init>(r0, r11)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.u r5 = com.ironsource.mediationsdk.C0196u.a()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r6 = r10.f4814d     // Catch:{ all -> 0x0046 }
            r5.a(r12, r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object[][] r12 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0046 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r5[r4] = r0     // Catch:{ all -> 0x0046 }
            r12[r3] = r5     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "reason"
            r0[r3] = r2     // Catch:{ all -> 0x0046 }
            r0[r4] = r11     // Catch:{ all -> 0x0046 }
            r12[r4] = r0     // Catch:{ all -> 0x0046 }
            r10.d(r1, r12, r3)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return
        L_0x00d9:
            r10.f4351l = r12     // Catch:{ all -> 0x0046 }
            r0 = 0
            if (r11 == 0) goto L_0x00ed
            java.lang.Object[][] r11 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r9 = "ext1"
            r7[r3] = r9     // Catch:{ all -> 0x0046 }
            java.lang.String r9 = "init_context_flow"
            r7[r4] = r9     // Catch:{ all -> 0x0046 }
            r11[r3] = r7     // Catch:{ all -> 0x0046 }
            goto L_0x00ee
        L_0x00ed:
            r11 = r0
        L_0x00ee:
            r7 = 2100(0x834, float:2.943E-42)
            r10.d(r7, r11, r4)     // Catch:{ all -> 0x0046 }
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0046 }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x0046 }
            boolean r11 = com.ironsource.mediationsdk.utils.j.a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x014e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = "placement "
            r11.<init>(r12)     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = r10.f4351l     // Catch:{ all -> 0x0046 }
            r11.append(r12)     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = " is capped"
            r11.append(r12)     // Catch:{ all -> 0x0046 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0046 }
            r12.log(r0, r11, r6)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0046 }
            r0 = 524(0x20c, float:7.34E-43)
            r12.<init>(r0, r11)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.u r5 = com.ironsource.mediationsdk.C0196u.a()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r6 = r10.f4814d     // Catch:{ all -> 0x0046 }
            r5.a(r12, r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object[][] r12 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0046 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r5[r4] = r0     // Catch:{ all -> 0x0046 }
            r12[r3] = r5     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "reason"
            r0[r3] = r2     // Catch:{ all -> 0x0046 }
            r0[r4] = r11     // Catch:{ all -> 0x0046 }
            r12[r4] = r0     // Catch:{ all -> 0x0046 }
            r10.d(r1, r12, r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return
        L_0x014e:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.N> r11 = r10.f4348h     // Catch:{ all -> 0x0046 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0154:
            boolean r6 = r11.hasNext()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x01d7
            java.lang.Object r6 = r11.next()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.N r6 = (com.ironsource.mediationsdk.N) r6     // Catch:{ all -> 0x0046 }
            boolean r7 = r6.g()     // Catch:{ all -> 0x0046 }
            if (r7 == 0) goto L_0x01bb
            r10.i(r5)     // Catch:{ all -> 0x0046 }
            r6.b()     // Catch:{ all -> 0x0046 }
            r11 = 2201(0x899, float:3.084E-42)
            r10.c(r11, r6, r0, r4)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.utils.m r11 = r10.f4345e     // Catch:{ all -> 0x0046 }
            r11.a(r6)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.utils.m r11 = r10.f4345e     // Catch:{ all -> 0x0046 }
            boolean r11 = r11.b(r6)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x019b
            r11 = 2401(0x961, float:3.365E-42)
            r10.c(r11, r6, r0, r3)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r11.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r6.n()     // Catch:{ all -> 0x0046 }
            r11.append(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = " was session capped"
            r11.append(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0046 }
        L_0x019b:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0046 }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.utils.j.d(r11, r12)     // Catch:{ all -> 0x0046 }
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0046 }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x0046 }
            boolean r11 = com.ironsource.mediationsdk.utils.j.a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x01b9
            r11 = 2400(0x960, float:3.363E-42)
            r10.d(r11, r0, r4)     // Catch:{ all -> 0x0046 }
        L_0x01b9:
            monitor-exit(r10)
            return
        L_0x01bb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            java.lang.String r9 = "showInterstitial "
            r7.<init>(r9)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = r6.n()     // Catch:{ all -> 0x0046 }
            r7.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = " isReadyToShow() == false"
            r7.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0046 }
            j(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0154
        L_0x01d7:
            com.ironsource.mediationsdk.u r11 = com.ironsource.mediationsdk.C0196u.a()     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r12)     // Catch:{ all -> 0x0046 }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r0 = r10.f4814d     // Catch:{ all -> 0x0046 }
            r11.a(r12, r0)     // Catch:{ all -> 0x0046 }
            java.lang.Object[][] r11 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "errorCode"
            r12[r3] = r0     // Catch:{ all -> 0x0046 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0046 }
            r12[r4] = r0     // Catch:{ all -> 0x0046 }
            r11[r3] = r12     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "reason"
            r12[r3] = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "Show Fail - No ads to show"
            r12[r4] = r0     // Catch:{ all -> 0x0046 }
            r11[r4] = r12     // Catch:{ all -> 0x0046 }
            r10.d(r1, r11, r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r10)
            return
        L_0x0207:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.c0.a(android.app.Activity, java.lang.String):void");
    }

    public final synchronized void d() {
        int i10 = this.f4346f;
        if (i10 == 6) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            C0196u.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
            return;
        }
        if (i10 == 2 || i10 == 5) {
            C0192q a10 = C0192q.a();
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            if (!a10.a(ad_unit)) {
                this.f4352m = "";
                this.f4351l = "";
                this.f4353n = null;
                this.f4812b.a(ad_unit, false);
                a_();
                d(2001, (Object[][]) null, false);
                this.f4361x = new Date().getTime();
                if (this.f4358s) {
                    if (!this.f4350j.isEmpty()) {
                        this.u.a(this.f4350j);
                        this.f4350j.clear();
                    }
                    i(3);
                    AsyncTask.execute(new e(this));
                    return;
                }
                k();
                l();
                return;
            }
        }
        j("loadInterstitial: load is already in progress");
    }

    public final void f(N n2) {
        c(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, n2, (Object[][]) null, false);
    }

    public final void d(N n2) {
        e(n2, "onInterstitialAdClicked");
        C0196u.a().e(this.f4814d);
        c(2006, n2, (Object[][]) null, true);
    }

    public final void a(N n2) {
        synchronized (this) {
            try {
                e(n2, "onInterstitialAdOpened");
                c(IronSourceConstants.IS_INSTANCE_OPENED, n2, (Object[][]) null, true);
                if (this.f4358s) {
                    com.ironsource.mediationsdk.adunit.a.a aVar = this.f4349i.get(n2.n());
                    if (aVar != null) {
                        a(aVar.a(this.f4351l));
                        C0183f.a(aVar, n2.l(), this.k, this.f4351l);
                        this.f4350j.put(n2.n(), h.a.ISAuctionPerformanceShowedSuccessfully);
                        b(aVar, this.f4351l);
                    } else {
                        String n10 = n2.n();
                        j("onInterstitialAdOpened showing instance " + n10 + " missing from waterfall");
                        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)};
                        d(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + f.n(this.f4346f)}, new Object[]{IronSourceConstants.EVENTS_EXT1, n10}}, false);
                    }
                }
                C0196u.a().b(this.f4814d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(N n2, long j10) {
        N n10 = n2;
        synchronized (this) {
            e(n10, "onInterstitialAdReady");
            c(2003, n10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}, false);
            if (this.f4350j.containsKey(n2.n())) {
                this.f4350j.put(n2.n(), h.a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f4346f == 4) {
                i(5);
                d(2004, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f4361x)}}, false);
                if (this.f4358s) {
                    com.ironsource.mediationsdk.adunit.a.a aVar = this.f4349i.get(n2.n());
                    if (aVar != null) {
                        a(aVar.a(""));
                        C0183f.a(aVar, n2.l(), this.k);
                        this.f4359t.a((CopyOnWriteArrayList<O>) this.f4348h, this.f4349i, n2.l(), this.k, aVar);
                    } else {
                        String n11 = n2.n();
                        j("onInterstitialAdReady winner instance " + n11 + " missing from waterfall");
                        d(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, n11}}, false);
                    }
                }
                C0196u.a().a(this.f4814d);
            }
        }
    }

    public final void a(IronSourceError ironSourceError, N n2) {
        com.ironsource.mediationsdk.adunit.a.a aVar;
        synchronized (this) {
            if (this.f4358s && (aVar = this.f4349i.get(n2.n())) != null) {
                a(aVar.a(this.f4351l));
            }
            e(n2, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            C0196u.a().a(ironSourceError, this.f4814d);
            c(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, n2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}, true);
            this.f4350j.put(n2.n(), h.a.ISAuctionPerformanceFailedToShow);
            i(2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f1, code lost:
        if (r11 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f3, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f6, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f8, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.n() + " as " + r9;
        j(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0148 A[Catch:{ all -> 0x005c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.N r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x005c }
            r1.append(r2)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x005c }
            int r2 = r8.f4346f     // Catch:{ all -> 0x005c }
            java.lang.String r2 = androidx.activity.f.l(r2)     // Catch:{ all -> 0x005c }
            r1.append(r2)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005c }
            e(r10, r1)     // Catch:{ all -> 0x005c }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x005c }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 1
            r4 = 0
            r5 = 2
            if (r1 != r2) goto L_0x005f
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r5][]     // Catch:{ all -> 0x005c }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x005c }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x005c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x005c }
            r6[r3] = r9     // Catch:{ all -> 0x005c }
            r2[r4] = r6     // Catch:{ all -> 0x005c }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x005c }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x005c }
            r9[r3] = r11     // Catch:{ all -> 0x005c }
            r2[r3] = r9     // Catch:{ all -> 0x005c }
            r8.c(r1, r10, r2, r4)     // Catch:{ all -> 0x005c }
            goto L_0x0095
        L_0x005c:
            r9 = move-exception
            goto L_0x01b5
        L_0x005f:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x005c }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x005c }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x005c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x005c }
            r6[r3] = r7     // Catch:{ all -> 0x005c }
            r2[r4] = r6     // Catch:{ all -> 0x005c }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x005c }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x005c }
            r6[r3] = r9     // Catch:{ all -> 0x005c }
            r2[r3] = r6     // Catch:{ all -> 0x005c }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x005c }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x005c }
            r9[r3] = r11     // Catch:{ all -> 0x005c }
            r2[r5] = r9     // Catch:{ all -> 0x005c }
            r8.c(r1, r10, r2, r4)     // Catch:{ all -> 0x005c }
        L_0x0095:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r9 = r8.f4350j     // Catch:{ all -> 0x005c }
            java.lang.String r11 = r10.n()     // Catch:{ all -> 0x005c }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x005c }
            if (r9 == 0) goto L_0x00ac
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r9 = r8.f4350j     // Catch:{ all -> 0x005c }
            java.lang.String r11 = r10.n()     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.h$a r12 = com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x005c }
            r9.put(r11, r12)     // Catch:{ all -> 0x005c }
        L_0x00ac:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.N> r9 = r8.f4348h     // Catch:{ all -> 0x005c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x005c }
            r11 = r4
            r12 = r11
        L_0x00b4:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0151
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.N r1 = (com.ironsource.mediationsdk.N) r1     // Catch:{ all -> 0x005c }
            boolean r2 = r1.f3987c     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0135
            boolean r2 = r8.f4355p     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0119
            boolean r2 = r1.h()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0119
            if (r11 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00d3
            goto L_0x00f1
        L_0x00d3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r6 = r1.n()     // Catch:{ all -> 0x005c }
            r2.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005c }
            j(r2)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0119
        L_0x00f1:
            if (r11 == 0) goto L_0x00f6
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x005c }
            java.lang.String r12 = r1.n()     // Catch:{ all -> 0x005c }
            r10.append(r12)     // Catch:{ all -> 0x005c }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x005c }
            r10.append(r9)     // Catch:{ all -> 0x005c }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x005c }
            j(r9)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x005c }
            goto L_0x0151
        L_0x0119:
            r0.add(r1)     // Catch:{ all -> 0x005c }
            boolean r2 = r8.f4355p     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0151
            boolean r2 = r10.h()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0151
            boolean r1 = r1.h()     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0151
            int r1 = r0.size()     // Catch:{ all -> 0x005c }
            int r2 = r8.f4354o     // Catch:{ all -> 0x005c }
            if (r1 >= r2) goto L_0x0151
            goto L_0x0145
        L_0x0135:
            com.ironsource.mediationsdk.N$a r2 = r1.f3968h     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.N$a r6 = com.ironsource.mediationsdk.N.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x005c }
            if (r2 == r6) goto L_0x0142
            com.ironsource.mediationsdk.N$a r6 = com.ironsource.mediationsdk.N.a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x005c }
            if (r2 != r6) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r2 = r4
            goto L_0x0143
        L_0x0142:
            r2 = r3
        L_0x0143:
            if (r2 == 0) goto L_0x0148
        L_0x0145:
            r11 = r3
            goto L_0x00b4
        L_0x0148:
            boolean r1 = r1.g()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x00b4
            r12 = r3
            goto L_0x00b4
        L_0x0151:
            int r9 = r0.size()     // Catch:{ all -> 0x005c }
            if (r9 != 0) goto L_0x0188
            int r9 = r8.f4346f     // Catch:{ all -> 0x005c }
            r10 = 4
            if (r9 != r10) goto L_0x0188
            if (r11 != 0) goto L_0x0188
            com.ironsource.mediationsdk.q r9 = com.ironsource.mediationsdk.C0192q.a()     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x005c }
            java.lang.String r12 = "No ads to show"
            r1 = 509(0x1fd, float:7.13E-43)
            r11.<init>(r1, r12)     // Catch:{ all -> 0x005c }
            r9.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r10, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x005c }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r3][]     // Catch:{ all -> 0x005c }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            java.lang.String r12 = "errorCode"
            r11[r4] = r12     // Catch:{ all -> 0x005c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x005c }
            r11[r3] = r12     // Catch:{ all -> 0x005c }
            r10[r4] = r11     // Catch:{ all -> 0x005c }
            r8.d(r9, r10, r4)     // Catch:{ all -> 0x005c }
            r8.i(r5)     // Catch:{ all -> 0x005c }
        L_0x0188:
            monitor-exit(r8)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a4:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b4
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.N r10 = (com.ironsource.mediationsdk.N) r10
            r8.m(r10)
            goto L_0x01a4
        L_0x01b4:
            return
        L_0x01b5:
            monitor-exit(r8)     // Catch:{ all -> 0x005c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.c0.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.N, long):void");
    }

    public final void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        this.f4352m = str;
        this.k = aVar;
        this.f4353n = jSONObject;
        this.f4362y = i10;
        this.f4363z = "";
        if (!TextUtils.isEmpty(str2)) {
            d(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        this.f4812b.a(ad_unit, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
        if (this.f4812b.a(ad_unit)) {
            d(IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}}, false);
            i(2);
            C0192q.a().a(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
            return;
        }
        d(IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}, false);
        f(list);
        l();
    }
}
