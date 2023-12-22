package y6;

import android.content.Context;
import android.util.JsonReader;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;
import s6.h;
import u6.a;
import v6.g;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f13059d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f13060e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f13061a;

    /* renamed from: b  reason: collision with root package name */
    public final a<h> f13062b;

    /* renamed from: c  reason: collision with root package name */
    public final e f13063c = new e();

    public c(Context context, a<h> aVar) {
        this.f13061a = context;
        this.f13062b = aVar;
    }

    public static URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e10) {
            throw new g(e10.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f13060e
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006a
            java.lang.String r11 = ""
            goto L_0x0070
        L_0x006a:
            java.lang.String r12 = ", "
            java.lang.String r11 = com.ironsource.adapters.ironsource.a.g(r12, r11)
        L_0x0070:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        o.a("Invalid Expiration Timestamp.", f13059d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f13060e));
        Long l6 = 0L;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str5 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                        str2 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        l6 = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (l6 == null) {
                    str = " tokenExpirationTimestamp";
                } else {
                    str = "";
                }
                if (str.isEmpty()) {
                    bVar = new b(str2, l6.longValue(), 0);
                    jsonReader.endObject();
                } else {
                    throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str3, str4, str5, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f13060e));
        String str2 = null;
        Long l6 = 0L;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                l6 = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (l6 == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            return new b(str2, l6.longValue(), 1);
        }
        throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[Catch:{ NameNotFoundException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a A[Catch:{ NameNotFoundException -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection c(java.net.URL r6, java.lang.String r7) {
        /*
            r5 = this;
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x00b1 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x00b1 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)
            r1 = 0
            r6.setUseCaches(r1)
            r6.setReadTimeout(r0)
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Content-Type"
            r6.addRequestProperty(r1, r0)
            java.lang.String r1 = "Accept"
            r6.addRequestProperty(r1, r0)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = "gzip"
            r6.addRequestProperty(r0, r1)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r1 = "no-cache"
            r6.addRequestProperty(r0, r1)
            android.content.Context r0 = r5.f13061a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r6.addRequestProperty(r1, r0)
            u6.a<s6.h> r0 = r5.f13062b
            java.lang.Object r0 = r0.get()
            s6.h r0 = (s6.h) r0
            java.lang.String r1 = "ContentValues"
            if (r0 == 0) goto L_0x0062
            java.lang.String r2 = "x-firebase-client"
            com.google.android.gms.tasks.Task r0 = r0.a()     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            r6.addRequestProperty(r2, r0)     // Catch:{ ExecutionException -> 0x005c, InterruptedException -> 0x0053 }
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto L_0x005d
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            java.lang.String r2 = "Failed to get heartbeats header"
            android.util.Log.w(r1, r2, r0)
        L_0x0062:
            r0 = 0
            android.content.Context r2 = r5.f13061a     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x008f }
            byte[] r2 = w3.a.a(r2, r3)     // Catch:{ NameNotFoundException -> 0x008f }
            if (r2 != 0) goto L_0x008a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x008f }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x008f }
            android.content.Context r3 = r5.f13061a     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x008f }
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r2 = r2.toString()     // Catch:{ NameNotFoundException -> 0x008f }
            android.util.Log.e(r1, r2)     // Catch:{ NameNotFoundException -> 0x008f }
            goto L_0x00a6
        L_0x008a:
            java.lang.String r0 = androidx.lifecycle.c0.e(r2)     // Catch:{ NameNotFoundException -> 0x008f }
            goto L_0x00a6
        L_0x008f:
            r2 = move-exception
            java.lang.String r3 = "No such package: "
            java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
            android.content.Context r4 = r5.f13061a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r1, r3, r2)
        L_0x00a6:
            java.lang.String r1 = "X-Android-Cert"
            r6.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r6.addRequestProperty(r0, r7)
            return r6
        L_0x00b1:
            v6.g r6 = new v6.g
            java.lang.String r7 = "Firebase Installations Service is unavailable. Please try again later."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
