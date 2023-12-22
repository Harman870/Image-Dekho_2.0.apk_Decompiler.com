package j9;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import t9.e;

public final class q {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f8941j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f8942a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8943b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8944c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8945d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8946e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f8947f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f8948g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f8949h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8950i;

    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public String f8951a;

        /* renamed from: b  reason: collision with root package name */
        public String f8952b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f8953c = "";
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f8954d;

        /* renamed from: e  reason: collision with root package name */
        public int f8955e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f8956f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f8957g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f8958h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f8956f = arrayList;
            arrayList.add("");
        }

        public final q a() {
            if (this.f8951a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f8954d != null) {
                return new q(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0216, code lost:
            if (r1 <= 65535) goto L_0x021a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01f4  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0252  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x02aa  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x03c6  */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x01ed A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x037f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01cf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(@javax.annotation.Nullable j9.q r24, java.lang.String r25) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r9 = r25
                int r2 = r25.length()
                r10 = 0
                int r8 = k9.e.s(r10, r2, r9)
                int r2 = r25.length()
                int r11 = k9.e.t(r8, r2, r9)
                int r2 = r11 - r8
                r12 = -1
                r13 = 2
                r14 = 58
                if (r2 >= r13) goto L_0x0020
                goto L_0x0062
            L_0x0020:
                char r2 = r9.charAt(r8)
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 65
                r5 = 97
                r6 = 90
                if (r2 < r5) goto L_0x0030
                if (r2 <= r3) goto L_0x0035
            L_0x0030:
                if (r2 < r4) goto L_0x0062
                if (r2 <= r6) goto L_0x0035
                goto L_0x0062
            L_0x0035:
                r2 = r8
            L_0x0036:
                int r2 = r2 + 1
                if (r2 >= r11) goto L_0x0062
                char r7 = r9.charAt(r2)
                if (r7 < r5) goto L_0x0042
                if (r7 <= r3) goto L_0x005f
            L_0x0042:
                if (r7 < r4) goto L_0x0046
                if (r7 <= r6) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r14) goto L_0x0062
                r15 = r2
                goto L_0x0063
            L_0x005f:
                r3 = 122(0x7a, float:1.71E-43)
                goto L_0x0036
            L_0x0062:
                r15 = r12
            L_0x0063:
                if (r15 == r12) goto L_0x00ab
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r25
                r4 = r8
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007a
                java.lang.String r2 = "https"
                r0.f8951a = r2
                int r8 = r8 + 6
                goto L_0x00b1
            L_0x007a:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r25
                r4 = r8
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x008f
                java.lang.String r2 = "http"
                r0.f8951a = r2
                int r8 = r8 + 5
                goto L_0x00b1
            L_0x008f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
                java.lang.String r3 = r9.substring(r10, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ab:
                if (r1 == 0) goto L_0x03e0
                java.lang.String r2 = r1.f8942a
                r0.f8951a = r2
            L_0x00b1:
                r2 = r8
                r3 = r10
            L_0x00b3:
                r4 = 92
                r5 = 47
                if (r2 >= r11) goto L_0x00c6
                char r6 = r9.charAt(r2)
                if (r6 == r4) goto L_0x00c1
                if (r6 != r5) goto L_0x00c6
            L_0x00c1:
                int r3 = r3 + 1
                int r2 = r2 + 1
                goto L_0x00b3
            L_0x00c6:
                r2 = 63
                r6 = 35
                if (r3 >= r13) goto L_0x011f
                if (r1 == 0) goto L_0x011f
                java.lang.String r7 = r1.f8942a
                java.lang.String r13 = r0.f8951a
                boolean r7 = r7.equals(r13)
                if (r7 != 0) goto L_0x00d9
                goto L_0x011f
            L_0x00d9:
                java.lang.String r2 = r24.i()
                r0.f8952b = r2
                java.lang.String r2 = r24.e()
                r0.f8953c = r2
                java.lang.String r2 = r1.f8945d
                r0.f8954d = r2
                int r2 = r1.f8946e
                r0.f8955e = r2
                java.util.ArrayList r2 = r0.f8956f
                r2.clear()
                java.util.ArrayList r2 = r0.f8956f
                java.util.ArrayList r3 = r24.g()
                r2.addAll(r3)
                if (r8 == r11) goto L_0x0103
                char r2 = r9.charAt(r8)
                if (r2 != r6) goto L_0x0254
            L_0x0103:
                java.lang.String r12 = r24.h()
                if (r12 == 0) goto L_0x011a
                r14 = 1
                r15 = 0
                r16 = 1
                r17 = 1
                java.lang.String r13 = " \"'<>#"
                java.lang.String r1 = j9.q.b(r12, r13, r14, r15, r16, r17)
                java.util.ArrayList r1 = j9.q.n(r1)
                goto L_0x011b
            L_0x011a:
                r1 = 0
            L_0x011b:
                r0.f8957g = r1
                goto L_0x0254
            L_0x011f:
                int r8 = r8 + r3
                r13 = r10
                r15 = r13
                r1 = r12
                r12 = r8
            L_0x0124:
                java.lang.String r3 = "@/\\?#"
                int r8 = k9.e.g(r12, r9, r11, r3)
                if (r8 == r11) goto L_0x0131
                char r3 = r9.charAt(r8)
                goto L_0x0132
            L_0x0131:
                r3 = r1
            L_0x0132:
                if (r3 == r1) goto L_0x01cb
                if (r3 == r6) goto L_0x01cb
                if (r3 == r5) goto L_0x01cb
                if (r3 == r4) goto L_0x01cb
                if (r3 == r2) goto L_0x01cb
                r1 = 64
                if (r3 == r1) goto L_0x0142
                goto L_0x01bd
            L_0x0142:
                java.lang.String r7 = "%40"
                if (r13 != 0) goto L_0x0193
                int r6 = k9.e.h(r9, r12, r8, r14)
                r5 = 1
                r16 = 0
                r17 = 0
                r18 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r25
                r2 = r12
                r3 = r6
                r12 = r6
                r6 = r16
                r10 = r7
                r7 = r17
                r14 = r8
                r8 = r18
                java.lang.String r1 = j9.q.a(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r15 == 0) goto L_0x017a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f8952b
                r2.append(r3)
                r2.append(r10)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x017a:
                r0.f8952b = r1
                if (r12 == r14) goto L_0x0190
                int r2 = r12 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r25
                r3 = r14
                java.lang.String r1 = j9.q.a(r1, r2, r3, r4, r5, r6, r7, r8)
                r0.f8953c = r1
                r13 = 1
            L_0x0190:
                r1 = 1
                r15 = r1
                goto L_0x01bb
            L_0x0193:
                r10 = r7
                r14 = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = r0.f8953c
                r8.append(r1)
                r8.append(r10)
                r5 = 1
                r6 = 0
                r7 = 0
                r10 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r25
                r2 = r12
                r3 = r14
                r12 = r8
                r8 = r10
                java.lang.String r1 = j9.q.a(r1, r2, r3, r4, r5, r6, r7, r8)
                r12.append(r1)
                java.lang.String r1 = r12.toString()
                r0.f8953c = r1
            L_0x01bb:
                int r12 = r14 + 1
            L_0x01bd:
                r6 = 35
                r2 = 63
                r5 = 47
                r1 = -1
                r4 = 92
                r10 = 0
                r14 = 58
                goto L_0x0124
            L_0x01cb:
                r14 = r8
                r8 = r12
            L_0x01cd:
                if (r8 >= r14) goto L_0x01ed
                char r1 = r9.charAt(r8)
                r2 = 58
                if (r1 == r2) goto L_0x01eb
                r3 = 91
                if (r1 == r3) goto L_0x01dd
                r1 = 1
                goto L_0x01e9
            L_0x01dd:
                r1 = 1
            L_0x01de:
                int r8 = r8 + r1
                if (r8 >= r14) goto L_0x01e9
                char r3 = r9.charAt(r8)
                r4 = 93
                if (r3 != r4) goto L_0x01de
            L_0x01e9:
                int r8 = r8 + r1
                goto L_0x01cd
            L_0x01eb:
                r10 = r8
                goto L_0x01ee
            L_0x01ed:
                r10 = r14
            L_0x01ee:
                int r13 = r10 + 1
                r15 = 34
                if (r13 >= r14) goto L_0x023b
                r1 = 0
                java.lang.String r1 = j9.q.k(r12, r10, r9, r1)
                java.lang.String r1 = k9.e.b(r1)
                r0.f8954d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r1 = r25
                r2 = r13
                r3 = r14
                java.lang.String r1 = j9.q.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ NumberFormatException -> 0x0219 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0219 }
                if (r1 <= 0) goto L_0x0219
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x0219
                goto L_0x021a
            L_0x0219:
                r1 = -1
            L_0x021a:
                r0.f8955e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0221
                r1 = 0
                goto L_0x024e
            L_0x0221:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL port: \""
                java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
                java.lang.String r3 = r9.substring(r13, r14)
                r2.append(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x023b:
                r1 = 0
                java.lang.String r2 = j9.q.k(r12, r10, r9, r1)
                java.lang.String r2 = k9.e.b(r2)
                r0.f8954d = r2
                java.lang.String r2 = r0.f8951a
                int r2 = j9.q.d(r2)
                r0.f8955e = r2
            L_0x024e:
                java.lang.String r2 = r0.f8954d
                if (r2 == 0) goto L_0x03c6
                r10 = r1
                r8 = r14
            L_0x0254:
                java.lang.String r1 = "?#"
                int r1 = k9.e.g(r8, r9, r11, r1)
                if (r8 != r1) goto L_0x0261
                r12 = r0
                r0 = r9
                r2 = r0
                goto L_0x0385
            L_0x0261:
                char r2 = r9.charAt(r8)
                java.lang.String r3 = ""
                r4 = 47
                if (r2 == r4) goto L_0x028a
                r4 = 92
                if (r2 != r4) goto L_0x0270
                goto L_0x028a
            L_0x0270:
                java.util.ArrayList r2 = r0.f8956f
                int r4 = r2.size()
                int r4 = r4 + -1
                r2.set(r4, r3)
                r15 = r0
                r18 = r15
                r4 = r1
                r5 = r4
                r7 = r3
                r1 = r9
                r2 = r1
                r3 = r2
                r6 = r3
                r16 = r10
                r17 = r11
                goto L_0x02a7
            L_0x028a:
                r2 = 1
                java.util.ArrayList r4 = r0.f8956f
                r4.clear()
                java.util.ArrayList r4 = r0.f8956f
                r4.add(r3)
                r12 = r0
                r13 = r12
                r4 = r1
                r5 = r4
                r6 = r2
                r7 = r3
                r1 = r9
                r2 = r1
                r3 = r2
            L_0x029e:
                int r8 = r8 + r6
                r6 = r9
                r16 = r10
                r17 = r11
                r18 = r12
                r15 = r13
            L_0x02a7:
                r9 = r8
            L_0x02a8:
                if (r9 >= r5) goto L_0x037f
                java.lang.String r8 = "/\\"
                int r14 = k9.e.g(r9, r1, r5, r8)
                if (r14 >= r5) goto L_0x02b6
                r8 = 1
                r19 = r8
                goto L_0x02b8
            L_0x02b6:
                r19 = r16
            L_0x02b8:
                r12 = 1
                r13 = 0
                r20 = 0
                r21 = 1
                java.lang.String r11 = " \"<>^`{}|/\\?#"
                r8 = r6
                r10 = r14
                r22 = r14
                r14 = r20
                r0 = r15
                r15 = r21
                java.lang.String r8 = j9.q.a(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.String r9 = "."
                boolean r9 = r8.equals(r9)
                if (r9 != 0) goto L_0x02e1
                java.lang.String r9 = "%2e"
                boolean r9 = r8.equalsIgnoreCase(r9)
                if (r9 == 0) goto L_0x02de
                goto L_0x02e1
            L_0x02de:
                r9 = r16
                goto L_0x02e2
            L_0x02e1:
                r9 = 1
            L_0x02e2:
                if (r9 == 0) goto L_0x02e6
                goto L_0x0364
            L_0x02e6:
                java.lang.String r9 = ".."
                boolean r9 = r8.equals(r9)
                if (r9 != 0) goto L_0x0306
                java.lang.String r9 = "%2e."
                boolean r9 = r8.equalsIgnoreCase(r9)
                if (r9 != 0) goto L_0x0306
                java.lang.String r9 = ".%2e"
                boolean r9 = r8.equalsIgnoreCase(r9)
                if (r9 != 0) goto L_0x0306
                java.lang.String r9 = "%2e%2e"
                boolean r9 = r8.equalsIgnoreCase(r9)
                if (r9 == 0) goto L_0x0308
            L_0x0306:
                r16 = 1
            L_0x0308:
                if (r16 == 0) goto L_0x0338
                java.util.ArrayList r8 = r0.f8956f
                int r9 = r8.size()
                int r9 = r9 + -1
                java.lang.Object r8 = r8.remove(r9)
                java.lang.String r8 = (java.lang.String) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0332
                java.util.ArrayList r8 = r0.f8956f
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0332
                java.util.ArrayList r8 = r0.f8956f
                int r9 = r8.size()
                int r9 = r9 + -1
                r8.set(r9, r7)
                goto L_0x0364
            L_0x0332:
                java.util.ArrayList r8 = r0.f8956f
                r8.add(r7)
                goto L_0x0364
            L_0x0338:
                java.util.ArrayList r9 = r0.f8956f
                int r10 = r9.size()
                int r10 = r10 + -1
                java.lang.Object r9 = r9.get(r10)
                java.lang.String r9 = (java.lang.String) r9
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L_0x0358
                java.util.ArrayList r9 = r0.f8956f
                int r10 = r9.size()
                int r10 = r10 + -1
                r9.set(r10, r8)
                goto L_0x035d
            L_0x0358:
                java.util.ArrayList r9 = r0.f8956f
                r9.add(r8)
            L_0x035d:
                if (r19 == 0) goto L_0x0364
                java.util.ArrayList r8 = r0.f8956f
                r8.add(r7)
            L_0x0364:
                r16 = 0
                if (r19 == 0) goto L_0x0378
                r8 = 1
                r13 = r0
                r9 = r6
                r6 = r8
                r10 = r16
                r11 = r17
                r12 = r18
                r8 = r22
                r0 = r23
                goto L_0x029e
            L_0x0378:
                r15 = r0
                r9 = r22
                r0 = r23
                goto L_0x02a8
            L_0x037f:
                r0 = r3
                r1 = r4
                r11 = r17
                r12 = r18
            L_0x0385:
                if (r1 >= r11) goto L_0x03ab
                char r3 = r2.charAt(r1)
                r4 = 63
                if (r3 != r4) goto L_0x03ab
                r13 = 35
                int r14 = k9.e.h(r2, r1, r11, r13)
                int r4 = r1 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 1
                java.lang.String r6 = " \"'<>#"
                r3 = r0
                r5 = r14
                java.lang.String r1 = j9.q.a(r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.ArrayList r1 = j9.q.n(r1)
                r12.f8957g = r1
                r1 = r14
                goto L_0x03ad
            L_0x03ab:
                r13 = 35
            L_0x03ad:
                if (r1 >= r11) goto L_0x03c5
                char r2 = r2.charAt(r1)
                if (r2 != r13) goto L_0x03c5
                int r4 = r1 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                java.lang.String r6 = ""
                r3 = r0
                r5 = r11
                java.lang.String r0 = j9.q.a(r3, r4, r5, r6, r7, r8, r9, r10)
                r12.f8958h = r0
            L_0x03c5:
                return
            L_0x03c6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid URL host: \""
                java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
                java.lang.String r2 = r9.substring(r12, r10)
                r1.append(r2)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x03e0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j9.q.a.b(j9.q, java.lang.String):void");
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f8951a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f8952b.isEmpty() || !this.f8953c.isEmpty()) {
                sb.append(this.f8952b);
                if (!this.f8953c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f8953c);
                }
                sb.append('@');
            }
            String str3 = this.f8954d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f8954d);
                    sb.append(']');
                } else {
                    sb.append(this.f8954d);
                }
            }
            int i10 = this.f8955e;
            if (!(i10 == -1 && this.f8951a == null)) {
                if (i10 == -1) {
                    i10 = q.d(this.f8951a);
                }
                String str4 = this.f8951a;
                if (str4 == null || i10 != q.d(str4)) {
                    sb.append(':');
                    sb.append(i10);
                }
            }
            ArrayList arrayList = this.f8956f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb.append('/');
                sb.append((String) arrayList.get(i11));
            }
            if (this.f8957g != null) {
                sb.append('?');
                q.j(sb, this.f8957g);
            }
            if (this.f8958h != null) {
                sb.append('#');
                sb.append(this.f8958h);
            }
            return sb.toString();
        }
    }

    public q(a aVar) {
        List<String> list;
        this.f8942a = aVar.f8951a;
        String str = aVar.f8952b;
        this.f8943b = k(0, str.length(), str, false);
        String str2 = aVar.f8953c;
        this.f8944c = k(0, str2.length(), str2, false);
        this.f8945d = aVar.f8954d;
        int i10 = aVar.f8955e;
        this.f8946e = i10 == -1 ? d(aVar.f8951a) : i10;
        this.f8947f = l(aVar.f8956f, false);
        ArrayList arrayList = aVar.f8957g;
        String str3 = null;
        if (arrayList != null) {
            list = l(arrayList, true);
        } else {
            list = null;
        }
        this.f8948g = list;
        String str4 = aVar.f8958h;
        this.f8949h = str4 != null ? k(0, str4.length(), str4, false) : str3;
        this.f8950i = aVar.toString();
    }

    public static String a(String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12) {
        String str3 = str;
        int i12 = i11;
        String str4 = str2;
        int i13 = i10;
        while (i13 < i12) {
            int codePointAt = str3.codePointAt(i13);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z12) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z9 || (z10 && !m(i13, i12, str3)))) || (codePointAt == 43 && z11)))) {
                e eVar = new e();
                eVar.W(i10, i13, str3);
                e eVar2 = null;
                while (i13 < i12) {
                    int codePointAt2 = str3.codePointAt(i13);
                    if (!z9 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z11) {
                            String str5 = z9 ? "+" : "%2B";
                            eVar.W(0, str5.length(), str5);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z12) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z9 || (z10 && !m(i13, i12, str3)))))) {
                            if (eVar2 == null) {
                                eVar2 = new e();
                            }
                            eVar2.X(codePointAt2);
                            while (!eVar2.p()) {
                                byte readByte = eVar2.readByte() & 255;
                                eVar.R(37);
                                char[] cArr = f8941j;
                                eVar.R(cArr[(readByte >> 4) & 15]);
                                eVar.R(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.X(codePointAt2);
                        }
                    }
                    i13 += Character.charCount(codePointAt2);
                }
                return eVar.M();
            }
            i13 += Character.charCount(codePointAt);
        }
        int i14 = i10;
        return str.substring(i10, i11);
    }

    public static String b(String str, String str2, boolean z9, boolean z10, boolean z11, boolean z12) {
        return a(str, 0, str.length(), str2, z9, z10, z11, z12);
    }

    public static String c(String str, boolean z9) {
        return a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z9, false, true, true);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String k(int i10, int i11, String str, boolean z9) {
        int i12;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z9)) {
                e eVar = new e();
                eVar.W(i10, i13, str);
                while (i13 < i11) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt == 37 && (i12 = i13 + 2) < i11) {
                        int e10 = k9.e.e(str.charAt(i13 + 1));
                        int e11 = k9.e.e(str.charAt(i12));
                        if (!(e10 == -1 || e11 == -1)) {
                            eVar.R((e10 << 4) + e11);
                            i13 = i12;
                            i13 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z9) {
                        eVar.R(32);
                        i13 += Character.charCount(codePointAt);
                    }
                    eVar.X(codePointAt);
                    i13 += Character.charCount(codePointAt);
                }
                return eVar.M();
            }
            i13++;
        }
        return str.substring(i10, i11);
    }

    public static List l(List list, boolean z9) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = (String) list.get(i10);
            if (str2 != null) {
                str = k(0, str2.length(), str2, z9);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean m(int i10, int i11, String str) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && k9.e.e(str.charAt(i10 + 1)) != -1 && k9.e.e(str.charAt(i12)) != -1;
    }

    public static ArrayList n(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f8944c.isEmpty()) {
            return "";
        }
        int indexOf = this.f8950i.indexOf(64);
        return this.f8950i.substring(this.f8950i.indexOf(58, this.f8942a.length() + 3) + 1, indexOf);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof q) && ((q) obj).f8950i.equals(this.f8950i);
    }

    public final String f() {
        int indexOf = this.f8950i.indexOf(47, this.f8942a.length() + 3);
        String str = this.f8950i;
        return this.f8950i.substring(indexOf, k9.e.g(indexOf, str, str.length(), "?#"));
    }

    public final ArrayList g() {
        int indexOf = this.f8950i.indexOf(47, this.f8942a.length() + 3);
        String str = this.f8950i;
        int g10 = k9.e.g(indexOf, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < g10) {
            int i10 = indexOf + 1;
            int h10 = k9.e.h(this.f8950i, i10, g10, '/');
            arrayList.add(this.f8950i.substring(i10, h10));
            indexOf = h10;
        }
        return arrayList;
    }

    @Nullable
    public final String h() {
        if (this.f8948g == null) {
            return null;
        }
        int indexOf = this.f8950i.indexOf(63) + 1;
        String str = this.f8950i;
        return this.f8950i.substring(indexOf, k9.e.h(str, indexOf, str.length(), '#'));
    }

    public final int hashCode() {
        return this.f8950i.hashCode();
    }

    public final String i() {
        if (this.f8943b.isEmpty()) {
            return "";
        }
        int length = this.f8942a.length() + 3;
        String str = this.f8950i;
        return this.f8950i.substring(length, k9.e.g(length, str, str.length(), ":@"));
    }

    public final String o() {
        a aVar;
        try {
            aVar = new a();
            aVar.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.f8952b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.f8953c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return aVar.a().f8950i;
    }

    public final URI p() {
        int i10;
        ArrayList arrayList;
        a aVar = new a();
        aVar.f8951a = this.f8942a;
        aVar.f8952b = i();
        aVar.f8953c = e();
        aVar.f8954d = this.f8945d;
        if (this.f8946e != d(this.f8942a)) {
            i10 = this.f8946e;
        } else {
            i10 = -1;
        }
        aVar.f8955e = i10;
        aVar.f8956f.clear();
        aVar.f8956f.addAll(g());
        String h10 = h();
        String str = null;
        if (h10 != null) {
            arrayList = n(b(h10, " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        aVar.f8957g = arrayList;
        if (this.f8949h != null) {
            str = this.f8950i.substring(this.f8950i.indexOf(35) + 1);
        }
        aVar.f8958h = str;
        int size = aVar.f8956f.size();
        for (int i11 = 0; i11 < size; i11++) {
            aVar.f8956f.set(i11, b((String) aVar.f8956f.get(i11), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = aVar.f8957g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str2 = (String) aVar.f8957g.get(i12);
                if (str2 != null) {
                    aVar.f8957g.set(i12, b(str2, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = aVar.f8958h;
        if (str3 != null) {
            aVar.f8958h = b(str3, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f8950i;
    }
}
