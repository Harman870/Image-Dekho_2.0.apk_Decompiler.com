package i4;

public final class lb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final lb zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private pb zze;
    /* access modifiers changed from: private */
    public e0 zzf = e0.f7269b;

    static {
        lb lbVar = new lb();
        zzb = lbVar;
        c1.j(lb.class, lbVar);
    }

    public static /* synthetic */ void D(lb lbVar, pb pbVar) {
        pbVar.getClass();
        lbVar.zze = pbVar;
    }

    public static kb w() {
        return (kb) zzb.q();
    }

    public static lb y() {
        return zzb;
    }

    public static lb z(e0 e0Var, p0 p0Var) {
        return (lb) c1.t(zzb, e0Var, p0Var);
    }

    public final pb A() {
        pb pbVar = this.zze;
        return pbVar == null ? pb.y() : pbVar;
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
            return new lb();
        } else {
            if (i11 == 4) {
                return new kb(0);
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
