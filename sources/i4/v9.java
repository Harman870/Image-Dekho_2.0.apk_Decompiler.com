package i4;

public final class v9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final v9 zzb;
    /* access modifiers changed from: private */
    public x9 zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        v9 v9Var = new v9();
        zzb = v9Var;
        c1.j(v9.class, v9Var);
    }

    public static u9 w() {
        return (u9) zzb.q();
    }

    public static v9 y() {
        return zzb;
    }

    public static v9 z(e0 e0Var, p0 p0Var) {
        return (v9) c1.t(zzb, e0Var, p0Var);
    }

    public final x9 A() {
        x9 x9Var = this.zzd;
        return x9Var == null ? x9.y() : x9Var;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new v9();
        } else {
            if (i11 == 4) {
                return new u9(0);
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
