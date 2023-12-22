package u9;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f12288a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f12289b;

    public l(Method method, ArrayList arrayList) {
        this.f12288a = method;
        this.f12289b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f12288a.getDeclaringClass().getName(), this.f12288a.getName(), this.f12289b});
    }
}
