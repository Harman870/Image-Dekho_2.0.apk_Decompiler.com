package h4;

import androidx.activity.result.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

public abstract class g implements Iterator {
    @CheckForNull

    /* renamed from: a  reason: collision with root package name */
    public String f6883a;

    /* renamed from: b  reason: collision with root package name */
    public int f6884b = 2;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f6885c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6886d;

    /* renamed from: e  reason: collision with root package name */
    public int f6887e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f6888f;

    public g(h hVar, CharSequence charSequence) {
        c cVar = hVar.f6889a;
        this.f6886d = hVar.f6890b;
        this.f6888f = Integer.MAX_VALUE;
        this.f6885c = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r1 >= r2) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        r12.f6885c.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r1 >= r2) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r12.f6885c.charAt(r2 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r12.f6886d == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (r2 < 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        if (r10 < 0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r0 = h4.i.a("%s (%s) must not be greater than size (%s)", "index", java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        throw new java.lang.IllegalArgumentException(androidx.activity.e.a("negative size: ", r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        r0 = h4.i.a("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00db, code lost:
        throw new java.lang.IndexOutOfBoundsException(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r12 = this;
            int r0 = r12.f6884b
            r1 = 4
            if (r0 == r1) goto L_0x00ea
            int r2 = r0 + -1
            r3 = 0
            if (r0 == 0) goto L_0x00e9
            r0 = 1
            if (r2 == 0) goto L_0x00e8
            r4 = 2
            r5 = 0
            if (r2 == r4) goto L_0x00e7
            r12.f6884b = r1
        L_0x0013:
            int r1 = r12.f6887e
        L_0x0015:
            int r2 = r12.f6887e
            r6 = 3
            r7 = -1
            if (r2 == r7) goto L_0x00dc
            r8 = r12
            h4.f r8 = (h4.f) r8
            b6.g r9 = r8.f6882g
            java.lang.Object r9 = r9.f2289a
            androidx.activity.result.c r9 = (androidx.activity.result.c) r9
            java.lang.CharSequence r8 = r8.f6885c
            int r10 = r8.length()
            if (r2 < 0) goto L_0x009d
            if (r2 <= r10) goto L_0x0030
            goto L_0x009d
        L_0x0030:
            if (r2 >= r10) goto L_0x0040
            char r11 = r8.charAt(r2)
            boolean r11 = r9.s(r11)
            if (r11 == 0) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0040:
            r2 = r7
        L_0x0041:
            if (r2 != r7) goto L_0x004d
            java.lang.CharSequence r2 = r12.f6885c
            int r2 = r2.length()
            r12.f6887e = r7
            r8 = r7
            goto L_0x0051
        L_0x004d:
            int r8 = r2 + 1
            r12.f6887e = r8
        L_0x0051:
            if (r8 != r1) goto L_0x0062
            int r8 = r8 + 1
            r12.f6887e = r8
            java.lang.CharSequence r2 = r12.f6885c
            int r2 = r2.length()
            if (r8 <= r2) goto L_0x0015
            r12.f6887e = r7
            goto L_0x0015
        L_0x0062:
            if (r1 >= r2) goto L_0x0069
            java.lang.CharSequence r8 = r12.f6885c
            r8.charAt(r1)
        L_0x0069:
            if (r1 >= r2) goto L_0x0072
            java.lang.CharSequence r8 = r12.f6885c
            int r9 = r2 + -1
            r8.charAt(r9)
        L_0x0072:
            boolean r8 = r12.f6886d
            if (r8 == 0) goto L_0x0079
            if (r1 != r2) goto L_0x0079
            goto L_0x0013
        L_0x0079:
            int r3 = r12.f6888f
            if (r3 != r0) goto L_0x008f
            java.lang.CharSequence r2 = r12.f6885c
            int r2 = r2.length()
            r12.f6887e = r7
            if (r2 <= r1) goto L_0x0092
            java.lang.CharSequence r3 = r12.f6885c
            int r4 = r2 + -1
            r3.charAt(r4)
            goto L_0x0092
        L_0x008f:
            int r3 = r3 + r7
            r12.f6888f = r3
        L_0x0092:
            java.lang.CharSequence r3 = r12.f6885c
            java.lang.CharSequence r1 = r3.subSequence(r1, r2)
            java.lang.String r3 = r1.toString()
            goto L_0x00de
        L_0x009d:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "index"
            if (r2 < 0) goto L_0x00c8
            if (r10 < 0) goto L_0x00bc
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r0] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6[r4] = r0
            java.lang.String r0 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = h4.i.a(r0, r6)
            goto L_0x00d8
        L_0x00bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "negative size: "
            java.lang.String r1 = androidx.activity.e.a(r1, r10)
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r0] = r2
            java.lang.String r0 = "%s (%s) must not be negative"
            java.lang.String r0 = h4.i.a(r0, r4)
        L_0x00d8:
            r1.<init>(r0)
            throw r1
        L_0x00dc:
            r12.f6884b = r6
        L_0x00de:
            r12.f6883a = r3
            int r1 = r12.f6884b
            if (r1 == r6) goto L_0x00e7
            r12.f6884b = r0
            return r0
        L_0x00e7:
            return r5
        L_0x00e8:
            return r0
        L_0x00e9:
            throw r3
        L_0x00ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.hasNext():boolean");
    }

    /* renamed from: b */
    public final Object next() {
        if (hasNext()) {
            this.f6884b = 2;
            String str = this.f6883a;
            this.f6883a = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
