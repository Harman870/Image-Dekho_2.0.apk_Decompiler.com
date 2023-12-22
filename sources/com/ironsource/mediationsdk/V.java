package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.StringUtils;
import com.ironsource.environment.c;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class V {

    /* renamed from: c  reason: collision with root package name */
    public static V f4056c;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f4057a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    public final com.ironsource.mediationsdk.services.a f4058b = MediationServices.getProvider().getSessionDepthService();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                V.this.a(V.d());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private V() {
    }

    public static synchronized V a() {
        V v10;
        synchronized (V.class) {
            if (f4056c == null) {
                f4056c = new V();
            }
            v10 = f4056c;
        }
        return v10;
    }

    public static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", StringUtils.toUpperCase(language));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e10 = h.e();
                if (e10 != null) {
                    jSONObject.put("dOSVF", e10);
                    jSONObject.put("dOSV", e10.replaceAll("[^0-9/.]", ""));
                }
                String y9 = h.y(applicationContext);
                if (y9 != null) {
                    jSONObject.put("auid", y9);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put("appKey", z.a().f5055g);
                jSONObject.put("mCar", h.i(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", "android");
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", c.c(applicationContext, applicationContext.getPackageName()));
                String str = z.a().f5057h;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("usId", str);
                }
            } catch (JSONException e11) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e11.getMessage());
                e11.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static JSONObject d() {
        String str;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String C = h.C(applicationContext);
                String D = h.D(applicationContext);
                if (!TextUtils.isEmpty(C)) {
                    str = IronSourceConstants.TYPE_GAID;
                } else {
                    C = h.x(applicationContext);
                    str = !TextUtils.isEmpty(C) ? IronSourceConstants.TYPE_UUID : "";
                }
                if (!TextUtils.isEmpty(C)) {
                    jSONObject.put("advId", C);
                    jSONObject.put("advType", str);
                }
                if (!TextUtils.isEmpty(D)) {
                    jSONObject.put("isLAT", Boolean.parseBoolean(D));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    public void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            synchronized (this) {
                try {
                    this.f4057a.put(next, opt);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = h.k();
        int l6 = h.l();
        float o10 = h.o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C0180c.a().f4335d;
                concurrentHashMap.putAll(com.ironsource.mediationsdk.d.c.a().c());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                Boolean bool = z.a().M;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String B = h.B(applicationContext);
                if (!TextUtils.isEmpty(B)) {
                    jSONObject.put("asid", B);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", (double) h.l(applicationContext));
                jSONObject.put("root", h.j());
                jSONObject.put("bat", h.v(applicationContext));
                jSONObject.put("diskFS", h.p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l6);
                jSONObject.put("dScrenScle", String.valueOf(o10));
                jSONObject.put("sDepIS", this.f4058b.a(IronSource.AD_UNIT.INTERSTITIAL));
                jSONObject.put("sDepRV", this.f4058b.a(IronSource.AD_UNIT.REWARDED_VIDEO));
                jSONObject.put("UA", h.q());
            } catch (JSONException e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e10.getMessage());
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }
}
