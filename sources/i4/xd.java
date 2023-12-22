package i4;

import androidx.fragment.app.w0;
import java.util.Arrays;
import y3.a;

public final class xd {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7793a;

    public xd(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f7793a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static xd a(byte[] bArr) {
        if (bArr != null) {
            return new xd(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xd)) {
            return false;
        }
        return Arrays.equals(((xd) obj).f7793a, this.f7793a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7793a);
    }

    public final String toString() {
        return w0.d("Bytes(", a.O(this.f7793a), ")");
    }
}
