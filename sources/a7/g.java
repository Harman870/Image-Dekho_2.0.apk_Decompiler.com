package a7;

import android.content.Context;
import androidx.lifecycle.p;
import java.util.concurrent.ExecutorService;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f125a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f126b;

    /* renamed from: c  reason: collision with root package name */
    public final p f127c;

    public g(Context context, p pVar, ExecutorService executorService) {
        this.f125a = executorService;
        this.f126b = context;
        this.f127c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[SYNTHETIC, Splitter:B:30:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r12 = this;
            androidx.lifecycle.p r0 = r12.f127c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r12.f126b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x004e
        L_0x001e:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r12.f126b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x004e
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0036
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x004e
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            return r2
        L_0x0052:
            androidx.lifecycle.p r0 = r12.f127c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.f(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 == 0) goto L_0x0064
            goto L_0x0083
        L_0x0064:
            a7.q r3 = new a7.q     // Catch:{ MalformedURLException -> 0x006f }
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006f }
            r6.<init>(r0)     // Catch:{ MalformedURLException -> 0x006f }
            r3.<init>(r6)     // Catch:{ MalformedURLException -> 0x006f }
            goto L_0x0084
        L_0x006f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Not downloading image, bad URL: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r5, r0)
        L_0x0083:
            r3 = r4
        L_0x0084:
            r0 = 3
            if (r3 == 0) goto L_0x009f
            java.util.concurrent.ExecutorService r6 = r12.f125a
            com.google.android.gms.tasks.TaskCompletionSource r7 = new com.google.android.gms.tasks.TaskCompletionSource
            r7.<init>()
            d.s r8 = new d.s
            r8.<init>(r3, r0, r7)
            java.util.concurrent.Future r6 = r6.submit(r8)
            r3.f198b = r6
            com.google.android.gms.tasks.Task r6 = r7.getTask()
            r3.f199c = r6
        L_0x009f:
            android.content.Context r6 = r12.f126b
            androidx.lifecycle.p r7 = r12.f127c
            a7.e$a r6 = a7.e.a(r6, r7)
            x.n r7 = r6.f113a
            if (r3 != 0) goto L_0x00ac
            goto L_0x0106
        L_0x00ac:
            com.google.android.gms.tasks.Task<android.graphics.Bitmap> r8 = r3.f199c     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r3.o.h(r8)     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r9 = 5
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            java.lang.Object r8 = com.google.android.gms.tasks.Tasks.await(r8, r9, r11)     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r7.c(r8)     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            x.l r9 = new x.l     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r9.<init>()     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            if (r8 != 0) goto L_0x00c7
            r10 = r4
            goto L_0x00ce
        L_0x00c7:
            androidx.core.graphics.drawable.IconCompat r10 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r10.<init>(r1)     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r10.f1260b = r8     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
        L_0x00ce:
            r9.f12793b = r10     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r9.f12794c = r4     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r9.f12795d = r1     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            r7.d(r9)     // Catch:{ ExecutionException -> 0x00f1, InterruptedException -> 0x00e1, TimeoutException -> 0x00d8 }
            goto L_0x0106
        L_0x00d8:
            java.lang.String r4 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r5, r4)
            r3.close()
            goto L_0x0106
        L_0x00e1:
            java.lang.String r4 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r5, r4)
            r3.close()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x0106
        L_0x00f1:
            r3 = move-exception
            java.lang.String r4 = "Failed to download image: "
            java.lang.StringBuilder r4 = androidx.activity.f.g(r4)
            java.lang.Throwable r3 = r3.getCause()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
        L_0x0106:
            boolean r0 = android.util.Log.isLoggable(r5, r0)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r5, r0)
        L_0x0111:
            android.content.Context r0 = r12.f126b
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r3 = r6.f114b
            x.n r4 = r6.f113a
            android.app.Notification r4 = r4.a()
            r0.notify(r3, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.g.a():boolean");
    }
}
