package j4;

public final class w3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final w3 zza;
    private int zzd;
    private int zze = 1;
    private r7 zzf = w8.f8543d;

    static {
        w3 w3Var = new w3();
        zza = w3Var;
        m7.p(w3.class, w3Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", v3.f8504a, "zzf", m3.class});
        } else if (i11 == 3) {
            return new w3();
        } else {
            if (i11 == 4) {
                return new u3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
