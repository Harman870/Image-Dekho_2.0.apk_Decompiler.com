package y1;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f13014a;

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    public static class C0170a implements e.a<ByteBuffer> {
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f13014a = byteBuffer;
    }

    public final Object a() {
        this.f13014a.position(0);
        return this.f13014a;
    }

    public final void b() {
    }
}
