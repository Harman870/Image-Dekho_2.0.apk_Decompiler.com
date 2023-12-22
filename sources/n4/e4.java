package n4;

import j4.p6;
import java.util.concurrent.Callable;

public final /* synthetic */ class e4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f9715a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9716b;

    public /* synthetic */ e4(h4 h4Var, String str) {
        this.f9715a = h4Var;
        this.f9716b = str;
    }

    public final Object call() {
        return new p6(new c4(0, this.f9715a, this.f9716b));
    }
}
