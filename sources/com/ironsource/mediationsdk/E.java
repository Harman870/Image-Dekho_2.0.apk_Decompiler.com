package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.j;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.h;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.z;
import com.ironsource.sdk.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class E implements j {

    /* renamed from: y  reason: collision with root package name */
    public static E f3852y;

    /* renamed from: a  reason: collision with root package name */
    public T f3853a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3854b = "E";

    /* renamed from: c  reason: collision with root package name */
    public int f3855c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f3856d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f3857e = 62;

    /* renamed from: f  reason: collision with root package name */
    public int f3858f = 12;

    /* renamed from: g  reason: collision with root package name */
    public int f3859g = 5;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3860h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3861i = false;

    /* renamed from: j  reason: collision with root package name */
    public Handler f3862j = IronSourceThreadManager.INSTANCE.getInitHandler();
    public boolean k = false;

    /* renamed from: l  reason: collision with root package name */
    public AtomicBoolean f3863l = new AtomicBoolean(true);

    /* renamed from: m  reason: collision with root package name */
    public NetworkStateReceiver f3864m;

    /* renamed from: n  reason: collision with root package name */
    public CountDownTimer f3865n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f3866o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public String f3867p = "";

    /* renamed from: q  reason: collision with root package name */
    public String f3868q;

    /* renamed from: r  reason: collision with root package name */
    public k f3869r;

    /* renamed from: s  reason: collision with root package name */
    public a f3870s = a.NOT_INIT;

    /* renamed from: t  reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.e f3871t;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public long f3872v;
    public com.ironsource.mediationsdk.b.a w = new com.ironsource.mediationsdk.b.a();

    /* renamed from: x  reason: collision with root package name */
    public c f3873x = new c();

    public enum a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static int f3879a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static int f3880b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static int f3881c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static int f3882d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static int f3883e = 4;
    }

    public class c extends f {
        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02cc, code lost:
            if (r0.f3856d == r0.f3859g) goto L_0x02ce;
         */
        /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01e0 A[Catch:{ Exception -> 0x0316 }, LOOP:0: B:70:0x01da->B:72:0x01e0, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x022b A[Catch:{ Exception -> 0x0316 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.z r0 = com.ironsource.mediationsdk.z.a()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.V r1 = com.ironsource.mediationsdk.V.a()     // Catch:{ Exception -> 0x0316 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.V$a r3 = new com.ironsource.mediationsdk.V$a     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x0316 }
            L_0x001a:
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.lang.String r1 = r1.f3867p     // Catch:{ Exception -> 0x0316 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0316 }
                if (r1 != 0) goto L_0x0031
                com.ironsource.mediationsdk.sdk.c r1 = com.ironsource.mediationsdk.sdk.c.a()     // Catch:{ Exception -> 0x0316 }
                java.lang.String r2 = "userId"
                com.ironsource.mediationsdk.E r3 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.lang.String r3 = r3.f3867p     // Catch:{ Exception -> 0x0316 }
                r1.a(r2, r3)     // Catch:{ Exception -> 0x0316 }
            L_0x0031:
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.lang.String r1 = r1.f3868q     // Catch:{ Exception -> 0x0316 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0316 }
                if (r1 != 0) goto L_0x0048
                com.ironsource.mediationsdk.sdk.c r1 = com.ironsource.mediationsdk.sdk.c.a()     // Catch:{ Exception -> 0x0316 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.E r3 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.lang.String r3 = r3.f3868q     // Catch:{ Exception -> 0x0316 }
                r1.a(r2, r3)     // Catch:{ Exception -> 0x0316 }
            L_0x0048:
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.b.a r2 = r1.w     // Catch:{ Exception -> 0x0316 }
                java.lang.String r1 = r1.f3867p     // Catch:{ Exception -> 0x0316 }
                r2.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0316 }
                r2.<init>()     // Catch:{ Exception -> 0x0316 }
                long r2 = r2.getTime()     // Catch:{ Exception -> 0x0316 }
                r1.f3872v = r2     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0316 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r3 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.lang.String r3 = r3.f3867p     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E$f$a r4 = r11.f3890c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r2 = r0.p(r2, r3, r4)     // Catch:{ Exception -> 0x0316 }
                r1.f3869r = r2     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r2 = r1.f3869r     // Catch:{ Exception -> 0x0316 }
                r3 = 1
                if (r2 == 0) goto L_0x027f
                android.os.Handler r1 = r1.f3862j     // Catch:{ Exception -> 0x0316 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r1 = r1.f3869r     // Catch:{ Exception -> 0x0316 }
                boolean r1 = r1.b()     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x0258
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E$a r2 = com.ironsource.mediationsdk.E.a.INITIATED     // Catch:{ Exception -> 0x0316 }
                r1.b((com.ironsource.mediationsdk.E.a) r2)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r2 = r1.f3869r     // Catch:{ Exception -> 0x0316 }
                r1.a((com.ironsource.mediationsdk.utils.k) r2)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                boolean r2 = r0.M()     // Catch:{ Exception -> 0x0316 }
                r1.b((boolean) r2)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r1 = r1.f3869r     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.f r1 = r1.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.sdk.a.g r1 = r1.f()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.b r1 = r1.f()     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x00d1
                com.ironsource.environment.g r2 = com.ironsource.environment.g.f3741a     // Catch:{ Exception -> 0x0316 }
                boolean r2 = r1.a()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.g.a((boolean) r2)     // Catch:{ Exception -> 0x0316 }
                boolean r2 = r1.b()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.g.c(r2)     // Catch:{ Exception -> 0x0316 }
                int r2 = r1.c()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.g.a((int) r2)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.thread.IronSourceThreadManager r2 = com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE     // Catch:{ Exception -> 0x0316 }
                boolean r1 = r1.d()     // Catch:{ Exception -> 0x0316 }
                r2.setUseSharedExecutorService(r1)     // Catch:{ Exception -> 0x0316 }
            L_0x00d1:
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0316 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r3 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r3 = r3.f3869r     // Catch:{ Exception -> 0x0316 }
                r1.a(r2, r3)     // Catch:{ Exception -> 0x0316 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0316 }
                r1.<init>()     // Catch:{ Exception -> 0x0316 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r3 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                long r3 = r3.f3872v     // Catch:{ Exception -> 0x0316 }
                long r1 = r1 - r3
                boolean r3 = r0.M()     // Catch:{ Exception -> 0x0316 }
                org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3)     // Catch:{ Exception -> 0x0316 }
                java.lang.String r4 = "duration"
                r3.put(r4, r1)     // Catch:{ Exception -> 0x0105 }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.f5075z     // Catch:{ Exception -> 0x0105 }
                r3.put(r1, r0)     // Catch:{ Exception -> 0x0105 }
                goto L_0x0109
            L_0x0105:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0316 }
            L_0x0109:
                com.ironsource.environment.c.a r0 = new com.ironsource.environment.c.a     // Catch:{ Exception -> 0x0316 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r3)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.events.i r1 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ Exception -> 0x0316 }
                r1.a((com.ironsource.environment.c.a) r0)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.T r1 = new com.ironsource.mediationsdk.T     // Catch:{ Exception -> 0x0316 }
                r1.<init>()     // Catch:{ Exception -> 0x0316 }
                r0.f3853a = r1     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.T r0 = r0.f3853a     // Catch:{ Exception -> 0x0316 }
                r0.a()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r0 = r0.f3869r     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.f r0 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.sdk.a.g r0 = r0.f()     // Catch:{ Exception -> 0x0316 }
                boolean r0 = r0.d()     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x014c
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0316 }
                android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x014c
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0316 }
                android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x0316 }
            L_0x014c:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r0 = r0.f3869r     // Catch:{ Exception -> 0x0316 }
                org.json.JSONObject r1 = r0.f5020d     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x01d1
                com.ironsource.mediationsdk.model.f r1 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                if (r1 != 0) goto L_0x015a
                goto L_0x01d1
            L_0x015a:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0316 }
                r1.<init>()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.f r2 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.q r2 = r2.a()     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x0178
                com.ironsource.mediationsdk.model.o r2 = r0.f5017a     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x0178
                java.util.ArrayList<java.lang.String> r2 = r2.f4784a     // Catch:{ Exception -> 0x0316 }
                boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0316 }
                if (r2 != 0) goto L_0x0178
                com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0316 }
                r1.add(r2)     // Catch:{ Exception -> 0x0316 }
            L_0x0178:
                com.ironsource.mediationsdk.model.f r2 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.h r2 = r2.b()     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x0191
                com.ironsource.mediationsdk.model.o r2 = r0.f5017a     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x0191
                java.util.ArrayList<java.lang.String> r2 = r2.f4785b     // Catch:{ Exception -> 0x0316 }
                boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0316 }
                if (r2 != 0) goto L_0x0191
                com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0316 }
                r1.add(r2)     // Catch:{ Exception -> 0x0316 }
            L_0x0191:
                com.ironsource.mediationsdk.model.f r2 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.k r2 = r2.c()     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x019e
                com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x0316 }
                r1.add(r2)     // Catch:{ Exception -> 0x0316 }
            L_0x019e:
                com.ironsource.mediationsdk.model.f r2 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.d r2 = r2.d()     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x01b7
                com.ironsource.mediationsdk.model.o r2 = r0.f5017a     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x01b7
                java.util.ArrayList<java.lang.String> r2 = r2.f4786c     // Catch:{ Exception -> 0x0316 }
                boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0316 }
                if (r2 != 0) goto L_0x01b7
                com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0316 }
                r1.add(r2)     // Catch:{ Exception -> 0x0316 }
            L_0x01b7:
                com.ironsource.mediationsdk.model.f r2 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.i r2 = r2.e()     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x01d2
                com.ironsource.mediationsdk.model.o r0 = r0.f5017a     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x01d2
                java.util.ArrayList<java.lang.String> r0 = r0.f4787d     // Catch:{ Exception -> 0x0316 }
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0316 }
                if (r0 != 0) goto L_0x01d2
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ Exception -> 0x0316 }
                r1.add(r0)     // Catch:{ Exception -> 0x0316 }
                goto L_0x01d2
            L_0x01d1:
                r1 = 0
            L_0x01d2:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.util.ArrayList r0 = r0.f3866o     // Catch:{ Exception -> 0x0316 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0316 }
            L_0x01da:
                boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0316 }
                if (r2 == 0) goto L_0x01f2
                java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.h r2 = (com.ironsource.mediationsdk.utils.h) r2     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r3 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                boolean r4 = r3.f3860h     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r3 = r3.f3869r     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.f r3 = r3.f5019c     // Catch:{ Exception -> 0x0316 }
                r2.a(r1, r4, r3)     // Catch:{ Exception -> 0x0316 }
                goto L_0x01da
            L_0x01f2:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.sdk.e r1 = r0.f3871t     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x0217
                com.ironsource.mediationsdk.utils.k r0 = r0.f3869r     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.f r0 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.sdk.a.g r0 = r0.f()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.r r0 = r0.b()     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x0217
                java.lang.String r1 = r0.f4802a     // Catch:{ Exception -> 0x0316 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0316 }
                if (r1 != 0) goto L_0x0217
                com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.sdk.e r1 = r1.f3871t     // Catch:{ Exception -> 0x0316 }
                java.lang.String r0 = r0.f4802a     // Catch:{ Exception -> 0x0316 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x0316 }
            L_0x0217:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.k r0 = r0.f3869r     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.model.f r0 = r0.f5019c     // Catch:{ Exception -> 0x0316 }
                com.ironsource.sdk.a.g r0 = r0.f()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.sdk.f.a r0 = r0.e()     // Catch:{ Exception -> 0x0316 }
                boolean r1 = r0.b()     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x031a
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.e r2 = com.ironsource.environment.e.a()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0316 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0316 }
                java.util.HashSet r4 = r0.a()     // Catch:{ Exception -> 0x0316 }
                java.lang.String r5 = r0.c()     // Catch:{ Exception -> 0x0316 }
                java.lang.String r6 = r0.d()     // Catch:{ Exception -> 0x0316 }
                boolean r7 = r0.e()     // Catch:{ Exception -> 0x0316 }
                int r9 = r0.f()     // Catch:{ Exception -> 0x0316 }
                boolean r10 = r0.g()     // Catch:{ Exception -> 0x0316 }
                r2.a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0316 }
                goto L_0x031a
            L_0x0258:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                boolean r1 = r0.f3861i     // Catch:{ Exception -> 0x0316 }
                if (r1 != 0) goto L_0x0315
                com.ironsource.mediationsdk.E$a r1 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ Exception -> 0x0316 }
                r0.b((com.ironsource.mediationsdk.E.a) r1)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                r0.f3861i = r3     // Catch:{ Exception -> 0x0316 }
                java.util.ArrayList r0 = r0.f3866o     // Catch:{ Exception -> 0x0316 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0316 }
            L_0x026d:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x031a
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.h r1 = (com.ironsource.mediationsdk.utils.h) r1     // Catch:{ Exception -> 0x0316 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.a(r2)     // Catch:{ Exception -> 0x0316 }
                goto L_0x026d
            L_0x027f:
                int r0 = r1.f3856d     // Catch:{ Exception -> 0x0316 }
                r2 = 3
                if (r0 != r2) goto L_0x029c
                r1.u = r3     // Catch:{ Exception -> 0x0316 }
                java.util.ArrayList r0 = r1.f3866o     // Catch:{ Exception -> 0x0316 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0316 }
            L_0x028c:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x029c
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.h r1 = (com.ironsource.mediationsdk.utils.h) r1     // Catch:{ Exception -> 0x0316 }
                r1.c()     // Catch:{ Exception -> 0x0316 }
                goto L_0x028c
            L_0x029c:
                boolean r0 = r11.f3888a     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x02c2
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                int r1 = r0.f3856d     // Catch:{ Exception -> 0x0316 }
                int r2 = r0.f3857e     // Catch:{ Exception -> 0x0316 }
                if (r1 >= r2) goto L_0x02c2
                r0.f3860h = r3     // Catch:{ Exception -> 0x0316 }
                android.os.Handler r1 = r0.f3862j     // Catch:{ Exception -> 0x0316 }
                int r0 = r0.f3855c     // Catch:{ Exception -> 0x0316 }
                int r0 = r0 * 1000
                long r4 = (long) r0     // Catch:{ Exception -> 0x0316 }
                r1.postDelayed(r11, r4)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                int r1 = r0.f3856d     // Catch:{ Exception -> 0x0316 }
                int r2 = r0.f3858f     // Catch:{ Exception -> 0x0316 }
                if (r1 >= r2) goto L_0x02c2
                int r1 = r0.f3855c     // Catch:{ Exception -> 0x0316 }
                int r1 = r1 * 2
                r0.f3855c = r1     // Catch:{ Exception -> 0x0316 }
            L_0x02c2:
                boolean r0 = r11.f3888a     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x02ce
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                int r1 = r0.f3856d     // Catch:{ Exception -> 0x0316 }
                int r0 = r0.f3859g     // Catch:{ Exception -> 0x0316 }
                if (r1 != r0) goto L_0x030e
            L_0x02ce:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                boolean r1 = r0.f3861i     // Catch:{ Exception -> 0x0316 }
                if (r1 != 0) goto L_0x030e
                r0.f3861i = r3     // Catch:{ Exception -> 0x0316 }
                java.lang.String r0 = r11.f3889b     // Catch:{ Exception -> 0x0316 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0316 }
                if (r0 == 0) goto L_0x02e2
                java.lang.String r0 = "noServerResponse"
                r11.f3889b = r0     // Catch:{ Exception -> 0x0316 }
            L_0x02e2:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                java.util.ArrayList r0 = r0.f3866o     // Catch:{ Exception -> 0x0316 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0316 }
            L_0x02ea:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0316 }
                if (r1 == 0) goto L_0x02fc
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.utils.h r1 = (com.ironsource.mediationsdk.utils.h) r1     // Catch:{ Exception -> 0x0316 }
                java.lang.String r2 = r11.f3889b     // Catch:{ Exception -> 0x0316 }
                r1.a(r2)     // Catch:{ Exception -> 0x0316 }
                goto L_0x02ea
            L_0x02fc:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.E$a r1 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ Exception -> 0x0316 }
                r0.b((com.ironsource.mediationsdk.E.a) r1)     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x0316 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0316 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r3)     // Catch:{ Exception -> 0x0316 }
            L_0x030e:
                com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.this     // Catch:{ Exception -> 0x0316 }
                int r1 = r0.f3856d     // Catch:{ Exception -> 0x0316 }
                int r1 = r1 + r3
                r0.f3856d = r1     // Catch:{ Exception -> 0x0316 }
            L_0x0315:
                return
            L_0x0316:
                r0 = move-exception
                r0.printStackTrace()
            L_0x031a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.c.run():void");
        }
    }

    public class d implements Runnable {

        public class a extends CountDownTimer {
            public a() {
                super(60000, 15000);
            }

            public final void onFinish() {
                E e10 = E.this;
                if (!e10.f3861i) {
                    e10.f3861i = true;
                    Iterator it = e10.f3866o.iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                    }
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                }
            }

            public final void onTick(long j10) {
                if (j10 <= 45000) {
                    E e10 = E.this;
                    e10.u = true;
                    Iterator it = e10.f3866o.iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).c();
                    }
                }
            }
        }

        public d() {
        }

        public final void run() {
            E.this.f3865n = new a().start();
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3887a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.E$a[] r0 = com.ironsource.mediationsdk.E.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3887a = r0
                com.ironsource.mediationsdk.E$a r1 = com.ironsource.mediationsdk.E.a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3887a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.E$a r1 = com.ironsource.mediationsdk.E.a.NOT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3887a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.E$a r1 = com.ironsource.mediationsdk.E.a.INITIATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.E.e.<clinit>():void");
        }
    }

    public abstract class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3888a = true;

        /* renamed from: b  reason: collision with root package name */
        public String f3889b;

        /* renamed from: c  reason: collision with root package name */
        public a f3890c = new a();

        public class a implements z.a {
            public a() {
            }

            public final void a(String str) {
                f fVar = f.this;
                fVar.f3888a = false;
                fVar.f3889b = str;
            }
        }
    }

    private E() {
    }

    public static synchronized E a() {
        E e10;
        synchronized (E.class) {
            if (f3852y == null) {
                f3852y = new E();
            }
            e10 = f3852y;
        }
        return e10;
    }

    public final void a(Context context, k kVar) {
        this.w.a(kVar.a().b());
        com.ironsource.environment.c.e.a("apky", (Object) kVar.a().a());
        g f10 = kVar.f5019c.f();
        com.ironsource.environment.c.e.a("audt", (Object) f10.i().a());
        com.ironsource.environment.c.e.a("tkgp", (Object) f10.c().f5034c);
        com.ironsource.environment.c.e.a("fs", (Object) Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    public final synchronized void a(Context context, String str, String str2) {
        try {
            AtomicBoolean atomicBoolean = this.f3863l;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f3854b + ": Multiple calls to init are not allowed", 2);
                return;
            }
            b(a.INIT_IN_PROGRESS);
            this.f3867p = str2;
            this.f3868q = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                this.f3862j.post(this.f3873x);
            } else {
                this.k = true;
                if (this.f3864m == null) {
                    this.f3864m = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.f3864m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new d());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(h hVar) {
        if (hVar != null) {
            this.f3866o.add(hVar);
        }
    }

    public final synchronized void a(k kVar) {
        int i10;
        int i11 = kVar != null ? kVar.f5021e : k.a.f5025a;
        a aVar = this.f3870s;
        if (i11 == k.a.f5026b) {
            i10 = b.f3881c;
        } else {
            int i12 = e.f3887a[aVar.ordinal()];
            i10 = i12 != 1 ? i12 != 2 ? i12 != 3 ? b.f3879a : b.f3880b : b.f3883e : b.f3882d;
        }
        com.ironsource.environment.c.e.a("itp", (Object) Integer.valueOf(i10));
    }

    public final void a(boolean z9) {
        if (this.k && z9) {
            CountDownTimer countDownTimer = this.f3865n;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.k = false;
            this.f3860h = true;
            this.f3862j.post(this.f3873x);
        }
    }

    public final synchronized a b() {
        return this.f3870s;
    }

    public final synchronized void b(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.f3870s + ", new status: " + aVar + ")");
        this.f3870s = aVar;
    }

    public final void b(boolean z9) {
        Map<String, String> a10;
        if (z9 && TextUtils.isEmpty(z.a().k) && (a10 = this.f3869r.f5019c.f().g().a()) != null && !a10.isEmpty()) {
            for (String next : a10.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = a10.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    z.a().d(next);
                    return;
                }
            }
        }
    }

    public final synchronized boolean c() {
        return this.u;
    }
}
