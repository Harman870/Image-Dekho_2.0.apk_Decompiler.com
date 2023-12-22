package j4;

import java.util.List;

public final class a4 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final a4 zza;
    private int zzd;
    private int zze;
    private q7 zzf = c8.f8085d;

    static {
        a4 a4Var = new a4();
        zza = a4Var;
        m7.p(a4.class, a4Var);
    }

    public static void A(a4 a4Var, List list) {
        q7 q7Var = a4Var.zzf;
        if (!((g6) q7Var).f8197a) {
            a4Var.zzf = m7.l(q7Var);
        }
        f6.f(list, a4Var.zzf);
    }

    public static z3 w() {
        return (z3) zza.i();
    }

    public static /* synthetic */ void z(a4 a4Var, int i10) {
        a4Var.zzd |= 1;
        a4Var.zze = i10;
    }

    public final boolean B() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new a4();
        } else {
            if (i11 == 4) {
                return new z3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return ((c8) this.zzf).f8087c;
    }

    public final int u() {
        return this.zze;
    }

    public final long v(int i10) {
        c8 c8Var = (c8) this.zzf;
        c8Var.g(i10);
        return c8Var.f8086b[i10];
    }

    public final List y() {
        return this.zzf;
    }
}
