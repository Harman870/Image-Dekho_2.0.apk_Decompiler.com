package i4;

public final class a5 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7181b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5(int i10, Class cls) {
        super(cls);
        this.f7181b = i10;
    }

    public final /* bridge */ /* synthetic */ Object a(b2 b2Var) {
        switch (this.f7181b) {
            case 0:
                z9 z9Var = (z9) b2Var;
                return new bd(z9Var.z().v(), z9Var.A().r());
            case 1:
                qc qcVar = (qc) b2Var;
                String z9 = qcVar.z().z();
                return new k5(qcVar.z().v(), f4.a(z9).zza(z9));
            default:
                db dbVar = (db) b2Var;
                bb w = dbVar.z().w();
                hb z10 = w.z();
                return new hd(id.g(k6.c(z10.A()), dbVar.A().r()), z10.y().r(), k6.b(z10.B()), k6.d(w.C()), new l6(w.v().y()));
        }
    }
}
