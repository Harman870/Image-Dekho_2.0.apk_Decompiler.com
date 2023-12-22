package i4;

import com.ironsource.adapters.ironsource.a;

public final class zb extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final zb zzb;
    /* access modifiers changed from: private */
    public String zzd = "";
    /* access modifiers changed from: private */
    public e0 zze = e0.f7269b;
    private int zzf;

    static {
        zb zbVar = new zb();
        zzb = zbVar;
        c1.j(zb.class, zbVar);
    }

    public static void D(zb zbVar, int i10) {
        if (i10 != 6) {
            zbVar.zzf = a.d(i10);
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static yb v() {
        return (yb) zzb.q();
    }

    public static zb y() {
        return zzb;
    }

    public final String A() {
        return this.zzd;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zb();
        } else {
            if (i11 == 4) {
                return new yb(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int w() {
        int i10 = this.zzf;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 1;
        } else if (i10 == 1) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 3;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? 0 : 5;
        }
        if (i11 == 0) {
            return 6;
        }
        return i11;
    }

    public final e0 z() {
        return this.zze;
    }
}
