package u9;

import e9.e;
import e9.f;
import java.lang.reflect.Method;
import o8.a;

public final class o implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12292a;

    public o(f fVar) {
        this.f12292a = fVar;
    }

    public final void a(b<Object> bVar, b0<Object> b0Var) {
        boolean z9;
        T t10;
        e eVar;
        x8.f.g(bVar, "call");
        x8.f.g(b0Var, "response");
        int i10 = b0Var.f12245a.f8823c;
        if (i10 < 200 || i10 >= 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            t10 = b0Var.f12246b;
            if (t10 == null) {
                Class<l> cls = l.class;
                l cast = cls.cast(bVar.t().f9020e.get(cls));
                if (cast != null) {
                    Method method = cast.f12288a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    x8.f.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    x8.f.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    a aVar = new a(sb.toString());
                    eVar = this.f12292a;
                    t10 = c.a.d(aVar);
                } else {
                    a aVar2 = new a();
                    x8.f.i(x8.f.class.getName(), aVar2);
                    throw aVar2;
                }
            } else {
                eVar = this.f12292a;
            }
        } else {
            eVar = this.f12292a;
            t10 = c.a.d(new j(b0Var));
        }
        eVar.e(t10);
    }

    public final void b(b<Object> bVar, Throwable th) {
        x8.f.g(bVar, "call");
        x8.f.g(th, "t");
        this.f12292a.e(c.a.d(th));
    }
}
