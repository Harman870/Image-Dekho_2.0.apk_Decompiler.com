package j4;

public final class i2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final i2 zza;
    private int zzd;
    private q2 zze;
    private l2 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        i2 i2Var = new i2();
        zza = i2Var;
        m7.p(i2.class, i2Var);
    }

    public static i2 u() {
        return zza;
    }

    public static /* synthetic */ void y(i2 i2Var, String str) {
        i2Var.zzd |= 8;
        i2Var.zzh = str;
    }

    public final boolean A() {
        return (this.zzd & 4) != 0;
    }

    public final boolean B() {
        return (this.zzd & 2) != 0;
    }

    public final boolean C() {
        return (this.zzd & 8) != 0;
    }

    public final boolean D() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new i2();
        } else {
            if (i11 == 4) {
                return new h2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final l2 v() {
        l2 l2Var = this.zzf;
        return l2Var == null ? l2.u() : l2Var;
    }

    public final q2 w() {
        q2 q2Var = this.zze;
        return q2Var == null ? q2.v() : q2Var;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzg;
    }
}
