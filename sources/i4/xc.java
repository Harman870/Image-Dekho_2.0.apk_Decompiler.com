package i4;

public final class xc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final xc zzb;
    private int zzd;

    static {
        xc xcVar = new xc();
        zzb = xcVar;
        c1.j(xc.class, xcVar);
    }

    public static xc w() {
        return zzb;
    }

    public static xc x(e0 e0Var, p0 p0Var) {
        return (xc) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new xc();
        } else {
            if (i11 == 4) {
                return new wc();
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
