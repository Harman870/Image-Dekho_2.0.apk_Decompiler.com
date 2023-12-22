package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public HashMap f5030a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public HashMap f5031b = new HashMap();

    public interface a {
        int m();

        String n();
    }

    public m(List<a> list) {
        for (a next : list) {
            this.f5030a.put(next.n(), 0);
            this.f5031b.put(next.n(), Integer.valueOf(next.m()));
        }
    }

    public final void a(a aVar) {
        synchronized (this) {
            String n2 = aVar.n();
            if (this.f5030a.containsKey(n2)) {
                HashMap hashMap = this.f5030a;
                hashMap.put(n2, Integer.valueOf(((Integer) hashMap.get(n2)).intValue() + 1));
            }
        }
    }

    public final boolean a() {
        for (String str : this.f5031b.keySet()) {
            if (((Integer) this.f5030a.get(str)).intValue() < ((Integer) this.f5031b.get(str)).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.ironsource.mediationsdk.utils.m.a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.n()     // Catch:{ all -> 0x0025 }
            java.util.HashMap r1 = r3.f5030a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.HashMap r1 = r3.f5030a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0025 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0025 }
            int r4 = r4.m()     // Catch:{ all -> 0x0025 }
            if (r0 < r4) goto L_0x0021
            r2 = 1
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.m.b(com.ironsource.mediationsdk.utils.m$a):boolean");
    }
}
