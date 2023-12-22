package n9;

import j9.q;

public final class h {
    public static String a(q qVar) {
        String f10 = qVar.f();
        String h10 = qVar.h();
        if (h10 == null) {
            return f10;
        }
        return f10 + '?' + h10;
    }
}
