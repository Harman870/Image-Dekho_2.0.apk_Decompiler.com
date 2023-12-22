package i7;

import androidx.activity.f;
import java.util.TimeZone;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f7934a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c10, int i10, String str) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c9 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            java.lang.String r3 = "'"
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r4 = r0 + 4
            int r0 = c(r0, r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r5 = 45
            boolean r6 = a(r5, r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r6 == 0) goto L_0x001a
            int r4 = r4 + 1
        L_0x001a:
            int r6 = r4 + 2
            int r4 = c(r4, r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            boolean r7 = a(r5, r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r7 == 0) goto L_0x0028
            int r6 = r6 + 1
        L_0x0028:
            int r7 = r6 + 2
            int r6 = c(r6, r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r8 = 84
            boolean r8 = a(r8, r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r9 = 1
            if (r8 != 0) goto L_0x004b
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r10 > r7) goto L_0x004b
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r4 = r4 - r9
            r5.<init>(r0, r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r2.setIndex(r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.util.Date r0 = r5.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            return r0
        L_0x004b:
            r10 = 90
            r11 = 43
            r12 = 2
            if (r8 == 0) goto L_0x00d4
            int r7 = r7 + 1
            int r8 = r7 + 2
            int r7 = c(r7, r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r13 = 58
            boolean r14 = a(r13, r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r14 == 0) goto L_0x0064
            int r8 = r8 + 1
        L_0x0064:
            int r14 = r8 + 2
            int r8 = c(r8, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            boolean r13 = a(r13, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r13 == 0) goto L_0x0072
            int r14 = r14 + 1
        L_0x0072:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r13 <= r14) goto L_0x00d1
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r13 == r10) goto L_0x00d1
            if (r13 == r11) goto L_0x00d1
            if (r13 == r5) goto L_0x00d1
            int r5 = r14 + 2
            int r11 = c(r14, r5, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r13 = 59
            if (r11 <= r13) goto L_0x0092
            r13 = 63
            if (r11 >= r13) goto L_0x0092
            r11 = 59
        L_0x0092:
            r13 = 46
            boolean r13 = a(r13, r5, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r13 == 0) goto L_0x00cf
            int r5 = r5 + 1
            int r13 = r5 + 1
        L_0x009e:
            int r14 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r13 >= r14) goto L_0x00b4
            char r14 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r15 = 48
            if (r14 < r15) goto L_0x00b8
            r15 = 57
            if (r14 <= r15) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            int r13 = r13 + 1
            goto L_0x009e
        L_0x00b4:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
        L_0x00b8:
            int r14 = r5 + 3
            int r14 = java.lang.Math.min(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r15 = c(r5, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r14 = r14 - r5
            if (r14 == r9) goto L_0x00cb
            if (r14 == r12) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            int r15 = r15 * 10
            goto L_0x00cd
        L_0x00cb:
            int r15 = r15 * 100
        L_0x00cd:
            r5 = r13
            goto L_0x00dd
        L_0x00cf:
            r15 = 0
            goto L_0x00dd
        L_0x00d1:
            r5 = r7
            r7 = r14
            goto L_0x00d6
        L_0x00d4:
            r5 = 0
            r8 = 0
        L_0x00d6:
            r15 = 0
            r11 = 0
            r16 = r7
            r7 = r5
            r5 = r16
        L_0x00dd:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r12 <= r5) goto L_0x01c9
            char r12 = r1.charAt(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r13 = 5
            if (r12 != r10) goto L_0x00ef
            java.util.TimeZone r10 = f7934a     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r5 = r5 + r9
            goto L_0x0197
        L_0x00ef:
            r9 = 43
            if (r12 == r9) goto L_0x0112
            r9 = 45
            if (r12 != r9) goto L_0x00f8
            goto L_0x0112
        L_0x00f8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r4.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r5 = "Invalid time zone indicator '"
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r4.append(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r4.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
        L_0x0112:
            java.lang.String r9 = r1.substring(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r10 < r13) goto L_0x011d
            goto L_0x012e
        L_0x011d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
        L_0x012e:
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r5 = r5 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r10 != 0) goto L_0x0195
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r10 == 0) goto L_0x0144
            goto L_0x0195
        L_0x0144:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r12 = "GMT"
            r10.append(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r12 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            boolean r13 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r13 != 0) goto L_0x0197
            java.lang.String r13 = ":"
            java.lang.String r14 = ""
            java.lang.String r12 = r12.replace(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            boolean r12 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            if (r12 == 0) goto L_0x0172
            goto L_0x0197
        L_0x0172:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r4.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r4.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r5 = " given, resolves to "
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r5 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
        L_0x0195:
            java.util.TimeZone r10 = f7934a     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
        L_0x0197:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r9.<init>(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r10 = 0
            r9.setLenient(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r10 = 1
            r9.set(r10, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            int r4 = r4 - r10
            r0 = 2
            r9.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0 = 5
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0 = 11
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0 = 12
            r9.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0 = 13
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r0 = 14
            r9.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            r2.setIndex(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            return r0
        L_0x01c9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            java.lang.String r4 = "No time zone indicator"
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d5, NumberFormatException -> 0x01d3, IllegalArgumentException -> 0x01d1 }
        L_0x01d1:
            r0 = move-exception
            goto L_0x01d6
        L_0x01d3:
            r0 = move-exception
            goto L_0x01d6
        L_0x01d5:
            r0 = move-exception
        L_0x01d6:
            if (r1 != 0) goto L_0x01da
            r1 = 0
            goto L_0x01ee
        L_0x01da:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 34
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L_0x01ee:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01fa
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0214
        L_0x01fa:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0214:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i10, int i11, String str) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit >= 0) {
                i12 = -digit;
            } else {
                StringBuilder g10 = f.g("Invalid number: ");
                g10.append(str.substring(i10, i11));
                throw new NumberFormatException(g10.toString());
            }
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 >= 0) {
                i12 = (i12 * 10) - digit2;
                i13 = i14;
            } else {
                StringBuilder g11 = f.g("Invalid number: ");
                g11.append(str.substring(i10, i11));
                throw new NumberFormatException(g11.toString());
            }
        }
        return -i12;
    }
}
