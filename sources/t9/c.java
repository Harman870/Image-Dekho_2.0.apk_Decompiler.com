package t9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class c extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f12036h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f12037i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public static c f12038j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12039e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public c f12040f;

    /* renamed from: g  reason: collision with root package name */
    public long f12041g;

    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.n();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<t9.c> r0 = t9.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                t9.c r1 = t9.c.h()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                t9.c r2 = t9.c.f12038j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                t9.c.f12038j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.n()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: t9.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f12036h = millis;
        f12037i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static c h() {
        Class<c> cls = c.class;
        c cVar = f12038j.f12040f;
        long nanoTime = System.nanoTime();
        if (cVar == null) {
            cls.wait(f12036h);
            if (f12038j.f12040f != null || System.nanoTime() - nanoTime < f12037i) {
                return null;
            }
            return f12038j;
        }
        long j10 = cVar.f12041g - nanoTime;
        if (j10 > 0) {
            long j11 = j10 / 1000000;
            cls.wait(j11, (int) (j10 - (1000000 * j11)));
            return null;
        }
        f12038j.f12040f = cVar.f12040f;
        cVar.f12040f = null;
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005d A[EDGE_INSN: B:40:0x005d->B:27:0x005d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r9 = this;
            boolean r0 = r9.f12039e
            if (r0 != 0) goto L_0x0073
            long r0 = r9.f12093c
            boolean r2 = r9.f12091a
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0011
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            r4 = 1
            r9.f12039e = r4
            java.lang.Class<t9.c> r4 = t9.c.class
            monitor-enter(r4)
            t9.c r5 = f12038j     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x002a
            t9.c r5 = new t9.c     // Catch:{ all -> 0x0070 }
            r5.<init>()     // Catch:{ all -> 0x0070 }
            f12038j = r5     // Catch:{ all -> 0x0070 }
            t9.c$a r5 = new t9.c$a     // Catch:{ all -> 0x0070 }
            r5.<init>()     // Catch:{ all -> 0x0070 }
            r5.start()     // Catch:{ all -> 0x0070 }
        L_0x002a:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0070 }
            if (r3 == 0) goto L_0x003c
            if (r2 == 0) goto L_0x003c
            long r2 = r9.c()     // Catch:{ all -> 0x0070 }
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0070 }
            goto L_0x003e
        L_0x003c:
            if (r3 == 0) goto L_0x0042
        L_0x003e:
            long r0 = r0 + r5
            r9.f12041g = r0     // Catch:{ all -> 0x0070 }
            goto L_0x004a
        L_0x0042:
            if (r2 == 0) goto L_0x006a
            long r0 = r9.c()     // Catch:{ all -> 0x0070 }
            r9.f12041g = r0     // Catch:{ all -> 0x0070 }
        L_0x004a:
            long r0 = r9.f12041g     // Catch:{ all -> 0x0070 }
            long r0 = r0 - r5
            t9.c r2 = f12038j     // Catch:{ all -> 0x0070 }
        L_0x004f:
            t9.c r3 = r2.f12040f     // Catch:{ all -> 0x0070 }
            if (r3 == 0) goto L_0x005d
            long r7 = r3.f12041g     // Catch:{ all -> 0x0070 }
            long r7 = r7 - r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r2 = r3
            goto L_0x004f
        L_0x005d:
            r9.f12040f = r3     // Catch:{ all -> 0x0070 }
            r2.f12040f = r9     // Catch:{ all -> 0x0070 }
            t9.c r0 = f12038j     // Catch:{ all -> 0x0070 }
            if (r2 != r0) goto L_0x0068
            r4.notify()     // Catch:{ all -> 0x0070 }
        L_0x0068:
            monitor-exit(r4)
            return
        L_0x006a:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.c.i():void");
    }

    public final IOException j(IOException iOException) {
        return !l() ? iOException : m(iOException);
    }

    public final void k(boolean z9) {
        if (l() && z9) {
            throw m((IOException) null);
        }
    }

    public final boolean l() {
        boolean z9 = false;
        if (!this.f12039e) {
            return false;
        }
        this.f12039e = false;
        synchronized (c.class) {
            c cVar = f12038j;
            while (true) {
                if (cVar == null) {
                    z9 = true;
                    break;
                }
                c cVar2 = cVar.f12040f;
                if (cVar2 == this) {
                    cVar.f12040f = this.f12040f;
                    this.f12040f = null;
                    break;
                }
                cVar = cVar2;
            }
        }
        return z9;
    }

    public IOException m(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void n() {
    }
}
