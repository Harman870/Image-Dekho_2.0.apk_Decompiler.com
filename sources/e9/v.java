package e9;

import h9.j;
import h9.o;
import i9.c;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final w f6273a;

    static {
        String str;
        boolean z9;
        w wVar;
        int i10 = o.f7068a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            z9 = false;
        } else {
            z9 = Boolean.parseBoolean(str);
        }
        if (z9) {
            c cVar = a0.f6218a;
            s0 s0Var = j.f7066a;
            s0Var.N();
            if (s0Var instanceof w) {
                wVar = (w) s0Var;
                f6273a = wVar;
            }
        }
        wVar = u.f6270g;
        f6273a = wVar;
    }
}
