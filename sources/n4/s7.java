package n4;

import java.util.concurrent.Callable;
import r3.o;

public final class s7 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g8 f10124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w7 f10125b;

    public s7(w7 w7Var, g8 g8Var) {
        this.f10125b = w7Var;
        this.f10124a = g8Var;
    }

    public final Object call() {
        w7 w7Var = this.f10125b;
        String str = this.f10124a.f9768a;
        o.h(str);
        f5 M = w7Var.M(str);
        e5 e5Var = e5.ANALYTICS_STORAGE;
        if (M.f(e5Var) && f5.b(100, this.f10124a.f9787v).f(e5Var)) {
            return this.f10125b.I(this.f10124a).x();
        }
        this.f10125b.a().f9835n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
