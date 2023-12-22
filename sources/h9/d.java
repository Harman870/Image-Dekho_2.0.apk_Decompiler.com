package h9;

import e9.p;
import e9.v;
import e9.w;
import i9.k;
import q8.f;

public final class d extends p implements Runnable, w {

    /* renamed from: b  reason: collision with root package name */
    public final p f7047b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7048c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w f7049d;

    /* renamed from: e  reason: collision with root package name */
    public final g<Runnable> f7050e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f7051f;
    private volatile int runningWorkers;

    public d(k kVar, int i10) {
        w wVar;
        this.f7047b = kVar;
        this.f7048c = i10;
        if (kVar instanceof w) {
            wVar = (w) kVar;
        } else {
            wVar = null;
        }
        this.f7049d = wVar == null ? v.f6273a : wVar;
        this.f7050e = new g<>();
        this.f7051f = new Object();
    }

    public final void L(f fVar, Runnable runnable) {
        boolean z9;
        this.f7050e.a(runnable);
        boolean z10 = true;
        if (this.runningWorkers >= this.f7048c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            synchronized (this.f7051f) {
                if (this.runningWorkers >= this.f7048c) {
                    z10 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z10) {
                this.f7047b.L(this, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r3.f7051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3.f7050e.c() != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.runningWorkers++;
        r1 = o8.h.f10610a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            h9.g<java.lang.Runnable> r1 = r3.f7050e
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x0029
            r1.run()     // Catch:{ all -> 0x000f }
            goto L_0x0015
        L_0x000f:
            r1 = move-exception
            q8.g r2 = q8.g.f11375a
            y3.a.k(r2, r1)
        L_0x0015:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L_0x0001
            e9.p r1 = r3.f7047b
            boolean r1 = r1.M()
            if (r1 == 0) goto L_0x0001
            e9.p r0 = r3.f7047b
            r0.L(r3, r3)
            return
        L_0x0029:
            java.lang.Object r0 = r3.f7051f
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch:{ all -> 0x0046 }
            int r1 = r1 + -1
            r3.runningWorkers = r1     // Catch:{ all -> 0x0046 }
            h9.g<java.lang.Runnable> r1 = r3.f7050e     // Catch:{ all -> 0x0046 }
            int r1 = r1.c()     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            int r1 = r3.runningWorkers     // Catch:{ all -> 0x0046 }
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch:{ all -> 0x0046 }
            o8.h r1 = o8.h.f10610a     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)
            goto L_0x0000
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.d.run():void");
    }
}
