package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.fragment.app.w0;
import com.ironsource.environment.h;
import com.ironsource.environment.k;
import com.ironsource.mediationsdk.C0198w;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.c;
import com.ironsource.mediationsdk.y;
import com.ironsource.mediationsdk.z;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceUtils {
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f4961a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static String f4962b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f4963c = null;

    /* renamed from: d  reason: collision with root package name */
    public static IronSourceUtils f4964d = new IronSourceUtils();

    public static boolean a(Context context, String str, boolean z9) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getBoolean(str, z9);
    }

    public static String b(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_events_url" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_events_url" : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? "default_pxl_events_url" : "";
    }

    public static String c(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_events_formatter_type" : (!IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) && !IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? "" : "default_rv_events_formatter_type";
    }

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new c());
        thread.start();
    }

    public static String d(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? "default_is_trigger_events" : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? "default_rv_trigger_events" : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? "default_pxl_trigger_events" : "";
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int e(Context context, String str) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getInt(str, 0);
    }

    public static void f(Context context, String str, boolean z9) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putBoolean(str, z9);
        edit.apply();
    }

    public static void g(Context context, String str, int i10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putInt(str, i10);
        edit.apply();
    }

    public static String getBase64Auth(String str, String str2) {
        String d10 = w0.d(str, ":", str2);
        return "Basic " + Base64.encodeToString(d10.getBytes(), 10);
    }

    @Deprecated
    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject.optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : "none";
        } catch (Exception e10) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to connection type - exception = " + e10);
            return "none";
        }
    }

    public static String getCurrentMethodName() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(c(str), str2);
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e10);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(b(str), str2);
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e10);
            }
        }
        return str2;
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        String str2;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                    str2 = "default_is_non_connectivity_events";
                } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                    str2 = "default_rv_non_connectivity_events";
                } else {
                    str2 = "";
                }
                String string = sharedPreferences.getString(str2, (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        String str2;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                    str2 = "default_is_opt_in_events";
                } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                    str2 = "default_rv_opt_in_events";
                } else {
                    str2 = "";
                }
                String string = sharedPreferences.getString(str2, (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        String str2;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                    str2 = "default_is_opt_out_events";
                } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                    str2 = "default_rv_opt_out_events";
                } else {
                    str2 = "";
                }
                String string = sharedPreferences.getString(str2, (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(d(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e10);
            }
        }
        return iArr;
    }

    public static String getDeviceType(Context context) {
        return h.c(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (f4963c == null) {
            f4963c = Boolean.valueOf(!C0198w.b(context));
        }
        return f4963c.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1;
        }
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(IronSourceConstants.FIRST_SESSION_TIMESTAMP, -1);
    }

    public static IronSourceUtils getInstance() {
        return f4964d;
    }

    public static y getIronSourceAdvId(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        z.a();
        String a10 = z.a(context);
        if (TextUtils.isEmpty(a10)) {
            a10 = h.x(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new y(a10, str);
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int i11 = 0;
            while (i10 < list.size()) {
                if (i11 >= list2.size()) {
                    break;
                }
                String str2 = list.get(i10);
                String str3 = list2.get(i11);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i10++;
                i11++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z9) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z9) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString("last_response", "");
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z9) {
        return getMediationAdditionalData(z9, false, 1);
    }

    public static JSONObject getMediationAdditionalData(boolean z9, boolean z10, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z9) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z10 && i10 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i10);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getMediationUserId() {
        return com.ironsource.mediationsdk.sdk.c.a().a(DataKeys.USER_ID);
    }

    public static String getSDKVersion() {
        return VersionInfo.VERSION;
    }

    public static String getSHA256(String str) {
        try {
            return String.format("%064x", new Object[]{new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes()))});
        } catch (NoSuchAlgorithmException e10) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e10);
                return "";
            }
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getSHA256(input:" + str + ")", e10);
            return "";
        }
    }

    public static int getSerr() {
        return 1;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (f4961a.compareAndSet(false, true)) {
                f4962b = UUID.randomUUID().toString();
            }
            str = f4962b;
        }
        return str;
    }

    public static long getTimestamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(long j10, String str) {
        return getSHA256(String.format("%s%s%s", new Object[]{Long.valueOf(j10), z.a().f5055g, str}));
    }

    public static String getUserIdForNetworks() {
        String a10 = com.ironsource.mediationsdk.sdk.c.a().a(DataKeys.USER_ID);
        if (!TextUtils.isEmpty(a10)) {
            return a10;
        }
        return null;
    }

    public static void h(Context context, String str, long j10) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    public static boolean isAndroidXAvailable() {
        return doesClassExist("androidx.appcompat.app.AppCompatActivity") || doesClassExist("androidx.core.app.CoreComponentFactory") || doesClassExist("androidx.fragment.app.Fragment") || doesClassExist("androidx.lifecycle.LiveData") || doesClassExist("androidx.annotation.Keep");
    }

    public static boolean isEncryptedResponse() {
        return true;
    }

    public static boolean isGooglePlayInstalled(Context context) {
        return k.a(context);
    }

    @Deprecated
    public static boolean isInitResponseCached(Context context) {
        return !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "appKey")) && !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "response"));
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to check if network is connected - exception = " + e10);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            try {
                return new JSONObject();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else if (jSONObject == null) {
            return jSONObject2;
        } else {
            if (jSONObject2 == null) {
                return jSONObject;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        }
        return jSONObject;
    }

    public static List<Pair<String, String>> parseJsonToPairList(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return hashMap;
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(c(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                edit.putString(b(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e10);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str3 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str3 = sb.toString();
                }
                if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                    str2 = "default_is_non_connectivity_events";
                } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                    str2 = "default_rv_non_connectivity_events";
                } else {
                    str2 = "";
                }
                edit.putString(str2, str3);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str3 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str3 = sb.toString();
                }
                if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                    str2 = "default_is_opt_in_events";
                } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                    str2 = "default_rv_opt_in_events";
                } else {
                    str2 = "";
                }
                edit.putString(str2, str3);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        String str2;
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str3 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str3 = sb.toString();
                }
                if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
                    str2 = "default_is_opt_out_events";
                } else if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
                    str2 = "default_rv_opt_out_events";
                } else {
                    str2 = "";
                }
                edit.putString(str2, str3);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(d(str), str2);
                edit.commit();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e10);
            }
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j10) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putLong(IronSourceConstants.FIRST_SESSION_TIMESTAMP, j10);
            edit.apply();
        }
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("Mediation_Shared_Preferences", 0).edit();
            edit.putString("last_response", str);
            edit.apply();
        }
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
        }
    }
}
