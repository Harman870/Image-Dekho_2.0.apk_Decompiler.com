package j6;

import java.util.Set;
import u6.a;

public interface b {
    <T> T a(Class<T> cls) {
        return c(v.a(cls));
    }

    <T> a<T> b(v<T> vVar);

    <T> T c(v<T> vVar) {
        a<T> b10 = b(vVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    <T> a<T> d(Class<T> cls) {
        return b(v.a(cls));
    }

    <T> a<Set<T>> e(v<T> vVar);

    <T> Set<T> f(v<T> vVar) {
        return e(vVar).get();
    }
}
