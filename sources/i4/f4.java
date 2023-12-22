package i4;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class f4 {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f7304a = new CopyOnWriteArrayList();

    public static e4 a(String str) {
        Iterator it = f7304a.iterator();
        while (it.hasNext()) {
            e4 e4Var = (e4) it.next();
            if (e4Var.a(str)) {
                return e4Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
