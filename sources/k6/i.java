package k6;

import java.util.concurrent.Callable;
import k6.l;
import v0.b;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f9094b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.b f9095c;

    public /* synthetic */ i(k kVar, Callable callable, l.a aVar) {
        this.f9093a = kVar;
        this.f9094b = callable;
        this.f9095c = aVar;
    }

    public final Object call() {
        return this.f9093a.f9099a.submit(new b(this.f9094b, 1, this.f9095c));
    }
}
