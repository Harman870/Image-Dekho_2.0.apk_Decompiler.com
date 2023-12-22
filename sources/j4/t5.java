package j4;

import androidx.activity.e;
import java.util.Arrays;

public final class t5 extends r5 {
    public final void a(Object... objArr) {
        int i10 = 0;
        while (i10 < 15) {
            if (objArr[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException(e.a("at index ", i10));
            }
        }
        int i11 = this.f8440b + 15;
        Object[] objArr2 = (Object[]) this.f8441c;
        int length = objArr2.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f8441c = Arrays.copyOf(objArr2, i12);
        } else {
            if (this.f8439a) {
                this.f8441c = (Object[]) objArr2.clone();
            }
            System.arraycopy(objArr, 0, (Object[]) this.f8441c, this.f8440b, 15);
            this.f8440b += 15;
        }
        this.f8439a = false;
        System.arraycopy(objArr, 0, (Object[]) this.f8441c, this.f8440b, 15);
        this.f8440b += 15;
    }
}
