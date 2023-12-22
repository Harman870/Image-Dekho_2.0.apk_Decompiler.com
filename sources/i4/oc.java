package i4;

public final class oc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final oc zzb;
    private String zzd = "";

    static {
        oc ocVar = new oc();
        zzb = ocVar;
        c1.j(oc.class, ocVar);
    }

    public static oc w() {
        return zzb;
    }

    public static oc x(e0 e0Var, p0 p0Var) {
        return (oc) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new oc();
        } else {
            if (i11 == 4) {
                return new nc();
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String y() {
        return this.zzd;
    }
}
