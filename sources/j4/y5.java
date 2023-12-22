package j4;

import androidx.activity.e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class y5 extends s5 implements Set {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8565c = 0;
    @CheckForNull

    /* renamed from: b  reason: collision with root package name */
    public transient x5 f8566b;

    public static int j(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static y5 k(int i10, Object... objArr) {
        if (i10 == 0) {
            return b6.f8054j;
        }
        if (i10 != 1) {
            int j10 = j(i10);
            Object[] objArr2 = new Object[j10];
            int i11 = j10 - 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i10) {
                Object obj = objArr[i12];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * -862048943), 15)) * 461845907);
                    while (true) {
                        int i15 = rotateLeft & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            rotateLeft++;
                        } else {
                            objArr[i14] = obj;
                            objArr2[i15] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                    }
                    i12++;
                } else {
                    throw new NullPointerException(e.a("at index ", i12));
                }
            }
            Arrays.fill(objArr, i14, i10, (Object) null);
            if (i14 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new c6(obj3);
            }
            if (j(i14) < j10 / 2) {
                return k(i14, objArr);
            }
            if (i14 < 10) {
                objArr = Arrays.copyOf(objArr, i14);
            }
            return new b6(objArr, i13, objArr2, i11, i14);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new c6(obj4);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y5) && (this instanceof b6)) {
            y5 y5Var = (y5) obj;
            y5Var.getClass();
            if ((y5Var instanceof b6) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    /* renamed from: i */
    public abstract d6 iterator();
}
