package i4;

public final class x4 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7786b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(int i10, Class cls) {
        super(cls);
        this.f7786b = i10;
    }

    public final /* bridge */ /* synthetic */ Object a(b2 b2Var) {
        switch (this.f7786b) {
            case 0:
                t9 t9Var = (t9) b2Var;
                return new zc(t9Var.A().v(), t9Var.B().r());
            case 1:
                return new v5(((ka) b2Var).z().r());
            default:
                return new dd(((oa) b2Var).z().r());
        }
    }
}
