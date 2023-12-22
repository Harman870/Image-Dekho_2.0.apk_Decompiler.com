package u1;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import o1.h;
import u1.n;

public final class v<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final v<?> f12168a = new v<>();

    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f12169a = new a<>();

        public final n<Model, Model> b(r rVar) {
            return v.f12168a;
        }
    }

    public static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        public final Model f12170a;

        public b(Model model) {
            this.f12170a = model;
        }

        public final Class<Model> a() {
            return this.f12170a.getClass();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final o1.a e() {
            return o1.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super Model> aVar) {
            aVar.d(this.f12170a);
        }
    }

    public final n.a<Model> a(Model model, int i10, int i11, h hVar) {
        return new n.a<>(new i2.b(model), new b(model));
    }

    public final boolean b(Model model) {
        return true;
    }
}
