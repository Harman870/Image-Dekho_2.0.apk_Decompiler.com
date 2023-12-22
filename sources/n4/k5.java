package n4;

public final /* synthetic */ class k5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a6 f9891a;

    public /* synthetic */ k5(a6 a6Var) {
        this.f9891a = a6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            n4.a6 r0 = r1.f9891a
            r0.g()
            n4.n4 r2 = r0.f9600a
            n4.w3 r2 = r2.r()
            n4.r3 r2 = r2.f10267r
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x022a
            n4.n4 r2 = r0.f9600a
            n4.w3 r2 = r2.r()
            n4.t3 r2 = r2.f10268s
            long r2 = r2.a()
            n4.n4 r4 = r0.f9600a
            n4.w3 r4 = r4.r()
            n4.t3 r4 = r4.f10268s
            r5 = 1
            long r5 = r5 + r2
            r4.b(r5)
            n4.n4 r4 = r0.f9600a
            r4.getClass()
            r4 = 5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L_0x0054
            n4.n4 r2 = r0.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9831i
            java.lang.String r4 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r2.a(r4)
            n4.n4 r0 = r0.f9600a
            n4.w3 r0 = r0.r()
            n4.r3 r0 = r0.f10267r
            r0.a(r3)
            return
        L_0x0054:
            n4.n4 r2 = r0.f9600a
            n4.m4 r0 = r2.d()
            r0.g()
            n4.e6 r0 = r2.f10002r
            n4.n4.j(r0)
            n4.e6 r0 = r2.f10002r
            n4.n4.j(r0)
            n4.a3 r0 = r2.o()
            java.lang.String r4 = r0.l()
            n4.w3 r5 = r2.r()
            r5.g()
            j4.sa r0 = j4.sa.f8465b
            j4.m5 r0 = r0.f8466a
            java.lang.Object r0 = r0.zza()
            j4.ta r0 = (j4.ta) r0
            r0.zza()
            n4.n4 r0 = r5.f9600a
            n4.f r0 = r0.f9992g
            n4.v2 r6 = n4.w2.A0
            r7 = 0
            boolean r0 = r0.o(r7, r6)
            java.lang.String r6 = ""
            r8 = 0
            if (r0 == 0) goto L_0x00a8
            n4.f5 r0 = r5.m()
            n4.e5 r9 = n4.e5.AD_STORAGE
            boolean r0 = r0.f(r9)
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0.<init>(r6, r5)
            goto L_0x0114
        L_0x00a8:
            n4.n4 r0 = r5.f9600a
            y3.a r0 = r0.f9998n
            r0.getClass()
            long r9 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = r5.f10257g
            if (r0 == 0) goto L_0x00cb
            long r11 = r5.f10259i
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x00be
            goto L_0x00cb
        L_0x00be:
            android.util.Pair r6 = new android.util.Pair
            boolean r5 = r5.f10258h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.<init>(r0, r5)
            r0 = r6
            goto L_0x0114
        L_0x00cb:
            n4.n4 r0 = r5.f9600a
            n4.f r0 = r0.f9992g
            n4.v2 r11 = n4.w2.f10207b
            long r11 = r0.l(r4, r11)
            long r11 = r11 + r9
            r5.f10259i = r11
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r3)
            n4.n4 r0 = r5.f9600a     // Catch:{ Exception -> 0x00f4 }
            android.content.Context r0 = r0.f9986a     // Catch:{ Exception -> 0x00f4 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ Exception -> 0x00f4 }
            r5.f10257g = r6     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r9 = r0.getId()     // Catch:{ Exception -> 0x00f4 }
            if (r9 == 0) goto L_0x00ed
            r5.f10257g = r9     // Catch:{ Exception -> 0x00f4 }
        L_0x00ed:
            boolean r0 = r0.isLimitAdTrackingEnabled()     // Catch:{ Exception -> 0x00f4 }
            r5.f10258h = r0     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0104
        L_0x00f4:
            r0 = move-exception
            n4.n4 r9 = r5.f9600a
            n4.i3 r9 = r9.a()
            n4.g3 r9 = r9.f9834m
            java.lang.String r10 = "Unable to get advertising id"
            r9.b(r10, r0)
            r5.f10257g = r6
        L_0x0104:
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r8)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r6 = r5.f10257g
            boolean r5 = r5.f10258h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.<init>(r6, r5)
        L_0x0114:
            n4.f r5 = r2.f9992g
            java.lang.String r6 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r5 = r5.n(r6)
            if (r5 == 0) goto L_0x0127
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r5 = r8
            goto L_0x0128
        L_0x0127:
            r5 = r3
        L_0x0128:
            if (r5 == 0) goto L_0x021e
            java.lang.Object r5 = r0.second
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x021e
            java.lang.Object r5 = r0.first
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0140
            goto L_0x021e
        L_0x0140:
            n4.e6 r5 = r2.f10002r
            n4.n4.j(r5)
            n4.e6 r5 = r2.f10002r
            r5.i()
            n4.n4 r5 = r5.f9600a
            android.content.Context r5 = r5.f9986a
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            if (r5 == 0) goto L_0x015d
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x015d }
            goto L_0x015e
        L_0x015d:
            r5 = r7
        L_0x015e:
            if (r5 == 0) goto L_0x0215
            boolean r5 = r5.isConnected()
            if (r5 == 0) goto L_0x0215
            n4.d8 r5 = r2.x()
            n4.a3 r6 = r2.o()
            n4.n4 r6 = r6.f9600a
            n4.f r6 = r6.f9992g
            r6.k()
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            n4.w3 r6 = r2.r()
            n4.t3 r6 = r6.f10268s
            long r9 = r6.a()
            r11 = -1
            long r9 = r9 + r11
            r5.getClass()
            r3.o.e(r0)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r3.o.e(r4)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r6 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r12 = "v%s.%s"
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r15 = 79000(0x13498, double:3.9031E-319)
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r14[r8] = r15     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r15 = r5.h0()     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r14[r3] = r15     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r12 = java.lang.String.format(r12, r14)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r11[r8] = r12     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r11[r3] = r0     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r11[r13] = r4     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r11[r0] = r3     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r0 = java.lang.String.format(r6, r11)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            n4.n4 r3 = r5.f9600a     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            n4.f r3 = r3.f9992g     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r6 = "debug.deferred.deeplink"
            java.lang.String r3 = r3.h(r6)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            boolean r3 = r4.equals(r3)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r3 == 0) goto L_0x01d7
            java.lang.String r3 = "&ddl_test=1"
            java.lang.String r0 = r0.concat(r3)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
        L_0x01d7:
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r3.<init>(r0)     // Catch:{ MalformedURLException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r7 = r3
            goto L_0x01f2
        L_0x01de:
            r0 = move-exception
            goto L_0x01e1
        L_0x01e0:
            r0 = move-exception
        L_0x01e1:
            n4.n4 r3 = r5.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.f9828f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r3.b(r5, r0)
        L_0x01f2:
            if (r7 == 0) goto L_0x0229
            n4.e6 r0 = r2.f10002r
            n4.n4.j(r0)
            n4.e6 r0 = r2.f10002r
            u1.t r3 = new u1.t
            r3.<init>((java.lang.Object) r2)
            r0.g()
            r0.i()
            n4.n4 r2 = r0.f9600a
            n4.m4 r2 = r2.d()
            n4.d6 r5 = new n4.d6
            r5.<init>(r0, r4, r7, r3)
            r2.n(r5)
            goto L_0x0229
        L_0x0215:
            n4.i3 r0 = r2.a()
            n4.g3 r0 = r0.f9831i
            java.lang.String r2 = "Network is not available for Deferred Deep Link request. Skipping"
            goto L_0x0226
        L_0x021e:
            n4.i3 r0 = r2.a()
            n4.g3 r0 = r0.f9834m
            java.lang.String r2 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
        L_0x0226:
            r0.a(r2)
        L_0x0229:
            return
        L_0x022a:
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9834m
            java.lang.String r2 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.k5.run():void");
    }
}
