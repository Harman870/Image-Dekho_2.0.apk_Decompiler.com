package j4;

import c.a;

public final class q2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final q2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private r7 zzh = w8.f8543d;

    static {
        q2 q2Var = new q2();
        zza = q2Var;
        m7.p(q2.class, q2Var);
    }

    public static q2 v() {
        return zza;
    }

    public final boolean A() {
        return (this.zzd & 2) != 0;
    }

    public final boolean B() {
        return (this.zzd & 1) != 0;
    }

    public final int C() {
        int p5 = a.p(this.zze);
        if (p5 == 0) {
            return 1;
        }
        return p5;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", p2.f8384a, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new q2();
        } else {
            if (i11 == 4) {
                return new o2();
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzh.size();
    }

    public final String w() {
        return this.zzf;
    }

    public final r7 x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzd & 4) != 0;
    }
}
