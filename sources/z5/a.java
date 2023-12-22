package z5;

import p3.b;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f13176b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.ROOT
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r2[r4] = r3
            java.util.HashMap r3 = a6.a.f80a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L_0x0049
            java.util.HashMap r5 = a6.a.f81b
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L_0x0023
            goto L_0x0049
        L_0x0023:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            goto L_0x004b
        L_0x0049:
            java.lang.String r3 = ""
        L_0x004b:
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "Standard Integrity API error (%d): %s."
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r8, r1)
            r7.<init>(r0)
            if (r8 == 0) goto L_0x005f
            r7.f13176b = r9
            return
        L_0x005f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "ErrorCode should not be 0."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.<init>(int, java.lang.Throwable):void");
    }

    public final synchronized Throwable getCause() {
        return this.f13176b;
    }
}
