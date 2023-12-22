package e9;

import h9.j;
import i9.c;

public abstract class s0 extends p {
    public abstract s0 N();

    public String toString() {
        String str;
        s0 s0Var;
        c cVar = a0.f6218a;
        s0 s0Var2 = j.f7066a;
        if (this == s0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                s0Var = s0Var2.N();
            } catch (UnsupportedOperationException unused) {
                s0Var = null;
            }
            if (this == s0Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + t.c(this);
    }
}
