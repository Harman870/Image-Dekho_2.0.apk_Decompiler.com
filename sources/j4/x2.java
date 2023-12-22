package j4;

import java.util.List;

public final class x2 extends m7 implements o8 {
    /* access modifiers changed from: private */
    public static final x2 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private r7 zzh;
    private r7 zzi;
    private r7 zzj;
    private String zzk;
    private boolean zzl;
    private r7 zzm;
    private r7 zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;

    static {
        x2 x2Var = new x2();
        zza = x2Var;
        m7.p(x2.class, x2Var);
    }

    public x2() {
        w8 w8Var = w8.f8543d;
        this.zzh = w8Var;
        this.zzi = w8Var;
        this.zzj = w8Var;
        this.zzk = "";
        this.zzm = w8Var;
        this.zzn = w8Var;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
    }

    public static /* synthetic */ void I(x2 x2Var, int i10, v2 v2Var) {
        r7 r7Var = x2Var.zzi;
        if (!r7Var.zzc()) {
            x2Var.zzi = m7.m(r7Var);
        }
        x2Var.zzi.set(i10, v2Var);
    }

    public static void J(x2 x2Var) {
        x2Var.zzj = w8.f8543d;
    }

    public static w2 x() {
        return (w2) zza.i();
    }

    public static x2 z() {
        return zza;
    }

    public final String A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzq;
    }

    public final String C() {
        return this.zzp;
    }

    public final String D() {
        return this.zzo;
    }

    public final r7 E() {
        return this.zzj;
    }

    public final r7 F() {
        return this.zzn;
    }

    public final r7 G() {
        return this.zzm;
    }

    public final List H() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzl;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new x8(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", b3.class, "zzi", v2.class, "zzj", e2.class, "zzk", "zzl", "zzm", f4.class, "zzn", t2.class, "zzo", "zzp", "zzq", "zzr"});
        } else if (i11 == 3) {
            return new x2();
        } else {
            if (i11 == 4) {
                return new w2(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzm.size();
    }

    public final int u() {
        return this.zzi.size();
    }

    public final long v() {
        return this.zze;
    }

    public final v2 w(int i10) {
        return (v2) this.zzi.get(i10);
    }
}
