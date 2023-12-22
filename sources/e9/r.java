package e9;

import c.a;
import java.lang.Thread;
import java.util.List;
import o8.h;
import q8.f;
import z5.c;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final List<q> f6261a;

    /* JADX WARNING: type inference failed for: r0v3, types: [c9.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.util.Iterator r0 = androidx.fragment.app.v0.d()
            java.lang.String r1 = "<this>"
            x8.f.f(r0, r1)
            c9.d r1 = new c9.d
            r1.<init>(r0)
            boolean r0 = r1 instanceof c9.a
            if (r0 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            c9.a r0 = new c9.a
            r0.<init>(r1)
            r1 = r0
        L_0x0019:
            java.util.List r0 = c9.c.a0(r1)
            f6261a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.r.<clinit>():void");
    }

    public static final void a(f fVar, Throwable th) {
        Throwable th2;
        for (q handleException : f6261a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    c.c(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            c.c(th, new x(fVar));
            h hVar = h.f10610a;
        } catch (Throwable th4) {
            a.d(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
