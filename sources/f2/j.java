package f2;

import androidx.fragment.app.v0;

public final class j implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final e f6370a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6371b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f6372c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f6373d;

    /* renamed from: e  reason: collision with root package name */
    public int f6374e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f6375f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6376g;

    public j(Object obj, e eVar) {
        this.f6371b = obj;
        this.f6370a = eVar;
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f6371b) {
            if (!this.f6373d.a()) {
                if (!this.f6372c.a()) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        return z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(f2.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6371b
            monitor-enter(r0)
            f2.d r1 = r2.f6373d     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0028 }
            r1 = 4
            if (r3 == 0) goto L_0x0010
            r2.f6375f = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0010:
            r2.f6374e = r1     // Catch:{ all -> 0x0028 }
            f2.e r3 = r2.f6370a     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0019
            r3.b(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            int r3 = r2.f6375f     // Catch:{ all -> 0x0028 }
            boolean r3 = androidx.fragment.app.v0.a(r3)     // Catch:{ all -> 0x0028 }
            if (r3 != 0) goto L_0x0026
            f2.d r3 = r2.f6373d     // Catch:{ all -> 0x0028 }
            r3.clear()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.j.b(f2.d):void");
    }

    public final boolean c(d dVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6371b) {
            e eVar = this.f6370a;
            z9 = false;
            if (eVar != null) {
                if (!eVar.c(this)) {
                    z10 = false;
                    if (z10 && (dVar.equals(this.f6372c) || this.f6374e != 4)) {
                        z9 = true;
                    }
                }
            }
            z10 = true;
            z9 = true;
        }
        return z9;
    }

    public final void clear() {
        synchronized (this.f6371b) {
            this.f6376g = false;
            this.f6374e = 3;
            this.f6375f = 3;
            this.f6373d.clear();
            this.f6372c.clear();
        }
    }

    public final boolean d(d dVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6371b) {
            e eVar = this.f6370a;
            z9 = false;
            if (eVar != null) {
                if (!eVar.d(this)) {
                    z10 = false;
                    if (z10 && dVar.equals(this.f6372c) && !a()) {
                        z9 = true;
                    }
                }
            }
            z10 = true;
            z9 = true;
        }
        return z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(f2.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof f2.j
            r1 = 0
            if (r0 == 0) goto L_0x002e
            f2.j r4 = (f2.j) r4
            f2.d r0 = r3.f6372c
            if (r0 != 0) goto L_0x0010
            f2.d r0 = r4.f6372c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            f2.d r0 = r3.f6372c
            f2.d r2 = r4.f6372c
            boolean r0 = r0.e(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            f2.d r0 = r3.f6373d
            if (r0 != 0) goto L_0x0023
            f2.d r4 = r4.f6373d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            f2.d r0 = r3.f6373d
            f2.d r4 = r4.f6373d
            boolean r4 = r0.e(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.j.e(f2.d):boolean");
    }

    public final boolean f() {
        boolean z9;
        synchronized (this.f6371b) {
            z9 = this.f6374e == 3;
        }
        return z9;
    }

    public final void g() {
        synchronized (this.f6371b) {
            if (!v0.a(this.f6375f)) {
                this.f6375f = 2;
                this.f6373d.g();
            }
            if (!v0.a(this.f6374e)) {
                this.f6374e = 2;
                this.f6372c.g();
            }
        }
    }

    public final e getRoot() {
        e root;
        synchronized (this.f6371b) {
            e eVar = this.f6370a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    public final void h() {
        synchronized (this.f6371b) {
            this.f6376g = true;
            try {
                if (!(this.f6374e == 4 || this.f6375f == 1)) {
                    this.f6375f = 1;
                    this.f6373d.h();
                }
                if (this.f6376g && this.f6374e != 1) {
                    this.f6374e = 1;
                    this.f6372c.h();
                }
            } finally {
                this.f6376g = false;
            }
        }
    }

    public final boolean i() {
        boolean z9;
        synchronized (this.f6371b) {
            z9 = this.f6374e == 4;
        }
        return z9;
    }

    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6371b) {
            z9 = true;
            if (this.f6374e != 1) {
                z9 = false;
            }
        }
        return z9;
    }

    public final boolean j(d dVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6371b) {
            e eVar = this.f6370a;
            z9 = false;
            if (eVar != null) {
                if (!eVar.j(this)) {
                    z10 = false;
                    if (z10 && dVar.equals(this.f6372c) && this.f6374e != 2) {
                        z9 = true;
                    }
                }
            }
            z10 = true;
            z9 = true;
        }
        return z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(f2.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6371b
            monitor-enter(r0)
            f2.d r1 = r2.f6372c     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x0010
            r2.f6375f = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0010:
            r2.f6374e = r1     // Catch:{ all -> 0x001b }
            f2.e r3 = r2.f6370a     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0019
            r3.k(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.j.k(f2.d):void");
    }
}
