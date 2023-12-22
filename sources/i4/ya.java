package i4;

public final class ya extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final ya zzb;
    /* access modifiers changed from: private */
    public bb zzd;

    static {
        ya yaVar = new ya();
        zzb = yaVar;
        c1.j(ya.class, yaVar);
    }

    public static xa v() {
        return (xa) zzb.q();
    }

    public static ya x(e0 e0Var, p0 p0Var) {
        return (ya) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new ya();
        } else {
            if (i11 == 4) {
                return new xa(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final bb y() {
        bb bbVar = this.zzd;
        return bbVar == null ? bb.y() : bbVar;
    }
}
