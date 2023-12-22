package j4;

public final class z2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final z2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        z2 z2Var = new z2();
        zza = z2Var;
        m7.p(z2.class, z2Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new z2();
        } else {
            if (i11 == 4) {
                return new y2();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
