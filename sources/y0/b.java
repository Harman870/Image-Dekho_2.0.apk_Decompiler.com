package y0;

import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import x8.f;

public final class b implements d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final e<?>[] f13010a;

    public b(e<?>... eVarArr) {
        f.f(eVarArr, "initializers");
        this.f13010a = eVarArr;
    }

    public final b0 b(Class cls, d dVar) {
        b0 b0Var = null;
        for (e<?> eVar : this.f13010a) {
            if (f.a(eVar.f13012a, cls)) {
                T invoke = eVar.f13013b.invoke(dVar);
                if (invoke instanceof b0) {
                    b0Var = (b0) invoke;
                } else {
                    b0Var = null;
                }
            }
        }
        if (b0Var != null) {
            return b0Var;
        }
        StringBuilder g10 = androidx.activity.f.g("No initializer set for given class ");
        g10.append(cls.getName());
        throw new IllegalArgumentException(g10.toString());
    }
}
