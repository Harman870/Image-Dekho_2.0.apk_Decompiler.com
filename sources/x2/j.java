package x2;

import android.content.Context;
import f3.b;
import f3.c;
import n8.a;
import y2.b;
import y2.c;

public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f12937a;

    /* renamed from: b  reason: collision with root package name */
    public final a<f3.a> f12938b;

    /* renamed from: c  reason: collision with root package name */
    public final a<f3.a> f12939c;

    public j(c cVar) {
        f3.b bVar = b.a.f6377a;
        f3.c cVar2 = c.a.f6378a;
        this.f12937a = cVar;
        this.f12938b = bVar;
        this.f12939c = cVar2;
    }

    public final Object get() {
        return new i(this.f12937a.get(), this.f12938b.get(), this.f12939c.get());
    }
}
