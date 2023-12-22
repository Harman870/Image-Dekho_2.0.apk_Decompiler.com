package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static String f3724c = "";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f3725a;

    /* renamed from: b  reason: collision with root package name */
    public String f3726b;

    /* renamed from: d  reason: collision with root package name */
    public String f3727d;

    /* renamed from: e  reason: collision with root package name */
    public String f3728e;

    /* renamed from: f  reason: collision with root package name */
    public Context f3729f;

    /* renamed from: g  reason: collision with root package name */
    public String f3730g;

    /* renamed from: h  reason: collision with root package name */
    public String f3731h;

    public class a implements m7.a {
        public final void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread next : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = next.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(next.getName());
                    sb.append(" Thread ID ");
                    sb.append(next.getId());
                    sb.append(" (");
                    sb.append(next.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(next.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            e.f3724c = sb.toString();
        }

        public final void b() {
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Context f3734a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f3735b;

        public b(Context context, String str) {
            this.f3734a = context;
            this.f3735b = str;
        }

        public final void run() {
            try {
                String C = h.C(this.f3734a);
                if (!TextUtils.isEmpty(C)) {
                    e.this.f3726b = C;
                }
                String D = h.D(this.f3734a);
                if (!TextUtils.isEmpty(D)) {
                    e.this.f3728e = D;
                }
                SharedPreferences.Editor edit = this.f3734a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", e.this.f3726b);
                edit.putString("sId", this.f3735b);
                edit.apply();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e.a().f3730g).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Log.i("JSON", e.this.f3725a.toString());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(e.this.f3725a.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                Log.i("MSG", httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static volatile e f3740a = new e(0);
    }

    private e() {
        this.f3725a = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f3731h = " ";
        this.f3730g = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new d(defaultUncaughtExceptionHandler));
    }

    public /* synthetic */ e(int i10) {
        this();
    }

    public static e a() {
        return d.f3740a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r7, java.util.HashSet<java.lang.String> r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.String r12, int r13, boolean r14) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0198
            java.lang.String r0 = "automation_log"
            java.lang.String r1 = "init ISCrashReporter"
            android.util.Log.d(r0, r1)
            r6.f3729f = r7
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0013
            r6.f3731h = r10
        L_0x0013:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x001b
            r6.f3730g = r9
        L_0x001b:
            r6.f3727d = r12
            if (r11 == 0) goto L_0x0030
            com.ironsource.environment.a r9 = new com.ironsource.environment.a
            r9.<init>(r13)
            r9.f3691e = r14
            com.ironsource.environment.e$a r10 = new com.ironsource.environment.e$a
            r10.<init>()
            r9.f3687a = r10
            r9.start()
        L_0x0030:
            android.content.Context r9 = r6.f3729f
            r10 = 0
            java.lang.String r11 = "none"
            if (r9 != 0) goto L_0x0038
            goto L_0x0065
        L_0x0038:
            java.lang.String r13 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r13)
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
            if (r9 != 0) goto L_0x0043
            goto L_0x0065
        L_0x0043:
            android.net.Network r13 = r9.getActiveNetwork()     // Catch:{ Exception -> 0x0061 }
            android.net.NetworkCapabilities r9 = r9.getNetworkCapabilities(r13)     // Catch:{ Exception -> 0x0061 }
            if (r9 != 0) goto L_0x004e
            goto L_0x0065
        L_0x004e:
            r13 = 1
            boolean r13 = r9.hasTransport(r13)     // Catch:{ Exception -> 0x0061 }
            if (r13 == 0) goto L_0x0058
            java.lang.String r9 = "wifi"
            goto L_0x0066
        L_0x0058:
            boolean r9 = r9.hasTransport(r10)     // Catch:{ Exception -> 0x0061 }
            if (r9 == 0) goto L_0x0065
            java.lang.String r9 = "cellular"
            goto L_0x0066
        L_0x0061:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0065:
            r9 = r11
        L_0x0066:
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x018b
            java.lang.String r11 = "CRep"
            android.content.SharedPreferences r10 = r7.getSharedPreferences(r11, r10)
            java.lang.String r11 = r6.f3726b
            java.lang.String r13 = "String1"
            java.lang.String r11 = r10.getString(r13, r11)
            java.lang.String r13 = r6.f3727d
            java.lang.String r14 = "sId"
            java.lang.String r10 = r10.getString(r14, r13)
            java.util.List r13 = com.ironsource.environment.f.a()
            java.util.Iterator r13 = r13.iterator()
        L_0x008a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r13.next()
            com.ironsource.environment.c r0 = (com.ironsource.environment.c) r0
            java.lang.String r1 = r0.b()
            java.lang.String r2 = r0.a()
            java.lang.String r0 = r0.c()
            java.lang.String r3 = r7.getPackageName()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "crashDate"
            r4.put(r5, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = "stacktraceCrash"
            r4.put(r1, r2)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = "crashType"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "CrashReporterVersion"
            java.lang.String r1 = "1.0.5"
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "SDKVersion"
            java.lang.String r1 = "7.5.0"
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "deviceLanguage"
            java.lang.String r1 = com.ironsource.environment.h.a((android.content.Context) r7)     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "appVersion"
            java.lang.String r1 = com.ironsource.environment.c.c(r7, r3)     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "deviceOSVersion"
            java.lang.String r1 = com.ironsource.environment.h.e()     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "network"
            r4.put(r0, r9)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "deviceApiLevel"
            int r1 = com.ironsource.environment.h.f()     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "deviceModel"
            java.lang.String r1 = com.ironsource.environment.h.g()     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "deviceOS"
            java.lang.String r1 = com.ironsource.environment.h.i()     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "advertisingId"
            r4.put(r0, r11)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "deviceOEM"
            java.lang.String r1 = com.ironsource.environment.h.h()     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "systemProperties"
            java.util.Properties r1 = java.lang.System.getProperties()     // Catch:{ Exception -> 0x0168 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = "bundleId"
            r4.put(r0, r3)     // Catch:{ Exception -> 0x0168 }
            r4.put(r14, r10)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r0 = r6.f3728e     // Catch:{ Exception -> 0x0168 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0168 }
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = r6.f3728e     // Catch:{ Exception -> 0x0168 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = "isLimitAdTrackingEnabled"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0168 }
        L_0x0135:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0168 }
            r0.<init>()     // Catch:{ Exception -> 0x0168 }
            if (r8 == 0) goto L_0x0166
            boolean r1 = r8.isEmpty()     // Catch:{ Exception -> 0x0168 }
            if (r1 != 0) goto L_0x0166
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0168 }
        L_0x0146:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0168 }
            if (r2 == 0) goto L_0x0165
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0168 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0168 }
            boolean r3 = r4.has(r2)     // Catch:{ Exception -> 0x0160 }
            if (r3 == 0) goto L_0x0146
            java.lang.Object r3 = r4.opt(r2)     // Catch:{ Exception -> 0x0160 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x0160 }
            goto L_0x0146
        L_0x0160:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0168 }
            goto L_0x0146
        L_0x0165:
            r4 = r0
        L_0x0166:
            r6.f3725a = r4     // Catch:{ Exception -> 0x0168 }
        L_0x0168:
            org.json.JSONObject r0 = r6.f3725a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "ISCrashReport"
            java.lang.String r1 = " Is Empty"
            android.util.Log.d(r0, r1)
            goto L_0x008a
        L_0x0179:
            java.lang.Thread r0 = new java.lang.Thread
            com.ironsource.environment.e$c r1 = new com.ironsource.environment.e$c
            r1.<init>()
            r0.<init>(r1)
            r0.start()
            com.ironsource.environment.f.c()
            goto L_0x008a
        L_0x018b:
            java.lang.Thread r8 = new java.lang.Thread
            com.ironsource.environment.e$b r9 = new com.ironsource.environment.e$b
            r9.<init>(r7, r12)
            r8.<init>(r9)
            r8.start()
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.e.a(android.content.Context, java.util.HashSet, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean):void");
    }
}
