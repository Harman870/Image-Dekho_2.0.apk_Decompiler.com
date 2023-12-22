package i4;

public final class xb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final xb zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private tb zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        xb xbVar = new xb();
        zzb = xbVar;
        c1.j(xb.class, xbVar);
    }

    public static xb A(e0 e0Var, p0 p0Var) {
        return (xb) c1.t(zzb, e0Var, p0Var);
    }

    public static /* synthetic */ void D(xb xbVar, tb tbVar) {
        tbVar.getClass();
        xbVar.zze = tbVar;
    }

    public static wb x() {
        return (wb) zzb.q();
    }

    public static xb z() {
        return zzb;
    }

    public final e0 B() {
        return this.zzf;
    }

    public final boolean F() {
        return this.zze != null;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new xb();
        } else {
            if (i11 == 4) {
                return new wb(0);
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

    public final tb w() {
        tb tbVar = this.zze;
        return tbVar == null ? tb.x() : tbVar;
    }
}
