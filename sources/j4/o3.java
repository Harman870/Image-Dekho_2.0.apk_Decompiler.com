package j4;

import java.util.ArrayList;
import java.util.List;

public final class o3 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final o3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    private r7 zzj = w8.f8543d;

    static {
        o3 o3Var = new o3();
        zza = o3Var;
        m7.p(o3.class, o3Var);
    }

    public static /* synthetic */ void C(o3 o3Var, String str) {
        str.getClass();
        o3Var.zzd |= 1;
        o3Var.zze = str;
    }

    public static /* synthetic */ void D(o3 o3Var, String str) {
        str.getClass();
        o3Var.zzd |= 2;
        o3Var.zzf = str;
    }

    public static /* synthetic */ void E(o3 o3Var) {
        o3Var.zzd &= -3;
        o3Var.zzf = zza.zzf;
    }

    public static /* synthetic */ void F(o3 o3Var, long j10) {
        o3Var.zzd |= 4;
        o3Var.zzg = j10;
    }

    public static /* synthetic */ void G(o3 o3Var) {
        o3Var.zzd &= -5;
        o3Var.zzg = 0;
    }

    public static /* synthetic */ void H(o3 o3Var, double d10) {
        o3Var.zzd |= 16;
        o3Var.zzi = d10;
    }

    public static /* synthetic */ void I(o3 o3Var) {
        o3Var.zzd &= -17;
        o3Var.zzi = 0.0d;
    }

    public static void J(o3 o3Var, o3 o3Var2) {
        r7 r7Var = o3Var.zzj;
        if (!r7Var.zzc()) {
            o3Var.zzj = m7.m(r7Var);
        }
        o3Var.zzj.add(o3Var2);
    }

    public static void K(o3 o3Var, ArrayList arrayList) {
        r7 r7Var = o3Var.zzj;
        if (!r7Var.zzc()) {
            o3Var.zzj = m7.m(r7Var);
        }
        f6.f(arrayList, o3Var.zzj);
    }

    public static void L(o3 o3Var) {
        o3Var.zzj = w8.f8543d;
    }

    public static n3 x() {
        return (n3) zza.i();
    }

    public final String A() {
        return this.zzf;
    }

    public final List B() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzd & 16) != 0;
    }

    public final boolean N() {
        return (this.zzd & 8) != 0;
    }

    public final boolean O() {
        return (this.zzd & 4) != 0;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 2) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", o3.class});
        } else if (i11 == 3) {
            return new o3();
        } else {
            if (i11 == 4) {
                return new n3(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double t() {
        return this.zzi;
    }

    public final float u() {
        return this.zzh;
    }

    public final int v() {
        return this.zzj.size();
    }

    public final long w() {
        return this.zzg;
    }

    public final String z() {
        return this.zze;
    }
}
