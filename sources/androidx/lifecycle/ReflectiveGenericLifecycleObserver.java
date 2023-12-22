package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1703a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0012a f1704b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1703a = obj;
        this.f1704b = a.f1707c.b(obj.getClass());
    }

    public final void b(l lVar, g.b bVar) {
        a.C0012a aVar = this.f1704b;
        Object obj = this.f1703a;
        a.C0012a.a((List) aVar.f1710a.get(bVar), lVar, bVar, obj);
        a.C0012a.a((List) aVar.f1710a.get(g.b.ON_ANY), lVar, bVar, obj);
    }
}
