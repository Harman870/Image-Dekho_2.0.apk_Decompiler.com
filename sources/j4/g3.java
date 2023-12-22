package j4;

public final class g3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final g3 zza;
    private int zzd;
    private int zze;
    private y3 zzf;
    private y3 zzg;
    private boolean zzh;

    static {
        g3 g3Var = new g3();
        zza = g3Var;
        m7.p(g3.class, g3Var);
    }

    public static /* synthetic */ void A(g3 g3Var, y3 y3Var) {
        g3Var.zzg = y3Var;
        g3Var.zzd |= 4;
    }

    public static /* synthetic */ void B(g3 g3Var, boolean z9) {
        g3Var.zzd |= 8;
        g3Var.zzh = z9;
    }

    public static f3 u() {
        return (f3) zza.i();
    }

    public static /* synthetic */ void y(g3 g3Var, int i10) {
        g3Var.zzd |= 1;
        g3Var.zze = i10;
    }

    public static /* synthetic */ void z(g3 g3Var, y3 y3Var) {
        g3Var.zzf = y3Var;
        g3Var.zzd |= 2;
    }

    public final boolean C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zzd & 1) != 0;
    }

    public final boolean E() {
        return (this.zzd & 8) != 0;
    }

    public final boolean F() {
        return (this.zzd & 4) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new g3();
        } else {
            if (i11 == 4) {
                return new f3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zze;
    }

    public final y3 w() {
        y3 y3Var = this.zzf;
        return y3Var == null ? y3.z() : y3Var;
    }

    public final y3 x() {
        y3 y3Var = this.zzg;
        return y3Var == null ? y3.z() : y3Var;
    }
}
