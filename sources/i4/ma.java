package i4;

public final class ma extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final ma zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        ma maVar = new ma();
        zzb = maVar;
        c1.j(ma.class, maVar);
    }

    public static la w() {
        return (la) zzb.q();
    }

    public static ma y(e0 e0Var, p0 p0Var) {
        return (ma) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        } else if (i11 == 3) {
            return new ma();
        } else {
            if (i11 == 4) {
                return new la(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zzd;
    }
}
