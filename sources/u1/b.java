package u1;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o1.h;
import u1.n;

public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0152b<Data> f12098a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: u1.b$a$a  reason: collision with other inner class name */
        public class C0151a implements C0152b<ByteBuffer> {
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0151a());
        }
    }

    /* renamed from: u1.b$b  reason: collision with other inner class name */
    public interface C0152b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f12099a;

        /* renamed from: b  reason: collision with root package name */
        public final C0152b<Data> f12100b;

        public c(byte[] bArr, C0152b<Data> bVar) {
            this.f12099a = bArr;
            this.f12100b = bVar;
        }

        public final Class<Data> a() {
            return this.f12100b.a();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final o1.a e() {
            return o1.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super Data> aVar) {
            aVar.d(this.f12100b.b(this.f12099a));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0152b<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(C0152b<Data> bVar) {
        this.f12098a = bVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new i2.b(bArr), new c(bArr, this.f12098a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
