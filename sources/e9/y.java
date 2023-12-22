package e9;

import h9.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class y<T> extends n<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6275b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_decision");
    private volatile /* synthetic */ int _decision;

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f6275b
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            r0 = 0
            q8.d r0 = z5.c.k(r0)
            java.lang.Object r5 = z5.c.o(r5)
            z5.c.p(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.y.J(java.lang.Object):void");
    }

    public final void g(Object obj) {
        J(obj);
    }
}
