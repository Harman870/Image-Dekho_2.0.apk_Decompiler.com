package com.ironsource.d;

import android.util.Pair;
import com.ironsource.environment.c.e;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f3657a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3658b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3659c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3660d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3661e;

        /* renamed from: f  reason: collision with root package name */
        public final String f3662f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<Pair<String, String>> f3663g;

        /* renamed from: com.ironsource.d.b$a$a  reason: collision with other inner class name */
        public static class C0039a {

            /* renamed from: a  reason: collision with root package name */
            public ArrayList f3664a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            public String f3665b;

            /* renamed from: c  reason: collision with root package name */
            public String f3666c = "POST";

            /* renamed from: d  reason: collision with root package name */
            public String f3667d;

            /* renamed from: e  reason: collision with root package name */
            public int f3668e = 15000;

            /* renamed from: f  reason: collision with root package name */
            public int f3669f = 15000;

            /* renamed from: g  reason: collision with root package name */
            public String f3670g = "UTF-8";

            public final C0039a a(List<Pair<String, String>> list) {
                this.f3664a.addAll(list);
                return this;
            }

            public final a a() {
                return new a(this);
            }
        }

        public a(C0039a aVar) {
            this.f3657a = aVar.f3665b;
            this.f3658b = aVar.f3666c;
            this.f3659c = aVar.f3667d;
            this.f3663g = new ArrayList<>(aVar.f3664a);
            this.f3660d = aVar.f3668e;
            this.f3661e = aVar.f3669f;
            this.f3662f = aVar.f3670g;
        }
    }

    public b() {
        new e();
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[SYNTHETIC, Splitter:B:31:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.d.c a(com.ironsource.d.b.a r7) {
        /*
            java.lang.String r0 = r7.f3657a
            java.lang.String r1 = r7.f3659c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00cb
            com.ironsource.d.c r0 = new com.ironsource.d.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = r7.f3657a     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            int r3 = r7.f3660d     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            int r3 = r7.f3661e     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = r7.f3658b     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f3663g     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            b(r2, r3)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f3658b     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f3659c     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            java.lang.String r4 = r7.f3662f     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            int r4 = r3.length     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            c(r2, r3)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            r0.f3671a = r3     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.a.AnonymousClass1.a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007c, all -> 0x007a }
            r0.f3672b = r3     // Catch:{ IOException -> 0x007c, all -> 0x007a }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            r2.disconnect()
            goto L_0x00ba
        L_0x007a:
            r7 = move-exception
            goto L_0x00c0
        L_0x007c:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0087
        L_0x0081:
            r7 = move-exception
            r2 = r1
            goto L_0x00c0
        L_0x0084:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0087:
            if (r1 == 0) goto L_0x00bb
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bc }
            r0.f3671a = r4     // Catch:{ all -> 0x00bc }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00bb
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bc }
            java.lang.String r7 = r7.f3657a     // Catch:{ all -> 0x00bc }
            r4.append(r7)     // Catch:{ all -> 0x00bc }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bc }
            int r7 = r0.f3671a     // Catch:{ all -> 0x00bc }
            r4.append(r7)     // Catch:{ all -> 0x00bc }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bc }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x00b7
            r2.close()
        L_0x00b7:
            r1.disconnect()
        L_0x00ba:
            return r0
        L_0x00bb:
            throw r3     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00c0:
            if (r1 == 0) goto L_0x00c5
            r1.close()
        L_0x00c5:
            if (r2 == 0) goto L_0x00ca
            r2.disconnect()
        L_0x00ca:
            throw r7
        L_0x00cb:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.d.b.a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    public static c a(String str, String str2, List<Pair<String, String>> list) {
        a.C0039a aVar = new a.C0039a();
        aVar.f3665b = str;
        aVar.f3667d = str2;
        aVar.f3666c = "POST";
        aVar.a(list);
        return a(aVar.a());
    }

    public static void b(HttpURLConnection httpURLConnection, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    public static void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    public void a(int i10) {
        e.a("sdia", (Object) Integer.valueOf(i10));
    }

    public void b(int i10) {
        e.a("sdra", (Object) Integer.valueOf(i10));
    }

    public void c(int i10) {
        e.a("sdba", (Object) Integer.valueOf(i10));
    }

    public void d(int i10) {
        e.a("sdna", (Object) Integer.valueOf(i10));
    }
}
