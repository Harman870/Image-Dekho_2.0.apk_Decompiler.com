package i4;

public final class nb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final nb zzb;
    /* access modifiers changed from: private */
    public pb zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        nb nbVar = new nb();
        zzb = nbVar;
        c1.j(nb.class, nbVar);
    }

    public static mb w() {
        return (mb) zzb.q();
    }

    public static nb y() {
        return zzb;
    }

    public static nb z(e0 e0Var, p0 p0Var) {
        return (nb) c1.t(zzb, e0Var, p0Var);
    }

    public final pb A() {
        pb pbVar = this.zzd;
        return pbVar == null ? pb.y() : pbVar;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new nb();
        } else {
            if (i11 == 4) {
                return new mb(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zze;
    }
}
