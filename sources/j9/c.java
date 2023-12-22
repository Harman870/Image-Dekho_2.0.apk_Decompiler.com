package j9;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8845a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8846b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8847c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8848d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8849e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8850f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8851g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8852h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8853i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8854j;
    public final boolean k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8855l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f8856m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8857a;

        /* renamed from: b  reason: collision with root package name */
        public int f8858b = -1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8859c;
    }

    static {
        a aVar = new a();
        aVar.f8857a = true;
        new c(aVar);
        a aVar2 = new a();
        aVar2.f8859c = true;
        int i10 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i10 = (int) seconds;
        }
        aVar2.f8858b = i10;
        new c(aVar2);
    }

    public c(a aVar) {
        this.f8845a = aVar.f8857a;
        this.f8846b = false;
        this.f8847c = -1;
        this.f8848d = -1;
        this.f8849e = false;
        this.f8850f = false;
        this.f8851g = false;
        this.f8852h = aVar.f8858b;
        this.f8853i = -1;
        this.f8854j = aVar.f8859c;
        this.k = false;
        this.f8855l = false;
    }

    public c(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, @Nullable String str) {
        this.f8845a = z9;
        this.f8846b = z10;
        this.f8847c = i10;
        this.f8848d = i11;
        this.f8849e = z11;
        this.f8850f = z12;
        this.f8851g = z13;
        this.f8852h = i12;
        this.f8853i = i13;
        this.f8854j = z14;
        this.k = z15;
        this.f8855l = z16;
        this.f8856m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j9.c a(j9.p r22) {
        /*
            r0 = r22
            java.lang.String[] r1 = r0.f8939a
            int r1 = r1.length
            int r1 = r1 / 2
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001b:
            if (r6 >= r1) goto L_0x0151
            java.lang.String r2 = r0.d(r6)
            java.lang.String r4 = r0.g(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r8 = r4
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x014a
        L_0x003a:
            r7 = 0
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x014a
            java.lang.String r3 = "=,;"
            int r3 = n9.e.e(r2, r4, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x00aa
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x00aa
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x007a
            goto L_0x00aa
        L_0x0067:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x007d
            char r0 = r4.charAt(r3)
            r5 = 32
            if (r0 == r5) goto L_0x007a
            r5 = 9
            if (r0 == r5) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x0067
        L_0x007d:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x009a
            char r0 = r4.charAt(r3)
            r5 = 34
            if (r0 != r5) goto L_0x009a
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = n9.e.e(r3, r4, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            r5 = 1
            int r0 = r0 + r5
            goto L_0x00af
        L_0x009a:
            r5 = 1
            java.lang.String r0 = ",;"
            int r0 = n9.e.e(r3, r4, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00af
        L_0x00aa:
            r5 = 1
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00af:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00bb
            r5 = -1
            r9 = 1
            goto L_0x0145
        L_0x00bb:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c7
            r5 = -1
            r10 = 1
            goto L_0x0145
        L_0x00c7:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d6
            r5 = -1
            int r11 = n9.e.c(r5, r3)
            goto L_0x0145
        L_0x00d6:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e4
            r5 = -1
            int r12 = n9.e.c(r5, r3)
            goto L_0x0145
        L_0x00e4:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ef
            r5 = -1
            r13 = 1
            goto L_0x0145
        L_0x00ef:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00fa
            r5 = -1
            r14 = 1
            goto L_0x0145
        L_0x00fa:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0105
            r5 = -1
            r15 = 1
            goto L_0x0145
        L_0x0105:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0116
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = n9.e.c(r2, r3)
            r5 = -1
            goto L_0x0145
        L_0x0116:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0124
            r5 = -1
            int r17 = n9.e.c(r5, r3)
            goto L_0x0145
        L_0x0124:
            r5 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0130
            r18 = 1
            goto L_0x0145
        L_0x0130:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x013b
            r19 = 1
            goto L_0x0145
        L_0x013b:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0145
            r20 = 1
        L_0x0145:
            r2 = r0
            r0 = r22
            goto L_0x003c
        L_0x014a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001b
        L_0x0151:
            if (r7 != 0) goto L_0x0156
            r21 = 0
            goto L_0x0158
        L_0x0156:
            r21 = r8
        L_0x0158:
            j9.c r0 = new j9.c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.c.a(j9.p):j9.c");
    }

    public final String toString() {
        String str = this.f8856m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f8845a) {
                sb.append("no-cache, ");
            }
            if (this.f8846b) {
                sb.append("no-store, ");
            }
            if (this.f8847c != -1) {
                sb.append("max-age=");
                sb.append(this.f8847c);
                sb.append(", ");
            }
            if (this.f8848d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f8848d);
                sb.append(", ");
            }
            if (this.f8849e) {
                sb.append("private, ");
            }
            if (this.f8850f) {
                sb.append("public, ");
            }
            if (this.f8851g) {
                sb.append("must-revalidate, ");
            }
            if (this.f8852h != -1) {
                sb.append("max-stale=");
                sb.append(this.f8852h);
                sb.append(", ");
            }
            if (this.f8853i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f8853i);
                sb.append(", ");
            }
            if (this.f8854j) {
                sb.append("only-if-cached, ");
            }
            if (this.k) {
                sb.append("no-transform, ");
            }
            if (this.f8855l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f8856m = str;
        }
        return str;
    }
}
