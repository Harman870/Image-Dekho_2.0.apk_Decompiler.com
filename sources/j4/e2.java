package j4;

import java.util.List;

public final class e2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final e2 zza;
    private int zzd;
    private int zze;
    private r7 zzf;
    private r7 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        e2 e2Var = new e2();
        zza = e2Var;
        m7.p(e2.class, e2Var);
    }

    public e2() {
        w8 w8Var = w8.f8543d;
        this.zzf = w8Var;
        this.zzg = w8Var;
    }

    public static /* synthetic */ void B(e2 e2Var, int i10, n2 n2Var) {
        r7 r7Var = e2Var.zzf;
        if (!r7Var.zzc()) {
            e2Var.zzf = m7.m(r7Var);
        }
        e2Var.zzf.set(i10, n2Var);
    }

    public static /* synthetic */ void C(e2 e2Var, int i10, g2 g2Var) {
        r7 r7Var = e2Var.zzg;
        if (!r7Var.zzc()) {
            e2Var.zzg = m7.m(r7Var);
        }
        e2Var.zzg.set(i10, g2Var);
    }

    public final r7 A() {
        return this.zzf;
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
            return new x8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", n2.class, "zzg", g2.class, "zzh", "zzi"});
        } else if (i11 == 3) {
            return new e2();
        } else {
            if (i11 == 4) {
                return new d2(0);
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

    public final int u() {
        return this.zzg.size();
    }

    public final int v() {
        return this.zzf.size();
    }

    public final g2 x(int i10) {
        return (g2) this.zzg.get(i10);
    }

    public final n2 y(int i10) {
        return (n2) this.zzf.get(i10);
    }

    public final List z() {
        return this.zzg;
    }
}
