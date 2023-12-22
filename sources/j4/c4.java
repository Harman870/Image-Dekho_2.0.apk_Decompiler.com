package j4;

public final class c4 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final c4 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        c4 c4Var = new c4();
        zza = c4Var;
        m7.p(c4.class, c4Var);
    }

    public static /* synthetic */ void A(c4 c4Var, long j10) {
        c4Var.zzd |= 1;
        c4Var.zze = j10;
    }

    public static /* synthetic */ void B(c4 c4Var, String str) {
        str.getClass();
        c4Var.zzd |= 2;
        c4Var.zzf = str;
    }

    public static /* synthetic */ void C(c4 c4Var, String str) {
        str.getClass();
        c4Var.zzd |= 4;
        c4Var.zzg = str;
    }

    public static /* synthetic */ void D(c4 c4Var) {
        c4Var.zzd &= -5;
        c4Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void E(c4 c4Var, long j10) {
        c4Var.zzd |= 8;
        c4Var.zzh = j10;
    }

    public static /* synthetic */ void F(c4 c4Var) {
        c4Var.zzd &= -9;
        c4Var.zzh = 0;
    }

    public static /* synthetic */ void G(c4 c4Var, double d10) {
        c4Var.zzd |= 32;
        c4Var.zzj = d10;
    }

    public static /* synthetic */ void H(c4 c4Var) {
        c4Var.zzd &= -33;
        c4Var.zzj = 0.0d;
    }

    public static b4 w() {
        return (b4) zza.i();
    }

    public final boolean I() {
        return (this.zzd & 32) != 0;
    }

    public final boolean J() {
        return (this.zzd & 8) != 0;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new c4();
        } else {
            if (i11 == 4) {
                return new b4(0);
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

    public final long u() {
        return this.zzh;
    }

    public final long v() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
