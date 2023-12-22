package a9;

import java.util.Iterator;

public class a implements Iterable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final int f220a;

    /* renamed from: b  reason: collision with root package name */
    public final int f221b;

    /* renamed from: c  reason: collision with root package name */
    public final int f222c;

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f220a = i10;
            if (i12 > 0) {
                if (i10 < i11) {
                    int i13 = i11 % i12;
                    int i14 = i10 % i12;
                    int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                    i11 -= i15 < 0 ? i15 + i12 : i15;
                }
            } else if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                int i18 = i11 % i16;
                int i19 = ((i17 < 0 ? i17 + i16 : i17) - (i18 < 0 ? i18 + i16 : i18)) % i16;
                i11 += i19 < 0 ? i19 + i16 : i19;
            }
            this.f221b = i11;
            this.f222c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f220a == aVar.f220a && this.f221b == aVar.f221b && this.f222c == aVar.f222c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f220a * 31) + this.f221b) * 31) + this.f222c;
    }

    public boolean isEmpty() {
        if (this.f222c > 0) {
            if (this.f220a > this.f221b) {
                return true;
            }
        } else if (this.f220a < this.f221b) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(this.f220a, this.f221b, this.f222c);
    }

    public String toString() {
        int i10;
        StringBuilder sb;
        if (this.f222c > 0) {
            sb = new StringBuilder();
            sb.append(this.f220a);
            sb.append("..");
            sb.append(this.f221b);
            sb.append(" step ");
            i10 = this.f222c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f220a);
            sb.append(" downTo ");
            sb.append(this.f221b);
            sb.append(" step ");
            i10 = -this.f222c;
        }
        sb.append(i10);
        return sb.toString();
    }
}
