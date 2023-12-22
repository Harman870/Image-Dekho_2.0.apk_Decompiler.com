package a7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.activity.f;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f121a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f122b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f123c;

    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public f0 f124a;

        public a(f0 f0Var) {
            this.f124a = f0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f124a.f123c.f3490d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final void onReceive(Context context, Intent intent) {
            f0 f0Var = this.f124a;
            if (f0Var != null && f0Var.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                f0 f0Var2 = this.f124a;
                f0Var2.f123c.getClass();
                FirebaseMessaging.b(f0Var2, 0);
                this.f124a.f123c.f3490d.unregisterReceiver(this);
                this.f124a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public f0(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x3.a("firebase-iid-executor"));
        this.f123c = firebaseMessaging;
        this.f121a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f3490d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f122b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f123c.f3490d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        String str;
        boolean z9 = true;
        try {
            if (this.f123c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z9 = false;
            }
            if (z9) {
                StringBuilder g10 = f.g("Token retrieval failed: ");
                g10.append(e10.getMessage());
                g10.append(". Will retry token retrieval");
                str = g10.toString();
            } else if (e10.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e10;
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + r1.getMessage() + ". Won't retry the operation.");
        r1 = r5.f123c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c1, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.f3496j = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d1, code lost:
        if (a7.d0.a().c(r5.f123c.f3490d) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e8, code lost:
        if (a7.d0.a().c(r5.f123c.f3490d) != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ea, code lost:
        r5.f122b.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"WakelockTimeout"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            a7.d0 r0 = a7.d0.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c
            android.content.Context r1 = r1.f3490d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r0 = r5.f122b
            r0.acquire()
        L_0x0013:
            r0 = 0
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c     // Catch:{ IOException -> 0x0045 }
            r2 = 1
            monitor-enter(r1)     // Catch:{ IOException -> 0x0045 }
            r1.f3496j = r2     // Catch:{ all -> 0x009d }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c     // Catch:{ IOException -> 0x0045 }
            a7.s r1 = r1.f3495i     // Catch:{ IOException -> 0x0045 }
            boolean r1 = r1.c()     // Catch:{ IOException -> 0x0045 }
            if (r1 != 0) goto L_0x0047
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c     // Catch:{ IOException -> 0x0045 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0045 }
            r1.f3496j = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            a7.d0 r0 = a7.d0.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c
            android.content.Context r1 = r1.f3490d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x003e
            android.os.PowerManager$WakeLock r0 = r5.f122b
            r0.release()
        L_0x003e:
            return
        L_0x003f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            throw r2     // Catch:{ IOException -> 0x0045 }
        L_0x0042:
            r0 = move-exception
            goto L_0x00dc
        L_0x0045:
            r1 = move-exception
            goto L_0x00a0
        L_0x0047:
            a7.d0 r1 = a7.d0.a()     // Catch:{ IOException -> 0x0045 }
            com.google.firebase.messaging.FirebaseMessaging r2 = r5.f123c     // Catch:{ IOException -> 0x0045 }
            android.content.Context r2 = r2.f3490d     // Catch:{ IOException -> 0x0045 }
            boolean r1 = r1.b(r2)     // Catch:{ IOException -> 0x0045 }
            if (r1 == 0) goto L_0x0077
            boolean r1 = r5.a()     // Catch:{ IOException -> 0x0045 }
            if (r1 != 0) goto L_0x0077
            a7.f0$a r1 = new a7.f0$a     // Catch:{ IOException -> 0x0045 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0045 }
            r1.a()     // Catch:{ IOException -> 0x0045 }
            a7.d0 r0 = a7.d0.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c
            android.content.Context r1 = r1.f3490d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0076
            android.os.PowerManager$WakeLock r0 = r5.f122b
            r0.release()
        L_0x0076:
            return
        L_0x0077:
            boolean r1 = r5.b()     // Catch:{ IOException -> 0x0045 }
            if (r1 == 0) goto L_0x0087
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c     // Catch:{ IOException -> 0x0045 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0045 }
            r1.f3496j = r0     // Catch:{ all -> 0x0084 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            goto L_0x008e
        L_0x0084:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            throw r2     // Catch:{ IOException -> 0x0045 }
        L_0x0087:
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c     // Catch:{ IOException -> 0x0045 }
            long r2 = r5.f121a     // Catch:{ IOException -> 0x0045 }
            r1.e(r2)     // Catch:{ IOException -> 0x0045 }
        L_0x008e:
            a7.d0 r0 = a7.d0.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c
            android.content.Context r1 = r1.f3490d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00d8
            goto L_0x00d3
        L_0x009d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0045 }
            throw r2     // Catch:{ IOException -> 0x0045 }
        L_0x00a0:
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r3.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r3.append(r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0042 }
            r3.append(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = ". Won't retry the operation."
            r3.append(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0042 }
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0042 }
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c     // Catch:{ all -> 0x0042 }
            monitor-enter(r1)     // Catch:{ all -> 0x0042 }
            r1.f3496j = r0     // Catch:{ all -> 0x00d9 }
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            a7.d0 r0 = a7.d0.a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f123c
            android.content.Context r1 = r1.f3490d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00d8
        L_0x00d3:
            android.os.PowerManager$WakeLock r0 = r5.f122b
            r0.release()
        L_0x00d8:
            return
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x00dc:
            a7.d0 r1 = a7.d0.a()
            com.google.firebase.messaging.FirebaseMessaging r2 = r5.f123c
            android.content.Context r2 = r2.f3490d
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L_0x00ef
            android.os.PowerManager$WakeLock r1 = r5.f122b
            r1.release()
        L_0x00ef:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.f0.run():void");
    }
}
