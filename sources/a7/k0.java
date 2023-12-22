package a7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class k0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f162f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f163g;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f164h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f165a;

    /* renamed from: b  reason: collision with root package name */
    public final s f166b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f167c;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f168d;

    /* renamed from: e  reason: collision with root package name */
    public final long f169e;

    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public k0 f170a;

        public a(k0 k0Var) {
            this.f170a = k0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0.this.f165a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            k0 k0Var = this.f170a;
            if (k0Var != null) {
                if (k0Var.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    k0 k0Var2 = this.f170a;
                    k0Var2.f168d.f156f.schedule(k0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f170a = null;
                }
            }
        }
    }

    public k0(j0 j0Var, Context context, s sVar, long j10) {
        this.f168d = j0Var;
        this.f165a = context;
        this.f169e = j10;
        this.f166b = sVar;
        this.f167c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f162f) {
            Boolean bool = f164h;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f164h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z9;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z9;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f162f) {
            Boolean bool = f163g;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f163g = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f165a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        android.util.Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + r3.getMessage());
        r3 = r6.f168d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ac, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r3.f157g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b6, code lost:
        if (c(r6.f165a) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00ca, code lost:
        if (c(r6.f165a) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6.f167c.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00d2, code lost:
        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00d5, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "TopicsSyncTask's wakelock was already released due to timeout."
            java.lang.String r1 = "FirebaseMessaging"
            android.content.Context r2 = r6.f165a
            boolean r2 = c(r2)
            if (r2 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r2 = r6.f167c
            long r3 = a7.f.f120a
            r2.acquire(r3)
        L_0x0013:
            r2 = 0
            a7.j0 r3 = r6.f168d     // Catch:{ IOException -> 0x0041 }
            r4 = 1
            monitor-enter(r3)     // Catch:{ IOException -> 0x0041 }
            r3.f157g = r4     // Catch:{ all -> 0x008f }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            a7.s r3 = r6.f166b     // Catch:{ IOException -> 0x0041 }
            boolean r3 = r3.c()     // Catch:{ IOException -> 0x0041 }
            if (r3 != 0) goto L_0x0043
            a7.j0 r3 = r6.f168d     // Catch:{ IOException -> 0x0041 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0041 }
            r3.f157g = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            android.content.Context r2 = r6.f165a
            boolean r2 = c(r2)
            if (r2 == 0) goto L_0x003a
            android.os.PowerManager$WakeLock r2 = r6.f167c     // Catch:{ RuntimeException -> 0x0037 }
            r2.release()     // Catch:{ RuntimeException -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            android.util.Log.i(r1, r0)
        L_0x003a:
            return
        L_0x003b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            throw r4     // Catch:{ IOException -> 0x0041 }
        L_0x003e:
            r2 = move-exception
            goto L_0x00c4
        L_0x0041:
            r3 = move-exception
            goto L_0x0092
        L_0x0043:
            android.content.Context r3 = r6.f165a     // Catch:{ IOException -> 0x0041 }
            boolean r3 = a(r3)     // Catch:{ IOException -> 0x0041 }
            if (r3 == 0) goto L_0x006b
            boolean r3 = r6.d()     // Catch:{ IOException -> 0x0041 }
            if (r3 != 0) goto L_0x006b
            a7.k0$a r3 = new a7.k0$a     // Catch:{ IOException -> 0x0041 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0041 }
            r3.a()     // Catch:{ IOException -> 0x0041 }
            android.content.Context r2 = r6.f165a
            boolean r2 = c(r2)
            if (r2 == 0) goto L_0x006a
            android.os.PowerManager$WakeLock r2 = r6.f167c     // Catch:{ RuntimeException -> 0x0067 }
            r2.release()     // Catch:{ RuntimeException -> 0x0067 }
            goto L_0x006a
        L_0x0067:
            android.util.Log.i(r1, r0)
        L_0x006a:
            return
        L_0x006b:
            a7.j0 r3 = r6.f168d     // Catch:{ IOException -> 0x0041 }
            boolean r3 = r3.e()     // Catch:{ IOException -> 0x0041 }
            if (r3 == 0) goto L_0x007d
            a7.j0 r3 = r6.f168d     // Catch:{ IOException -> 0x0041 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0041 }
            r3.f157g = r2     // Catch:{ all -> 0x007a }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            goto L_0x0084
        L_0x007a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            throw r4     // Catch:{ IOException -> 0x0041 }
        L_0x007d:
            a7.j0 r3 = r6.f168d     // Catch:{ IOException -> 0x0041 }
            long r4 = r6.f169e     // Catch:{ IOException -> 0x0041 }
            r3.f(r4)     // Catch:{ IOException -> 0x0041 }
        L_0x0084:
            android.content.Context r2 = r6.f165a
            boolean r2 = c(r2)
            if (r2 == 0) goto L_0x00c0
        L_0x008c:
            android.os.PowerManager$WakeLock r2 = r6.f167c     // Catch:{ RuntimeException -> 0x00bd }
            goto L_0x00b9
        L_0x008f:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            throw r4     // Catch:{ IOException -> 0x0041 }
        L_0x0092:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r4.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r5 = "Failed to sync topics. Won't retry sync. "
            r4.append(r5)     // Catch:{ all -> 0x003e }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x003e }
            r4.append(r3)     // Catch:{ all -> 0x003e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x003e }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x003e }
            a7.j0 r3 = r6.f168d     // Catch:{ all -> 0x003e }
            monitor-enter(r3)     // Catch:{ all -> 0x003e }
            r3.f157g = r2     // Catch:{ all -> 0x00c1 }
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.content.Context r2 = r6.f165a
            boolean r2 = c(r2)
            if (r2 == 0) goto L_0x00c0
            goto L_0x008c
        L_0x00b9:
            r2.release()     // Catch:{ RuntimeException -> 0x00bd }
            goto L_0x00c0
        L_0x00bd:
            android.util.Log.i(r1, r0)
        L_0x00c0:
            return
        L_0x00c1:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r2     // Catch:{ all -> 0x003e }
        L_0x00c4:
            android.content.Context r3 = r6.f165a
            boolean r3 = c(r3)
            if (r3 == 0) goto L_0x00d5
            android.os.PowerManager$WakeLock r3 = r6.f167c     // Catch:{ RuntimeException -> 0x00d2 }
            r3.release()     // Catch:{ RuntimeException -> 0x00d2 }
            goto L_0x00d5
        L_0x00d2:
            android.util.Log.i(r1, r0)
        L_0x00d5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.k0.run():void");
    }
}
