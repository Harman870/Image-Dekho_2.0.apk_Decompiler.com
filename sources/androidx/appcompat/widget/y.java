package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.z;
import h.f;

public final class y extends r0 {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z.g f997j;
    public final /* synthetic */ z k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(z zVar, View view, z.g gVar) {
        super(view);
        this.k = zVar;
        this.f997j = gVar;
    }

    public final f b() {
        return this.f997j;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        if (this.k.getInternalPopup().b()) {
            return true;
        }
        z zVar = this.k;
        zVar.f1012f.l(z.c.b(zVar), z.c.a(zVar));
        return true;
    }
}
