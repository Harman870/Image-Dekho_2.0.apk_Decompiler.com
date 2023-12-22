package q3;

public final class a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11198b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11199c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f11200d;

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, int i10) {
        this.f11197a = i10;
        this.f11200d = obj;
        this.f11198b = obj2;
        this.f11199c = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: j4.r0} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f11197a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0186;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x01e2
        L_0x0008:
            java.lang.Object r0 = r11.f11200d
            n4.z4 r0 = (n4.z4) r0
            java.lang.Object r2 = r11.f11198b
            n4.r r2 = (n4.r) r2
            r0.getClass()
            java.lang.String r3 = r2.f10085a
            java.lang.String r4 = "_cmp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0064
            n4.p r3 = r2.f10086b
            if (r3 == 0) goto L_0x0064
            android.os.Bundle r3 = r3.f10048a
            int r3 = r3.size()
            if (r3 != 0) goto L_0x002a
            goto L_0x0064
        L_0x002a:
            n4.p r3 = r2.f10086b
            java.lang.String r4 = "_cis"
            android.os.Bundle r3 = r3.f10048a
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "referrer broadcast"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "referrer API"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0064
        L_0x0044:
            n4.w7 r0 = r0.f10346a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9833l
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = "Event has been filtered "
            r0.b(r4, r3)
            n4.r r0 = new n4.r
            n4.p r7 = r2.f10086b
            java.lang.String r8 = r2.f10087c
            long r9 = r2.f10088d
            java.lang.String r6 = "_cmpx"
            r5 = r0
            r5.<init>(r6, r7, r8, r9)
            r2 = r0
        L_0x0064:
            java.lang.Object r0 = r11.f11200d
            n4.z4 r0 = (n4.z4) r0
            java.lang.Object r3 = r11.f11199c
            n4.g8 r3 = (n4.g8) r3
            n4.w7 r4 = r0.f10346a
            n4.h4 r4 = r4.f10282a
            n4.w7.H(r4)
            java.lang.String r5 = r3.f9768a
            boolean r4 = r4.r(r5)
            if (r4 != 0) goto L_0x007d
            goto L_0x017b
        L_0x007d:
            n4.w7 r4 = r0.f10346a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9835n
            java.lang.String r5 = r3.f9768a
            java.lang.String r6 = "EES config found for"
            r4.b(r6, r5)
            n4.w7 r4 = r0.f10346a
            n4.h4 r4 = r4.f10282a
            n4.w7.H(r4)
            java.lang.String r5 = r3.f9768a
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x009c
            goto L_0x00a4
        L_0x009c:
            n4.g4 r1 = r4.f9802j
            java.lang.Object r1 = r1.b(r5)
            j4.r0 r1 = (j4.r0) r1
        L_0x00a4:
            if (r1 == 0) goto L_0x016c
            n4.w7 r4 = r0.f10346a     // Catch:{ m1 -> 0x014e }
            n4.y7 r4 = r4.f10288g     // Catch:{ m1 -> 0x014e }
            n4.w7.H(r4)     // Catch:{ m1 -> 0x014e }
            n4.p r4 = r2.f10086b     // Catch:{ m1 -> 0x014e }
            android.os.Bundle r4 = r4.x()     // Catch:{ m1 -> 0x014e }
            r5 = 1
            java.util.HashMap r4 = n4.y7.E(r4, r5)     // Catch:{ m1 -> 0x014e }
            java.lang.String r6 = r2.f10085a     // Catch:{ m1 -> 0x014e }
            java.lang.String[] r7 = c.a.f2360s     // Catch:{ m1 -> 0x014e }
            java.lang.String[] r8 = c.a.f2356q     // Catch:{ m1 -> 0x014e }
            java.lang.String r6 = y3.a.R(r6, r7, r8)     // Catch:{ m1 -> 0x014e }
            if (r6 != 0) goto L_0x00c6
            java.lang.String r6 = r2.f10085a     // Catch:{ m1 -> 0x014e }
        L_0x00c6:
            j4.b r7 = new j4.b     // Catch:{ m1 -> 0x014e }
            long r8 = r2.f10088d     // Catch:{ m1 -> 0x014e }
            r7.<init>(r4, r8, r6)     // Catch:{ m1 -> 0x014e }
            boolean r4 = r1.b(r7)     // Catch:{ m1 -> 0x014e }
            if (r4 != 0) goto L_0x00d5
            goto L_0x015f
        L_0x00d5:
            j4.c r4 = r1.f8427c
            j4.b r6 = r4.f8070b
            j4.b r4 = r4.f8069a
            boolean r4 = r6.equals(r4)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0100
            n4.w7 r4 = r0.f10346a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9835n
            java.lang.String r2 = r2.f10085a
            java.lang.String r6 = "EES edited event"
            r4.b(r6, r2)
            n4.w7 r2 = r0.f10346a
            n4.y7 r2 = r2.f10288g
            n4.w7.H(r2)
            j4.c r2 = r1.f8427c
            j4.b r2 = r2.f8070b
            n4.r r2 = n4.y7.y(r2)
        L_0x0100:
            n4.w7 r4 = r0.f10346a
            r4.b()
            n4.w7 r4 = r0.f10346a
            r4.i(r2, r3)
            j4.c r2 = r1.f8427c
            java.util.ArrayList r2 = r2.f8071c
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0185
            j4.c r1 = r1.f8427c
            java.util.ArrayList r1 = r1.f8071c
            java.util.Iterator r1 = r1.iterator()
        L_0x011d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0185
            java.lang.Object r2 = r1.next()
            j4.b r2 = (j4.b) r2
            n4.w7 r4 = r0.f10346a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9835n
            java.lang.String r5 = r2.f8049a
            java.lang.String r6 = "EES logging created event"
            r4.b(r6, r5)
            n4.w7 r4 = r0.f10346a
            n4.y7 r4 = r4.f10288g
            n4.w7.H(r4)
            n4.r r2 = n4.y7.y(r2)
            n4.w7 r4 = r0.f10346a
            r4.b()
            n4.w7 r4 = r0.f10346a
            r4.i(r2, r3)
            goto L_0x011d
        L_0x014e:
            n4.w7 r1 = r0.f10346a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9828f
            java.lang.String r4 = r3.f9769b
            java.lang.String r5 = r2.f10085a
            java.lang.String r6 = "EES error. appId, eventName"
            r1.c(r6, r4, r5)
        L_0x015f:
            n4.w7 r1 = r0.f10346a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            java.lang.String r4 = r2.f10085a
            java.lang.String r5 = "EES was not applied to event"
            goto L_0x0178
        L_0x016c:
            n4.w7 r1 = r0.f10346a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            java.lang.String r4 = r3.f9768a
            java.lang.String r5 = "EES not loaded for"
        L_0x0178:
            r1.b(r5, r4)
        L_0x017b:
            n4.w7 r1 = r0.f10346a
            r1.b()
            n4.w7 r0 = r0.f10346a
            r0.i(r2, r3)
        L_0x0185:
            return
        L_0x0186:
            java.lang.Object r0 = r11.f11200d
            q3.b1 r0 = (q3.b1) r0
            int r2 = r0.U
            if (r2 <= 0) goto L_0x01a1
            java.lang.Object r2 = r11.f11198b
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            android.os.Bundle r0 = r0.V
            if (r0 == 0) goto L_0x019e
            java.lang.Object r1 = r11.f11199c
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r1 = r0.getBundle(r1)
        L_0x019e:
            r2.onCreate(r1)
        L_0x01a1:
            java.lang.Object r0 = r11.f11200d
            q3.b1 r0 = (q3.b1) r0
            int r0 = r0.U
            r1 = 2
            if (r0 < r1) goto L_0x01b1
            java.lang.Object r0 = r11.f11198b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onStart()
        L_0x01b1:
            java.lang.Object r0 = r11.f11200d
            q3.b1 r0 = (q3.b1) r0
            int r0 = r0.U
            r1 = 3
            if (r0 < r1) goto L_0x01c1
            java.lang.Object r0 = r11.f11198b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onResume()
        L_0x01c1:
            java.lang.Object r0 = r11.f11200d
            q3.b1 r0 = (q3.b1) r0
            int r0 = r0.U
            r1 = 4
            if (r0 < r1) goto L_0x01d1
            java.lang.Object r0 = r11.f11198b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onStop()
        L_0x01d1:
            java.lang.Object r0 = r11.f11200d
            q3.b1 r0 = (q3.b1) r0
            int r0 = r0.U
            r1 = 5
            if (r0 < r1) goto L_0x01e1
            java.lang.Object r0 = r11.f11198b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onDestroy()
        L_0x01e1:
            return
        L_0x01e2:
            java.lang.Object r0 = r11.f11198b
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            java.lang.Object r2 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ RemoteException -> 0x023f }
            n4.n4 r2 = r2.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.w3 r2 = r2.r()     // Catch:{ RemoteException -> 0x023f }
            n4.f5 r2 = r2.m()     // Catch:{ RemoteException -> 0x023f }
            n4.e5 r3 = n4.e5.ANALYTICS_STORAGE     // Catch:{ RemoteException -> 0x023f }
            boolean r2 = r2.f(r3)     // Catch:{ RemoteException -> 0x023f }
            if (r2 != 0) goto L_0x0241
            java.lang.Object r2 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ RemoteException -> 0x023f }
            n4.n4 r2 = r2.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.i3 r2 = r2.a()     // Catch:{ RemoteException -> 0x023f }
            n4.g3 r2 = r2.k     // Catch:{ RemoteException -> 0x023f }
            java.lang.String r3 = "Analytics storage consent denied; will not get app instance id"
            r2.a(r3)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r2 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ RemoteException -> 0x023f }
            n4.n4 r2 = r2.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.a6 r2 = r2.t()     // Catch:{ RemoteException -> 0x023f }
            java.util.concurrent.atomic.AtomicReference r2 = r2.f9605g     // Catch:{ RemoteException -> 0x023f }
            r2.set(r1)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r2 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ RemoteException -> 0x023f }
            n4.n4 r2 = r2.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.w3 r2 = r2.r()     // Catch:{ RemoteException -> 0x023f }
            n4.v3 r2 = r2.f10256f     // Catch:{ RemoteException -> 0x023f }
            r2.b(r1)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r2 = r11.f11198b     // Catch:{ RemoteException -> 0x023f }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x023f }
            r2.set(r1)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r1 = r11.f11198b     // Catch:{ all -> 0x02c5 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x02c5 }
        L_0x0237:
            r1.notify()     // Catch:{ all -> 0x02c5 }
            goto L_0x02bb
        L_0x023c:
            r1 = move-exception
            goto L_0x02bd
        L_0x023f:
            r1 = move-exception
            goto L_0x02a5
        L_0x0241:
            java.lang.Object r1 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r1 = (n4.a7) r1     // Catch:{ RemoteException -> 0x023f }
            n4.z2 r2 = r1.f9613d     // Catch:{ RemoteException -> 0x023f }
            if (r2 != 0) goto L_0x025b
            n4.n4 r1 = r1.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.i3 r1 = r1.a()     // Catch:{ RemoteException -> 0x023f }
            n4.g3 r1 = r1.f9828f     // Catch:{ RemoteException -> 0x023f }
            java.lang.String r2 = "Failed to get app instance id"
            r1.a(r2)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r1 = r11.f11198b     // Catch:{ all -> 0x02c5 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x02c5 }
            goto L_0x0237
        L_0x025b:
            java.lang.Object r1 = r11.f11199c     // Catch:{ RemoteException -> 0x023f }
            n4.g8 r1 = (n4.g8) r1     // Catch:{ RemoteException -> 0x023f }
            r3.o.h(r1)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r1 = r11.f11198b     // Catch:{ RemoteException -> 0x023f }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r3 = r11.f11199c     // Catch:{ RemoteException -> 0x023f }
            n4.g8 r3 = (n4.g8) r3     // Catch:{ RemoteException -> 0x023f }
            java.lang.String r2 = r2.t(r3)     // Catch:{ RemoteException -> 0x023f }
            r1.set(r2)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r1 = r11.f11198b     // Catch:{ RemoteException -> 0x023f }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x023f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RemoteException -> 0x023f }
            if (r1 == 0) goto L_0x029b
            java.lang.Object r2 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ RemoteException -> 0x023f }
            n4.n4 r2 = r2.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.a6 r2 = r2.t()     // Catch:{ RemoteException -> 0x023f }
            java.util.concurrent.atomic.AtomicReference r2 = r2.f9605g     // Catch:{ RemoteException -> 0x023f }
            r2.set(r1)     // Catch:{ RemoteException -> 0x023f }
            java.lang.Object r2 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ RemoteException -> 0x023f }
            n4.n4 r2 = r2.f9600a     // Catch:{ RemoteException -> 0x023f }
            n4.w3 r2 = r2.r()     // Catch:{ RemoteException -> 0x023f }
            n4.v3 r2 = r2.f10256f     // Catch:{ RemoteException -> 0x023f }
            r2.b(r1)     // Catch:{ RemoteException -> 0x023f }
        L_0x029b:
            java.lang.Object r1 = r11.f11200d     // Catch:{ RemoteException -> 0x023f }
            n4.a7 r1 = (n4.a7) r1     // Catch:{ RemoteException -> 0x023f }
            r1.r()     // Catch:{ RemoteException -> 0x023f }
        L_0x02a2:
            java.lang.Object r1 = r11.f11198b     // Catch:{ all -> 0x02c5 }
            goto L_0x02b7
        L_0x02a5:
            java.lang.Object r2 = r11.f11200d     // Catch:{ all -> 0x023c }
            n4.a7 r2 = (n4.a7) r2     // Catch:{ all -> 0x023c }
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x023c }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x023c }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x023c }
            java.lang.String r3 = "Failed to get app instance id"
            r2.b(r3, r1)     // Catch:{ all -> 0x023c }
            goto L_0x02a2
        L_0x02b7:
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x02c5 }
            goto L_0x0237
        L_0x02bb:
            monitor-exit(r0)     // Catch:{ all -> 0x02c5 }
            return
        L_0x02bd:
            java.lang.Object r2 = r11.f11198b     // Catch:{ all -> 0x02c5 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x02c5 }
            r2.notify()     // Catch:{ all -> 0x02c5 }
            throw r1     // Catch:{ all -> 0x02c5 }
        L_0x02c5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02c5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.a1.run():void");
    }
}
