package com.ironsource.environment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.environment.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3746a = false;

    /* renamed from: b  reason: collision with root package name */
    public static String f3747b = null;

    /* renamed from: c  reason: collision with root package name */
    public static String f3748c = null;

    /* renamed from: d  reason: collision with root package name */
    public static String f3749d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f3750e = "";

    /* renamed from: f  reason: collision with root package name */
    public static volatile String f3751f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile String f3752g;

    public static class a implements InvocationHandler {
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0 || (obj2 = objArr[0]) == null) {
                    return null;
                }
                String obj3 = obj2.getClass().getMethod("getId", new Class[0]).invoke(objArr[0], new Object[0]).toString();
                if (TextUtils.isEmpty(obj3)) {
                    return null;
                }
                h.f3750e = obj3;
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static String A(Context context) {
        return c(context) ? "Tablet" : "Phone";
    }

    public static String B(Context context) {
        if (!g.a()) {
            return "";
        }
        Class<AppSet> cls = AppSet.class;
        try {
            Object invoke = cls.getMethod("getClient", new Class[]{Context.class}).invoke(cls, new Object[]{context});
            Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
            Class<OnSuccessListener> cls2 = OnSuccessListener.class;
            invoke2.getClass().getMethod("addOnSuccessListener", new Class[]{cls2}).invoke(invoke2, new Object[]{Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new a())});
            return !TextUtils.isEmpty(f3750e) ? f3750e : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String C(Context context) {
        Class<AdvertisingIdClient> cls = AdvertisingIdClient.class;
        if (g.b()) {
            try {
                if (!g.c()) {
                    Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(cls, new Object[]{context});
                    return invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]).toString();
                } else if (f3752g != null) {
                    return f3752g;
                } else {
                    Object invoke2 = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(cls, new Object[]{context});
                    String obj = invoke2.getClass().getMethod("getId", new Class[0]).invoke(invoke2, new Object[0]).toString();
                    try {
                        if (TextUtils.isEmpty(obj)) {
                            return obj;
                        }
                        f3752g = obj;
                        return obj;
                    } catch (Exception unused) {
                        return obj;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static String D(Context context) {
        try {
            if (!g.c()) {
                return H(context);
            }
            if (f3751f != null) {
                return f3751f;
            }
            String H = H(context);
            try {
                if (TextUtils.isEmpty(H)) {
                    return H;
                }
                f3751f = H;
                return H;
            } catch (Exception unused) {
                return H;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int E(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, "IABTCF_gdprApplies", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String F(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", (String) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean G(Context context) {
        try {
            for (String equalsIgnoreCase : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (equalsIgnoreCase.equalsIgnoreCase("com.google.android.gms.permission.AD_ID")) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String H(Context context) {
        Class<AdvertisingIdClient> cls = AdvertisingIdClient.class;
        Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        return String.valueOf(((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue());
    }

    public static long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    public static long a(String str) {
        StatFs statFs = new StatFs(new File(str).getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
    }

    public static String a(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @TargetApi(19)
    public static boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    public static int b() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    public static String b(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static String c() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    public static boolean c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    public static long d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static boolean d() {
        try {
            return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static boolean e(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i10 = -1;
        if (registerReceiver != null) {
            i10 = registerReceiver.getIntExtra(IronSourceConstants.EVENTS_STATUS, -1);
        }
        return i10 == 2 || i10 == 5;
    }

    public static int f() {
        return Build.VERSION.SDK_INT;
    }

    public static int f(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    public static String g() {
        return Build.MODEL;
    }

    public static boolean g(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static String h() {
        return Build.MANUFACTURER;
    }

    public static boolean h(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static String i() {
        return "android";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String i(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkOperatorName()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.h.i(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String j(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkCountryIso()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.h.j(android.content.Context):java.lang.String");
    }

    public static boolean j() {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + "su").exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int k(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static float l(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return ((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3));
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1.0f;
        }
    }

    public static int l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int m() {
        return k();
    }

    public static int m(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    public static int n() {
        return l();
    }

    public static String n(Context context) {
        if (context == null) {
            return "";
        }
        int m2 = m(context);
        if (m2 != 0) {
            if (m2 != 1) {
                if (m2 != 11) {
                    if (m2 != 12) {
                        switch (m2) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    public static float o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int o(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static long p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
    }

    public static List<ApplicationInfo> p(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    public static String q() {
        try {
            if (!f3749d.isEmpty()) {
                return f3749d;
            }
            try {
                return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), "Mediation_Shared_Preferences", "browser_user_agent", "");
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean q(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    public static File r(Context context) {
        return context.getExternalCacheDir();
    }

    public static File s(Context context) {
        return context.getExternalFilesDir((String) null);
    }

    public static File t(Context context) {
        return context.getCacheDir();
    }

    public static File u(Context context) {
        return context.getFilesDir();
    }

    public static int v(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i10 = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i10 = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i10 == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i10)) * 100.0f);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static boolean w(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static synchronized String x(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(f3747b)) {
                String str = f3747b;
                return str;
            }
            boolean z9 = true;
            if (context != null) {
                z9 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean("uuidEnabled", true);
            }
            if (z9) {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    f3747b = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    f3747b = stringFromSharedPrefs;
                }
            }
            String str2 = f3747b;
            return str2;
        }
    }

    public static synchronized String y(Context context) {
        synchronized (h.class) {
            if (!TextUtils.isEmpty(f3748c)) {
                String str = f3748c;
                return str;
            } else if (context == null) {
                return "";
            } else {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
                f3748c = stringFromSharedPrefs;
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    f3748c = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
                }
                String str2 = f3748c;
                return str2;
            }
        }
    }

    public static int z(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static void a(Context context, long j10) {
        long j11;
        if (context != null) {
            n nVar = new n(new l.a());
            try {
                j11 = Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent_time", "-1"));
            } catch (Exception e10) {
                e10.printStackTrace();
                j11 = -1;
            }
            if (!nVar.a(j11, j10)) {
                String str = "";
                try {
                    str = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                f3749d = str;
                f3746a = !str.isEmpty();
            }
            if (f3749d.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    f3749d = defaultUserAgent;
                    try {
                        IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent", defaultUserAgent);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    if (j10 > 0) {
                        try {
                            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "browser_user_agent_time", String.valueOf(System.currentTimeMillis()));
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
        }
    }
}
