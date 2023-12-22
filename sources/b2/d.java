package b2;

import android.graphics.Bitmap;
import b2.f;
import z1.c;

public final class d extends c<c> {
    public d(c cVar) {
        super(cVar);
    }

    public final int a() {
        f fVar = ((c) this.f13143a).f2210a.f2220a;
        return fVar.f2222a.f() + fVar.f2235o;
    }

    public final Class<c> b() {
        return c.class;
    }

    public final void c() {
        ((c) this.f13143a).stop();
        c cVar = (c) this.f13143a;
        cVar.f2213d = true;
        f fVar = cVar.f2210a.f2220a;
        fVar.f2224c.clear();
        Bitmap bitmap = fVar.f2232l;
        if (bitmap != null) {
            fVar.f2226e.e(bitmap);
            fVar.f2232l = null;
        }
        fVar.f2227f = false;
        f.a aVar = fVar.f2230i;
        if (aVar != null) {
            fVar.f2225d.i(aVar);
            fVar.f2230i = null;
        }
        f.a aVar2 = fVar.k;
        if (aVar2 != null) {
            fVar.f2225d.i(aVar2);
            fVar.k = null;
        }
        f.a aVar3 = fVar.f2234n;
        if (aVar3 != null) {
            fVar.f2225d.i(aVar3);
            fVar.f2234n = null;
        }
        fVar.f2222a.clear();
        fVar.f2231j = true;
    }

    public final void initialize() {
        ((c) this.f13143a).f2210a.f2220a.f2232l.prepareToDraw();
    }
}
