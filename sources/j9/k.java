package j9;

import j9.w;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f8922a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f8923b = 5;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public ThreadPoolExecutor f8924c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f8925d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f8926e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f8927f = new ArrayDeque();

    @Nullable
    public final w.a a(String str) {
        Iterator it = this.f8926e.iterator();
        while (it.hasNext()) {
            w.a aVar = (w.a) it.next();
            if (w.this.f9010c.f9016a.f8945d.equals(str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f8925d.iterator();
        while (it2.hasNext()) {
            w.a aVar2 = (w.a) it2.next();
            if (w.this.f9010c.f9016a.f8945d.equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void b(w.a aVar) {
        aVar.f9014c.decrementAndGet();
        c(this.f8926e, aVar);
    }

    public final void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        d();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void d() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.f8925d     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c2 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c2 }
            j9.w$a r2 = (j9.w.a) r2     // Catch:{ all -> 0x00c2 }
            java.util.ArrayDeque r3 = r14.f8926e     // Catch:{ all -> 0x00c2 }
            int r3 = r3.size()     // Catch:{ all -> 0x00c2 }
            int r4 = r14.f8922a     // Catch:{ all -> 0x00c2 }
            if (r3 < r4) goto L_0x0023
            goto L_0x003f
        L_0x0023:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f9014c     // Catch:{ all -> 0x00c2 }
            int r3 = r3.get()     // Catch:{ all -> 0x00c2 }
            int r4 = r14.f8923b     // Catch:{ all -> 0x00c2 }
            if (r3 < r4) goto L_0x002e
            goto L_0x000c
        L_0x002e:
            r1.remove()     // Catch:{ all -> 0x00c2 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f9014c     // Catch:{ all -> 0x00c2 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00c2 }
            r0.add(r2)     // Catch:{ all -> 0x00c2 }
            java.util.ArrayDeque r3 = r14.f8926e     // Catch:{ all -> 0x00c2 }
            r3.add(r2)     // Catch:{ all -> 0x00c2 }
            goto L_0x000c
        L_0x003f:
            monitor-enter(r14)     // Catch:{ all -> 0x00c2 }
            java.util.ArrayDeque r1 = r14.f8926e     // Catch:{ all -> 0x00bf }
            int r1 = r1.size()     // Catch:{ all -> 0x00bf }
            java.util.ArrayDeque r2 = r14.f8927f     // Catch:{ all -> 0x00bf }
            int r2 = r2.size()     // Catch:{ all -> 0x00bf }
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            r2 = 0
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            int r1 = r0.size()
            r3 = r2
        L_0x0055:
            if (r3 >= r1) goto L_0x00be
            java.lang.Object r4 = r0.get(r3)
            j9.w$a r4 = (j9.w.a) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f8924c     // Catch:{ all -> 0x00bb }
            if (r5 != 0) goto L_0x0080
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00bb }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00bb }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00bb }
            r12.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "OkHttp Dispatcher"
            byte[] r13 = k9.e.f9152a     // Catch:{ all -> 0x00bb }
            k9.c r13 = new k9.c     // Catch:{ all -> 0x00bb }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00bb }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00bb }
            r14.f8924c = r5     // Catch:{ all -> 0x00bb }
        L_0x0080:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f8924c     // Catch:{ all -> 0x00bb }
            monitor-exit(r14)
            r4.getClass()
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x008c }
            goto L_0x00ae
        L_0x008a:
            r0 = move-exception
            goto L_0x00b1
        L_0x008c:
            r5 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x008a }
            r6.initCause(r5)     // Catch:{ all -> 0x008a }
            j9.w r5 = j9.w.this     // Catch:{ all -> 0x008a }
            m9.i r5 = r5.f9009b     // Catch:{ all -> 0x008a }
            r5.e(r6)     // Catch:{ all -> 0x008a }
            j9.e r5 = r4.f9013b     // Catch:{ all -> 0x008a }
            u9.t$a r5 = (u9.t.a) r5     // Catch:{ all -> 0x008a }
            r5.a(r6)     // Catch:{ all -> 0x008a }
            j9.w r5 = j9.w.this
            j9.u r5 = r5.f9008a
            j9.k r5 = r5.f8980a
            r5.b(r4)
        L_0x00ae:
            int r3 = r3 + 1
            goto L_0x0055
        L_0x00b1:
            j9.w r1 = j9.w.this
            j9.u r1 = r1.f9008a
            j9.k r1 = r1.f8980a
            r1.b(r4)
            throw r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00be:
            return
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00c2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.k.d():void");
    }
}
