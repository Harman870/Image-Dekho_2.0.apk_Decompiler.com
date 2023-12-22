package a7;

import android.content.Intent;
import java.util.concurrent.TimeUnit;
import q4.a;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f176a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f177b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static a f178c;

    public static void a(Intent intent) {
        synchronized (f177b) {
            if (f178c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f178c.c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName b(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f177b
            monitor-enter(r0)
            q4.a r1 = f178c     // Catch:{ all -> 0x003b }
            r2 = 1
            if (r1 != 0) goto L_0x001b
            q4.a r1 = new q4.a     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r3)     // Catch:{ all -> 0x003b }
            f178c = r1     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r1.f11321a     // Catch:{ all -> 0x003b }
            monitor-enter(r3)     // Catch:{ all -> 0x003b }
            r1.f11327g = r2     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4     // Catch:{ all -> 0x003b }
        L_0x001b:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x003b }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0030
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r4
        L_0x0030:
            if (r1 != 0) goto L_0x0039
            q4.a r5 = f178c     // Catch:{ all -> 0x003b }
            long r1 = f176a     // Catch:{ all -> 0x003b }
            r5.a(r1)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r4
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.l0.b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
