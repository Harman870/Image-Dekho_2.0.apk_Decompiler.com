package u9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import l8.f;

public final class c0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final y f12247a = y.f12359c;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f12248b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f12249c = f.class;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d0 f12250d;

    public c0(d0 d0Var) {
        this.f12250d = d0Var;
    }

    @Nullable
    public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
        boolean z9;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f12248b;
        }
        if (!this.f12247a.f12360a || !method.isDefault()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return this.f12247a.b(method, this.f12249c, obj, objArr);
        }
        return this.f12250d.b(method).a(objArr);
    }
}
