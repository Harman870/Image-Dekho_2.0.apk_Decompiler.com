package j4;

public final class v2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final v2 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        v2 v2Var = new v2();
        zza = v2Var;
        m7.p(v2.class, v2Var);
    }

    public static /* synthetic */ void w(v2 v2Var, String str) {
        str.getClass();
        v2Var.zzd |= 1;
        v2Var.zze = str;
    }

    public final boolean A() {
        return (this.zzd & 4) != 0;
    }

    public final boolean B() {
        return (this.zzd & 8) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new v2();
        } else {
            if (i11 == 4) {
                return new u2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzh;
    }

    public final String v() {
        return this.zze;
    }

    public final boolean x() {
        return this.zzf;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzd & 2) != 0;
    }
}
