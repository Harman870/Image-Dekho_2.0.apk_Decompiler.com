package i4;

public final class ha extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final ha zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        ha haVar = new ha();
        zzb = haVar;
        c1.j(ha.class, haVar);
    }

    public static ga w() {
        return (ga) zzb.q();
    }

    public static ha y(e0 e0Var, p0 p0Var) {
        return (ha) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new ha();
        } else {
            if (i11 == 4) {
                return new ga(0);
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
