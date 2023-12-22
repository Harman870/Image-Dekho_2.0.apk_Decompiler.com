package j4;

public final class p3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final p3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private e3 zzg;

    static {
        p3 p3Var = new p3();
        zza = p3Var;
        m7.p(p3.class, p3Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new p3();
        } else {
            if (i11 == 4) {
                return new o2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
