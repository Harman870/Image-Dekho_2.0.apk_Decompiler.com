package i4;

import androidx.activity.f;

public final class fc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final fc zzb;
    private zb zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        fc fcVar = new fc();
        zzb = fcVar;
        c1.j(fc.class, fcVar);
    }

    public static /* synthetic */ void A(fc fcVar, zb zbVar) {
        zbVar.getClass();
        fcVar.zzd = zbVar;
    }

    public static void F(fc fcVar) {
        fcVar.zze = 1;
    }

    public static ec x() {
        return (ec) zzb.q();
    }

    public final boolean D() {
        return this.zzd != null;
    }

    public final int E() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new fc();
        } else {
            if (i11 == 4) {
                return new ec(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zzf;
    }

    public final zb w() {
        zb zbVar = this.zzd;
        return zbVar == null ? zb.y() : zbVar;
    }

    public final int z() {
        int b10 = f.b(this.zzg);
        if (b10 == 0) {
            return 6;
        }
        return b10;
    }
}
