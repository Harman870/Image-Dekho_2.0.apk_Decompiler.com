package i4;

public final class rb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final rb zzb;
    /* access modifiers changed from: private */
    public tb zzd;

    static {
        rb rbVar = new rb();
        zzb = rbVar;
        c1.j(rb.class, rbVar);
    }

    public static qb v() {
        return (qb) zzb.q();
    }

    public static rb x(e0 e0Var, p0 p0Var) {
        return (rb) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new rb();
        } else {
            if (i11 == 4) {
                return new qb(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final tb y() {
        tb tbVar = this.zzd;
        return tbVar == null ? tb.x() : tbVar;
    }
}
