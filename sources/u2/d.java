package u2;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import p6.e;
import v2.j;
import x2.m;

public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final p6.d f12185a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f12186b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12187c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f12188d = c(a.f12178c);

    /* renamed from: e  reason: collision with root package name */
    public final f3.a f12189e;

    /* renamed from: f  reason: collision with root package name */
    public final f3.a f12190f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12191g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f12192a;

        /* renamed from: b  reason: collision with root package name */
        public final j f12193b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12194c;

        public a(URL url, j jVar, String str) {
            this.f12192a = url;
            this.f12193b = jVar;
            this.f12194c = str;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12195a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f12196b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12197c;

        public b(int i10, URL url, long j10) {
            this.f12195a = i10;
            this.f12196b = url;
            this.f12197c = j10;
        }
    }

    public d(Context context, f3.a aVar, f3.a aVar2) {
        e eVar = new e();
        v2.b.f12422a.a(eVar);
        eVar.f10695d = true;
        this.f12185a = new p6.d(eVar);
        this.f12187c = context;
        this.f12186b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f12189e = aVar2;
        this.f12190f = aVar;
        this.f12191g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g("Invalid url: ", str), e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x02a7 A[Catch:{ IOException -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b9 A[Catch:{ IOException -> 0x02f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x2.b a(x2.a r32) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Iterable<w2.n> r3 = r0.f12926a
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            w2.n r4 = (w2.n) r4
            java.lang.String r5 = r4.g()
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0031
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r2.put(r5, r6)
            goto L_0x000f
        L_0x0031:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x000f
        L_0x003b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0048:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x0267
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r8 = r4.getValue()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r8.get(r7)
            w2.n r7 = (w2.n) r7
            v2.p r17 = v2.p.DEFAULT
            f3.a r8 = r1.f12190f
            long r8 = r8.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            f3.a r9 = r1.f12189e
            long r9 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            v2.k$a r10 = v2.k.a.ANDROID_FIREBASE
            java.lang.String r11 = "sdk-version"
            int r11 = r7.f(r11)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = "model"
            java.lang.String r20 = r7.a(r11)
            java.lang.String r11 = "hardware"
            java.lang.String r21 = r7.a(r11)
            java.lang.String r11 = "device"
            java.lang.String r22 = r7.a(r11)
            java.lang.String r11 = "product"
            java.lang.String r23 = r7.a(r11)
            java.lang.String r11 = "os-uild"
            java.lang.String r24 = r7.a(r11)
            java.lang.String r11 = "manufacturer"
            java.lang.String r25 = r7.a(r11)
            java.lang.String r11 = "fingerprint"
            java.lang.String r26 = r7.a(r11)
            java.lang.String r11 = "country"
            java.lang.String r28 = r7.a(r11)
            java.lang.String r11 = "locale"
            java.lang.String r27 = r7.a(r11)
            java.lang.String r11 = "mcc_mnc"
            java.lang.String r29 = r7.a(r11)
            java.lang.String r11 = "application_build"
            java.lang.String r30 = r7.a(r11)
            v2.c r7 = new v2.c
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            v2.e r13 = new v2.e
            r13.<init>(r10, r7)
            java.lang.Object r7 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x00e5 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00e5 }
            r15 = r6
            r14 = r7
            goto L_0x00ed
        L_0x00e5:
            java.lang.Object r7 = r4.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r14 = r6
            r15 = r7
        L_0x00ed:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00fc:
            boolean r7 = r4.hasNext()
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x022c
            java.lang.Object r7 = r4.next()
            w2.n r7 = (w2.n) r7
            w2.m r12 = r7.d()
            r18 = r2
            t2.b r2 = r12.f12716a
            r16 = r4
            t2.b r4 = new t2.b
            r19 = r11
            java.lang.String r11 = "proto"
            r4.<init>(r11)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x012f
            byte[] r2 = r12.f12717b
            v2.f$a r4 = new v2.f$a
            r4.<init>()
            r4.f12483d = r2
            goto L_0x0150
        L_0x012f:
            t2.b r4 = new t2.b
            java.lang.String r11 = "json"
            r4.<init>(r11)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x020c
            java.lang.String r2 = new java.lang.String
            byte[] r4 = r12.f12717b
            java.lang.String r11 = "UTF-8"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            r2.<init>(r4, r11)
            v2.f$a r4 = new v2.f$a
            r4.<init>()
            r4.f12484e = r2
        L_0x0150:
            long r11 = r7.e()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4.f12480a = r2
            long r11 = r7.h()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4.f12482c = r2
            java.util.Map r2 = r7.b()
            java.lang.String r11 = "tz-offset"
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0175
            r11 = 0
            goto L_0x017d
        L_0x0175:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r11 = r2.longValue()
        L_0x017d:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4.f12485f = r2
            java.lang.String r2 = "net-type"
            int r2 = r7.f(r2)
            android.util.SparseArray<v2.o$b> r11 = v2.o.b.f12501a
            java.lang.Object r2 = r11.get(r2)
            v2.o$b r2 = (v2.o.b) r2
            java.lang.String r11 = "mobile-subtype"
            int r11 = r7.f(r11)
            android.util.SparseArray<v2.o$a> r12 = v2.o.a.f12499a
            java.lang.Object r11 = r12.get(r11)
            v2.o$a r11 = (v2.o.a) r11
            v2.i r12 = new v2.i
            r12.<init>(r2, r11)
            r4.f12486g = r12
            java.lang.Integer r2 = r7.c()
            if (r2 == 0) goto L_0x01b2
            java.lang.Integer r2 = r7.c()
            r4.f12481b = r2
        L_0x01b2:
            java.lang.Long r2 = r4.f12480a
            if (r2 != 0) goto L_0x01b9
            java.lang.String r11 = " eventTimeMs"
            goto L_0x01bb
        L_0x01b9:
            r11 = r19
        L_0x01bb:
            java.lang.Long r2 = r4.f12482c
            if (r2 != 0) goto L_0x01c5
            java.lang.String r2 = " eventUptimeMs"
            java.lang.String r11 = com.ironsource.adapters.ironsource.a.g(r11, r2)
        L_0x01c5:
            java.lang.Long r2 = r4.f12485f
            if (r2 != 0) goto L_0x01cf
            java.lang.String r2 = " timezoneOffsetSeconds"
            java.lang.String r11 = com.ironsource.adapters.ironsource.a.g(r11, r2)
        L_0x01cf:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0202
            v2.f r2 = new v2.f
            java.lang.Long r7 = r4.f12480a
            long r20 = r7.longValue()
            java.lang.Integer r7 = r4.f12481b
            java.lang.Long r10 = r4.f12482c
            long r23 = r10.longValue()
            byte[] r10 = r4.f12483d
            java.lang.String r11 = r4.f12484e
            java.lang.Long r12 = r4.f12485f
            long r27 = r12.longValue()
            v2.o r4 = r4.f12486g
            r19 = r2
            r22 = r7
            r25 = r10
            r26 = r11
            r29 = r4
            r19.<init>(r20, r22, r23, r25, r26, r27, r29)
            r6.add(r2)
            goto L_0x0226
        L_0x0202:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = com.ironsource.adapters.ironsource.a.g(r10, r11)
            r0.<init>(r2)
            throw r0
        L_0x020c:
            java.lang.String r4 = a3.a.c(r5)
            r7 = 5
            boolean r7 = android.util.Log.isLoggable(r4, r7)
            if (r7 == 0) goto L_0x0226
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r10 = 0
            r7[r10] = r2
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r2 = java.lang.String.format(r2, r7)
            android.util.Log.w(r4, r2)
        L_0x0226:
            r4 = r16
            r2 = r18
            goto L_0x00fc
        L_0x022c:
            r18 = r2
            r19 = r11
            if (r8 != 0) goto L_0x0235
            java.lang.String r11 = " requestTimeMs"
            goto L_0x0237
        L_0x0235:
            r11 = r19
        L_0x0237:
            if (r9 != 0) goto L_0x023f
            java.lang.String r2 = " requestUptimeMs"
            java.lang.String r11 = com.ironsource.adapters.ironsource.a.g(r11, r2)
        L_0x023f:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x025d
            v2.g r2 = new v2.g
            long r4 = r8.longValue()
            long r11 = r9.longValue()
            r8 = r2
            r9 = r4
            r16 = r6
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)
            r3.add(r2)
            r2 = r18
            goto L_0x0048
        L_0x025d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = com.ironsource.adapters.ironsource.a.g(r10, r11)
            r0.<init>(r2)
            throw r0
        L_0x0267:
            r2 = 5
            v2.d r4 = new v2.d
            r4.<init>(r3)
            java.net.URL r3 = r1.f12188d
            byte[] r0 = r0.f12927b
            r7 = 3
            r8 = -1
            if (r0 == 0) goto L_0x028f
            u2.a r0 = u2.a.a(r0)     // Catch:{ IllegalArgumentException -> 0x0289 }
            java.lang.String r10 = r0.f12182b     // Catch:{ IllegalArgumentException -> 0x0289 }
            if (r10 == 0) goto L_0x027f
            goto L_0x0280
        L_0x027f:
            r10 = r6
        L_0x0280:
            java.lang.String r0 = r0.f12181a     // Catch:{ IllegalArgumentException -> 0x0289 }
            if (r0 == 0) goto L_0x0290
            java.net.URL r3 = c(r0)     // Catch:{ IllegalArgumentException -> 0x0289 }
            goto L_0x0290
        L_0x0289:
            x2.b r0 = new x2.b
            r0.<init>(r7, r8)
            return r0
        L_0x028f:
            r10 = r6
        L_0x0290:
            r11 = 2
            u2.d$a r0 = new u2.d$a     // Catch:{ IOException -> 0x02f2 }
            r0.<init>(r3, r4, r10)     // Catch:{ IOException -> 0x02f2 }
            u2.b r3 = new u2.b     // Catch:{ IOException -> 0x02f2 }
            r4 = 0
            r3.<init>(r4, r1)     // Catch:{ IOException -> 0x02f2 }
        L_0x029c:
            java.lang.Object r4 = r3.apply(r0)     // Catch:{ IOException -> 0x02f2 }
            r10 = r4
            u2.d$b r10 = (u2.d.b) r10     // Catch:{ IOException -> 0x02f2 }
            java.net.URL r12 = r10.f12196b     // Catch:{ IOException -> 0x02f2 }
            if (r12 == 0) goto L_0x02b9
            java.lang.String r13 = "Following redirect to: %s"
            a3.a.a(r12, r5, r13)     // Catch:{ IOException -> 0x02f2 }
            java.net.URL r10 = r10.f12196b     // Catch:{ IOException -> 0x02f2 }
            u2.d$a r12 = new u2.d$a     // Catch:{ IOException -> 0x02f2 }
            v2.j r13 = r0.f12193b     // Catch:{ IOException -> 0x02f2 }
            java.lang.String r0 = r0.f12194c     // Catch:{ IOException -> 0x02f2 }
            r12.<init>(r10, r13, r0)     // Catch:{ IOException -> 0x02f2 }
            r0 = r12
            goto L_0x02ba
        L_0x02b9:
            r0 = r6
        L_0x02ba:
            if (r0 == 0) goto L_0x02c1
            int r2 = r2 + -1
            r10 = 1
            if (r2 >= r10) goto L_0x029c
        L_0x02c1:
            u2.d$b r4 = (u2.d.b) r4     // Catch:{ IOException -> 0x02f2 }
            int r0 = r4.f12195a     // Catch:{ IOException -> 0x02f2 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x02d2
            long r2 = r4.f12197c     // Catch:{ IOException -> 0x02f2 }
            x2.b r0 = new x2.b     // Catch:{ IOException -> 0x02f2 }
            r4 = 1
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x02f2 }
            return r0
        L_0x02d2:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L_0x02ec
            r2 = 404(0x194, float:5.66E-43)
            if (r0 != r2) goto L_0x02db
            goto L_0x02ec
        L_0x02db:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 != r2) goto L_0x02e6
            x2.b r0 = new x2.b     // Catch:{ IOException -> 0x02f2 }
            r2 = 4
            r0.<init>(r2, r8)     // Catch:{ IOException -> 0x02f2 }
            return r0
        L_0x02e6:
            x2.b r0 = new x2.b     // Catch:{ IOException -> 0x02f2 }
            r0.<init>(r7, r8)     // Catch:{ IOException -> 0x02f2 }
            return r0
        L_0x02ec:
            x2.b r0 = new x2.b     // Catch:{ IOException -> 0x02f2 }
            r0.<init>(r11, r8)     // Catch:{ IOException -> 0x02f2 }
            return r0
        L_0x02f2:
            r0 = move-exception
            java.lang.String r2 = "Could not make request to the backend"
            a3.a.b(r5, r2, r0)
            x2.b r0 = new x2.b
            r0.<init>(r11, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.a(x2.a):x2.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        if (v2.o.a.f12499a.get(r0) != null) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w2.h b(w2.n r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.f12186b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            w2.h$a r7 = r7.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.f12698f
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x0117
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "model"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r2 = "hardware"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r2 = "device"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r2 = "product"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.ID
            java.lang.String r2 = "os-uild"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "manufacturer"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r2 = "fingerprint"
            r7.a(r2, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f12698f
            if (r4 == 0) goto L_0x0111
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x0076
            android.util.SparseArray<v2.o$b> r2 = v2.o.b.f12501a
            r2 = r1
            goto L_0x007a
        L_0x0076:
            int r2 = r0.getType()
        L_0x007a:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f12698f
            if (r4 == 0) goto L_0x010b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "net-type"
            r4.put(r5, r2)
            r2 = 0
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<v2.o$a> r0 = v2.o.a.f12499a
            goto L_0x00a3
        L_0x008d:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x0098
            android.util.SparseArray<v2.o$a> r0 = v2.o.a.f12499a
            r0 = 100
            goto L_0x00a4
        L_0x0098:
            android.util.SparseArray<v2.o$a> r4 = v2.o.a.f12499a
            java.lang.Object r4 = r4.get(r0)
            v2.o$a r4 = (v2.o.a) r4
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f12698f
            if (r4 == 0) goto L_0x0105
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.a(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.a(r3, r0)
            android.content.Context r0 = r6.f12187c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.lang.String r3 = "mcc_mnc"
            r7.a(r3, r0)
            android.content.Context r0 = r6.f12187c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ef }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ef }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00ef }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00ef }
            goto L_0x00f7
        L_0x00ef:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            a3.a.b(r2, r3, r0)
        L_0x00f7:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r7.a(r1, r0)
            w2.h r7 = r7.b()
            return r7
        L_0x0105:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x010b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0111:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0117:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.b(w2.n):w2.h");
    }
}
