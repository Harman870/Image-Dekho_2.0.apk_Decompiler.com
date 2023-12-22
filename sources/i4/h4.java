package i4;

import java.util.concurrent.ConcurrentHashMap;

public final class h4 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7352a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap f7353b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public i4 f7354c;

    /* renamed from: d  reason: collision with root package name */
    public c9 f7355d;

    public /* synthetic */ h4(Class cls) {
        this.f7352a = cls;
        this.f7355d = c9.f7230b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = new i4.o7(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        throw new i4.e8(0, "Creating a LegacyProtoKey failed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r16, i4.fc r17, boolean r18) {
        /*
            r15 = this;
            r1 = r15
            java.util.concurrent.ConcurrentHashMap r0 = r1.f7353b
            if (r0 == 0) goto L_0x011c
            int r0 = r17.E()
            r2 = 3
            if (r0 != r2) goto L_0x0114
            java.util.concurrent.ConcurrentHashMap r0 = r1.f7353b
            int r3 = r17.v()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r17.z()
            r5 = 0
            r6 = 4
            if (r4 != r6) goto L_0x0020
            r12 = r5
            goto L_0x0021
        L_0x0020:
            r12 = r3
        L_0x0021:
            i4.r7 r3 = i4.r7.f7638b
            i4.zb r4 = r17.w()
            java.lang.String r8 = r4.A()
            i4.zb r4 = r17.w()
            i4.e0 r9 = r4.z()
            i4.zb r4 = r17.w()
            int r10 = r4.w()
            int r11 = r17.z()
            if (r11 != r6) goto L_0x004c
            if (r12 != 0) goto L_0x0044
            goto L_0x004e
        L_0x0044:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Keys with output prefix type raw should not have an id requirement."
            r0.<init>(r2)
            throw r0
        L_0x004c:
            if (r12 == 0) goto L_0x010c
        L_0x004e:
            i4.y7 r4 = new i4.y7
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r3.getClass()
            r7 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r3.f7639a     // Catch:{ GeneralSecurityException -> 0x0065 }
            java.lang.Object r3 = r3.get()     // Catch:{ GeneralSecurityException -> 0x0065 }
            i4.d8 r3 = (i4.d8) r3     // Catch:{ GeneralSecurityException -> 0x0065 }
            androidx.activity.result.c r3 = r3.a(r4)     // Catch:{ GeneralSecurityException -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            i4.o7 r3 = new i4.o7     // Catch:{ GeneralSecurityException -> 0x0103 }
            r3.<init>(r4)     // Catch:{ GeneralSecurityException -> 0x0103 }
        L_0x006a:
            r14 = r3
            i4.i4 r3 = new i4.i4
            int r4 = r17.z()
            int r4 = o.g.b(r4)
            r8 = 5
            r9 = 1
            if (r4 == r9) goto L_0x0095
            r9 = 2
            if (r4 == r9) goto L_0x008c
            if (r4 == r2) goto L_0x0089
            if (r4 != r6) goto L_0x0081
            goto L_0x008c
        L_0x0081:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown output prefix type"
            r0.<init>(r2)
            throw r0
        L_0x0089:
            byte[] r2 = androidx.lifecycle.c0.f1718b
            goto L_0x00a9
        L_0x008c:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r2 = r2.put(r7)
            goto L_0x009d
        L_0x0095:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r2 = r2.put(r9)
        L_0x009d:
            int r4 = r17.v()
            java.nio.ByteBuffer r2 = r2.putInt(r4)
            byte[] r2 = r2.array()
        L_0x00a9:
            r10 = r2
            int r11 = r17.E()
            int r12 = r17.z()
            int r13 = r17.v()
            r8 = r3
            r9 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r3)
            i4.j4 r4 = new i4.j4
            byte[] r6 = r3.f7380b
            if (r6 != 0) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            int r5 = r6.length
            byte[] r5 = java.util.Arrays.copyOf(r6, r5)
        L_0x00d0:
            r4.<init>(r5)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.Object r2 = r0.put(r4, r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00f1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.addAll(r2)
            r5.add(r3)
            java.util.List r2 = java.util.Collections.unmodifiableList(r5)
            r0.put(r4, r2)
        L_0x00f1:
            if (r18 == 0) goto L_0x0102
            i4.i4 r0 = r1.f7354c
            if (r0 != 0) goto L_0x00fa
            r1.f7354c = r3
            goto L_0x0102
        L_0x00fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "you cannot set two primary primitives"
            r0.<init>(r2)
            throw r0
        L_0x0102:
            return
        L_0x0103:
            r0 = move-exception
            i4.e8 r2 = new i4.e8
            java.lang.String r3 = "Creating a LegacyProtoKey failed"
            r2.<init>(r7, r3, r0)
            throw r2
        L_0x010c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Keys with output prefix type different from raw should have an id requirement."
            r0.<init>(r2)
            throw r0
        L_0x0114:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "only ENABLED key is allowed"
            r0.<init>(r2)
            throw r0
        L_0x011c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "addPrimitive cannot be called after build"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h4.a(java.lang.Object, i4.fc, boolean):void");
    }
}
