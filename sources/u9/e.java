package u9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u9.c;

@IgnoreJRERequirement
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12257a = new e();

    @IgnoreJRERequirement
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f12258a;

        @IgnoreJRERequirement
        /* renamed from: u9.e$a$a  reason: collision with other inner class name */
        public class C0157a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f12259a;

            public C0157a(b bVar) {
                this.f12259a = bVar;
            }

            public final void a(b<R> bVar, b0<R> b0Var) {
                boolean z9;
                int i10 = b0Var.f12245a.f8823c;
                if (i10 < 200 || i10 >= 300) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    this.f12259a.complete(b0Var.f12246b);
                } else {
                    this.f12259a.completeExceptionally(new j(b0Var));
                }
            }

            public final void b(b<R> bVar, Throwable th) {
                this.f12259a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f12258a = type;
        }

        public final Object a(t tVar) {
            b bVar = new b(tVar);
            tVar.s(new C0157a(bVar));
            return bVar;
        }

        public final Type b() {
            return this.f12258a;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f12260a;

        public b(t tVar) {
            this.f12260a = tVar;
        }

        public final boolean cancel(boolean z9) {
            if (z9) {
                this.f12260a.cancel();
            }
            return super.cancel(z9);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements c<R, CompletableFuture<b0<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f12261a;

        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<b0<R>> f12262a;

            public a(b bVar) {
                this.f12262a = bVar;
            }

            public final void a(b<R> bVar, b0<R> b0Var) {
                this.f12262a.complete(b0Var);
            }

            public final void b(b<R> bVar, Throwable th) {
                this.f12262a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f12261a = type;
        }

        public final Object a(t tVar) {
            b bVar = new b(tVar);
            tVar.s(new a(bVar));
            return bVar;
        }

        public final Type b() {
            return this.f12261a;
        }
    }

    @Nullable
    public final c a(Type type, Annotation[] annotationArr) {
        if (h0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = h0.d(0, (ParameterizedType) type);
            if (h0.e(d10) != b0.class) {
                return new a(d10);
            }
            if (d10 instanceof ParameterizedType) {
                return new c(h0.d(0, (ParameterizedType) d10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
