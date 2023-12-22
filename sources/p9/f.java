package p9;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p9.p;
import p9.t;
import t9.g;

public final class f implements Closeable {

    /* renamed from: x  reason: collision with root package name */
    public static final ThreadPoolExecutor f10742x;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10743a;

    /* renamed from: b  reason: collision with root package name */
    public final d f10744b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f10745c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f10746d;

    /* renamed from: e  reason: collision with root package name */
    public int f10747e;

    /* renamed from: f  reason: collision with root package name */
    public int f10748f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10749g;

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f10750h;

    /* renamed from: i  reason: collision with root package name */
    public final ThreadPoolExecutor f10751i;

    /* renamed from: j  reason: collision with root package name */
    public final t.a f10752j;
    public long k = 0;

    /* renamed from: l  reason: collision with root package name */
    public long f10753l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f10754m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f10755n = 0;

    /* renamed from: o  reason: collision with root package name */
    public long f10756o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f10757p = 0;

    /* renamed from: q  reason: collision with root package name */
    public long f10758q;

    /* renamed from: r  reason: collision with root package name */
    public g0.e f10759r = new g0.e();

    /* renamed from: s  reason: collision with root package name */
    public final g0.e f10760s;

    /* renamed from: t  reason: collision with root package name */
    public final Socket f10761t;
    public final r u;

    /* renamed from: v  reason: collision with root package name */
    public final C0128f f10762v;
    public final LinkedHashSet w;

    public class a extends k9.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f10763b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f10764c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, int i10, long j10) {
            super("OkHttp Window Update %s stream %d", objArr);
            this.f10763b = i10;
            this.f10764c = j10;
        }

        public final void a() {
            try {
                f.this.u.u(this.f10763b, this.f10764c);
            } catch (IOException e10) {
                f.this.c(e10);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Socket f10766a;

        /* renamed from: b  reason: collision with root package name */
        public String f10767b;

        /* renamed from: c  reason: collision with root package name */
        public g f10768c;

        /* renamed from: d  reason: collision with root package name */
        public t9.f f10769d;

        /* renamed from: e  reason: collision with root package name */
        public d f10770e = d.f10773a;

        /* renamed from: f  reason: collision with root package name */
        public int f10771f;
    }

    public final class c extends k9.b {
        public c() {
            super("OkHttp %s ping", f.this.f10746d);
        }

        public final void a() {
            f fVar;
            boolean z9;
            synchronized (f.this) {
                fVar = f.this;
                long j10 = fVar.f10753l;
                long j11 = fVar.k;
                if (j10 < j11) {
                    z9 = true;
                } else {
                    fVar.k = j11 + 1;
                    z9 = false;
                }
            }
            if (z9) {
                fVar.a(2, 2, (IOException) null);
                return;
            }
            try {
                fVar.u.s(1, 0, false);
            } catch (IOException e10) {
                fVar.a(2, 2, e10);
            }
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10773a = new a();

        public class a extends d {
            public final void b(q qVar) {
                qVar.c(5, (IOException) null);
            }
        }

        public void a(f fVar) {
        }

        public abstract void b(q qVar);
    }

    public final class e extends k9.b {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10774b = true;

        /* renamed from: c  reason: collision with root package name */
        public final int f10775c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10776d;

        public e(int i10, int i11) {
            super("OkHttp %s ping %08x%08x", f.this.f10746d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f10775c = i10;
            this.f10776d = i11;
        }

        public final void a() {
            f fVar = f.this;
            boolean z9 = this.f10774b;
            int i10 = this.f10775c;
            int i11 = this.f10776d;
            fVar.getClass();
            try {
                fVar.u.s(i10, i11, z9);
            } catch (IOException e10) {
                fVar.a(2, 2, e10);
            }
        }
    }

    /* renamed from: p9.f$f  reason: collision with other inner class name */
    public class C0128f extends k9.b implements p.b {

        /* renamed from: b  reason: collision with root package name */
        public final p f10778b;

        public C0128f(p pVar) {
            super("OkHttp %s", f.this.f10746d);
            this.f10778b = pVar;
        }

        public final void a() {
            try {
                this.f10778b.j(this);
                do {
                } while (this.f10778b.c(false, this));
                f.this.a(1, 6, (IOException) null);
            } catch (IOException e10) {
                f.this.a(2, 2, e10);
            } catch (Throwable th) {
                f.this.a(3, 3, (IOException) null);
                k9.e.c(this.f10778b);
                throw th;
            }
            k9.e.c(this.f10778b);
        }
    }

    static {
        Class<f> cls = f.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = k9.e.f9152a;
        f10742x = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new k9.c("OkHttp Http2Connection", true));
    }

    public f(b bVar) {
        b bVar2 = bVar;
        g0.e eVar = new g0.e();
        this.f10760s = eVar;
        this.w = new LinkedHashSet();
        this.f10752j = t.f10853a;
        this.f10743a = true;
        this.f10744b = bVar2.f10770e;
        this.f10748f = 3;
        this.f10759r.d(7, 16777216);
        String str = bVar2.f10767b;
        this.f10746d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new k9.c(k9.e.j("OkHttp %s Writer", str), false));
        this.f10750h = scheduledThreadPoolExecutor;
        if (bVar2.f10771f != 0) {
            c cVar = new c();
            long j10 = (long) bVar2.f10771f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(cVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f10751i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k9.c(k9.e.j("OkHttp %s Push Observer", str), true));
        eVar.d(7, 65535);
        eVar.d(5, 16384);
        this.f10758q = (long) eVar.c();
        this.f10761t = bVar2.f10766a;
        this.u = new r(bVar2.f10769d, true);
        this.f10762v = new C0128f(new p(bVar2.f10768c, true));
    }

    public final void A(int i10, int i11) {
        try {
            this.f10750h.execute(new e(this, new Object[]{this.f10746d, Integer.valueOf(i10)}, i10, i11));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void E(int i10, long j10) {
        try {
            this.f10750h.execute(new a(new Object[]{this.f10746d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, int r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r3 = this;
            r3.t(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = r3.f10745c     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.LinkedHashMap r4 = r3.f10745c     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.f10745c     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            p9.q[] r0 = new p9.q[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            p9.q[] r4 = (p9.q[]) r4     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.f10745c     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            p9.r r4 = r3.u     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.f10761t     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.f10750h
            r4.shutdown()
            java.util.concurrent.ThreadPoolExecutor r4 = r3.f10751i
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.f.a(int, int, java.io.IOException):void");
    }

    public final void c(@Nullable IOException iOException) {
        a(2, 2, iOException);
    }

    public final void close() {
        a(1, 6, (IOException) null);
    }

    public final void flush() {
        r rVar = this.u;
        synchronized (rVar) {
            if (!rVar.f10844e) {
                rVar.f10840a.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized q j(int i10) {
        return (q) this.f10745c.get(Integer.valueOf(i10));
    }

    public final synchronized void o(k9.b bVar) {
        if (!this.f10749g) {
            this.f10751i.execute(bVar);
        }
    }

    public final synchronized q s(int i10) {
        q qVar;
        qVar = (q) this.f10745c.remove(Integer.valueOf(i10));
        notifyAll();
        return qVar;
    }

    public final void t(int i10) {
        synchronized (this.u) {
            synchronized (this) {
                if (!this.f10749g) {
                    this.f10749g = true;
                    int i11 = this.f10747e;
                    this.u.o(i11, i10, k9.e.f9152a);
                }
            }
        }
    }

    public final synchronized void u(long j10) {
        long j11 = this.f10757p + j10;
        this.f10757p = j11;
        if (j11 >= ((long) (this.f10759r.c() / 2))) {
            E(0, this.f10757p);
            this.f10757p = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.u.f10843d);
        r6 = (long) r2;
        r8.f10758q -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(int r9, boolean r10, t9.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            p9.r r12 = r8.u
            r12.c(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0065
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f10758q     // Catch:{ InterruptedException -> 0x0056 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.LinkedHashMap r2 = r8.f10745c     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r2 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0030:
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0054 }
            int r2 = (int) r4     // Catch:{ all -> 0x0054 }
            p9.r r4 = r8.u     // Catch:{ all -> 0x0054 }
            int r4 = r4.f10843d     // Catch:{ all -> 0x0054 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0054 }
            long r4 = r8.f10758q     // Catch:{ all -> 0x0054 }
            long r6 = (long) r2     // Catch:{ all -> 0x0054 }
            long r4 = r4 - r6
            r8.f10758q = r4     // Catch:{ all -> 0x0054 }
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            long r12 = r12 - r6
            p9.r r4 = r8.u
            if (r10 == 0) goto L_0x004f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = r3
        L_0x0050:
            r4.c(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0054:
            r9 = move-exception
            goto L_0x0063
        L_0x0056:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            r9.interrupt()     // Catch:{ all -> 0x0054 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0054 }
            r9.<init>()     // Catch:{ all -> 0x0054 }
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            throw r9
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.f.v(int, boolean, t9.e, long):void");
    }
}
