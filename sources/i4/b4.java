package i4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

public final class b4 {
    public static a4 a(String str) {
        Map unmodifiableMap;
        Logger logger = o4.f7554a;
        synchronized (o4.class) {
            unmodifiableMap = Collections.unmodifiableMap(o4.f7559f);
        }
        a4 a4Var = (a4) unmodifiableMap.get(str);
        if (a4Var != null) {
            return a4Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
