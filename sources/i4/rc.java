package i4;

public final class rc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final rc zzb;
    private String zzd = "";
    private bc zze;

    static {
        rc rcVar = new rc();
        zzb = rcVar;
        c1.j(rc.class, rcVar);
    }

    public static rc x() {
        return zzb;
    }

    public static rc y(e0 e0Var, p0 p0Var) {
        return (rc) c1.t(zzb, e0Var, p0Var);
    }

    public final boolean A() {
        return this.zze != null;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new rc();
        } else {
            if (i11 == 4) {
                return new ta((Object) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final bc v() {
        bc bcVar = this.zze;
        return bcVar == null ? bc.x() : bcVar;
    }

    public final String z() {
        return this.zzd;
    }
}
