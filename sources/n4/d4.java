package n4;

import i4.h6;
import j4.d9;
import java.util.concurrent.Callable;

public final /* synthetic */ class d4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f9672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9673b;

    public /* synthetic */ d4(h4 h4Var, String str) {
        this.f9672a = h4Var;
        this.f9673b = str;
    }

    public final Object call() {
        return new d9(new h6(this.f9672a, this.f9673b));
    }
}
