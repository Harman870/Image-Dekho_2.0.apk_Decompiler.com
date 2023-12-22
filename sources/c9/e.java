package c9;

import java.util.Arrays;
import java.util.List;
import x8.f;
import y3.a;

public class e extends a {
    public static final List Y(Object[] objArr) {
        f.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        f.e(asList, "asList(this)");
        return asList;
    }

    public static void Z(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        f.f(objArr, "<this>");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }
}
