package c3;

import w2.j;
import w2.s;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f2394a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f2395b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2396c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f2397d;

    public /* synthetic */ f(q qVar, j jVar, int i10, Runnable runnable) {
        this.f2394a = qVar;
        this.f2395b = jVar;
        this.f2396c = i10;
        this.f2397d = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f2422d.b(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            c3.q r0 = r8.f2394a
            w2.s r1 = r8.f2395b
            int r2 = r8.f2396c
            java.lang.Runnable r3 = r8.f2397d
            r0.getClass()
            r4 = 1
            e3.b r5 = r0.f2424f     // Catch:{ a -> 0x0047 }
            d3.d r6 = r0.f2421c     // Catch:{ a -> 0x0047 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ a -> 0x0047 }
            c3.h r7 = new c3.h     // Catch:{ a -> 0x0047 }
            r7.<init>(r6)     // Catch:{ a -> 0x0047 }
            r5.c(r7)     // Catch:{ a -> 0x0047 }
            android.content.Context r5 = r0.f2419a     // Catch:{ a -> 0x0047 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ a -> 0x0047 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ a -> 0x0047 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ a -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            boolean r5 = r5.isConnected()     // Catch:{ a -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            r5 = r4
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0041
            e3.b r5 = r0.f2424f     // Catch:{ a -> 0x0047 }
            c3.i r6 = new c3.i     // Catch:{ a -> 0x0047 }
            r6.<init>(r0, r1, r2)     // Catch:{ a -> 0x0047 }
            r5.c(r6)     // Catch:{ a -> 0x0047 }
            goto L_0x004d
        L_0x0041:
            r0.a(r1, r2)     // Catch:{ a -> 0x0047 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            c3.u r0 = r0.f2422d     // Catch:{ all -> 0x0045 }
            int r2 = r2 + r4
            r0.b(r1, r2)     // Catch:{ all -> 0x0045 }
        L_0x004d:
            r3.run()
            return
        L_0x0051:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.f.run():void");
    }
}
