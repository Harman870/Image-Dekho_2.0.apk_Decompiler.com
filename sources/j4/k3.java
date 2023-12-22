package j4;

import java.util.List;

public final class k3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final k3 zza;
    private int zzd;
    private r7 zze = w8.f8543d;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        k3 k3Var = new k3();
        zza = k3Var;
        m7.p(k3.class, k3Var);
    }

    public static /* synthetic */ void C(k3 k3Var, int i10, o3 o3Var) {
        k3Var.N();
        k3Var.zze.set(i10, o3Var);
    }

    public static /* synthetic */ void D(k3 k3Var, o3 o3Var) {
        k3Var.N();
        k3Var.zze.add(o3Var);
    }

    public static /* synthetic */ void E(k3 k3Var, Iterable iterable) {
        k3Var.N();
        f6.f(iterable, k3Var.zze);
    }

    public static void F(k3 k3Var) {
        k3Var.zze = w8.f8543d;
    }

    public static /* synthetic */ void G(k3 k3Var, int i10) {
        k3Var.N();
        k3Var.zze.remove(i10);
    }

    public static /* synthetic */ void H(k3 k3Var, String str) {
        str.getClass();
        k3Var.zzd |= 1;
        k3Var.zzf = str;
    }

    public static /* synthetic */ void I(long j10, k3 k3Var) {
        k3Var.zzd |= 2;
        k3Var.zzg = j10;
    }

    public static /* synthetic */ void J(long j10, k3 k3Var) {
        k3Var.zzd |= 4;
        k3Var.zzh = j10;
    }

    public static j3 x() {
        return (j3) zza.i();
    }

    public final String A() {
        return this.zzf;
    }

    public final List B() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzd & 8) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final boolean M() {
        return (this.zzd & 2) != 0;
    }

    public final void N() {
        r7 r7Var = this.zze;
        if (!r7Var.zzc()) {
            this.zze = m7.m(r7Var);
        }
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", o3.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new k3();
        } else {
            if (i11 == 4) {
                return new j3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzi;
    }

    public final int u() {
        return this.zze.size();
    }

    public final long v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzg;
    }

    public final o3 z(int i10) {
        return (o3) this.zze.get(i10);
    }
}
