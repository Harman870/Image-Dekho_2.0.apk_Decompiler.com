package p9;

import j9.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import t9.e;
import t9.x;
import t9.y;
import t9.z;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public long f10818a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f10819b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10820c;

    /* renamed from: d  reason: collision with root package name */
    public final f f10821d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f10822e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10823f;

    /* renamed from: g  reason: collision with root package name */
    public final b f10824g;

    /* renamed from: h  reason: collision with root package name */
    public final a f10825h;

    /* renamed from: i  reason: collision with root package name */
    public final c f10826i;

    /* renamed from: j  reason: collision with root package name */
    public final c f10827j;
    @Nullable
    public int k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public IOException f10828l;

    public final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final e f10829a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f10830b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10831c;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f10827j.o();
            r11.f10832d.b();
            r9 = java.lang.Math.min(r11.f10832d.f10819b, r11.f10829a.f12045b);
            r1 = r11.f10832d;
            r1.f10819b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r12) {
            /*
                r11 = this;
                p9.q r0 = p9.q.this
                monitor-enter(r0)
                p9.q r1 = p9.q.this     // Catch:{ all -> 0x007b }
                p9.q$c r1 = r1.f10827j     // Catch:{ all -> 0x007b }
                r1.i()     // Catch:{ all -> 0x007b }
            L_0x000a:
                p9.q r1 = p9.q.this     // Catch:{ all -> 0x0072 }
                long r2 = r1.f10819b     // Catch:{ all -> 0x0072 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x0024
                boolean r2 = r11.f10831c     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f10830b     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                int r2 = r1.k     // Catch:{ all -> 0x0072 }
                if (r2 != 0) goto L_0x0024
                r1.i()     // Catch:{ all -> 0x0072 }
                goto L_0x000a
            L_0x0024:
                p9.q$c r1 = r1.f10827j     // Catch:{ all -> 0x007b }
                r1.o()     // Catch:{ all -> 0x007b }
                p9.q r1 = p9.q.this     // Catch:{ all -> 0x007b }
                r1.b()     // Catch:{ all -> 0x007b }
                p9.q r1 = p9.q.this     // Catch:{ all -> 0x007b }
                long r1 = r1.f10819b     // Catch:{ all -> 0x007b }
                t9.e r3 = r11.f10829a     // Catch:{ all -> 0x007b }
                long r3 = r3.f12045b     // Catch:{ all -> 0x007b }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
                p9.q r1 = p9.q.this     // Catch:{ all -> 0x007b }
                long r2 = r1.f10819b     // Catch:{ all -> 0x007b }
                long r2 = r2 - r9
                r1.f10819b = r2     // Catch:{ all -> 0x007b }
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                p9.q$c r0 = r1.f10827j
                r0.i()
                if (r12 == 0) goto L_0x0055
                t9.e r12 = r11.f10829a     // Catch:{ all -> 0x0053 }
                long r0 = r12.f12045b     // Catch:{ all -> 0x0053 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0055
                r12 = 1
                goto L_0x0056
            L_0x0053:
                r12 = move-exception
                goto L_0x006a
            L_0x0055:
                r12 = 0
            L_0x0056:
                r7 = r12
                p9.q r12 = p9.q.this     // Catch:{ all -> 0x0053 }
                p9.f r5 = r12.f10821d     // Catch:{ all -> 0x0053 }
                int r6 = r12.f10820c     // Catch:{ all -> 0x0053 }
                t9.e r8 = r11.f10829a     // Catch:{ all -> 0x0053 }
                r5.v(r6, r7, r8, r9)     // Catch:{ all -> 0x0053 }
                p9.q r12 = p9.q.this
                p9.q$c r12 = r12.f10827j
                r12.o()
                return
            L_0x006a:
                p9.q r0 = p9.q.this
                p9.q$c r0 = r0.f10827j
                r0.o()
                throw r12
            L_0x0072:
                r12 = move-exception
                p9.q r1 = p9.q.this     // Catch:{ all -> 0x007b }
                p9.q$c r1 = r1.f10827j     // Catch:{ all -> 0x007b }
                r1.o()     // Catch:{ all -> 0x007b }
                throw r12     // Catch:{ all -> 0x007b }
            L_0x007b:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007b }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.q.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.f10829a.f12045b <= 0) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r1 == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r13.f10829a.f12045b <= 0) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r0.f10821d.v(r0.f10820c, true, (t9.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            r1 = r13.f10832d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r13.f10830b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
            r13.f10832d.f10821d.flush();
            r13.f10832d.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f10832d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f10825h.f10831c != false) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r13 = this;
                p9.q r0 = p9.q.this
                monitor-enter(r0)
                boolean r1 = r13.f10830b     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                p9.q r0 = p9.q.this
                p9.q$a r1 = r0.f10825h
                boolean r1 = r1.f10831c
                r2 = 1
                if (r1 != 0) goto L_0x0039
                t9.e r1 = r13.f10829a
                long r3 = r1.f12045b
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x001f
                r1 = r2
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
            L_0x0022:
                t9.e r0 = r13.f10829a
                long r0 = r0.f12045b
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x0039
                r13.a(r2)
                goto L_0x0022
            L_0x002e:
                p9.f r7 = r0.f10821d
                int r8 = r0.f10820c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.v(r8, r9, r10, r11)
            L_0x0039:
                p9.q r1 = p9.q.this
                monitor-enter(r1)
                r13.f10830b = r2     // Catch:{ all -> 0x004c }
                monitor-exit(r1)     // Catch:{ all -> 0x004c }
                p9.q r0 = p9.q.this
                p9.f r0 = r0.f10821d
                r0.flush()
                p9.q r0 = p9.q.this
                r0.a()
                return
            L_0x004c:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004c }
                throw r0
            L_0x004f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.q.a.close():void");
        }

        public final z e() {
            return q.this.f10827j;
        }

        public final void flush() {
            synchronized (q.this) {
                q.this.b();
            }
            while (this.f10829a.f12045b > 0) {
                a(false);
                q.this.f10821d.flush();
            }
        }

        public final void g(e eVar, long j10) {
            this.f10829a.g(eVar, j10);
            while (this.f10829a.f12045b >= 16384) {
                a(false);
            }
        }
    }

    public final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        public final e f10833a = new e();

        /* renamed from: b  reason: collision with root package name */
        public final e f10834b = new e();

        /* renamed from: c  reason: collision with root package name */
        public final long f10835c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10836d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10837e;

        public b(long j10) {
            this.f10835c = j10;
        }

        public final void close() {
            long j10;
            synchronized (q.this) {
                this.f10836d = true;
                e eVar = this.f10834b;
                j10 = eVar.f12045b;
                eVar.c();
                q.this.notifyAll();
            }
            if (j10 > 0) {
                q.this.f10821d.u(j10);
            }
            q.this.a();
        }

        public final z e() {
            return q.this.f10826i;
        }

        public final long z(e eVar, long j10) {
            Throwable th;
            long z9;
            while (true) {
                th = null;
                synchronized (q.this) {
                    q.this.f10826i.i();
                    try {
                        q qVar = q.this;
                        if (qVar.k != 0) {
                            th = qVar.f10828l;
                            if (th == null) {
                                th = new u(q.this.k);
                            }
                        }
                        if (!this.f10836d) {
                            e eVar2 = this.f10834b;
                            long j11 = eVar2.f12045b;
                            if (j11 > 0) {
                                z9 = eVar2.z(eVar, Math.min(8192, j11));
                                q qVar2 = q.this;
                                long j12 = qVar2.f10818a + z9;
                                qVar2.f10818a = j12;
                                if (th == null && j12 >= ((long) (qVar2.f10821d.f10759r.c() / 2))) {
                                    q qVar3 = q.this;
                                    qVar3.f10821d.E(qVar3.f10820c, qVar3.f10818a);
                                    q.this.f10818a = 0;
                                }
                            } else if (this.f10837e || th != null) {
                                z9 = -1;
                            } else {
                                q.this.i();
                            }
                        } else {
                            throw new IOException("stream closed");
                        }
                    } finally {
                        q.this.f10826i.o();
                    }
                }
            }
            q.this.f10826i.o();
            if (z9 != -1) {
                q.this.f10821d.u(z9);
                return z9;
            } else if (th == null) {
                return -1;
            } else {
                throw th;
            }
        }
    }

    public class c extends t9.c {
        public c() {
        }

        public final IOException m(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void n() {
            q.this.e(6);
            f fVar = q.this.f10821d;
            synchronized (fVar) {
                long j10 = fVar.f10755n;
                long j11 = fVar.f10754m;
                if (j10 >= j11) {
                    fVar.f10754m = j11 + 1;
                    fVar.f10756o = System.nanoTime() + 1000000000;
                    try {
                        fVar.f10750h.execute(new g(fVar, fVar.f10746d));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        public final void o() {
            if (l()) {
                throw m((IOException) null);
            }
        }
    }

    public q(int i10, f fVar, boolean z9, boolean z10, @Nullable p pVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f10822e = arrayDeque;
        this.f10826i = new c();
        this.f10827j = new c();
        if (fVar != null) {
            this.f10820c = i10;
            this.f10821d = fVar;
            this.f10819b = (long) fVar.f10760s.c();
            b bVar = new b((long) fVar.f10759r.c());
            this.f10824g = bVar;
            a aVar = new a();
            this.f10825h = aVar;
            bVar.f10837e = z10;
            aVar.f10831c = z9;
            if (pVar != null) {
                arrayDeque.add(pVar);
            }
            if (f() && pVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!f() && pVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public final void a() {
        boolean z9;
        boolean g10;
        synchronized (this) {
            b bVar = this.f10824g;
            if (!bVar.f10837e && bVar.f10836d) {
                a aVar = this.f10825h;
                if (aVar.f10831c || aVar.f10830b) {
                    z9 = true;
                    g10 = g();
                }
            }
            z9 = false;
            g10 = g();
        }
        if (z9) {
            c(6, (IOException) null);
        } else if (!g10) {
            this.f10821d.s(this.f10820c);
        }
    }

    public final void b() {
        a aVar = this.f10825h;
        if (aVar.f10830b) {
            throw new IOException("stream closed");
        } else if (aVar.f10831c) {
            throw new IOException("stream finished");
        } else if (this.k != 0) {
            Throwable th = this.f10828l;
            if (th == null) {
                th = new u(this.k);
            }
            throw th;
        }
    }

    public final void c(int i10, @Nullable IOException iOException) {
        if (d(i10, iOException)) {
            f fVar = this.f10821d;
            fVar.u.t(this.f10820c, i10);
        }
    }

    public final boolean d(int i10, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.f10824g.f10837e && this.f10825h.f10831c) {
                return false;
            }
            this.k = i10;
            this.f10828l = iOException;
            notifyAll();
            this.f10821d.s(this.f10820c);
            return true;
        }
    }

    public final void e(int i10) {
        if (d(i10, (IOException) null)) {
            this.f10821d.A(this.f10820c, i10);
        }
    }

    public final boolean f() {
        return this.f10821d.f10743a == ((this.f10820c & 1) == 1);
    }

    public final synchronized boolean g() {
        if (this.k != 0) {
            return false;
        }
        b bVar = this.f10824g;
        if (bVar.f10837e || bVar.f10836d) {
            a aVar = this.f10825h;
            if ((aVar.f10831c || aVar.f10830b) && this.f10823f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(j9.p r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f10823f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            p9.q$b r3 = r2.f10824g     // Catch:{ all -> 0x002e }
            r3.getClass()     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f10823f = r1     // Catch:{ all -> 0x002e }
            java.util.ArrayDeque r0 = r2.f10822e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            p9.q$b r3 = r2.f10824g     // Catch:{ all -> 0x002e }
            r3.f10837e = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.g()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            p9.f r3 = r2.f10821d
            int r4 = r2.f10820c
            r3.s(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.q.h(j9.p, boolean):void");
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
