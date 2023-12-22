package j4;

public final class b3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final b3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        b3 b3Var = new b3();
        zza = b3Var;
        m7.p(b3.class, b3Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new b3();
        } else {
            if (i11 == 4) {
                return new a3();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }
}
