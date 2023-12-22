package d;

import android.view.View;
import c6.b;
import h0.l0;
import h0.m0;
import h0.y;
import java.util.WeakHashMap;

public final class m extends b {
    public final /* synthetic */ i w;

    public m(i iVar) {
        this.w = iVar;
    }

    public final void a() {
        this.w.f5900v.setAlpha(1.0f);
        this.w.f5903y.d((m0) null);
        this.w.f5903y = null;
    }

    public final void k() {
        this.w.f5900v.setVisibility(0);
        if (this.w.f5900v.getParent() instanceof View) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.h.c((View) this.w.f5900v.getParent());
        }
    }
}
