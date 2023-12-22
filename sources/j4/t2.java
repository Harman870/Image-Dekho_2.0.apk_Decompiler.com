package j4;

public final class t2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final t2 zza;
    private int zzd;
    private String zze = "";
    private r7 zzf = w8.f8543d;
    private boolean zzg;

    static {
        t2 t2Var = new t2();
        zza = t2Var;
        m7.p(t2.class, t2Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", z2.class, "zzg"});
        } else if (i11 == 3) {
            return new t2();
        } else {
            if (i11 == 4) {
                return new s2();
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
}
