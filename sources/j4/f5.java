package j4;

import e9.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public abstract class f5 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f8137f = new Object();
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public static volatile m4 f8138g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f8139h = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final c5 f8140a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8141b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8142c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f8143d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f8144e;

    static {
        new AtomicReference();
        new t(0);
    }

    public /* synthetic */ f5(c5 c5Var, String str, Object obj) {
        if (c5Var.f8082a != null) {
            this.f8140a = c5Var;
            this.f8141b = str;
            this.f8142c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract Object a(String str);

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ef A[Catch:{ all -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f8139h
            int r0 = r0.get()
            int r1 = r8.f8143d
            if (r1 >= r0) goto L_0x00f9
            monitor-enter(r8)
            int r1 = r8.f8143d     // Catch:{ all -> 0x008d }
            if (r1 >= r0) goto L_0x00f5
            j4.m4 r1 = f8138g     // Catch:{ all -> 0x008d }
            j4.h5 r2 = j4.h5.f8214a     // Catch:{ all -> 0x008d }
            r3 = 0
            if (r1 == 0) goto L_0x0053
            j4.m5 r2 = r1.f8324b     // Catch:{ all -> 0x008d }
            java.lang.Object r2 = r2.zza()     // Catch:{ all -> 0x008d }
            j4.i5 r2 = (j4.i5) r2     // Catch:{ all -> 0x008d }
            boolean r4 = r2.b()     // Catch:{ all -> 0x008d }
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r2.a()     // Catch:{ all -> 0x008d }
            j4.q4 r4 = (j4.q4) r4     // Catch:{ all -> 0x008d }
            j4.c5 r5 = r8.f8140a     // Catch:{ all -> 0x008d }
            android.net.Uri r5 = r5.f8082a     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r8.f8141b     // Catch:{ all -> 0x008d }
            r4.getClass()     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0042
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008d }
            m.h r4 = r4.f8399a     // Catch:{ all -> 0x008d }
            java.lang.Object r4 = r4.getOrDefault(r5, r3)     // Catch:{ all -> 0x008d }
            m.h r4 = (m.h) r4     // Catch:{ all -> 0x008d }
            goto L_0x0043
        L_0x0042:
            r4 = r3
        L_0x0043:
            if (r4 != 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            java.lang.String r5 = ""
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x008d }
            java.lang.Object r4 = r4.getOrDefault(r5, r3)     // Catch:{ all -> 0x008d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x008d }
            goto L_0x0054
        L_0x0053:
            r4 = r3
        L_0x0054:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00ef
            j4.c5 r5 = r8.f8140a     // Catch:{ all -> 0x008d }
            android.net.Uri r5 = r5.f8082a     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x00ec
            android.content.Context r6 = r1.f8323a     // Catch:{ all -> 0x008d }
            boolean r5 = j4.u4.a(r6, r5)     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0077
            android.content.Context r5 = r1.f8323a     // Catch:{ all -> 0x008d }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x008d }
            j4.c5 r6 = r8.f8140a     // Catch:{ all -> 0x008d }
            android.net.Uri r6 = r6.f8082a     // Catch:{ all -> 0x008d }
            j4.w4 r7 = j4.w4.f8537a     // Catch:{ all -> 0x008d }
            j4.o4 r5 = j4.o4.a(r5, r6, r7)     // Catch:{ all -> 0x008d }
            goto L_0x0078
        L_0x0077:
            r5 = r3
        L_0x0078:
            if (r5 == 0) goto L_0x0090
            java.lang.String r6 = r8.f8141b     // Catch:{ all -> 0x008d }
            java.util.Map r5 = r5.b()     // Catch:{ all -> 0x008d }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r8.a(r5)     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r0 = move-exception
            goto L_0x00f7
        L_0x0090:
            r5 = r3
        L_0x0091:
            if (r5 != 0) goto L_0x00d8
            j4.c5 r5 = r8.f8140a     // Catch:{ all -> 0x008d }
            boolean r5 = r5.f8083b     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x00d2
            android.content.Context r1 = r1.f8323a     // Catch:{ all -> 0x008d }
            java.lang.Class<j4.s4> r5 = j4.s4.class
            monitor-enter(r5)     // Catch:{ all -> 0x008d }
            j4.s4 r6 = j4.s4.f8457c     // Catch:{ all -> 0x00cf }
            if (r6 != 0) goto L_0x00b7
            java.lang.String r6 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r6 = y3.a.i(r1, r6)     // Catch:{ all -> 0x00cf }
            if (r6 != 0) goto L_0x00b0
            j4.s4 r6 = new j4.s4     // Catch:{ all -> 0x00cf }
            r6.<init>(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x00b5
        L_0x00b0:
            j4.s4 r6 = new j4.s4     // Catch:{ all -> 0x00cf }
            r6.<init>()     // Catch:{ all -> 0x00cf }
        L_0x00b5:
            j4.s4.f8457c = r6     // Catch:{ all -> 0x00cf }
        L_0x00b7:
            j4.s4 r1 = j4.s4.f8457c     // Catch:{ all -> 0x00cf }
            monitor-exit(r5)     // Catch:{ all -> 0x00cf }
            j4.c5 r5 = r8.f8140a     // Catch:{ all -> 0x008d }
            boolean r5 = r5.f8083b     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x00c2
            r5 = r3
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r5 = r8.f8141b     // Catch:{ all -> 0x008d }
        L_0x00c4:
            java.lang.String r1 = r1.a(r5)     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r3 = r8.a(r1)     // Catch:{ all -> 0x008d }
            goto L_0x00d2
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x00d2:
            if (r3 != 0) goto L_0x00d7
            java.lang.Object r5 = r8.f8142c     // Catch:{ all -> 0x008d }
            goto L_0x00d8
        L_0x00d7:
            r5 = r3
        L_0x00d8:
            boolean r1 = r2.b()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x00e7
            if (r4 != 0) goto L_0x00e3
            java.lang.Object r5 = r8.f8142c     // Catch:{ all -> 0x008d }
            goto L_0x00e7
        L_0x00e3:
            java.lang.Object r5 = r8.a(r4)     // Catch:{ all -> 0x008d }
        L_0x00e7:
            r8.f8144e = r5     // Catch:{ all -> 0x008d }
            r8.f8143d = r0     // Catch:{ all -> 0x008d }
            goto L_0x00f5
        L_0x00ec:
            m.b r0 = j4.g5.f8196a     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x00ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008d }
            r0.<init>(r5)     // Catch:{ all -> 0x008d }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x00f5:
            monitor-exit(r8)     // Catch:{ all -> 0x008d }
            goto L_0x00f9
        L_0x00f7:
            monitor-exit(r8)     // Catch:{ all -> 0x008d }
            throw r0
        L_0x00f9:
            java.lang.Object r0 = r8.f8144e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.f5.b():java.lang.Object");
    }
}
