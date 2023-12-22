package a7;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.b;

public final class j0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f149i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f150j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f151a;

    /* renamed from: b  reason: collision with root package name */
    public final s f152b;

    /* renamed from: c  reason: collision with root package name */
    public final p f153c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f154d;

    /* renamed from: e  reason: collision with root package name */
    public final b f155e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f156f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f157g = false;

    /* renamed from: h  reason: collision with root package name */
    public final h0 f158h;

    public j0(FirebaseMessaging firebaseMessaging, s sVar, h0 h0Var, p pVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f154d = firebaseMessaging;
        this.f152b = sVar;
        this.f158h = h0Var;
        this.f153c = pVar;
        this.f151a = context;
        this.f156f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) {
        p pVar = this.f153c;
        String a10 = this.f154d.a();
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(pVar.a(pVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        p pVar = this.f153c;
        String a10 = this.f154d.a();
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
        a(pVar.a(pVar.c(a10, "/topics/" + str, bundle)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r0.f130b;
        r5 = 65535;
        r6 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r6 == 83) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6 == 85) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4.equals("U") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r4.equals("S") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r5 == 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r5 == 1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (d() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        r4 = "Unknown topic operation" + r0 + ".";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        c(r0.f129a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (d() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("Unsubscribe from topic: ");
        r6 = r0.f129a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r5.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        b(r0.f129a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (d() == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("Subscribe to topic: ");
        r6 = r0.f129a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        r5.append(" succeeded.");
        r4 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        android.util.Log.d("FirebaseMessaging", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r4.getMessage()) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r4.getMessage() == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r4 = "Topic operation failed without exception message. Will retry Topic operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c5, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r5 = androidx.activity.f.g("Topic operation failed: ");
        r5.append(r4.getMessage());
        r5.append(". Will retry Topic operation.");
        r4 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        android.util.Log.e("FirebaseMessaging", r4);
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
        L_0x0000:
            monitor-enter(r8)
            a7.h0 r0 = r8.f158h     // Catch:{ all -> 0x013a }
            a7.g0 r0 = r0.a()     // Catch:{ all -> 0x013a }
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = d()     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x013a }
        L_0x0017:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            return r1
        L_0x0019:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 0
            java.lang.String r4 = r0.f130b     // Catch:{ IOException -> 0x00a2 }
            r5 = -1
            int r6 = r4.hashCode()     // Catch:{ IOException -> 0x00a2 }
            r7 = 83
            if (r6 == r7) goto L_0x0037
            r7 = 85
            if (r6 == r7) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            java.lang.String r6 = "U"
            boolean r4 = r4.equals(r6)     // Catch:{ IOException -> 0x00a2 }
            if (r4 == 0) goto L_0x0040
            r5 = r1
            goto L_0x0040
        L_0x0037:
            java.lang.String r6 = "S"
            boolean r4 = r4.equals(r6)     // Catch:{ IOException -> 0x00a2 }
            if (r4 == 0) goto L_0x0040
            r5 = r3
        L_0x0040:
            java.lang.String r4 = " succeeded."
            if (r5 == 0) goto L_0x007e
            if (r5 == r1) goto L_0x0063
            boolean r4 = d()     // Catch:{ IOException -> 0x00a2 }
            if (r4 == 0) goto L_0x00a0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2 }
            r4.<init>()     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r5 = "Unknown topic operation"
            r4.append(r5)     // Catch:{ IOException -> 0x00a2 }
            r4.append(r0)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r5 = "."
            r4.append(r5)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x009d
        L_0x0063:
            java.lang.String r5 = r0.f129a     // Catch:{ IOException -> 0x00a2 }
            r8.c(r5)     // Catch:{ IOException -> 0x00a2 }
            boolean r5 = d()     // Catch:{ IOException -> 0x00a2 }
            if (r5 == 0) goto L_0x00a0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2 }
            r5.<init>()     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r6 = "Unsubscribe from topic: "
            r5.append(r6)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r6 = r0.f129a     // Catch:{ IOException -> 0x00a2 }
        L_0x007a:
            r5.append(r6)     // Catch:{ IOException -> 0x00a2 }
            goto L_0x0096
        L_0x007e:
            java.lang.String r5 = r0.f129a     // Catch:{ IOException -> 0x00a2 }
            r8.b(r5)     // Catch:{ IOException -> 0x00a2 }
            boolean r5 = d()     // Catch:{ IOException -> 0x00a2 }
            if (r5 == 0) goto L_0x00a0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2 }
            r5.<init>()     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r6 = "Subscribe to topic: "
            r5.append(r6)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r6 = r0.f129a     // Catch:{ IOException -> 0x00a2 }
            goto L_0x007a
        L_0x0096:
            r5.append(r4)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x00a2 }
        L_0x009d:
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00a2 }
        L_0x00a0:
            r2 = r1
            goto L_0x00e0
        L_0x00a2:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            java.lang.String r6 = "SERVICE_NOT_AVAILABLE"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x00c6
            java.lang.String r5 = r4.getMessage()
            java.lang.String r6 = "INTERNAL_SERVER_ERROR"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00bc
            goto L_0x00c6
        L_0x00bc:
            java.lang.String r5 = r4.getMessage()
            if (r5 != 0) goto L_0x00c5
            java.lang.String r4 = "Topic operation failed without exception message. Will retry Topic operation."
            goto L_0x00dc
        L_0x00c5:
            throw r4
        L_0x00c6:
            java.lang.String r5 = "Topic operation failed: "
            java.lang.StringBuilder r5 = androidx.activity.f.g(r5)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = ". Will retry Topic operation."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x00dc:
            android.util.Log.e(r2, r4)
            r2 = r3
        L_0x00e0:
            if (r2 != 0) goto L_0x00e3
            return r3
        L_0x00e3:
            a7.h0 r2 = r8.f158h
            monitor-enter(r2)
            a7.e0 r3 = r2.f133a     // Catch:{ all -> 0x0137 }
            java.lang.String r4 = r0.f131c     // Catch:{ all -> 0x0137 }
            java.util.ArrayDeque<java.lang.String> r5 = r3.f118d     // Catch:{ all -> 0x0137 }
            monitor-enter(r5)     // Catch:{ all -> 0x0137 }
            java.util.ArrayDeque<java.lang.String> r6 = r3.f118d     // Catch:{ all -> 0x0134 }
            boolean r4 = r6.remove(r4)     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x00ff
            java.util.concurrent.Executor r4 = r3.f119e     // Catch:{ all -> 0x0134 }
            androidx.activity.b r6 = new androidx.activity.b     // Catch:{ all -> 0x0134 }
            r6.<init>(r1, r3)     // Catch:{ all -> 0x0134 }
            r4.execute(r6)     // Catch:{ all -> 0x0134 }
        L_0x00ff:
            monitor-exit(r5)     // Catch:{ all -> 0x0134 }
            monitor-exit(r2)
            m.b r1 = r8.f155e
            monitor-enter(r1)
            java.lang.String r0 = r0.f131c     // Catch:{ all -> 0x0131 }
            m.b r2 = r8.f155e     // Catch:{ all -> 0x0131 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0131 }
            if (r2 != 0) goto L_0x010f
            goto L_0x012e
        L_0x010f:
            m.b r2 = r8.f155e     // Catch:{ all -> 0x0131 }
            r3 = 0
            java.lang.Object r2 = r2.getOrDefault(r0, r3)     // Catch:{ all -> 0x0131 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0131 }
            java.lang.Object r4 = r2.poll()     // Catch:{ all -> 0x0131 }
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0123
            r4.setResult(r3)     // Catch:{ all -> 0x0131 }
        L_0x0123:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0131 }
            if (r2 == 0) goto L_0x012e
            m.b r2 = r8.f155e     // Catch:{ all -> 0x0131 }
            r2.remove(r0)     // Catch:{ all -> 0x0131 }
        L_0x012e:
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            goto L_0x0000
        L_0x0131:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            throw r0
        L_0x0134:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x013a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.j0.e():boolean");
    }

    public final void f(long j10) {
        this.f156f.schedule(new k0(this, this.f151a, this.f152b, Math.min(Math.max(30, 2 * j10), f149i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f157g = true;
        }
    }
}
