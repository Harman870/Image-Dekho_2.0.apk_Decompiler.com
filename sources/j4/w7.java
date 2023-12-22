package j4;

public class w7 {

    /* renamed from: a  reason: collision with root package name */
    public volatile n8 f8541a;

    /* renamed from: b  reason: collision with root package name */
    public volatile q6 f8542b;

    static {
        y6 y6Var = y6.f8567b;
    }

    public final q6 a() {
        if (this.f8542b != null) {
            return this.f8542b;
        }
        synchronized (this) {
            if (this.f8542b != null) {
                q6 q6Var = this.f8542b;
                return q6Var;
            }
            this.f8542b = this.f8541a == null ? q6.f8402b : this.f8541a.d();
            q6 q6Var2 = this.f8542b;
            return q6Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(j4.n8 r2) {
        /*
            r1 = this;
            j4.n8 r0 = r1.f8541a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            j4.n8 r0 = r1.f8541a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f8541a = r2     // Catch:{ u7 -> 0x0011 }
            j4.o6 r0 = j4.q6.f8402b     // Catch:{ u7 -> 0x0011 }
            r1.f8542b = r0     // Catch:{ u7 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f8541a = r2     // Catch:{ all -> 0x001b }
            j4.o6 r2 = j4.q6.f8402b     // Catch:{ all -> 0x001b }
            r1.f8542b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: j4.w7.b(j4.n8):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        n8 n8Var = this.f8541a;
        n8 n8Var2 = w7Var.f8541a;
        if (n8Var == null && n8Var2 == null) {
            return a().equals(w7Var.a());
        }
        if (n8Var != null && n8Var2 != null) {
            return n8Var.equals(n8Var2);
        }
        if (n8Var != null) {
            w7Var.b(n8Var.b());
            return n8Var.equals(w7Var.f8541a);
        }
        b(n8Var2.b());
        return this.f8541a.equals(n8Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
