package i4;

public final class qc extends c1 implements c2 {
    /* access modifiers changed from: private */
    public static final qc zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private rc zze;

    static {
        qc qcVar = new qc();
        zzb = qcVar;
        c1.j(qc.class, qcVar);
    }

    public static /* synthetic */ void B(qc qcVar, rc rcVar) {
        rcVar.getClass();
        qcVar.zze = rcVar;
    }

    public static pc w() {
        return (pc) zzb.q();
    }

    public static qc y(e0 e0Var, p0 p0Var) {
        return (qc) c1.t(zzb, e0Var, p0Var);
    }

    public final Object p(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new qc();
        } else {
            if (i11 == 4) {
                return new pc(0);
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

    public final rc z() {
        rc rcVar = this.zze;
        return rcVar == null ? rc.x() : rcVar;
    }
}
