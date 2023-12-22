package d9;

import androidx.activity.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p8.a;
import x8.f;
import z5.c;

public class g extends e {
    public static final boolean A(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z9) {
        f.f(charSequence, "<this>");
        f.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.g(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z9)) {
                return false;
            }
        }
        return true;
    }

    public static final String B(String str) {
        if (!str.startsWith("custom_")) {
            return str;
        }
        String substring = str.substring("custom_".length());
        f.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String C(String str) {
        f.f(str, "<this>");
        if (!str.endsWith(",")) {
            return str;
        }
        String substring = str.substring(0, str.length() - ",".length());
        f.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void D(int i10) {
        boolean z9;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            throw new IllegalArgumentException(e.a("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static List E(String str, String[] strArr) {
        boolean z9;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                D(0);
                int x9 = x(0, str, str2, false);
                if (x9 != -1) {
                    ArrayList arrayList = new ArrayList(10);
                    int i10 = 0;
                    do {
                        arrayList.add(str.subSequence(i10, x9).toString());
                        i10 = str2.length() + x9;
                        x9 = x(i10, str, str2, false);
                    } while (x9 != -1);
                    arrayList.add(str.subSequence(i10, str.length()).toString());
                    return arrayList;
                }
                List singletonList = Collections.singletonList(str.toString());
                f.e(singletonList, "singletonList(element)");
                return singletonList;
            }
        }
        D(0);
        c9.f fVar = new c9.f(new a(str, 0, 0, new f(c9.e.Y(strArr), false)));
        ArrayList arrayList2 = new ArrayList(a.u(fVar));
        Iterator<Object> it = fVar.iterator();
        while (it.hasNext()) {
            a9.c cVar = (a9.c) it.next();
            f.f(cVar, "range");
            arrayList2.add(str.subSequence(Integer.valueOf(cVar.f220a).intValue(), Integer.valueOf(cVar.f221b).intValue() + 1).toString());
        }
        return arrayList2;
    }

    public static String F(String str) {
        f.f(str, "<this>");
        f.f(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, w(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        f.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int w(CharSequence charSequence) {
        f.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int x(int i10, CharSequence charSequence, String str, boolean z9) {
        f.f(charSequence, "<this>");
        f.f(str, "string");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return y(charSequence, str, i10, charSequence.length(), z9, false);
    }

    public static final int y(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10) {
        a9.a aVar;
        if (!z10) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            aVar = new a9.c(i10, i11);
        } else {
            int w = w(charSequence);
            if (i10 > w) {
                i10 = w;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            aVar = new a9.a(i10, i11, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i12 = aVar.f220a;
            int i13 = aVar.f221b;
            int i14 = aVar.f222c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!A(charSequence2, 0, charSequence, i12, charSequence2.length(), z9)) {
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    } else {
                        return i12;
                    }
                }
            }
        } else {
            int i15 = aVar.f220a;
            int i16 = aVar.f221b;
            int i17 = aVar.f222c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    if (!e.u(0, i15, charSequence2.length(), (String) charSequence2, (String) charSequence, z9)) {
                        if (i15 == i16) {
                            break;
                        }
                        i15 += i17;
                    } else {
                        return i15;
                    }
                }
            }
        }
        return -1;
    }

    public static int z(String str, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return str.indexOf(c10, i10);
    }
}
