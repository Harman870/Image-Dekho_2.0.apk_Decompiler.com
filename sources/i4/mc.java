package i4;

public final class mc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final mc zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private oc zze;

    static {
        mc mcVar = new mc();
        zzb = mcVar;
        c1.j(mc.class, mcVar);
    }

    public static /* synthetic */ void B(mc mcVar, oc ocVar) {
        ocVar.getClass();
        mcVar.zze = ocVar;
    }

    public static lc w() {
        return (lc) zzb.q();
    }

    public static mc y(e0 e0Var, p0 p0Var) {
        return (mc) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new mc();
        } else {
            if (i11 == 4) {
                return new lc(0);
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

    public final oc z() {
        oc ocVar = this.zze;
        return ocVar == null ? oc.w() : ocVar;
    }
}
