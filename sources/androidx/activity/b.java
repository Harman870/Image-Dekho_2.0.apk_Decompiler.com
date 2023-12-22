package androidx.activity;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f261a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f262b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f261a = i10;
        this.f262b = obj;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f261a
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x0020;
                case 2: goto L_0x0013;
                case 3: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0067
        L_0x0006:
            java.lang.Object r0 = r14.f262b
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            r0.call()     // Catch:{ Exception -> 0x000e }
            goto L_0x0012
        L_0x000e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r14.f262b
            com.ironsource.mediationsdk.testSuite.c.a r0 = (com.ironsource.mediationsdk.testSuite.c.a) r0
            java.lang.String r1 = "$uiLifeCycleListener"
            x8.f.f(r0, r1)
            r0.onUIReady()
            return
        L_0x0020:
            java.lang.Object r0 = r14.f262b
            a7.e0 r0 = (a7.e0) r0
            java.util.ArrayDeque<java.lang.String> r1 = r0.f118d
            monitor-enter(r1)
            android.content.SharedPreferences r2 = r0.f115a     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = r0.f116b     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r4.<init>()     // Catch:{ all -> 0x005c }
            java.util.ArrayDeque<java.lang.String> r5 = r0.f118d     // Catch:{ all -> 0x005c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005c }
        L_0x003a:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x005c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x005c }
            r4.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r6 = r0.f117c     // Catch:{ all -> 0x005c }
            r4.append(r6)     // Catch:{ all -> 0x005c }
            goto L_0x003a
        L_0x004f:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)     // Catch:{ all -> 0x005c }
            r0.commit()     // Catch:{ all -> 0x005c }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            java.lang.Object r0 = r14.f262b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateOptionsMenu()
            return
        L_0x0067:
            java.lang.Object r0 = r14.f262b
            m9.f r0 = (m9.f) r0
            java.util.concurrent.ThreadPoolExecutor r1 = m9.f.f9421g
            r0.getClass()
        L_0x0070:
            long r1 = java.lang.System.nanoTime()
            monitor-enter(r0)
            java.util.ArrayDeque r3 = r0.f9425d     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00e8 }
            r4 = 0
            r5 = 0
            r6 = -9223372036854775808
            r8 = r4
            r9 = r8
        L_0x0081:
            boolean r10 = r3.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r10 == 0) goto L_0x00a3
            java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x00e8 }
            m9.e r10 = (m9.e) r10     // Catch:{ all -> 0x00e8 }
            int r11 = r0.b(r10, r1)     // Catch:{ all -> 0x00e8 }
            if (r11 <= 0) goto L_0x0096
            int r9 = r9 + 1
            goto L_0x0081
        L_0x0096:
            int r8 = r8 + 1
            long r11 = r10.f9420q     // Catch:{ all -> 0x00e8 }
            long r11 = r1 - r11
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x0081
            r5 = r10
            r6 = r11
            goto L_0x0081
        L_0x00a3:
            long r1 = r0.f9423b     // Catch:{ all -> 0x00e8 }
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r10 = -1
            r12 = 0
            if (r3 >= 0) goto L_0x00c0
            int r3 = r0.f9422a     // Catch:{ all -> 0x00e8 }
            if (r8 <= r3) goto L_0x00b2
            goto L_0x00c0
        L_0x00b2:
            if (r8 <= 0) goto L_0x00b7
            long r1 = r1 - r6
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00cc
        L_0x00b7:
            if (r9 <= 0) goto L_0x00bb
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00cc
        L_0x00bb:
            r0.f9427f = r4     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            r1 = r10
            goto L_0x00cc
        L_0x00c0:
            java.util.ArrayDeque r1 = r0.f9425d     // Catch:{ all -> 0x00e8 }
            r1.remove(r5)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            java.net.Socket r1 = r5.f9409e
            k9.e.d(r1)
            r1 = r12
        L_0x00cc:
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00d1
            return
        L_0x00d1:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0070
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r1 / r3
            long r3 = r3 * r5
            long r1 = r1 - r3
            monitor-enter(r0)
            int r1 = (int) r1
            r0.wait(r5, r1)     // Catch:{ InterruptedException -> 0x00e4 }
            goto L_0x00e4
        L_0x00e2:
            r1 = move-exception
            goto L_0x00e6
        L_0x00e4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x0070
        L_0x00e6:
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            throw r1
        L_0x00e8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.run():void");
    }
}
