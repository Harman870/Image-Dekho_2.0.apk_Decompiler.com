package u9;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import u9.i;

public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f12263a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f12264b;

    public g(Type type, Executor executor) {
        this.f12263a = type;
        this.f12264b = executor;
    }

    public final Object a(t tVar) {
        Executor executor = this.f12264b;
        return executor == null ? tVar : new i.a(executor, tVar);
    }

    public final Type b() {
        return this.f12263a;
    }
}
