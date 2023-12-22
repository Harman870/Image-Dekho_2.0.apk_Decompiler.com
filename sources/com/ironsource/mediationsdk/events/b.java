package com.ironsource.mediationsdk.events;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.r;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b implements com.ironsource.b.c {
    public HashSet A;
    public f B;
    public r C;
    public final Object D = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f4506a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4507b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4508c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f4509d = -1;

    /* renamed from: e  reason: collision with root package name */
    public com.ironsource.b.a f4510e;

    /* renamed from: f  reason: collision with root package name */
    public x7.a f4511f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4512g = true;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<com.ironsource.environment.c.a> f4513h;

    /* renamed from: i  reason: collision with root package name */
    public int f4514i;

    /* renamed from: j  reason: collision with root package name */
    public String f4515j;
    public Context k;

    /* renamed from: l  reason: collision with root package name */
    public int f4516l = 100;

    /* renamed from: m  reason: collision with root package name */
    public int f4517m = 5000;

    /* renamed from: n  reason: collision with root package name */
    public int f4518n = 1;

    /* renamed from: o  reason: collision with root package name */
    public int[] f4519o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f4520p;

    /* renamed from: q  reason: collision with root package name */
    public String f4521q = "";

    /* renamed from: r  reason: collision with root package name */
    public int[] f4522r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f4523s;

    /* renamed from: t  reason: collision with root package name */
    public HashMap f4524t = new HashMap();
    public HashMap u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    public int f4525v;
    public IronSourceSegment w;

    /* renamed from: y  reason: collision with root package name */
    public String f4526y;

    /* renamed from: z  reason: collision with root package name */
    public String f4527z;

    public enum a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);
        

        /* renamed from: g  reason: collision with root package name */
        public int f4535g;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f4535g = i10;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.events.b$b  reason: collision with other inner class name */
    public class C0052b implements Runnable {
        public C0052b() {
        }

        public final void run() {
            b bVar = b.this;
            synchronized (bVar.D) {
                bVar.f4510e.a(bVar.f4513h, bVar.f4527z);
                bVar.f4513h.clear();
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.environment.c.a f4537a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSource.AD_UNIT f4538b;

        public c(com.ironsource.environment.c.a aVar, IronSource.AD_UNIT ad_unit) {
            this.f4537a = aVar;
            this.f4538b = ad_unit;
        }

        public final void run() {
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            int a10;
            boolean z18;
            this.f4537a.a("eventSessionId", b.this.f4515j);
            String connectionType = IronSourceUtils.getConnectionType(b.this.k);
            if (b.this.o(this.f4537a)) {
                this.f4537a.a("connectionType", connectionType);
            }
            b bVar = b.this;
            com.ironsource.environment.c.a aVar = this.f4537a;
            synchronized (bVar) {
                z9 = true;
                if (!connectionType.equalsIgnoreCase("none")) {
                    z10 = false;
                } else {
                    int[] iArr = bVar.f4523s;
                    if (iArr == null || iArr.length <= 0) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (z18) {
                        z10 = b.g(bVar.f4523s, aVar.a());
                    } else {
                        z10 = bVar.A.contains(Integer.valueOf(aVar.a()));
                    }
                }
            }
            if (z10) {
                com.ironsource.environment.c.a aVar2 = this.f4537a;
                synchronized (b.this) {
                    a10 = aVar2.a() + 90000;
                }
                aVar2.a(a10);
            }
            int a11 = b.a(this.f4538b, this.f4537a.a());
            if (a11 != a.NOT_SUPPORTED.f4535g) {
                this.f4537a.a("adUnit", Integer.valueOf(a11));
            }
            b.d(this.f4537a, IronSourceConstants.EVENTS_ERROR_REASON);
            b.d(this.f4537a, IronSourceConstants.EVENTS_EXT1);
            if (!b.this.u.isEmpty()) {
                for (Map.Entry entry : b.this.u.entrySet()) {
                    if (!(this.f4537a.d().has((String) entry.getKey()) || entry.getKey() == "eventId" || entry.getKey() == "timestamp")) {
                        this.f4537a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            b bVar2 = b.this;
            com.ironsource.environment.c.a aVar3 = this.f4537a;
            if (aVar3 != null) {
                int[] iArr2 = bVar2.f4519o;
                if (iArr2 == null || iArr2.length <= 0) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (z16) {
                    z11 = !b.g(bVar2.f4519o, aVar3.a());
                } else {
                    int[] iArr3 = bVar2.f4520p;
                    if (iArr3 == null || iArr3.length <= 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        z11 = b.g(bVar2.f4520p, aVar3.a());
                    } else {
                        z11 = true;
                    }
                }
            } else {
                z11 = false;
            }
            if (z11) {
                if (b.this.n(this.f4537a)) {
                    JSONObject d10 = this.f4537a.d();
                    if (d10 == null) {
                        z15 = false;
                    } else {
                        z15 = d10.has(IronSourceConstants.KEY_SESSION_DEPTH);
                    }
                    if (!z15) {
                        this.f4537a.a(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b.this.m(this.f4537a)));
                    }
                }
                if (!TextUtils.isEmpty(b.this.k(this.f4537a.a())) && b.this.j(this.f4537a)) {
                    com.ironsource.environment.c.a aVar4 = this.f4537a;
                    aVar4.a("placement", b.this.k(aVar4.a()));
                }
                long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(b.this.k);
                if (firstSessionTimestamp != -1) {
                    this.f4537a.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                }
                IronLog.EVENT.verbose(this.f4537a.toString());
                b.this.f4513h.add(this.f4537a);
                b.this.f4514i++;
            }
            b bVar3 = b.this;
            int[] iArr4 = bVar3.f4522r;
            if (iArr4 == null || iArr4.length <= 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                int a12 = this.f4537a.a();
                int[] iArr5 = b.this.f4522r;
                bVar3.getClass();
                z13 = b.g(iArr5, a12);
            } else {
                z13 = bVar3.l(this.f4537a);
            }
            b bVar4 = b.this;
            if (!bVar4.f4507b && z13) {
                bVar4.f4507b = true;
            }
            if (bVar4.f4510e != null) {
                if ((bVar4.f4514i >= bVar4.f4516l || bVar4.f4507b) && bVar4.f4506a) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    b.h(bVar4);
                    return;
                }
                ArrayList<com.ironsource.environment.c.a> arrayList = bVar4.f4513h;
                if (arrayList == null || arrayList.size() < bVar4.f4518n) {
                    z9 = false;
                }
                if (z9 || z13) {
                    b bVar5 = b.this;
                    synchronized (bVar5.D) {
                        bVar5.f4510e.a(bVar5.f4513h, bVar5.f4527z);
                        bVar5.f4513h.clear();
                    }
                }
            }
        }
    }

    public class d implements com.ironsource.b.d {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ boolean f4541a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ ArrayList f4542b;

            public a(boolean z9, ArrayList arrayList) {
                this.f4541a = z9;
                this.f4542b = arrayList;
            }

            public final void run() {
                try {
                    if (this.f4541a) {
                        b bVar = b.this;
                        ArrayList<com.ironsource.environment.c.a> a10 = bVar.f4510e.a(bVar.f4527z);
                        b.this.f4514i = a10.size() + b.this.f4513h.size();
                    } else {
                        IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                        b.this.e(this.f4542b);
                    }
                } catch (Exception unused) {
                    b bVar2 = b.this;
                }
                ArrayList arrayList = this.f4542b;
                if (arrayList != null) {
                    try {
                        arrayList.clear();
                    } catch (Exception e10) {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.error("clearData exception: " + e10.getMessage());
                    }
                }
            }
        }

        public d() {
        }

        public final synchronized void a(ArrayList<com.ironsource.environment.c.a> arrayList, boolean z9) {
            f fVar = b.this.B;
            fVar.f4545a.post(new a(z9, arrayList));
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public final void run() {
            b.h(b.this);
        }
    }

    public class f extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        public Handler f4545a;

        public f(String str) {
            super(str);
        }
    }

    public static int a(IronSource.AD_UNIT ad_unit, int i10) {
        a aVar;
        int i11 = a.NOT_SUPPORTED.f4535g;
        if (ad_unit == IronSource.AD_UNIT.OFFERWALL || i10 == 15 || (i10 >= 300 && i10 < 400)) {
            aVar = a.OFFERWALL;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i10 >= 1000 && i10 < 2000) || (i10 >= 91000 && i10 < 92000))) {
            aVar = a.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i10 >= 2000 && i10 < 3000) || (i10 >= 92000 && i10 < 93000))) {
            aVar = a.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000))) {
            aVar = a.BANNER;
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i10 < 4000 || i10 >= 5000) && (i10 < 94000 || i10 >= 95000))) {
            return i11;
        } else {
            aVar = a.NATIVE_AD;
        }
        return aVar.f4535g;
    }

    public static void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    public static /* synthetic */ void d(com.ironsource.environment.c.a aVar, String str) {
        JSONObject d10 = aVar.d();
        if (d10 != null && d10.has(str)) {
            try {
                String optString = d10.optString(str, (String) null);
                if (optString != null) {
                    aVar.a(str, optString.substring(0, Math.min(optString.length(), IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES)));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static boolean g(int[] iArr, int i10) {
        boolean z9;
        if (iArr == null || iArr.length <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return false;
        }
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:48|(2:50|51)|52|53|(1:55)(1:56)|57|68) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0126 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0137 A[Catch:{ all -> 0x00ec, all -> 0x0147 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013c A[Catch:{ all -> 0x00ec, all -> 0x0147 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(com.ironsource.mediationsdk.events.b r7) {
        /*
            r0 = 0
            r7.f4507b = r0     // Catch:{ all -> 0x0147 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0147 }
            r1.<init>()     // Catch:{ all -> 0x0147 }
            java.lang.Object r2 = r7.D     // Catch:{ all -> 0x003f }
            monitor-enter(r2)     // Catch:{ all -> 0x003f }
            com.ironsource.b.a r3 = r7.f4510e     // Catch:{ all -> 0x003c }
            java.lang.String r4 = r7.f4527z     // Catch:{ all -> 0x003c }
            java.util.ArrayList r3 = r3.a((java.lang.String) r4)     // Catch:{ all -> 0x003c }
            com.ironsource.b.a r4 = r7.f4510e     // Catch:{ all -> 0x003c }
            java.lang.String r5 = r7.f4527z     // Catch:{ all -> 0x003c }
            r4.b(r5)     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.events.c$b r2 = new com.ironsource.mediationsdk.events.c$b     // Catch:{ all -> 0x003f }
            com.ironsource.mediationsdk.events.c$a r4 = new com.ironsource.mediationsdk.events.c$a     // Catch:{ all -> 0x003f }
            java.util.ArrayList<com.ironsource.environment.c.a> r5 = r7.f4513h     // Catch:{ all -> 0x003f }
            r4.<init>(r3, r5)     // Catch:{ all -> 0x003f }
            int r3 = r7.f4517m     // Catch:{ all -> 0x003f }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x003f }
            com.ironsource.b.a r3 = r7.f4510e     // Catch:{ all -> 0x003f }
            java.util.List r4 = r2.c()     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r7.f4527z     // Catch:{ all -> 0x003f }
            r3.a(r4, r5)     // Catch:{ all -> 0x003f }
            java.util.List r2 = r2.b()     // Catch:{ all -> 0x003f }
            r1.addAll(r2)     // Catch:{ all -> 0x003f }
            goto L_0x005f
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r3     // Catch:{ all -> 0x003f }
        L_0x003f:
            r2 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = "CombinedEventList exception: "
            r4.<init>(r5)     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0147 }
            r4.append(r2)     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0147 }
            r3.error(r2)     // Catch:{ all -> 0x0147 }
            r1.clear()     // Catch:{ all -> 0x0147 }
            java.util.ArrayList<com.ironsource.environment.c.a> r2 = r7.f4513h     // Catch:{ all -> 0x0147 }
            r1.addAll(r2)     // Catch:{ all -> 0x0147 }
        L_0x005f:
            int r2 = r1.size()     // Catch:{ all -> 0x0147 }
            if (r2 <= 0) goto L_0x0146
            java.util.ArrayList<com.ironsource.environment.c.a> r2 = r7.f4513h     // Catch:{ all -> 0x0147 }
            r2.clear()     // Catch:{ all -> 0x0147 }
            r7.f4514i = r0     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.sdk.c r2 = com.ironsource.mediationsdk.sdk.c.a()     // Catch:{ all -> 0x0147 }
            org.json.JSONObject r2 = r2.b()     // Catch:{ all -> 0x0147 }
            r7.f(r2)     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r7.f4521q     // Catch:{ all -> 0x00ec }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x0084
            java.lang.String r4 = "abt"
            r2.put(r4, r3)     // Catch:{ all -> 0x00ec }
        L_0x0084:
            com.ironsource.mediationsdk.z r3 = com.ironsource.mediationsdk.z.a()     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r3.k     // Catch:{ all -> 0x00ec }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x0095
            java.lang.String r4 = "mt"
            r2.put(r4, r3)     // Catch:{ all -> 0x00ec }
        L_0x0095:
            java.util.HashMap r3 = r7.f4524t     // Catch:{ all -> 0x00ec }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x00cb
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ec }
        L_0x00a5:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x00cb
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00ec }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00ec }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ec }
            boolean r5 = r2.has(r5)     // Catch:{ all -> 0x00ec }
            if (r5 != 0) goto L_0x00a5
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ec }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00ec }
            r2.put(r5, r4)     // Catch:{ all -> 0x00ec }
            goto L_0x00a5
        L_0x00cb:
            com.ironsource.environment.b.b r3 = new com.ironsource.environment.b.b     // Catch:{ all -> 0x00ec }
            r3.<init>()     // Catch:{ all -> 0x00ec }
            org.json.JSONObject r3 = r3.a()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r4 = r3.keys()     // Catch:{ all -> 0x00ec }
        L_0x00d8:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00ec }
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ec }
            java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x00ec }
            r2.put(r5, r6)     // Catch:{ all -> 0x00ec }
            goto L_0x00d8
        L_0x00ec:
            r3 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0147 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0147 }
            java.lang.String r6 = "Exception while building the event general properties: "
            r5.<init>(r6)     // Catch:{ all -> 0x0147 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0147 }
            r5.append(r3)     // Catch:{ all -> 0x0147 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0147 }
            r4.error(r3)     // Catch:{ all -> 0x0147 }
        L_0x0104:
            x7.a r3 = r7.f4511f     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = r3.a(r1, r2)     // Catch:{ all -> 0x0147 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0147 }
            if (r3 == 0) goto L_0x0118
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "Failed to parse events."
            r7.error(r0)     // Catch:{ all -> 0x0147 }
            return
        L_0x0118:
            boolean r3 = r7.f4508c     // Catch:{ all -> 0x0147 }
            if (r3 == 0) goto L_0x0126
            int r3 = r7.f4509d     // Catch:{ Exception -> 0x0126 }
            byte[] r3 = com.ironsource.mediationsdk.utils.g.a(r2, r3)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = android.util.Base64.encodeToString(r3, r0)     // Catch:{ Exception -> 0x0126 }
        L_0x0126:
            com.ironsource.b.b r0 = new com.ironsource.b.b     // Catch:{ all -> 0x0147 }
            com.ironsource.mediationsdk.events.b$d r3 = new com.ironsource.mediationsdk.events.b$d     // Catch:{ all -> 0x0147 }
            r3.<init>()     // Catch:{ all -> 0x0147 }
            x7.a r7 = r7.f4511f     // Catch:{ all -> 0x0147 }
            java.lang.String r4 = r7.f12992c     // Catch:{ all -> 0x0147 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0147 }
            if (r4 == 0) goto L_0x013c
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x0147 }
            goto L_0x013e
        L_0x013c:
            java.lang.String r7 = r7.f12992c     // Catch:{ all -> 0x0147 }
        L_0x013e:
            r0.<init>(r3, r2, r7, r1)     // Catch:{ all -> 0x0147 }
            com.ironsource.environment.thread.IronSourceThreadManager r7 = com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE     // Catch:{ all -> 0x0147 }
            r7.postMediationBackgroundTask(r0)     // Catch:{ all -> 0x0147 }
        L_0x0146:
            return
        L_0x0147:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Send event exception: "
            r1.<init>(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.error(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.events.b.h(com.ironsource.mediationsdk.events.b):void");
    }

    public final void a(int i10) {
        if (i10 > 0) {
            this.f4518n = i10;
        }
    }

    public final synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f4527z, this.f4526y);
        this.f4526y = defaultEventsFormatterType;
        x7.a aVar = this.f4511f;
        if (aVar == null || !aVar.c().equals(defaultEventsFormatterType)) {
            this.f4511f = d.b(this.f4525v, defaultEventsFormatterType);
        }
        this.f4511f.f12992c = IronSourceUtils.getDefaultEventsURL(context, this.f4527z, (String) null);
        this.f4510e = com.ironsource.b.a.a(context, "supersonic_sdk.db", 5);
        f fVar = this.B;
        fVar.f4545a.post(new C0052b());
        this.f4519o = IronSourceUtils.getDefaultOptOutEvents(context, this.f4527z);
        this.f4520p = IronSourceUtils.getDefaultOptInEvents(context, this.f4527z);
        this.f4522r = IronSourceUtils.getDefaultTriggerEvents(context, this.f4527z);
        this.f4523s = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f4527z);
        this.w = ironSourceSegment;
        this.k = context;
    }

    public final synchronized void a(com.ironsource.environment.c.a aVar) {
        a(aVar, (IronSource.AD_UNIT) null);
    }

    public final synchronized void a(r rVar) {
        this.C = rVar;
    }

    public final void a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            x7.a aVar = this.f4511f;
            if (aVar != null) {
                aVar.f12992c = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.f4527z, str);
        }
    }

    public final void a(Map<String, String> map) {
        this.f4524t.putAll(map);
    }

    public final void a(int[] iArr, Context context) {
        this.f4519o = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f4527z, iArr);
    }

    public final void b() {
        f fVar = this.B;
        fVar.f4545a.post(new e());
    }

    public final void b(int i10) {
        if (i10 > 0) {
            this.f4516l = i10;
        }
    }

    public final void b(Map<String, String> map) {
        this.u.putAll(map);
    }

    public final void b(int[] iArr, Context context) {
        this.f4520p = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f4527z, iArr);
    }

    public final void c() {
        this.f4513h = new ArrayList<>();
        this.f4514i = 0;
        this.f4511f = d.b(this.f4525v, this.f4526y);
        f fVar = new f(androidx.activity.e.c(new StringBuilder(), this.f4527z, "EventThread"));
        this.B = fVar;
        fVar.start();
        f fVar2 = this.B;
        fVar2.f4545a = new Handler(fVar2.getLooper());
        this.f4515j = IronSourceUtils.getSessionId();
        this.A = new HashSet();
        i();
    }

    public final void c(int i10) {
        if (i10 > 0) {
            this.f4517m = i10;
        }
    }

    public final void c(int[] iArr, Context context) {
        this.f4522r = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f4527z, iArr);
    }

    public final void d(int[] iArr, Context context) {
        this.f4523s = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f4527z, iArr);
    }

    public void e(ArrayList<com.ironsource.environment.c.a> arrayList) {
        if (arrayList != null) {
            synchronized (this.D) {
                this.f4510e.a(arrayList, this.f4527z);
                this.f4514i = this.f4510e.a(this.f4527z).size() + this.f4513h.size();
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.w;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put(IronSourceSegment.AGE, this.w.getAge());
                }
                if (!TextUtils.isEmpty(this.w.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.w.getGender());
                }
                if (this.w.getLevel() > 0) {
                    jSONObject.put(IronSourceSegment.LEVEL, this.w.getLevel());
                }
                if (this.w.getIsPaying() != null) {
                    jSONObject.put(IronSourceSegment.PAYING, this.w.getIsPaying().get());
                }
                if (this.w.getIapt() > 0.0d) {
                    jSONObject.put(IronSourceSegment.IAPT, this.w.getIapt());
                }
                if (this.w.getUcd() > 0) {
                    jSONObject.put(IronSourceSegment.USER_CREATION_DATE, this.w.getUcd());
                }
            }
            r rVar = this.C;
            if (rVar != null) {
                String str = rVar.f4803b;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("segmentId", str);
                }
                JSONObject jSONObject2 = this.C.f4804c;
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public abstract void i();

    public abstract boolean j(com.ironsource.environment.c.a aVar);

    public abstract String k(int i10);

    public abstract boolean l(com.ironsource.environment.c.a aVar);

    public abstract int m(com.ironsource.environment.c.a aVar);

    public boolean n(com.ironsource.environment.c.a aVar) {
        return (aVar.a() == 14 || aVar.a() == 114 || aVar.a() == 514 || aVar.a() == 140 || aVar.a() == 40 || aVar.a() == 41 || aVar.a() == 50 || aVar.a() == 51 || aVar.a() == 52) ? false : true;
    }

    public boolean o(com.ironsource.environment.c.a aVar) {
        return (aVar.a() == 40 || aVar.a() == 41 || aVar.a() == 50 || aVar.a() == 51 || aVar.a() == 52) ? false : true;
    }

    public final void b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.f4526y = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.f4527z, str);
            x7.a aVar = this.f4511f;
            if (aVar == null || !aVar.c().equals(str)) {
                this.f4511f = d.b(this.f4525v, str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ironsource.environment.c.a r3, com.ironsource.mediationsdk.IronSource.AD_UNIT r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0019
            boolean r0 = r2.f4512g     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0008
            goto L_0x0019
        L_0x0008:
            com.ironsource.mediationsdk.events.b$f r0 = r2.B     // Catch:{ all -> 0x0016 }
            com.ironsource.mediationsdk.events.b$c r1 = new com.ironsource.mediationsdk.events.b$c     // Catch:{ all -> 0x0016 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0016 }
            android.os.Handler r3 = r0.f4545a     // Catch:{ all -> 0x0016 }
            r3.post(r1)     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0019:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.events.b.a(com.ironsource.environment.c.a, com.ironsource.mediationsdk.IronSource$AD_UNIT):void");
    }
}
