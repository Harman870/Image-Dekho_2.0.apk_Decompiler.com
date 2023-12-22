package d6;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import j4.c2;
import j4.f1;
import j4.g1;
import j4.h1;
import j4.k1;
import j4.l1;
import j4.n1;
import j4.o1;
import j4.p1;
import j4.q0;
import j4.q1;
import j4.r1;
import j4.u1;
import j4.v1;
import j4.x1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import n4.b6;
import n4.g5;

public final class a implements b6 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c2 f6104a;

    public a(c2 c2Var) {
        this.f6104a = c2Var;
    }

    public final void a(String str) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        c2Var.b(new k1(c2Var, str));
    }

    public final String b() {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new f1(c2Var, q0Var, 1));
        return q0Var.d(50);
    }

    public final void c(String str, String str2, Bundle bundle) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        c2Var.b(new g1(c2Var, str, str2, bundle));
    }

    public final List d(String str, String str2) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new h1(c2Var, str, str2, q0Var));
        List list = (List) q0.E(q0Var.c(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map e(String str, String str2, boolean z9) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new r1(c2Var, str, str2, z9, q0Var));
        Bundle c10 = q0Var.c(5000);
        if (c10 == null || c10.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(c10.size());
        for (String next : c10.keySet()) {
            Object obj = c10.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final String f() {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new p1(c2Var, q0Var, 0));
        return q0Var.d(500);
    }

    public final void g(g5 g5Var) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        x1 x1Var = new x1(g5Var);
        if (c2Var.f8080h != null) {
            try {
                c2Var.f8080h.setEventInterceptor(x1Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(c2Var.f8073a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        c2Var.b(new o1(c2Var, x1Var, 1));
    }

    public final void h(String str) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        c2Var.b(new l1(c2Var, str));
    }

    public final void i(String str, String str2, Bundle bundle, long j10) {
        c2 c2Var = this.f6104a;
        Long valueOf = Long.valueOf(j10);
        c2Var.getClass();
        c2Var.b(new v1(c2Var, valueOf, str, str2, bundle, false));
    }

    public final String j() {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new n1(c2Var, q0Var));
        return q0Var.d(500);
    }

    public final void k(Bundle bundle) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        c2Var.b(new f1(c2Var, bundle, 0));
    }

    public final void l(String str, String str2, Bundle bundle) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        c2Var.b(new v1(c2Var, (Long) null, str, str2, bundle, true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0.f8080h == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.f8080h.registerOnMeasurementEventListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        android.util.Log.w(r0.f8073a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(n4.h5 r6) {
        /*
            r5 = this;
            j4.c2 r0 = r5.f6104a
            r0.getClass()
            java.util.ArrayList r1 = r0.f8077e
            monitor-enter(r1)
            r2 = 0
        L_0x0009:
            java.util.ArrayList r3 = r0.f8077e     // Catch:{ all -> 0x0058 }
            int r3 = r3.size()     // Catch:{ all -> 0x0058 }
            if (r2 >= r3) goto L_0x002d
            java.util.ArrayList r3 = r0.f8077e     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0058 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0058 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r6 = r0.f8073a     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "OnEventListener already registered."
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0058 }
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0057
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x002d:
            j4.y1 r2 = new j4.y1     // Catch:{ all -> 0x0058 }
            r2.<init>(r6)     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r3 = r0.f8077e     // Catch:{ all -> 0x0058 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0058 }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x0058 }
            r3.add(r4)     // Catch:{ all -> 0x0058 }
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            j4.u0 r6 = r0.f8080h
            if (r6 == 0) goto L_0x004e
            j4.u0 r6 = r0.f8080h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            r6.registerOnMeasurementEventListener(r2)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            goto L_0x0057
        L_0x0047:
            java.lang.String r6 = r0.f8073a
            java.lang.String r1 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r6, r1)
        L_0x004e:
            j4.p1 r6 = new j4.p1
            r1 = 1
            r6.<init>(r0, r2, r1)
            r0.b(r6)
        L_0x0057:
            return
        L_0x0058:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.a.m(n4.h5):void");
    }

    public final int zza(String str) {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new u1(c2Var, str, q0Var));
        Integer num = (Integer) q0.E(q0Var.c(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new o1(c2Var, q0Var, 0));
        Long l6 = (Long) q0.E(q0Var.c(500), Long.class);
        if (l6 != null) {
            return l6.longValue();
        }
        long nanoTime = System.nanoTime();
        c2Var.f8074b.getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = c2Var.f8078f + 1;
        c2Var.f8078f = i10;
        return nextLong + ((long) i10);
    }

    public final String zzi() {
        c2 c2Var = this.f6104a;
        c2Var.getClass();
        q0 q0Var = new q0();
        c2Var.b(new q1(c2Var, q0Var));
        return q0Var.d(500);
    }
}
