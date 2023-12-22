package i4;

public final class q9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final q9 zzb;
    /* access modifiers changed from: private */
    public v9 zzd;
    /* access modifiers changed from: private */
    public nb zze;

    static {
        q9 q9Var = new q9();
        zzb = q9Var;
        c1.j(q9.class, q9Var);
    }

    public static p9 v() {
        return (p9) zzb.q();
    }

    public static q9 x(e0 e0Var, p0 p0Var) {
        return (q9) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new q9();
        } else {
            if (i11 == 4) {
                return new p9(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final v9 y() {
        v9 v9Var = this.zzd;
        return v9Var == null ? v9.y() : v9Var;
    }

    public final nb z() {
        nb nbVar = this.zze;
        return nbVar == null ? nb.y() : nbVar;
    }
}
