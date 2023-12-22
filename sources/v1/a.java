package v1;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.ArrayDeque;
import o1.g;
import o1.h;
import u1.f;
import u1.m;
import u1.n;
import u1.o;
import u1.r;

public final class a implements n<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f12398b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<f, f> f12399a;

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    public static class C0161a implements o<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<f, f> f12400a = new m<>();

        public final n<f, InputStream> b(r rVar) {
            return new a(this.f12400a);
        }
    }

    public a(m<f, f> mVar) {
        this.f12399a = mVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        f fVar = (f) obj;
        m<f, f> mVar = this.f12399a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar);
            Object a11 = mVar.f12130a.a(a10);
            ArrayDeque arrayDeque = m.a.f12131d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            f fVar2 = (f) a11;
            if (fVar2 == null) {
                m<f, f> mVar2 = this.f12399a;
                mVar2.getClass();
                mVar2.f12130a.d(m.a.a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new n.a(fVar, new j(fVar, ((Integer) hVar.c(f12398b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        f fVar = (f) obj;
        return true;
    }
}
