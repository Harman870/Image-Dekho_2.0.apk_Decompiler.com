package j4;

public final class f4 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final f4 zza;
    private int zzd;
    private r7 zze = w8.f8543d;
    private d4 zzf;

    static {
        f4 f4Var = new f4();
        zza = f4Var;
        m7.p(f4.class, f4Var);
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", h4.class, "zzf"});
        } else if (i11 == 3) {
            return new f4();
        } else {
            if (i11 == 4) {
                return new a3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final d4 t() {
        d4 d4Var = this.zzf;
        return d4Var == null ? d4.v() : d4Var;
    }

    public final r7 v() {
        return this.zze;
    }
}
