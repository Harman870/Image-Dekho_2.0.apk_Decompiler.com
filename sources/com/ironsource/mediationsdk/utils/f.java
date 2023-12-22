package com.ironsource.mediationsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.activity.e;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.g;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.z;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f4996a = "f";

    /* renamed from: b  reason: collision with root package name */
    public Context f4997b;

    private f() {
        Class<f> cls = f.class;
    }

    public f(Context context) {
        Class<f> cls = f.class;
        this.f4997b = context.getApplicationContext();
    }

    public static String a() {
        try {
            String str = Build.VERSION.RELEASE;
            int i10 = Build.VERSION.SDK_INT;
            return i10 + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    public final String b() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f4997b.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!networkOperatorName.equals("")) {
                return networkOperatorName;
            }
            return "";
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, e.c(new StringBuilder(), this.f4996a, ":getMobileCarrier()"), e10);
            return "";
        }
    }

    public final int c() {
        int i10;
        try {
            Intent registerReceiver = this.f4997b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i11 = 0;
            if (registerReceiver != null) {
                i10 = registerReceiver.getIntExtra("level", -1);
            } else {
                i10 = 0;
            }
            if (registerReceiver != null) {
                i11 = registerReceiver.getIntExtra("scale", -1);
            }
            if (i10 == -1 || i11 == -1) {
                return -1;
            }
            return (int) ((((float) i10) / ((float) i11)) * 100.0f);
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, e.c(new StringBuilder(), this.f4996a, ":getBatteryLevel()"), e10);
            return -1;
        }
    }

    public final int d() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round((float) (((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15)) * 15;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, e.c(new StringBuilder(), this.f4996a, ":getGmtMinutesOffset()"), e10);
            return 0;
        }
    }

    public final void run() {
        String str;
        boolean z9;
        String str2;
        boolean z10;
        String str3;
        String str4;
        String str5;
        long j10;
        boolean z11;
        String str6;
        String str7;
        String str8 = "";
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", IronSourceUtils.getSessionId());
        try {
            str = this.f4997b.getPackageName();
        } catch (Exception unused) {
            str = str8;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("bundleId", str);
                String c10 = c.c(this.f4997b, str);
                if (!TextUtils.isEmpty(c10)) {
                    hashMap.put("appVersion", c10);
                }
            }
            hashMap.put("appKey", z.a().f5055g);
            String C = h.C(this.f4997b);
            String D = h.D(this.f4997b);
            boolean z12 = true;
            if (!TextUtils.isEmpty(C)) {
                str2 = IronSourceConstants.TYPE_GAID;
                z9 = false;
            } else {
                C = h.x(this.f4997b);
                if (!TextUtils.isEmpty(C)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                } else {
                    str2 = str8;
                }
                z9 = true;
            }
            if (!TextUtils.isEmpty(C)) {
                hashMap.put("advertisingId", C);
                hashMap.put("advertisingIdType", str2);
            }
            if (!TextUtils.isEmpty(D)) {
                z10 = Boolean.parseBoolean(D);
                hashMap.put("isLimitAdTrackingEnabled", Boolean.valueOf(z10));
            } else {
                z10 = false;
            }
            if (z9 || z10) {
                String str9 = "other";
                if (TextUtils.isEmpty(D)) {
                    str9 = "missingDependencies";
                } else if (!g.b()) {
                    str9 = "publisherAPI";
                } else if (!h.G(this.f4997b)) {
                    str9 = "missingManifest";
                } else if (Boolean.parseBoolean(D)) {
                    str9 = "userLat";
                }
                hashMap.put("AdvIdOptOutReason", str9);
            }
            hashMap.put("deviceOS", "Android");
            if (!TextUtils.isEmpty(a())) {
                hashMap.put("osVersion", a());
            }
            String connectionType = IronSourceUtils.getConnectionType(this.f4997b);
            if (!TextUtils.isEmpty(connectionType)) {
                hashMap.put("connectionType", connectionType);
            }
            hashMap.put("sdkVersion", IronSourceUtils.getSDKVersion());
            try {
                str3 = Locale.getDefault().getLanguage();
            } catch (Exception unused2) {
                str3 = str8;
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("language", str3);
            }
            try {
                str4 = Build.MANUFACTURER;
            } catch (Exception unused3) {
                str4 = str8;
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("deviceOEM", str4);
            }
            try {
                str5 = Build.MODEL;
            } catch (Exception unused4) {
                str5 = str8;
            }
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("deviceModel", str5);
            }
            String b10 = b();
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put("mobileCarrier", b10);
            }
            long j11 = -1;
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                j10 = (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
            } catch (Exception unused5) {
                j10 = -1;
            }
            hashMap.put("internalFreeMemory", Long.valueOf(j10));
            try {
                z11 = Environment.getExternalStorageState().equals("mounted");
            } catch (Exception unused6) {
                z11 = false;
            }
            if (z11) {
                StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j11 = (((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize())) / 1048576;
            }
            hashMap.put("externalFreeMemory", Long.valueOf(j11));
            hashMap.put("battery", Integer.valueOf(c()));
            int d10 = d();
            if (d10 > 840 || d10 < -720 || d10 % 15 != 0) {
                z12 = false;
            }
            if (z12) {
                hashMap.put("gmtMinutesOffset", Integer.valueOf(d10));
            }
            try {
                str6 = ConfigFile.getConfigFile().getPluginType();
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
                str6 = str8;
            }
            if (!TextUtils.isEmpty(str6)) {
                hashMap.put("pluginType", str6);
            }
            try {
                str7 = ConfigFile.getConfigFile().getPluginVersion();
            } catch (Exception e11) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e11);
                str7 = str8;
            }
            if (!TextUtils.isEmpty(str7)) {
                hashMap.put("pluginVersion", str7);
            }
            try {
                str8 = ConfigFile.getConfigFile().getPluginFrameworkVersion();
            } catch (Exception e12) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e12);
            }
            if (!TextUtils.isEmpty(str8)) {
                hashMap.put("plugin_fw_v", str8);
            }
            String valueOf = String.valueOf(h.j());
            if (!TextUtils.isEmpty(valueOf)) {
                hashMap.put("jb", valueOf);
            }
            String str10 = z.a().k;
            if (!TextUtils.isEmpty(str10)) {
                hashMap.put("mt", str10);
            }
            String valueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.f4997b));
            if (!TextUtils.isEmpty(valueOf2)) {
                hashMap.put("firstSession", valueOf2);
            }
            String y9 = h.y(this.f4997b);
            if (!TextUtils.isEmpty(y9)) {
                hashMap.put("auid", y9);
            }
            hashMap.put("mcc", Integer.valueOf(a.AnonymousClass1.c(this.f4997b)));
            hashMap.put("mnc", Integer.valueOf(a.AnonymousClass1.d(this.f4997b)));
            String j12 = h.j(this.f4997b);
            if (!TextUtils.isEmpty(j12)) {
                hashMap.put("icc", j12);
            }
            String c11 = h.c();
            if (!TextUtils.isEmpty(c11)) {
                hashMap.put("tz", c11);
            }
            IronLog.INTERNAL.verbose("collecting data for events: " + hashMap);
            com.ironsource.mediationsdk.sdk.c.a().a((Map<String, Object>) hashMap);
        } catch (Exception e13) {
            Class<f> cls = f.class;
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = f", e13);
        }
    }
}
