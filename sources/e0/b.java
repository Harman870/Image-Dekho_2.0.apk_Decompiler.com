package e0;

import a0.e;
import androidx.lifecycle.c0;
import z.f;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f6122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6123b;

    public b(c0 c0Var, int i10) {
        this.f6122a = c0Var;
        this.f6123b = i10;
    }

    public final void run() {
        c0 c0Var = this.f6122a;
        int i10 = this.f6123b;
        f.e eVar = ((e.a) c0Var).f13o;
        if (eVar != null) {
            eVar.c(i10);
        }
    }
}
