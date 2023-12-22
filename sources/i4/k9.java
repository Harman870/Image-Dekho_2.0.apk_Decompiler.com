package i4;

public final class k9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final k9 zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public m9 zze;

    static {
        k9 k9Var = new k9();
        zzb = k9Var;
        c1.j(k9.class, k9Var);
    }

    public static j9 w() {
        return (j9) zzb.q();
    }

    public static k9 y(e0 e0Var, p0 p0Var) {
        return (k9) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new k9();
        } else {
            if (i11 == 4) {
                return new j9(0);
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

    public final m9 z() {
        m9 m9Var = this.zze;
        return m9Var == null ? m9.y() : m9Var;
    }
}
