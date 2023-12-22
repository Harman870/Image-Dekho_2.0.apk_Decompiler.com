package p9;

import g0.e;
import k9.b;
import p9.f;

public final class m extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10795b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f10796c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.C0128f f10797d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(f.C0128f fVar, Object[] objArr, e eVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f10797d = fVar;
        this.f10796c = eVar;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            p9.f$f r0 = r14.f10797d
            boolean r1 = r14.f10795b
            g0.e r2 = r14.f10796c
            p9.f r3 = p9.f.this
            p9.r r3 = r3.u
            monitor-enter(r3)
            p9.f r4 = p9.f.this     // Catch:{ all -> 0x00c9 }
            monitor-enter(r4)     // Catch:{ all -> 0x00c9 }
            p9.f r5 = p9.f.this     // Catch:{ all -> 0x004b }
            g0.e r5 = r5.f10760s     // Catch:{ all -> 0x004b }
            int r5 = r5.c()     // Catch:{ all -> 0x004b }
            r6 = 0
            if (r1 == 0) goto L_0x0026
            p9.f r1 = p9.f.this     // Catch:{ all -> 0x004b }
            g0.e r1 = r1.f10760s     // Catch:{ all -> 0x004b }
            r1.f6454a = r6     // Catch:{ all -> 0x004b }
            java.lang.Object r1 = r1.f6455b     // Catch:{ all -> 0x004b }
            int[] r1 = (int[]) r1     // Catch:{ all -> 0x004b }
            java.util.Arrays.fill(r1, r6)     // Catch:{ all -> 0x004b }
        L_0x0026:
            p9.f r1 = p9.f.this     // Catch:{ all -> 0x004b }
            g0.e r1 = r1.f10760s     // Catch:{ all -> 0x004b }
            r1.getClass()     // Catch:{ all -> 0x004b }
            r7 = r6
        L_0x002e:
            r8 = 10
            r9 = 1
            if (r7 >= r8) goto L_0x004e
            int r8 = r9 << r7
            int r10 = r2.f6454a     // Catch:{ all -> 0x004b }
            r8 = r8 & r10
            if (r8 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r9 = r6
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            java.lang.Object r8 = r2.f6455b     // Catch:{ all -> 0x004b }
            int[] r8 = (int[]) r8     // Catch:{ all -> 0x004b }
            r8 = r8[r7]     // Catch:{ all -> 0x004b }
            r1.d(r7, r8)     // Catch:{ all -> 0x004b }
        L_0x0048:
            int r7 = r7 + 1
            goto L_0x002e
        L_0x004b:
            r0 = move-exception
            goto L_0x00c7
        L_0x004e:
            p9.f r1 = p9.f.this     // Catch:{ all -> 0x004b }
            g0.e r1 = r1.f10760s     // Catch:{ all -> 0x004b }
            int r1 = r1.c()     // Catch:{ all -> 0x004b }
            r2 = -1
            r7 = 0
            r10 = 0
            if (r1 == r2) goto L_0x0084
            if (r1 == r5) goto L_0x0084
            int r1 = r1 - r5
            long r1 = (long) r1     // Catch:{ all -> 0x004b }
            p9.f r5 = p9.f.this     // Catch:{ all -> 0x004b }
            java.util.LinkedHashMap r5 = r5.f10745c     // Catch:{ all -> 0x004b }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x004b }
            if (r5 != 0) goto L_0x0085
            p9.f r5 = p9.f.this     // Catch:{ all -> 0x004b }
            java.util.LinkedHashMap r5 = r5.f10745c     // Catch:{ all -> 0x004b }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x004b }
            p9.f r7 = p9.f.this     // Catch:{ all -> 0x004b }
            java.util.LinkedHashMap r7 = r7.f10745c     // Catch:{ all -> 0x004b }
            int r7 = r7.size()     // Catch:{ all -> 0x004b }
            p9.q[] r7 = new p9.q[r7]     // Catch:{ all -> 0x004b }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ all -> 0x004b }
            r7 = r5
            p9.q[] r7 = (p9.q[]) r7     // Catch:{ all -> 0x004b }
            goto L_0x0085
        L_0x0084:
            r1 = r10
        L_0x0085:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            p9.f r4 = p9.f.this     // Catch:{ IOException -> 0x0090 }
            p9.r r5 = r4.u     // Catch:{ IOException -> 0x0090 }
            g0.e r4 = r4.f10760s     // Catch:{ IOException -> 0x0090 }
            r5.a(r4)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            r4 = move-exception
            p9.f r5 = p9.f.this     // Catch:{ all -> 0x00c9 }
            r8 = 2
            r5.a(r8, r8, r4)     // Catch:{ all -> 0x00c9 }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            if (r7 == 0) goto L_0x00b4
            int r3 = r7.length
            r4 = r6
        L_0x009c:
            if (r4 >= r3) goto L_0x00b4
            r5 = r7[r4]
            monitor-enter(r5)
            long r12 = r5.f10819b     // Catch:{ all -> 0x00b1 }
            long r12 = r12 + r1
            r5.f10819b = r12     // Catch:{ all -> 0x00b1 }
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ad
            r5.notifyAll()     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            monitor-exit(r5)     // Catch:{ all -> 0x00b1 }
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b1 }
            throw r0
        L_0x00b4:
            java.util.concurrent.ThreadPoolExecutor r1 = p9.f.f10742x
            p9.n r2 = new p9.n
            java.lang.Object[] r3 = new java.lang.Object[r9]
            p9.f r4 = p9.f.this
            java.lang.String r4 = r4.f10746d
            r3[r6] = r4
            r2.<init>(r0, r3)
            r1.execute(r2)
            return
        L_0x00c7:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.m.a():void");
    }
}
