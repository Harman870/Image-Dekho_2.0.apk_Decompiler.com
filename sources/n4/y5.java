package n4;

import android.net.Uri;

public final class y5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10331a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f10332b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10333c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f10334d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z5 f10335e;

    public y5(z5 z5Var, boolean z9, Uri uri, String str, String str2) {
        this.f10335e = z5Var;
        this.f10331a = z9;
        this.f10332b = uri;
        this.f10333c = str;
        this.f10334d = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac A[SYNTHETIC, Splitter:B:32:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e A[Catch:{ RuntimeException -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110 A[Catch:{ RuntimeException -> 0x01b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            n4.z5 r2 = r1.f10335e
            boolean r0 = r1.f10331a
            android.net.Uri r3 = r1.f10332b
            java.lang.String r4 = r1.f10333c
            java.lang.String r8 = r1.f10334d
            n4.a6 r5 = r2.f10349a
            r5.g()
            n4.a6 r5 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r5 = r5.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.d8 r5 = r5.x()     // Catch:{ RuntimeException -> 0x01b5 }
            j4.zc r6 = j4.zc.f8596b     // Catch:{ RuntimeException -> 0x01b5 }
            j4.m5 r7 = r6.f8597a     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.Object r7 = r7.zza()     // Catch:{ RuntimeException -> 0x01b5 }
            j4.ad r7 = (j4.ad) r7     // Catch:{ RuntimeException -> 0x01b5 }
            r7.zza()     // Catch:{ RuntimeException -> 0x01b5 }
            n4.a6 r7 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r7 = r7.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.f r7 = r7.f9992g     // Catch:{ RuntimeException -> 0x01b5 }
            n4.v2 r9 = n4.w2.p0     // Catch:{ RuntimeException -> 0x01b5 }
            r10 = 0
            boolean r7 = r7.o(r10, r9)     // Catch:{ RuntimeException -> 0x01b5 }
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.String r12 = "Activity created with data 'referrer' without required params"
            java.lang.String r13 = "utm_medium"
            java.lang.String r14 = "_cis"
            java.lang.String r15 = "utm_source"
            java.lang.String r10 = "utm_campaign"
            java.lang.String r1 = "gclid"
            r16 = r4
            r4 = 1
            if (r11 == 0) goto L_0x0049
            goto L_0x0091
        L_0x0049:
            boolean r11 = r8.contains(r1)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            boolean r11 = r8.contains(r10)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            boolean r11 = r8.contains(r15)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            boolean r11 = r8.contains(r13)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            java.lang.String r11 = "utm_id"
            boolean r11 = r8.contains(r11)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            java.lang.String r11 = "dclid"
            boolean r11 = r8.contains(r11)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            java.lang.String r11 = "srsltid"
            boolean r11 = r8.contains(r11)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r11 != 0) goto L_0x0093
            if (r7 == 0) goto L_0x0086
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r8.contains(r7)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r7 != 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r7 = r4
            goto L_0x0093
        L_0x0086:
            n4.n4 r5 = r5.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.i3 r5 = r5.a()     // Catch:{ RuntimeException -> 0x01b5 }
            n4.g3 r5 = r5.f9834m     // Catch:{ RuntimeException -> 0x01b5 }
            r5.a(r12)     // Catch:{ RuntimeException -> 0x01b5 }
        L_0x0091:
            r5 = 0
            goto L_0x00a8
        L_0x0093:
            java.lang.String r11 = "https://google.com/search?"
            java.lang.String r11 = r11.concat(r8)     // Catch:{ RuntimeException -> 0x01b5 }
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ RuntimeException -> 0x01b5 }
            android.os.Bundle r5 = r5.k0(r7, r11)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r5 == 0) goto L_0x00a8
            java.lang.String r7 = "referrer"
            r5.putString(r14, r7)     // Catch:{ RuntimeException -> 0x01b5 }
        L_0x00a8:
            java.lang.String r7 = "_cmp"
            if (r0 == 0) goto L_0x0106
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.d8 r0 = r0.x()     // Catch:{ RuntimeException -> 0x01b5 }
            j4.m5 r6 = r6.f8597a     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.Object r6 = r6.zza()     // Catch:{ RuntimeException -> 0x01b5 }
            j4.ad r6 = (j4.ad) r6     // Catch:{ RuntimeException -> 0x01b5 }
            r6.zza()     // Catch:{ RuntimeException -> 0x01b5 }
            n4.a6 r6 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r6 = r6.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.f r6 = r6.f9992g     // Catch:{ RuntimeException -> 0x01b5 }
            r11 = 0
            boolean r6 = r6.o(r11, r9)     // Catch:{ RuntimeException -> 0x01b5 }
            android.os.Bundle r0 = r0.k0(r6, r3)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 == 0) goto L_0x0106
            java.lang.String r3 = "intent"
            r0.putString(r14, r3)     // Catch:{ RuntimeException -> 0x01b5 }
            boolean r3 = r0.containsKey(r1)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r3 != 0) goto L_0x00f7
            if (r5 == 0) goto L_0x00f7
            boolean r3 = r5.containsKey(r1)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = "_cer"
            java.lang.String r6 = "gclid=%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ RuntimeException -> 0x01b5 }
            r9 = 0
            java.lang.String r11 = r5.getString(r1)     // Catch:{ RuntimeException -> 0x01b5 }
            r4[r9] = r11     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.String r4 = java.lang.String.format(r6, r4)     // Catch:{ RuntimeException -> 0x01b5 }
            r0.putString(r3, r4)     // Catch:{ RuntimeException -> 0x01b5 }
        L_0x00f7:
            n4.a6 r3 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            r4 = r16
            r3.n(r4, r7, r0)     // Catch:{ RuntimeException -> 0x01b5 }
            n4.a6 r3 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.i8 r3 = r3.f9609l     // Catch:{ RuntimeException -> 0x01b5 }
            r3.a(r4, r0)     // Catch:{ RuntimeException -> 0x01b5 }
            goto L_0x0108
        L_0x0106:
            r4 = r16
        L_0x0108:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 == 0) goto L_0x0110
            goto L_0x01a6
        L_0x0110:
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.i3 r0 = r0.a()     // Catch:{ RuntimeException -> 0x01b5 }
            n4.g3 r0 = r0.f9834m     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.String r3 = "Activity created with referrer"
            r0.b(r3, r8)     // Catch:{ RuntimeException -> 0x01b5 }
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.f r0 = r0.f9992g     // Catch:{ RuntimeException -> 0x01b5 }
            n4.v2 r3 = n4.w2.Z     // Catch:{ RuntimeException -> 0x01b5 }
            r6 = 0
            boolean r0 = r0.o(r6, r3)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 == 0) goto L_0x0163
            if (r5 == 0) goto L_0x013d
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            r0.n(r4, r7, r5)     // Catch:{ RuntimeException -> 0x01b5 }
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.i8 r0 = r0.f9609l     // Catch:{ RuntimeException -> 0x01b5 }
            r0.a(r4, r5)     // Catch:{ RuntimeException -> 0x01b5 }
            goto L_0x014c
        L_0x013d:
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.i3 r0 = r0.a()     // Catch:{ RuntimeException -> 0x01b5 }
            n4.g3 r0 = r0.f9834m     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.b(r1, r8)     // Catch:{ RuntimeException -> 0x01b5 }
        L_0x014c:
            n4.a6 r9 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            r12 = 0
            n4.n4 r0 = r9.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            y3.a r0 = r0.f9998n     // Catch:{ RuntimeException -> 0x01b5 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x01b5 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.String r10 = "auto"
            java.lang.String r11 = "_ldl"
            r13 = 1
            r9.x(r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x01b5 }
            return
        L_0x0163:
            boolean r0 = r8.contains(r1)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r8.contains(r10)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 != 0) goto L_0x018b
            boolean r0 = r8.contains(r15)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 != 0) goto L_0x018b
            boolean r0 = r8.contains(r13)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 != 0) goto L_0x018b
            java.lang.String r0 = "utm_term"
            boolean r0 = r8.contains(r0)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 != 0) goto L_0x018b
            java.lang.String r0 = "utm_content"
            boolean r0 = r8.contains(r0)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 == 0) goto L_0x01a7
        L_0x018b:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ RuntimeException -> 0x01b5 }
            if (r0 != 0) goto L_0x01a6
            n4.a6 r5 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r0 = r5.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            y3.a r0 = r0.f9998n     // Catch:{ RuntimeException -> 0x01b5 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x01b5 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x01b5 }
            java.lang.String r6 = "auto"
            java.lang.String r7 = "_ldl"
            r9 = 1
            r5.x(r6, r7, r8, r9, r10)     // Catch:{ RuntimeException -> 0x01b5 }
        L_0x01a6:
            return
        L_0x01a7:
            n4.a6 r0 = r2.f10349a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RuntimeException -> 0x01b5 }
            n4.i3 r0 = r0.a()     // Catch:{ RuntimeException -> 0x01b5 }
            n4.g3 r0 = r0.f9834m     // Catch:{ RuntimeException -> 0x01b5 }
            r0.a(r12)     // Catch:{ RuntimeException -> 0x01b5 }
            return
        L_0x01b5:
            r0 = move-exception
            n4.a6 r1 = r2.f10349a
            n4.n4 r1 = r1.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9828f
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.y5.run():void");
    }
}
