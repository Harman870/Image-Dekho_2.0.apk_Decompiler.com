package x1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class d0 extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f12855a;

    public d0(ByteBuffer byteBuffer) {
        this.f12855a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f12855a.limit();
    }

    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (j10 >= ((long) this.f12855a.limit())) {
            return -1;
        }
        this.f12855a.position((int) j10);
        int min = Math.min(i11, this.f12855a.remaining());
        this.f12855a.get(bArr, i10, min);
        return min;
    }
}
