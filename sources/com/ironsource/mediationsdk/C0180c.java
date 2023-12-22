package com.ironsource.mediationsdk;

import android.text.TextUtils;
import androidx.fragment.app.w0;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.events.e;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c  reason: case insensitive filesystem */
public final class C0180c {

    /* renamed from: j  reason: collision with root package name */
    public static final C0180c f4331j = new C0180c();
    public static final Object k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, AdapterBaseWrapper> f4332a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, AbstractAdapter> f4333b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public String f4334c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentHashMap<String, List<String>> f4335d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public String f4336e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f4337f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f4338g;

    /* renamed from: h  reason: collision with root package name */
    public final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f4339h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f4340i = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4341a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4341a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4341a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4341a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4341a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0180c.a.<clinit>():void");
        }
    }

    private C0180c() {
    }

    public static C0180c a() {
        return f4331j;
    }

    public static AbstractAdapter b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str2) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            f(str3);
            return null;
        }
    }

    public static void c(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            e.d().a(new com.ironsource.environment.c.a(i10, jSONObject));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void f(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    public static void h(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    public final AbstractAdapter a(NetworkSettings networkSettings) {
        String providerDefaultInstance = networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f4333b.get(providerDefaultInstance) : b(providerDefaultInstance, networkSettings.getProviderTypeForReflection());
    }

    public final void a(String str, List<String> list) {
        synchronized (k) {
            this.f4335d.put(str, list);
            if (!this.f4333b.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter next : this.f4333b.values()) {
                    try {
                        next.setMetaData(str, list);
                    } catch (Throwable th) {
                        String str2 = "error while setting metadata of " + next.getProviderName() + ": " + th.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        h(str2);
                        th.printStackTrace();
                    }
                }
            }
            for (AdapterBaseWrapper next2 : this.f4332a.values()) {
                AdapterBaseInterface adapterBaseInterface = next2.getAdapterBaseInterface();
                if (!next2.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                    try {
                        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                    } catch (Exception e10) {
                        String str3 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                        h(str3);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Calling setNetworkData on an empty network";
        } else if (jSONObject == null || jSONObject.length() == 0) {
            str2 = "Calling setNetworkData with empty networkData";
        } else if (StringUtils.toLowerCase(str).equals("aps")) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                    if (!next.equalsIgnoreCase(ad_unit.toString())) {
                        ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                        if (!next.equalsIgnoreCase(ad_unit.toString())) {
                        }
                    }
                }
                e(ad_unit, optJSONObject);
            }
            return;
        } else {
            str2 = "Calling setNetworkData on an unsupported network: " + str;
        }
        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str2);
        f(str2);
    }

    public final void a(boolean z9) {
        synchronized (k) {
            this.f4337f = Boolean.valueOf(z9);
            for (AbstractAdapter d10 : this.f4333b.values()) {
                d(d10);
            }
            for (AdapterBaseWrapper next : this.f4332a.values()) {
                AdapterBaseInterface adapterBaseInterface = next.getAdapterBaseInterface();
                if (!next.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z9);
                    } catch (Exception e10) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        h(str);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public final BaseAdAdapter<?, ?> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> baseAdAdapter;
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String d10 = w0.d(networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters", ".", networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
            try {
                baseAdAdapter = (BaseAdAdapter) Class.forName(d10).getConstructor(new Class[]{NetworkSettings.class}).newInstance(new Object[]{networkSettings});
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String j10 = com.ironsource.adapters.ironsource.a.j("failed to load ", d10);
                    IronLog.INTERNAL.error(j10);
                    c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, j10);
                }
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            baseAdAdapter = null;
        }
        if (baseAdAdapter != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapter;
        }
        AbstractAdapter a10 = a(networkSettings);
        if (a10 != null) {
            return a.a(a10, networkSettings, ad_unit);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public final void b(boolean z9) {
        synchronized (k) {
            this.f4338g = Boolean.valueOf(z9);
            for (AbstractAdapter g10 : this.f4333b.values()) {
                g(g10);
            }
        }
    }

    public final void d(AbstractAdapter abstractAdapter) {
        try {
            Boolean bool = this.f4337f;
            if (bool != null) {
                abstractAdapter.setConsent(bool.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            h(str);
            th.printStackTrace();
        }
    }

    public final void e(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, "APSData is empty");
            f("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f4333b.isEmpty()) {
                for (AbstractAdapter next : this.f4333b.values()) {
                    if (StringUtils.toLowerCase(next.getProviderName()).equals("aps") && (next instanceof SetAPSInterface)) {
                        ((SetAPSInterface) next).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper next2 : this.f4332a.values()) {
                AdapterBaseInterface adapterBaseInterface = next2.getAdapterBaseInterface();
                if (!next2.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterAPSDataInterface)) {
                    ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                    return;
                }
            }
            synchronized (k) {
                this.f4339h.put(ad_unit, jSONObject2);
            }
        } catch (Exception e10) {
            String str = "error while setting APSData: " + e10.getLocalizedMessage();
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
            f(str);
            e10.printStackTrace();
        }
    }

    public final void g(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f4338g;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                h(str);
                th.printStackTrace();
            }
        }
    }

    public final void i(AbstractAdapter abstractAdapter) {
        for (String next : this.f4335d.keySet()) {
            try {
                List list = this.f4335d.get(next);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + next + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(next, list);
                }
            } catch (Throwable th) {
                String str = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                h(str);
                th.printStackTrace();
            }
        }
    }

    public final void j(AbstractAdapter abstractAdapter) {
        if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals("aps") && this.f4339h.size() != 0) {
            for (IronSource.AD_UNIT next : this.f4339h.keySet()) {
                try {
                    JSONObject jSONObject = this.f4339h.get(next);
                    if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(next, jSONObject);
                    }
                } catch (Exception e10) {
                    String str = "error while setting aps data: " + e10.getLocalizedMessage();
                    c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                    h(str);
                    e10.printStackTrace();
                }
            }
            this.f4339h.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.AbstractAdapter a(com.ironsource.mediationsdk.model.NetworkSettings r7, org.json.JSONObject r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r7.isMultipleInstances()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r7.getProviderDefaultInstance()
            goto L_0x000f
        L_0x000b:
            java.lang.String r0 = r7.getProviderName()
        L_0x000f:
            if (r9 == 0) goto L_0x0014
            java.lang.String r7 = "IronSource"
            goto L_0x0018
        L_0x0014:
            java.lang.String r7 = r7.getProviderTypeForReflection()
        L_0x0018:
            java.lang.Object r9 = k
            monitor-enter(r9)
            if (r10 != 0) goto L_0x002f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r1 = r6.f4333b     // Catch:{ all -> 0x0119 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0119 }
            if (r1 == 0) goto L_0x002f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f4333b     // Catch:{ all -> 0x0119 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0119 }
            com.ironsource.mediationsdk.AbstractAdapter r7 = (com.ironsource.mediationsdk.AbstractAdapter) r7     // Catch:{ all -> 0x0119 }
            monitor-exit(r9)     // Catch:{ all -> 0x0119 }
            return r7
        L_0x002f:
            com.ironsource.mediationsdk.AbstractAdapter r1 = b((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x004c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r7.<init>()     // Catch:{ all -> 0x0119 }
            r7.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r8 = " adapter was not loaded"
            r7.append(r8)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0119 }
            f(r7)     // Catch:{ all -> 0x0119 }
            r7 = 0
            monitor-exit(r9)     // Catch:{ all -> 0x0119 }
            return r7
        L_0x004c:
            r2 = 88001(0x157c1, float:1.23316E-40)
            java.lang.String r3 = r1.getCoreSDKVersion()     // Catch:{ all -> 0x0054 }
            goto L_0x007d
        L_0x0054:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = "error while retrieving coreSDKVersion "
            r4.<init>(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = r1.getProviderName()     // Catch:{ all -> 0x0119 }
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x0119 }
            r4.append(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0119 }
            c(r2, r3)     // Catch:{ all -> 0x0119 }
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0119 }
            r4.error(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = "Unknown"
        L_0x007d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r4.<init>()     // Catch:{ all -> 0x0119 }
            r4.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = " was allocated (adapter version: "
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = r1.getVersion()     // Catch:{ all -> 0x0119 }
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = ", sdk version: "
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            r4.append(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = ")"
            r4.append(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0119 }
            h(r3)     // Catch:{ all -> 0x0119 }
            r6.i(r1)     // Catch:{ all -> 0x0119 }
            r6.j(r1)     // Catch:{ all -> 0x0119 }
            r6.d(r1)     // Catch:{ all -> 0x0119 }
            r6.g(r1)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = "SupersonicAds"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0119 }
            if (r3 != 0) goto L_0x00c1
            java.lang.String r3 = "IronSource"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x0110
        L_0x00c1:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f4340i     // Catch:{ all -> 0x0119 }
            r4 = 0
            r5 = 1
            boolean r3 = r3.compareAndSet(r4, r5)     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x0110
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = "SDK5 earlyInit  <"
            r3.<init>(r4)     // Catch:{ all -> 0x0119 }
            r3.append(r7)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = ">"
            r3.append(r7)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0119 }
            h(r7)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = r6.f4334c     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r3 = r6.f4336e     // Catch:{ Exception -> 0x00e9 }
            r1.earlyInit(r7, r3, r8)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0110
        L_0x00e9:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = "error while calling early init for "
            r8.<init>(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = r1.getProviderName()     // Catch:{ all -> 0x0119 }
            r8.append(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = ": "
            r8.append(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x0119 }
            r8.append(r7)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0119 }
            c(r2, r7)     // Catch:{ all -> 0x0119 }
            com.ironsource.mediationsdk.logger.IronLog r8 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0119 }
            r8.error(r7)     // Catch:{ all -> 0x0119 }
        L_0x0110:
            if (r10 != 0) goto L_0x0117
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f4333b     // Catch:{ all -> 0x0119 }
            r7.put(r0, r1)     // Catch:{ all -> 0x0119 }
        L_0x0117:
            monitor-exit(r9)     // Catch:{ all -> 0x0119 }
            return r1
        L_0x0119:
            r7 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0119 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0180c.a(com.ironsource.mediationsdk.model.NetworkSettings, org.json.JSONObject, boolean, boolean):com.ironsource.mediationsdk.AbstractAdapter");
    }

    public final AdapterBaseInterface a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdapter baseAdapter;
        String providerDefaultInstance = networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
        if (this.f4332a.containsKey(providerDefaultInstance)) {
            return this.f4332a.get(providerDefaultInstance).getAdapterBaseInterface();
        }
        String customNetworkAdapterName = networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName((IronSource.AD_UNIT) null) : networkSettings.getProviderTypeForReflection();
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String d10 = w0.d(networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters", ".", customNetworkAdapterName);
            try {
                baseAdapter = (BaseAdapter) Class.forName(d10).newInstance();
                IronLog.INTERNAL.info(d10 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
                Boolean bool = this.f4338g;
                if (bool != null) {
                    try {
                        baseAdapter.setAdapterDebug(bool.booleanValue());
                    } catch (Exception e10) {
                        String str = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        h(str);
                        e10.printStackTrace();
                    }
                }
                this.f4332a.put(providerDefaultInstance, new AdapterBaseWrapper(baseAdapter, networkSettings));
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String j10 = com.ironsource.adapters.ironsource.a.j("failed to load ", d10);
                    IronLog.INTERNAL.error(j10);
                    c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, j10);
                }
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + providerDefaultInstance);
            baseAdapter = null;
        }
        if (baseAdapter != null || networkSettings.isCustomNetwork()) {
            this.f4332a.put(providerDefaultInstance, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        }
        int i10 = a.f4341a[ad_unit.ordinal()];
        AbstractAdapter a10 = a(networkSettings, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : networkSettings.getNativeAdSettings() : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
        if (a10 != null) {
            G g10 = new G(a10);
            this.f4332a.put(providerDefaultInstance, new AdapterBaseWrapper(g10, networkSettings));
            return g10;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }
}
