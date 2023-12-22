package u1;

import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import o1.f;
import o1.h;

public interface n<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final f f12135a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f12136b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f12137c;

        public a() {
            throw null;
        }

        public a(f fVar, d<Data> dVar) {
            List<f> emptyList = Collections.emptyList();
            y3.a.h(fVar);
            this.f12135a = fVar;
            y3.a.h(emptyList);
            this.f12136b = emptyList;
            y3.a.h(dVar);
            this.f12137c = dVar;
        }
    }

    a<Data> a(Model model, int i10, int i11, h hVar);

    boolean b(Model model);
}
