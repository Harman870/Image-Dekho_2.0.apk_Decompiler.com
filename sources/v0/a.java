package v0;

import androidx.fragment.app.o;
import x8.f;

public final class a extends f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(o oVar, String str) {
        super(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str);
        f.f(oVar, "fragment");
        f.f(str, "previousFragmentId");
    }
}
