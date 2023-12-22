package androidx.lifecycle;

import androidx.lifecycle.g;

public final class SavedStateHandleAttacher implements j {

    /* renamed from: a  reason: collision with root package name */
    public final z f1705a;

    public SavedStateHandleAttacher(z zVar) {
        this.f1705a = zVar;
    }

    public final void b(l lVar, g.b bVar) {
        boolean z9;
        if (bVar == g.b.ON_CREATE) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            lVar.r().c(this);
            z zVar = this.f1705a;
            if (!zVar.f1780b) {
                zVar.f1781c = zVar.f1779a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                zVar.f1780b = true;
                a0 a0Var = (a0) zVar.f1782d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
