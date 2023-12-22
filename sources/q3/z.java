package q3;

import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p3.a;
import r3.b;
import r3.i;
import r3.o;

public final class z implements b.c, j0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.e f11308a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?> f11309b;

    /* renamed from: c  reason: collision with root package name */
    public i f11310c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set<Scope> f11311d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11312e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f11313f;

    public z(d dVar, a.e eVar, a<?> aVar) {
        this.f11313f = dVar;
        this.f11308a = eVar;
        this.f11309b = aVar;
    }

    public final void a(o3.b bVar) {
        this.f11313f.f11224n.post(new y(this, bVar));
    }

    public final void b(o3.b bVar) {
        w wVar = (w) this.f11313f.f11221j.get(this.f11309b);
        if (wVar != null) {
            o.c(wVar.f11297m.f11224n);
            a.e eVar = wVar.f11287b;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            eVar.e(sb.toString());
            wVar.q(bVar, (RuntimeException) null);
        }
    }
}
