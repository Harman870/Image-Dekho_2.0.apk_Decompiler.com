package i4;

public final class gc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final gc zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private f1 zze = k2.f7433d;

    static {
        gc gcVar = new gc();
        zzb = gcVar;
        c1.j(gc.class, gcVar);
    }

    public static gc A(byte[] bArr, p0 p0Var) {
        return (gc) c1.u(zzb, bArr, p0Var);
    }

    public static void D(gc gcVar, fc fcVar) {
        int i10;
        f1 f1Var = gcVar.zze;
        if (!f1Var.zzc()) {
            int size = f1Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            gcVar.zze = f1Var.c(i10);
        }
        gcVar.zze.add(fcVar);
    }

    public static dc x() {
        return (dc) zzb.q();
    }

    public final f1 B() {
        return this.zze;
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", fc.class});
        } else if (i11 == 3) {
            return new gc();
        } else {
            if (i11 == 4) {
                return new dc(0);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int v() {
        return this.zze.size();
    }

    public final int w() {
        return this.zzd;
    }

    public final fc y(int i10) {
        return (fc) this.zze.get(i10);
    }
}
