package j4;

import android.content.Context;
import android.os.Bundle;

public final class j1 extends w1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f8271e = null;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8272f = null;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f8273g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f8274h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c2 f8275i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1(c2 c2Var, Context context, Bundle bundle) {
        super(c2Var, true);
        this.f8275i = c2Var;
        this.f8273g = context;
        this.f8274h = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[Catch:{ Exception -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.dynamite"
            r1 = 0
            r2 = 1
            j4.c2 r3 = r14.f8275i     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = r14.f8271e     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = r14.f8272f     // Catch:{ Exception -> 0x00a4 }
            r3.getClass()     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0023
            java.lang.String r3 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class<j4.c2> r4 = j4.c2.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x001e }
            java.lang.Class.forName(r3, r1, r4)     // Catch:{ ClassNotFoundException -> 0x001e }
            r3 = r2
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            if (r3 != 0) goto L_0x0023
            r3 = r2
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            r4 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = r14.f8272f     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = r14.f8271e     // Catch:{ Exception -> 0x00a4 }
            j4.c2 r6 = r14.f8275i     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = r6.f8073a     // Catch:{ Exception -> 0x00a4 }
            r11 = r3
            r10 = r5
            r9 = r6
            goto L_0x0036
        L_0x0033:
            r9 = r4
            r10 = r9
            r11 = r10
        L_0x0036:
            android.content.Context r3 = r14.f8273g     // Catch:{ Exception -> 0x00a4 }
            r3.o.h(r3)     // Catch:{ Exception -> 0x00a4 }
            j4.c2 r3 = r14.f8275i     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r5 = r14.f8273g     // Catch:{ Exception -> 0x00a4 }
            r3.getClass()     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.dynamite.b r6 = com.google.android.gms.dynamite.DynamiteModule.f2815b     // Catch:{ a -> 0x0053 }
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.c(r5, r6, r0)     // Catch:{ a -> 0x0053 }
            java.lang.String r6 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r5 = r5.b(r6)     // Catch:{ a -> 0x0053 }
            j4.u0 r4 = j4.t0.asInterface(r5)     // Catch:{ a -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r5 = move-exception
            r3.a(r5, r2, r1)     // Catch:{ Exception -> 0x00a4 }
        L_0x0057:
            r3.f8080h = r4     // Catch:{ Exception -> 0x00a4 }
            j4.c2 r3 = r14.f8275i     // Catch:{ Exception -> 0x00a4 }
            j4.u0 r3 = r3.f8080h     // Catch:{ Exception -> 0x00a4 }
            if (r3 != 0) goto L_0x0069
            j4.c2 r0 = r14.f8275i     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.f8073a     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r0, r3)     // Catch:{ Exception -> 0x00a4 }
            return
        L_0x0069:
            android.content.Context r3 = r14.f8273g     // Catch:{ Exception -> 0x00a4 }
            int r3 = com.google.android.gms.dynamite.DynamiteModule.a(r3, r0)     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r4 = r14.f8273g     // Catch:{ Exception -> 0x00a4 }
            int r0 = com.google.android.gms.dynamite.DynamiteModule.d(r4, r0, r1)     // Catch:{ Exception -> 0x00a4 }
            int r4 = java.lang.Math.max(r3, r0)     // Catch:{ Exception -> 0x00a4 }
            if (r0 >= r3) goto L_0x007d
            r8 = r2
            goto L_0x007e
        L_0x007d:
            r8 = r1
        L_0x007e:
            j4.d1 r0 = new j4.d1     // Catch:{ Exception -> 0x00a4 }
            long r6 = (long) r4     // Catch:{ Exception -> 0x00a4 }
            r4 = 79000(0x13498, double:3.9031E-319)
            android.os.Bundle r12 = r14.f8274h     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r3 = r14.f8273g     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r13 = n4.i4.a(r3)     // Catch:{ Exception -> 0x00a4 }
            r3 = r0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00a4 }
            j4.c2 r3 = r14.f8275i     // Catch:{ Exception -> 0x00a4 }
            j4.u0 r3 = r3.f8080h     // Catch:{ Exception -> 0x00a4 }
            r3.o.h(r3)     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r4 = r14.f8273g     // Catch:{ Exception -> 0x00a4 }
            z3.b r5 = new z3.b     // Catch:{ Exception -> 0x00a4 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00a4 }
            long r6 = r14.f8533a     // Catch:{ Exception -> 0x00a4 }
            r3.initialize(r5, r0, r6)     // Catch:{ Exception -> 0x00a4 }
            return
        L_0x00a4:
            r0 = move-exception
            j4.c2 r3 = r14.f8275i
            r3.a(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.j1.a():void");
    }
}
