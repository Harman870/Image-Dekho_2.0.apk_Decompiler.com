package u9;

import j9.a0;
import j9.c0;
import j9.d0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o8.h;
import u9.f;
import w9.w;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12206a = true;

    /* renamed from: u9.a$a  reason: collision with other inner class name */
    public static final class C0156a implements f<d0, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0156a f12207a = new C0156a();

        public final Object b(Object obj) {
            d0 d0Var = (d0) obj;
            try {
                t9.e eVar = new t9.e();
                d0Var.j().x(eVar);
                return new c0(d0Var.c(), d0Var.a(), eVar);
            } finally {
                d0Var.close();
            }
        }
    }

    public static final class b implements f<a0, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12208a = new b();

        public final Object b(Object obj) {
            return (a0) obj;
        }
    }

    public static final class c implements f<d0, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12209a = new c();

        public final Object b(Object obj) {
            return (d0) obj;
        }
    }

    public static final class d implements f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12210a = new d();

        public final Object b(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements f<d0, h> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f12211a = new e();

        public final Object b(Object obj) {
            ((d0) obj).close();
            return h.f10610a;
        }
    }

    public static final class f implements f<d0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f12212a = new f();

        public final Object b(Object obj) {
            ((d0) obj).close();
            return null;
        }
    }

    @Nullable
    public final f a(Type type) {
        if (a0.class.isAssignableFrom(h0.e(type))) {
            return b.f12208a;
        }
        return null;
    }

    @Nullable
    public final f<d0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (type == d0.class) {
            return h0.h(annotationArr, w.class) ? c.f12209a : C0156a.f12207a;
        }
        if (type == Void.class) {
            return f.f12212a;
        }
        if (!this.f12206a || type != h.class) {
            return null;
        }
        try {
            return e.f12211a;
        } catch (NoClassDefFoundError unused) {
            this.f12206a = false;
            return null;
        }
    }
}
