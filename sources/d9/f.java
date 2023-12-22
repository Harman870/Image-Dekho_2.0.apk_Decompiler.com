package d9;

import java.util.List;
import o8.e;
import w8.p;
import x8.g;

public final class f extends g implements p<CharSequence, Integer, e<? extends Integer, ? extends Integer>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<String> f6118c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f6119d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(List<String> list, boolean z9) {
        super(2);
        this.f6118c = list;
        this.f6119d = z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            x8.f.f(r14, r0)
            java.util.List<java.lang.String> r6 = r13.f6118c
            boolean r7 = r13.f6119d
            r0 = 0
            r8 = 0
            if (r7 != 0) goto L_0x004d
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x004d
            int r1 = r6.size()
            if (r1 == 0) goto L_0x0045
            if (r1 != r2) goto L_0x003d
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            int r14 = d9.g.x(r15, r14, r1, r0)
            if (r14 >= 0) goto L_0x0032
            goto L_0x00dd
        L_0x0032:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            o8.e r15 = new o8.e
            r15.<init>(r14, r1)
            goto L_0x00de
        L_0x003d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x0045:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x004d:
            a9.c r1 = new a9.c
            if (r15 >= 0) goto L_0x0052
            r15 = r0
        L_0x0052:
            int r0 = r14.length()
            r1.<init>(r15, r0)
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto L_0x009e
            int r9 = r1.f221b
            int r10 = r1.f222c
            if (r10 <= 0) goto L_0x0065
            if (r15 <= r9) goto L_0x0069
        L_0x0065:
            if (r10 >= 0) goto L_0x00dd
            if (r9 > r15) goto L_0x00dd
        L_0x0069:
            java.util.Iterator r11 = r6.iterator()
        L_0x006d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r12 = r11.next()
            r3 = r12
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            int r2 = r3.length()
            r1 = r15
            r5 = r7
            boolean r0 = d9.e.u(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006d
            goto L_0x008c
        L_0x008b:
            r12 = r8
        L_0x008c:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x009a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            o8.e r15 = new o8.e
            r15.<init>(r14, r12)
            goto L_0x00de
        L_0x009a:
            if (r15 == r9) goto L_0x00dd
            int r15 = r15 + r10
            goto L_0x0069
        L_0x009e:
            int r9 = r1.f221b
            int r10 = r1.f222c
            if (r10 <= 0) goto L_0x00a6
            if (r15 <= r9) goto L_0x00aa
        L_0x00a6:
            if (r10 >= 0) goto L_0x00dd
            if (r9 > r15) goto L_0x00dd
        L_0x00aa:
            java.util.Iterator r11 = r6.iterator()
        L_0x00ae:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = d9.g.A(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            goto L_0x00cb
        L_0x00ca:
            r12 = r8
        L_0x00cb:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00d9
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            o8.e r15 = new o8.e
            r15.<init>(r14, r12)
            goto L_0x00de
        L_0x00d9:
            if (r15 == r9) goto L_0x00dd
            int r15 = r15 + r10
            goto L_0x00aa
        L_0x00dd:
            r15 = r8
        L_0x00de:
            if (r15 == 0) goto L_0x00f3
            A r14 = r15.f10603a
            B r15 = r15.f10604b
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            o8.e r8 = new o8.e
            r8.<init>(r14, r15)
        L_0x00f3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.f.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
