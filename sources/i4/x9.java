package i4;

public final class x9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final x9 zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        x9 x9Var = new x9();
        zzb = x9Var;
        c1.j(x9.class, x9Var);
    }

    public static w9 w() {
        return (w9) zzb.q();
    }

    public static x9 y() {
        return zzb;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new x9();
        } else {
            if (i11 == 4) {
                return new w9(0);
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
