package i4;

import androidx.activity.e;
import androidx.activity.f;

public final class b0 extends d0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f7195d;

    public b0(byte[] bArr, int i10) {
        super(bArr);
        e0.o(0, i10, bArr.length);
        this.f7195d = i10;
    }

    public final byte a(int i10) {
        int i11 = this.f7195d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f7246c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(e.a("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(f.f("Index > length: ", i10, ", ", i11));
    }

    public final byte d(int i10) {
        return this.f7246c[i10];
    }

    public final int g() {
        return this.f7195d;
    }

    public final void h(int i10, byte[] bArr) {
        System.arraycopy(this.f7246c, 0, bArr, 0, i10);
    }

    public final void s() {
    }
}
