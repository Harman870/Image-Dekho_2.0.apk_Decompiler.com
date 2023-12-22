package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.f;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.c;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.demandOnly.r;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.d;
import com.ironsource.mediationsdk.model.g;
import com.ironsource.mediationsdk.model.l;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.e;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.h;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.sdk.controller.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class z implements h {

    /* renamed from: k0  reason: collision with root package name */
    public static boolean f5042k0 = false;
    public f A;
    public com.ironsource.mediationsdk.adunit.c.h B;
    public com.ironsource.mediationsdk.adunit.c.b C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public Boolean J;
    public IronSourceBannerLayout K;
    public String L;
    public Boolean M;
    public a0 N;
    public boolean O;
    public c0 P;
    public I Q;
    public InitializationListener R;
    public AtomicBoolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f5043a;

    /* renamed from: a0  reason: collision with root package name */
    public final ConcurrentHashMap<String, p.c> f5044a0;

    /* renamed from: b  reason: collision with root package name */
    public AbstractAdapter f5045b;

    /* renamed from: b0  reason: collision with root package name */
    public final ConcurrentHashMap<String, p.b> f5046b0;

    /* renamed from: c  reason: collision with root package name */
    public b0 f5047c;

    /* renamed from: c0  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f5048c0;

    /* renamed from: d  reason: collision with root package name */
    public IronSourceLoggerManager f5049d;

    /* renamed from: d0  reason: collision with root package name */
    public com.ironsource.mediationsdk.demandOnly.f f5050d0;

    /* renamed from: e  reason: collision with root package name */
    public e f5051e;

    /* renamed from: e0  reason: collision with root package name */
    public com.ironsource.mediationsdk.demandOnly.h f5052e0;

    /* renamed from: f  reason: collision with root package name */
    public k f5053f;

    /* renamed from: f0  reason: collision with root package name */
    public c f5054f0;

    /* renamed from: g  reason: collision with root package name */
    public String f5055g;

    /* renamed from: g0  reason: collision with root package name */
    public com.ironsource.mediationsdk.impressionData.a f5056g0;

    /* renamed from: h  reason: collision with root package name */
    public String f5057h;

    /* renamed from: h0  reason: collision with root package name */
    public com.ironsource.mediationsdk.b.a f5058h0;

    /* renamed from: i  reason: collision with root package name */
    public String f5059i;

    /* renamed from: i0  reason: collision with root package name */
    public AdQualityBridge f5060i0;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, String> f5061j;

    /* renamed from: j0  reason: collision with root package name */
    public n.a f5062j0;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public com.ironsource.mediationsdk.logger.b f5063l;

    /* renamed from: m  reason: collision with root package name */
    public String f5064m;

    /* renamed from: n  reason: collision with root package name */
    public AtomicBoolean f5065n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f5066o;

    /* renamed from: p  reason: collision with root package name */
    public AtomicBoolean f5067p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5068q;

    /* renamed from: r  reason: collision with root package name */
    public List<IronSource.AD_UNIT> f5069r;

    /* renamed from: s  reason: collision with root package name */
    public Context f5070s;

    /* renamed from: t  reason: collision with root package name */
    public Boolean f5071t;
    public HashSet u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5072v;
    public HashSet w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5073x;

    /* renamed from: y  reason: collision with root package name */
    public IronSourceSegment f5074y;

    /* renamed from: z  reason: collision with root package name */
    public int f5075z;

    /* renamed from: com.ironsource.mediationsdk.z$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5076a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5077b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f5078c;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0066 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.j.a.a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5078c = r0
                r1 = 0
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r1 = f5078c     // Catch:{ NoSuchFieldError -> 0x0012 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r1 = 3
                int[] r3 = f5078c     // Catch:{ NoSuchFieldError -> 0x0017 }
                r3[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r3 = 4
                int[] r4 = f5078c     // Catch:{ NoSuchFieldError -> 0x001c }
                r4[r1] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                com.ironsource.mediationsdk.E$a[] r4 = com.ironsource.mediationsdk.E.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f5077b = r4
                com.ironsource.mediationsdk.E$a r5 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r4 = f5077b     // Catch:{ NoSuchFieldError -> 0x0037 }
                com.ironsource.mediationsdk.E$a r5 = com.ironsource.mediationsdk.E.a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f5076a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r2 = f5076a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f5076a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x005c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f5076a     // Catch:{ NoSuchFieldError -> 0x0066 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f5076a     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.AnonymousClass2.<clinit>():void");
        }
    }

    public interface a {
        void a(String str);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static volatile z f5079a = new z(0);
    }

    private z() {
        this.f5043a = z.class.getName();
        this.f5066o = new Object();
        this.f5053f = null;
        this.f5055g = null;
        this.f5057h = "";
        this.f5059i = null;
        this.f5061j = null;
        this.k = null;
        this.f5068q = false;
        this.f5071t = null;
        this.f5073x = true;
        this.M = null;
        this.O = false;
        this.f5049d = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b((LogListener) null, 1);
        this.f5063l = bVar;
        this.f5049d.addLogger(bVar);
        this.f5051e = new e();
        b0 b0Var = new b0();
        this.f5047c = b0Var;
        b0Var.f4316c = this.f5051e;
        this.f5065n = new AtomicBoolean();
        this.u = new HashSet();
        this.w = new HashSet();
        this.E = false;
        this.D = false;
        this.F = false;
        this.f5067p = new AtomicBoolean(true);
        this.S = new AtomicBoolean(false);
        this.f5075z = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f5072v = false;
        this.f5064m = IronSourceUtils.getSessionId();
        this.J = Boolean.FALSE;
        this.X = false;
        this.L = null;
        this.N = null;
        this.P = null;
        this.R = null;
        this.Q = null;
        this.T = false;
        this.f5044a0 = new ConcurrentHashMap<>();
        this.f5048c0 = new CopyOnWriteArraySet<>();
        this.f5046b0 = new ConcurrentHashMap<>();
        this.f5050d0 = null;
        this.f5052e0 = null;
        this.f5054f0 = null;
        this.Z = 1;
        this.f5056g0 = new com.ironsource.mediationsdk.impressionData.a();
        this.f5058h0 = new com.ironsource.mediationsdk.b.a();
        new W();
        this.f5060i0 = null;
        this.f5062j0 = new n.a();
    }

    public /* synthetic */ z(int i10) {
        this();
    }

    public static void C(int i10, JSONObject jSONObject) {
        com.ironsource.mediationsdk.events.e.d().a(new com.ironsource.environment.c.a(i10, jSONObject));
    }

    public static void E(x xVar, Context context, k kVar) {
        com.ironsource.mediationsdk.events.e.d().b(xVar.e(), context);
        com.ironsource.mediationsdk.events.e.d().a(xVar.d(), context);
        com.ironsource.mediationsdk.events.e.d().b(xVar.g());
        com.ironsource.mediationsdk.events.e.d().c(xVar.h());
        com.ironsource.mediationsdk.events.e.d().a(xVar.f());
        com.ironsource.mediationsdk.events.e.d().a(xVar.i(), context);
        com.ironsource.mediationsdk.events.e.d().b(xVar.j(), context);
        com.ironsource.mediationsdk.events.e.d().c(xVar.k(), context);
        com.ironsource.mediationsdk.events.e.d().d(xVar.l(), context);
        com.ironsource.mediationsdk.events.e.d().a(kVar.f5019c.f().b());
        com.ironsource.mediationsdk.events.e.d().f4508c = xVar.b();
        com.ironsource.mediationsdk.events.e.d().f4509d = xVar.c();
    }

    public static void G(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("activity is updated to: " + activity.hashCode());
    }

    public static z a() {
        return b.f5079a;
    }

    public static String a(Context context) {
        String C2 = com.ironsource.environment.h.C(context);
        return !TextUtils.isEmpty(C2) ? C2 : "";
    }

    public static void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        C0196u.a().a(levelPlayInterstitialListener);
    }

    public static void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        P.a().f3994b = levelPlayRewardedVideoListener;
    }

    public static void a(boolean z9) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z9, 1);
        C0180c.a().b(z9);
    }

    public static boolean m() {
        Class<IronSourceAdQuality> cls = IronSourceAdQuality.class;
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist");
            return true;
        } catch (Throwable unused) {
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    public static k o(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            if (cachedValueByKeyOfCachedInitResponse.equals(str)) {
                k kVar = new k(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                kVar.f5021e = k.a.f5026b;
                return kVar;
            }
        }
        return null;
    }

    public static void r(int i10, JSONObject jSONObject) {
        i.d().a(new com.ironsource.environment.c.a(i10, jSONObject));
    }

    public static void v(x xVar, Context context, k kVar) {
        i.d().b(xVar.e(), context);
        i.d().a(xVar.d(), context);
        i.d().b(xVar.g());
        i.d().c(xVar.h());
        i.d().a(xVar.f());
        i.d().a(xVar.i(), context);
        i.d().b(xVar.j(), context);
        i.d().c(xVar.k(), context);
        i.d().d(xVar.l(), context);
        i.d().a(kVar.f5019c.f().b());
        i.d().f4508c = xVar.b();
        i.d().f4509d = xVar.c();
    }

    public static void w(JSONObject jSONObject, Object[][] objArr) {
        int i10 = 0;
        while (i10 <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i10++;
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
                return;
            }
        }
    }

    public static void x(boolean z9, boolean z10, int i10, JSONObject jSONObject) {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            if (a.AnonymousClass1.d()) {
                sb.append(IronSourceConstants.IS_APP_LANGUAGE_KOTLIN);
                str = a.AnonymousClass1.c();
            } else {
                str = IronSourceConstants.IS_APP_LANGUAGE_JAVA;
            }
            sb.append(str);
            sb.append(String.format(",androidx=%s", new Object[]{Boolean.valueOf(IronSourceUtils.isAndroidXAvailable())}));
            if (z10) {
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null);
                str2 = String.format(",Activity=%s", objArr);
            } else {
                if (!z9) {
                    sb.append(",");
                    str2 = IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW;
                }
                sb.append(String.format(",cachedUserAgent=%s", new Object[]{Boolean.valueOf(com.ironsource.environment.h.f3746a)}));
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
                jSONObject.put(IronSourceConstants.KEY_SESSION_DEPTH, i10);
                i.d().a(new com.ironsource.environment.c.a(14, jSONObject));
            }
            sb.append(str2);
            sb.append(String.format(",cachedUserAgent=%s", new Object[]{Boolean.valueOf(com.ironsource.environment.h.f3746a)}));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put(IronSourceConstants.KEY_SESSION_DEPTH, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        i.d().a(new com.ironsource.environment.c.a(14, jSONObject));
    }

    public static boolean z(int i10, int i11, String str) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    public final synchronized AbstractAdapter A(String str) {
        try {
            AbstractAdapter abstractAdapter = this.f5045b;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.f5045b;
            }
        } catch (Exception e10) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e10, 1);
        }
        return null;
    }

    public final k B(Context context, String str, E.f.a aVar) {
        k kVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a10 = a(context);
            if (TextUtils.isEmpty(a10)) {
                a10 = com.ironsource.environment.h.x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a10;
            IronSourceSegment ironSourceSegment = this.f5074y;
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f5055g, str, str2, this.k, this.T, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, M()), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(com.ironsource.mediationsdk.utils.e.a().b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    ironLog.warning("encoded response invalid - return null");
                    if (!f5042k0) {
                        f5042k0 = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_STATUS, "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                        i.d().a(new com.ironsource.environment.c.a(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            k kVar2 = new k(context, this.f5055g, str, stringFromURL);
            try {
                kVar2.f5021e = k.a.f5027c;
                if (kVar2.b()) {
                    return kVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e11) {
                e = e11;
                kVar = kVar2;
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.warning("exception = " + e);
                e.printStackTrace();
                return kVar;
            }
        } catch (Exception e12) {
            e = e12;
            IronLog ironLog22 = IronLog.INTERNAL;
            ironLog22.warning("exception = " + e);
            e.printStackTrace();
            return kVar;
        }
    }

    public final void D(IronSource.AD_UNIT ad_unit) {
        boolean z9;
        int i10;
        int i11 = AnonymousClass2.f5076a[ad_unit.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f5047c.a(this.f5055g, this.f5057h);
                } else if (i11 == 4) {
                    if (this.F) {
                        this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < this.f5053f.f5017a.f4786c.size(); i12++) {
                            String str = this.f5053f.f5017a.f4786c.get(i12);
                            if (!TextUtils.isEmpty(str)) {
                                arrayList.add(this.f5053f.f5018b.a(str));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            synchronized (this.f5046b0) {
                                d d10 = this.f5053f.f5019c.d();
                                e.a aVar = new e.a("Mediation");
                                if (d10.f4721j) {
                                    aVar.a("isOneFlow", 1);
                                }
                                this.f5054f0 = new c(arrayList, d10, this.f5055g, this.f5057h, new e.b(com.ironsource.mediationsdk.events.e.d(), aVar));
                            }
                            for (p.b next : this.f5046b0.values()) {
                                this.f5054f0.a(next.c(), next.a());
                            }
                            this.f5046b0.clear();
                            return;
                        }
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
                        w(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                        C(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
                        u(IronSource.AD_UNIT.BANNER, false);
                        return;
                    }
                    boolean z10 = this.f5053f.f5019c.d().f4720i.f4975a;
                    this.Y = z10;
                    if (z10) {
                        IronLog.INTERNAL.verbose();
                        ArrayList q10 = q(this.f5053f.f5017a.f4786c);
                        if (q10.size() > 0) {
                            this.C = new com.ironsource.mediationsdk.adunit.c.b(q10, this.f5053f.f5019c.d(), IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.d.c.a(), this.f5074y, this.f5053f.d());
                            Q();
                            return;
                        }
                        JSONObject mediationAdditionalData2 = IronSourceUtils.getMediationAdditionalData(false, true, 1);
                        w(mediationAdditionalData2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                        C(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData2);
                        u(IronSource.AD_UNIT.BANNER, false);
                        return;
                    }
                    IronLog.INTERNAL.verbose();
                    ArrayList q11 = q(this.f5053f.f5017a.f4786c);
                    if (q11.size() > 0) {
                        this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
                        this.Q = new I(q11, new com.ironsource.mediationsdk.events.d(this.f5055g, IronSourceUtils.getUserIdForNetworks(), this.f5053f.f5019c.d()), com.ironsource.mediationsdk.d.c.a().b(), this.f5074y);
                        Q();
                        return;
                    }
                    JSONObject mediationAdditionalData3 = IronSourceUtils.getMediationAdditionalData(false, true, 1);
                    w(mediationAdditionalData3, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                    C(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData3);
                    u(IronSource.AD_UNIT.BANNER, false);
                }
            } else if (this.E) {
                this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < this.f5053f.f5017a.f4785b.size(); i13++) {
                    String str2 = this.f5053f.f5017a.f4785b.get(i13);
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(this.f5053f.f5018b.a(str2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    synchronized (this.f5044a0) {
                        com.ironsource.mediationsdk.model.h b10 = this.f5053f.f5019c.b();
                        e.a aVar2 = new e.a("Mediation");
                        if (b10.f4748h) {
                            aVar2.a("isOneFlow", 1);
                        }
                        this.f5050d0 = new com.ironsource.mediationsdk.demandOnly.f(arrayList2, b10, C0180c.a(), this.f5062j0, this.f5055g, this.f5057h, new e.b(com.ironsource.mediationsdk.events.e.d(), aVar2));
                    }
                    for (p.c a10 : this.f5044a0.values()) {
                        this.f5050d0.a(a10);
                    }
                    this.f5044a0.clear();
                    return;
                }
                JSONObject mediationAdditionalData4 = IronSourceUtils.getMediationAdditionalData(false, false, 1);
                w(mediationAdditionalData4, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                C(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData4);
                u(IronSource.AD_UNIT.INTERSTITIAL, false);
            } else {
                boolean z11 = this.f5053f.f5019c.b().f4747g.f4975a;
                this.W = z11;
                if (z11) {
                    IronLog.INTERNAL.verbose();
                    ArrayList q12 = q(this.f5053f.f5017a.f4785b);
                    if (q12.size() > 0) {
                        f fVar = new f(q12, this.f5053f.f5019c.b(), IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.d.c.a(), this.f5074y, this.f5053f.d());
                        this.A = fVar;
                        Boolean bool = this.f5071t;
                        if (bool != null) {
                            fVar.a(this.f5070s, bool.booleanValue());
                        }
                        if (this.X) {
                            this.X = false;
                            this.A.i();
                            return;
                        }
                        return;
                    }
                    JSONObject mediationAdditionalData5 = IronSourceUtils.getMediationAdditionalData(false, true, 1);
                    w(mediationAdditionalData5, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                    C(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData5);
                    u(IronSource.AD_UNIT.INTERSTITIAL, false);
                    return;
                }
                IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, "Adunit: Interstitial is now initiated - programmatic mode", 0);
                ArrayList q13 = q(this.f5053f.f5017a.f4785b);
                if (q13.size() > 0) {
                    c0 c0Var = new c0(q13, this.f5053f.f5019c.b(), this.f5055g, IronSourceUtils.getUserIdForNetworks(), this.f5053f.f5019c.b().f4746f, com.ironsource.mediationsdk.d.c.a().b(), this.f5074y);
                    this.P = c0Var;
                    Boolean bool2 = this.f5071t;
                    if (bool2 != null) {
                        boolean booleanValue = bool2.booleanValue();
                        IronSourceLoggerManager.getLogger().log(ironSourceTag, "Should Track Network State: " + booleanValue, 0);
                        c0Var.A = booleanValue;
                    }
                    if (this.X) {
                        this.X = false;
                        this.P.d();
                        return;
                    }
                    return;
                }
                JSONObject mediationAdditionalData6 = IronSourceUtils.getMediationAdditionalData(false, true, 1);
                w(mediationAdditionalData6, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                C(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData6);
                u(IronSource.AD_UNIT.INTERSTITIAL, false);
            }
        } else if (this.D) {
            this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < this.f5053f.f5017a.f4784a.size(); i14++) {
                String str3 = this.f5053f.f5017a.f4784a.get(i14);
                if (!TextUtils.isEmpty(str3)) {
                    arrayList3.add(this.f5053f.f5018b.a(str3));
                }
            }
            if (arrayList3.size() > 0) {
                synchronized (this.f5048c0) {
                    this.f5052e0 = new com.ironsource.mediationsdk.demandOnly.h(arrayList3, this.f5053f.f5019c.a(), this.f5055g, this.f5057h);
                }
                if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
                    Iterator<String> it = this.f5048c0.iterator();
                    while (it.hasNext()) {
                        this.f5052e0.a(it.next(), (String) null, false);
                    }
                    this.f5048c0.clear();
                    return;
                }
            }
            u(IronSource.AD_UNIT.REWARDED_VIDEO, false);
        } else {
            com.ironsource.mediationsdk.utils.c cVar = this.f5053f.f5019c.a().f4801m;
            boolean z12 = cVar.f4975a;
            this.V = z12;
            if (z12 || this.T || !cVar.f4984j) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            this.Z = i10;
            if (this.T || z12) {
                IronLog.INTERNAL.verbose();
                ArrayList q14 = q(this.f5053f.f5017a.f4784a);
                if (q14.size() > 0) {
                    com.ironsource.mediationsdk.adunit.c.h hVar = new com.ironsource.mediationsdk.adunit.c.h(q14, this.f5053f.f5019c.a(), IronSourceUtils.getUserIdForNetworks(), this.T, com.ironsource.mediationsdk.d.c.a(), this.f5074y, this.f5053f.d());
                    this.B = hVar;
                    Boolean bool3 = this.f5071t;
                    if (bool3 != null) {
                        hVar.a(this.f5070s, bool3.booleanValue());
                    }
                    if (this.U && this.T) {
                        this.U = false;
                        this.B.i();
                        return;
                    }
                    return;
                }
                JSONObject mediationAdditionalData7 = IronSourceUtils.getMediationAdditionalData(false, true, this.Z);
                w(mediationAdditionalData7, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
                r(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData7);
                u(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
            ArrayList q15 = q(this.f5053f.f5017a.f4784a);
            if (q15.size() > 0) {
                a0 a0Var = new a0(q15, this.f5053f.f5019c.a(), this.f5055g, IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.d.c.a().b(), this.f5074y);
                this.N = a0Var;
                Boolean bool4 = this.f5071t;
                if (bool4 != null) {
                    a0Var.a(this.f5070s, bool4.booleanValue());
                    return;
                }
                return;
            }
            JSONObject mediationAdditionalData8 = IronSourceUtils.getMediationAdditionalData(false, true, this.Z);
            w(mediationAdditionalData8, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            r(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData8);
            u(IronSource.AD_UNIT.REWARDED_VIDEO, false);
        }
    }

    public final boolean F(p.b bVar) {
        if (E.a().b() != E.a.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f5046b0) {
            this.f5046b0.put(bVar.a(), bVar);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(android.app.Activity r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r8 = r6.N(r8)     // Catch:{ Exception -> 0x0029 }
            if (r8 != 0) goto L_0x000f
            com.ironsource.mediationsdk.model.Placement r8 = r6.R()     // Catch:{ Exception -> 0x000d }
            goto L_0x000f
        L_0x000d:
            r2 = move-exception
            goto L_0x002b
        L_0x000f:
            if (r8 != 0) goto L_0x0034
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f5049d     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000d }
            r3.log(r4, r2, r0)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000d }
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x000d }
            com.ironsource.mediationsdk.P r2 = com.ironsource.mediationsdk.P.a()     // Catch:{ Exception -> 0x000d }
            r2.a((com.ironsource.mediationsdk.logger.IronSourceError) r3, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)     // Catch:{ Exception -> 0x000d }
            return
        L_0x0029:
            r2 = move-exception
            r8 = r1
        L_0x002b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f5049d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L_0x0034:
            if (r7 == 0) goto L_0x003a
            G(r7)
            goto L_0x005b
        L_0x003a:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            if (r2 != 0) goto L_0x005b
            java.lang.String r7 = "Activity must be provided in showRewardedVideo when initializing SDK with context"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r6.f5049d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r8.log(r2, r7, r0)
            com.ironsource.mediationsdk.P r8 = com.ironsource.mediationsdk.P.a()
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r7 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r7, r0)
            r8.a((com.ironsource.mediationsdk.logger.IronSourceError) r7, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)
            return
        L_0x005b:
            com.ironsource.mediationsdk.adunit.c.h r2 = r6.B
            if (r2 == 0) goto L_0x006b
            boolean r3 = r6.T
            if (r3 != 0) goto L_0x0067
            boolean r3 = r6.V
            if (r3 == 0) goto L_0x006b
        L_0x0067:
            r2.a((android.app.Activity) r7, (com.ironsource.mediationsdk.model.Placement) r8)
            return
        L_0x006b:
            com.ironsource.mediationsdk.a0 r2 = r6.N
            if (r2 == 0) goto L_0x0073
            r2.a((android.app.Activity) r7, (com.ironsource.mediationsdk.model.Placement) r8)
            return
        L_0x0073:
            java.lang.String r7 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r6.f5049d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r8.log(r2, r7, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r8 = new com.ironsource.mediationsdk.logger.IronSourceError
            r0 = 1023(0x3ff, float:1.434E-42)
            r8.<init>(r0, r7)
            com.ironsource.mediationsdk.P r7 = com.ironsource.mediationsdk.P.a()
            r7.a((com.ironsource.mediationsdk.logger.IronSourceError) r8, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.H(android.app.Activity, java.lang.String):void");
    }

    public final void I(Activity activity, String str) {
        try {
            InterstitialPlacement O2 = O(str);
            if (O2 == null) {
                O2 = e();
            }
            if (O2 == null) {
                this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                C0196u.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                G(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f5049d.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                C0196u.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            if (this.W) {
                this.A.a(activity, new Placement(O2));
            } else {
                this.P.a(activity, O2.getPlacementName());
            }
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = (r0 = r0.f5017a).f4784a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J() {
        /*
            r3 = this;
            boolean r0 = r3.S()
            r1 = 0
            if (r0 == 0) goto L_0x0020
            com.ironsource.mediationsdk.utils.k r0 = r3.f5053f
            r2 = 1
            if (r0 == 0) goto L_0x001c
            com.ironsource.mediationsdk.model.o r0 = r0.f5017a
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList<java.lang.String> r0 = r0.f4784a
            if (r0 == 0) goto L_0x001c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            return r2
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.J():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = (r0 = r0.f5017a).f4785b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K() {
        /*
            r3 = this;
            boolean r0 = r3.g()
            r1 = 0
            if (r0 == 0) goto L_0x0020
            com.ironsource.mediationsdk.utils.k r0 = r3.f5053f
            r2 = 1
            if (r0 == 0) goto L_0x001c
            com.ironsource.mediationsdk.model.o r0 = r0.f5017a
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList<java.lang.String> r0 = r0.f4785b
            if (r0 == 0) goto L_0x001c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            return r2
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.K():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f5019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f5053f
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.f r0 = r0.f5019c
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.k r0 = r0.c()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.L():boolean");
    }

    public final boolean M() {
        return this.D || this.E || this.F;
    }

    public final Placement N(String str) {
        q a10 = this.f5053f.f5019c.a();
        if (a10 != null) {
            Iterator<Placement> it = a10.f4790a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final InterstitialPlacement O(String str) {
        com.ironsource.mediationsdk.model.h b10 = this.f5053f.f5019c.b();
        if (b10 != null) {
            Iterator<InterstitialPlacement> it = b10.f4741a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final com.ironsource.mediationsdk.model.e P(String str) {
        d d10 = this.f5053f.f5019c.d();
        if (d10 == null) {
            return new g();
        }
        if (TextUtils.isEmpty(str)) {
            return d10.a();
        }
        com.ironsource.mediationsdk.model.e a10 = d10.a(str);
        return a10 != null ? a10 : d10.a();
    }

    public final void Q() {
        if (this.J.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.J = Boolean.FALSE;
            a(this.K, this.L);
            this.K = null;
            this.L = null;
        }
    }

    public final Placement R() {
        q a10 = this.f5053f.f5019c.a();
        if (a10 != null) {
            return a10.a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f5019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean S() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f5053f
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.f r0 = r0.f5019c
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.q r0 = r0.a()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.S():boolean");
    }

    public final IronSourceBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f5049d.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public final void a(Activity activity) {
        if (!S()) {
            P.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement R2 = R();
        if (R2 == null) {
            this.f5049d.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            P.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        a(activity, R2.getPlacementName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.app.Activity r5, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.demandOnly.p$b r0 = new com.ironsource.mediationsdk.demandOnly.p$b     // Catch:{ all -> 0x009d }
            r0.<init>(r7)     // Catch:{ all -> 0x009d }
            r0.a((android.app.Activity) r5)     // Catch:{ all -> 0x009d }
            r0.a((com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout) r6)     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = r0.d()     // Catch:{ all -> 0x009d }
            r2 = 3
            if (r1 == 0) goto L_0x0029
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f5049d     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x009d }
            java.lang.String r3 = r1.getErrorMessage()     // Catch:{ all -> 0x009d }
            r5.log(r0, r3, r2)     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x0027
            com.ironsource.mediationsdk.demandOnly.a r5 = r6.getListener()     // Catch:{ all -> 0x009d }
            r5.a(r7, r1)     // Catch:{ all -> 0x009d }
        L_0x0027:
            monitor-exit(r4)
            return
        L_0x0029:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.E$a r1 = r1.b()     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = r4.n(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x004b
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f5049d     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x009d }
            java.lang.String r3 = r1.getErrorMessage()     // Catch:{ all -> 0x009d }
            r5.log(r0, r3, r2)     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.demandOnly.a r5 = r6.getListener()     // Catch:{ all -> 0x009d }
            r5.a(r7, r1)     // Catch:{ all -> 0x009d }
            monitor-exit(r4)
            return
        L_0x004b:
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x009d }
            r1.updateActivity(r5)     // Catch:{ all -> 0x009d }
            boolean r5 = r4.F(r0)     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x005a
            monitor-exit(r4)
            return
        L_0x005a:
            boolean r5 = r4.k()     // Catch:{ all -> 0x009d }
            if (r5 != 0) goto L_0x007a
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r4.f5049d     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "No banner configurations found"
            r5.log(r0, r1, r2)     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.demandOnly.a r5 = r6.getListener()     // Catch:{ all -> 0x009d }
            java.lang.String r6 = "the server response does not contain banner data"
            java.lang.String r0 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r6 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r6, r0)     // Catch:{ all -> 0x009d }
            r5.a(r7, r6)     // Catch:{ all -> 0x009d }
            monitor-exit(r4)
            return
        L_0x007a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$b> r5 = r4.f5046b0     // Catch:{ all -> 0x009d }
            monitor-enter(r5)     // Catch:{ all -> 0x009d }
            com.ironsource.mediationsdk.demandOnly.c r1 = r4.f5054f0     // Catch:{ all -> 0x009a }
            if (r1 != 0) goto L_0x008d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$b> r1 = r4.f5046b0     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x009a }
            r1.put(r2, r0)     // Catch:{ all -> 0x009a }
            r0 = 1
            monitor-exit(r5)     // Catch:{ all -> 0x009a }
            goto L_0x008f
        L_0x008d:
            r0 = 0
            monitor-exit(r5)     // Catch:{ all -> 0x009a }
        L_0x008f:
            if (r0 == 0) goto L_0x0093
            monitor-exit(r4)
            return
        L_0x0093:
            com.ironsource.mediationsdk.demandOnly.c r5 = r4.f5054f0     // Catch:{ all -> 0x009d }
            r5.a(r6, r7)     // Catch:{ all -> 0x009d }
            monitor-exit(r4)
            return
        L_0x009a:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009a }
            throw r6     // Catch:{ all -> 0x009d }
        L_0x009d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.a(android.app.Activity, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout, java.lang.String):void");
    }

    public final void a(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.D) {
                this.f5049d.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                P.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!S()) {
                P.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else {
                H(activity, str);
            }
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            P.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()), (AdInfo) null);
        }
    }

    public final synchronized void a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f5049d.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            r.a().a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r9, java.lang.String r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            r1 = 1
            if (r11 == 0) goto L_0x008a
            int r2 = r11.length     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r2 = r11.length     // Catch:{ all -> 0x00f1 }
            r3 = 0
        L_0x0010:
            if (r3 >= r2) goto L_0x00bd
            r4 = r11[r3]     // Catch:{ all -> 0x00f1 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f1 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f5049d     // Catch:{ all -> 0x00f1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r7.<init>()     // Catch:{ all -> 0x00f1 }
            r7.append(r4)     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = " ad unit cannot be initialized in demand only mode"
            r7.append(r4)     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x00f1 }
            r7 = 3
            r5.log(r6, r4, r7)     // Catch:{ all -> 0x00f1 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f1 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x0051
            boolean r5 = r8.H     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x0046
            r8.t(r4)     // Catch:{ all -> 0x00f1 }
            goto L_0x0051
        L_0x0046:
            r8.E = r1     // Catch:{ all -> 0x00f1 }
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x00f1 }
            if (r5 != 0) goto L_0x0051
            r0.add(r4)     // Catch:{ all -> 0x00f1 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f1 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x006c
            boolean r5 = r8.G     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x0061
            r8.t(r4)     // Catch:{ all -> 0x00f1 }
            goto L_0x006c
        L_0x0061:
            r8.D = r1     // Catch:{ all -> 0x00f1 }
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x00f1 }
            if (r5 != 0) goto L_0x006c
            r0.add(r4)     // Catch:{ all -> 0x00f1 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f1 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.I     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x007c
            r8.t(r4)     // Catch:{ all -> 0x00f1 }
            goto L_0x0087
        L_0x007c:
            r8.F = r1     // Catch:{ all -> 0x00f1 }
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x00f1 }
            if (r5 != 0) goto L_0x0087
            r0.add(r4)     // Catch:{ all -> 0x00f1 }
        L_0x0087:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r8.G     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f1 }
            r8.t(r11)     // Catch:{ all -> 0x00f1 }
            goto L_0x009b
        L_0x0094:
            r8.D = r1     // Catch:{ all -> 0x00f1 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f1 }
            r0.add(r11)     // Catch:{ all -> 0x00f1 }
        L_0x009b:
            boolean r11 = r8.H     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f1 }
            r8.t(r11)     // Catch:{ all -> 0x00f1 }
            goto L_0x00ac
        L_0x00a5:
            r8.E = r1     // Catch:{ all -> 0x00f1 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f1 }
            r0.add(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00ac:
            boolean r11 = r8.I     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f1 }
            r8.t(r11)     // Catch:{ all -> 0x00f1 }
            goto L_0x00bd
        L_0x00b6:
            r8.F = r1     // Catch:{ all -> 0x00f1 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f1 }
            r0.add(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00bd:
            if (r9 == 0) goto L_0x00d4
            boolean r11 = r9 instanceof android.app.Activity     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00c9
            r11 = r9
            android.app.Activity r11 = (android.app.Activity) r11     // Catch:{ all -> 0x00f1 }
            G(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00c9:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f1 }
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ all -> 0x00f1 }
            r11.updateAppContext(r1)     // Catch:{ all -> 0x00f1 }
        L_0x00d4:
            boolean r11 = r0.isEmpty()     // Catch:{ all -> 0x00f1 }
            if (r11 != 0) goto L_0x00ef
            int r11 = r0.size()     // Catch:{ all -> 0x00f1 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f1 }
            java.lang.Object[] r11 = r0.toArray(r11)     // Catch:{ all -> 0x00f1 }
            r5 = r11
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f1 }
            r3 = 1
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r8)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementName = " + str);
        if (this.F) {
            this.f5049d.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            C0192q.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", IronSourceConstants.BANNER_AD_UNIT));
        } else if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb = new StringBuilder("loadBanner can't be called - ");
            sb.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String sb2 = sb.toString();
            this.f5049d.log(IronSourceLogger.IronSourceTag.API, sb2, 3);
            C0192q.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(sb2));
        } else if (!this.I) {
            this.f5049d.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            C0192q.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
        } else if (!ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") || (ironSourceBannerLayout.getSize().getWidth() > 0 && ironSourceBannerLayout.getSize().getHeight() > 0)) {
            E.a b10 = E.a().b();
            if (b10 == E.a.INIT_FAILED) {
                this.f5049d.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                C0192q.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
            } else if (b10 == E.a.INIT_IN_PROGRESS) {
                if (E.a().c()) {
                    this.f5049d.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0192q.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init() had failed"));
                    return;
                }
                this.K = ironSourceBannerLayout;
                this.J = Boolean.TRUE;
                this.L = str;
            } else if (!k()) {
                this.f5049d.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                C0192q.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            } else {
                I i10 = this.Q;
                if (i10 == null && this.C == null) {
                    this.K = ironSourceBannerLayout;
                    this.J = Boolean.TRUE;
                    this.L = str;
                } else if (this.Y) {
                    this.C.a(ironSourceBannerLayout, new Placement(P(str)));
                } else {
                    i10.a(ironSourceBannerLayout, P(str));
                }
            }
        } else {
            this.f5049d.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            C0192q.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
        }
    }

    public final synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.G) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.T = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.T = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        P.a().f3994b = levelPlayRewardedVideoManualListener;
    }

    public final synchronized void a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.G) {
            if (rewardedVideoManualListener == null) {
                this.T = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.T = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.f5051e.f4837a = rewardedVideoManualListener;
        P.a().f3993a = rewardedVideoManualListener;
    }

    public final void a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f5051e != null) {
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    u((IronSource.AD_UNIT) it.next(), true);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C0180c.a().a(metaDataKey, metaDataValue);
            } else if (E.a().b() != E.a.INITIATED || !MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                com.ironsource.mediationsdk.d.c.a().a(metaDataKey, metaDataValue);
            } else {
                ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C0180c.a().f4335d;
                concurrentHashMap.putAll(com.ironsource.mediationsdk.d.c.a().c());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                com.ironsource.environment.c.e.a("md", (Object) jSONObject);
            } catch (JSONException e10) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e10.getMessage());
                e10.printStackTrace();
            }
            i.d().a(new com.ironsource.environment.c.a(E.a().b() == E.a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    public final void a(List<IronSource.AD_UNIT> list, boolean z9, com.ironsource.mediationsdk.model.f fVar) {
        IronLog.INTERNAL.verbose();
        try {
            this.f5063l.f4673d = fVar.f().a().c();
            this.f5069r = list;
            boolean z10 = true;
            this.f5068q = true;
            this.f5049d.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z9) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                i.d().a(new com.ironsource.environment.c.a(114, mediationAdditionalData));
            }
            com.ironsource.mediationsdk.events.e.d().b();
            i.d().b();
            C0180c a10 = C0180c.a();
            String str = this.f5055g;
            String str2 = this.f5057h;
            a10.f4334c = str;
            a10.f4336e = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.u.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        D(ad_unit);
                    } else {
                        u(ad_unit, false);
                    }
                }
            }
            if (m()) {
                if (this.f5060i0 != null || !this.f5053f.f5019c.h().a() || !AdQualityBridge.adQualityAvailable()) {
                    z10 = false;
                }
                if (z10) {
                    AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), this.f5055g, this.f5057h, this.f5053f.f5019c.f().a().b());
                    this.f5060i0 = adQualityBridge;
                    IronSourceSegment ironSourceSegment = this.f5074y;
                    if (ironSourceSegment != null) {
                        adQualityBridge.setSegment(ironSourceSegment);
                    }
                }
            }
            l();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final com.ironsource.mediationsdk.adunit.c.g b() {
        IronLog.INTERNAL.verbose();
        ArrayList q10 = q(this.f5053f.f5017a.f4787d);
        if (q10.size() > 0) {
            return new com.ironsource.mediationsdk.adunit.c.g(q10, this.f5053f.f5019c.e(), IronSourceUtils.getUserIdForNetworks(), com.ironsource.mediationsdk.d.c.a(), this.f5074y, this.f5053f.d());
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        w(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        C(IronSourceConstants.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    public final String b(Context context) {
        String str;
        com.ironsource.mediationsdk.utils.n nVar;
        r(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        E.a b10 = E.a().b();
        E.a aVar = E.a.NOT_INIT;
        if (b10 == aVar) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            r(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else if (b10 == E.a.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            r(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else {
            try {
                k kVar = this.f5053f;
                if (kVar == null) {
                    kVar = C0198w.a(context);
                }
                if (b10 == aVar) {
                    com.ironsource.environment.c.e.a(context);
                    com.ironsource.environment.c.e.a("medv", (Object) IronSourceUtils.getSDKVersion());
                    com.ironsource.environment.c.e.a("sid", (Object) this.f5064m);
                    com.ironsource.environment.c.e.a("plugin", (Object) ConfigFile.getConfigFile().getPluginType());
                    this.f5058h0.a(com.ironsource.c.a.a());
                    this.f5058h0.a(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b10 != E.a.INITIATED) {
                    E.a().a(kVar);
                    if (kVar != null) {
                        E.a().a(context, kVar);
                    }
                }
                if (kVar == null || !kVar.b()) {
                    nVar = new com.ironsource.mediationsdk.utils.n();
                } else {
                    nVar = kVar.f5019c.f().c();
                    if (!nVar.f5035d) {
                        nVar.f5033b = kVar.f5018b.a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                JSONObject a10 = W.a(context, nVar);
                C0182e.a().a(a10, true);
                str = nVar.f5036e ? IronSourceAES.compressAndEncrypt(a10.toString()) : IronSourceAES.encrypt(a10.toString());
            } catch (Throwable th) {
                r(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
                IronLog ironLog = IronLog.API;
                ironLog.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                r(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            }
            return str;
        }
    }

    public final void b(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.E) {
                this.f5049d.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C0196u.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!g()) {
                C0196u.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT), (AdInfo) null);
            } else {
                InterstitialPlacement e10 = e();
                if (e10 != null) {
                    b(activity, e10.getPlacementName());
                } else {
                    C0196u.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e11) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e11);
            C0196u.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e11.getMessage()), (AdInfo) null);
        }
    }

    public final void b(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.E) {
                this.f5049d.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C0196u.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!g()) {
                C0196u.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT), (AdInfo) null);
            } else {
                I(activity, str);
            }
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            C0196u.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()), (AdInfo) null);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f5049d     // Catch:{ all -> 0x014e }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x014e }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x014e }
            r2.append(r8)     // Catch:{ all -> 0x014e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x014e }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x014e }
            boolean r0 = r6.G     // Catch:{ all -> 0x0130 }
            r2 = 508(0x1fc, float:7.12E-43)
            r4 = 3
            if (r0 != 0) goto L_0x0033
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f5049d     // Catch:{ all -> 0x0130 }
            r9.log(r1, r7, r4)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.r r9 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0130 }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x0130 }
            r9.a(r8, r0)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x0033:
            boolean r0 = r6.D     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x004c
            java.lang.String r7 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f5049d     // Catch:{ all -> 0x0130 }
            r9.log(r1, r7, r4)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.r r9 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0130 }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x0130 }
            r9.a(r8, r0)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x004c:
            r0 = 0
            if (r7 == 0) goto L_0x0053
            G(r7)     // Catch:{ all -> 0x0130 }
            goto L_0x0082
        L_0x0053:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0130 }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x0130 }
            if (r7 != 0) goto L_0x0082
            if (r9 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r0 = r3
        L_0x0061:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0130 }
            r9 = 81321(0x13da9, float:1.13955E-40)
            r(r9, r7)     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f5049d     // Catch:{ all -> 0x0130 }
            r9.log(r1, r7, r4)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.r r9 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0130 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0130 }
            r9.a(r8, r0)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x0082:
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.E$a r7 = r7.b()     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.E$a r2 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ all -> 0x0130 }
            if (r7 != r2) goto L_0x00a6
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f5049d     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "init() had failed"
            r7.log(r1, r9, r4)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.r r7 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r0)     // Catch:{ all -> 0x0130 }
            r7.a(r8, r9)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x00a6:
            com.ironsource.mediationsdk.E$a r2 = com.ironsource.mediationsdk.E.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0130 }
            r5 = 83002(0x1443a, float:1.1631E-40)
            if (r7 != r2) goto L_0x00e8
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0130 }
            boolean r7 = r7.c()     // Catch:{ all -> 0x0130 }
            if (r7 == 0) goto L_0x00cf
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f5049d     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "init() had failed"
            r7.log(r1, r9, r4)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.r r7 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r0)     // Catch:{ all -> 0x0130 }
            r7.a(r8, r9)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x00cf:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f5048c0     // Catch:{ all -> 0x0130 }
            monitor-enter(r7)     // Catch:{ all -> 0x0130 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r6.f5048c0     // Catch:{ all -> 0x00e5 }
            r0.add(r8)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x00e3
            int r7 = r6.Z     // Catch:{ all -> 0x0130 }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r7)     // Catch:{ all -> 0x0130 }
            r(r5, r7)     // Catch:{ all -> 0x0130 }
        L_0x00e3:
            monitor-exit(r6)
            return
        L_0x00e5:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e5 }
            throw r9     // Catch:{ all -> 0x0130 }
        L_0x00e8:
            boolean r7 = r6.J()     // Catch:{ all -> 0x0130 }
            if (r7 != 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f5049d     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "No rewarded video configurations found"
            r7.log(r1, r9, r4)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.r r7 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r0)     // Catch:{ all -> 0x0130 }
            r7.a(r8, r9)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x0106:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f5048c0     // Catch:{ all -> 0x0130 }
            monitor-enter(r7)     // Catch:{ all -> 0x0130 }
            com.ironsource.mediationsdk.demandOnly.h r1 = r6.f5052e0     // Catch:{ all -> 0x012d }
            if (r1 != 0) goto L_0x0120
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r6.f5048c0     // Catch:{ all -> 0x012d }
            r0.add(r8)     // Catch:{ all -> 0x012d }
            if (r9 == 0) goto L_0x011d
            int r9 = r6.Z     // Catch:{ all -> 0x012d }
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r9)     // Catch:{ all -> 0x012d }
            r(r5, r9)     // Catch:{ all -> 0x012d }
        L_0x011d:
            monitor-exit(r7)     // Catch:{ all -> 0x012d }
            monitor-exit(r6)
            return
        L_0x0120:
            monitor-exit(r7)     // Catch:{ all -> 0x012d }
            if (r9 != 0) goto L_0x0128
            r7 = 0
            r1.a((java.lang.String) r8, (java.lang.String) r7, (boolean) r0)     // Catch:{ all -> 0x0130 }
            goto L_0x014c
        L_0x0128:
            r1.a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return
        L_0x012d:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x012d }
            throw r9     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f5049d     // Catch:{ all -> 0x014e }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014e }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r9.logException(r0, r1, r7)     // Catch:{ all -> 0x014e }
            com.ironsource.mediationsdk.demandOnly.r r9 = com.ironsource.mediationsdk.demandOnly.r.a()     // Catch:{ all -> 0x014e }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x014e }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x014e }
            r9.a(r8, r0)     // Catch:{ all -> 0x014e }
        L_0x014c:
            monitor-exit(r6)
            return
        L_0x014e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    public final void b(boolean z9) {
        this.M = Boolean.valueOf(z9);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z9, 1);
        C0180c.a().a(z9);
        if (this.f5045b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z9 + ")", 1);
            this.f5045b.setConsent(z9);
        }
        int i10 = 40;
        if (!z9) {
            i10 = 41;
        }
        com.ironsource.environment.c.e.a("cnst", (Object) Boolean.valueOf(z9));
        i.d().a(new com.ironsource.environment.c.a(i10, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final void c() {
        if (this.J.booleanValue()) {
            this.J = Boolean.FALSE;
            C0192q.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
            this.K = null;
            this.L = null;
        }
        if (this.X) {
            this.X = false;
            C0192q.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        if (this.U) {
            this.U = false;
            C0192q.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f5044a0) {
            for (p.c a10 : this.f5044a0.values()) {
                String a11 = a10.a();
                ((ISDemandOnlyInterstitialListener) this.f5062j0.a(a11)).onInterstitialAdLoadFailed(a11, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.f5044a0.clear();
        }
        synchronized (this.f5048c0) {
            Iterator<String> it = this.f5048c0.iterator();
            while (it.hasNext()) {
                r.a().a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f5048c0.clear();
        }
        synchronized (this.f5046b0) {
            for (p.b next : this.f5046b0.values()) {
                ISDemandOnlyBannerLayout c10 = next.c();
                if (c10 != null) {
                    c10.getListener().a(next.a(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.BANNER_AD_UNIT));
                }
            }
            this.f5046b0.clear();
        }
    }

    public final synchronized void c(Activity activity, String str) {
        s(activity, new p.c(str), (ISDemandOnlyInterstitialListener) this.f5062j0.a(str));
    }

    public final synchronized void c(Activity activity, String str, String str2) {
        p.c cVar = new p.c(str);
        cVar.a(str2);
        cVar.a(true);
        s(activity, cVar, (ISDemandOnlyInterstitialListener) this.f5062j0.a(str));
    }

    public final boolean c(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, this.f5043a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            com.ironsource.d.a aVar = new com.ironsource.d.a();
            if (!z(1, 128, str)) {
                aVar.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (aVar.a()) {
                this.f5059i = str;
                i.d().a(new com.ironsource.environment.c.a(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(ironSourceTag, aVar.b().toString(), 2);
            return false;
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, this.f5043a + ":setDynamicUserId(dynamicUserId:" + str + ")", e10);
            return false;
        }
    }

    public final void d(String str) {
        boolean z9;
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f5043a + ":setMediationType(mediationType:" + str + ")", 1);
            if (z(1, 64, str)) {
                if (str == null) {
                    z9 = false;
                } else {
                    z9 = str.matches("^[a-zA-Z0-9]*$");
                }
                if (z9) {
                    this.k = str;
                    com.ironsource.environment.c.e.a("mt", (Object) str);
                    return;
                }
            }
            this.f5049d.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, this.f5043a + ":setMediationType(mediationType:" + str + ")", e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.g() != false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052 A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[Catch:{ all -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r8 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r8.D     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r8.f5049d     // Catch:{ all -> 0x0078 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0013:
            boolean r3 = r8.T     // Catch:{ all -> 0x0078 }
            if (r3 != 0) goto L_0x0027
            boolean r3 = r8.V     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x001c
            goto L_0x0027
        L_0x001c:
            com.ironsource.mediationsdk.a0 r3 = r8.N     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0033
            boolean r3 = r3.b()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0033
            goto L_0x0031
        L_0x0027:
            com.ironsource.mediationsdk.adunit.c.h r3 = r8.B     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0033
            boolean r3 = r3.g()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x0076 }
            java.lang.Object[][] r5 = new java.lang.Object[r1][]     // Catch:{ all -> 0x0076 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch:{ all -> 0x0076 }
            int r7 = r8.Z     // Catch:{ all -> 0x0076 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0076 }
            r6[r1] = r7     // Catch:{ all -> 0x0076 }
            r5[r2] = r6     // Catch:{ all -> 0x0076 }
            w(r4, r5)     // Catch:{ all -> 0x0076 }
            com.ironsource.environment.c.a r5 = new com.ironsource.environment.c.a     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0055
            r6 = 1101(0x44d, float:1.543E-42)
            goto L_0x0057
        L_0x0055:
            r6 = 1102(0x44e, float:1.544E-42)
        L_0x0057:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0076 }
            com.ironsource.mediationsdk.events.i r4 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ all -> 0x0076 }
            r4.a((com.ironsource.environment.c.a) r5)     // Catch:{ all -> 0x0076 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r8.f5049d     // Catch:{ all -> 0x0076 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r6.<init>(r0)     // Catch:{ all -> 0x0076 }
            r6.append(r3)     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0076 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0076 }
            r2 = r3
            goto L_0x0095
        L_0x0076:
            r4 = move-exception
            goto L_0x007b
        L_0x0078:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L_0x007b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f5049d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r8.f5049d
            java.lang.String r1 = "isRewardedVideoAvailable()"
            r0.logException(r6, r1, r4)
        L_0x0095:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.d():boolean");
    }

    public final InterstitialPlacement e() {
        com.ironsource.mediationsdk.model.h b10 = this.f5053f.f5019c.b();
        if (b10 != null) {
            return b10.a();
        }
        return null;
    }

    public final synchronized void e(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.D) {
                this.f5049d.log(ironSourceTag, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                r.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.h hVar = this.f5052e0;
            if (hVar == null) {
                this.f5049d.log(ironSourceTag, "Rewarded video was not initiated", 3);
                r.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
                return;
            } else if (!hVar.f4427a.containsKey(str)) {
                com.ironsource.mediationsdk.demandOnly.h.a((int) IronSourceConstants.RV_INSTANCE_NOT_FOUND, str);
                r.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                com.ironsource.mediationsdk.demandOnly.i iVar = hVar.f4427a.get(str);
                hVar.a((int) IronSourceConstants.RV_INSTANCE_SHOW, iVar);
                iVar.a();
                return;
            }
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e10);
            r.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()));
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r3 = r9.P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r9.A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.E     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f5049d     // Catch:{ all -> 0x0061 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x0013:
            boolean r3 = r9.W     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0025
            com.ironsource.mediationsdk.adunit.c.f r3 = r9.A     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.g()     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r3 = r1
            goto L_0x0030
        L_0x0023:
            r3 = r2
            goto L_0x0030
        L_0x0025:
            com.ironsource.mediationsdk.c0 r3 = r9.P     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.e()     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0023
            goto L_0x0021
        L_0x0030:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r1, r1)     // Catch:{ all -> 0x005c }
            com.ironsource.environment.c.a r5 = new com.ironsource.environment.c.a     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x003b
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x003d
        L_0x003b:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x003d:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.events.e r4 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ all -> 0x005c }
            r4.a((com.ironsource.environment.c.a) r5)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f5049d     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r6.<init>(r0)     // Catch:{ all -> 0x005c }
            r6.append(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x005c }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x005c }
            r2 = r3
            goto L_0x007d
        L_0x005c:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0063
        L_0x0061:
            r3 = move-exception
            r4 = r2
        L_0x0063:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f5049d
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f5049d
            java.lang.String r1 = "isInterstitialReady()"
            r0.logException(r6, r1, r3)
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.f():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean f(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.demandOnly.h r0 = r4.f5052e0     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.i> r2 = r0.f4427a     // Catch:{ all -> 0x0038 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0038 }
            r3 = 1
            if (r2 != 0) goto L_0x0016
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.demandOnly.h.a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0038 }
        L_0x0014:
            r5 = r1
            goto L_0x0032
        L_0x0016:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.i> r0 = r0.f4427a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0038 }
            com.ironsource.mediationsdk.demandOnly.i r5 = (com.ironsource.mediationsdk.demandOnly.i) r5     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.c()     // Catch:{ all -> 0x0038 }
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.demandOnly.h.a((int) r0, (com.ironsource.mediationsdk.demandOnly.i) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0038 }
            r5 = r3
            goto L_0x0032
        L_0x002c:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.demandOnly.h.a((int) r0, (com.ironsource.mediationsdk.demandOnly.i) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            monitor-exit(r4)
            return r3
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.f(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f5019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f5053f
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.f r0 = r0.f5019c
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.h r0 = r0.b()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.g():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.demandOnly.f r0 = r3.f5050d0     // Catch:{ all -> 0x0024 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.g> r2 = r0.f4413b     // Catch:{ all -> 0x0024 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0024 }
            com.ironsource.mediationsdk.demandOnly.g r2 = (com.ironsource.mediationsdk.demandOnly.g) r2     // Catch:{ all -> 0x0024 }
            if (r2 != 0) goto L_0x0019
            com.ironsource.mediationsdk.demandOnly.e r0 = r0.f4412a     // Catch:{ all -> 0x0024 }
            r2 = 2500(0x9c4, float:3.503E-42)
            r0.a(r2, r4)     // Catch:{ all -> 0x0024 }
            r4 = r1
            goto L_0x001d
        L_0x0019:
            boolean r4 = r2.d()     // Catch:{ all -> 0x0024 }
        L_0x001d:
            if (r4 == 0) goto L_0x0022
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0022:
            monitor-exit(r3)
            return r1
        L_0x0024:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.g(java.lang.String):boolean");
    }

    public final void h(String str) {
        String str2 = "showOfferwall(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (!L()) {
                this.f5051e.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            l a10 = this.f5053f.f5019c.c().a(str);
            if (a10 == null) {
                this.f5049d.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a10 = this.f5053f.f5019c.c().a();
                if (a10 == null) {
                    this.f5049d.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f5047c.a(a10.getPlacementName());
        } catch (Exception e10) {
            this.f5049d.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            this.f5051e.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f5019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f5053f
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.f r0 = r0.f5019c
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.d r0 = r0.d()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.h():boolean");
    }

    public final InterstitialPlacement i(String str) {
        try {
            InterstitialPlacement O2 = O(str);
            if (O2 == null) {
                try {
                    this.f5049d.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    O2 = e();
                } catch (Exception unused) {
                    return O2;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + O2, 1);
            return O2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final boolean i() {
        try {
            b0 b0Var = this.f5047c;
            if (b0Var != null) {
                return b0Var.a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final Placement j(String str) {
        try {
            Placement N2 = N(str);
            if (N2 == null) {
                try {
                    this.f5049d.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    N2 = R();
                } catch (Exception unused) {
                    return N2;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f5049d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + N2, 1);
            return N2;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f5019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f5053f
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.f r0 = r0.f5019c
            if (r0 == 0) goto L_0x0010
            com.ironsource.mediationsdk.model.i r0 = r0.e()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.j():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = (r0 = r0.f5017a).f4786c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r3 = this;
            boolean r0 = r3.h()
            r1 = 0
            if (r0 == 0) goto L_0x0020
            com.ironsource.mediationsdk.utils.k r0 = r3.f5053f
            r2 = 1
            if (r0 == 0) goto L_0x001c
            com.ironsource.mediationsdk.model.o r0 = r0.f5017a
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList<java.lang.String> r0 = r0.f4786c
            if (r0 == 0) goto L_0x001c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            return r2
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.k():boolean");
    }

    public final void l() {
        if (this.R != null && this.S.compareAndSet(false, true)) {
            IronLog.CALLBACK.verbose("onInitializationCompleted()");
            i.d().a(new com.ironsource.environment.c.a(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
            this.R.onInitializationComplete();
        }
    }

    public final IronSourceError n(E.a aVar) {
        if (!this.I) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource SDK was not initialized");
        }
        if (!this.F) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (aVar == E.a.INIT_FAILED) {
            return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource initialization failed");
        }
        if (aVar != E.a.INIT_IN_PROGRESS || !E.a().c()) {
            return null;
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "ironSource initialization in progress");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0192, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.k p(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.E.f.a r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f5066o
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.k r1 = r10.f5053f     // Catch:{ all -> 0x0193 }
            if (r1 == 0) goto L_0x000e
            com.ironsource.mediationsdk.utils.k r11 = new com.ironsource.mediationsdk.utils.k     // Catch:{ all -> 0x0193 }
            r11.<init>(r1)     // Catch:{ all -> 0x0193 }
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            return r11
        L_0x000e:
            com.ironsource.mediationsdk.utils.k r13 = r10.B(r11, r12, r13)     // Catch:{ all -> 0x0193 }
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001c
            boolean r3 = r13.b()     // Catch:{ all -> 0x0193 }
            if (r3 != 0) goto L_0x0068
        L_0x001c:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r13.log(r3, r4, r2)     // Catch:{ all -> 0x0193 }
            java.lang.String r13 = r10.f5055g     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.utils.k r13 = o(r11, r13)     // Catch:{ all -> 0x0193 }
            if (r13 == 0) goto L_0x0068
            java.lang.String r4 = r10.f5055g     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r4, r12)     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r10.f5049d     // Catch:{ all -> 0x0193 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
            r5.<init>()     // Catch:{ all -> 0x0193 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0193 }
            r5.append(r12)     // Catch:{ all -> 0x0193 }
            java.lang.String r12 = ": "
            r5.append(r12)     // Catch:{ all -> 0x0193 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0193 }
            r5.append(r12)     // Catch:{ all -> 0x0193 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x0193 }
            r4.log(r3, r12, r1)     // Catch:{ all -> 0x0193 }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x0193 }
            com.ironsource.environment.c.a r3 = new com.ironsource.environment.c.a     // Catch:{ all -> 0x0193 }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r12)     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.events.i r12 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ all -> 0x0193 }
            r12.a((com.ironsource.environment.c.a) r3)     // Catch:{ all -> 0x0193 }
        L_0x0068:
            if (r13 == 0) goto L_0x0191
            r10.f5053f = r13     // Catch:{ all -> 0x0193 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r11, r12)     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.utils.k r12 = r10.f5053f     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.logger.b r3 = r10.f5063l     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.f r4 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.a.g r4 = r4.f()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.g.d r4 = r4.a()     // Catch:{ all -> 0x0193 }
            int r4 = r4.a()     // Catch:{ all -> 0x0193 }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f5049d     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.f r5 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.a.g r5 = r5.f()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.g.d r5 = r5.a()     // Catch:{ all -> 0x0193 }
            int r5 = r5.b()     // Catch:{ all -> 0x0193 }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x0193 }
            boolean r3 = r10.S()     // Catch:{ all -> 0x0193 }
            if (r3 == 0) goto L_0x00b0
            com.ironsource.mediationsdk.model.f r3 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.q r3 = r3.a()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r3 = r3.f4791b     // Catch:{ all -> 0x0193 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x0193 }
            goto L_0x00b1
        L_0x00b0:
            r3 = r2
        L_0x00b1:
            boolean r4 = r10.g()     // Catch:{ all -> 0x0193 }
            if (r4 == 0) goto L_0x00c4
            com.ironsource.mediationsdk.model.f r4 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.h r4 = r4.b()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r4 = r4.f4742b     // Catch:{ all -> 0x0193 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0193 }
            goto L_0x00c5
        L_0x00c4:
            r4 = r2
        L_0x00c5:
            boolean r5 = r10.h()     // Catch:{ all -> 0x0193 }
            if (r5 == 0) goto L_0x00d8
            com.ironsource.mediationsdk.model.f r5 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.d r5 = r5.d()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r5 = r5.f4712a     // Catch:{ all -> 0x0193 }
            boolean r5 = r5.a()     // Catch:{ all -> 0x0193 }
            goto L_0x00d9
        L_0x00d8:
            r5 = r2
        L_0x00d9:
            boolean r6 = r10.j()     // Catch:{ all -> 0x0193 }
            if (r6 == 0) goto L_0x00ee
            com.ironsource.mediationsdk.model.f r6 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.i r6 = r6.e()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r6 = r6.a()     // Catch:{ all -> 0x0193 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0193 }
            goto L_0x00ef
        L_0x00ee:
            r6 = r2
        L_0x00ef:
            boolean r7 = r10.L()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x0102
            com.ironsource.mediationsdk.model.f r7 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.k r7 = r7.c()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r7 = r7.f4766c     // Catch:{ all -> 0x0193 }
            boolean r7 = r7.a()     // Catch:{ all -> 0x0193 }
            goto L_0x0103
        L_0x0102:
            r7 = r2
        L_0x0103:
            com.ironsource.mediationsdk.model.f r8 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.a.g r8 = r8.f()     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.utils.i r8 = r8.h()     // Catch:{ all -> 0x0193 }
            boolean r9 = r8.a()     // Catch:{ all -> 0x0193 }
            if (r3 == 0) goto L_0x011c
            com.ironsource.mediationsdk.model.f r3 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.q r3 = r3.a()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r3 = r3.f4791b     // Catch:{ all -> 0x0193 }
            goto L_0x0126
        L_0x011c:
            if (r7 == 0) goto L_0x012a
            com.ironsource.mediationsdk.model.f r3 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.k r3 = r3.c()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r3 = r3.f4766c     // Catch:{ all -> 0x0193 }
        L_0x0126:
            v(r3, r11, r12)     // Catch:{ all -> 0x0193 }
            goto L_0x0130
        L_0x012a:
            com.ironsource.mediationsdk.events.i r3 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ all -> 0x0193 }
            r3.f4512g = r2     // Catch:{ all -> 0x0193 }
        L_0x0130:
            if (r4 == 0) goto L_0x013b
            com.ironsource.mediationsdk.model.f r2 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.h r2 = r2.b()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r2 = r2.f4742b     // Catch:{ all -> 0x0193 }
            goto L_0x0152
        L_0x013b:
            if (r5 == 0) goto L_0x0146
            com.ironsource.mediationsdk.model.f r2 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.d r2 = r2.d()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r2 = r2.f4712a     // Catch:{ all -> 0x0193 }
            goto L_0x0152
        L_0x0146:
            if (r6 == 0) goto L_0x0156
            com.ironsource.mediationsdk.model.f r2 = r12.f5019c     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.model.i r2 = r2.e()     // Catch:{ all -> 0x0193 }
            com.ironsource.sdk.controller.x r2 = r2.a()     // Catch:{ all -> 0x0193 }
        L_0x0152:
            E(r2, r11, r12)     // Catch:{ all -> 0x0193 }
            goto L_0x015c
        L_0x0156:
            com.ironsource.mediationsdk.events.e r12 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ all -> 0x0193 }
            r12.f4512g = r2     // Catch:{ all -> 0x0193 }
        L_0x015c:
            com.ironsource.mediationsdk.events.h r12 = com.ironsource.mediationsdk.events.h.f4553x     // Catch:{ all -> 0x0193 }
            r12.f4512g = r9     // Catch:{ all -> 0x0193 }
            if (r9 == 0) goto L_0x0183
            java.lang.String r2 = r8.b()     // Catch:{ all -> 0x0193 }
            r12.a((java.lang.String) r2, (android.content.Context) r11)     // Catch:{ all -> 0x0193 }
            int[] r2 = r8.e()     // Catch:{ all -> 0x0193 }
            r12.a((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x0193 }
            int[] r2 = r8.f()     // Catch:{ all -> 0x0193 }
            r12.b((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x0193 }
            boolean r11 = r8.c()     // Catch:{ all -> 0x0193 }
            r12.f4508c = r11     // Catch:{ all -> 0x0193 }
            int r11 = r8.d()     // Catch:{ all -> 0x0193 }
            r12.f4509d = r11     // Catch:{ all -> 0x0193 }
        L_0x0183:
            com.ironsource.mediationsdk.events.e r11 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ all -> 0x0193 }
            r11.f4506a = r1     // Catch:{ all -> 0x0193 }
            com.ironsource.mediationsdk.events.i r11 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ all -> 0x0193 }
            r11.f4506a = r1     // Catch:{ all -> 0x0193 }
            r12.f4506a = r1     // Catch:{ all -> 0x0193 }
        L_0x0191:
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            return r13
        L_0x0193:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.p(android.content.Context, java.lang.String, com.ironsource.mediationsdk.E$f$a):com.ironsource.mediationsdk.utils.k");
    }

    public final ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = (String) arrayList.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f5053f.f5018b.a(str));
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0127, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void s(android.app.Activity r7, com.ironsource.mediationsdk.demandOnly.p.c r8, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r8.a()     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0149 }
            r2.append(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0149 }
            r1.info(r2)     // Catch:{ all -> 0x0149 }
            r2 = 510(0x1fe, float:7.15E-43)
            boolean r3 = r6.H     // Catch:{ all -> 0x0131 }
            if (r3 != 0) goto L_0x002d
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            r1.error(r7)     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.logger.IronSourceError r8 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0131 }
            r8.<init>(r2, r7)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r8)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x002d:
            boolean r3 = r6.E     // Catch:{ all -> 0x0131 }
            if (r3 != 0) goto L_0x0040
            java.lang.String r7 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            r1.error(r7)     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.logger.IronSourceError r8 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0131 }
            r8.<init>(r2, r7)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r8)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x0040:
            java.lang.String r3 = r8.b()     // Catch:{ all -> 0x0131 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0131 }
            r4 = 1
            if (r3 != 0) goto L_0x004d
            r3 = r4
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r3, r4)     // Catch:{ all -> 0x0131 }
            if (r7 == 0) goto L_0x0058
            G(r7)     // Catch:{ all -> 0x0131 }
            goto L_0x0079
        L_0x0058:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0131 }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x0131 }
            if (r7 != 0) goto L_0x0079
            r7 = 82321(0x14191, float:1.15356E-40)
            C(r7, r3)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = "Interstitial was initialized and loaded without Activity"
            r1.error(r7)     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.logger.IronSourceError r8 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0131 }
            r1 = 1061(0x425, float:1.487E-42)
            r8.<init>(r1, r7)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r8)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x0079:
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.E$a r7 = r7.b()     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.E$a r4 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ all -> 0x0131 }
            if (r7 != r4) goto L_0x0097
            java.lang.String r7 = "init() had failed"
            r1.error(r7)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = "init() had failed"
            java.lang.String r8 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r7 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r7, r8)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r7)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x0097:
            com.ironsource.mediationsdk.logger.IronSourceError r4 = r8.c()     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x00a9
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0131 }
            r1.error(r7)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r4)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x00a9:
            com.ironsource.mediationsdk.E$a r4 = com.ironsource.mediationsdk.E.a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0131 }
            r5 = 83003(0x1443b, float:1.16312E-40)
            if (r7 != r4) goto L_0x00eb
            com.ironsource.mediationsdk.E r7 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0131 }
            boolean r7 = r7.c()     // Catch:{ all -> 0x0131 }
            if (r7 == 0) goto L_0x00cc
            java.lang.String r7 = "init() had failed"
            r1.error(r7)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = "init() had failed"
            java.lang.String r8 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r7 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r7, r8)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r7)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x00cc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$c> r7 = r6.f5044a0     // Catch:{ all -> 0x0131 }
            monitor-enter(r7)     // Catch:{ all -> 0x0131 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$c> r1 = r6.f5044a0     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = r8.a()     // Catch:{ all -> 0x00e8 }
            r1.put(r4, r8)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e8 }
            java.lang.String r7 = r8.b()     // Catch:{ all -> 0x0131 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0131 }
            if (r7 != 0) goto L_0x00e6
            C(r5, r3)     // Catch:{ all -> 0x0131 }
        L_0x00e6:
            monitor-exit(r6)
            return
        L_0x00e8:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e8 }
            throw r8     // Catch:{ all -> 0x0131 }
        L_0x00eb:
            boolean r7 = r6.K()     // Catch:{ all -> 0x0131 }
            if (r7 != 0) goto L_0x0108
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f5049d     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0131 }
            java.lang.String r1 = "No interstitial configurations found"
            r3 = 3
            r7.log(r8, r1, r3)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = "the server response does not contain interstitial data"
            java.lang.String r8 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r7 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r7, r8)     // Catch:{ all -> 0x0131 }
            r9.onInterstitialAdLoadFailed(r0, r7)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x0108:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$c> r7 = r6.f5044a0     // Catch:{ all -> 0x0131 }
            monitor-enter(r7)     // Catch:{ all -> 0x0131 }
            com.ironsource.mediationsdk.demandOnly.f r1 = r6.f5050d0     // Catch:{ all -> 0x012e }
            if (r1 != 0) goto L_0x0128
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$c> r1 = r6.f5044a0     // Catch:{ all -> 0x012e }
            java.lang.String r4 = r8.a()     // Catch:{ all -> 0x012e }
            r1.put(r4, r8)     // Catch:{ all -> 0x012e }
            java.lang.String r8 = r8.b()     // Catch:{ all -> 0x012e }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x012e }
            if (r8 != 0) goto L_0x0125
            C(r5, r3)     // Catch:{ all -> 0x012e }
        L_0x0125:
            monitor-exit(r7)     // Catch:{ all -> 0x012e }
            monitor-exit(r6)
            return
        L_0x0128:
            monitor-exit(r7)     // Catch:{ all -> 0x012e }
            r1.a((com.ironsource.mediationsdk.demandOnly.p.c) r8)     // Catch:{ all -> 0x0131 }
            monitor-exit(r6)
            return
        L_0x012e:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x012e }
            throw r8     // Catch:{ all -> 0x0131 }
        L_0x0131:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r6.f5049d     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "loadDemandOnlyInterstitial"
            r8.logException(r1, r3, r7)     // Catch:{ all -> 0x0149 }
            com.ironsource.mediationsdk.logger.IronSourceError r8 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0149 }
            r8.<init>(r2, r7)     // Catch:{ all -> 0x0149 }
            r9.onInterstitialAdLoadFailed(r0, r8)     // Catch:{ all -> 0x0149 }
            monitor-exit(r6)
            return
        L_0x0149:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.s(android.app.Activity, com.ironsource.mediationsdk.demandOnly.p$c, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener):void");
    }

    public final void t(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f5049d.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    public final void u(IronSource.AD_UNIT ad_unit, boolean z9) {
        int i10 = AnonymousClass2.f5076a[ad_unit.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        if (this.F) {
                            for (p.b next : this.f5046b0.values()) {
                                ISDemandOnlyBannerLayout c10 = next.c();
                                if (c10 != null) {
                                    c10.getListener().a(next.a(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.BANNER_AD_UNIT));
                                }
                            }
                            this.f5046b0.clear();
                        } else if (this.J.booleanValue()) {
                            this.J = Boolean.FALSE;
                            C0192q.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "init() had failed"));
                            this.K = null;
                            this.L = null;
                        }
                    }
                } else if (z9 || L() || this.w.contains(ad_unit)) {
                    this.f5051e.onOfferwallAvailable(false);
                }
            } else if (this.E) {
                for (p.c a10 : this.f5044a0.values()) {
                    String a11 = a10.a();
                    ((ISDemandOnlyInterstitialListener) this.f5062j0.a(a11)).onInterstitialAdLoadFailed(a11, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                }
                this.f5044a0.clear();
            } else if (this.X) {
                this.X = false;
                C0192q.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (this.D) {
            Iterator<String> it = this.f5048c0.iterator();
            while (it.hasNext()) {
                r.a().a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f5048c0.clear();
        } else if (this.T) {
            if (this.U) {
                this.U = false;
                C0192q.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        } else if (z9 || S() || this.w.contains(ad_unit)) {
            P.a().a(false, (AdInfo) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0112, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void y(boolean r10, boolean r11, com.ironsource.mediationsdk.IronSource.AD_UNIT... r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r12.length     // Catch:{ all -> 0x0113 }
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x0037
            r4 = r12[r2]     // Catch:{ all -> 0x0113 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x0113 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x0014
            r9.H = r3     // Catch:{ all -> 0x0113 }
            goto L_0x0034
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x0113 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x001f
            r9.I = r3     // Catch:{ all -> 0x0113 }
            goto L_0x0034
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0113 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x002a
            r9.G = r3     // Catch:{ all -> 0x0113 }
            goto L_0x0034
        L_0x002a:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ all -> 0x0113 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0113 }
            if (r4 == 0) goto L_0x0034
            r9.f5072v = r3     // Catch:{ all -> 0x0113 }
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0037:
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0113 }
            com.ironsource.mediationsdk.E$a r0 = r0.b()     // Catch:{ all -> 0x0113 }
            com.ironsource.mediationsdk.E$a r2 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ all -> 0x0113 }
            if (r0 != r2) goto L_0x0062
            com.ironsource.mediationsdk.sdk.e r10 = r9.f5051e     // Catch:{ Exception -> 0x005c }
            if (r10 == 0) goto L_0x005a
            int r10 = r12.length     // Catch:{ Exception -> 0x005c }
        L_0x0048:
            if (r1 >= r10) goto L_0x005a
            r11 = r12[r1]     // Catch:{ Exception -> 0x005c }
            java.util.HashSet r0 = r9.u     // Catch:{ Exception -> 0x005c }
            boolean r0 = r0.contains(r11)     // Catch:{ Exception -> 0x005c }
            if (r0 != 0) goto L_0x0057
            r9.u(r11, r3)     // Catch:{ Exception -> 0x005c }
        L_0x0057:
            int r1 = r1 + 1
            goto L_0x0048
        L_0x005a:
            monitor-exit(r9)
            return
        L_0x005c:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x0113 }
            monitor-exit(r9)
            return
        L_0x0062:
            boolean r0 = r9.f5068q     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00b8
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x0113 }
            int r2 = r12.length     // Catch:{ all -> 0x0113 }
            r4 = r1
        L_0x006c:
            if (r1 >= r2) goto L_0x00ac
            r5 = r12[r1]     // Catch:{ all -> 0x0113 }
            java.util.HashSet r6 = r9.u     // Catch:{ all -> 0x0113 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0113 }
            if (r6 != 0) goto L_0x0090
            java.util.HashSet r4 = r9.u     // Catch:{ all -> 0x0113 }
            r4.add(r5)     // Catch:{ all -> 0x0113 }
            java.util.HashSet r4 = r9.w     // Catch:{ all -> 0x0113 }
            r4.add(r5)     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x008a }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x0113 }
        L_0x008e:
            r4 = r3
            goto L_0x00a9
        L_0x0090:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f5049d     // Catch:{ all -> 0x0113 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r8.<init>()     // Catch:{ all -> 0x0113 }
            r8.append(r5)     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0113 }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x0113 }
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x00ac:
            if (r4 == 0) goto L_0x00b6
            int r12 = r9.f5075z     // Catch:{ all -> 0x0113 }
            int r12 = r12 + r3
            r9.f5075z = r12     // Catch:{ all -> 0x0113 }
            x(r10, r11, r12, r0)     // Catch:{ all -> 0x0113 }
        L_0x00b6:
            monitor-exit(r9)
            return
        L_0x00b8:
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0113 }
            r0.b((boolean) r11)     // Catch:{ all -> 0x0113 }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.f5069r     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00c5
            monitor-exit(r9)
            return
        L_0x00c5:
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x0113 }
            int r2 = r12.length     // Catch:{ all -> 0x0113 }
            r4 = r1
            r5 = r4
        L_0x00cc:
            if (r4 >= r2) goto L_0x0107
            r6 = r12[r4]     // Catch:{ all -> 0x0113 }
            java.util.HashSet r7 = r9.u     // Catch:{ all -> 0x0113 }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x0113 }
            if (r7 != 0) goto L_0x0101
            java.util.HashSet r5 = r9.u     // Catch:{ all -> 0x0113 }
            r5.add(r6)     // Catch:{ all -> 0x0113 }
            java.util.HashSet r5 = r9.w     // Catch:{ all -> 0x0113 }
            r5.add(r6)     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00ea }
            r0.put(r5, r3)     // Catch:{ Exception -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x0113 }
        L_0x00ee:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f5069r     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00fc
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00fc
            r9.D(r6)     // Catch:{ all -> 0x0113 }
            goto L_0x00ff
        L_0x00fc:
            r9.u(r6, r1)     // Catch:{ all -> 0x0113 }
        L_0x00ff:
            r5 = r3
            goto L_0x0104
        L_0x0101:
            r9.t(r6)     // Catch:{ all -> 0x0113 }
        L_0x0104:
            int r4 = r4 + 1
            goto L_0x00cc
        L_0x0107:
            if (r5 == 0) goto L_0x0111
            int r12 = r9.f5075z     // Catch:{ all -> 0x0113 }
            int r12 = r12 + r3
            r9.f5075z = r12     // Catch:{ all -> 0x0113 }
            x(r10, r11, r12, r0)     // Catch:{ all -> 0x0113 }
        L_0x0111:
            monitor-exit(r9)
            return
        L_0x0113:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.y(boolean, boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.app.Activity r4, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.demandOnly.p$b r0 = new com.ironsource.mediationsdk.demandOnly.p$b     // Catch:{ all -> 0x00da }
            r0.<init>(r6)     // Catch:{ all -> 0x00da }
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x00da }
            r0.a((android.app.Activity) r4)     // Catch:{ all -> 0x00da }
            r0.a((com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout) r5)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = r0.d()     // Catch:{ all -> 0x00da }
            r2 = 3
            if (r1 == 0) goto L_0x002c
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f5049d     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r1.getErrorMessage()     // Catch:{ all -> 0x00da }
            r4.log(r7, r0, r2)     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x002a
            com.ironsource.mediationsdk.demandOnly.a r4 = r5.getListener()     // Catch:{ all -> 0x00da }
            r4.a(r6, r1)     // Catch:{ all -> 0x00da }
        L_0x002a:
            monitor-exit(r3)
            return
        L_0x002c:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.E$a r1 = r1.b()     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = r3.n(r1)     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x004e
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f5049d     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r1.getErrorMessage()     // Catch:{ all -> 0x00da }
            r4.log(r7, r0, r2)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.demandOnly.a r4 = r5.getListener()     // Catch:{ all -> 0x00da }
            r4.a(r6, r1)     // Catch:{ all -> 0x00da }
            monitor-exit(r3)
            return
        L_0x004e:
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00da }
            r1.updateActivity(r4)     // Catch:{ all -> 0x00da }
            boolean r4 = r3.F(r0)     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x005d
            monitor-exit(r3)
            return
        L_0x005d:
            boolean r4 = r3.k()     // Catch:{ all -> 0x00da }
            if (r4 != 0) goto L_0x007d
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r3.f5049d     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "No banner configurations found"
            r4.log(r7, r0, r2)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.demandOnly.a r4 = r5.getListener()     // Catch:{ all -> 0x00da }
            java.lang.String r5 = "the server response does not contain banner data"
            java.lang.String r7 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r5, r7)     // Catch:{ all -> 0x00da }
            r4.a(r6, r5)     // Catch:{ all -> 0x00da }
            monitor-exit(r3)
            return
        L_0x007d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$b> r4 = r3.f5046b0     // Catch:{ all -> 0x00da }
            monitor-enter(r4)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.demandOnly.c r1 = r3.f5054f0     // Catch:{ all -> 0x00d7 }
            if (r1 != 0) goto L_0x0090
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.p$b> r1 = r3.f5046b0     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x00d7 }
            r1.put(r2, r0)     // Catch:{ all -> 0x00d7 }
            r0 = 1
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
            goto L_0x0092
        L_0x0090:
            r0 = 0
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
        L_0x0092:
            if (r0 == 0) goto L_0x0096
            monitor-exit(r3)
            return
        L_0x0096:
            com.ironsource.mediationsdk.demandOnly.c r4 = r3.f5054f0     // Catch:{ all -> 0x00da }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.d> r0 = r4.f4399a     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.demandOnly.d r0 = (com.ironsource.mediationsdk.demandOnly.d) r0     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00c1
            com.ironsource.mediationsdk.demandOnly.e r4 = r4.f4400b     // Catch:{ all -> 0x00da }
            r7 = 3503(0xdaf, float:4.909E-42)
            r4.a(r7, r6)     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(r4)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r4.getErrorMessage()     // Catch:{ all -> 0x00da }
            r7.error(r0)     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.demandOnly.a r5 = r5.getListener()     // Catch:{ all -> 0x00da }
            r5.a(r6, r4)     // Catch:{ all -> 0x00da }
            monitor-exit(r3)
            return
        L_0x00c1:
            com.ironsource.mediationsdk.demandOnly.o$a r4 = new com.ironsource.mediationsdk.demandOnly.o$a     // Catch:{ all -> 0x00da }
            com.ironsource.mediationsdk.utils.e r6 = com.ironsource.mediationsdk.utils.e.a()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.b()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r6, r7)     // Catch:{ all -> 0x00da }
            r4.<init>(r6)     // Catch:{ all -> 0x00da }
            r0.a(r5, r4)     // Catch:{ all -> 0x00da }
            monitor-exit(r3)
            return
        L_0x00d7:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
            throw r5     // Catch:{ all -> 0x00da }
        L_0x00da:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.a(android.app.Activity, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0293, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0213 A[SYNTHETIC, Splitter:B:87:0x0213] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r10, java.lang.String r11, boolean r12, com.ironsource.mediationsdk.sdk.InitializationListener r13, com.ironsource.mediationsdk.IronSource.AD_UNIT... r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0294 }
            r0.verbose()     // Catch:{ all -> 0x0294 }
            java.lang.String r0 = "Init Failed - provided context is null"
            boolean r0 = com.ironsource.mediationsdk.d.b.a((java.lang.Object) r10, (java.lang.String) r0)     // Catch:{ all -> 0x0294 }
            if (r0 != 0) goto L_0x0015
            java.lang.String r10 = "Provided context is null"
            r9.a((java.lang.String) r10)     // Catch:{ all -> 0x0294 }
            monitor-exit(r9)
            return
        L_0x0015:
            boolean r0 = r10 instanceof android.app.Activity     // Catch:{ all -> 0x0294 }
            if (r0 == 0) goto L_0x001f
            r1 = r10
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0294 }
            G(r1)     // Catch:{ all -> 0x0294 }
        L_0x001f:
            if (r13 == 0) goto L_0x0023
            r9.R = r13     // Catch:{ all -> 0x0294 }
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r13 = r9.f5067p     // Catch:{ all -> 0x0294 }
            if (r13 == 0) goto L_0x0270
            r1 = 0
            r2 = 1
            boolean r13 = r13.compareAndSet(r2, r1)     // Catch:{ all -> 0x0294 }
            if (r13 == 0) goto L_0x0270
            if (r14 == 0) goto L_0x0070
            int r13 = r14.length     // Catch:{ all -> 0x0294 }
            if (r13 != 0) goto L_0x0035
            goto L_0x0070
        L_0x0035:
            int r13 = r14.length     // Catch:{ all -> 0x0294 }
            r3 = r1
        L_0x0037:
            if (r3 >= r13) goto L_0x008a
            r4 = r14[r3]     // Catch:{ all -> 0x0294 }
            java.util.HashSet r5 = r9.u     // Catch:{ all -> 0x0294 }
            r5.add(r4)     // Catch:{ all -> 0x0294 }
            java.util.HashSet r5 = r9.w     // Catch:{ all -> 0x0294 }
            r5.add(r4)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x0294 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0294 }
            if (r5 == 0) goto L_0x004f
            r9.H = r2     // Catch:{ all -> 0x0294 }
        L_0x004f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x0294 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0294 }
            if (r5 == 0) goto L_0x0059
            r9.I = r2     // Catch:{ all -> 0x0294 }
        L_0x0059:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ all -> 0x0294 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0294 }
            if (r5 == 0) goto L_0x0063
            r9.f5072v = r2     // Catch:{ all -> 0x0294 }
        L_0x0063:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0294 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0294 }
            if (r4 == 0) goto L_0x006d
            r9.G = r2     // Catch:{ all -> 0x0294 }
        L_0x006d:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0070:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r13 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x0294 }
            int r3 = r13.length     // Catch:{ all -> 0x0294 }
            r4 = r1
        L_0x0076:
            if (r4 >= r3) goto L_0x0082
            r5 = r13[r4]     // Catch:{ all -> 0x0294 }
            java.util.HashSet r6 = r9.u     // Catch:{ all -> 0x0294 }
            r6.add(r5)     // Catch:{ all -> 0x0294 }
            int r4 = r4 + 1
            goto L_0x0076
        L_0x0082:
            r9.G = r2     // Catch:{ all -> 0x0294 }
            r9.H = r2     // Catch:{ all -> 0x0294 }
            r9.I = r2     // Catch:{ all -> 0x0294 }
            r9.f5072v = r2     // Catch:{ all -> 0x0294 }
        L_0x008a:
            com.ironsource.mediationsdk.logger.IronLog r13 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0294 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0294 }
            java.lang.String r4 = "init(appKey:"
            r3.<init>(r4)     // Catch:{ all -> 0x0294 }
            r3.append(r11)     // Catch:{ all -> 0x0294 }
            java.lang.String r4 = ")"
            r3.append(r4)     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0294 }
            r13.info(r3)     // Catch:{ all -> 0x0294 }
            com.ironsource.d.a r13 = new com.ironsource.d.a     // Catch:{ all -> 0x0294 }
            r13.<init>()     // Catch:{ all -> 0x0294 }
            if (r11 == 0) goto L_0x00c8
            r3 = 5
            r4 = 10
            boolean r3 = z(r3, r4, r11)     // Catch:{ all -> 0x0294 }
            if (r3 == 0) goto L_0x00c3
            java.lang.String r3 = "^[a-zA-Z0-9]*$"
            boolean r3 = r11.matches(r3)     // Catch:{ all -> 0x0294 }
            if (r3 != 0) goto L_0x00d4
            java.lang.String r3 = "appKey"
            java.lang.String r4 = "should contain only english characters and numbers"
        L_0x00be:
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r3, r11, r4)     // Catch:{ all -> 0x0294 }
            goto L_0x00d1
        L_0x00c3:
            java.lang.String r3 = "appKey"
            java.lang.String r4 = "length should be between 5-10 characters"
            goto L_0x00be
        L_0x00c8:
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0294 }
            r4 = 506(0x1fa, float:7.09E-43)
            java.lang.String r5 = "Init Fail - appKey is missing"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0294 }
        L_0x00d1:
            r13.a((com.ironsource.mediationsdk.logger.IronSourceError) r3)     // Catch:{ all -> 0x0294 }
        L_0x00d4:
            boolean r3 = r13.a()     // Catch:{ all -> 0x0294 }
            if (r3 == 0) goto L_0x00dc
            r9.f5055g = r11     // Catch:{ all -> 0x0294 }
        L_0x00dc:
            java.lang.String r3 = r9.f5055g     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.utils.k r3 = o(r10, r3)     // Catch:{ all -> 0x0294 }
            if (r3 == 0) goto L_0x0105
            com.ironsource.mediationsdk.model.f r3 = r3.f5019c     // Catch:{ all -> 0x0294 }
            com.ironsource.sdk.a.g r3 = r3.f()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.utils.b r3 = r3.f()     // Catch:{ all -> 0x0294 }
            com.ironsource.environment.g r4 = com.ironsource.environment.g.f3741a     // Catch:{ all -> 0x0294 }
            boolean r4 = r3.a()     // Catch:{ all -> 0x0294 }
            com.ironsource.environment.g.a((boolean) r4)     // Catch:{ all -> 0x0294 }
            boolean r4 = r3.b()     // Catch:{ all -> 0x0294 }
            com.ironsource.environment.g.c(r4)     // Catch:{ all -> 0x0294 }
            int r3 = r3.c()     // Catch:{ all -> 0x0294 }
            com.ironsource.environment.g.a((int) r3)     // Catch:{ all -> 0x0294 }
        L_0x0105:
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0294 }
            android.content.Context r4 = r10.getApplicationContext()     // Catch:{ all -> 0x0294 }
            r3.updateAppContext(r4)     // Catch:{ all -> 0x0294 }
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ all -> 0x0294 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ all -> 0x0294 }
            int r5 = com.ironsource.environment.g.d()     // Catch:{ all -> 0x0294 }
            long r5 = (long) r5     // Catch:{ all -> 0x0294 }
            long r4 = r4.toMillis(r5)     // Catch:{ all -> 0x0294 }
            com.ironsource.environment.h.a(r3, r4)     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x0294 }
            java.lang.String r4 = "medv"
            com.ironsource.environment.c.e.a((java.lang.String) r4, (java.lang.Object) r3)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.b.a r3 = r9.f5058h0     // Catch:{ all -> 0x0294 }
            com.ironsource.c.b r4 = com.ironsource.c.a.a()     // Catch:{ all -> 0x0294 }
            r3.a((com.ironsource.c.b) r4)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.b.a r3 = r9.f5058h0     // Catch:{ all -> 0x0294 }
            boolean r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.isGooglePlayInstalled(r10)     // Catch:{ all -> 0x0294 }
            r3.a((boolean) r4)     // Catch:{ all -> 0x0294 }
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0294 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0294 }
            boolean r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r3)     // Catch:{ all -> 0x0294 }
            long r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r3)     // Catch:{ all -> 0x0294 }
            if (r4 != 0) goto L_0x016f
            r7 = -1
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x016f
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0294 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0294 }
            java.lang.String r8 = "get first session timestamp = "
            r7.<init>(r8)     // Catch:{ all -> 0x0294 }
            r7.append(r4)     // Catch:{ all -> 0x0294 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0294 }
            r6.verbose(r7)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r3, r4)     // Catch:{ all -> 0x0294 }
        L_0x016f:
            com.ironsource.mediationsdk.d.c r3 = com.ironsource.mediationsdk.d.c.a()     // Catch:{ all -> 0x0294 }
            java.util.concurrent.ConcurrentHashMap r3 = r3.c()     // Catch:{ all -> 0x0294 }
            java.lang.String r4 = "is_deviceid_optout"
            boolean r4 = r3.containsKey(r4)     // Catch:{ all -> 0x0294 }
            if (r4 == 0) goto L_0x019f
            java.lang.String r4 = "is_deviceid_optout"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0294 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0294 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0294 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0294 }
            if (r4 != 0) goto L_0x019f
            boolean r3 = com.ironsource.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(r3)     // Catch:{ all -> 0x0294 }
            if (r3 != 0) goto L_0x019b
            r3 = r2
            goto L_0x019c
        L_0x019b:
            r3 = r1
        L_0x019c:
            com.ironsource.environment.g.b(r3)     // Catch:{ all -> 0x0294 }
        L_0x019f:
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.f5065n     // Catch:{ all -> 0x0294 }
            if (r3 == 0) goto L_0x01ce
            boolean r3 = r3.compareAndSet(r1, r2)     // Catch:{ all -> 0x0294 }
            if (r3 == 0) goto L_0x01ce
            com.ironsource.mediationsdk.events.j r3 = com.ironsource.mediationsdk.events.j.a()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.utils.f r4 = new com.ironsource.mediationsdk.utils.f     // Catch:{ all -> 0x0294 }
            r4.<init>(r10)     // Catch:{ all -> 0x0294 }
            r3.a(r4)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.events.e r3 = com.ironsource.mediationsdk.events.e.d()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.IronSourceSegment r4 = r9.f5074y     // Catch:{ all -> 0x0294 }
            r3.a((android.content.Context) r10, (com.ironsource.mediationsdk.IronSourceSegment) r4)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.events.i r3 = com.ironsource.mediationsdk.events.i.d()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.IronSourceSegment r4 = r9.f5074y     // Catch:{ all -> 0x0294 }
            r3.a((android.content.Context) r10, (com.ironsource.mediationsdk.IronSourceSegment) r4)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.events.h r3 = com.ironsource.mediationsdk.events.h.f4553x     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.IronSourceSegment r4 = r9.f5074y     // Catch:{ all -> 0x0294 }
            r3.a((android.content.Context) r10, (com.ironsource.mediationsdk.IronSourceSegment) r4)     // Catch:{ all -> 0x0294 }
        L_0x01ce:
            java.lang.String r3 = r9.f5055g     // Catch:{ all -> 0x0294 }
            if (r3 != 0) goto L_0x0213
            com.ironsource.mediationsdk.E r10 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.E$a r11 = com.ironsource.mediationsdk.E.a.INIT_FAILED     // Catch:{ all -> 0x0294 }
            r10.b((com.ironsource.mediationsdk.E.a) r11)     // Catch:{ all -> 0x0294 }
            java.util.HashSet r10 = r9.u     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0294 }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x0294 }
            if (r10 == 0) goto L_0x01ed
            com.ironsource.mediationsdk.P r10 = com.ironsource.mediationsdk.P.a()     // Catch:{ all -> 0x0294 }
            r11 = 0
            r10.a((boolean) r1, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) r11)     // Catch:{ all -> 0x0294 }
        L_0x01ed:
            java.util.HashSet r10 = r9.u     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x0294 }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x0294 }
            if (r10 == 0) goto L_0x0200
            com.ironsource.mediationsdk.sdk.e r10 = r9.f5051e     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r13.b()     // Catch:{ all -> 0x0294 }
            r10.a(r1, r11)     // Catch:{ all -> 0x0294 }
        L_0x0200:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = r13.b()     // Catch:{ all -> 0x0294 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0294 }
            r10.log(r11, r12, r2)     // Catch:{ all -> 0x0294 }
            monitor-exit(r9)
            return
        L_0x0213:
            com.ironsource.environment.c.e.a((android.content.Context) r10)     // Catch:{ all -> 0x0294 }
            java.lang.String r13 = r9.f5055g     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = "apky"
            com.ironsource.environment.c.e.a((java.lang.String) r3, (java.lang.Object) r13)     // Catch:{ all -> 0x0294 }
            java.lang.String r13 = r9.f5064m     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = "sid"
            com.ironsource.environment.c.e.a((java.lang.String) r3, (java.lang.Object) r13)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.config.ConfigFile r13 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x0294 }
            java.lang.String r13 = r13.getPluginType()     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = "plugin"
            com.ironsource.environment.c.e.a((java.lang.String) r3, (java.lang.Object) r13)     // Catch:{ all -> 0x0294 }
            boolean r13 = r9.f5073x     // Catch:{ all -> 0x0294 }
            if (r13 == 0) goto L_0x0255
            org.json.JSONObject r13 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r12)     // Catch:{ all -> 0x0294 }
            if (r14 == 0) goto L_0x024b
            int r3 = r14.length     // Catch:{ all -> 0x0294 }
            r4 = r1
        L_0x023d:
            if (r4 >= r3) goto L_0x024b
            r5 = r14[r4]     // Catch:{ all -> 0x0294 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0248 }
            r13.put(r5, r2)     // Catch:{ Exception -> 0x0248 }
        L_0x0248:
            int r4 = r4 + 1
            goto L_0x023d
        L_0x024b:
            int r14 = r9.f5075z     // Catch:{ all -> 0x0294 }
            int r14 = r14 + r2
            r9.f5075z = r14     // Catch:{ all -> 0x0294 }
            x(r0, r12, r14, r13)     // Catch:{ all -> 0x0294 }
            r9.f5073x = r1     // Catch:{ all -> 0x0294 }
        L_0x0255:
            com.ironsource.mediationsdk.E r12 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0294 }
            r12.a((com.ironsource.mediationsdk.utils.h) r9)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.E r12 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.impressionData.a r13 = r9.f5056g0     // Catch:{ all -> 0x0294 }
            r12.a((com.ironsource.mediationsdk.utils.h) r13)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.E r12 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0294 }
            java.lang.String r13 = r9.f5057h     // Catch:{ all -> 0x0294 }
            r12.a(r10, r11, r13)     // Catch:{ all -> 0x0294 }
            monitor-exit(r9)
            return
        L_0x0270:
            if (r14 == 0) goto L_0x0288
            r9.y(r0, r12, r14)     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.E r10 = com.ironsource.mediationsdk.E.a()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.E$a r10 = r10.b()     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.E$a r11 = com.ironsource.mediationsdk.E.a.INITIATED     // Catch:{ all -> 0x0294 }
            if (r10 != r11) goto L_0x0292
            if (r12 != 0) goto L_0x0292
            r9.l()     // Catch:{ all -> 0x0294 }
            monitor-exit(r9)
            return
        L_0x0288:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r9.f5049d     // Catch:{ all -> 0x0294 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0294 }
            java.lang.String r12 = "Multiple calls to init without ad units are not allowed"
            r13 = 3
            r10.log(r11, r12, r13)     // Catch:{ all -> 0x0294 }
        L_0x0292:
            monitor-exit(r9)
            return
        L_0x0294:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.z.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    public static void a(String str, JSONObject jSONObject) {
        String j10 = com.ironsource.adapters.ironsource.a.j("networkKey = ", str);
        if (jSONObject != null) {
            j10 = j10 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(j10);
        C0180c.a().a(str, jSONObject);
    }
}
