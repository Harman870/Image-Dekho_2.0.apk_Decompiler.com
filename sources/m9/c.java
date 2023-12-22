package m9;

import androidx.activity.f;
import j9.b0;
import j9.d;
import j9.m;
import java.io.IOException;
import java.net.ProtocolException;
import javax.annotation.Nullable;
import t9.e;
import t9.i;
import t9.j;
import t9.x;
import t9.y;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final i f9382a;

    /* renamed from: b  reason: collision with root package name */
    public final m f9383b;

    /* renamed from: c  reason: collision with root package name */
    public final d f9384c;

    /* renamed from: d  reason: collision with root package name */
    public final n9.c f9385d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9386e;

    public final class a extends i {

        /* renamed from: b  reason: collision with root package name */
        public boolean f9387b;

        /* renamed from: c  reason: collision with root package name */
        public long f9388c;

        /* renamed from: d  reason: collision with root package name */
        public long f9389d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9390e;

        public a(x xVar, long j10) {
            super(xVar);
            this.f9388c = j10;
        }

        @Nullable
        public final IOException a(@Nullable IOException iOException) {
            if (this.f9387b) {
                return iOException;
            }
            this.f9387b = true;
            c cVar = c.this;
            if (iOException != null) {
                cVar.c(iOException);
            }
            cVar.f9383b.getClass();
            return cVar.f9382a.c(cVar, true, false, iOException);
        }

        public final void close() {
            if (!this.f9390e) {
                this.f9390e = true;
                long j10 = this.f9388c;
                if (j10 == -1 || this.f9389d == j10) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        public final void g(e eVar, long j10) {
            if (!this.f9390e) {
                long j11 = this.f9388c;
                if (j11 == -1 || this.f9389d + j10 <= j11) {
                    try {
                        this.f12052a.g(eVar, j10);
                        this.f9389d += j10;
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    StringBuilder g10 = f.g("expected ");
                    g10.append(this.f9388c);
                    g10.append(" bytes but received ");
                    g10.append(this.f9389d + j10);
                    throw new ProtocolException(g10.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public final class b extends j {

        /* renamed from: b  reason: collision with root package name */
        public final long f9392b;

        /* renamed from: c  reason: collision with root package name */
        public long f9393c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9394d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9395e;

        public b(y yVar, long j10) {
            super(yVar);
            this.f9392b = j10;
            if (j10 == 0) {
                a((IOException) null);
            }
        }

        @Nullable
        public final IOException a(@Nullable IOException iOException) {
            if (this.f9394d) {
                return iOException;
            }
            this.f9394d = true;
            c cVar = c.this;
            if (iOException != null) {
                cVar.c(iOException);
            }
            cVar.f9383b.getClass();
            return cVar.f9382a.c(cVar, false, true, iOException);
        }

        public final void close() {
            if (!this.f9395e) {
                this.f9395e = true;
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
        }

        public final long z(e eVar, long j10) {
            if (!this.f9395e) {
                try {
                    long z9 = this.f12053a.z(eVar, 8192);
                    if (z9 == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j11 = this.f9393c + z9;
                    long j12 = this.f9392b;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.f9392b + " bytes but received " + j11);
                        }
                    }
                    this.f9393c = j11;
                    if (j11 == j12) {
                        a((IOException) null);
                    }
                    return z9;
                } catch (IOException e10) {
                    throw a(e10);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public c(i iVar, d dVar, m mVar, d dVar2, n9.c cVar) {
        this.f9382a = iVar;
        this.f9383b = mVar;
        this.f9384c = dVar2;
        this.f9385d = cVar;
    }

    public final e a() {
        return this.f9385d.h();
    }

    @Nullable
    public final b0.a b(boolean z9) {
        try {
            b0.a g10 = this.f9385d.g(z9);
            if (g10 != null) {
                k9.a.f9148a.getClass();
                g10.f8844m = this;
            }
            return g10;
        } catch (IOException e10) {
            this.f9383b.getClass();
            c(e10);
            throw e10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6 > 1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.io.IOException r6) {
        /*
            r5 = this;
            m9.d r0 = r5.f9384c
            m9.f r1 = r0.f9399c
            monitor-enter(r1)
            r2 = 1
            r0.f9404h = r2     // Catch:{ all -> 0x0051 }
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            n9.c r0 = r5.f9385d
            m9.e r0 = r0.h()
            m9.f r3 = r0.f9406b
            monitor-enter(r3)
            boolean r1 = r6 instanceof p9.u     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x002b
            p9.u r6 = (p9.u) r6     // Catch:{ all -> 0x004e }
            int r6 = r6.f10854a     // Catch:{ all -> 0x004e }
            r1 = 5
            if (r6 != r1) goto L_0x0027
            int r6 = r0.f9417n     // Catch:{ all -> 0x004e }
            int r6 = r6 + r2
            r0.f9417n = r6     // Catch:{ all -> 0x004e }
            if (r6 <= r2) goto L_0x004c
        L_0x0024:
            r0.k = r2     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0027:
            r1 = 6
            if (r6 == r1) goto L_0x004c
            goto L_0x0024
        L_0x002b:
            p9.f r1 = r0.f9412h     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0031
            r1 = r2
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x0038
            boolean r1 = r6 instanceof p9.a     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004c
        L_0x0038:
            r0.k = r2     // Catch:{ all -> 0x004e }
            int r1 = r0.f9416m     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x004c
            if (r6 == 0) goto L_0x0047
            m9.f r1 = r0.f9406b     // Catch:{ all -> 0x004e }
            j9.e0 r4 = r0.f9407c     // Catch:{ all -> 0x004e }
            r1.a(r4, r6)     // Catch:{ all -> 0x004e }
        L_0x0047:
            int r6 = r0.f9415l     // Catch:{ all -> 0x004e }
            int r6 = r6 + r2
            r0.f9415l = r6     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r6
        L_0x0051:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.c(java.io.IOException):void");
    }
}
