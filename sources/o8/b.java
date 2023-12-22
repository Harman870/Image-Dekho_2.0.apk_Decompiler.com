package o8;

import x8.f;

public final class b implements Comparable<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f10598e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f10599a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f10600b = 7;

    /* renamed from: c  reason: collision with root package name */
    public final int f10601c = 10;

    /* renamed from: d  reason: collision with root package name */
    public final int f10602d;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b() {
        /*
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f10599a = r0
            r1 = 7
            r6.f10600b = r1
            r2 = 10
            r6.f10601c = r2
            a9.c r3 = new a9.c
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            r3.<init>(r4, r5)
            int r3 = r3.f221b
            if (r0 > r3) goto L_0x001b
            r3 = r0
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            if (r3 == 0) goto L_0x003b
            a9.c r3 = new a9.c
            r3.<init>(r4, r5)
            int r3 = r3.f221b
            if (r1 > r3) goto L_0x0029
            r1 = r0
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x003b
            a9.c r1 = new a9.c
            r1.<init>(r4, r5)
            int r1 = r1.f221b
            if (r2 > r1) goto L_0x0037
            r1 = r0
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r0 = r4
        L_0x003c:
            if (r0 == 0) goto L_0x0044
            r0 = 67338(0x1070a, float:9.436E-41)
            r6.f10602d = r0
            return
        L_0x0044:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Version components are out of range: 1.7.10"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.b.<init>():void");
    }

    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        f.f(bVar, "other");
        return this.f10602d - bVar.f10602d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar == null) {
            return false;
        }
        return this.f10602d == bVar.f10602d;
    }

    public final int hashCode() {
        return this.f10602d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10599a);
        sb.append('.');
        sb.append(this.f10600b);
        sb.append('.');
        sb.append(this.f10601c);
        return sb.toString();
    }
}
