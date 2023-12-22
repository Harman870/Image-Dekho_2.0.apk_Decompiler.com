package j4;

public final class e4 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final e4 zza;
    private int zzd;
    private String zze = "";
    private r7 zzf = w8.f8543d;

    static {
        e4 e4Var = new e4();
        zza = e4Var;
        m7.p(e4.class, e4Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", h4.class});
        } else if (i11 == 3) {
            return new e4();
        } else {
            if (i11 == 4) {
                return new y2(0);
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

    public final r7 v() {
        return this.zzf;
    }
}
