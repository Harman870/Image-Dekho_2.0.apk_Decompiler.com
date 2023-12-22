package n4;

import java.util.concurrent.Callable;

public final class w4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z4 f10271a;

    public w4(z4 z4Var, r rVar, String str) {
        this.f10271a = z4Var;
    }

    public final Object call() {
        this.f10271a.f10346a.b();
        f6 f6Var = this.f10271a.f10346a.f10289h;
        w7.H(f6Var);
        f6Var.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
