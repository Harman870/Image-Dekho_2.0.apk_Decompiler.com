package j2;

import androidx.activity.f;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f8009a;

    /* renamed from: b  reason: collision with root package name */
    public int f8010b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f8009a = j10;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            this.f8010b += i10;
        } else if (this.f8009a - ((long) this.f8010b) > 0) {
            StringBuilder g10 = f.g("Failed to read all expected data, expected: ");
            g10.append(this.f8009a);
            g10.append(", but read: ");
            g10.append(this.f8010b);
            throw new IOException(g10.toString());
        }
    }

    public final synchronized int available() {
        return (int) Math.max(this.f8009a - ((long) this.f8010b), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
