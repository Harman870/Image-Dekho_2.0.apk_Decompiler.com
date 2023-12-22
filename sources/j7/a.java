package j7;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f8776a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f8777b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8778c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a10 = g7.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f8777b = a10;
            this.f8776a = g7.a.e(a10);
            this.f8778c = a10.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && g7.a.c(this.f8777b, ((a) obj).f8777b);
    }

    public final int hashCode() {
        return this.f8778c;
    }

    public final String toString() {
        return g7.a.g(this.f8777b);
    }

    public a(Type type) {
        type.getClass();
        Type a10 = g7.a.a(type);
        this.f8777b = a10;
        this.f8776a = g7.a.e(a10);
        this.f8778c = a10.hashCode();
    }
}
