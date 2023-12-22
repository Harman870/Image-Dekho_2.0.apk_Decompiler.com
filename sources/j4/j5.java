package j4;

import androidx.activity.e;

public final class j5 {
    public static void a(int i10, int i11) {
        String str;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                str = l5.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else if (i11 < 0) {
                throw new IllegalArgumentException(e.a("negative size: ", i11));
            } else {
                str = l5.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void b(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = c(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = c(i11, i12, "end index");
            } else {
                str = l5.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String c(int i10, int i11, String str) {
        if (i10 < 0) {
            return l5.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return l5.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException(e.a("negative size: ", i11));
        }
    }
}
