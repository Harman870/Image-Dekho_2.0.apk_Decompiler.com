package j4;

public final class g2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final g2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private r7 zzg = w8.f8543d;
    private boolean zzh;
    private l2 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        g2 g2Var = new g2();
        zza = g2Var;
        m7.p(g2.class, g2Var);
    }

    public static /* synthetic */ void B(g2 g2Var, String str) {
        g2Var.zzd |= 2;
        g2Var.zzf = str;
    }

    public static /* synthetic */ void C(g2 g2Var, int i10, i2 i2Var) {
        r7 r7Var = g2Var.zzg;
        if (!r7Var.zzc()) {
            g2Var.zzg = m7.m(r7Var);
        }
        g2Var.zzg.set(i10, i2Var);
    }

    public static f2 v() {
        return (f2) zza.i();
    }

    public final r7 A() {
        return this.zzg;
    }

    public final boolean D() {
        return this.zzj;
    }

    public final boolean E() {
        return this.zzk;
    }

    public final boolean F() {
        return this.zzl;
    }

    public final boolean G() {
        return (this.zzd & 8) != 0;
    }

    public final boolean H() {
        return (this.zzd & 1) != 0;
    }

    public final boolean I() {
        return (this.zzd & 64) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", i2.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new g2();
        } else {
            if (i11 == 4) {
                return new f2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzg.size();
    }

    public final int u() {
        return this.zze;
    }

    public final i2 x(int i10) {
        return (i2) this.zzg.get(i10);
    }

    public final l2 y() {
        l2 l2Var = this.zzi;
        return l2Var == null ? l2.u() : l2Var;
    }

    public final String z() {
        return this.zzf;
    }
}
