package j4;

public final class i3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final i3 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        i3 i3Var = new i3();
        zza = i3Var;
        m7.p(i3.class, i3Var);
    }

    public static h3 v() {
        return (h3) zza.i();
    }

    public static /* synthetic */ void x(i3 i3Var, int i10) {
        i3Var.zzd |= 1;
        i3Var.zze = i10;
    }

    public static /* synthetic */ void y(i3 i3Var, long j10) {
        i3Var.zzd |= 2;
        i3Var.zzf = j10;
    }

    public final boolean A() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new i3();
        } else {
            if (i11 == 4) {
                return new h3(0);
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

    public final long u() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzd & 2) != 0;
    }
}
