package x1;

import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import o1.h;
import o1.j;
import q1.w;
import x1.s;

public final class f implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f12856a;

    public f(m mVar) {
        this.f12856a = mVar;
    }

    public final boolean a(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        this.f12856a.getClass();
        return true;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        m mVar = this.f12856a;
        List<ImageHeaderParser> list = mVar.f12881d;
        return mVar.a(new s.a(mVar.f12880c, (ByteBuffer) obj, list), i10, i11, hVar, m.f12877j);
    }
}
