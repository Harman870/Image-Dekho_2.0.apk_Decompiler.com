package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.f;
import androidx.fragment.app.v0;
import androidx.fragment.app.w0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.environment.j;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.B;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.d;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class a0 extends C0190o implements j, C, S, C0179b, C0181d, C0195t {
    public long A;
    public Boolean B;
    public final Object C;
    public C0193r D;
    public final boolean E;
    public final long F;

    /* renamed from: e  reason: collision with root package name */
    public D f4067e;

    /* renamed from: f  reason: collision with root package name */
    public ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> f4068f;

    /* renamed from: g  reason: collision with root package name */
    public ConcurrentHashMap<String, h.a> f4069g;

    /* renamed from: h  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.a.a f4070h;

    /* renamed from: i  reason: collision with root package name */
    public h f4071i;

    /* renamed from: j  reason: collision with root package name */
    public C0183f f4072j;
    public JSONObject k;

    /* renamed from: l  reason: collision with root package name */
    public R f4073l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4074m;

    /* renamed from: n  reason: collision with root package name */
    public long f4075n;

    /* renamed from: o  reason: collision with root package name */
    public String f4076o = "";

    /* renamed from: p  reason: collision with root package name */
    public int f4077p;

    /* renamed from: q  reason: collision with root package name */
    public NetworkStateReceiver f4078q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4079r;

    /* renamed from: s  reason: collision with root package name */
    public final ConcurrentHashMap<String, B> f4080s;

    /* renamed from: t  reason: collision with root package name */
    public m f4081t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public String f4082v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4083x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4084y;

    /* renamed from: z  reason: collision with root package name */
    public int f4085z;

    public class a extends TimerTask {
        public a() {
        }

        public final void run() {
            a0 a0Var = a0.this;
            synchronized (a0Var.C) {
                if (a0Var.f4085z != 2) {
                    a0Var.j(2);
                    AsyncTask.execute(new b());
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            StringBuilder sb;
            a0.f("makeAuction()");
            a0.this.f4075n = v0.b();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            a0 a0Var = a0.this;
            for (B next : a0Var.f4080s.values()) {
                if (!a0Var.f4081t.b(next) && a0Var.f4067e.b(next)) {
                    if (!next.h()) {
                        arrayList.add(next.n());
                        sb = new StringBuilder();
                    } else if (a0Var.E) {
                        arrayList2.add(new com.ironsource.mediationsdk.bidding.a(next.l(), next.n(), (AdData) null, next, (com.ironsource.mediationsdk.bidding.b) null, (NetworkSettings) null));
                    } else {
                        Map<String, Object> a10 = next.a((AdData) null);
                        if (a10 != null) {
                            hashMap.put(next.n(), a10);
                            sb = new StringBuilder();
                        } else {
                            next.b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                        }
                    }
                    sb.append(next.l());
                    sb.append(next.n());
                    sb.append(",");
                    sb2.append(sb.toString());
                }
            }
            a0 a0Var2 = a0.this;
            if (!a0Var2.E) {
                a0Var2.h(hashMap, arrayList, sb2.toString());
            } else if (arrayList2.isEmpty()) {
                a0Var2.h(hashMap, arrayList, sb2.toString());
            } else {
                d dVar = new d();
                c cVar = new c(hashMap, sb2, arrayList);
                a0Var2.c(IronSourceConstants.RV_COLLECT_TOKENS, (Map<String, Object>) null, false, false);
                long j10 = a0Var2.F;
                dVar.a(arrayList2, cVar, j10, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(List<NetworkSettings> list, q qVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        q qVar2 = qVar;
        boolean z9 = false;
        this.f4079r = false;
        this.u = 1;
        this.C = new Object();
        long b10 = v0.b();
        c(IronSourceConstants.RV_MANAGER_INIT_STARTED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}), false, false);
        j(1);
        this.B = null;
        this.w = qVar2.f4792c;
        this.f4083x = qVar2.f4793d;
        this.f4082v = "";
        this.k = null;
        com.ironsource.mediationsdk.utils.c cVar = qVar2.f4801m;
        this.f4084y = false;
        this.f4067e = new D(cVar.k, cVar.f4979e);
        this.f4068f = new ConcurrentHashMap<>();
        this.f4069g = new ConcurrentHashMap<>();
        this.A = v0.b();
        z9 = cVar.f4977c > 0 ? true : z9;
        this.f4074m = z9;
        if (z9) {
            this.f4072j = new C0183f(IronSource.AD_UNIT.REWARDED_VIDEO, cVar, this);
        }
        this.f4073l = new R(cVar, this);
        this.f4080s = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings aVar : list) {
            arrayList.add(new r7.a(this, aVar, qVar, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(qVar2.f4799j, qVar2.k, arrayList);
        this.f4071i = new h(list, cVar.f4978d);
        this.f4081t = new m(new ArrayList(this.f4080s.values()));
        this.D = new C0193r(qVar2.f4795f, this);
        this.E = qVar2.f4797h;
        this.F = qVar2.f4798i;
        c(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - b10)}}), false, false);
        d(cVar.f4981g);
    }

    public static void e(B b10, String str) {
        String str2 = b10.n() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    public static void f(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    public final void a() {
        j(3);
        i(a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}), false);
        d(0);
    }

    public final void a(int i10, String str, int i11, String str2, long j10) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        f(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f4077p = i11;
        this.f4076o = str2;
        this.k = null;
        l();
        if (TextUtils.isEmpty(str)) {
            map = a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        } else {
            map = a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        }
        k(IronSourceConstants.RV_AUCTION_FAILED, map);
        m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0226, code lost:
        f("showVideo()");
        r10.f4081t.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0236, code lost:
        if (r10.f4081t.b(r7) == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0238, code lost:
        r7.a((int) com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_SESSION);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r7.n() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0255, code lost:
        com.ironsource.mediationsdk.utils.j.e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r12.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0274, code lost:
        if (com.ironsource.mediationsdk.utils.j.c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r12.getPlacementName()) == false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0276, code lost:
        c(com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT, (java.util.Map<java.lang.String, java.lang.Object>) null, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x027b, code lost:
        r10.D.a();
        r7.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0283, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.app.Activity r11, com.ironsource.mediationsdk.model.Placement r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.C
            monitor-enter(r0)
            r1 = 3
            r2 = 1113(0x459, float:1.56E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r12 != 0) goto L_0x0052
            java.lang.String r11 = "showRewardedVideo error: empty default placement"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x004f }
            r12.log(r6, r11, r1)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x004f }
            r1 = 1021(0x3fd, float:1.431E-42)
            r12.<init>(r1, r11)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.P r6 = com.ironsource.mediationsdk.P.a()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.D r7 = r10.f4067e     // Catch:{ all -> 0x004f }
            java.lang.String r8 = r7.f3843b     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r7.a((java.lang.String) r8)     // Catch:{ all -> 0x004f }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r12, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x004f }
            java.lang.Object[][] r12 = new java.lang.Object[r3][]     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x004f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004f }
            r6[r5] = r1     // Catch:{ all -> 0x004f }
            r12[r4] = r6     // Catch:{ all -> 0x004f }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "reason"
            r1[r4] = r3     // Catch:{ all -> 0x004f }
            r1[r5] = r11     // Catch:{ all -> 0x004f }
            r12[r5] = r1     // Catch:{ all -> 0x004f }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r12)     // Catch:{ all -> 0x004f }
            r10.c(r2, r11, r4, r5)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r11 = move-exception
            goto L_0x0284
        L_0x0052:
            java.lang.String r6 = r12.getPlacementName()     // Catch:{ all -> 0x004f }
            r10.f4082v = r6     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            java.lang.String r7 = "showRewardedVideo("
            r6.<init>(r7)     // Catch:{ all -> 0x004f }
            r6.append(r12)     // Catch:{ all -> 0x004f }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x004f }
            r7.log(r8, r6, r4)     // Catch:{ all -> 0x004f }
            r6 = 0
            if (r11 == 0) goto L_0x008a
            java.lang.Object[][] r11 = new java.lang.Object[r5][]     // Catch:{ all -> 0x004f }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "ext1"
            r7[r4] = r9     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "init_context_flow"
            r7[r5] = r9     // Catch:{ all -> 0x004f }
            r11[r4] = r7     // Catch:{ all -> 0x004f }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r11)     // Catch:{ all -> 0x004f }
            goto L_0x008b
        L_0x008a:
            r11 = r6
        L_0x008b:
            r7 = 1100(0x44c, float:1.541E-42)
            r10.c(r7, r11, r5, r5)     // Catch:{ all -> 0x004f }
            boolean r11 = r10.f4084y     // Catch:{ all -> 0x004f }
            if (r11 == 0) goto L_0x00d6
            java.lang.String r11 = "showRewardedVideo error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x004f }
            r12.log(r8, r11, r1)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x004f }
            r1 = 1022(0x3fe, float:1.432E-42)
            r12.<init>(r1, r11)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.P r6 = com.ironsource.mediationsdk.P.a()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.D r7 = r10.f4067e     // Catch:{ all -> 0x004f }
            java.lang.String r8 = r7.f3843b     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r7.a((java.lang.String) r8)     // Catch:{ all -> 0x004f }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r12, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x004f }
            java.lang.Object[][] r12 = new java.lang.Object[r3][]     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x004f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004f }
            r6[r5] = r1     // Catch:{ all -> 0x004f }
            r12[r4] = r6     // Catch:{ all -> 0x004f }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "reason"
            r1[r4] = r3     // Catch:{ all -> 0x004f }
            r1[r5] = r11     // Catch:{ all -> 0x004f }
            r12[r5] = r1     // Catch:{ all -> 0x004f }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r12)     // Catch:{ all -> 0x004f }
            r10.c(r2, r11, r5, r5)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x00d6:
            int r11 = r10.f4085z     // Catch:{ all -> 0x004f }
            r7 = 5
            if (r11 == r7) goto L_0x011d
            java.lang.String r11 = "showRewardedVideo error: show called while no ads are available"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x004f }
            r12.log(r8, r11, r1)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x004f }
            r1 = 1023(0x3ff, float:1.434E-42)
            r12.<init>(r1, r11)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.P r6 = com.ironsource.mediationsdk.P.a()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.D r7 = r10.f4067e     // Catch:{ all -> 0x004f }
            java.lang.String r8 = r7.f3843b     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r7.a((java.lang.String) r8)     // Catch:{ all -> 0x004f }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r12, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x004f }
            java.lang.Object[][] r12 = new java.lang.Object[r3][]     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x004f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004f }
            r6[r5] = r1     // Catch:{ all -> 0x004f }
            r12[r4] = r6     // Catch:{ all -> 0x004f }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "reason"
            r1[r4] = r3     // Catch:{ all -> 0x004f }
            r1[r5] = r11     // Catch:{ all -> 0x004f }
            r12[r5] = r1     // Catch:{ all -> 0x004f }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r12)     // Catch:{ all -> 0x004f }
            r10.c(r2, r11, r5, r5)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x011d:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x004f }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ all -> 0x004f }
            java.lang.String r7 = r10.f4082v     // Catch:{ all -> 0x004f }
            boolean r11 = com.ironsource.mediationsdk.utils.j.c(r11, r7)     // Catch:{ all -> 0x004f }
            if (r11 == 0) goto L_0x0182
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            java.lang.String r12 = "showRewardedVideo error: placement "
            r11.<init>(r12)     // Catch:{ all -> 0x004f }
            java.lang.String r12 = r10.f4082v     // Catch:{ all -> 0x004f }
            r11.append(r12)     // Catch:{ all -> 0x004f }
            java.lang.String r12 = " is capped"
            r11.append(r12)     // Catch:{ all -> 0x004f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x004f }
            r12.log(r8, r11, r1)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x004f }
            r1 = 524(0x20c, float:7.34E-43)
            r12.<init>(r1, r11)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.P r6 = com.ironsource.mediationsdk.P.a()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.D r7 = r10.f4067e     // Catch:{ all -> 0x004f }
            java.lang.String r8 = r7.f3843b     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r7 = r7.a((java.lang.String) r8)     // Catch:{ all -> 0x004f }
            r6.a((com.ironsource.mediationsdk.logger.IronSourceError) r12, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r7)     // Catch:{ all -> 0x004f }
            java.lang.Object[][] r12 = new java.lang.Object[r3][]     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x004f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004f }
            r6[r5] = r1     // Catch:{ all -> 0x004f }
            r12[r4] = r6     // Catch:{ all -> 0x004f }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "reason"
            r1[r4] = r3     // Catch:{ all -> 0x004f }
            r1[r5] = r11     // Catch:{ all -> 0x004f }
            r12[r5] = r1     // Catch:{ all -> 0x004f }
            java.util.Map r11 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r12)     // Catch:{ all -> 0x004f }
            r10.c(r2, r11, r5, r5)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0182:
            java.lang.StringBuffer r11 = new java.lang.StringBuffer     // Catch:{ all -> 0x004f }
            r11.<init>()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.D r3 = r10.f4067e     // Catch:{ all -> 0x004f }
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.a()     // Catch:{ all -> 0x004f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004f }
        L_0x0191:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x004f }
            if (r7 == 0) goto L_0x01da
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.B r7 = (com.ironsource.mediationsdk.B) r7     // Catch:{ all -> 0x004f }
            boolean r8 = r7.a()     // Catch:{ all -> 0x004f }
            if (r8 == 0) goto L_0x01ac
            r10.f4084y = r5     // Catch:{ all -> 0x004f }
            r7.a((boolean) r5)     // Catch:{ all -> 0x004f }
            r10.j(r1)     // Catch:{ all -> 0x004f }
            goto L_0x01db
        L_0x01ac:
            java.lang.Long r8 = r7.r()     // Catch:{ all -> 0x004f }
            if (r8 == 0) goto L_0x01d6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r8.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r9 = r7.n()     // Catch:{ all -> 0x004f }
            r8.append(r9)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = ":"
            r8.append(r9)     // Catch:{ all -> 0x004f }
            java.lang.Long r9 = r7.r()     // Catch:{ all -> 0x004f }
            r8.append(r9)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = ","
            r8.append(r9)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x004f }
            r11.append(r8)     // Catch:{ all -> 0x004f }
        L_0x01d6:
            r7.a((boolean) r4)     // Catch:{ all -> 0x004f }
            goto L_0x0191
        L_0x01da:
            r7 = r6
        L_0x01db:
            if (r7 != 0) goto L_0x0225
            java.lang.String r12 = "showRewardedVideo(): No ads to show"
            f((java.lang.String) r12)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.P r1 = com.ironsource.mediationsdk.P.a()     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r3)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.D r4 = r10.f4067e     // Catch:{ all -> 0x004f }
            java.lang.String r6 = r4.f3843b     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo r4 = r4.a((java.lang.String) r6)     // Catch:{ all -> 0x004f }
            r1.a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r4)     // Catch:{ all -> 0x004f }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "errorCode"
            r4 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004f }
            r1.put(r3, r4)     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "reason"
            r1.put(r3, r12)     // Catch:{ all -> 0x004f }
            int r12 = r11.length()     // Catch:{ all -> 0x004f }
            if (r12 == 0) goto L_0x021b
            java.lang.String r12 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x004f }
            r1.put(r12, r11)     // Catch:{ all -> 0x004f }
        L_0x021b:
            r10.c(r2, r1, r5, r5)     // Catch:{ all -> 0x004f }
            com.ironsource.mediationsdk.R r11 = r10.f4073l     // Catch:{ all -> 0x004f }
            r11.b()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0225:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r11 = "showVideo()"
            f((java.lang.String) r11)
            com.ironsource.mediationsdk.utils.m r11 = r10.f4081t
            r11.a(r7)
            com.ironsource.mediationsdk.utils.m r11 = r10.f4081t
            boolean r11 = r11.b(r7)
            if (r11 == 0) goto L_0x0255
            r11 = 1401(0x579, float:1.963E-42)
            r7.a((int) r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = r7.n()
            r11.append(r0)
            java.lang.String r0 = " rewarded video is now session capped"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)
        L_0x0255:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.String r0 = r12.getPlacementName()
            com.ironsource.mediationsdk.utils.j.e(r11, r0)
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.String r0 = r12.getPlacementName()
            boolean r11 = com.ironsource.mediationsdk.utils.j.c(r11, r0)
            if (r11 == 0) goto L_0x027b
            r11 = 1400(0x578, float:1.962E-42)
            r10.c(r11, r6, r5, r5)
        L_0x027b:
            com.ironsource.mediationsdk.r r11 = r10.D
            r11.a()
            r7.a((com.ironsource.mediationsdk.model.Placement) r12)
            return
        L_0x0284:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.a0.a(android.app.Activity, com.ironsource.mediationsdk.model.Placement):void");
    }

    public final void a(Context context, boolean z9) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z9, 0);
        try {
            this.f4079r = z9;
            if (z9) {
                if (this.f4078q == null) {
                    this.f4078q = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f4078q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f4078q != null) {
                context.getApplicationContext().unregisterReceiver(this.f4078q);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    public final void a(B b10, Placement placement) {
        e(b10, "onRewardedVideoAdRewarded");
        P.a().a(placement, this.f4067e.a(b10.f3827p));
    }

    public final void a(boolean z9) {
        if (this.f4079r) {
            boolean z10 = false;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z9, 0);
            Boolean bool = this.B;
            if (bool != null && ((z9 && !bool.booleanValue() && b()) || (!z9 && this.B.booleanValue()))) {
                z10 = true;
            }
            if (z10) {
                i((Map) null, z9);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        r12 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014e, code lost:
        if (r12.hasNext() == false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0150, code lost:
        n((com.ironsource.mediationsdk.B) r12.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4 A[Catch:{ all -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ironsource.mediationsdk.B r12) {
        /*
            r11 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r11.C
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0045 }
            int r3 = r11.f4085z     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = androidx.fragment.app.w0.l(r3)     // Catch:{ all -> 0x0045 }
            r2.append(r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0045 }
            e(r12, r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r12.f3827p     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.D r3 = r11.f4067e     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r3.f3843b     // Catch:{ all -> 0x0045 }
            r4 = 1
            r5 = 0
            r6 = 4
            r7 = 2
            if (r2 != r3) goto L_0x015b
            int r2 = r11.f4085z     // Catch:{ all -> 0x0045 }
            if (r2 != r7) goto L_0x0031
            goto L_0x015b
        L_0x0031:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r2 = r11.f4069g     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = r12.n()     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.h$a r8 = com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0045 }
            r2.put(r3, r8)     // Catch:{ all -> 0x0045 }
            int r2 = r11.f4085z     // Catch:{ all -> 0x0045 }
            if (r2 == r6) goto L_0x0048
            r3 = 5
            if (r2 == r3) goto L_0x0048
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r12 = move-exception
            goto L_0x01b0
        L_0x0048:
            com.ironsource.mediationsdk.D r2 = r11.f4067e     // Catch:{ all -> 0x0045 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.a()     // Catch:{ all -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0045 }
            r3 = r5
            r6 = r3
        L_0x0054:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x0045 }
            if (r8 == 0) goto L_0x00fd
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.B r8 = (com.ironsource.mediationsdk.B) r8     // Catch:{ all -> 0x0045 }
            boolean r9 = r8.f3987c     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x00e1
            boolean r9 = r11.f4083x     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x00b9
            boolean r9 = r8.h()     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x00b9
            if (r3 != 0) goto L_0x0091
            if (r6 == 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = "Advanced Loading: Starting to load bidder "
            r9.<init>(r10)     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = r8.n()     // Catch:{ all -> 0x0045 }
            r9.append(r10)     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = ". No other instances will be loaded at the same time."
            r9.append(r10)     // Catch:{ all -> 0x0045 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0045 }
            f((java.lang.String) r9)     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x0045 }
            goto L_0x00b9
        L_0x0091:
            if (r3 == 0) goto L_0x0096
            java.lang.String r12 = "a non bidder is being loaded"
            goto L_0x0098
        L_0x0096:
            java.lang.String r12 = "a non bidder was already loaded successfully"
        L_0x0098:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            java.lang.String r9 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r9)     // Catch:{ all -> 0x0045 }
            java.lang.String r8 = r8.n()     // Catch:{ all -> 0x0045 }
            r2.append(r8)     // Catch:{ all -> 0x0045 }
            java.lang.String r8 = " as "
            r2.append(r8)     // Catch:{ all -> 0x0045 }
            r2.append(r12)     // Catch:{ all -> 0x0045 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0045 }
            f((java.lang.String) r12)     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r12)     // Catch:{ all -> 0x0045 }
            goto L_0x00fd
        L_0x00b9:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r9 = r11.f4068f     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = r8.n()     // Catch:{ all -> 0x0045 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x0054
            r0.add(r8)     // Catch:{ all -> 0x0045 }
            boolean r9 = r11.f4083x     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x00fd
            boolean r9 = r12.h()     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x00fd
            boolean r8 = r8.h()     // Catch:{ all -> 0x0045 }
            if (r8 != 0) goto L_0x00fd
            int r8 = r0.size()     // Catch:{ all -> 0x0045 }
            int r9 = r11.w     // Catch:{ all -> 0x0045 }
            if (r8 >= r9) goto L_0x00fd
            goto L_0x00f1
        L_0x00e1:
            com.ironsource.mediationsdk.B$a r9 = r8.f3820h     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.B$a r10 = com.ironsource.mediationsdk.B.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0045 }
            if (r9 == r10) goto L_0x00ee
            com.ironsource.mediationsdk.B$a r10 = com.ironsource.mediationsdk.B.a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0045 }
            if (r9 != r10) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r9 = r5
            goto L_0x00ef
        L_0x00ee:
            r9 = r4
        L_0x00ef:
            if (r9 == 0) goto L_0x00f4
        L_0x00f1:
            r3 = r4
            goto L_0x0054
        L_0x00f4:
            boolean r8 = r8.a()     // Catch:{ all -> 0x0045 }
            if (r8 == 0) goto L_0x0054
            r6 = r4
            goto L_0x0054
        L_0x00fd:
            int r12 = r0.size()     // Catch:{ all -> 0x0045 }
            if (r12 != 0) goto L_0x0145
            if (r6 != 0) goto L_0x0145
            if (r3 != 0) goto L_0x0145
            java.lang.String r12 = "onLoadError(): No other available smashes"
            f((java.lang.String) r12)     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.f4084y     // Catch:{ all -> 0x0045 }
            if (r12 != 0) goto L_0x0114
            r12 = 0
            r11.i(r12, r5)     // Catch:{ all -> 0x0045 }
        L_0x0114:
            r12 = 81001(0x13c69, float:1.13507E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r7][]     // Catch:{ all -> 0x0045 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "errorCode"
            r3[r5] = r6     // Catch:{ all -> 0x0045 }
            r6 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0045 }
            r3[r4] = r6     // Catch:{ all -> 0x0045 }
            r2[r5] = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "reason"
            r3[r5] = r6     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "Mediation No fill"
            r3[r4] = r5     // Catch:{ all -> 0x0045 }
            r2[r4] = r3     // Catch:{ all -> 0x0045 }
            java.util.Map r2 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r2)     // Catch:{ all -> 0x0045 }
            r11.k(r12, r2)     // Catch:{ all -> 0x0045 }
            r12 = 3
            r11.j(r12)     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.R r12 = r11.f4073l     // Catch:{ all -> 0x0045 }
            r12.c()     // Catch:{ all -> 0x0045 }
        L_0x0145:
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            java.util.Iterator r12 = r0.iterator()
        L_0x014a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r12.next()
            com.ironsource.mediationsdk.B r0 = (com.ironsource.mediationsdk.B) r0
            r11.n(r0)
            goto L_0x014a
        L_0x015a:
            return
        L_0x015b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r12.f3827p     // Catch:{ all -> 0x0045 }
            r0.append(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0045 }
            com.ironsource.mediationsdk.D r2 = r11.f4067e     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r2.f3843b     // Catch:{ all -> 0x0045 }
            r0.append(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0045 }
            f((java.lang.String) r0)     // Catch:{ all -> 0x0045 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r7][]     // Catch:{ all -> 0x0045 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0045 }
            java.lang.String r8 = "errorCode"
            r3[r5] = r8     // Catch:{ all -> 0x0045 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0045 }
            r3[r4] = r6     // Catch:{ all -> 0x0045 }
            r2[r5] = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "reason"
            r3[r5] = r6     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0045 }
            int r6 = r11.f4085z     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = androidx.fragment.app.w0.l(r6)     // Catch:{ all -> 0x0045 }
            r5.append(r6)     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0045 }
            r3[r4] = r5     // Catch:{ all -> 0x0045 }
            r2[r4] = r3     // Catch:{ all -> 0x0045 }
            r12.b(r0, r2)     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            return
        L_0x01b0:
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.a0.b(com.ironsource.mediationsdk.B):void");
    }

    public final void b(B b10, Placement placement) {
        e(b10, "onRewardedVideoAdClicked");
        P.a().b(placement, this.f4067e.a(b10.f3827p));
    }

    public final boolean b() {
        if ((!this.f4079r || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f4085z == 5 && !this.f4084y) {
            Iterator<B> it = this.f4067e.a().iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(int i10, Map<String, Object> map, boolean z9, boolean z10) {
        HashMap c10 = v0.c(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        c10.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z10 && !TextUtils.isEmpty(this.f4067e.f3843b)) {
            c10.put("auctionId", this.f4067e.f3843b);
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null && jSONObject.length() > 0) {
            c10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.k);
        }
        if (z9 && !TextUtils.isEmpty(this.f4082v)) {
            c10.put("placement", this.f4082v);
        }
        if (i10 == 1003 || i10 == 1302 || i10 == 1301 || i10 == 1303) {
            i.d();
            com.ironsource.mediationsdk.events.b.a(c10, this.f4077p, this.f4076o);
        }
        c10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    c10.putAll(map);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        i.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(c10)));
    }

    public final void d() {
        f("onLoadTriggered: RV load was triggered in " + w0.l(this.f4085z) + " state");
        d(0);
    }

    public final void d(long j10) {
        if (this.f4081t.a()) {
            f("all smashes are capped");
            k(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            o();
            return;
        }
        this.f4812b.a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
        if (this.f4074m) {
            if (!this.f4069g.isEmpty()) {
                this.f4071i.a(this.f4069g);
                this.f4069g.clear();
            }
            new Timer().schedule(new a(), j10);
            return;
        }
        f("auction fallback flow starting");
        l();
        if (this.f4067e.a().isEmpty()) {
            f("loadSmashes -  waterfall is empty");
            k(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            o();
            return;
        }
        c(1000, (Map<String, Object>) null, false, false);
        m();
    }

    public final void d(B b10) {
        String str;
        e(b10, "onRewardedVideoAdClosed, mediation state: " + w0.g(this.f4085z));
        P.a().b(this.f4067e.a(b10.f3827p));
        this.f4084y = false;
        boolean z9 = this.f4085z == 5;
        StringBuilder sb = new StringBuilder();
        if (z9) {
            Iterator<B> it = this.f4067e.a().iterator();
            while (it.hasNext()) {
                B next = it.next();
                if (next.f3820h == B.a.LOADED) {
                    sb.append(next.n() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        b10.a((int) IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (b10.equals(this.f4067e.f3845d)) {
            this.f4067e.a((B) null);
            if (this.f4085z != 5) {
                i((Map) null, false);
            }
        }
    }

    public final void e(B b10) {
        e(b10, "onRewardedVideoAdStarted");
        P.a().b();
    }

    public final void f(B b10) {
        e(b10, "onRewardedVideoAdEnded");
        P.a().c();
    }

    public final void g(String str, List list, JSONObject jSONObject) {
        String str2;
        this.f4068f.clear();
        this.f4069g.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.adunit.a.a aVar = (com.ironsource.mediationsdk.adunit.a.a) it.next();
            StringBuilder sb2 = new StringBuilder();
            B b10 = this.f4080s.get(aVar.a());
            if (b10 != null) {
                str2 = Integer.toString(b10.l());
            } else if (TextUtils.isEmpty(aVar.b())) {
                str2 = IronSourceConstants.BOOLEAN_TRUE_AS_STRING;
            } else {
                str2 = "2";
            }
            StringBuilder g10 = f.g(str2);
            g10.append(aVar.a());
            sb2.append(g10.toString());
            sb2.append(",");
            sb.append(sb2.toString());
            B b11 = this.f4080s.get(aVar.a());
            if (b11 != null) {
                AbstractAdapter a10 = C0180c.a().a(b11.f3986b.f4703a);
                if (a10 != null) {
                    B b12 = new B(b11, this, a10, this.u, str, jSONObject, this.f4077p, this.f4076o);
                    b12.f3987c = true;
                    copyOnWriteArrayList.add(b12);
                    this.f4068f.put(b12.n(), aVar);
                    this.f4069g.put(aVar.a(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                f("updateWaterfall() - could not find matching smash for auction response item " + aVar.a());
            }
        }
        this.f4067e.a((CopyOnWriteArrayList<B>) copyOnWriteArrayList, str);
        if (this.f4067e.b()) {
            k(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f4067e.f3842a.size()}}));
        }
        f("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            f("Updated waterfall is empty");
        }
        k(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    public final void h(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            k(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
            f("makeAuction() failed - No candidates available for auctioning");
            o();
            return;
        }
        f("makeAuction() - request waterfall is: " + str);
        c(1000, (Map<String, Object>) null, false, false);
        c(IronSourceConstants.RV_AUCTION_REQUEST, (Map<String, Object>) null, false, false);
        c(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}), false, false);
        this.f4072j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f4071i, this.u, this.f4813c);
    }

    public final void i(Map map, boolean z9) {
        synchronized (this.C) {
            Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z9) {
                this.B = Boolean.valueOf(z9);
                long time = new Date().getTime() - this.A;
                this.A = new Date().getTime();
                if (map == null) {
                    map = new HashMap();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                k(z9 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                P a10 = P.a();
                D d10 = this.f4067e;
                a10.a(z9, d10.a(d10.f3843b));
            }
        }
    }

    public final void j(int i10) {
        f("current state=" + w0.l(this.f4085z) + ", new state=" + w0.l(i10));
        this.f4085z = i10;
    }

    public final void k(int i10, Map<String, Object> map) {
        c(i10, map, false, true);
    }

    public final void l() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (B next : this.f4080s.values()) {
            if (!next.h() && !this.f4081t.b(next) && this.f4067e.b(next)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.adunit.a.a(next.n()));
            }
        }
        g("fallback_" + System.currentTimeMillis(), copyOnWriteArrayList, this.k);
    }

    public final void m() {
        if (this.f4067e.a().isEmpty()) {
            f("loadSmashes -  waterfall is empty");
            k(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            o();
            return;
        }
        j(4);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4067e.a().size() && i10 < this.w; i11++) {
            B b10 = this.f4067e.a().get(i11);
            if (b10.f3987c) {
                if (!this.f4083x || !b10.h()) {
                    n(b10);
                    i10++;
                } else if (i10 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + b10.n() + ". No other instances will be loaded at the same time.";
                    f(str);
                    IronSourceUtils.sendAutomationLog(str);
                    n(b10);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + b10.n() + " as a non bidder is being loaded";
                    f(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    public final void n(B b10) {
        String b11 = this.f4068f.get(b10.n()).b();
        JSONObject c10 = this.f4068f.get(b10.n()).c();
        b10.a(b11);
        b10.a(b11, c10);
    }

    public final void o() {
        j(3);
        if (!this.f4084y) {
            i((Map) null, false);
        }
        this.f4073l.c();
    }

    public class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f4088a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ StringBuilder f4089b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ List f4090c;

        public c(HashMap hashMap, StringBuilder sb, ArrayList arrayList) {
            this.f4088a = hashMap;
            this.f4089b = sb;
            this.f4090c = arrayList;
        }

        public final void a(String str) {
            a0.this.c(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}), false, false);
            a0.this.h(this.f4088a, this.f4090c, this.f4089b.toString());
        }

        public final void a(List<com.ironsource.mediationsdk.utils.j> list, long j10, List<String> list2) {
            a0.this.c(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}), false, false);
            for (com.ironsource.mediationsdk.utils.j next : list) {
                B b10 = a0.this.f4080s.get(next.b());
                if (next.c() != null) {
                    this.f4088a.put(next.b(), next.c());
                    StringBuilder sb = this.f4089b;
                    sb.append(next.a());
                    sb.append(next.b());
                    sb.append(",");
                    if (b10 != null) {
                        b10.b(1021, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(next.d())}});
                    }
                } else if (b10 != null) {
                    b10.b(1022, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(next.d())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, next.e()}});
                }
            }
            for (String str : list2) {
                B b11 = a0.this.f4080s.get(str);
                if (b11 != null) {
                    b11.b(1023, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
                }
            }
            a0.this.h(this.f4088a, this.f4090c, this.f4089b.toString());
        }
    }

    public final void c(B b10) {
        this.f4067e.a(b10);
        this.u++;
        e(b10, "onRewardedVideoAdOpened");
        if (this.f4074m) {
            com.ironsource.mediationsdk.adunit.a.a aVar = this.f4068f.get(b10.n());
            if (aVar != null) {
                D d10 = this.f4067e;
                d10.a(d10.f3843b, aVar.a(this.f4082v));
                C0183f.a(aVar, b10.l(), this.f4070h, this.f4082v);
                this.f4069g.put(b10.n(), h.a.ISAuctionPerformanceShowedSuccessfully);
                b(aVar, this.f4082v);
            } else {
                String n2 = b10.n();
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: " + ("onRewardedVideoAdOpened showing instance " + n2 + " missing from waterfall"), 3);
                k(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + w0.l(this.f4085z)}, new Object[]{IronSourceConstants.EVENTS_EXT1, n2}}));
            }
        }
        P.a().a(this.f4067e.a(b10.f3827p));
        i((Map) null, false);
        this.f4073l.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0133, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.B r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.C
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x00a9 }
            int r2 = r12.f4085z     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = androidx.fragment.app.w0.l(r2)     // Catch:{ all -> 0x00a9 }
            r1.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a9 }
            e(r13, r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r13.f3827p     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.D r2 = r12.f4067e     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r2.f3843b     // Catch:{ all -> 0x00a9 }
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 != r2) goto L_0x0134
            int r1 = r12.f4085z     // Catch:{ all -> 0x00a9 }
            if (r1 != r5) goto L_0x002b
            goto L_0x0134
        L_0x002b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r1 = r12.f4069g     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r13.n()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.h$a r6 = com.ironsource.mediationsdk.h.a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x00a9 }
            r1.put(r2, r6)     // Catch:{ all -> 0x00a9 }
            int r1 = r12.f4085z     // Catch:{ all -> 0x00a9 }
            r2 = 4
            if (r1 != r2) goto L_0x0132
            r1 = 5
            r12.j(r1)     // Catch:{ all -> 0x00a9 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x00a9 }
            r1.<init>()     // Catch:{ all -> 0x00a9 }
            long r6 = r1.getTime()     // Catch:{ all -> 0x00a9 }
            long r8 = r12.f4075n     // Catch:{ all -> 0x00a9 }
            long r6 = r6 - r8
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r8 = new java.lang.Object[r4][]     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r10 = "duration"
            r9[r3] = r10     // Catch:{ all -> 0x00a9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00a9 }
            r9[r4] = r6     // Catch:{ all -> 0x00a9 }
            r8[r3] = r9     // Catch:{ all -> 0x00a9 }
            java.util.Map r6 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r8)     // Catch:{ all -> 0x00a9 }
            r12.k(r1, r6)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.r r1 = r12.D     // Catch:{ all -> 0x00a9 }
            r6 = 0
            r1.a(r6)     // Catch:{ all -> 0x00a9 }
            boolean r1 = r12.f4074m     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x012e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r1 = r12.f4068f     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = r13.n()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x00a9 }
            r11 = r1
            com.ironsource.mediationsdk.adunit.a.a r11 = (com.ironsource.mediationsdk.adunit.a.a) r11     // Catch:{ all -> 0x00a9 }
            if (r11 == 0) goto L_0x00ac
            com.ironsource.mediationsdk.D r1 = r12.f4067e     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r1.f3843b     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = ""
            com.ironsource.mediationsdk.impressionData.ImpressionData r3 = r11.a((java.lang.String) r3)     // Catch:{ all -> 0x00a9 }
            r1.a((java.lang.String) r2, (com.ironsource.mediationsdk.impressionData.ImpressionData) r3)     // Catch:{ all -> 0x00a9 }
            int r1 = r13.l()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.adunit.a.a r2 = r12.f4070h     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.C0183f.a((com.ironsource.mediationsdk.adunit.a.a) r11, (int) r1, (com.ironsource.mediationsdk.adunit.a.a) r2)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.f r6 = r12.f4072j     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.D r1 = r12.f4067e     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.CopyOnWriteArrayList r7 = r1.a()     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r8 = r12.f4068f     // Catch:{ all -> 0x00a9 }
            int r9 = r13.l()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.adunit.a.a r10 = r12.f4070h     // Catch:{ all -> 0x00a9 }
            r6.a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.O>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a>) r8, (int) r9, (com.ironsource.mediationsdk.adunit.a.a) r10, (com.ironsource.mediationsdk.adunit.a.a) r11)     // Catch:{ all -> 0x00a9 }
            goto L_0x012e
        L_0x00a9:
            r13 = move-exception
            goto L_0x0189
        L_0x00ac:
            java.lang.String r1 = r13.n()     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "onLoadSuccess winner instance "
            r6.<init>(r7)     // Catch:{ all -> 0x00a9 }
            r6.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = " missing from waterfall. auctionId: "
            r6.append(r7)     // Catch:{ all -> 0x00a9 }
            java.lang.String r13 = r13.f3827p     // Catch:{ all -> 0x00a9 }
            r6.append(r13)     // Catch:{ all -> 0x00a9 }
            java.lang.String r13 = " and the current id is "
            r6.append(r13)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.D r13 = r12.f4067e     // Catch:{ all -> 0x00a9 }
            java.lang.String r13 = r13.f3843b     // Catch:{ all -> 0x00a9 }
            r6.append(r13)     // Catch:{ all -> 0x00a9 }
            java.lang.String r13 = r6.toString()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "LWSProgRvManager: "
            r8.<init>(r9)     // Catch:{ all -> 0x00a9 }
            r8.append(r13)     // Catch:{ all -> 0x00a9 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x00a9 }
            r8 = 3
            r6.log(r7, r13, r8)     // Catch:{ all -> 0x00a9 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            java.lang.Object[][] r6 = new java.lang.Object[r8][]     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x00a9 }
            r8 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00a9 }
            r7[r4] = r8     // Catch:{ all -> 0x00a9 }
            r6[r3] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "reason"
            r7[r3] = r8     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r9 = "Loaded missing "
            r8.<init>(r9)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = androidx.fragment.app.w0.l(r2)     // Catch:{ all -> 0x00a9 }
            r8.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x00a9 }
            r7[r4] = r2     // Catch:{ all -> 0x00a9 }
            r6[r4] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "ext1"
            r2[r3] = r7     // Catch:{ all -> 0x00a9 }
            r2[r4] = r1     // Catch:{ all -> 0x00a9 }
            r6[r5] = r2     // Catch:{ all -> 0x00a9 }
            java.util.Map r1 = com.ironsource.environment.a.AnonymousClass1.a((java.lang.Object[][]) r6)     // Catch:{ all -> 0x00a9 }
            r12.k(r13, r1)     // Catch:{ all -> 0x00a9 }
        L_0x012e:
            r13 = 0
            r12.i(r13, r4)     // Catch:{ all -> 0x00a9 }
        L_0x0132:
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            return
        L_0x0134:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r13.f3827p     // Catch:{ all -> 0x00a9 }
            r1.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.D r2 = r12.f4067e     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = r2.f3843b     // Catch:{ all -> 0x00a9 }
            r1.append(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a9 }
            f((java.lang.String) r1)     // Catch:{ all -> 0x00a9 }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r5][]     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a9 }
            r6[r4] = r7     // Catch:{ all -> 0x00a9 }
            r2[r3] = r6     // Catch:{ all -> 0x00a9 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = "reason"
            r5[r3] = r6     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x00a9 }
            int r6 = r12.f4085z     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = androidx.fragment.app.w0.l(r6)     // Catch:{ all -> 0x00a9 }
            r3.append(r6)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a9 }
            r5[r4] = r3     // Catch:{ all -> 0x00a9 }
            r2[r4] = r5     // Catch:{ all -> 0x00a9 }
            r13.b(r1, r2)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            return
        L_0x0189:
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.a0.a(com.ironsource.mediationsdk.B):void");
    }

    public final void a(IronSourceError ironSourceError, B b10) {
        com.ironsource.mediationsdk.adunit.a.a aVar;
        if (this.f4074m && (aVar = this.f4068f.get(b10.n())) != null) {
            D d10 = this.f4067e;
            d10.a(d10.f3843b, aVar.a(this.f4082v));
        }
        e(b10, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f4084y = false;
        c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}), true, true);
        P.a().a(ironSourceError, this.f4067e.a(b10.f3827p));
        this.f4069g.put(b10.n(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.f4085z != 5) {
            i((Map) null, false);
        }
        this.f4073l.b();
    }

    public final void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        f("makeAuction(): success");
        this.f4070h = aVar;
        this.f4077p = i10;
        this.k = jSONObject;
        this.f4076o = "";
        if (!TextUtils.isEmpty(str2)) {
            k(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        this.f4812b.a(ad_unit, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
        if (this.f4812b.a(ad_unit)) {
            k(IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            o();
            return;
        }
        g(str, list, this.k);
        k(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
        m();
    }
}
