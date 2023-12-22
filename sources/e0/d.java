package e0;

import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6126a;

    public /* synthetic */ d(int i10) {
        this.f6126a = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r4 < r5) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r7 < r8) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f6126a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0025
        L_0x0007:
            byte[] r7 = (byte[]) r7
            byte[] r8 = (byte[]) r8
            int r0 = r7.length
            int r2 = r8.length
            if (r0 == r2) goto L_0x0014
            int r7 = r7.length
            int r8 = r8.length
            int r1 = r7 - r8
            goto L_0x0024
        L_0x0014:
            r0 = r1
        L_0x0015:
            int r2 = r7.length
            if (r0 >= r2) goto L_0x0024
            byte r2 = r7[r0]
            byte r3 = r8[r0]
            if (r2 == r3) goto L_0x0021
            int r1 = r2 - r3
            goto L_0x0024
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x0015
        L_0x0024:
            return r1
        L_0x0025:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            e0.d r0 = j9.g.f8881b
            int r0 = r7.length()
            int r2 = r8.length()
            int r0 = java.lang.Math.min(r0, r2)
            r2 = 4
        L_0x0038:
            r3 = -1
            if (r2 >= r0) goto L_0x004b
            char r4 = r7.charAt(r2)
            char r5 = r8.charAt(r2)
            if (r4 == r5) goto L_0x0048
            if (r4 >= r5) goto L_0x0059
            goto L_0x0057
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x004b:
            int r7 = r7.length()
            int r8 = r8.length()
            if (r7 == r8) goto L_0x005a
            if (r7 >= r8) goto L_0x0059
        L_0x0057:
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d.compare(java.lang.Object, java.lang.Object):int");
    }
}
