package i4;

public final class o9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final o9 zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public t9 zze;
    private lb zzf;

    static {
        o9 o9Var = new o9();
        zzb = o9Var;
        c1.j(o9.class, o9Var);
    }

    public static /* synthetic */ void D(o9 o9Var, lb lbVar) {
        lbVar.getClass();
        o9Var.zzf = lbVar;
    }

    public static n9 w() {
        return (n9) zzb.q();
    }

    public static o9 y(e0 e0Var, p0 p0Var) {
        return (o9) c1.t(zzb, e0Var, p0Var);
    }

    public final lb A() {
        lb lbVar = this.zzf;
        return lbVar == null ? lb.y() : lbVar;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new o9();
        } else {
            if (i11 == 4) {
                return new n9(0);
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

    public final t9 z() {
        t9 t9Var = this.zze;
        return t9Var == null ? t9.y() : t9Var;
    }
}
