package w2;

import androidx.activity.e;
import androidx.activity.f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import n6.d;
import q6.a;

public final class c implements d<z2.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12673a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final n6.c f12674b = new n6.c("eventsDroppedCount", f.j(e.d(q6.d.class, new a(1))));

    /* renamed from: c  reason: collision with root package name */
    public static final n6.c f12675c = new n6.c(IronSourceConstants.EVENTS_ERROR_REASON, f.j(e.d(q6.d.class, new a(3))));

    public final void a(Object obj, Object obj2) {
        z2.c cVar = (z2.c) obj;
        n6.e eVar = (n6.e) obj2;
        eVar.b(f12674b, cVar.f13156a);
        eVar.a(f12675c, cVar.f13157b);
    }
}
