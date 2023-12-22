package v1;

import java.io.InputStream;
import java.net.URL;
import o1.h;
import u1.f;
import u1.n;
import u1.o;
import u1.r;

public final class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<f, InputStream> f12421a;

    public static class a implements o<URL, InputStream> {
        public final n<URL, InputStream> b(r rVar) {
            return new e(rVar.b(f.class, InputStream.class));
        }
    }

    public e(n<f, InputStream> nVar) {
        this.f12421a = nVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        return this.f12421a.a(new f((URL) obj), i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
