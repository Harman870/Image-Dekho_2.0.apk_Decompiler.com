package v9;

import e7.h;
import e7.t;
import j9.a0;
import j9.s;
import j9.y;
import java.io.EOFException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import t9.d;
import t9.e;
import u9.f;

public final class b<T> implements f<T, a0> {

    /* renamed from: c  reason: collision with root package name */
    public static final s f12649c = s.a("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f12650d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final h f12651a;

    /* renamed from: b  reason: collision with root package name */
    public final t<T> f12652b;

    public b(h hVar, t<T> tVar) {
        this.f12651a = hVar;
        this.f12652b = tVar;
    }

    public final Object b(Object obj) {
        e eVar = new e();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new d(eVar), f12650d);
        this.f12651a.getClass();
        k7.b bVar = new k7.b(outputStreamWriter);
        bVar.f9139g = false;
        this.f12652b.b(bVar, obj);
        bVar.close();
        try {
            return new y(f12649c, new t9.h(eVar.E(eVar.f12045b)));
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }
}
