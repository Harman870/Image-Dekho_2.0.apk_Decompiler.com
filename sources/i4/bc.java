package i4;

import androidx.activity.f;

public final class bc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final bc zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public e0 zze = e0.f7269b;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        bc bcVar = new bc();
        zzb = bcVar;
        c1.j(bc.class, bcVar);
    }

    public static /* synthetic */ void B(bc bcVar, String str) {
        str.getClass();
        bcVar.zzd = str;
    }

    public static ac v() {
        return (ac) zzb.q();
    }

    public static bc x() {
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
            return new bc();
        } else {
            if (i11 == 4) {
                return new ac(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int y() {
        int b10 = f.b(this.zzf);
        if (b10 == 0) {
            return 6;
        }
        return b10;
    }

    public final e0 z() {
        return this.zze;
    }
}
