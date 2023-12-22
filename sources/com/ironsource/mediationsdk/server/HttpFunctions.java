package com.ironsource.mediationsdk.server;

import com.ironsource.mediationsdk.z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f4875a = Executors.newSingleThreadExecutor();

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4876a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f4877b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ String f4878c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ String f4879d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ a f4880e;

        public a(String str, String str2, String str3, String str4, a aVar) {
            this.f4876a = str;
            this.f4877b = str2;
            this.f4878c = str3;
            this.f4879d = str4;
            this.f4880e = aVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream, java.lang.Throwable] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[SYNTHETIC, Splitter:B:34:0x00ab] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc A[SYNTHETIC, Splitter:B:42:0x00bc] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                java.lang.String r3 = r8.f4876a     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                java.lang.String r3 = r8.f4877b     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                if (r3 == 0) goto L_0x0016
                java.lang.String r4 = r8.f4878c     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                if (r4 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                com.ironsource.mediationsdk.utils.IronSourceUtils.getBase64Auth(r3, r4)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                throw r1     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            L_0x0016:
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
                r3 = 15000(0x3a98, float:2.102E-41)
                r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x0082 }
                r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r3 = "POST"
                r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x0082 }
                r3 = 1
                r2.setDoInput(r3)     // Catch:{ Exception -> 0x0082 }
                r2.setDoOutput(r3)     // Catch:{ Exception -> 0x0082 }
                java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ Exception -> 0x0082 }
                java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0082 }
                java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0082 }
                java.lang.String r6 = "UTF-8"
                r5.<init>(r1, r6)     // Catch:{ Exception -> 0x0082 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r5 = r8.f4879d     // Catch:{ Exception -> 0x0082 }
                r4.write(r5)     // Catch:{ Exception -> 0x0082 }
                r4.flush()     // Catch:{ Exception -> 0x0082 }
                r4.close()     // Catch:{ Exception -> 0x0082 }
                int r4 = r2.getResponseCode()     // Catch:{ Exception -> 0x0082 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 != r5) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r3 = r0
            L_0x0055:
                if (r3 != 0) goto L_0x006f
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x0082 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
                java.lang.String r7 = "invalid response code "
                r6.<init>(r7)     // Catch:{ Exception -> 0x0082 }
                r6.append(r4)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r4 = " sending request"
                r6.append(r4)     // Catch:{ Exception -> 0x0082 }
                java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0082 }
                r5.error(r4)     // Catch:{ Exception -> 0x0082 }
            L_0x006f:
                com.ironsource.mediationsdk.server.a r4 = r8.f4880e     // Catch:{ Exception -> 0x0082 }
                r4.a(r3)     // Catch:{ Exception -> 0x0082 }
                if (r1 == 0) goto L_0x007e
                r1.close()     // Catch:{ IOException -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r0 = move-exception
                r0.printStackTrace()
            L_0x007e:
                r2.disconnect()
                return
            L_0x0082:
                r3 = move-exception
                goto L_0x008a
            L_0x0084:
                r0 = move-exception
                r2 = r1
                goto L_0x00ba
            L_0x0087:
                r2 = move-exception
                r3 = r2
                r2 = r1
            L_0x008a:
                r3.printStackTrace()     // Catch:{ all -> 0x00b9 }
                com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b9 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
                java.lang.String r6 = "exception while sending request "
                r5.<init>(r6)     // Catch:{ all -> 0x00b9 }
                java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00b9 }
                r5.append(r3)     // Catch:{ all -> 0x00b9 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b9 }
                r4.error(r3)     // Catch:{ all -> 0x00b9 }
                com.ironsource.mediationsdk.server.a r3 = r8.f4880e     // Catch:{ all -> 0x00b9 }
                r3.a(r0)     // Catch:{ all -> 0x00b9 }
                if (r1 == 0) goto L_0x00b3
                r1.close()     // Catch:{ IOException -> 0x00af }
                goto L_0x00b3
            L_0x00af:
                r0 = move-exception
                r0.printStackTrace()
            L_0x00b3:
                if (r2 == 0) goto L_0x00b8
                r2.disconnect()
            L_0x00b8:
                return
            L_0x00b9:
                r0 = move-exception
            L_0x00ba:
                if (r1 == 0) goto L_0x00c4
                r1.close()     // Catch:{ IOException -> 0x00c0 }
                goto L_0x00c4
            L_0x00c0:
                r1 = move-exception
                r1.printStackTrace()
            L_0x00c4:
                if (r2 == 0) goto L_0x00c9
                r2.disconnect()
            L_0x00c9:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.a.run():void");
        }
    }

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, (z.a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStringFromURL(java.lang.String r4, com.ironsource.mediationsdk.z.a r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007c, all -> 0x006f }
            r1.<init>(r4)     // Catch:{ Exception -> 0x007c, all -> 0x006f }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ Exception -> 0x007c, all -> 0x006f }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x007c, all -> 0x006f }
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r1)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r4.setConnectTimeout(r1)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r1 = 1
            r4.setDoInput(r1)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r4.connect()     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L_0x0033
            if (r5 == 0) goto L_0x002f
            java.lang.String r1 = "Bad Request - 400"
            r5.a(r1)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
        L_0x002f:
            r4.disconnect()
            return r0
        L_0x0033:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007e, all -> 0x0062 }
            r1.<init>()     // Catch:{ Exception -> 0x007e, all -> 0x0062 }
        L_0x0046:
            java.lang.String r2 = r5.readLine()     // Catch:{ Exception -> 0x007e, all -> 0x0062 }
            if (r2 == 0) goto L_0x0050
            r1.append(r2)     // Catch:{ Exception -> 0x007e, all -> 0x0062 }
            goto L_0x0046
        L_0x0050:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007e, all -> 0x0062 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007e, all -> 0x0062 }
            r4.disconnect()
            r5.close()
            if (r2 == 0) goto L_0x0061
            return r0
        L_0x0061:
            return r1
        L_0x0062:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r5
            r5 = r3
            goto L_0x0071
        L_0x0068:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0071
        L_0x006d:
            r5 = r0
            goto L_0x007e
        L_0x006f:
            r5 = move-exception
            r4 = r0
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.disconnect()
        L_0x0076:
            if (r4 == 0) goto L_0x007b
            r4.close()
        L_0x007b:
            throw r5
        L_0x007c:
            r4 = r0
            r5 = r4
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            r4.disconnect()
        L_0x0083:
            if (r5 == 0) goto L_0x0088
            r5.close()
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.server.HttpFunctions.getStringFromURL(java.lang.String, com.ironsource.mediationsdk.z$a):java.lang.String");
    }

    public static void sendPostRequest(String str, String str2, a aVar) {
        sendPostRequestWithAutho(str, str2, (String) null, (String) null, aVar);
    }

    public static void sendPostRequestWithAutho(String str, String str2, String str3, String str4, a aVar) {
        f4875a.submit(new a(str, str3, str4, str2, aVar));
    }
}
