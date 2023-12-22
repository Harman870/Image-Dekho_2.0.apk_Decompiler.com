package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.d f420a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuItem f421b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f422c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b.c f423d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f423d = cVar;
        this.f420a = dVar;
        this.f421b = hVar;
        this.f422c = fVar;
    }

    public final void run() {
        b.d dVar = this.f420a;
        if (dVar != null) {
            b.this.A = true;
            dVar.f418b.c(false);
            b.this.A = false;
        }
        if (this.f421b.isEnabled() && this.f421b.hasSubMenu()) {
            this.f422c.q(this.f421b, (j) null, 4);
        }
    }
}
