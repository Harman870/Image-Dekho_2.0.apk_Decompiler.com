package n4;

import java.util.concurrent.atomic.AtomicReference;

public final class s5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10118b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a6 f10119c;

    public /* synthetic */ s5(a6 a6Var, AtomicReference atomicReference, int i10) {
        this.f10117a = i10;
        this.f10119c = a6Var;
        this.f10118b = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:18|19|(1:21)(2:22|(6:24|25|28|29|30|31))|26|27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f10117a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0037
        L_0x0006:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f10118b
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.f10118b     // Catch:{ all -> 0x002d }
            n4.a6 r2 = r7.f10119c     // Catch:{ all -> 0x002d }
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x002d }
            n4.f r3 = r2.f9992g     // Catch:{ all -> 0x002d }
            n4.a3 r2 = r2.o()     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.l()     // Catch:{ all -> 0x002d }
            n4.v2 r4 = n4.w2.K     // Catch:{ all -> 0x002d }
            boolean r2 = r3.o(r2, r4)     // Catch:{ all -> 0x002d }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x002d }
            r1.set(r2)     // Catch:{ all -> 0x002d }
            java.util.concurrent.atomic.AtomicReference r1 = r7.f10118b     // Catch:{ all -> 0x0034 }
            r1.notify()     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x002d:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r7.f10118b     // Catch:{ all -> 0x0034 }
            r2.notify()     // Catch:{ all -> 0x0034 }
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        L_0x0037:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f10118b
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.f10118b     // Catch:{ all -> 0x008d }
            n4.a6 r2 = r7.f10119c     // Catch:{ all -> 0x008d }
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x008d }
            n4.f r3 = r2.f9992g     // Catch:{ all -> 0x008d }
            n4.a3 r2 = r2.o()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r2.l()     // Catch:{ all -> 0x008d }
            n4.v2 r4 = n4.w2.O     // Catch:{ all -> 0x008d }
            r5 = 0
            if (r2 != 0) goto L_0x0053
            r3.getClass()     // Catch:{ all -> 0x008d }
            goto L_0x0075
        L_0x0053:
            n4.e r3 = r3.f9731c     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r4.f10176a     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r3.b(r2, r6)     // Catch:{ all -> 0x008d }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x0062
            goto L_0x0075
        L_0x0062:
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0075 }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0075 }
            java.lang.Object r2 = r4.a(r2)     // Catch:{ NumberFormatException -> 0x0075 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ NumberFormatException -> 0x0075 }
            double r2 = r2.doubleValue()     // Catch:{ NumberFormatException -> 0x0075 }
            goto L_0x007f
        L_0x0075:
            java.lang.Object r2 = r4.a(r5)     // Catch:{ all -> 0x008d }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x008d }
            double r2 = r2.doubleValue()     // Catch:{ all -> 0x008d }
        L_0x007f:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x008d }
            r1.set(r2)     // Catch:{ all -> 0x008d }
            java.util.concurrent.atomic.AtomicReference r1 = r7.f10118b     // Catch:{ all -> 0x0094 }
            r1.notify()     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x008d:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r7.f10118b     // Catch:{ all -> 0x0094 }
            r2.notify()     // Catch:{ all -> 0x0094 }
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.s5.run():void");
    }
}
