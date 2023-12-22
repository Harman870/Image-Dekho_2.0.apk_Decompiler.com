package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.f;
import androidx.fragment.app.v0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C0189n;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.bidding.d;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.services.IMediationServiceEditor;
import com.ironsource.mediationsdk.services.IMediationServiceProvider;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.j;
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
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class I extends C0190o implements J, C0181d {
    public final Object A;
    public com.ironsource.mediationsdk.utils.d B;
    public final boolean C;
    public final long D;
    public final c E;

    /* renamed from: e  reason: collision with root package name */
    public final com.ironsource.mediationsdk.services.a f3894e;

    /* renamed from: f  reason: collision with root package name */
    public final a.C0056a f3895f;

    /* renamed from: g  reason: collision with root package name */
    public com.ironsource.mediationsdk.events.d f3896g;

    /* renamed from: h  reason: collision with root package name */
    public int f3897h;

    /* renamed from: i  reason: collision with root package name */
    public com.ironsource.lifecycle.a.a f3898i;

    /* renamed from: j  reason: collision with root package name */
    public IronSourceBannerLayout f3899j;
    public com.ironsource.mediationsdk.model.e k;

    /* renamed from: l  reason: collision with root package name */
    public int f3900l;

    /* renamed from: m  reason: collision with root package name */
    public K f3901m;

    /* renamed from: n  reason: collision with root package name */
    public int f3902n;

    /* renamed from: o  reason: collision with root package name */
    public final ConcurrentHashMap<String, K> f3903o;

    /* renamed from: p  reason: collision with root package name */
    public CopyOnWriteArrayList<K> f3904p;

    /* renamed from: q  reason: collision with root package name */
    public String f3905q;

    /* renamed from: r  reason: collision with root package name */
    public JSONObject f3906r;

    /* renamed from: s  reason: collision with root package name */
    public String f3907s;

    /* renamed from: t  reason: collision with root package name */
    public int f3908t;
    public C0183f u;

    /* renamed from: v  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.a.a f3909v;
    public h w;

    /* renamed from: x  reason: collision with root package name */
    public ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> f3910x;

    /* renamed from: y  reason: collision with root package name */
    public ConcurrentHashMap<String, h.a> f3911y;

    /* renamed from: z  reason: collision with root package name */
    public long f3912z;

    public class a implements C0189n.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.mediationsdk.model.e f3913a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceBannerLayout f3914b;

        public a(com.ironsource.mediationsdk.model.e eVar, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f3913a = eVar;
            this.f3914b = ironSourceBannerLayout;
        }

        public final void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f3913a.getPlacementName());
            I i10 = I.this;
            i10.f3899j = this.f3914b;
            i10.k = this.f3913a;
            if (j.b(ContextProvider.getInstance().getApplicationContext(), this.f3913a.getPlacementName())) {
                ironLog.verbose("placement is capped");
                C0192q a10 = C0192q.a();
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
                a10.a(ad_unit, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.f3913a.getPlacementName() + " is capped"));
                I.this.d(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                I.this.i(2);
                return;
            }
            I.this.a(false);
        }

        public final void a(String str) {
            IronLog ironLog = IronLog.API;
            ironLog.error("can't load banner - errorMessage = " + str);
        }
    }

    public class b implements C0189n.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceBannerLayout f3916a;

        public b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f3916a = ironSourceBannerLayout;
        }

        public final void a() {
            int i10;
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("destroying banner");
            I.this.f3898i.a();
            I i11 = I.this;
            K k = i11.f3901m;
            if (k != null) {
                i10 = k.p();
            } else {
                i10 = i11.f3902n;
            }
            I.this.e(IronSourceConstants.BN_DESTROY, (Object[][]) null, i10);
            I i12 = I.this;
            if (i12.f3901m != null) {
                ironLog.verbose("mActiveSmash = " + i12.f3901m.s());
                i12.f3901m.a();
                i12.f3901m = null;
            }
            IronSourceBannerLayout ironSourceBannerLayout = this.f3916a;
            ironSourceBannerLayout.f3934d = true;
            ironSourceBannerLayout.f3933c = null;
            ironSourceBannerLayout.f3931a = null;
            ironSourceBannerLayout.f3932b = null;
            ironSourceBannerLayout.f3935e = null;
            ironSourceBannerLayout.removeBannerListener();
            I i13 = I.this;
            i13.f3899j = null;
            i13.k = null;
            i13.i(2);
        }

        public final void a(String str) {
            IronLog ironLog = IronLog.API;
            ironLog.error("destroy banner failed - errorMessage = " + str);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x002a }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ all -> 0x002a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.ironsource.mediationsdk.I r3 = com.ironsource.mediationsdk.I.this     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.IronSourceBannerLayout r4 = r3.f3899j     // Catch:{ all -> 0x002a }
                java.lang.String r5 = "errorCode"
                r6 = 3200(0xc80, float:4.484E-42)
                if (r4 != 0) goto L_0x002d
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x002a }
                java.lang.String r4 = "mIronSourceBanner is null"
                r3.verbose(r4)     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.I r3 = com.ironsource.mediationsdk.I.this     // Catch:{ all -> 0x002a }
                java.lang.Object[][] r4 = new java.lang.Object[r1][]     // Catch:{ all -> 0x002a }
                java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x002a }
                r7[r2] = r5     // Catch:{ all -> 0x002a }
                r5 = 622(0x26e, float:8.72E-43)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x002a }
                r7[r1] = r5     // Catch:{ all -> 0x002a }
                r4[r2] = r7     // Catch:{ all -> 0x002a }
                r3.d(r6, r4)     // Catch:{ all -> 0x002a }
                return
            L_0x002a:
                r3 = move-exception
                goto L_0x00c9
            L_0x002d:
                boolean r4 = r4.isShown()     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x003b
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x002a }
                java.lang.String r4 = "banner or one of its parents are INVISIBLE or GONE"
            L_0x0037:
                r3.verbose(r4)     // Catch:{ all -> 0x002a }
                goto L_0x0048
            L_0x003b:
                com.ironsource.mediationsdk.IronSourceBannerLayout r4 = r3.f3899j     // Catch:{ all -> 0x002a }
                boolean r4 = r4.hasWindowFocus()     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x004a
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x002a }
                java.lang.String r4 = "banner has no window focus"
                goto L_0x0037
            L_0x0048:
                r3 = r2
                goto L_0x0068
            L_0x004a:
                android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ all -> 0x002a }
                r4.<init>()     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r3.f3899j     // Catch:{ all -> 0x002a }
                boolean r3 = r3.getGlobalVisibleRect(r4)     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x002a }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
                java.lang.String r8 = "visible = "
                r7.<init>(r8)     // Catch:{ all -> 0x002a }
                r7.append(r3)     // Catch:{ all -> 0x002a }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x002a }
                r4.verbose(r7)     // Catch:{ all -> 0x002a }
            L_0x0068:
                if (r3 == 0) goto L_0x0098
                com.ironsource.mediationsdk.I r3 = com.ironsource.mediationsdk.I.this     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x002a }
                java.lang.String r5 = ""
                r4.verbose(r5)     // Catch:{ all -> 0x002a }
                r5 = 8
                r6 = 3
                boolean r5 = r3.j(r5, r6)     // Catch:{ all -> 0x002a }
                if (r5 == 0) goto L_0x0080
                r3.a((boolean) r1)     // Catch:{ all -> 0x002a }
                goto L_0x0097
            L_0x0080:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
                java.lang.String r6 = "wrong state = "
                r5.<init>(r6)     // Catch:{ all -> 0x002a }
                int r3 = r3.f3897h     // Catch:{ all -> 0x002a }
                java.lang.String r3 = androidx.activity.e.f(r3)     // Catch:{ all -> 0x002a }
                r5.append(r3)     // Catch:{ all -> 0x002a }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x002a }
                r4.error(r3)     // Catch:{ all -> 0x002a }
            L_0x0097:
                return
            L_0x0098:
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x002a }
                java.lang.String r4 = "banner is not visible, reload skipped"
                r3.verbose(r4)     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.I r3 = com.ironsource.mediationsdk.I.this     // Catch:{ all -> 0x002a }
                java.lang.Object[][] r4 = new java.lang.Object[r1][]     // Catch:{ all -> 0x002a }
                java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x002a }
                r7[r2] = r5     // Catch:{ all -> 0x002a }
                r5 = 613(0x265, float:8.59E-43)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x002a }
                r7[r1] = r5     // Catch:{ all -> 0x002a }
                r4[r2] = r7     // Catch:{ all -> 0x002a }
                r3.d(r6, r4)     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.I r3 = com.ironsource.mediationsdk.I.this     // Catch:{ all -> 0x002a }
                com.ironsource.lifecycle.a.a r4 = r3.f3898i     // Catch:{ all -> 0x002a }
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002a }
                com.ironsource.mediationsdk.events.d r3 = r3.f3896g     // Catch:{ all -> 0x002a }
                int r3 = r3.g()     // Catch:{ all -> 0x002a }
                long r6 = (long) r3     // Catch:{ all -> 0x002a }
                long r5 = r5.toMillis(r6)     // Catch:{ all -> 0x002a }
                r4.a(r5)     // Catch:{ all -> 0x002a }
                return
            L_0x00c9:
                com.ironsource.mediationsdk.I r4 = com.ironsource.mediationsdk.I.this
                r5 = 83513(0x14639, float:1.17027E-40)
                java.lang.Object[][] r6 = new java.lang.Object[r1][]
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r7 = "reason"
                r0[r2] = r7
                java.lang.String r3 = r3.getMessage()
                r0[r1] = r3
                r6[r2] = r0
                r4.d(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.I.c.run():void");
        }
    }

    public class d implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f3919a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ StringBuilder f3920b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ List f3921c;

        public d(StringBuilder sb, ArrayList arrayList, HashMap hashMap) {
            this.f3919a = hashMap;
            this.f3920b = sb;
            this.f3921c = arrayList;
        }

        public final void a(String str) {
            I.this.d(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, str}});
            I.this.g(this.f3919a, this.f3921c, this.f3920b);
        }

        public final void a(List<j> list, long j10, List<String> list2) {
            I.this.d(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            for (j next : list) {
                if (next.c() != null) {
                    this.f3919a.put(next.b(), next.c());
                    StringBuilder sb = this.f3920b;
                    sb.append(next.a());
                    sb.append(next.b());
                    sb.append(",");
                    I.this.f3903o.get(next.b()).a((int) IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(next.d())}});
                } else {
                    I.this.f3903o.get(next.b()).a((int) IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(next.d())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, next.e()}});
                }
            }
            for (String str : list2) {
                ConcurrentHashMap<String, K> concurrentHashMap = I.this.f3903o;
                concurrentHashMap.get(str).a((int) IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            }
            I.this.g(this.f3919a, this.f3921c, this.f3920b);
        }
    }

    public class e extends TimerTask {
        public e() {
        }

        public final void run() {
            I i10 = I.this;
            i10.getClass();
            IronLog.INTERNAL.verbose();
            AsyncTask.execute(new r7.b(i10));
        }
    }

    public I() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(List<NetworkSettings> list, com.ironsource.mediationsdk.events.d dVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        IMediationServiceProvider provider = MediationServices.getProvider();
        IMediationServiceEditor editor = MediationServices.getEditor();
        this.f3897h = 1;
        this.f3907s = "";
        this.A = new Object();
        this.E = new c();
        com.ironsource.mediationsdk.services.a sessionDepthService = provider.getSessionDepthService();
        this.f3894e = sessionDepthService;
        this.f3895f = editor.getSessionDepthServiceEditor();
        long b10 = v0.b();
        d(IronSourceConstants.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + dVar.c());
        this.f3896g = dVar;
        this.f3903o = new ConcurrentHashMap<>();
        this.f3904p = new CopyOnWriteArrayList<>();
        this.f3910x = new ConcurrentHashMap<>();
        this.f3911y = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f3902n = sessionDepthService.a(ad_unit);
        C0192q.a().a(ad_unit, this.f3896g.e());
        if (this.f3896g.c()) {
            this.u = new C0183f(ad_unit, this.f3896g.h(), this);
        }
        this.w = new h(list, this.f3896g.h().f4978d);
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings cVar : list) {
            arrayList.add(new r7.c(this, cVar));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(dVar.i().f4723m, dVar.i().f4724n, arrayList);
        this.f3912z = new Date().getTime();
        i(2);
        this.C = dVar.j();
        this.D = dVar.k();
        this.f3898i = new com.ironsource.lifecycle.a.a(this.E, com.ironsource.lifecycle.d.a(), new C0189n());
        d(IronSourceConstants.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - b10)}});
    }

    public static void h(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c10 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c10 == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c10 == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c10 == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c10 == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = "Adaptive=true";
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }

    public final void a(int i10, String str, int i11, String str2, long j10) {
        boolean z9;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        synchronized (this.A) {
            int i12 = this.f3897h;
            if (i12 != 4) {
                if (i12 != 5) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        if (z9) {
            this.f3907s = str2;
            this.f3908t = i11;
            this.f3906r = null;
            l();
            d(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            i(this.f3897h == 4 ? 6 : 7);
            k();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + androidx.activity.e.f(this.f3897h));
    }

    public final void a(K k10) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(k10.s());
        if (n()) {
            l.a().d(this.f4814d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        e(IronSourceConstants.BN_CALLBACK_CLICK, objArr, k10.p());
    }

    public final void b(K k10) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(k10.s());
        if (n()) {
            l.a().b(this.f4814d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        e(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, k10.p());
    }

    public final String c(List<com.ironsource.mediationsdk.adunit.a.a> list) {
        int i10;
        int i11;
        String str;
        boolean z9;
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f3904p.clear();
        this.f3910x.clear();
        this.f3911y.clear();
        StringBuilder sb = new StringBuilder();
        int i12 = 0;
        while (i12 < list.size()) {
            com.ironsource.mediationsdk.adunit.a.a aVar = list.get(i12);
            K k10 = this.f3903o.get(aVar.a());
            if (k10 != null) {
                AbstractAdapter a10 = C0180c.a().a(k10.f3986b.f4703a);
                if (a10 != null) {
                    com.ironsource.mediationsdk.events.d dVar = this.f3896g;
                    NetworkSettings networkSettings = k10.f3986b.f4703a;
                    int i13 = this.f3902n;
                    String str2 = this.f3905q;
                    JSONObject jSONObject = this.f3906r;
                    int i14 = this.f3908t;
                    String str3 = this.f3907s;
                    int i15 = this.f3897h;
                    if (i15 == 7 || i15 == 5) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i10 = i12;
                    K k11 = r0;
                    K k12 = new K(dVar, this, networkSettings, a10, i13, str2, jSONObject, i14, str3, z9);
                    k11.f3987c = true;
                    this.f3904p.add(k11);
                    this.f3910x.put(k11.n(), aVar);
                    this.f3911y.put(aVar.a(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                    i11 = 1;
                } else {
                    i10 = i12;
                    i11 = 1;
                }
            } else {
                i10 = i12;
                i11 = 1;
                IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + aVar.a());
            }
            K k13 = this.f3903o.get(aVar.a());
            if (k13 == null ? !TextUtils.isEmpty(aVar.b()) : k13.h()) {
                str = "2";
            } else {
                str = IronSourceConstants.BOOLEAN_TRUE_AS_STRING;
            }
            StringBuilder g10 = f.g(str);
            g10.append(aVar.a());
            sb.append(g10.toString());
            int i16 = i10;
            if (i16 != list.size() - i11) {
                sb.append(",");
            }
            i12 = i16 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    public final void c(K k10) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(k10.s());
        if (n()) {
            l.a().a(this.f4814d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        e(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, k10.p());
    }

    public final void d(int i10, Object[][] objArr) {
        e(i10, objArr, this.f3902n);
    }

    public final void d(K k10) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(k10.s());
        if (n()) {
            l.a().c(this.f4814d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        e(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, k10.p());
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075 A[Catch:{ Exception -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d A[Catch:{ Exception -> 0x00a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r7, java.lang.Object[][] r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r0, r1, r1)
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f3899j     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x000f
            com.ironsource.mediationsdk.ISBannerSize r3 = r3.getSize()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            if (r3 == 0) goto L_0x0015
            h(r2, r3)     // Catch:{ Exception -> 0x00a1 }
        L_0x0015:
            com.ironsource.mediationsdk.model.e r3 = r6.k     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "placement"
            java.lang.String r4 = r6.o()     // Catch:{ Exception -> 0x00a1 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00a1 }
        L_0x0022:
            java.lang.String r3 = "sessionDepth"
            r2.put(r3, r9)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r9 = r6.f3905q     // Catch:{ Exception -> 0x00a1 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x00a1 }
            if (r9 != 0) goto L_0x0036
            java.lang.String r9 = "auctionId"
            java.lang.String r3 = r6.f3905q     // Catch:{ Exception -> 0x00a1 }
            r2.put(r9, r3)     // Catch:{ Exception -> 0x00a1 }
        L_0x0036:
            org.json.JSONObject r9 = r6.f3906r     // Catch:{ Exception -> 0x00a1 }
            if (r9 == 0) goto L_0x0047
            int r9 = r9.length()     // Catch:{ Exception -> 0x00a1 }
            if (r9 <= 0) goto L_0x0047
            java.lang.String r9 = "genericParams"
            org.json.JSONObject r3 = r6.f3906r     // Catch:{ Exception -> 0x00a1 }
            r2.put(r9, r3)     // Catch:{ Exception -> 0x00a1 }
        L_0x0047:
            r9 = 3201(0xc81, float:4.486E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3110(0xc26, float:4.358E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3111(0xc27, float:4.36E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3116(0xc2c, float:4.366E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3119(0xc2f, float:4.37E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3112(0xc28, float:4.361E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3115(0xc2b, float:4.365E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3501(0xdad, float:4.906E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3502(0xdae, float:4.907E-42)
            if (r7 == r9) goto L_0x0072
            r9 = 3506(0xdb2, float:4.913E-42)
            if (r7 != r9) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r9 = r0
            goto L_0x0073
        L_0x0072:
            r9 = r1
        L_0x0073:
            if (r9 == 0) goto L_0x008b
            java.lang.String r9 = "auctionTrials"
            int r3 = r6.f3908t     // Catch:{ Exception -> 0x00a1 }
            r2.put(r9, r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r9 = r6.f3907s     // Catch:{ Exception -> 0x00a1 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x00a1 }
            if (r9 != 0) goto L_0x008b
            java.lang.String r9 = "auctionFallback"
            java.lang.String r3 = r6.f3907s     // Catch:{ Exception -> 0x00a1 }
            r2.put(r9, r3)     // Catch:{ Exception -> 0x00a1 }
        L_0x008b:
            if (r8 == 0) goto L_0x00ab
            int r9 = r8.length     // Catch:{ Exception -> 0x00a1 }
            r3 = r0
        L_0x008f:
            if (r3 >= r9) goto L_0x00ab
            r4 = r8[r3]     // Catch:{ Exception -> 0x00a1 }
            r5 = r4[r0]     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00a1 }
            r4 = r4[r1]     // Catch:{ Exception -> 0x00a1 }
            r2.put(r5, r4)     // Catch:{ Exception -> 0x00a1 }
            int r3 = r3 + 1
            goto L_0x008f
        L_0x00a1:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r9.error(r8)
        L_0x00ab:
            com.ironsource.environment.c.a r8 = new com.ironsource.environment.c.a
            r8.<init>(r7, r2)
            com.ironsource.mediationsdk.events.e r7 = com.ironsource.mediationsdk.events.e.d()
            r7.a((com.ironsource.environment.c.a) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.I.e(int, java.lang.Object[][], int):void");
    }

    public final void f(K k10, com.ironsource.mediationsdk.adunit.a.a aVar) {
        C0183f.a(aVar, k10.l(), this.f3909v, o());
        b(this.f3910x.get(k10.n()), o());
    }

    public final void g(Map<String, Object> map, List<String> list, StringBuilder sb) {
        ISBannerSize iSBannerSize;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + sb);
        if (map.size() == 0 && list.size() == 0) {
            d(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            if (j(5, 8)) {
                this.f3898i.a(TimeUnit.SECONDS.toMillis((long) this.f3896g.g()));
                return;
            }
            C0192q.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            d(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            i(2);
            return;
        }
        d(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
        C0183f fVar = this.u;
        if (fVar != null) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            h hVar = this.w;
            int i10 = this.f3902n;
            IronSourceSegment ironSourceSegment = this.f4813c;
            IronSourceBannerLayout ironSourceBannerLayout = this.f3899j;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
                iSBannerSize = null;
            } else if (!this.f3899j.getSize().isSmart()) {
                iSBannerSize = this.f3899j.getSize();
            } else if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
                iSBannerSize = ISBannerSize.f3924e;
            } else {
                iSBannerSize = ISBannerSize.BANNER;
            }
            fVar.a(applicationContext, map, list, hVar, i10, ironSourceSegment, iSBannerSize);
            return;
        }
        ironLog.error("mAuctionHandler is null");
    }

    public final void i(int i10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + androidx.activity.e.f(this.f3897h) + "' to '" + androidx.activity.e.f(i10) + "'");
        synchronized (this.A) {
            this.f3897h = i10;
        }
    }

    public final boolean j(int i10, int i11) {
        boolean z9;
        synchronized (this.A) {
            try {
                if (this.f3897h == i10) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("set state from '" + androidx.activity.e.f(this.f3897h) + "' to '" + androidx.activity.e.f(i11) + "'");
                    z9 = true;
                    this.f3897h = i11;
                } else {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        if (r12.f3904p.isEmpty() == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        r4 = "Empty waterfall";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        r4 = "Mediation No fill";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        r5.verbose("errorReason = " + r4);
        m((com.ironsource.mediationsdk.K) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
        if (j(6, 2) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        d(com.ironsource.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_REASON, r4}, new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.mediationsdk.utils.d.a(r12.B))}});
        com.ironsource.mediationsdk.C0192q.a().a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_FILL, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fb, code lost:
        if (j(7, 8) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fd, code lost:
        d(com.ironsource.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(com.ironsource.mediationsdk.utils.d.a(r12.B))}});
        com.ironsource.mediationsdk.C0192q.a().a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_FILL, r4), true);
        r12.f3898i.a(java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r12.f3896g.g()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0137, code lost:
        i(2);
        r5.error("wrong state = " + androidx.activity.e.f(r12.f3897h));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0151, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r12 = this;
            java.lang.String r0 = "reason"
            r1 = 1
            r2 = 2
            r3 = 0
            int r4 = r12.f3900l     // Catch:{ Exception -> 0x005a }
        L_0x0007:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.K> r5 = r12.f3904p     // Catch:{ Exception -> 0x005a }
            int r5 = r5.size()     // Catch:{ Exception -> 0x005a }
            r6 = 0
            if (r4 >= r5) goto L_0x0086
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.K> r5 = r12.f3904p     // Catch:{ Exception -> 0x005a }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.K r5 = (com.ironsource.mediationsdk.K) r5     // Catch:{ Exception -> 0x005a }
            boolean r7 = r5.f3987c     // Catch:{ Exception -> 0x005a }
            if (r7 == 0) goto L_0x0083
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            java.lang.String r9 = "loading smash - "
            r8.<init>(r9)     // Catch:{ Exception -> 0x005a }
            java.lang.String r9 = r5.s()     // Catch:{ Exception -> 0x005a }
            r8.append(r9)     // Catch:{ Exception -> 0x005a }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x005a }
            r7.verbose(r8)     // Catch:{ Exception -> 0x005a }
            int r4 = r4 + r1
            r12.f3900l = r4     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.IronSourceBannerLayout r4 = r12.f3899j     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0082
            boolean r4 = r4.isDestroyed()     // Catch:{ Exception -> 0x005a }
            if (r4 != 0) goto L_0x0082
            boolean r4 = r5.h()     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x005d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r4 = r12.f3910x     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = r5.n()     // Catch:{ Exception -> 0x005a }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.adunit.a.a r4 = (com.ironsource.mediationsdk.adunit.a.a) r4     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = r4.b()     // Catch:{ Exception -> 0x005a }
            r5.a(r6)     // Catch:{ Exception -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r4 = move-exception
            goto L_0x0152
        L_0x005d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.a.a> r4 = r12.f3910x     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = r5.n()     // Catch:{ Exception -> 0x005a }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.adunit.a.a r4 = (com.ironsource.mediationsdk.adunit.a.a) r4     // Catch:{ Exception -> 0x005a }
            org.json.JSONObject r4 = r4.c()     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.IronSourceBannerLayout r7 = r12.f3899j     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.IronSourceBannerLayout r8 = new com.ironsource.mediationsdk.IronSourceBannerLayout     // Catch:{ Exception -> 0x005a }
            android.app.Activity r9 = r7.f3933c     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.ISBannerSize r10 = r7.f3931a     // Catch:{ Exception -> 0x005a }
            r8.<init>(r9, r10)     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = r7.f3932b     // Catch:{ Exception -> 0x005a }
            r8.setPlacementName(r7)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.model.e r7 = r12.k     // Catch:{ Exception -> 0x005a }
            r5.a(r8, r7, r6, r4)     // Catch:{ Exception -> 0x005a }
        L_0x0082:
            return
        L_0x0083:
            int r4 = r4 + 1
            goto L_0x0007
        L_0x0086:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.K> r4 = r12.f3904p     // Catch:{ Exception -> 0x005a }
            boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = "Empty waterfall"
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = "Mediation No fill"
        L_0x0093:
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            java.lang.String r8 = "errorReason = "
            r7.<init>(r8)     // Catch:{ Exception -> 0x005a }
            r7.append(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x005a }
            r5.verbose(r7)     // Catch:{ Exception -> 0x005a }
            r12.m(r6)     // Catch:{ Exception -> 0x005a }
            r6 = 6
            boolean r6 = r12.j(r6, r2)     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = "duration"
            r8 = 606(0x25e, float:8.49E-43)
            if (r6 == 0) goto L_0x00f4
            r5 = 3
            java.lang.Object[][] r5 = new java.lang.Object[r5][]     // Catch:{ Exception -> 0x005a }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005a }
            java.lang.String r9 = "errorCode"
            r6[r3] = r9     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x005a }
            r6[r1] = r9     // Catch:{ Exception -> 0x005a }
            r5[r3] = r6     // Catch:{ Exception -> 0x005a }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005a }
            r6[r3] = r0     // Catch:{ Exception -> 0x005a }
            r6[r1] = r4     // Catch:{ Exception -> 0x005a }
            r5[r1] = r6     // Catch:{ Exception -> 0x005a }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005a }
            r6[r3] = r7     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.utils.d r7 = r12.B     // Catch:{ Exception -> 0x005a }
            long r9 = com.ironsource.mediationsdk.utils.d.a(r7)     // Catch:{ Exception -> 0x005a }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x005a }
            r6[r1] = r7     // Catch:{ Exception -> 0x005a }
            r5[r2] = r6     // Catch:{ Exception -> 0x005a }
            r6 = 3111(0xc27, float:4.36E-42)
            r12.d(r6, r5)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x005a }
            r5.<init>(r8, r4)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.q r4 = com.ironsource.mediationsdk.C0192q.a()     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r6 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x005a }
            r4.a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6, (com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ Exception -> 0x005a }
            goto L_0x0172
        L_0x00f4:
            r6 = 7
            r9 = 8
            boolean r6 = r12.j(r6, r9)     // Catch:{ Exception -> 0x005a }
            if (r6 == 0) goto L_0x0137
            r5 = 3201(0xc81, float:4.486E-42)
            java.lang.Object[][] r6 = new java.lang.Object[r1][]     // Catch:{ Exception -> 0x005a }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005a }
            r9[r3] = r7     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.utils.d r7 = r12.B     // Catch:{ Exception -> 0x005a }
            long r10 = com.ironsource.mediationsdk.utils.d.a(r7)     // Catch:{ Exception -> 0x005a }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x005a }
            r9[r1] = r7     // Catch:{ Exception -> 0x005a }
            r6[r3] = r9     // Catch:{ Exception -> 0x005a }
            r12.d(r5, r6)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x005a }
            r5.<init>(r8, r4)     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.q r4 = com.ironsource.mediationsdk.C0192q.a()     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r6 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x005a }
            r4.a(r6, r5, r1)     // Catch:{ Exception -> 0x005a }
            com.ironsource.lifecycle.a.a r4 = r12.f3898i     // Catch:{ Exception -> 0x005a }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x005a }
            com.ironsource.mediationsdk.events.d r6 = r12.f3896g     // Catch:{ Exception -> 0x005a }
            int r6 = r6.g()     // Catch:{ Exception -> 0x005a }
            long r6 = (long) r6     // Catch:{ Exception -> 0x005a }
            long r5 = r5.toMillis(r6)     // Catch:{ Exception -> 0x005a }
            r4.a(r5)     // Catch:{ Exception -> 0x005a }
            goto L_0x0172
        L_0x0137:
            r12.i(r2)     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = "wrong state = "
            r4.<init>(r6)     // Catch:{ Exception -> 0x005a }
            int r6 = r12.f3897h     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = androidx.activity.e.f(r6)     // Catch:{ Exception -> 0x005a }
            r4.append(r6)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x005a }
            r5.error(r4)     // Catch:{ Exception -> 0x005a }
            return
        L_0x0152:
            r5 = 83072(0x14480, float:1.16409E-40)
            java.lang.Object[][] r6 = new java.lang.Object[r2][]
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = "ext1"
            r7[r3] = r8
            java.lang.String r8 = "loadNextSmash"
            r7[r1] = r8
            r6[r3] = r7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r0
            java.lang.String r0 = android.util.Log.getStackTraceString(r4)
            r2[r1] = r0
            r6[r1] = r2
            r12.d(r5, r6)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.I.k():void");
    }

    public final void l() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (K next : this.f3903o.values()) {
            if (!next.h() && !j.b(ContextProvider.getInstance().getApplicationContext(), o())) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.adunit.a.a(next.n()));
            }
        }
        this.f3905q = "fallback_" + System.currentTimeMillis();
        c((List<com.ironsource.mediationsdk.adunit.a.a>) copyOnWriteArrayList);
    }

    public final void m(K k10) {
        Iterator<K> it = this.f3904p.iterator();
        while (it.hasNext()) {
            K next = it.next();
            if (!next.equals(k10)) {
                next.f();
            }
        }
    }

    public final boolean n() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f3899j;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    public final String o() {
        com.ironsource.mediationsdk.model.e eVar = this.k;
        return eVar != null ? eVar.getPlacementName() : "";
    }

    public final void e(K k10) {
        boolean z9;
        com.ironsource.mediationsdk.adunit.a.a aVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k10.s());
        synchronized (this.A) {
            z9 = this.f3897h == 8;
        }
        if (z9) {
            if (this.f3896g.c() && this.f3896g.h().f4988o && (aVar = this.f3910x.get(k10.n())) != null) {
                f(k10, aVar);
            }
            d(IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + androidx.activity.e.f(this.f3897h));
        String n2 = k10.n();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        d(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + androidx.activity.e.f(this.f3897h)}, new Object[]{IronSourceConstants.EVENTS_EXT1, n2}});
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.e eVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f4812b.a(ad_unit, false);
        a_();
        if (!j(2, 3)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C0192q.a().a(ad_unit)) {
            a aVar = new a(eVar, ironSourceBannerLayout);
            String str = null;
            if (!(ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed())) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                str = String.format("can't load banner - %s", objArr);
            }
            if (eVar == null || TextUtils.isEmpty(eVar.getPlacementName())) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = eVar == null ? "placement is null" : "placement name is empty";
                str = String.format("can't load banner - %s", objArr2);
            }
            if (!TextUtils.isEmpty(str)) {
                ironLog.error(str);
                aVar.a(str);
                return;
            }
            aVar.a();
        } else {
            ironLog.verbose("can't load banner - already has pending invocation");
        }
    }

    public final void a(K k10, View view, FrameLayout.LayoutParams layoutParams) {
        boolean z9;
        Object[][] objArr;
        K k11 = k10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + k10.s());
        if (k11.f3950m != this.f3905q) {
            ironLog.error("invoked with auctionId: " + k11.f3950m + " and the current id is " + this.f3905q);
            k11.a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + k11.f3950m + " State - " + androidx.activity.e.f(this.f3897h)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10.n()}});
            return;
        }
        synchronized (this.A) {
            int i10 = this.f3897h;
            if (i10 != 6) {
                if (i10 != 7) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        if (z9) {
            K k12 = this.f3901m;
            if (k12 != null) {
                k12.f();
            }
            m(k10);
            this.f3901m = k11;
            IronSourceBannerLayout ironSourceBannerLayout = this.f3899j;
            if (ironSourceBannerLayout != null) {
                C0189n.a(ironSourceBannerLayout, view, layoutParams);
            }
            this.f3911y.put(k10.n(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f3896g.c()) {
                com.ironsource.mediationsdk.adunit.a.a aVar = this.f3910x.get(k10.n());
                if (aVar != null) {
                    a(aVar.a(o()));
                    C0183f.a(aVar, k10.l(), this.f3909v);
                    this.u.a((CopyOnWriteArrayList<O>) this.f3904p, this.f3910x, k10.l(), this.f3909v, aVar);
                    if (!this.f3896g.h().f4988o) {
                        f(k11, aVar);
                    }
                } else {
                    String n2 = k10.n();
                    ironLog.error("onLoadSuccess winner instance " + n2 + " missing from waterfall. auctionId = " + this.f3905q);
                    d(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, n2}});
                }
            }
            if (this.f3897h == 6) {
                if (n()) {
                    l.a().a(this.f4814d, false);
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.B))}};
                } else {
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.B))}};
                }
                d(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (n()) {
                    l.a().a(this.f4814d, true);
                }
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                d(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.d.a(this.B))}});
            }
            String o10 = o();
            j.f(ContextProvider.getInstance().getApplicationContext(), o10);
            if (j.b(ContextProvider.getInstance().getApplicationContext(), o10)) {
                d(IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            this.f3895f.b(IronSource.AD_UNIT.BANNER);
            i(8);
            this.f3898i.a(TimeUnit.SECONDS.toMillis((long) this.f3896g.g()));
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + androidx.activity.e.f(this.f3897h));
    }

    public final void a(IronSourceError ironSourceError, K k10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        boolean z9 = false;
        if (k10.f3950m != this.f3905q) {
            ironLog.error("invoked with auctionId: " + k10.f3950m + " and the current id is " + this.f3905q);
            k10.a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + k10.f3950m + " State - " + androidx.activity.e.f(this.f3897h)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10.n()}});
            return;
        }
        synchronized (this.A) {
            int i10 = this.f3897h;
            if (i10 == 6 || i10 == 7) {
                z9 = true;
            }
        }
        if (z9) {
            this.f3911y.put(k10.n(), h.a.ISAuctionPerformanceFailedToLoad);
            k();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + androidx.activity.e.f(this.f3897h));
    }

    public final void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        boolean z9;
        String str3 = str;
        JSONObject jSONObject3 = jSONObject2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        synchronized (this.A) {
            int i12 = this.f3897h;
            if (i12 != 4) {
                if (i12 != 5) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        if (z9) {
            this.f3907s = "";
            this.f3905q = str3;
            this.f3908t = i10;
            this.f3909v = aVar;
            this.f3906r = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                d(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
            }
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            this.f4812b.a(ad_unit, jSONObject3 != null ? jSONObject3.optBoolean("isAdUnitCapped", false) : false);
            if (this.f4812b.a(ad_unit)) {
                d(IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str3}});
                int i13 = this.f3897h;
                i(2);
                if (i13 == 4) {
                    C0192q.a().a(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
                    return;
                }
                return;
            }
            d(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            i(this.f3897h == 4 ? 6 : 7);
            d(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c(list)}});
            k();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + androidx.activity.e.f(this.f3897h));
    }

    public final void a(boolean z9) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + androidx.activity.e.f(this.f3897h));
        if (j(3, this.f3896g.c() ? z9 ? 5 : 4 : z9 ? 7 : 6)) {
            this.B = new com.ironsource.mediationsdk.utils.d();
            this.f3905q = "";
            this.f3906r = null;
            this.f3900l = 0;
            this.f3902n = this.f3894e.a(IronSource.AD_UNIT.BANNER);
            d(z9 ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.f3896g.c()) {
                ironLog.verbose();
                AsyncTask.execute(new r7.b(this));
                return;
            }
            l();
            k();
            return;
        }
        ironLog.error("wrong state - " + androidx.activity.e.f(this.f3897h));
    }
}
