package i4;

public class k1 {

    /* renamed from: a  reason: collision with root package name */
    public volatile b2 f7431a;

    /* renamed from: b  reason: collision with root package name */
    public volatile e0 f7432b;

    static {
        p0 p0Var = p0.f7582b;
    }

    public final e0 a() {
        if (this.f7432b != null) {
            return this.f7432b;
        }
        synchronized (this) {
            if (this.f7432b != null) {
                e0 e0Var = this.f7432b;
                return e0Var;
            }
            this.f7432b = this.f7431a == null ? e0.f7269b : this.f7431a.i();
            e0 e0Var2 = this.f7432b;
            return e0Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(i4.b2 r2) {
        /*
            r1 = this;
            i4.b2 r0 = r1.f7431a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            i4.b2 r0 = r1.f7431a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f7431a = r2     // Catch:{ i1 -> 0x0011 }
            i4.d0 r0 = i4.e0.f7269b     // Catch:{ i1 -> 0x0011 }
            r1.f7432b = r0     // Catch:{ i1 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f7431a = r2     // Catch:{ all -> 0x001b }
            i4.d0 r2 = i4.e0.f7269b     // Catch:{ all -> 0x001b }
            r1.f7432b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.k1.b(i4.b2):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        b2 b2Var = this.f7431a;
        b2 b2Var2 = k1Var.f7431a;
        if (b2Var == null && b2Var2 == null) {
            return a().equals(k1Var.a());
        }
        if (b2Var != null && b2Var2 != null) {
            return b2Var.equals(b2Var2);
        }
        if (b2Var != null) {
            k1Var.b(b2Var.g());
            return b2Var.equals(k1Var.f7431a);
        }
        b(b2Var2.g());
        return this.f7431a.equals(b2Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
