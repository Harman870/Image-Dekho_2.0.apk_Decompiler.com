package i4;

public final class wa extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final wa zzb;
    private bc zzd;

    static {
        wa waVar = new wa();
        zzb = waVar;
        c1.j(wa.class, waVar);
    }

    public static va v() {
        return (va) zzb.q();
    }

    public static wa x() {
        return zzb;
    }

    public static /* synthetic */ void z(wa waVar, bc bcVar) {
        bcVar.getClass();
        waVar.zzd = bcVar;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new wa();
        } else {
            if (i11 == 4) {
                return new va(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final bc y() {
        bc bcVar = this.zzd;
        return bcVar == null ? bc.x() : bcVar;
    }
}
