package i4;

public final class t9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final t9 zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private x9 zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        t9 t9Var = new t9();
        zzb = t9Var;
        c1.j(t9.class, t9Var);
    }

    public static /* synthetic */ void D(t9 t9Var, x9 x9Var) {
        x9Var.getClass();
        t9Var.zze = x9Var;
    }

    public static s9 w() {
        return (s9) zzb.q();
    }

    public static t9 y() {
        return zzb;
    }

    public static t9 z(e0 e0Var, p0 p0Var) {
        return (t9) c1.t(zzb, e0Var, p0Var);
    }

    public final x9 A() {
        x9 x9Var = this.zze;
        return x9Var == null ? x9.y() : x9Var;
    }

    public final e0 B() {
        return this.zzf;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new t9();
        } else {
            if (i11 == 4) {
                return new s9(0);
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
