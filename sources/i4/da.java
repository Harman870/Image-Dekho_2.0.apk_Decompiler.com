package i4;

public final class da extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final da zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        da daVar = new da();
        zzb = daVar;
        c1.j(da.class, daVar);
    }

    public static ca w() {
        return (ca) zzb.q();
    }

    public static da y() {
        return zzb;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new da();
        } else {
            if (i11 == 4) {
                return new ca(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zzd;
    }
}
