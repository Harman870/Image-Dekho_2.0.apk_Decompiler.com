package i4;

public final class kc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final kc zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private f1 zze = k2.f7433d;

    static {
        kc kcVar = new kc();
        zzb = kcVar;
        c1.j(kc.class, kcVar);
    }

    public static hc v() {
        return (hc) zzb.q();
    }

    public static void z(kc kcVar, jc jcVar) {
        int i10;
        f1 f1Var = kcVar.zze;
        if (!f1Var.zzc()) {
            int size = f1Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            kcVar.zze = f1Var.c(i10);
        }
        kcVar.zze.add(jcVar);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", jc.class});
        } else if (i11 == 3) {
            return new kc();
        } else {
            if (i11 == 4) {
                return new hc(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final jc w() {
        return (jc) this.zze.get(0);
    }
}
