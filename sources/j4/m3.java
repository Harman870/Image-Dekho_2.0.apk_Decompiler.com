package j4;

public final class m3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final m3 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        m3 m3Var = new m3();
        zza = m3Var;
        m7.p(m3.class, m3Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new m3();
        } else {
            if (i11 == 4) {
                return new l3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
