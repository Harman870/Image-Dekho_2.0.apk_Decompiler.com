package i6;

import android.app.Application;
import android.content.Context;
import c6.f;
import q3.b;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final i f7923a;

    public s(f fVar) {
        fVar.a();
        Context context = fVar.f2494a;
        this.f7923a = new i(fVar);
        b.a((Application) context.getApplicationContext());
        b bVar = b.f11201e;
        r rVar = new r(this);
        bVar.getClass();
        synchronized (bVar) {
            bVar.f11204c.add(rVar);
        }
    }
}
