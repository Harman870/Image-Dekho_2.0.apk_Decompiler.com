package u1;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import g0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o1.f;
import o1.h;
import q1.r;
import u1.n;

public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f12142a;

    /* renamed from: b  reason: collision with root package name */
    public final d<List<Throwable>> f12143b;

    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f12144a;

        /* renamed from: b  reason: collision with root package name */
        public final g0.d<List<Throwable>> f12145b;

        /* renamed from: c  reason: collision with root package name */
        public int f12146c;

        /* renamed from: d  reason: collision with root package name */
        public j f12147d;

        /* renamed from: e  reason: collision with root package name */
        public d.a<? super Data> f12148e;

        /* renamed from: f  reason: collision with root package name */
        public List<Throwable> f12149f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12150g;

        public a(ArrayList arrayList, g0.d dVar) {
            this.f12145b = dVar;
            if (!arrayList.isEmpty()) {
                this.f12144a = arrayList;
                this.f12146c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final Class<Data> a() {
            return this.f12144a.get(0).a();
        }

        public final void b() {
            List<Throwable> list = this.f12149f;
            if (list != null) {
                this.f12145b.a(list);
            }
            this.f12149f = null;
            for (com.bumptech.glide.load.data.d<Data> b10 : this.f12144a) {
                b10.b();
            }
        }

        public final void c(Exception exc) {
            List<Throwable> list = this.f12149f;
            y3.a.h(list);
            list.add(exc);
            g();
        }

        public final void cancel() {
            this.f12150g = true;
            for (com.bumptech.glide.load.data.d<Data> cancel : this.f12144a) {
                cancel.cancel();
            }
        }

        public final void d(Data data) {
            if (data != null) {
                this.f12148e.d(data);
            } else {
                g();
            }
        }

        public final o1.a e() {
            return this.f12144a.get(0).e();
        }

        public final void f(j jVar, d.a<? super Data> aVar) {
            this.f12147d = jVar;
            this.f12148e = aVar;
            this.f12149f = this.f12145b.b();
            this.f12144a.get(this.f12146c).f(jVar, this);
            if (this.f12150g) {
                cancel();
            }
        }

        public final void g() {
            if (!this.f12150g) {
                if (this.f12146c < this.f12144a.size() - 1) {
                    this.f12146c++;
                    f(this.f12147d, this.f12148e);
                    return;
                }
                y3.a.h(this.f12149f);
                this.f12148e.c(new r("Fetch failed", new ArrayList(this.f12149f)));
            }
        }
    }

    public q(ArrayList arrayList, g0.d dVar) {
        this.f12142a = arrayList;
        this.f12143b = dVar;
    }

    public final n.a<Data> a(Model model, int i10, int i11, h hVar) {
        n.a a10;
        int size = this.f12142a.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = this.f12142a.get(i12);
            if (nVar.b(model) && (a10 = nVar.a(model, i10, i11, hVar)) != null) {
                fVar = a10.f12135a;
                arrayList.add(a10.f12137c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f12143b));
    }

    public final boolean b(Model model) {
        for (n<Model, Data> b10 : this.f12142a) {
            if (b10.b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("MultiModelLoader{modelLoaders=");
        g10.append(Arrays.toString(this.f12142a.toArray()));
        g10.append('}');
        return g10.toString();
    }
}
