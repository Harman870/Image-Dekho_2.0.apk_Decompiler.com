package q6;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f11346a = 0;

    public final void write(int i10) {
        this.f11346a++;
    }

    public final void write(byte[] bArr) {
        this.f11346a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f11346a += (long) i11;
    }
}
