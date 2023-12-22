package j4;

public final class h4 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final h4 zza;
    private int zzd;
    private int zze;
    private r7 zzf = w8.f8543d;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        h4 h4Var = new h4();
        zza = h4Var;
        m7.p(h4.class, h4Var);
    }

    public final boolean A() {
        return (this.zzd & 16) != 0;
    }

    public final boolean B() {
        return (this.zzd & 4) != 0;
    }

    public final int C() {
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
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", g4.f8195a, "zzf", h4.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new h4();
        } else {
            if (i11 == 4) {
                return new j2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double t() {
        return this.zzj;
    }

    public final String v() {
        return this.zzg;
    }

    public final String w() {
        return this.zzh;
    }

    public final r7 x() {
        return this.zzf;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzd & 8) != 0;
    }
}
