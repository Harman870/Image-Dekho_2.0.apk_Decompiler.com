package j4;

import java.util.ArrayList;
import java.util.List;

public final class y3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final y3 zza;
    private q7 zzd;
    private q7 zze;
    private r7 zzf;
    private r7 zzg;

    static {
        y3 y3Var = new y3();
        zza = y3Var;
        m7.p(y3.class, y3Var);
    }

    public y3() {
        c8 c8Var = c8.f8085d;
        this.zzd = c8Var;
        this.zze = c8Var;
        w8 w8Var = w8.f8543d;
        this.zzf = w8Var;
        this.zzg = w8Var;
    }

    public static void E(y3 y3Var, List list) {
        q7 q7Var = y3Var.zzd;
        if (!((g6) q7Var).f8197a) {
            y3Var.zzd = m7.l(q7Var);
        }
        f6.f(list, y3Var.zzd);
    }

    public static void F(y3 y3Var) {
        y3Var.zzd = c8.f8085d;
    }

    public static void G(y3 y3Var, List list) {
        q7 q7Var = y3Var.zze;
        if (!((g6) q7Var).f8197a) {
            y3Var.zze = m7.l(q7Var);
        }
        f6.f(list, y3Var.zze);
    }

    public static void H(y3 y3Var) {
        y3Var.zze = c8.f8085d;
    }

    public static /* synthetic */ void I(y3 y3Var, ArrayList arrayList) {
        r7 r7Var = y3Var.zzf;
        if (!r7Var.zzc()) {
            y3Var.zzf = m7.m(r7Var);
        }
        f6.f(arrayList, y3Var.zzf);
    }

    public static void J(y3 y3Var) {
        y3Var.zzf = w8.f8543d;
    }

    public static /* synthetic */ void K(y3 y3Var, List list) {
        r7 r7Var = y3Var.zzg;
        if (!r7Var.zzc()) {
            y3Var.zzg = m7.m(r7Var);
        }
        f6.f(list, y3Var.zzg);
    }

    public static void L(y3 y3Var) {
        y3Var.zzg = w8.f8543d;
    }

    public static x3 x() {
        return (x3) zza.i();
    }

    public static y3 z() {
        return zza;
    }

    public final r7 A() {
        return this.zzf;
    }

    public final List B() {
        return this.zze;
    }

    public final r7 C() {
        return this.zzg;
    }

    public final q7 D() {
        return this.zzd;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", i3.class, "zzg", a4.class});
        } else if (i11 == 3) {
            return new y3();
        } else {
            if (i11 == 4) {
                return new x3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzf.size();
    }

    public final int u() {
        return ((c8) this.zze).f8087c;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int w() {
        return ((c8) this.zzd).f8087c;
    }
}
