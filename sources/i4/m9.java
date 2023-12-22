package i4;

public final class m9 extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final m9 zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        m9 m9Var = new m9();
        zzb = m9Var;
        c1.j(m9.class, m9Var);
    }

    public static l9 w() {
        return (l9) zzb.q();
    }

    public static m9 y() {
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
            return new m9();
        } else {
            if (i11 == 4) {
                return new l9(0);
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
