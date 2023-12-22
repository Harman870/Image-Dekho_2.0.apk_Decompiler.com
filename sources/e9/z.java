package e9;

import i9.g;
import java.util.concurrent.CancellationException;
import q8.d;
import x8.f;
import y3.a;
import z5.c;

public abstract class z<T> extends g {

    /* renamed from: c  reason: collision with root package name */
    public int f6277c;

    public z(int i10) {
        this.f6277c = i10;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }

    public abstract d<T> c();

    public Throwable f(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar == null) {
            return null;
        }
        return mVar.f6251a;
    }

    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                c.c(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            f.c(th);
            a.k(c().b(), new s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object i();

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x0057, all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059 A[Catch:{ all -> 0x0057, all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b A[SYNTHETIC, Splitter:B:29:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[SYNTHETIC, Splitter:B:36:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            i9.h r0 = r12.f7971b
            q8.d r1 = r12.c()     // Catch:{ all -> 0x0089 }
            h9.c r1 = (h9.c) r1     // Catch:{ all -> 0x0089 }
            q8.d<T> r2 = r1.f7044e     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.f7046g     // Catch:{ all -> 0x0089 }
            q8.f r3 = r2.b()     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = h9.p.c(r3, r1)     // Catch:{ all -> 0x0089 }
            z7.e r4 = h9.p.f7069a     // Catch:{ all -> 0x0089 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            e9.a1 r4 = c.a.l(r2, r3)     // Catch:{ all -> 0x0089 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            q8.f r6 = r2.b()     // Catch:{ all -> 0x0057 }
            java.lang.Object r7 = r12.i()     // Catch:{ all -> 0x0057 }
            java.lang.Throwable r8 = r12.f(r7)     // Catch:{ all -> 0x0057 }
            if (r8 != 0) goto L_0x0042
            int r9 = r12.f6277c     // Catch:{ all -> 0x0057 }
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            e9.n0$b r9 = e9.n0.b.f6255a     // Catch:{ all -> 0x0057 }
            q8.f$b r6 = r6.get(r9)     // Catch:{ all -> 0x0057 }
            e9.n0 r6 = (e9.n0) r6     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x0059
            boolean r9 = r6.a()     // Catch:{ all -> 0x0057 }
            if (r9 != 0) goto L_0x0059
            java.util.concurrent.CancellationException r6 = r6.u()     // Catch:{ all -> 0x0057 }
            r12.a(r7, r6)     // Catch:{ all -> 0x0057 }
            o8.f$a r6 = c.a.d(r6)     // Catch:{ all -> 0x0057 }
            goto L_0x0064
        L_0x0057:
            r2 = move-exception
            goto L_0x0082
        L_0x0059:
            if (r8 == 0) goto L_0x0060
            o8.f$a r6 = c.a.d(r8)     // Catch:{ all -> 0x0057 }
            goto L_0x0064
        L_0x0060:
            java.lang.Object r6 = r12.g(r7)     // Catch:{ all -> 0x0057 }
        L_0x0064:
            r2.e(r6)     // Catch:{ all -> 0x0057 }
            o8.h r2 = o8.h.f10610a     // Catch:{ all -> 0x0057 }
            if (r4 != 0) goto L_0x0081
            h9.p.a(r3, r1)     // Catch:{ all -> 0x0089 }
            r0.a()     // Catch:{ all -> 0x0074 }
            o8.h r0 = o8.h.f10610a     // Catch:{ all -> 0x0074 }
            goto L_0x0079
        L_0x0074:
            r0 = move-exception
            o8.f$a r0 = c.a.d(r0)
        L_0x0079:
            java.lang.Throwable r0 = o8.f.a(r0)
            r12.h(r5, r0)
            goto L_0x009c
        L_0x0081:
            throw r5     // Catch:{ all -> 0x0089 }
        L_0x0082:
            if (r4 == 0) goto L_0x0085
            throw r5     // Catch:{ all -> 0x0089 }
        L_0x0085:
            h9.p.a(r3, r1)     // Catch:{ all -> 0x0089 }
            throw r2     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            r0.a()     // Catch:{ all -> 0x0090 }
            o8.h r0 = o8.h.f10610a     // Catch:{ all -> 0x0090 }
            goto L_0x0095
        L_0x0090:
            r0 = move-exception
            o8.f$a r0 = c.a.d(r0)
        L_0x0095:
            java.lang.Throwable r0 = o8.f.a(r0)
            r12.h(r1, r0)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.z.run():void");
    }
}
