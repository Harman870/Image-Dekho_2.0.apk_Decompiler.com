package k2;

import android.util.Log;
import g0.f;
import k2.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0107a f9048a = new C0107a();

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    public class C0107a implements e<Object> {
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements g0.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f9049a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f9050b;

        /* renamed from: c  reason: collision with root package name */
        public final g0.d<T> f9051c;

        public c(f fVar, b bVar, e eVar) {
            this.f9051c = fVar;
            this.f9049a = bVar;
            this.f9050b = eVar;
        }

        public final boolean a(T t10) {
            if (t10 instanceof d) {
                ((d) t10).d().f9052a = true;
            }
            this.f9050b.a(t10);
            return this.f9051c.a(t10);
        }

        public final T b() {
            T b10 = this.f9051c.b();
            if (b10 == null) {
                b10 = this.f9049a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder g10 = androidx.activity.f.g("Created new ");
                    g10.append(b10.getClass());
                    Log.v("FactoryPools", g10.toString());
                }
            }
            if (b10 instanceof d) {
                ((d) b10).d().f9052a = false;
            }
            return b10;
        }
    }

    public interface d {
        d.a d();
    }

    public interface e<T> {
        void a(T t10);
    }

    public static c a(int i10, b bVar) {
        return new c(new f(i10), bVar, f9048a);
    }
}
