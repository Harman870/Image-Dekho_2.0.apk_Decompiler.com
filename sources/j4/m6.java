package j4;

import androidx.activity.e;
import androidx.activity.f;

public final class m6 extends o6 {

    /* renamed from: d  reason: collision with root package name */
    public final int f8325d;

    public m6(byte[] bArr, int i10) {
        super(bArr);
        q6.m(0, i10, bArr.length);
        this.f8325d = i10;
    }

    public final byte a(int i10) {
        int i11 = this.f8325d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f8365c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(e.a("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(f.f("Index > length: ", i10, ", ", i11));
    }

    public final byte d(int i10) {
        return this.f8365c[i10];
    }

    public final int g() {
        return this.f8325d;
    }

    public final void o() {
    }
}
