package m9;

import j9.d;
import j9.m;
import j9.u;
import j9.w;
import j9.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import k9.e;
import t9.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final u f9439a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9440b;

    /* renamed from: c  reason: collision with root package name */
    public final d f9441c;

    /* renamed from: d  reason: collision with root package name */
    public final m f9442d;

    /* renamed from: e  reason: collision with root package name */
    public final a f9443e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Object f9444f;

    /* renamed from: g  reason: collision with root package name */
    public x f9445g;

    /* renamed from: h  reason: collision with root package name */
    public d f9446h;

    /* renamed from: i  reason: collision with root package name */
    public e f9447i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public c f9448j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9449l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9450m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9451n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9452o;

    public class a extends c {
        public a() {
        }

        public final void n() {
            i.this.a();
        }
    }

    public static final class b extends WeakReference<i> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f9453a;

        public b(i iVar, Object obj) {
            super(iVar);
            this.f9453a = obj;
        }
    }

    public i(u uVar, w wVar) {
        a aVar = new a();
        this.f9443e = aVar;
        this.f9439a = uVar;
        u.a aVar2 = k9.a.f9148a;
        y0.c cVar = uVar.f8994p;
        aVar2.getClass();
        this.f9440b = (f) cVar.f13011a;
        this.f9441c = wVar;
        this.f9442d = (m) uVar.f8985f.f12184b;
        aVar.g((long) 0, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        c cVar;
        e eVar;
        synchronized (this.f9440b) {
            this.f9450m = true;
            cVar = this.f9448j;
            d dVar = this.f9446h;
            if (dVar == null || (eVar = dVar.f9403g) == null) {
                eVar = this.f9447i;
            }
        }
        if (cVar != null) {
            cVar.f9385d.cancel();
        } else if (eVar != null) {
            e.d(eVar.f9408d);
        }
    }

    public final void b() {
        synchronized (this.f9440b) {
            if (!this.f9452o) {
                this.f9448j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return d(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r7;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException c(m9.c r4, boolean r5, boolean r6, @javax.annotation.Nullable java.io.IOException r7) {
        /*
            r3 = this;
            m9.f r0 = r3.f9440b
            monitor-enter(r0)
            m9.c r1 = r3.f9448j     // Catch:{ all -> 0x003d }
            if (r4 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r7
        L_0x0009:
            r4 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0013
            boolean r5 = r3.k     // Catch:{ all -> 0x003d }
            r5 = r5 ^ r2
            r3.k = r2     // Catch:{ all -> 0x003d }
            goto L_0x0014
        L_0x0013:
            r5 = r4
        L_0x0014:
            if (r6 == 0) goto L_0x001d
            boolean r6 = r3.f9449l     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x001b
            r5 = r2
        L_0x001b:
            r3.f9449l = r2     // Catch:{ all -> 0x003d }
        L_0x001d:
            boolean r6 = r3.k     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            boolean r6 = r3.f9449l     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            m9.e r5 = r1.a()     // Catch:{ all -> 0x003d }
            int r6 = r5.f9416m     // Catch:{ all -> 0x003d }
            int r6 = r6 + r2
            r5.f9416m = r6     // Catch:{ all -> 0x003d }
            r5 = 0
            r3.f9448j = r5     // Catch:{ all -> 0x003d }
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003c
            java.io.IOException r7 = r3.d(r7, r4)
        L_0x003c:
            return r7
        L_0x003d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.i.c(m9.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @Nullable
    public final IOException d(@Nullable IOException iOException, boolean z9) {
        e eVar;
        Socket socket;
        boolean z10;
        synchronized (this.f9440b) {
            if (z9) {
                if (this.f9448j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            eVar = this.f9447i;
            if (eVar == null || this.f9448j != null || (!z9 && !this.f9452o)) {
                socket = null;
            } else {
                socket = f();
            }
            if (this.f9447i != null) {
                eVar = null;
            }
            z10 = true;
            if (!this.f9452o || this.f9448j != null) {
                z10 = false;
            }
        }
        e.d(socket);
        if (eVar != null) {
            this.f9442d.getClass();
        }
        if (z10) {
            if (!this.f9451n && this.f9443e.l()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            this.f9442d.getClass();
        }
        return iOException;
    }

    @Nullable
    public final IOException e(@Nullable IOException iOException) {
        synchronized (this.f9440b) {
            this.f9452o = true;
        }
        return d(iOException, false);
    }

    @Nullable
    public final Socket f() {
        int size = this.f9447i.f9419p.size();
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((Reference) this.f9447i.f9419p.get(i10)).get() == this) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            e eVar = this.f9447i;
            eVar.f9419p.remove(i10);
            this.f9447i = null;
            if (eVar.f9419p.isEmpty()) {
                eVar.f9420q = System.nanoTime();
                f fVar = this.f9440b;
                fVar.getClass();
                if (eVar.k || fVar.f9422a == 0) {
                    fVar.f9425d.remove(eVar);
                    z9 = true;
                } else {
                    fVar.notifyAll();
                }
                if (z9) {
                    return eVar.f9409e;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }
}
