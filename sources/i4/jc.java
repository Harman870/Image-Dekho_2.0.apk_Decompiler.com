package i4;

public final class jc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final jc zzb;
    private String zzd = "";
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        jc jcVar = new jc();
        zzb = jcVar;
        c1.j(jc.class, jcVar);
    }

    public static void B(jc jcVar, int i10) {
        if (i10 != 1) {
            jcVar.zze = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static ic w() {
        return (ic) zzb.q();
    }

    public static /* synthetic */ void y(jc jcVar, String str) {
        str.getClass();
        jcVar.zzd = str;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new jc();
        } else {
            if (i11 == 4) {
                return new ic(0);
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
}
