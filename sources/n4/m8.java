package n4;

import j4.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import r3.o;

public abstract class m8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f9967a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9968b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f9969c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f9970d;

    /* renamed from: e  reason: collision with root package name */
    public Long f9971e;

    /* renamed from: f  reason: collision with root package name */
    public Long f9972f;

    public m8(String str, int i10) {
        this.f9967a = str;
        this.f9968b = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean d(java.math.BigDecimal r8, j4.l2 r9, double r10) {
        /*
            r3.o.h(r9)
            boolean r0 = r9.z()
            r1 = 0
            if (r0 == 0) goto L_0x0109
            int r0 = r9.E()
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0109
        L_0x0013:
            int r0 = r9.E()
            r3 = 5
            if (r0 != r3) goto L_0x0028
            boolean r0 = r9.D()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r9.C()
            if (r0 == 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r9.A()
            if (r0 != 0) goto L_0x002f
            return r1
        L_0x002f:
            int r0 = r9.E()
            int r4 = r9.E()
            if (r4 != r3) goto L_0x0064
            java.lang.String r4 = r9.x()
            boolean r4 = n4.y7.I(r4)
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r9.w()
            boolean r4 = n4.y7.I(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0063
        L_0x004e:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r5 = r9.x()     // Catch:{ NumberFormatException -> 0x0063 }
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x0063 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0063 }
            java.lang.String r9 = r9.w()     // Catch:{ NumberFormatException -> 0x0063 }
            r5.<init>(r9)     // Catch:{ NumberFormatException -> 0x0063 }
            r9 = r4
            r4 = r1
            goto L_0x007a
        L_0x0063:
            return r1
        L_0x0064:
            java.lang.String r4 = r9.v()
            boolean r4 = n4.y7.I(r4)
            if (r4 != 0) goto L_0x006f
            return r1
        L_0x006f:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0109 }
            java.lang.String r9 = r9.v()     // Catch:{ NumberFormatException -> 0x0109 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0109 }
            r9 = r1
            r5 = r9
        L_0x007a:
            if (r0 != r3) goto L_0x007f
            if (r9 == 0) goto L_0x00fb
            goto L_0x0083
        L_0x007f:
            if (r4 != 0) goto L_0x0083
            goto L_0x00fb
        L_0x0083:
            int r0 = r0 + -1
            r3 = 0
            if (r0 == r2) goto L_0x00f9
            r6 = 2
            if (r0 == r6) goto L_0x00e9
            r7 = 3
            if (r0 == r7) goto L_0x00a2
            r10 = 4
            if (r0 == r10) goto L_0x0093
            goto L_0x00fb
        L_0x0093:
            if (r9 == 0) goto L_0x00fb
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00e3
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00a2:
            if (r4 != 0) goto L_0x00a5
            goto L_0x00fb
        L_0x00a5:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00dc
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e3
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00dc:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r2 = r3
        L_0x00e4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x00fb
        L_0x00e9:
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fb
        L_0x00ec:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f9:
            if (r4 != 0) goto L_0x00fc
        L_0x00fb:
            return r1
        L_0x00fc:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = r3
        L_0x0104:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.m8.d(java.math.BigDecimal, j4.l2, double):java.lang.Boolean");
    }

    public static Boolean e(String str, q2 q2Var, i3 i3Var) {
        String str2;
        List<String> list;
        String str3;
        int i10;
        boolean z9;
        o.h(q2Var);
        if (str == null || !q2Var.B() || q2Var.C() == 1) {
            return null;
        }
        if (q2Var.C() == 7) {
            if (q2Var.t() == 0) {
                return null;
            }
        } else if (!q2Var.A()) {
            return null;
        }
        int C = q2Var.C();
        boolean y9 = q2Var.y();
        if (y9 || C == 2 || C == 7) {
            str2 = q2Var.w();
        } else {
            str2 = q2Var.w().toUpperCase(Locale.ENGLISH);
        }
        if (q2Var.t() == 0) {
            list = null;
        } else {
            list = q2Var.x();
            if (!y9) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        if (C == 2) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if (C == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!y9 && C != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != y9) {
                    i10 = 66;
                } else {
                    i10 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i10).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (i3Var == null) {
                        return null;
                    }
                    i3Var.f9831i.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                z9 = str.startsWith(str2);
                break;
            case 3:
                z9 = str.endsWith(str2);
                break;
            case 4:
                z9 = str.contains(str2);
                break;
            case 5:
                z9 = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    z9 = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(z9);
    }

    public static Boolean f(Boolean bool, boolean z9) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z9);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
