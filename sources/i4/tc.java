package i4;

@Deprecated
public final class tc extends c1 implements c2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7688a = 0;
    /* access modifiers changed from: private */
    public static final tc zzb;
    private String zzd = "";
    private f1 zze = k2.f7433d;

    static {
        tc tcVar = new tc();
        zzb = tcVar;
        c1.j(tc.class, tcVar);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", cc.class});
        } else if (i11 == 3) {
            return new tc();
        } else {
            if (i11 == 4) {
                return new sc();
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
