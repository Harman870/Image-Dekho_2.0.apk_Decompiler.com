package j2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayDeque f8011c = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public InputStream f8012a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f8013b;

    static {
        char[] cArr = l.f8029a;
    }

    public final int available() {
        return this.f8012a.available();
    }

    public final void close() {
        this.f8012a.close();
    }

    public final void mark(int i10) {
        this.f8012a.mark(i10);
    }

    public final boolean markSupported() {
        return this.f8012a.markSupported();
    }

    public final int read() {
        try {
            return this.f8012a.read();
        } catch (IOException e10) {
            this.f8013b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f8012a.read(bArr);
        } catch (IOException e10) {
            this.f8013b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f8012a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f8013b = e10;
            throw e10;
        }
    }

    public final synchronized void reset() {
        this.f8012a.reset();
    }

    public final long skip(long j10) {
        try {
            return this.f8012a.skip(j10);
        } catch (IOException e10) {
            this.f8013b = e10;
            throw e10;
        }
    }
}
