package i4;

import androidx.appcompat.widget.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

public abstract class x0 implements Iterator {
    @CheckForNull

    /* renamed from: a  reason: collision with root package name */
    public String f7781a;

    /* renamed from: b  reason: collision with root package name */
    public int f7782b = 2;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f7783c;

    /* renamed from: d  reason: collision with root package name */
    public int f7784d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f7785e;

    public x0(l lVar, CharSequence charSequence) {
        Object obj = lVar.f844b;
        this.f7785e = Integer.MAX_VALUE;
        this.f7783c = charSequence;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r2 < 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c1, code lost:
        if (r10 < 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        r0 = i4.j3.d("%s (%s) must not be greater than size (%s)", "index", java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        throw new java.lang.IllegalArgumentException(androidx.activity.e.a("negative size: ", r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r0 = i4.j3.d("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        throw new java.lang.IndexOutOfBoundsException(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r13 = this;
            int r0 = r13.f7782b
            r1 = 4
            if (r0 == r1) goto L_0x0108
            int r2 = r0 + -1
            r3 = 0
            if (r0 == 0) goto L_0x0107
            r0 = 1
            if (r2 == 0) goto L_0x0106
            r4 = 2
            r5 = 0
            if (r2 == r4) goto L_0x0105
            r13.f7782b = r1
            int r1 = r13.f7784d
        L_0x0015:
            int r2 = r13.f7784d
            r6 = 3
            r7 = -1
            if (r2 == r7) goto L_0x00fa
            r8 = r13
            i4.m r8 = (i4.m) r8
            int r9 = r8.f7484f
            switch(r9) {
                case 0: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x003b
        L_0x0024:
            java.lang.Object r9 = r8.f7485g
            i4.he r9 = (i4.he) r9
            java.util.regex.Matcher r9 = r9.f7370a
            boolean r2 = r9.find(r2)
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r8.f7485g
            i4.he r2 = (i4.he) r2
            java.util.regex.Matcher r2 = r2.f7370a
            int r2 = r2.start()
            goto L_0x0055
        L_0x003b:
            java.lang.CharSequence r9 = r8.f7783c
            int r10 = r9.length()
            if (r2 < 0) goto L_0x00bb
            if (r2 <= r10) goto L_0x0047
            goto L_0x00bb
        L_0x0047:
            if (r2 >= r10) goto L_0x0054
            char r11 = r9.charAt(r2)
            r12 = 46
            if (r11 == r12) goto L_0x0055
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0054:
            r2 = r7
        L_0x0055:
            if (r2 != r7) goto L_0x0061
            java.lang.CharSequence r2 = r13.f7783c
            int r2 = r2.length()
            r13.f7784d = r7
            r8 = r7
            goto L_0x0076
        L_0x0061:
            int r9 = r8.f7484f
            switch(r9) {
                case 0: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0072
        L_0x0067:
            java.lang.Object r8 = r8.f7485g
            i4.he r8 = (i4.he) r8
            java.util.regex.Matcher r8 = r8.f7370a
            int r8 = r8.end()
            goto L_0x0074
        L_0x0072:
            int r8 = r2 + 1
        L_0x0074:
            r13.f7784d = r8
        L_0x0076:
            if (r8 != r1) goto L_0x0087
            int r8 = r8 + 1
            r13.f7784d = r8
            java.lang.CharSequence r2 = r13.f7783c
            int r2 = r2.length()
            if (r8 <= r2) goto L_0x0015
            r13.f7784d = r7
            goto L_0x0015
        L_0x0087:
            if (r1 >= r2) goto L_0x008e
            java.lang.CharSequence r3 = r13.f7783c
            r3.charAt(r1)
        L_0x008e:
            if (r1 >= r2) goto L_0x0097
            java.lang.CharSequence r3 = r13.f7783c
            int r4 = r2 + -1
            r3.charAt(r4)
        L_0x0097:
            int r3 = r13.f7785e
            if (r3 != r0) goto L_0x00ad
            java.lang.CharSequence r2 = r13.f7783c
            int r2 = r2.length()
            r13.f7784d = r7
            if (r2 <= r1) goto L_0x00b0
            java.lang.CharSequence r3 = r13.f7783c
            int r4 = r2 + -1
            r3.charAt(r4)
            goto L_0x00b0
        L_0x00ad:
            int r3 = r3 + r7
            r13.f7785e = r3
        L_0x00b0:
            java.lang.CharSequence r3 = r13.f7783c
            java.lang.CharSequence r1 = r3.subSequence(r1, r2)
            java.lang.String r3 = r1.toString()
            goto L_0x00fc
        L_0x00bb:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "index"
            if (r2 < 0) goto L_0x00e6
            if (r10 < 0) goto L_0x00da
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r0] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6[r4] = r0
            java.lang.String r0 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = i4.j3.d(r0, r6)
            goto L_0x00f6
        L_0x00da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "negative size: "
            java.lang.String r1 = androidx.activity.e.a(r1, r10)
            r0.<init>(r1)
            throw r0
        L_0x00e6:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r0] = r2
            java.lang.String r0 = "%s (%s) must not be negative"
            java.lang.String r0 = i4.j3.d(r0, r4)
        L_0x00f6:
            r1.<init>(r0)
            throw r1
        L_0x00fa:
            r13.f7782b = r6
        L_0x00fc:
            r13.f7781a = r3
            int r1 = r13.f7782b
            if (r1 == r6) goto L_0x0105
            r13.f7782b = r0
            return r0
        L_0x0105:
            return r5
        L_0x0106:
            return r0
        L_0x0107:
            throw r3
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.x0.hasNext():boolean");
    }

    /* renamed from: b */
    public final Object next() {
        if (hasNext()) {
            this.f7782b = 2;
            String str = this.f7781a;
            this.f7781a = null;
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
