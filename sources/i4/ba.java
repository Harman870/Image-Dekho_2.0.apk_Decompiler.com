package i4;

public final class ba extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final ba zzb;
    /* access modifiers changed from: private */
    public da zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        ba baVar = new ba();
        zzb = baVar;
        c1.j(ba.class, baVar);
    }

    public static aa w() {
        return (aa) zzb.q();
    }

    public static ba y(e0 e0Var, p0 p0Var) {
        return (ba) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new ba();
        } else {
            if (i11 == 4) {
                return new aa(0);
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

    public final da z() {
        da daVar = this.zzd;
        return daVar == null ? da.y() : daVar;
    }
}
