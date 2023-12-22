package i4;

public final class oa extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final oa zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public e0 zze = e0.f7269b;

    static {
        oa oaVar = new oa();
        zzb = oaVar;
        c1.j(oa.class, oaVar);
    }

    public static na w() {
        return (na) zzb.q();
    }

    public static oa y(e0 e0Var, p0 p0Var) {
        return (oa) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new oa();
        } else {
            if (i11 == 4) {
                return new na(0);
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

    public final e0 z() {
        return this.zze;
    }
}
