package c4;

import com.google.android.gms.tasks.TaskCompletionSource;
import i6.i;
import n4.o3;
import r3.o;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2446a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2447b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2448c;

    public /* synthetic */ f(h hVar, TaskCompletionSource taskCompletionSource) {
        this.f2446a = 0;
        this.f2447b = hVar;
        this.f2448c = taskCompletionSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0106 A[SYNTHETIC, Splitter:B:28:0x0106] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f2446a
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0121;
                case 1: goto L_0x0065;
                case 2: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x01f6
        L_0x0009:
            java.lang.Object r0 = r11.f2448c
            n4.a7 r0 = (n4.a7) r0
            n4.z2 r1 = r0.f9613d
            if (r1 != 0) goto L_0x001f
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r1 = "Failed to send current screen to service"
            r0.a(r1)
            goto L_0x0064
        L_0x001f:
            java.lang.Object r2 = r11.f2447b     // Catch:{ RemoteException -> 0x0052 }
            n4.g6 r2 = (n4.g6) r2     // Catch:{ RemoteException -> 0x0052 }
            if (r2 != 0) goto L_0x0035
            n4.n4 r0 = r0.f9600a     // Catch:{ RemoteException -> 0x0052 }
            android.content.Context r0 = r0.f9986a     // Catch:{ RemoteException -> 0x0052 }
            r2 = 0
            r4 = 0
            r5 = 0
            java.lang.String r6 = r0.getPackageName()     // Catch:{ RemoteException -> 0x0052 }
            r1.f(r2, r4, r5, r6)     // Catch:{ RemoteException -> 0x0052 }
            goto L_0x004a
        L_0x0035:
            long r3 = r2.f9763c     // Catch:{ RemoteException -> 0x0052 }
            java.lang.String r5 = r2.f9761a     // Catch:{ RemoteException -> 0x0052 }
            java.lang.String r6 = r2.f9762b     // Catch:{ RemoteException -> 0x0052 }
            n4.n4 r0 = r0.f9600a     // Catch:{ RemoteException -> 0x0052 }
            android.content.Context r0 = r0.f9986a     // Catch:{ RemoteException -> 0x0052 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ RemoteException -> 0x0052 }
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r0
            r1.f(r2, r4, r5, r6)     // Catch:{ RemoteException -> 0x0052 }
        L_0x004a:
            java.lang.Object r0 = r11.f2448c     // Catch:{ RemoteException -> 0x0052 }
            n4.a7 r0 = (n4.a7) r0     // Catch:{ RemoteException -> 0x0052 }
            r0.r()     // Catch:{ RemoteException -> 0x0052 }
            goto L_0x0064
        L_0x0052:
            r0 = move-exception
            java.lang.Object r1 = r11.f2448c
            n4.a7 r1 = (n4.a7) r1
            n4.n4 r1 = r1.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9828f
            java.lang.String r2 = "Failed to send current screen to the service"
            r1.b(r2, r0)
        L_0x0064:
            return
        L_0x0065:
            java.lang.Object r0 = r11.f2448c
            n4.a6 r0 = (n4.a6) r0
            n4.n4 r0 = r0.f9600a
            n4.l7 r0 = r0.w()
            j4.qc r1 = j4.qc.f8420b
            j4.m5 r1 = r1.f8421a
            java.lang.Object r1 = r1.zza()
            j4.rc r1 = (j4.rc) r1
            r1.zza()
            n4.n4 r1 = r0.f9600a
            n4.f r1 = r1.f9992g
            n4.v2 r3 = n4.w2.f10233o0
            boolean r1 = r1.o(r2, r3)
            if (r1 == 0) goto L_0x00e0
            n4.n4 r1 = r0.f9600a
            n4.w3 r1 = r1.r()
            n4.f5 r1 = r1.m()
            n4.e5 r3 = n4.e5.ANALYTICS_STORAGE
            boolean r1 = r1.f(r3)
            if (r1 != 0) goto L_0x00a5
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.k
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L_0x00ea
        L_0x00a5:
            n4.n4 r1 = r0.f9600a
            n4.w3 r1 = r1.r()
            n4.n4 r3 = r0.f9600a
            y3.a r3 = r3.f9998n
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            boolean r1 = r1.q(r3)
            if (r1 != 0) goto L_0x00ed
            n4.n4 r1 = r0.f9600a
            n4.w3 r1 = r1.r()
            n4.t3 r1 = r1.f10264o
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00cf
            goto L_0x00ed
        L_0x00cf:
            n4.n4 r0 = r0.f9600a
            n4.w3 r0 = r0.r()
            n4.t3 r0 = r0.f10264o
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00ee
        L_0x00e0:
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.k
            java.lang.String r1 = "getSessionId has been disabled."
        L_0x00ea:
            r0.a(r1)
        L_0x00ed:
            r0 = r2
        L_0x00ee:
            if (r0 == 0) goto L_0x0106
            java.lang.Object r1 = r11.f2448c
            n4.a6 r1 = (n4.a6) r1
            n4.n4 r1 = r1.f9600a
            n4.d8 r1 = r1.x()
            java.lang.Object r2 = r11.f2447b
            j4.x0 r2 = (j4.x0) r2
            long r3 = r0.longValue()
            r1.E(r2, r3)
            goto L_0x0120
        L_0x0106:
            java.lang.Object r0 = r11.f2447b     // Catch:{ RemoteException -> 0x010e }
            j4.x0 r0 = (j4.x0) r0     // Catch:{ RemoteException -> 0x010e }
            r0.w(r2)     // Catch:{ RemoteException -> 0x010e }
            goto L_0x0120
        L_0x010e:
            r0 = move-exception
            java.lang.Object r1 = r11.f2448c
            n4.a6 r1 = (n4.a6) r1
            n4.n4 r1 = r1.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9828f
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
        L_0x0120:
            return
        L_0x0121:
            java.lang.Object r0 = r11.f2447b
            c4.h r0 = (c4.h) r0
            java.lang.Object r3 = r11.f2448c
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3
            android.content.Context r4 = r0.f2450a
            java.lang.String r5 = "app_set_id_storage"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r1)
            java.lang.String r6 = "app_set_id"
            java.lang.String r2 = r4.getString(r6, r2)
            android.content.Context r4 = r0.f2450a
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r1)
            r7 = -1
            java.lang.String r9 = "app_set_id_last_used_time"
            long r9 = r4.getLong(r9, r7)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x014f
            r7 = 33696000000(0x7d8702800, double:1.66480360023E-313)
            long r7 = r7 + r9
        L_0x014f:
            if (r2 == 0) goto L_0x0161
            long r9 = java.lang.System.currentTimeMillis()
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x015a
            goto L_0x0161
        L_0x015a:
            android.content.Context r0 = r0.f2450a     // Catch:{ g -> 0x01f1 }
            c4.h.a(r0)     // Catch:{ g -> 0x01f1 }
            goto L_0x01e7
        L_0x0161:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            android.content.Context r4 = r0.f2450a     // Catch:{ g -> 0x01f1 }
            android.content.SharedPreferences r7 = r4.getSharedPreferences(r5, r1)     // Catch:{ g -> 0x01f1 }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ g -> 0x01f1 }
            android.content.SharedPreferences$Editor r6 = r7.putString(r6, r2)     // Catch:{ g -> 0x01f1 }
            boolean r6 = r6.commit()     // Catch:{ g -> 0x01f1 }
            java.lang.String r7 = "AppSet"
            if (r6 != 0) goto L_0x01a5
            java.lang.String r0 = "Failed to store app set ID generated for App "
            java.lang.String r1 = r4.getPackageName()     // Catch:{ g -> 0x01f1 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ g -> 0x01f1 }
            int r2 = r1.length()     // Catch:{ g -> 0x01f1 }
            if (r2 == 0) goto L_0x0194
            java.lang.String r0 = r0.concat(r1)     // Catch:{ g -> 0x01f1 }
            goto L_0x019a
        L_0x0194:
            java.lang.String r1 = new java.lang.String     // Catch:{ g -> 0x01f1 }
            r1.<init>(r0)     // Catch:{ g -> 0x01f1 }
            r0 = r1
        L_0x019a:
            android.util.Log.e(r7, r0)     // Catch:{ g -> 0x01f1 }
            c4.g r0 = new c4.g     // Catch:{ g -> 0x01f1 }
            java.lang.String r1 = "Failed to store the app set ID."
            r0.<init>(r1)     // Catch:{ g -> 0x01f1 }
            throw r0     // Catch:{ g -> 0x01f1 }
        L_0x01a5:
            c4.h.a(r4)     // Catch:{ g -> 0x01f1 }
            android.content.Context r0 = r0.f2450a     // Catch:{ g -> 0x01f1 }
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r5, r1)     // Catch:{ g -> 0x01f1 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x01f1 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ g -> 0x01f1 }
            java.lang.String r6 = "app_set_id_creation_time"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r6, r4)     // Catch:{ g -> 0x01f1 }
            boolean r1 = r1.commit()     // Catch:{ g -> 0x01f1 }
            if (r1 != 0) goto L_0x01e7
            java.lang.String r1 = "Failed to store app set ID creation time for App "
            java.lang.String r0 = r0.getPackageName()     // Catch:{ g -> 0x01f1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ g -> 0x01f1 }
            int r2 = r0.length()     // Catch:{ g -> 0x01f1 }
            if (r2 == 0) goto L_0x01d7
            java.lang.String r0 = r1.concat(r0)     // Catch:{ g -> 0x01f1 }
            goto L_0x01dc
        L_0x01d7:
            java.lang.String r0 = new java.lang.String     // Catch:{ g -> 0x01f1 }
            r0.<init>(r1)     // Catch:{ g -> 0x01f1 }
        L_0x01dc:
            android.util.Log.e(r7, r0)     // Catch:{ g -> 0x01f1 }
            c4.g r0 = new c4.g     // Catch:{ g -> 0x01f1 }
            java.lang.String r1 = "Failed to store the app set ID creation time."
            r0.<init>(r1)     // Catch:{ g -> 0x01f1 }
            throw r0     // Catch:{ g -> 0x01f1 }
        L_0x01e7:
            com.google.android.gms.appset.AppSetIdInfo r0 = new com.google.android.gms.appset.AppSetIdInfo
            r1 = 1
            r0.<init>(r2, r1)
            r3.setResult(r0)
            goto L_0x01f5
        L_0x01f1:
            r0 = move-exception
            r3.setException(r0)
        L_0x01f5:
            return
        L_0x01f6:
            java.lang.Object r0 = r11.f2447b
            java.lang.String r0 = (java.lang.String) r0
            c6.f r0 = c6.f.e(r0)
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            h6.l r2 = r0.f3464f
            if (r2 == 0) goto L_0x023e
            i4.wg r3 = r2.E()
            r3.z()
            i4.kf r4 = r0.f3463e
            c6.f r5 = r0.f3459a
            java.lang.String r3 = r3.f7776a
            h6.f0 r6 = new h6.f0
            r6.<init>(r0)
            r4.getClass()
            i4.cf r0 = new i4.cf
            r0.<init>(r3)
            r0.d(r5)
            r0.f7237d = r2
            r0.f7238e = r6
            r0.f7239f = r6
            com.google.android.gms.tasks.Task r0 = r4.a(r0)
            u3.a r2 = i6.i.f7907e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Token refreshing started"
            r2.e(r3, r1)
            g1.t r1 = new g1.t
            r1.<init>((java.lang.Object) r11)
            r0.addOnFailureListener(r1)
        L_0x023e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.f.run():void");
    }

    public f(i iVar, String str) {
        this.f2446a = 3;
        this.f2448c = iVar;
        o.e(str);
        this.f2447b = str;
    }

    public /* synthetic */ f(o3 o3Var, Object obj, int i10) {
        this.f2446a = i10;
        this.f2448c = o3Var;
        this.f2447b = obj;
    }
}
