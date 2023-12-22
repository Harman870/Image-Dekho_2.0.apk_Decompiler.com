package androidx.lifecycle;

import androidx.lifecycle.g;

final class SavedStateHandleController implements j {
    public final void b(l lVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            lVar.r().c(this);
        }
    }
}
