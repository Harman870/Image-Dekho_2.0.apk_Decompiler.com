package u9;

import javax.annotation.Nullable;

public final class v extends x<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12318a;

    public v(x xVar) {
        this.f12318a = xVar;
    }

    public final void a(z zVar, @Nullable Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a10 : iterable) {
                this.f12318a.a(zVar, a10);
            }
        }
    }
}
