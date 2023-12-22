package f2;

public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6341a;

    /* renamed from: b  reason: collision with root package name */
    public final e f6342b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f6343c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f6344d;

    /* renamed from: e  reason: collision with root package name */
    public int f6345e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f6346f = 3;

    public b(Object obj, e eVar) {
        this.f6341a = obj;
        this.f6342b = eVar;
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f6341a) {
            if (!this.f6343c.a()) {
                if (!this.f6344d.a()) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        return z9;
    }

    public final void b(d dVar) {
        synchronized (this.f6341a) {
            if (dVar.equals(this.f6343c)) {
                this.f6345e = 4;
            } else if (dVar.equals(this.f6344d)) {
                this.f6346f = 4;
            }
            e eVar = this.f6342b;
            if (eVar != null) {
                eVar.b(this);
            }
        }
    }

    public final boolean c(d dVar) {
        boolean z9;
        synchronized (this.f6341a) {
            e eVar = this.f6342b;
            if (eVar != null) {
                if (!eVar.c(this)) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        return z9;
    }

    public final void clear() {
        synchronized (this.f6341a) {
            this.f6345e = 3;
            this.f6343c.clear();
            if (this.f6346f != 3) {
                this.f6346f = 3;
                this.f6344d.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(f2.d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6341a
            monitor-enter(r0)
            f2.e r1 = r5.f6342b     // Catch:{ all -> 0x0038 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.d(r5)     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            if (r1 == 0) goto L_0x0036
            int r1 = r5.f6345e     // Catch:{ all -> 0x0038 }
            r4 = 5
            if (r1 == r4) goto L_0x0021
            f2.d r1 = r5.f6343c     // Catch:{ all -> 0x0038 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0033
        L_0x0021:
            f2.d r1 = r5.f6344d     // Catch:{ all -> 0x0038 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x0032
            int r6 = r5.f6346f     // Catch:{ all -> 0x0038 }
            r1 = 4
            if (r6 == r1) goto L_0x0030
            if (r6 != r4) goto L_0x0032
        L_0x0030:
            r6 = r3
            goto L_0x0033
        L_0x0032:
            r6 = r2
        L_0x0033:
            if (r6 == 0) goto L_0x0036
            r2 = r3
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r2
        L_0x0038:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.d(f2.d):boolean");
    }

    public final boolean e(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f6343c.e(bVar.f6343c) && this.f6344d.e(bVar.f6344d);
    }

    public final boolean f() {
        boolean z9;
        synchronized (this.f6341a) {
            z9 = this.f6345e == 3 && this.f6346f == 3;
        }
        return z9;
    }

    public final void g() {
        synchronized (this.f6341a) {
            if (this.f6345e == 1) {
                this.f6345e = 2;
                this.f6343c.g();
            }
            if (this.f6346f == 1) {
                this.f6346f = 2;
                this.f6344d.g();
            }
        }
    }

    public final e getRoot() {
        e root;
        synchronized (this.f6341a) {
            e eVar = this.f6342b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    public final void h() {
        synchronized (this.f6341a) {
            if (this.f6345e != 1) {
                this.f6345e = 1;
                this.f6343c.h();
            }
        }
    }

    public final boolean i() {
        boolean z9;
        synchronized (this.f6341a) {
            if (this.f6345e != 4) {
                if (this.f6346f != 4) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        return z9;
    }

    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6341a) {
            z9 = true;
            if (this.f6345e != 1) {
                if (this.f6346f != 1) {
                    z9 = false;
                }
            }
        }
        return z9;
    }

    public final boolean j(d dVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6341a) {
            e eVar = this.f6342b;
            z9 = false;
            if (eVar != null) {
                if (!eVar.j(this)) {
                    z10 = false;
                    if (z10 && dVar.equals(this.f6343c)) {
                        z9 = true;
                    }
                }
            }
            z10 = true;
            z9 = true;
        }
        return z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(f2.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6341a
            monitor-enter(r0)
            f2.d r1 = r2.f6344d     // Catch:{ all -> 0x0027 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0027 }
            r1 = 5
            if (r3 != 0) goto L_0x001c
            r2.f6345e = r1     // Catch:{ all -> 0x0027 }
            int r3 = r2.f6346f     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r3 == r1) goto L_0x001a
            r2.f6346f = r1     // Catch:{ all -> 0x0027 }
            f2.d r3 = r2.f6344d     // Catch:{ all -> 0x0027 }
            r3.h()     // Catch:{ all -> 0x0027 }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x001c:
            r2.f6346f = r1     // Catch:{ all -> 0x0027 }
            f2.e r3 = r2.f6342b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0025
            r3.k(r2)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.k(f2.d):void");
    }
}
