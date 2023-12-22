package i4;

public final class u4 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7709b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4(int i10) {
        super(p3.class);
        this.f7709b = i10;
    }

    public final /* bridge */ /* synthetic */ Object a(b2 b2Var) {
        switch (this.f7709b) {
            case 0:
                o9 o9Var = (o9) b2Var;
                return new jd((nd) new z4(0).g(o9Var.z(), nd.class), (g4) new j8(1).g(o9Var.A(), g4.class), o9Var.A().A().v());
            case 1:
                return new cd(((fa) b2Var).z().r());
            default:
                return new wd(((vc) b2Var).z().r());
        }
    }
}
