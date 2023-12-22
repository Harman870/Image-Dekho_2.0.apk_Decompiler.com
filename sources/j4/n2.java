package j4;

public final class n2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final n2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private i2 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        n2 n2Var = new n2();
        zza = n2Var;
        m7.p(n2.class, n2Var);
    }

    public static m2 v() {
        return (m2) zza.i();
    }

    public static /* synthetic */ void y(n2 n2Var, String str) {
        n2Var.zzd |= 2;
        n2Var.zzf = str;
    }

    public final boolean A() {
        return this.zzi;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return (this.zzd & 1) != 0;
    }

    public final boolean D() {
        return (this.zzd & 32) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new n2();
        } else {
            if (i11 == 4) {
                return new m2(0);
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

    public final i2 u() {
        i2 i2Var = this.zzg;
        return i2Var == null ? i2.u() : i2Var;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzh;
    }
}
