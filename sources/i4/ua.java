package i4;

public final class ua extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final ua zzb;

    static {
        ua uaVar = new ua();
        zzb = uaVar;
        c1.j(ua.class, uaVar);
    }

    public static ua w() {
        return zzb;
    }

    public static ua x(e0 e0Var, p0 p0Var) {
        return (ua) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i11 == 3) {
            return new ua();
        }
        if (i11 == 4) {
            return new ta();
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
