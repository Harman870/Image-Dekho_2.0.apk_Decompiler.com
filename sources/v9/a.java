package v9;

import e7.h;
import j9.d0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import n3.w;
import u9.f;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f12648a;

    public a(h hVar) {
        this.f12648a = hVar;
    }

    public final f a(Type type) {
        return new b(this.f12648a, this.f12648a.b(new j7.a(type)));
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, u9.d0 d0Var) {
        return new w((Object) this.f12648a, (Object) this.f12648a.b(new j7.a(type)));
    }
}
