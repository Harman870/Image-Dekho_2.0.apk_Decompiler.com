package i4;

import java.util.Arrays;
import y3.a;

public final class j4 implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7403a;

    public /* synthetic */ j4(byte[] bArr) {
        this.f7403a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j4 j4Var = (j4) obj;
        int length = this.f7403a.length;
        int length2 = j4Var.f7403a.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f7403a;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = j4Var.f7403a[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j4)) {
            return false;
        }
        return Arrays.equals(this.f7403a, ((j4) obj).f7403a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7403a);
    }

    public final String toString() {
        return a.O(this.f7403a);
    }
}
