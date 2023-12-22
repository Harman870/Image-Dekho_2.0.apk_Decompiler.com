package i4;

public final class sa extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final sa zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public e0 zze = e0.f7269b;

    static {
        sa saVar = new sa();
        zzb = saVar;
        c1.j(sa.class, saVar);
    }

    public static ra w() {
        return (ra) zzb.q();
    }

    public static sa y(e0 e0Var, p0 p0Var) {
        return (sa) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new sa();
        } else {
            if (i11 == 4) {
                return new ra(0);
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

    public final e0 z() {
        return this.zze;
    }
}
