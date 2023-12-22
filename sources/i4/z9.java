package i4;

public final class z9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final z9 zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private da zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        z9 z9Var = new z9();
        zzb = z9Var;
        c1.j(z9.class, z9Var);
    }

    public static /* synthetic */ void C(z9 z9Var, da daVar) {
        daVar.getClass();
        z9Var.zze = daVar;
    }

    public static y9 w() {
        return (y9) zzb.q();
    }

    public static z9 y(e0 e0Var, p0 p0Var) {
        return (z9) c1.t(zzb, e0Var, p0Var);
    }

    public final e0 A() {
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
            return new z9();
        } else {
            if (i11 == 4) {
                return new y9(0);
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

    public final da z() {
        da daVar = this.zze;
        return daVar == null ? da.y() : daVar;
    }
}
