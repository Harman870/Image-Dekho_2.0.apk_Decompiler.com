package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.e;
import com.ironsource.mediationsdk.model.m;
import com.ironsource.mediationsdk.model.n;
import java.util.Calendar;
import java.util.Map;
import java.util.TimeZone;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f5006a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5007b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f5008c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5009d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5010e;

    public enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f5011a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5012b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5013c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f5014d = 4;

        /* access modifiers changed from: public */
        static {
            f5015e = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) f5015e.clone();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5016a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ironsource.mediationsdk.model.n[] r0 = com.ironsource.mediationsdk.model.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5016a = r0
                com.ironsource.mediationsdk.model.n r1 = com.ironsource.mediationsdk.model.n.PER_DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5016a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.model.n r1 = com.ironsource.mediationsdk.model.n.PER_HOUR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.j.b.<clinit>():void");
        }
    }

    public j(int i10, String str, Map<String, Object> map, long j10, String str2) {
        this.f5006a = i10;
        this.f5007b = str;
        this.f5008c = map;
        this.f5009d = j10;
        this.f5010e = str2;
    }

    public static synchronized void a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (j.class) {
            if (context != null) {
                m placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    e(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    public static synchronized void a(Context context, Placement placement) {
        synchronized (j.class) {
            if (context != null) {
                m placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    e(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    public static synchronized void a(Context context, e eVar) {
        synchronized (j.class) {
            if (context != null) {
                m placementAvailabilitySettings = eVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    e(context, IronSourceConstants.BANNER_AD_UNIT, eVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    public static synchronized void a(Context context, com.ironsource.mediationsdk.model.j jVar) {
        synchronized (j.class) {
            if (context != null) {
                m placementAvailabilitySettings = jVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    e(context, IronSourceConstants.NATIVE_AD_UNIT, jVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z9;
        synchronized (j.class) {
            z9 = b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != a.f5014d;
        }
        return z9;
    }

    public static synchronized boolean a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z9;
        synchronized (j.class) {
            z9 = b(context, c(ad_unit), str) != a.f5014d;
        }
        return z9;
    }

    public static synchronized int b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (j.class) {
            if (!(context == null || interstitialPlacement == null)) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    int b10 = b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                    return b10;
                }
            }
            int i10 = a.f5014d;
            return i10;
        }
    }

    public static synchronized int b(Context context, Placement placement) {
        synchronized (j.class) {
            if (!(context == null || placement == null)) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    int b10 = b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                    return b10;
                }
            }
            int i10 = a.f5014d;
            return i10;
        }
    }

    public static int b(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, d(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return a.f5011a;
        }
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(d(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0) < ((long) (IronSourceUtils.e(context, d(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2)) * 1000))) {
                return a.f5013c;
            }
        }
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int e10 = IronSourceUtils.e(context, d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2));
            String d10 = d(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int e11 = IronSourceUtils.e(context, d10);
            String d11 = d(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(d11, 0)) {
                IronSourceUtils.g(context, d10, 0);
                IronSourceUtils.h(context, d11, 0);
            } else if (e11 >= e10) {
                return a.f5012b;
            }
        }
        return a.f5014d;
    }

    public static synchronized void b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (j.class) {
            f(context, c(ad_unit), str);
        }
    }

    public static synchronized boolean b(Context context, String str) {
        boolean z9;
        synchronized (j.class) {
            z9 = b(context, IronSourceConstants.BANNER_AD_UNIT, str) != a.f5014d;
        }
        return z9;
    }

    public static String c(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z9;
        synchronized (j.class) {
            z9 = b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != a.f5014d;
        }
        return z9;
    }

    public static String d(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public static synchronized void d(Context context, String str) {
        synchronized (j.class) {
            f(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    public static synchronized void e(Context context, String str) {
        synchronized (j.class) {
            f(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    public static void e(Context context, String str, String str2, m mVar) {
        boolean z9 = mVar.f4768a;
        IronSourceUtils.f(context, d(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z9);
        if (z9) {
            boolean z10 = mVar.f4769b;
            IronSourceUtils.f(context, d(str, "CappingManager.IS_CAPPING_ENABLED", str2), z10);
            if (z10) {
                IronSourceUtils.g(context, d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), mVar.f4772e);
                n nVar = mVar.f4771d;
                String d10 = d(str, "CappingManager.CAPPING_TYPE", str2);
                String nVar2 = nVar.toString();
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(d10, nVar2);
                edit.apply();
            }
            boolean z11 = mVar.f4770c;
            IronSourceUtils.f(context, d(str, "CappingManager.IS_PACING_ENABLED", str2), z11);
            if (z11) {
                IronSourceUtils.g(context, d(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), mVar.f4773f);
            }
        }
    }

    public static synchronized void f(Context context, String str) {
        synchronized (j.class) {
            if (!TextUtils.isEmpty(str)) {
                f(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    public static void f(Context context, String str, String str2) {
        boolean z9;
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.h(context, d(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, d(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.e(context, d(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2));
            String d10 = d(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int e10 = IronSourceUtils.e(context, d10);
            if (e10 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(d(str, "CappingManager.CAPPING_TYPE", str2), n.PER_DAY.toString());
                n nVar = null;
                n[] values = n.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    n nVar2 = values[i10];
                    if (nVar2.f4783c.equals(string)) {
                        nVar = nVar2;
                        break;
                    }
                    i10++;
                }
                Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                int i11 = b.f5016a[nVar.ordinal()];
                if (i11 == 1) {
                    instance.set(14, 0);
                    instance.set(13, 0);
                    instance.set(12, 0);
                    instance.set(11, 0);
                    instance.add(6, 1);
                } else if (i11 == 2) {
                    instance.set(14, 0);
                    instance.set(13, 0);
                    instance.set(12, 0);
                    instance.add(11, 1);
                }
                IronSourceUtils.h(context, d(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), instance.getTimeInMillis());
            }
            IronSourceUtils.g(context, d10, e10 + 1);
        }
    }

    public int a() {
        return this.f5006a;
    }

    public String b() {
        return this.f5007b;
    }

    public Map<String, Object> c() {
        return this.f5008c;
    }

    public long d() {
        return this.f5009d;
    }

    public String e() {
        return this.f5010e;
    }
}
