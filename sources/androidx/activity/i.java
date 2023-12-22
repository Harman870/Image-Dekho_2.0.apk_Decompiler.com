package androidx.activity;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f273a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f274b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f273a = i10;
        this.f274b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013d, code lost:
        if (r4 != null) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.f273a
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0165;
                case 1: goto L_0x00de;
                case 2: goto L_0x00d6;
                case 3: goto L_0x0020;
                case 4: goto L_0x0018;
                case 5: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x016d
        L_0x0009:
            java.lang.Object r0 = r13.f274b
            c3.t r0 = (c3.t) r0
            e3.b r1 = r0.f2441d
            c3.s r2 = new c3.s
            r2.<init>(r0)
            r1.c(r2)
            return
        L_0x0018:
            java.lang.Object r0 = r13.f274b
            androidx.emoji2.text.l$b r0 = (androidx.emoji2.text.l.b) r0
            r0.c()
            return
        L_0x0020:
            java.lang.Object r0 = r13.f274b
            android.app.Activity r0 = (android.app.Activity) r0
            int r3 = x.a.f12762c
            boolean r3 = r0.isFinishing()
            if (r3 != 0) goto L_0x00d5
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            r5 = 0
            if (r3 < r4) goto L_0x003a
            java.lang.Class<?> r2 = x.e.f12769a
            r0.recreate()
            goto L_0x00d0
        L_0x003a:
            java.lang.Class<?> r4 = x.e.f12769a
            r4 = 27
            r6 = 26
            if (r3 == r6) goto L_0x0047
            if (r3 != r4) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r7 = r5
            goto L_0x0048
        L_0x0047:
            r7 = r1
        L_0x0048:
            if (r7 == 0) goto L_0x0050
            java.lang.reflect.Method r7 = x.e.f12774f
            if (r7 != 0) goto L_0x0050
            goto L_0x00cf
        L_0x0050:
            java.lang.reflect.Method r7 = x.e.f12773e
            if (r7 != 0) goto L_0x005a
            java.lang.reflect.Method r7 = x.e.f12772d
            if (r7 != 0) goto L_0x005a
            goto L_0x00cf
        L_0x005a:
            java.lang.reflect.Field r7 = x.e.f12771c     // Catch:{ all -> 0x00cf }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x00cf }
            if (r7 != 0) goto L_0x0064
            goto L_0x00cf
        L_0x0064:
            java.lang.reflect.Field r8 = x.e.f12770b     // Catch:{ all -> 0x00cf }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x00cf }
            if (r8 != 0) goto L_0x006d
            goto L_0x00cf
        L_0x006d:
            android.app.Application r9 = r0.getApplication()     // Catch:{ all -> 0x00cf }
            x.e$a r10 = new x.e$a     // Catch:{ all -> 0x00cf }
            r10.<init>(r0)     // Catch:{ all -> 0x00cf }
            r9.registerActivityLifecycleCallbacks(r10)     // Catch:{ all -> 0x00cf }
            android.os.Handler r11 = x.e.f12775g     // Catch:{ all -> 0x00cf }
            x.b r12 = new x.b     // Catch:{ all -> 0x00cf }
            r12.<init>(r10, r7)     // Catch:{ all -> 0x00cf }
            r11.post(r12)     // Catch:{ all -> 0x00cf }
            if (r3 == r6) goto L_0x008a
            if (r3 != r4) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r3 = r5
            goto L_0x008b
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 == 0) goto L_0x00b7
            java.lang.reflect.Method r3 = x.e.f12774f     // Catch:{ all -> 0x00c3 }
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00c3 }
            r4[r5] = r7     // Catch:{ all -> 0x00c3 }
            r4[r1] = r2     // Catch:{ all -> 0x00c3 }
            r6 = 2
            r4[r6] = r2     // Catch:{ all -> 0x00c3 }
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            r4[r6] = r7     // Catch:{ all -> 0x00c3 }
            r6 = 4
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00c3 }
            r4[r6] = r7     // Catch:{ all -> 0x00c3 }
            r6 = 5
            r4[r6] = r2     // Catch:{ all -> 0x00c3 }
            r6 = 6
            r4[r6] = r2     // Catch:{ all -> 0x00c3 }
            r2 = 7
            r4[r2] = r7     // Catch:{ all -> 0x00c3 }
            r2 = 8
            r4[r2] = r7     // Catch:{ all -> 0x00c3 }
            r3.invoke(r8, r4)     // Catch:{ all -> 0x00c3 }
            goto L_0x00ba
        L_0x00b7:
            r0.recreate()     // Catch:{ all -> 0x00c3 }
        L_0x00ba:
            x.c r2 = new x.c     // Catch:{ all -> 0x00cf }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x00cf }
            r11.post(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x00d0
        L_0x00c3:
            r1 = move-exception
            android.os.Handler r2 = x.e.f12775g     // Catch:{ all -> 0x00cf }
            x.c r3 = new x.c     // Catch:{ all -> 0x00cf }
            r3.<init>(r9, r10)     // Catch:{ all -> 0x00cf }
            r2.post(r3)     // Catch:{ all -> 0x00cf }
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r1 = r5
        L_0x00d0:
            if (r1 != 0) goto L_0x00d5
            r0.recreate()
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.Object r0 = r13.f274b
            androidx.appcompat.widget.o1 r0 = (androidx.appcompat.widget.o1) r0
            r0.a()
            return
        L_0x00de:
            java.lang.Object r0 = r13.f274b
            android.content.Context r0 = (android.content.Context) r0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L_0x0162
            d.t$a r3 = d.h.f5872a
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r0, r4)
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L_0x0162
            boolean r4 = d0.a.a()
            java.lang.String r5 = "locale"
            if (r4 == 0) goto L_0x013b
            m.d<java.lang.ref.WeakReference<d.h>> r4 = d.h.f5878g
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            r6 = r4
            m.g$a r6 = (m.g.a) r6
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x012a
            java.lang.Object r6 = r6.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            d.h r6 = (d.h) r6
            if (r6 == 0) goto L_0x0109
            android.content.Context r6 = r6.g()
            if (r6 == 0) goto L_0x0109
            java.lang.Object r2 = r6.getSystemService(r5)
        L_0x012a:
            if (r2 == 0) goto L_0x0140
            android.os.LocaleList r2 = d.h.b.a(r2)
            d0.f r4 = new d0.f
            d0.h r6 = new d0.h
            r6.<init>(r2)
            r4.<init>(r6)
            goto L_0x0142
        L_0x013b:
            d0.f r4 = d.h.f5874c
            if (r4 == 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            d0.f r4 = d0.f.f6031b
        L_0x0142:
            d0.g r2 = r4.f6032a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x015b
            java.lang.String r2 = d.t.b(r0)
            java.lang.Object r4 = r0.getSystemService(r5)
            if (r4 == 0) goto L_0x015b
            android.os.LocaleList r2 = d.h.a.a(r2)
            d.h.b.b(r4, r2)
        L_0x015b:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L_0x0162:
            d.h.f5877f = r1
            return
        L_0x0165:
            java.lang.Object r0 = r13.f274b
            androidx.activity.j r0 = (androidx.activity.j) r0
            androidx.activity.j.a(r0)
            return
        L_0x016d:
            java.lang.Object r0 = r13.f274b
            com.ironsource.mediationsdk.testSuite.TestSuiteActivity r0 = (com.ironsource.mediationsdk.testSuite.TestSuiteActivity) r0
            int r1 = com.ironsource.mediationsdk.testSuite.TestSuiteActivity.f4887d
            java.lang.String r1 = "this$0"
            x8.f.f(r0, r1)
            com.ironsource.mediationsdk.testSuite.e.b r1 = r0.f4889b
            java.lang.String r3 = "mWebViewWrapper"
            if (r1 == 0) goto L_0x01c5
            android.webkit.WebView r1 = r1.f4910c
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L_0x01c4
            android.widget.RelativeLayout r1 = r0.f4888a
            java.lang.String r4 = "mContainer"
            if (r1 == 0) goto L_0x01c0
            com.ironsource.mediationsdk.testSuite.e.b r5 = r0.f4889b
            if (r5 == 0) goto L_0x01bc
            android.webkit.WebView r5 = r5.f4909b
            r1.removeView(r5)
            android.widget.RelativeLayout r1 = r0.f4888a
            if (r1 == 0) goto L_0x01b8
            com.ironsource.mediationsdk.testSuite.e.b r4 = r0.f4889b
            if (r4 == 0) goto L_0x01b4
            android.webkit.WebView r4 = r4.f4910c
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r1.addView(r4, r5)
            com.ironsource.mediationsdk.testSuite.e.b r0 = r0.f4889b
            if (r0 == 0) goto L_0x01b0
            r0.a()
            goto L_0x01c4
        L_0x01b0:
            x8.f.k(r3)
            throw r2
        L_0x01b4:
            x8.f.k(r3)
            throw r2
        L_0x01b8:
            x8.f.k(r4)
            throw r2
        L_0x01bc:
            x8.f.k(r3)
            throw r2
        L_0x01c0:
            x8.f.k(r4)
            throw r2
        L_0x01c4:
            return
        L_0x01c5:
            x8.f.k(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.i.run():void");
    }
}
