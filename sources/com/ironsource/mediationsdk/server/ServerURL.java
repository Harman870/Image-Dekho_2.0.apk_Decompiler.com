package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.activity.f;
import androidx.fragment.app.w0;
import com.facebook.ads.AdSDKNotificationListener;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.d.b;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.e;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ServerURL {
    public static String a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (str.length() > 0) {
                str = a.g(str, "&");
            }
            StringBuilder g10 = f.g(str);
            g10.append((String) pair.first);
            g10.append("=");
            g10.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            str = g10.toString();
        }
        return str;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z9, List<Pair<String, String>> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", IronSourceUtils.getSDKVersion()));
        if (z9) {
            arrayList.add(new Pair("rvManual", IronSourceConstants.BOOLEAN_TRUE_AS_STRING));
        }
        if (!IronSourceUtils.isEncryptedResponse()) {
            arrayList.add(new Pair("serr", "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair("pluginType", ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair("pluginVersion", ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair("plugin_fw_v", ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair("advId", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String c10 = c.c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c10)) {
            arrayList.add(new Pair("appVer", c10));
        }
        int i10 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i10);
        arrayList.add(new Pair("osVer", sb.toString()));
        arrayList.add(new Pair("devMake", Build.MANUFACTURER));
        arrayList.add(new Pair("devModel", Build.MODEL));
        boolean firstSession = IronSourceUtils.getFirstSession(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(firstSession ? 1 : 0);
        arrayList.add(new Pair("fs", sb2.toString()));
        ConcurrentHashMap<String, List<String>> c11 = com.ironsource.mediationsdk.d.c.a().c();
        if (c11.containsKey("is_child_directed")) {
            arrayList.add(new Pair("coppa", c11.get("is_child_directed").get(0)));
        }
        if (c11.containsKey("is_test_suite")) {
            String str5 = (String) c11.get("is_test_suite").get(0);
            if (!TextUtils.isEmpty(str5) && str5.equalsIgnoreCase("enable")) {
                arrayList.add(new Pair("ts", IronSourceConstants.BOOLEAN_TRUE_AS_STRING));
            }
        }
        if (c11.containsKey("google_family_self_certified_sdks")) {
            String str6 = (String) c11.get("google_family_self_certified_sdks").get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase("true")) {
                arrayList.add(new Pair("dff", IronSourceConstants.BOOLEAN_TRUE_AS_STRING));
            }
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            arrayList.add(new Pair("connType", connectionType));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String q10 = h.q();
        if (q10.length() != 0) {
            arrayList.add(new Pair("browserUserAgent", q10));
        }
        String str7 = null;
        try {
            str7 = h.a(context) + "-" + h.b(context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!(str7 == null || str7.length() == 0)) {
            arrayList.add(new Pair("deviceLang", str7));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a.AnonymousClass1.c(context));
        arrayList.add(new Pair("mcc", sb3.toString()));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a.AnonymousClass1.d(context));
        arrayList.add(new Pair("mnc", sb4.toString()));
        String j10 = h.j(context);
        if (!TextUtils.isEmpty(j10)) {
            arrayList.add(new Pair("icc", j10));
        }
        String i11 = h.i(context);
        if (!TextUtils.isEmpty(i11)) {
            arrayList.add(new Pair("mCar", i11));
        }
        String c12 = h.c();
        if (!TextUtils.isEmpty(c12)) {
            arrayList.add(new Pair("tz", c12));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(h.b());
        arrayList.add(new Pair("tzOff", sb5.toString()));
        String y9 = h.y(context);
        if (!TextUtils.isEmpty(y9)) {
            arrayList.add(new Pair("auid", y9));
        }
        if (z10) {
            arrayList.add(new Pair(IronSourceConstants.EVENTS_DEMAND_ONLY, IronSourceConstants.BOOLEAN_TRUE_AS_STRING));
        }
        arrayList.addAll(IronSourceUtils.parseJsonToPairList(new b().a()));
        String encode = URLEncoder.encode(IronSourceAES.encode(e.a().b(), a(arrayList)), "UTF-8");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("https://init.supersonicads.com/sdk/v" + IronSourceUtils.getSDKVersion() + "?request=");
        sb6.append(encode);
        return sb6.toString();
    }

    public static String getRequestURL(String str, boolean z9, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(AdSDKNotificationListener.IMPRESSION_EVENT, Boolean.toString(z9)));
        arrayList.add(new Pair("placementId", Integer.toString(i10)));
        return w0.d(str, "&", a(arrayList));
    }
}
