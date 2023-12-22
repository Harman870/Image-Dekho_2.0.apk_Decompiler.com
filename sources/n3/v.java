package n3;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9570a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public int f9571b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public int f9572c = 0;

    public v(Context context) {
        this.f9570a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f9572c     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f9570a     // Catch:{ all -> 0x0085 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0085 }
            android.content.Context r1 = r5.f9570a     // Catch:{ all -> 0x0085 }
            y3.b r1 = y3.c.a(r1)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            android.content.Context r1 = r1.f13043a     // Catch:{ all -> 0x0085 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0085 }
            int r1 = r1.checkPermission(r2, r3)     // Catch:{ all -> 0x0085 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x002e
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return r3
        L_0x002e:
            boolean r1 = w3.g.a()     // Catch:{ all -> 0x0085 }
            r2 = 1
            if (r1 != 0) goto L_0x0052
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0085 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0052
            int r1 = r1.size()     // Catch:{ all -> 0x0085 }
            if (r1 > 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r5.f9572c = r2     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0085 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0085 }
            r1 = 2
            if (r0 == 0) goto L_0x0070
            int r0 = r0.size()     // Catch:{ all -> 0x0085 }
            if (r0 > 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            r5.f9572c = r1     // Catch:{ all -> 0x0085 }
            monitor-exit(r5)
            return r1
        L_0x0070:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0085 }
            boolean r0 = w3.g.a()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0081
            r5.f9572c = r1     // Catch:{ all -> 0x0085 }
            r2 = r1
            goto L_0x0083
        L_0x0081:
            r5.f9572c = r2     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r5)
            return r2
        L_0x0085:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.v.a():int");
    }
}
