package i4;

import androidx.fragment.app.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class l7 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7474a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f7475b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f7476c;

    @SafeVarargs
    public l7(Class cls, w7... w7VarArr) {
        this.f7474a = cls;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 <= 0) {
            w7 w7Var = w7VarArr[i10];
            if (!hashMap.containsKey(w7Var.f7764a)) {
                hashMap.put(w7Var.f7764a, w7Var);
                i10++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(w7Var.f7764a.getCanonicalName())));
            }
        }
        this.f7476c = w7VarArr[0].f7764a;
        this.f7475b = Collections.unmodifiableMap(hashMap);
    }

    public abstract k7 a();

    public abstract int b();

    public abstract b2 c(e0 e0Var);

    public abstract String d();

    public abstract void e(b2 b2Var);

    public int f() {
        return 1;
    }

    public final Object g(b2 b2Var, Class cls) {
        w7 w7Var = (w7) this.f7475b.get(cls);
        if (w7Var != null) {
            return w7Var.a(b2Var);
        }
        throw new IllegalArgumentException(w0.d("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }
}
