package i4;

public final class vb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final vb zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public xb zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        vb vbVar = new vb();
        zzb = vbVar;
        c1.j(vb.class, vbVar);
    }

    public static ub w() {
        return (ub) zzb.q();
    }

    public static vb y(e0 e0Var, p0 p0Var) {
        return (vb) c1.t(zzb, e0Var, p0Var);
    }

    public final e0 A() {
        return this.zzf;
    }

    public final boolean E() {
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
            return new vb();
        } else {
            if (i11 == 4) {
                return new ub(0);
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

    public final xb z() {
        xb xbVar = this.zze;
        return xbVar == null ? xb.z() : xbVar;
    }
}
