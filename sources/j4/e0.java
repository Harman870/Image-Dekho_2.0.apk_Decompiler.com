package j4;

import java.util.ArrayList;
import o.c;

public final class e0 extends w {
    public final p a(String str, c cVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !cVar.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        p d10 = cVar.d(str);
        if (d10 instanceof j) {
            return ((j) d10).c(cVar, arrayList);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
