package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.g.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKUtils {

    /* renamed from: a  reason: collision with root package name */
    public static String f5754a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f5755b = null;

    /* renamed from: c  reason: collision with root package name */
    public static String f5756c = null;

    /* renamed from: d  reason: collision with root package name */
    public static int f5757d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static String f5758e = null;

    /* renamed from: f  reason: collision with root package name */
    public static Map<String, String> f5759f = null;

    /* renamed from: g  reason: collision with root package name */
    public static String f5760g = "";

    public static class a implements DialogInterface.OnClickListener {
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, (float) i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Logger.d("SDKUtils", "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((((float) j10) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x001a, UnsupportedEncodingException -> 0x0018 }
            r1.reset()     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            r1.update(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            goto L_0x001f
        L_0x0014:
            r3 = move-exception
            goto L_0x001c
        L_0x0016:
            r3 = move-exception
            goto L_0x001c
        L_0x0018:
            r3 = move-exception
            goto L_0x001b
        L_0x001a:
            r3 = move-exception
        L_0x001b:
            r1 = r0
        L_0x001c:
            r3.printStackTrace()
        L_0x001f:
            if (r1 == 0) goto L_0x0026
            byte[] r3 = r1.digest()
            return r3
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(f fVar) {
        return fetchDemandSourceId(fVar.f5656d);
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                try {
                    jSONObject.putOpt((String) next.getKey(), encodeString((String) next.getValue()));
                } catch (JSONException e10) {
                    Logger.i("SDKUtils", "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z9) {
        int i10 = 2 | 1796;
        return z9 ? i10 | 4096 : i10;
    }

    public static String getAdvertiserId() {
        return f5754a;
    }

    public static String getControllerConfig() {
        return f5758e;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f5756c) ? f5756c : "";
    }

    public static int getDebugMode() {
        return f5757d;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f5759f;
    }

    public static String getLimitAdTracking() {
        return f5755b;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt("minOSVersionSupport");
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject("networkConfig");
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(h.o(context)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public static d.e getProductType(String str) {
        d.e eVar = d.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        d.e eVar2 = d.e.f5649c;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        d.e eVar3 = d.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public static String getSDKVersion() {
        return VersionInfo.VERSION;
    }

    public static String getTesterParameters() {
        return f5760g;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
            if (next.processName.equalsIgnoreCase(packageName) && next.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        String C = h.C(context);
        String D = h.D(context);
        if (!TextUtils.isEmpty(C)) {
            f5754a = C;
        }
        if (!TextUtils.isEmpty(D)) {
            f5755b = D;
        }
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j10) {
        return (int) ((((float) j10) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f5758e = str;
    }

    public static void setControllerUrl(String str) {
        f5756c = str;
    }

    public static void setDebugMode(int i10) {
        f5757d = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f5759f = map;
    }

    public static void setTesterParameters(String str) {
        f5760g = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 11) {
                    if (i10 != 12) {
                        switch (i10) {
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
}
