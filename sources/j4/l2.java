package j4;

public final class l2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final l2 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        l2 l2Var = new l2();
        zza = l2Var;
        m7.p(l2.class, l2Var);
    }

    public static l2 u() {
        return zza;
    }

    public final boolean A() {
        return (this.zzd & 4) != 0;
    }

    public final boolean B() {
        return (this.zzd & 2) != 0;
    }

    public final boolean C() {
        return (this.zzd & 16) != 0;
    }

    public final boolean D() {
        return (this.zzd & 8) != 0;
    }

    public final int E() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", k2.f8283a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new l2();
        } else {
            if (i11 == 4) {
                return new j2();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String v() {
        return this.zzg;
    }

    public final String w() {
        return this.zzi;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzd & 1) != 0;
    }
}
