package u9;

import androidx.emoji2.text.g;
import j9.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import u9.c;

public final class i extends c.a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Executor f12276a;

    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f12277a;

        /* renamed from: b  reason: collision with root package name */
        public final b<T> f12278b;

        /* renamed from: u9.i$a$a  reason: collision with other inner class name */
        public class C0158a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f12279a;

            public C0158a(d dVar) {
                this.f12279a = dVar;
            }

            public final void a(b<T> bVar, b0<T> b0Var) {
                a.this.f12277a.execute(new g(this, this.f12279a, b0Var, 1));
            }

            public final void b(b<T> bVar, Throwable th) {
                a.this.f12277a.execute(new h(this, this.f12279a, th));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f12277a = executor;
            this.f12278b = bVar;
        }

        public final b0<T> a() {
            return this.f12278b.a();
        }

        public final void cancel() {
            this.f12278b.cancel();
        }

        public final b<T> clone() {
            return new a(this.f12277a, this.f12278b.clone());
        }

        public final void s(d<T> dVar) {
            this.f12278b.s(new C0158a(dVar));
        }

        public final x t() {
            return this.f12278b.t();
        }

        public final boolean u() {
            return this.f12278b.u();
        }
    }

    public i(@Nullable Executor executor) {
        this.f12276a = executor;
    }

    @Nullable
    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (h0.e(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = h0.d(0, (ParameterizedType) type);
            if (!h0.h(annotationArr, f0.class)) {
                executor = this.f12276a;
            }
            return new g(d10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
