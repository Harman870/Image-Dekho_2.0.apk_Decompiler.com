package i4;

@Deprecated
public final class cc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final cc zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        cc ccVar = new cc();
        zzb = ccVar;
        c1.j(cc.class, ccVar);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new cc();
        } else {
            if (i11 == 4) {
                return new ta(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
