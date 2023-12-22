package j4;

public final class d4 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final d4 zza;
    private r7 zzd = w8.f8543d;

    static {
        d4 d4Var = new d4();
        zza = d4Var;
        m7.p(d4.class, d4Var);
    }

    public static d4 v() {
        return zza;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", e4.class});
        } else if (i11 == 3) {
            return new d4();
        } else {
            if (i11 == 4) {
                return new s2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzd.size();
    }

    public final r7 w() {
        return this.zzd;
    }
}
