package j4;

public abstract class u9 {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        r9 = j4.x9.f8559a;
        r10 = r10 - r3;
        r9 = r8[r3 - 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        if (r10 == 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0062, code lost:
        if (r10 == 1) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r10 != 2) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        r10 = r8[r3];
        r8 = r8[r3 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        if (r9 > -12) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006e, code lost:
        if (r10 > -65) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0070, code lost:
        if (r8 <= -65) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0073, code lost:
        r8 = r8 << 16;
        r9 = r9 ^ (r10 << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
        r8 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0081, code lost:
        if (r9 > -12) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0083, code lost:
        if (r8 <= -65) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0086, code lost:
        r8 = r8 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0088, code lost:
        r1 = r9 ^ r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008b, code lost:
        if (r9 <= -12) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ac A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(byte[] r8, int r9, int r10) {
        /*
        L_0x0000:
            if (r9 >= r10) goto L_0x0009
            byte r0 = r8[r9]
            if (r0 < 0) goto L_0x0009
            int r9 = r9 + 1
            goto L_0x0000
        L_0x0009:
            r0 = 0
            r1 = -1
            r2 = 1
            if (r9 < r10) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            if (r9 < r10) goto L_0x0014
        L_0x0011:
            r1 = r0
            goto L_0x00a9
        L_0x0014:
            int r3 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x00ad
            r4 = -32
            r5 = -65
            if (r9 >= r4) goto L_0x0031
            if (r3 < r10) goto L_0x0025
        L_0x0022:
            r1 = r9
            goto L_0x00a9
        L_0x0025:
            r4 = -62
            if (r9 < r4) goto L_0x00a9
            int r9 = r3 + 1
            byte r3 = r8[r3]
            if (r3 <= r5) goto L_0x000f
            goto L_0x00a9
        L_0x0031:
            r6 = -16
            if (r9 >= r6) goto L_0x0053
            int r6 = r10 + -1
            if (r3 < r6) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            int r6 = r3 + 1
            byte r3 = r8[r3]
            if (r3 > r5) goto L_0x00a9
            r7 = -96
            if (r9 != r4) goto L_0x0046
            if (r3 < r7) goto L_0x00a9
        L_0x0046:
            r4 = -19
            if (r9 != r4) goto L_0x004c
            if (r3 >= r7) goto L_0x00a9
        L_0x004c:
            int r9 = r6 + 1
            byte r3 = r8[r6]
            if (r3 <= r5) goto L_0x000f
            goto L_0x00a9
        L_0x0053:
            int r4 = r10 + -2
            if (r3 < r4) goto L_0x008e
        L_0x0057:
            j4.v9 r9 = j4.x9.f8559a
            int r10 = r10 - r3
            int r9 = r3 + -1
            byte r9 = r8[r9]
            r4 = -12
            if (r10 == 0) goto L_0x008b
            if (r10 == r2) goto L_0x007f
            r6 = 2
            if (r10 != r6) goto L_0x0079
            byte r10 = r8[r3]
            int r3 = r3 + r2
            byte r8 = r8[r3]
            if (r9 > r4) goto L_0x00a9
            if (r10 > r5) goto L_0x00a9
            if (r8 <= r5) goto L_0x0073
            goto L_0x00a9
        L_0x0073:
            int r10 = r10 << 8
            int r8 = r8 << 16
            r9 = r9 ^ r10
            goto L_0x0088
        L_0x0079:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L_0x007f:
            byte r8 = r8[r3]
            if (r9 > r4) goto L_0x00a9
            if (r8 <= r5) goto L_0x0086
            goto L_0x00a9
        L_0x0086:
            int r8 = r8 << 8
        L_0x0088:
            r1 = r9 ^ r8
            goto L_0x00a9
        L_0x008b:
            if (r9 <= r4) goto L_0x0022
            goto L_0x00a9
        L_0x008e:
            int r4 = r3 + 1
            byte r3 = r8[r3]
            if (r3 > r5) goto L_0x00a9
            int r9 = r9 << 28
            int r3 = r3 + 112
            int r3 = r3 + r9
            int r9 = r3 >> 30
            if (r9 != 0) goto L_0x00a9
            int r9 = r4 + 1
            byte r3 = r8[r4]
            if (r3 > r5) goto L_0x00a9
            int r3 = r9 + 1
            byte r9 = r8[r9]
            if (r9 <= r5) goto L_0x00ad
        L_0x00a9:
            if (r1 != 0) goto L_0x00ac
            return r2
        L_0x00ac:
            return r0
        L_0x00ad:
            r9 = r3
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.u9.a(byte[], int, int):boolean");
    }
}
