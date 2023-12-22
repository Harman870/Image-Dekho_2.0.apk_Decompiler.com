package f0;

import android.text.SpannableStringBuilder;
import f0.e;
import f0.f;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f6292d = Character.toString(8206);

    /* renamed from: e  reason: collision with root package name */
    public static final String f6293e = Character.toString(8207);

    /* renamed from: f  reason: collision with root package name */
    public static final a f6294f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f6295g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6296a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6297b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6298c;

    /* renamed from: f0.a$a  reason: collision with other inner class name */
    public static class C0082a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f6299e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f6300a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6301b;

        /* renamed from: c  reason: collision with root package name */
        public int f6302c;

        /* renamed from: d  reason: collision with root package name */
        public char f6303d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f6299e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0082a(CharSequence charSequence) {
            this.f6300a = charSequence;
            this.f6301b = charSequence.length();
        }

        public final byte a() {
            char charAt = this.f6300a.charAt(this.f6302c - 1);
            this.f6303d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f6300a, this.f6302c);
                this.f6302c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f6302c--;
            char c10 = this.f6303d;
            return c10 < 1792 ? f6299e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        e.d dVar = e.f6310c;
        f6294f = new a(false, 2, dVar);
        f6295g = new a(true, 2, dVar);
    }

    public a(boolean z9, int i10, e.d dVar) {
        this.f6296a = z9;
        this.f6297b = i10;
        this.f6298c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            f0.a$a r0 = new f0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f6302c = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.f6302c
            int r7 = r0.f6301b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f6300a
            char r6 = r7.charAt(r6)
            r0.f6303d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f6300a
            int r7 = r0.f6302c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f6302c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f6302c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f6302c
            int r6 = r6 + r2
            r0.f6302c = r6
            char r6 = r0.f6303d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = f0.a.C0082a.f6299e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r9
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r9 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f6302c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r9 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r9 = r1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            f0.a$a r0 = new f0.a$a
            r0.<init>(r6)
            int r6 = r0.f6301b
            r0.f6302c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f6302c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i10 = f.f6315a;
        boolean z9 = true;
        if (f.a.a(locale) != 1) {
            z9 = false;
        }
        if (z9) {
            return f6295g;
        }
        return f6294f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, d dVar) {
        e.d dVar2;
        char c10;
        e.d dVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean z9 = false;
        boolean b10 = ((e.c) dVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f6297b & 2) != 0) {
            z9 = true;
        }
        String str2 = "";
        if (z9) {
            if (b10) {
                dVar3 = e.f6309b;
            } else {
                dVar3 = e.f6308a;
            }
            boolean b11 = dVar3.b(charSequence, charSequence.length());
            if (!this.f6296a && (b11 || a(charSequence) == 1)) {
                str = f6292d;
            } else if (!this.f6296a || (b11 && a(charSequence) != -1)) {
                str = str2;
            } else {
                str = f6293e;
            }
            spannableStringBuilder.append(str);
        }
        if (b10 != this.f6296a) {
            if (b10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            dVar2 = e.f6309b;
        } else {
            dVar2 = e.f6308a;
        }
        boolean b12 = dVar2.b(charSequence, charSequence.length());
        if (!this.f6296a && (b12 || b(charSequence) == 1)) {
            str2 = f6292d;
        } else if (this.f6296a && (!b12 || b(charSequence) == -1)) {
            str2 = f6293e;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
