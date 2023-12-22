package i4;

public final class i9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final i9 zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public e0 zze = e0.f7269b;
    private m9 zzf;

    static {
        i9 i9Var = new i9();
        zzb = i9Var;
        c1.j(i9.class, i9Var);
    }

    public static /* synthetic */ void D(i9 i9Var, m9 m9Var) {
        m9Var.getClass();
        i9Var.zzf = m9Var;
    }

    public static h9 w() {
        return (h9) zzb.q();
    }

    public static i9 y(e0 e0Var, p0 p0Var) {
        return (i9) c1.t(zzb, e0Var, p0Var);
    }

    public final e0 A() {
        return this.zze;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new i9();
        } else {
            if (i11 == 4) {
                return new h9(0);
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
        m9 m9Var = this.zzf;
        return m9Var == null ? m9.y() : m9Var;
    }
}
