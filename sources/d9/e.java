package d9;

import x8.f;

public class e extends d {
    public static final boolean u(int i10, int i11, int i12, String str, String str2, boolean z9) {
        f.f(str, "<this>");
        f.f(str2, "other");
        return !z9 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z9, i10, str2, i11, i12);
    }

    public static boolean v(String str, String str2) {
        f.f(str, "<this>");
        return str.startsWith(str2);
    }
}
